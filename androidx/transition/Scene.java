package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Scene {
    public Context a;
    public int b;
    public ViewGroup c;
    public final View d;
    public Runnable e;
    public Runnable f;

    public Scene(@NonNull ViewGroup viewGroup0) {
        this.b = -1;
        this.c = viewGroup0;
    }

    public Scene(@NonNull ViewGroup viewGroup0, @NonNull View view0) {
        this.b = -1;
        this.c = viewGroup0;
        this.d = view0;
    }

    public void enter() {
        View view0 = this.d;
        ViewGroup viewGroup0 = this.c;
        int v = this.b;
        if(v > 0 || view0 != null) {
            this.getSceneRoot().removeAllViews();
            if(v > 0) {
                LayoutInflater.from(this.a).inflate(v, viewGroup0);
            }
            else {
                viewGroup0.addView(view0);
            }
        }
        Runnable runnable0 = this.e;
        if(runnable0 != null) {
            runnable0.run();
        }
        viewGroup0.setTag(id.transition_current_scene, this);
    }

    public void exit() {
        if(Scene.getCurrentScene(this.c) == this) {
            Runnable runnable0 = this.f;
            if(runnable0 != null) {
                runnable0.run();
            }
        }
    }

    @Nullable
    public static Scene getCurrentScene(@NonNull ViewGroup viewGroup0) {
        return (Scene)viewGroup0.getTag(id.transition_current_scene);
    }

    @NonNull
    public static Scene getSceneForLayout(@NonNull ViewGroup viewGroup0, @LayoutRes int v, @NonNull Context context0) {
        SparseArray sparseArray0 = (SparseArray)viewGroup0.getTag(id.transition_scene_layoutid_cache);
        if(sparseArray0 == null) {
            sparseArray0 = new SparseArray();
            viewGroup0.setTag(id.transition_scene_layoutid_cache, sparseArray0);
        }
        Scene scene0 = (Scene)sparseArray0.get(v);
        if(scene0 != null) {
            return scene0;
        }
        Scene scene1 = new Scene();  // 初始化器: Ljava/lang/Object;-><init>()V
        scene1.a = context0;
        scene1.c = viewGroup0;
        scene1.b = v;
        sparseArray0.put(v, scene1);
        return scene1;
    }

    @NonNull
    public ViewGroup getSceneRoot() {
        return this.c;
    }

    public void setEnterAction(@Nullable Runnable runnable0) {
        this.e = runnable0;
    }

    public void setExitAction(@Nullable Runnable runnable0) {
        this.f = runnable0;
    }
}


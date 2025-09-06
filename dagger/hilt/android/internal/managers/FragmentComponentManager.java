package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

public class FragmentComponentManager implements GeneratedComponentManager {
    @EntryPoint
    @InstallIn({ActivityComponent.class})
    public interface FragmentComponentBuilderEntryPoint {
        FragmentComponentBuilder fragmentComponentBuilder();
    }

    public volatile FragmentComponent a;
    public final Object b;
    public final Fragment c;

    public FragmentComponentManager(Fragment fragment0) {
        this.b = new Object();
        this.c = fragment0;
    }

    public final FragmentComponent a() {
        Preconditions.checkNotNull(this.c.getHost(), "Hilt Fragments must be attached before creating the component.");
        Preconditions.checkState(this.c.getHost() instanceof GeneratedComponentManager, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", new Object[]{this.c.getHost().getClass()});
        return ((FragmentComponentBuilderEntryPoint)EntryPoints.get(this.c.getHost(), FragmentComponentBuilderEntryPoint.class)).fragmentComponentBuilder().fragment(this.c).build();
    }

    public static ContextWrapper createContextWrapper(Context context0, Fragment fragment0) {
        ContextWrapper contextWrapper0 = new FragmentContextWrapper(((Context)Preconditions.checkNotNull(context0)));  // 初始化器: Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V
        e e0 = new e(((FragmentContextWrapper)contextWrapper0));
        contextWrapper0.b = null;
        Fragment fragment1 = (Fragment)Preconditions.checkNotNull(fragment0);
        contextWrapper0.a = fragment1;
        fragment1.getLifecycle().addObserver(e0);
        return contextWrapper0;
    }

    public static ContextWrapper createContextWrapper(LayoutInflater layoutInflater0, Fragment fragment0) {
        ContextWrapper contextWrapper0 = new FragmentContextWrapper(((Context)Preconditions.checkNotNull(((LayoutInflater)Preconditions.checkNotNull(layoutInflater0)).getContext())));  // 初始化器: Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V
        e e0 = new e(((FragmentContextWrapper)contextWrapper0));
        contextWrapper0.b = layoutInflater0;
        Fragment fragment1 = (Fragment)Preconditions.checkNotNull(fragment0);
        contextWrapper0.a = fragment1;
        fragment1.getLifecycle().addObserver(e0);
        return contextWrapper0;
    }

    public static final Context findActivity(Context context0) {
        while(context0 instanceof ContextWrapper && !(context0 instanceof Activity)) {
            context0 = ((ContextWrapper)context0).getBaseContext();
        }
        return context0;
    }

    @Override  // dagger.hilt.internal.GeneratedComponentManager
    public Object generatedComponent() {
        if(this.a == null) {
            Object object0 = this.b;
            synchronized(object0) {
                if(this.a == null) {
                    this.a = this.a();
                }
            }
        }
        return this.a;
    }

    public static final void initializeArguments(Fragment fragment0) {
        Preconditions.checkNotNull(fragment0);
        if(fragment0.getArguments() == null) {
            fragment0.setArguments(new Bundle());
        }
    }

    public void validate(Fragment fragment0) {
    }
}


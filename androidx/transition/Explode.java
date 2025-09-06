package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Explode extends Visibility {
    public final int[] K;
    public static final DecelerateInterpolator L;
    public static final AccelerateInterpolator M;

    static {
        Explode.L = new DecelerateInterpolator();
        Explode.M = new AccelerateInterpolator();
    }

    public Explode() {
        this.K = new int[2];
        this.setPropagation(new CircularPropagation());
    }

    public Explode(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.K = new int[2];
        this.setPropagation(new CircularPropagation());
    }

    @Override  // androidx.transition.Visibility
    public void captureEndValues(@NonNull TransitionValues transitionValues0) {
        super.captureEndValues(transitionValues0);
        this.o(transitionValues0);
    }

    @Override  // androidx.transition.Visibility
    public void captureStartValues(@NonNull TransitionValues transitionValues0) {
        super.captureStartValues(transitionValues0);
        this.o(transitionValues0);
    }

    public final void n(ViewGroup viewGroup0, Rect rect0, int[] arr_v) {
        int v5;
        int v3;
        viewGroup0.getLocationOnScreen(this.K);
        int v = this.K[0];
        int v1 = this.K[1];
        Rect rect1 = this.getEpicenter();
        if(rect1 == null) {
            int v2 = viewGroup0.getWidth();
            v3 = Math.round(viewGroup0.getTranslationX()) + (v2 / 2 + v);
            int v4 = viewGroup0.getHeight();
            v5 = Math.round(viewGroup0.getTranslationY()) + (v4 / 2 + v1);
        }
        else {
            v3 = rect1.centerX();
            v5 = rect1.centerY();
        }
        float f = (float)(rect0.centerX() - v3);
        float f1 = (float)(rect0.centerY() - v5);
        if(f == 0.0f && f1 == 0.0f) {
            f = ((float)(Math.random() * 2.0)) - 1.0f;
            f1 = ((float)(Math.random() * 2.0)) - 1.0f;
        }
        float f2 = (float)Math.sqrt(f1 * f1 + f * f);
        float f3 = (float)Math.max(v3 - v, viewGroup0.getWidth() - (v3 - v));
        float f4 = (float)Math.max(v5 - v1, viewGroup0.getHeight() - (v5 - v1));
        float f5 = (float)Math.sqrt(f4 * f4 + f3 * f3);
        arr_v[0] = Math.round(f / f2 * f5);
        arr_v[1] = Math.round(f5 * (f1 / f2));
    }

    public final void o(TransitionValues transitionValues0) {
        View view0 = transitionValues0.view;
        view0.getLocationOnScreen(this.K);
        int v = this.K[0];
        int v1 = this.K[1];
        Rect rect0 = new Rect(v, v1, view0.getWidth() + v, view0.getHeight() + v1);
        transitionValues0.values.put("android:explode:screenBounds", rect0);
    }

    @Override  // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        if(transitionValues1 == null) {
            return null;
        }
        Rect rect0 = (Rect)transitionValues1.values.get("android:explode:screenBounds");
        float f = view0.getTranslationX();
        float f1 = view0.getTranslationY();
        this.n(viewGroup0, rect0, this.K);
        return q0.a(view0, transitionValues1, rect0.left, rect0.top, f + ((float)this.K[0]), f1 + ((float)this.K[1]), f, f1, Explode.L, this);
    }

    @Override  // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        float f3;
        float f2;
        if(transitionValues0 == null) {
            return null;
        }
        Rect rect0 = (Rect)transitionValues0.values.get("android:explode:screenBounds");
        int v = rect0.left;
        int v1 = rect0.top;
        float f = view0.getTranslationX();
        float f1 = view0.getTranslationY();
        int[] arr_v = (int[])transitionValues0.view.getTag(id.transition_position);
        if(arr_v == null) {
            f2 = f;
            f3 = f1;
        }
        else {
            int v2 = arr_v[0];
            f2 = ((float)(v2 - rect0.left)) + f;
            f3 = ((float)(arr_v[1] - rect0.top)) + f1;
            rect0.offsetTo(v2, arr_v[1]);
        }
        this.n(viewGroup0, rect0, this.K);
        return q0.a(view0, transitionValues0, v, v1, f, f1, f2 + ((float)this.K[0]), f3 + ((float)this.K[1]), Explode.M, this);
    }
}


package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class p0 extends AnimatorListenerAdapter implements TransitionListener {
    public final View a;
    public final View b;
    public final int c;
    public final int d;
    public int[] e;
    public float f;
    public float g;
    public final float h;
    public final float i;

    public p0(View view0, View view1, int v, int v1, float f, float f1) {
        this.b = view0;
        this.a = view1;
        this.c = v - Math.round(view0.getTranslationX());
        this.d = v1 - Math.round(view0.getTranslationY());
        this.h = f;
        this.i = f1;
        int[] arr_v = (int[])view1.getTag(id.transition_position);
        this.e = arr_v;
        if(arr_v != null) {
            view1.setTag(id.transition_position, null);
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        if(this.e == null) {
            this.e = new int[2];
        }
        int[] arr_v = this.e;
        arr_v[0] = Math.round(this.b.getTranslationX() + ((float)this.c));
        int[] arr_v1 = this.e;
        arr_v1[1] = Math.round(this.b.getTranslationY() + ((float)this.d));
        this.a.setTag(id.transition_position, this.e);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationPause(Animator animator0) {
        this.f = this.b.getTranslationX();
        this.g = this.b.getTranslationY();
        this.b.setTranslationX(this.h);
        this.b.setTranslationY(this.i);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationResume(Animator animator0) {
        this.b.setTranslationX(this.f);
        this.b.setTranslationY(this.g);
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionCancel(Transition transition0) {
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionEnd(Transition transition0) {
        this.b.setTranslationX(this.h);
        this.b.setTranslationY(this.i);
        transition0.removeListener(this);
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionPause(Transition transition0) {
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionResume(Transition transition0) {
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionStart(Transition transition0) {
    }
}


package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class r extends AnimatorListenerAdapter {
    public final u a;

    public r(u u0) {
        this.a = u0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        u u0 = this.a;
        u0.c.setVisibility(8);
        if(!u0.a.b()) {
            u0.a.clearFocusAndHideKeyboard();
        }
        u0.a.setTransitionState(TransitionState.HIDDEN);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
        this.a.a.setTransitionState(TransitionState.HIDING);
    }
}


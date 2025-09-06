package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class s extends AnimatorListenerAdapter {
    public final u a;

    public s(u u0) {
        this.a = u0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        SearchView searchView0 = this.a.a;
        if(!this.a.a.b() && searchView0.x) {
            searchView0.requestFocusAndShowKeyboard();
        }
        searchView0.setTransitionState(TransitionState.SHOWN);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
        this.a.c.setVisibility(0);
        this.a.a.setTransitionState(TransitionState.SHOWING);
    }
}


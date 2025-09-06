package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class d extends AnimatorListenerAdapter {
    public final int a;
    public final BaseTransientBottomBar b;

    public d(BaseTransientBottomBar baseTransientBottomBar0, int v) {
        this.a = v;
        this.b = baseTransientBottomBar0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        if(this.a != 0) {
            this.b.b();
            return;
        }
        this.b.b();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationStart(Animator animator0) {
        if(this.a != 0) {
            super.onAnimationStart(animator0);
            return;
        }
        this.b.i.animateContentIn(this.b.c - this.b.a, this.b.a);
    }
}


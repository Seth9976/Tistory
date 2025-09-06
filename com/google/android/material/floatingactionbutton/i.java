package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class i extends AnimatorListenerAdapter {
    public boolean a;
    public final b b;
    public final OnChangedCallback c;

    public i(b b0, OnChangedCallback extendedFloatingActionButton$OnChangedCallback0) {
        this.b = b0;
        this.c = extendedFloatingActionButton$OnChangedCallback0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        this.a = true;
        this.b.onAnimationCancel();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        b b0 = this.b;
        b0.onAnimationEnd();
        if(!this.a) {
            b0.onChange(this.c);
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
        this.b.onAnimationStart(animator0);
        this.a = false;
    }
}


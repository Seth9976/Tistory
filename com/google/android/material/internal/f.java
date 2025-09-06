package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class f extends AnimatorListenerAdapter {
    public final int a;
    public final ExpandCollapseAnimationHelper b;

    public f(ExpandCollapseAnimationHelper expandCollapseAnimationHelper0, int v) {
        this.a = v;
        this.b = expandCollapseAnimationHelper0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationEnd(Animator animator0) {
        if(this.a != 1) {
            super.onAnimationEnd(animator0);
            return;
        }
        this.b.b.setVisibility(8);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationStart(Animator animator0) {
        if(this.a != 0) {
            super.onAnimationStart(animator0);
            return;
        }
        this.b.b.setVisibility(0);
    }
}


package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class a extends AnimatorListenerAdapter {
    public final int a;
    public final int b;
    public final BaseTransientBottomBar c;

    public a(BaseTransientBottomBar baseTransientBottomBar0, int v, int v1) {
        this.a = v1;
        this.c = baseTransientBottomBar0;
        this.b = v;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        if(this.a != 0) {
            this.c.a(this.b);
            return;
        }
        this.c.a(this.b);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationStart(Animator animator0) {
        if(this.a != 1) {
            super.onAnimationStart(animator0);
            return;
        }
        this.c.i.animateContentOut(0, this.c.b);
    }
}


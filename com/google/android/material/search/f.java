package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class f extends AnimatorListenerAdapter {
    public final int a;
    public final h b;

    public f(h h0, int v) {
        this.a = v;
        this.b = h0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        if(this.a != 0) {
            this.b.i = null;
            return;
        }
        this.b.i = null;
    }
}


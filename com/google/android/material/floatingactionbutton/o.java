package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class o extends AnimatorListenerAdapter {
    public boolean a;
    public final boolean b;
    public final m c;
    public final x d;

    public o(x x0, boolean z, m m0) {
        this.d = x0;
        this.b = z;
        this.c = m0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        this.a = true;
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        x x0 = this.d;
        x0.r = 0;
        x0.l = null;
        if(!this.a) {
            x0.v.internalSetVisibility((this.b ? 8 : 4), this.b);
            m m0 = this.c;
            if(m0 != null) {
                m0.onHidden();
            }
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
        this.d.v.internalSetVisibility(0, this.b);
        this.d.r = 1;
        this.d.l = animator0;
        this.a = false;
    }
}


package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class p extends AnimatorListenerAdapter {
    public final int a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public p(x x0, boolean z, m m0) {
        this.a = 0;
        this.d = x0;
        this.b = z;
        this.c = m0;
        super();
    }

    public p(boolean z, View view0, View view1) {
        this.a = 1;
        this.b = z;
        this.c = view0;
        this.d = view1;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        if(this.a != 0) {
            if(!this.b) {
                ((View)this.c).setVisibility(4);
                ((View)this.d).setAlpha(1.0f);
                ((View)this.d).setVisibility(0);
            }
            return;
        }
        ((x)this.d).r = 0;
        ((x)this.d).l = null;
        m m0 = (m)this.c;
        if(m0 != null) {
            m0.onShown();
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
        if(this.a != 0) {
            if(this.b) {
                ((View)this.c).setVisibility(0);
                ((View)this.d).setAlpha(0.0f);
                ((View)this.d).setVisibility(4);
            }
            return;
        }
        ((x)this.d).v.internalSetVisibility(0, this.b);
        ((x)this.d).r = 2;
        ((x)this.d).l = animator0;
    }
}


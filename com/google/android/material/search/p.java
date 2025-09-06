package com.google.android.material.search;

import android.animation.AnimatorSet;

public final class p implements Runnable {
    public final int a;
    public final u b;

    public p(u u0, int v) {
        this.a = v;
        this.b = u0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            float f = (float)this.b.c.getHeight();
            this.b.c.setTranslationY(f);
            AnimatorSet animatorSet0 = this.b.h(true);
            animatorSet0.addListener(new s(this.b));
            animatorSet0.start();
            return;
        }
        AnimatorSet animatorSet1 = this.b.d(true);
        animatorSet1.addListener(new q(this.b));
        animatorSet1.start();
    }
}


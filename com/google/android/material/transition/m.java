package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class m extends AnimatorListenerAdapter {
    public final int a;
    public final View b;
    public final float c;
    public final float d;

    public m(View view0, float f, float f1, int v) {
        this.a = v;
        this.b = view0;
        this.c = f;
        this.d = f1;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        if(this.a != 0) {
            this.b.setScaleX(this.c);
            this.b.setScaleY(this.d);
            return;
        }
        this.b.setScaleX(this.c);
        this.b.setScaleY(this.d);
    }
}


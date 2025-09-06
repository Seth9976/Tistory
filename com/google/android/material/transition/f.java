package com.google.android.material.transition;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.transition.platform.l;

public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final int a;
    public final View b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public f(View view0, float f, float f1, float f2, float f3, int v) {
        this.a = v;
        this.b = view0;
        this.c = f;
        this.d = f1;
        this.e = f2;
        this.f = f3;
        super();
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        if(this.a != 0) {
            float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
            this.b.setAlpha(l.d(this.c, this.d, this.e, this.f, f, false));
            return;
        }
        float f1 = (float)(((Float)valueAnimator0.getAnimatedValue()));
        this.b.setAlpha(p.d(this.c, this.d, this.e, this.f, f1, false));
    }
}


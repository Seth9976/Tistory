package com.google.android.material.sidesheet;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.material.animation.AnimationUtils;
import g.a;

public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final SideSheetBehavior a;
    public final ViewGroup.MarginLayoutParams b;
    public final int c;
    public final View d;

    public d(SideSheetBehavior sideSheetBehavior0, ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v, View view0) {
        this.a = sideSheetBehavior0;
        this.b = viewGroup$MarginLayoutParams0;
        this.c = v;
        this.d = view0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        a a0 = this.a.o;
        float f = valueAnimator0.getAnimatedFraction();
        a0.a0(this.b, AnimationUtils.lerp(this.c, 0, f));
        this.d.requestLayout();
    }
}


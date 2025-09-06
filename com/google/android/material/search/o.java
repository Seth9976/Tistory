package com.google.android.material.search;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.google.android.material.animation.AnimationUtils;

public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final u a;
    public final float b;
    public final float c;
    public final Rect d;

    public o(u u0, float f, float f1, Rect rect0) {
        this.a = u0;
        this.b = f;
        this.c = f1;
        this.d = rect0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.getClass();
        float f = valueAnimator0.getAnimatedFraction();
        this.a.c.updateClipBoundsAndCornerRadius(this.d, AnimationUtils.lerp(this.b, this.c, f));
    }
}


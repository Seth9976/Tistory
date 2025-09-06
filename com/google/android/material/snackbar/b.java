package com.google.android.material.snackbar;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final BaseTransientBottomBar a;

    public b(BaseTransientBottomBar baseTransientBottomBar0) {
        this.a = baseTransientBottomBar0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
        this.a.view.setAlpha(f);
    }
}


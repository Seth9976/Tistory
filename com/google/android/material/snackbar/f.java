package com.google.android.material.snackbar;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final BaseTransientBottomBar a;

    public f(BaseTransientBottomBar baseTransientBottomBar0) {
        this.a = baseTransientBottomBar0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
        this.a.view.setTranslationY(((float)v));
    }
}


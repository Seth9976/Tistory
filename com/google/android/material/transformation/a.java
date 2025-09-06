package com.google.android.material.transformation;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;

public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final View a;

    public a(View view0) {
        this.a = view0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.invalidate();
    }
}


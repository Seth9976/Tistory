package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.circularreveal.CircularRevealWidget;

public final class b extends AnimatorListenerAdapter {
    public final CircularRevealWidget a;
    public final Drawable b;

    public b(CircularRevealWidget circularRevealWidget0, Drawable drawable0) {
        this.a = circularRevealWidget0;
        this.b = drawable0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.a.setCircularRevealOverlayDrawable(null);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
        this.a.setCircularRevealOverlayDrawable(this.b);
    }
}


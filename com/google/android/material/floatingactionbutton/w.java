package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import com.google.android.material.shape.MaterialShapeDrawable;

public abstract class w extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public boolean a;
    public float b;
    public float c;
    public final z d;

    public w(z z0) {
        this.d = z0;
        super();
    }

    public abstract float a();

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        float f = (float)(((int)this.c));
        MaterialShapeDrawable materialShapeDrawable0 = this.d.b;
        if(materialShapeDrawable0 != null) {
            materialShapeDrawable0.setElevation(f);
        }
        this.a = false;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        z z0 = this.d;
        if(!this.a) {
            this.b = z0.b == null ? 0.0f : z0.b.getElevation();
            this.c = this.a();
            this.a = true;
        }
        float f = this.b;
        float f1 = this.c - f;
        float f2 = valueAnimator0.getAnimatedFraction();
        MaterialShapeDrawable materialShapeDrawable0 = z0.b;
        if(materialShapeDrawable0 != null) {
            materialShapeDrawable0.setElevation(((float)(((int)(f2 * f1 + f)))));
        }
    }
}


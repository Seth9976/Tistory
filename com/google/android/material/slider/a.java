package com.google.android.material.slider;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import androidx.core.view.ViewCompat;
import com.google.android.material.tooltip.TooltipDrawable;

public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final BaseSlider a;

    public a(BaseSlider baseSlider0) {
        this.a = baseSlider0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
        BaseSlider baseSlider0 = this.a;
        for(Object object0: baseSlider0.k) {
            ((TooltipDrawable)object0).setRevealFraction(f);
        }
        ViewCompat.postInvalidateOnAnimation(baseSlider0);
    }
}


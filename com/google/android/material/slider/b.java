package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.tooltip.TooltipDrawable;

public final class b extends AnimatorListenerAdapter {
    public final BaseSlider a;

    public b(BaseSlider baseSlider0) {
        this.a = baseSlider0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        super.onAnimationEnd(animator0);
        ViewOverlayImpl viewOverlayImpl0 = ViewUtils.getContentViewOverlay(this.a);
        for(Object object0: this.a.k) {
            viewOverlayImpl0.remove(((TooltipDrawable)object0));
        }
    }
}


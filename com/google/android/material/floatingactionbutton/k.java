package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import androidx.appcompat.view.menu.f;
import com.google.android.material.R.animator;

public final class k extends b {
    public boolean g;
    public final ExtendedFloatingActionButton h;

    public k(ExtendedFloatingActionButton extendedFloatingActionButton0, f f0) {
        this.h = extendedFloatingActionButton0;
        super(extendedFloatingActionButton0, f0);
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final int getDefaultMotionSpecResource() {
        return animator.mtrl_extended_fab_hide_motion_spec;
    }

    @Override  // com.google.android.material.floatingactionbutton.b
    public final void onAnimationCancel() {
        super.onAnimationCancel();
        this.g = true;
    }

    @Override  // com.google.android.material.floatingactionbutton.b
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        ExtendedFloatingActionButton extendedFloatingActionButton0 = this.h;
        extendedFloatingActionButton0.u = 0;
        if(!this.g) {
            extendedFloatingActionButton0.setVisibility(8);
        }
    }

    @Override  // com.google.android.material.floatingactionbutton.b
    public final void onAnimationStart(Animator animator0) {
        super.onAnimationStart(animator0);
        this.g = false;
        this.h.setVisibility(0);
        this.h.u = 1;
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void onChange(OnChangedCallback extendedFloatingActionButton$OnChangedCallback0) {
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void performNow() {
        this.h.setVisibility(8);
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final boolean shouldCancel() {
        return this.h.getVisibility() == 0 ? this.h.u == 1 : this.h.u != 2;
    }
}


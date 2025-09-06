package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import androidx.appcompat.view.menu.f;
import com.google.android.material.R.animator;

public final class l extends b {
    public final ExtendedFloatingActionButton g;

    public l(ExtendedFloatingActionButton extendedFloatingActionButton0, f f0) {
        this.g = extendedFloatingActionButton0;
        super(extendedFloatingActionButton0, f0);
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final int getDefaultMotionSpecResource() {
        return animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override  // com.google.android.material.floatingactionbutton.b
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        this.g.u = 0;
    }

    @Override  // com.google.android.material.floatingactionbutton.b
    public final void onAnimationStart(Animator animator0) {
        super.onAnimationStart(animator0);
        this.g.setVisibility(0);
        this.g.u = 2;
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void onChange(OnChangedCallback extendedFloatingActionButton$OnChangedCallback0) {
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void performNow() {
        this.g.setVisibility(0);
        this.g.setAlpha(1.0f);
        this.g.setScaleY(1.0f);
        this.g.setScaleX(1.0f);
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final boolean shouldCancel() {
        return this.g.getVisibility() == 0 ? this.g.u != 1 : this.g.u == 2;
    }
}


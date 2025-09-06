package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class f extends AnimatorListenerAdapter {
    public final boolean a;
    public final int b;
    public final MaterialSideContainerBackHelper c;

    public f(MaterialSideContainerBackHelper materialSideContainerBackHelper0, boolean z, int v) {
        this.c = materialSideContainerBackHelper0;
        this.a = z;
        this.b = v;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.c.view.setTranslationX(0.0f);
        this.c.updateBackProgress(0.0f, this.a, this.b);
    }
}


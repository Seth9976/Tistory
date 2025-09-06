package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class d extends AnimatorListenerAdapter {
    public final int a;
    public final Object b;

    public d(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        if(this.a != 0) {
            View view0 = (View)this.b;
            if(view0 != null) {
                view0.setVisibility(0);
            }
            return;
        }
        ((MaterialBottomContainerBackHelper)this.b).view.setTranslationY(0.0f);
        ((MaterialBottomContainerBackHelper)this.b).updateBackProgress(0.0f);
    }
}


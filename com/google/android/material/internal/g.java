package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

public final class g implements Listener {
    public final int a;

    public g(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.android.material.internal.MultiViewUpdateListener$Listener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0, View view0) {
        switch(this.a) {
            case 0: {
                view0.setTranslationX(((float)(((Float)valueAnimator0.getAnimatedValue()))));
                return;
            }
            case 1: {
                Float float0 = (Float)valueAnimator0.getAnimatedValue();
                view0.setScaleX(((float)float0));
                view0.setScaleY(((float)float0));
                return;
            }
            case 2: {
                view0.setTranslationY(((float)(((Float)valueAnimator0.getAnimatedValue()))));
                return;
            }
            default: {
                view0.setAlpha(((float)(((Float)valueAnimator0.getAnimatedValue()))));
            }
        }
    }
}


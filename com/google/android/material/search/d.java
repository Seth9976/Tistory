package com.google.android.material.search;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import com.kakao.keditor.widget.animation.AnimationStandardKt;

public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int a;
    public final View b;

    public d(int v, View view0) {
        this.a = v;
        this.b = view0;
        super();
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        switch(this.a) {
            case 0: {
                this.b.setAlpha(0.0f);
                return;
            }
            case 1: {
                AnimationStandardKt.c(valueAnimator0, this.b);
                return;
            }
            case 2: {
                AnimationStandardKt.a(valueAnimator0, this.b);
                return;
            }
            default: {
                AnimationStandardKt.b(valueAnimator0, this.b);
            }
        }
    }
}


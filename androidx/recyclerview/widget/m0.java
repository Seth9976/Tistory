package androidx.recyclerview.widget;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class m0 implements ValueAnimator.AnimatorUpdateListener {
    public final n0 a;

    public m0(n0 n00) {
        this.a = n00;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.m = valueAnimator0.getAnimatedFraction();
    }
}


package androidx.recyclerview.widget;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class a0 implements ValueAnimator.AnimatorUpdateListener {
    public final b0 a;

    public a0(b0 b00) {
        this.a = b00;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
        this.a.o.setAlpha(((int)(f * 255.0f)));
        this.a.p.setAlpha(((int)(f * 255.0f)));
        this.a.E.invalidate();
    }
}


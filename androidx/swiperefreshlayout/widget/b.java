package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final d a;
    public final CircularProgressDrawable b;

    public b(CircularProgressDrawable circularProgressDrawable0, d d0) {
        this.b = circularProgressDrawable0;
        this.a = d0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
        this.b.getClass();
        CircularProgressDrawable.c(f, this.a);
        this.b.a(f, this.a, false);
        this.b.invalidateSelf();
    }
}


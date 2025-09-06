package e8;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;

public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final View a;
    public final View b;
    public final d c;

    public c(d d0, View view0, View view1) {
        this.c = d0;
        this.a = view0;
        this.b = view1;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        float f = valueAnimator0.getAnimatedFraction();
        this.c.c(this.a, this.b, f);
    }
}


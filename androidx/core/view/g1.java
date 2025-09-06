package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

public final class g1 implements Runnable {
    public final View a;
    public final WindowInsetsAnimationCompat b;
    public final BoundsCompat c;
    public final ValueAnimator d;

    public g1(View view0, WindowInsetsAnimationCompat windowInsetsAnimationCompat0, BoundsCompat windowInsetsAnimationCompat$BoundsCompat0, ValueAnimator valueAnimator0) {
        this.a = view0;
        this.b = windowInsetsAnimationCompat0;
        this.c = windowInsetsAnimationCompat$BoundsCompat0;
        this.d = valueAnimator0;
    }

    @Override
    public final void run() {
        i1.j(this.a, this.b, this.c);
        this.d.start();
    }
}


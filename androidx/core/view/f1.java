package androidx.core.view;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.graphics.Insets;
import java.util.Collections;
import java.util.List;

public final class f1 implements ValueAnimator.AnimatorUpdateListener {
    public final WindowInsetsAnimationCompat a;
    public final WindowInsetsCompat b;
    public final WindowInsetsCompat c;
    public final int d;
    public final View e;

    public f1(WindowInsetsAnimationCompat windowInsetsAnimationCompat0, WindowInsetsCompat windowInsetsCompat0, WindowInsetsCompat windowInsetsCompat1, int v, View view0) {
        this.a = windowInsetsAnimationCompat0;
        this.b = windowInsetsCompat0;
        this.c = windowInsetsCompat1;
        this.d = v;
        this.e = view0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        float f = valueAnimator0.getAnimatedFraction();
        WindowInsetsAnimationCompat windowInsetsAnimationCompat0 = this.a;
        windowInsetsAnimationCompat0.setFraction(f);
        float f1 = windowInsetsAnimationCompat0.getInterpolatedFraction();
        WindowInsetsCompat windowInsetsCompat0 = this.b;
        Builder windowInsetsCompat$Builder0 = new Builder(windowInsetsCompat0);
        for(int v = 1; v <= 0x100; v <<= 1) {
            if((this.d & v) == 0) {
                windowInsetsCompat$Builder0.setInsets(v, windowInsetsCompat0.getInsets(v));
            }
            else {
                Insets insets0 = windowInsetsCompat0.getInsets(v);
                Insets insets1 = this.c.getInsets(v);
                windowInsetsCompat$Builder0.setInsets(v, WindowInsetsCompat.a(insets0, ((int)(((double)(((float)(insets0.left - insets1.left)) * (1.0f - f1))) + 0.5)), ((int)(((double)(((float)(insets0.top - insets1.top)) * (1.0f - f1))) + 0.5)), ((int)(((double)(((float)(insets0.right - insets1.right)) * (1.0f - f1))) + 0.5)), ((int)(((double)(((float)(insets0.bottom - insets1.bottom)) * (1.0f - f1))) + 0.5))));
            }
        }
        WindowInsetsCompat windowInsetsCompat1 = windowInsetsCompat$Builder0.build();
        List list0 = Collections.singletonList(windowInsetsAnimationCompat0);
        i1.i(this.e, windowInsetsCompat1, list0);
    }
}


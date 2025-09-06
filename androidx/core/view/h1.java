package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import androidx.core.graphics.Insets;
import java.util.Objects;

public final class h1 implements View.OnApplyWindowInsetsListener {
    public final Callback a;
    public WindowInsetsCompat b;

    public h1(View view0, Callback windowInsetsAnimationCompat$Callback0) {
        this.a = windowInsetsAnimationCompat$Callback0;
        WindowInsetsCompat windowInsetsCompat0 = ViewCompat.getRootWindowInsets(view0);
        this.b = windowInsetsCompat0 == null ? null : new Builder(windowInsetsCompat0).build();
    }

    @Override  // android.view.View$OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
        DecelerateInterpolator decelerateInterpolator0;
        if(!view0.isLaidOut()) {
            this.b = WindowInsetsCompat.toWindowInsetsCompat(windowInsets0, view0);
            return i1.k(view0, windowInsets0);
        }
        WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.toWindowInsetsCompat(windowInsets0, view0);
        if(this.b == null) {
            this.b = ViewCompat.getRootWindowInsets(view0);
        }
        if(this.b == null) {
            this.b = windowInsetsCompat0;
            return i1.k(view0, windowInsets0);
        }
        Callback windowInsetsAnimationCompat$Callback0 = i1.l(view0);
        if(windowInsetsAnimationCompat$Callback0 != null && Objects.equals(windowInsetsAnimationCompat$Callback0.a, windowInsets0)) {
            return i1.k(view0, windowInsets0);
        }
        WindowInsetsCompat windowInsetsCompat1 = this.b;
        int v = 0;
        for(int v1 = 1; v1 <= 0x100; v1 <<= 1) {
            if(!windowInsetsCompat0.getInsets(v1).equals(windowInsetsCompat1.getInsets(v1))) {
                v |= v1;
            }
        }
        if(v == 0) {
            return i1.k(view0, windowInsets0);
        }
        WindowInsetsCompat windowInsetsCompat2 = this.b;
        if((v & 8) == 0) {
            decelerateInterpolator0 = i1.h;
        }
        else {
            Insets insets0 = windowInsetsCompat0.getInsets(8);
            Insets insets1 = windowInsetsCompat2.getInsets(8);
            decelerateInterpolator0 = insets0.bottom > insets1.bottom ? i1.f : i1.g;
        }
        WindowInsetsAnimationCompat windowInsetsAnimationCompat0 = new WindowInsetsAnimationCompat(v, decelerateInterpolator0, 0xA0L);
        windowInsetsAnimationCompat0.setFraction(0.0f);
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(windowInsetsAnimationCompat0.getDurationMillis());
        Insets insets2 = windowInsetsCompat0.getInsets(v);
        Insets insets3 = windowInsetsCompat2.getInsets(v);
        BoundsCompat windowInsetsAnimationCompat$BoundsCompat0 = new BoundsCompat(Insets.of(Math.min(insets2.left, insets3.left), Math.min(insets2.top, insets3.top), Math.min(insets2.right, insets3.right), Math.min(insets2.bottom, insets3.bottom)), Insets.of(Math.max(insets2.left, insets3.left), Math.max(insets2.top, insets3.top), Math.max(insets2.right, insets3.right), Math.max(insets2.bottom, insets3.bottom)));
        i1.h(view0, windowInsetsAnimationCompat0, windowInsets0, false);
        valueAnimator0.addUpdateListener(new f1(windowInsetsAnimationCompat0, windowInsetsCompat0, windowInsetsCompat2, v, view0));
        valueAnimator0.addListener(new a1(windowInsetsAnimationCompat0, view0, 1));
        OneShotPreDrawListener.add(view0, new g1(view0, windowInsetsAnimationCompat0, windowInsetsAnimationCompat$BoundsCompat0, valueAnimator0));
        this.b = windowInsetsCompat0;
        return i1.k(view0, windowInsets0);
    }
}


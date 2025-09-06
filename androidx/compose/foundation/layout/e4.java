package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.WindowInsetsAnimation.Bounds;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;

public abstract class e4 {
    public static int b() {
        return 8;
    }

    public static WindowInsetsAnimation.Bounds g(Insets insets0, Insets insets1) {
        return new WindowInsetsAnimation.Bounds(insets0, insets1);
    }

    public static WindowInsetsAnimation h(int v, Interpolator interpolator0, long v1) {
        return new WindowInsetsAnimation(v, interpolator0, v1);
    }

    public static WindowInsetsAnimation i(Object object0) {
        return (WindowInsetsAnimation)object0;
    }

    public static WindowInsetsAnimationController j(Object object0) [...] // Inlined contents

    public static void m() {
    }

    public static void p(WindowInsetsAnimationController windowInsetsAnimationController0, Insets insets0) {
        windowInsetsAnimationController0.setInsetsAndAlpha(insets0, 1.0f, 0.0f);
    }

    public static void s(WindowInsetsController windowInsetsController0, int v, CancellationSignal cancellationSignal0, WindowInsetsAnimationControlListener windowInsetsAnimationControlListener0) {
        windowInsetsController0.controlWindowInsetsAnimation(v, -1L, null, cancellationSignal0, windowInsetsAnimationControlListener0);
    }
}


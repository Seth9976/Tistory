package androidx.core.view;

import android.view.WindowInsetsAnimationController;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.f;
import androidx.core.graphics.Insets;

public final class WindowInsetsAnimationControllerCompat {
    public final f a;

    public WindowInsetsAnimationControllerCompat(WindowInsetsAnimationController windowInsetsAnimationController0) {
        this.a = new f(windowInsetsAnimationController0, 2);
    }

    public void finish(boolean z) {
        ((WindowInsetsAnimationController)this.a.b).finish(z);
    }

    public float getCurrentAlpha() {
        return m1.r(((WindowInsetsAnimationController)this.a.b));
    }

    @FloatRange(from = 0.0, to = 1.0)
    public float getCurrentFraction() {
        return m1.a(((WindowInsetsAnimationController)this.a.b));
    }

    @NonNull
    public Insets getCurrentInsets() {
        return Insets.toCompatInsets(((WindowInsetsAnimationController)this.a.b).getCurrentInsets());
    }

    @NonNull
    public Insets getHiddenStateInsets() {
        return Insets.toCompatInsets(((WindowInsetsAnimationController)this.a.b).getHiddenStateInsets());
    }

    @NonNull
    public Insets getShownStateInsets() {
        return Insets.toCompatInsets(((WindowInsetsAnimationController)this.a.b).getShownStateInsets());
    }

    public int getTypes() {
        return m1.c(((WindowInsetsAnimationController)this.a.b));
    }

    public boolean isCancelled() {
        return m1.w(((WindowInsetsAnimationController)this.a.b));
    }

    public boolean isFinished() {
        return m1.q(((WindowInsetsAnimationController)this.a.b));
    }

    // 去混淆评级： 低(20)
    public boolean isReady() {
        return !this.isFinished() && !this.isCancelled();
    }

    public void setInsetsAndAlpha(@Nullable Insets insets0, @FloatRange(from = 0.0, to = 1.0) float f, @FloatRange(from = 0.0, to = 1.0) float f1) {
        m1.k(((WindowInsetsAnimationController)this.a.b), (insets0 == null ? null : insets0.toPlatformInsets()), f, f1);
    }
}


package androidx.core.view;

import android.os.Build.VERSION;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation.Bounds;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.foundation.layout.e4;
import androidx.core.graphics.Insets;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public final class WindowInsetsAnimationCompat {
    public static final class BoundsCompat {
        public final Insets a;
        public final Insets b;

        public BoundsCompat(WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
            this.a = Insets.toCompatInsets(windowInsetsAnimation$Bounds0.getLowerBound());
            this.b = Insets.toCompatInsets(windowInsetsAnimation$Bounds0.getUpperBound());
        }

        public BoundsCompat(@NonNull Insets insets0, @NonNull Insets insets1) {
            this.a = insets0;
            this.b = insets1;
        }

        @NonNull
        public Insets getLowerBound() {
            return this.a;
        }

        @NonNull
        public Insets getUpperBound() {
            return this.b;
        }

        @NonNull
        public BoundsCompat inset(@NonNull Insets insets0) {
            return new BoundsCompat(WindowInsetsCompat.a(this.a, insets0.left, insets0.top, insets0.right, insets0.bottom), WindowInsetsCompat.a(this.b, insets0.left, insets0.top, insets0.right, insets0.bottom));
        }

        @NonNull
        @RequiresApi(30)
        public WindowInsetsAnimation.Bounds toBounds() {
            return e4.g(this.getLowerBound().toPlatformInsets(), this.getUpperBound().toPlatformInsets());
        }

        @NonNull
        @RequiresApi(30)
        public static BoundsCompat toBoundsCompat(@NonNull WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
            return new BoundsCompat(windowInsetsAnimation$Bounds0);
        }

        @Override
        public String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }
    }

    public static abstract class Callback {
        @RestrictTo({Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface DispatchMode {
        }

        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP;
        public WindowInsets a;
        public final int b;

        public Callback(int v) {
            this.b = v;
        }

        public final int getDispatchMode() {
            return this.b;
        }

        public void onEnd(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
        }

        public void onPrepare(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
        }

        @NonNull
        public abstract WindowInsetsCompat onProgress(@NonNull WindowInsetsCompat arg1, @NonNull List arg2);

        @NonNull
        public BoundsCompat onStart(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat0, @NonNull BoundsCompat windowInsetsAnimationCompat$BoundsCompat0) {
            return windowInsetsAnimationCompat$BoundsCompat0;
        }
    }

    public l1 a;

    public WindowInsetsAnimationCompat(int v, @Nullable Interpolator interpolator0, long v1) {
        if(Build.VERSION.SDK_INT >= 30) {
            this.a = new k1(e4.h(v, interpolator0, v1));
            return;
        }
        this.a = new i1(v, interpolator0, v1);  // 初始化器: Landroidx/core/view/l1;-><init>(ILandroid/view/animation/Interpolator;J)V
    }

    @FloatRange(from = 0.0, to = 1.0)
    public float getAlpha() {
        return this.a.e;
    }

    public long getDurationMillis() {
        return this.a.a();
    }

    @FloatRange(from = 0.0, to = 1.0)
    public float getFraction() {
        return this.a.b();
    }

    public float getInterpolatedFraction() {
        return this.a.c();
    }

    @Nullable
    public Interpolator getInterpolator() {
        return this.a.d();
    }

    public int getTypeMask() {
        return this.a.e();
    }

    public void setAlpha(@FloatRange(from = 0.0, to = 1.0) float f) {
        this.a.e = f;
    }

    public void setFraction(@FloatRange(from = 0.0, to = 1.0) float f) {
        this.a.f(f);
    }
}


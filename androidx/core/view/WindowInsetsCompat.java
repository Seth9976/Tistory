package androidx.core.view;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class WindowInsetsCompat {
    public static final class Builder {
        public final r1 a;

        public Builder() {
            int v = Build.VERSION.SDK_INT;
            if(v >= 30) {
                this.a = new q1();
                return;
            }
            if(v >= 29) {
                this.a = new p1();
                return;
            }
            this.a = new o1();
        }

        public Builder(@NonNull WindowInsetsCompat windowInsetsCompat0) {
            int v = Build.VERSION.SDK_INT;
            if(v >= 30) {
                this.a = new q1(windowInsetsCompat0);
                return;
            }
            if(v >= 29) {
                this.a = new p1(windowInsetsCompat0);
                return;
            }
            this.a = new o1(windowInsetsCompat0);
        }

        @NonNull
        public WindowInsetsCompat build() {
            return this.a.b();
        }

        @NonNull
        public Builder setDisplayCutout(@Nullable DisplayCutoutCompat displayCutoutCompat0) {
            this.a.c(displayCutoutCompat0);
            return this;
        }

        @NonNull
        public Builder setInsets(int v, @NonNull Insets insets0) {
            this.a.d(v, insets0);
            return this;
        }

        @NonNull
        public Builder setInsetsIgnoringVisibility(int v, @NonNull Insets insets0) {
            this.a.e(v, insets0);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setMandatorySystemGestureInsets(@NonNull Insets insets0) {
            this.a.f(insets0);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setStableInsets(@NonNull Insets insets0) {
            this.a.g(insets0);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSystemGestureInsets(@NonNull Insets insets0) {
            this.a.h(insets0);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSystemWindowInsets(@NonNull Insets insets0) {
            this.a.i(insets0);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTappableElementInsets(@NonNull Insets insets0) {
            this.a.j(insets0);
            return this;
        }

        @NonNull
        public Builder setVisible(int v, boolean z) {
            this.a.k(v, z);
            return this;
        }
    }

    public static final class Type {
        @RestrictTo({Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface InsetsType {
        }

        public static int a(int v) {
            switch(v) {
                case 1: {
                    return 0;
                }
                case 2: {
                    return 1;
                }
                case 4: {
                    return 2;
                }
                case 8: {
                    return 3;
                }
                case 16: {
                    return 4;
                }
                case 0x20: {
                    return 5;
                }
                case 0x40: {
                    return 6;
                }
                case 0x80: {
                    return 7;
                }
                case 0x100: {
                    return 8;
                }
                default: {
                    throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + v);
                }
            }
        }

        public static int captionBar() [...] // Inlined contents

        public static int displayCutout() [...] // Inlined contents

        public static int ime() [...] // Inlined contents

        public static int mandatorySystemGestures() [...] // Inlined contents

        public static int navigationBars() [...] // Inlined contents

        public static int statusBars() [...] // Inlined contents

        public static int systemBars() [...] // Inlined contents

        public static int systemGestures() [...] // Inlined contents

        public static int tappableElement() [...] // Inlined contents
    }

    @NonNull
    public static final WindowInsetsCompat CONSUMED;
    public final y1 a;

    static {
        if(Build.VERSION.SDK_INT >= 30) {
            WindowInsetsCompat.CONSUMED = x1.q;
            return;
        }
        WindowInsetsCompat.CONSUMED = y1.b;
    }

    public WindowInsetsCompat(WindowInsets windowInsets0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 30) {
            this.a = new x1(this, windowInsets0);
            return;
        }
        if(v >= 29) {
            this.a = new w1(this, windowInsets0);
            return;
        }
        if(v >= 28) {
            this.a = new u1(this, windowInsets0);
            return;
        }
        this.a = new t1(this, windowInsets0);
    }

    public WindowInsetsCompat(@Nullable WindowInsetsCompat windowInsetsCompat0) {
        if(windowInsetsCompat0 != null) {
            y1 y10 = windowInsetsCompat0.a;
            int v = Build.VERSION.SDK_INT;
            if(v >= 30 && y10 instanceof x1) {
                this.a = new x1(this, ((x1)y10));
            }
            else if(v >= 29 && y10 instanceof w1) {
                this.a = new w1(this, ((w1)y10));
            }
            else if(v >= 28 && y10 instanceof u1) {
                this.a = new u1(this, ((u1)y10));
            }
            else if(y10 instanceof t1) {
                this.a = new t1(this, ((t1)y10));
            }
            else if(y10 instanceof s1) {
                this.a = new s1(this, ((s1)y10));
            }
            else {
                this.a = new y1(this);
            }
            y10.e(this);
            return;
        }
        this.a = new y1(this);
    }

    public static Insets a(Insets insets0, int v, int v1, int v2, int v3) {
        int v4 = Math.max(0, insets0.left - v);
        int v5 = Math.max(0, insets0.top - v1);
        int v6 = Math.max(0, insets0.right - v2);
        int v7 = Math.max(0, insets0.bottom - v3);
        return v4 != v || v5 != v1 || v6 != v2 || v7 != v3 ? Insets.of(v4, v5, v6, v7) : insets0;
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat consumeDisplayCutout() {
        return this.a.a();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat consumeStableInsets() {
        return this.a.b();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat consumeSystemWindowInsets() {
        return this.a.c();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof WindowInsetsCompat ? ObjectsCompat.equals(this.a, ((WindowInsetsCompat)object0).a) : false;
    }

    @Nullable
    public DisplayCutoutCompat getDisplayCutout() {
        return this.a.f();
    }

    @NonNull
    public Insets getInsets(int v) {
        return this.a.g(v);
    }

    @NonNull
    public Insets getInsetsIgnoringVisibility(int v) {
        return this.a.h(v);
    }

    @NonNull
    @Deprecated
    public Insets getMandatorySystemGestureInsets() {
        return this.a.i();
    }

    @Deprecated
    public int getStableInsetBottom() {
        return this.a.j().bottom;
    }

    @Deprecated
    public int getStableInsetLeft() {
        return this.a.j().left;
    }

    @Deprecated
    public int getStableInsetRight() {
        return this.a.j().right;
    }

    @Deprecated
    public int getStableInsetTop() {
        return this.a.j().top;
    }

    @NonNull
    @Deprecated
    public Insets getStableInsets() {
        return this.a.j();
    }

    @NonNull
    @Deprecated
    public Insets getSystemGestureInsets() {
        return this.a.k();
    }

    @Deprecated
    public int getSystemWindowInsetBottom() {
        return this.a.l().bottom;
    }

    @Deprecated
    public int getSystemWindowInsetLeft() {
        return this.a.l().left;
    }

    @Deprecated
    public int getSystemWindowInsetRight() {
        return this.a.l().right;
    }

    @Deprecated
    public int getSystemWindowInsetTop() {
        return this.a.l().top;
    }

    @NonNull
    @Deprecated
    public Insets getSystemWindowInsets() {
        return this.a.l();
    }

    @NonNull
    @Deprecated
    public Insets getTappableElementInsets() {
        return this.a.m();
    }

    // 去混淆评级： 低(20)
    public boolean hasInsets() {
        return !this.getInsets(-1).equals(Insets.NONE) || !this.getInsetsIgnoringVisibility(-9).equals(Insets.NONE) || this.getDisplayCutout() != null;
    }

    @Deprecated
    public boolean hasStableInsets() {
        return !this.a.j().equals(Insets.NONE);
    }

    @Deprecated
    public boolean hasSystemWindowInsets() {
        return !this.a.l().equals(Insets.NONE);
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @NonNull
    public WindowInsetsCompat inset(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, @IntRange(from = 0L) int v2, @IntRange(from = 0L) int v3) {
        return this.a.n(v, v1, v2, v3);
    }

    @NonNull
    public WindowInsetsCompat inset(@NonNull Insets insets0) {
        return this.inset(insets0.left, insets0.top, insets0.right, insets0.bottom);
    }

    public boolean isConsumed() {
        return this.a.o();
    }

    public boolean isRound() {
        return this.a.p();
    }

    public boolean isVisible(int v) {
        return this.a.q(v);
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(int v, int v1, int v2, int v3) {
        return new Builder(this).setSystemWindowInsets(Insets.of(v, v1, v2, v3)).build();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(@NonNull Rect rect0) {
        return new Builder(this).setSystemWindowInsets(Insets.of(rect0)).build();
    }

    // 去混淆评级： 低(20)
    @Nullable
    @RequiresApi(20)
    public WindowInsets toWindowInsets() {
        return this.a instanceof s1 ? ((s1)this.a).c : null;
    }

    @NonNull
    @RequiresApi(20)
    public static WindowInsetsCompat toWindowInsetsCompat(@NonNull WindowInsets windowInsets0) {
        return WindowInsetsCompat.toWindowInsetsCompat(windowInsets0, null);
    }

    @NonNull
    @RequiresApi(20)
    public static WindowInsetsCompat toWindowInsetsCompat(@NonNull WindowInsets windowInsets0, @Nullable View view0) {
        WindowInsetsCompat windowInsetsCompat0 = new WindowInsetsCompat(((WindowInsets)Preconditions.checkNotNull(windowInsets0)));
        if(view0 != null && view0.isAttachedToWindow()) {
            WindowInsetsCompat windowInsetsCompat1 = ViewCompat.getRootWindowInsets(view0);
            windowInsetsCompat0.a.t(windowInsetsCompat1);
            View view1 = view0.getRootView();
            windowInsetsCompat0.a.d(view1);
        }
        return windowInsetsCompat0;
    }
}


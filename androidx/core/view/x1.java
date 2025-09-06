package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.core.graphics.Insets;

public final class x1 extends w1 {
    public static final WindowInsetsCompat q;

    static {
        x1.q = WindowInsetsCompat.toWindowInsetsCompat(WindowInsets.CONSUMED);
    }

    public x1(@NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull WindowInsets windowInsets0) {
        super(windowInsetsCompat0, windowInsets0);
    }

    public x1(@NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull x1 x10) {
        super(windowInsetsCompat0, x10);
    }

    @Override  // androidx.core.view.s1
    public final void d(@NonNull View view0) {
    }

    @Override  // androidx.core.view.s1
    @NonNull
    public Insets g(int v) {
        int v1 = z1.a(v);
        return Insets.toCompatInsets(this.c.getInsets(v1));
    }

    @Override  // androidx.core.view.s1
    @NonNull
    public Insets h(int v) {
        int v1 = z1.a(v);
        return Insets.toCompatInsets(this.c.getInsetsIgnoringVisibility(v1));
    }

    @Override  // androidx.core.view.s1
    public boolean q(int v) {
        int v1 = z1.a(v);
        return this.c.isVisible(v1);
    }
}


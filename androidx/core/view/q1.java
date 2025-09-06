package androidx.core.view;

import androidx.annotation.NonNull;
import androidx.core.graphics.Insets;

public final class q1 extends p1 {
    public q1() {
    }

    public q1(@NonNull WindowInsetsCompat windowInsetsCompat0) {
        super(windowInsetsCompat0);
    }

    @Override  // androidx.core.view.r1
    public void d(int v, @NonNull Insets insets0) {
        int v1 = z1.a(v);
        android.graphics.Insets insets1 = insets0.toPlatformInsets();
        this.c.setInsets(v1, insets1);
    }

    @Override  // androidx.core.view.r1
    public void e(int v, @NonNull Insets insets0) {
        int v1 = z1.a(v);
        android.graphics.Insets insets1 = insets0.toPlatformInsets();
        this.c.setInsetsIgnoringVisibility(v1, insets1);
    }

    @Override  // androidx.core.view.r1
    public void k(int v, boolean z) {
        int v1 = z1.a(v);
        this.c.setVisible(v1, z);
    }
}


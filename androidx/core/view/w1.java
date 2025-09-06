package androidx.core.view;

import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;

public class w1 extends u1 {
    public Insets n;
    public Insets o;
    public Insets p;

    public w1(@NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull WindowInsets windowInsets0) {
        super(windowInsetsCompat0, windowInsets0);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public w1(@NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull w1 w10) {
        super(windowInsetsCompat0, w10);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override  // androidx.core.view.y1
    @NonNull
    public Insets i() {
        if(this.o == null) {
            this.o = Insets.toCompatInsets(this.c.getMandatorySystemGestureInsets());
        }
        return this.o;
    }

    @Override  // androidx.core.view.y1
    @NonNull
    public Insets k() {
        if(this.n == null) {
            this.n = Insets.toCompatInsets(this.c.getSystemGestureInsets());
        }
        return this.n;
    }

    @Override  // androidx.core.view.y1
    @NonNull
    public Insets m() {
        if(this.p == null) {
            this.p = Insets.toCompatInsets(this.c.getTappableElementInsets());
        }
        return this.p;
    }

    @Override  // androidx.core.view.s1
    @NonNull
    public WindowInsetsCompat n(int v, int v1, int v2, int v3) {
        return WindowInsetsCompat.toWindowInsetsCompat(this.c.inset(v, v1, v2, v3));
    }

    @Override  // androidx.core.view.t1
    public void u(@Nullable Insets insets0) {
    }
}


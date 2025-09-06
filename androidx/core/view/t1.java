package androidx.core.view;

import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;

public class t1 extends s1 {
    public Insets m;

    public t1(@NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull WindowInsets windowInsets0) {
        super(windowInsetsCompat0, windowInsets0);
        this.m = null;
    }

    public t1(@NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull t1 t10) {
        super(windowInsetsCompat0, t10);
        this.m = t10.m;
    }

    @Override  // androidx.core.view.y1
    @NonNull
    public WindowInsetsCompat b() {
        return WindowInsetsCompat.toWindowInsetsCompat(this.c.consumeStableInsets());
    }

    @Override  // androidx.core.view.y1
    @NonNull
    public WindowInsetsCompat c() {
        return WindowInsetsCompat.toWindowInsetsCompat(this.c.consumeSystemWindowInsets());
    }

    @Override  // androidx.core.view.y1
    @NonNull
    public final Insets j() {
        if(this.m == null) {
            this.m = Insets.of(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
        }
        return this.m;
    }

    @Override  // androidx.core.view.y1
    public boolean o() {
        return this.c.isConsumed();
    }

    @Override  // androidx.core.view.y1
    public void u(@Nullable Insets insets0) {
        this.m = insets0;
    }
}


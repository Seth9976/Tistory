package androidx.core.view;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

public class u1 extends t1 {
    public u1(@NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull WindowInsets windowInsets0) {
        super(windowInsetsCompat0, windowInsets0);
    }

    public u1(@NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull u1 u10) {
        super(windowInsetsCompat0, u10);
    }

    @Override  // androidx.core.view.y1
    @NonNull
    public WindowInsetsCompat a() {
        return WindowInsetsCompat.toWindowInsetsCompat(this.c.consumeDisplayCutout());
    }

    @Override  // androidx.core.view.s1
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof u1 ? Objects.equals(this.c, ((u1)object0).c) && Objects.equals(this.g, ((u1)object0).g) : false;
    }

    @Override  // androidx.core.view.y1
    @Nullable
    public DisplayCutoutCompat f() {
        DisplayCutout displayCutout0 = this.c.getDisplayCutout();
        return displayCutout0 == null ? null : new DisplayCutoutCompat(displayCutout0);
    }

    @Override  // androidx.core.view.y1
    public int hashCode() {
        return this.c.hashCode();
    }
}


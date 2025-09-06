package androidx.core.view;

import android.view.WindowInsets.Builder;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.h1;
import androidx.core.graphics.Insets;
import androidx.webkit.internal.k;

public class p1 extends r1 {
    public final WindowInsets.Builder c;

    public p1() {
        this.c = k.j();
    }

    public p1(@NonNull WindowInsetsCompat windowInsetsCompat0) {
        super(windowInsetsCompat0);
        WindowInsets windowInsets0 = windowInsetsCompat0.toWindowInsets();
        this.c = windowInsets0 == null ? k.j() : h1.e(windowInsets0);
    }

    @Override  // androidx.core.view.r1
    @NonNull
    public WindowInsetsCompat b() {
        this.a();
        WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.toWindowInsetsCompat(k.k(this.c));
        windowInsetsCompat0.a.r(this.b);
        return windowInsetsCompat0;
    }

    @Override  // androidx.core.view.r1
    public void c(@Nullable DisplayCutoutCompat displayCutoutCompat0) {
        this.c.setDisplayCutout((displayCutoutCompat0 == null ? null : displayCutoutCompat0.a));
    }

    @Override  // androidx.core.view.r1
    public void f(@NonNull Insets insets0) {
        android.graphics.Insets insets1 = insets0.toPlatformInsets();
        this.c.setMandatorySystemGestureInsets(insets1);
    }

    @Override  // androidx.core.view.r1
    public void g(@NonNull Insets insets0) {
        android.graphics.Insets insets1 = insets0.toPlatformInsets();
        this.c.setStableInsets(insets1);
    }

    @Override  // androidx.core.view.r1
    public void h(@NonNull Insets insets0) {
        android.graphics.Insets insets1 = insets0.toPlatformInsets();
        this.c.setSystemGestureInsets(insets1);
    }

    @Override  // androidx.core.view.r1
    public void i(@NonNull Insets insets0) {
        android.graphics.Insets insets1 = insets0.toPlatformInsets();
        this.c.setSystemWindowInsets(insets1);
    }

    @Override  // androidx.core.view.r1
    public void j(@NonNull Insets insets0) {
        android.graphics.Insets insets1 = insets0.toPlatformInsets();
        this.c.setTappableElementInsets(insets1);
    }
}


package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class h0 {
    @Nullable
    public static WindowInsetsCompat a(@NonNull View view0) {
        WindowInsets windowInsets0 = view0.getRootWindowInsets();
        if(windowInsets0 == null) {
            return null;
        }
        WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.toWindowInsetsCompat(windowInsets0);
        windowInsetsCompat0.a.t(windowInsetsCompat0);
        View view1 = view0.getRootView();
        windowInsetsCompat0.a.d(view1);
        return windowInsetsCompat0;
    }

    @DoNotInline
    public static int b(@NonNull View view0) {
        return view0.getScrollIndicators();
    }

    @DoNotInline
    public static void c(@NonNull View view0, int v) {
        view0.setScrollIndicators(v);
    }

    @DoNotInline
    public static void d(@NonNull View view0, int v, int v1) {
        view0.setScrollIndicators(v, v1);
    }
}


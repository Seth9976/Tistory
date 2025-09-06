package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.DoNotInline;

public abstract class e0 {
    @DoNotInline
    public static WindowInsets a(View view0, WindowInsets windowInsets0) {
        return view0.dispatchApplyWindowInsets(windowInsets0);
    }

    @DoNotInline
    public static WindowInsets b(View view0, WindowInsets windowInsets0) {
        return view0.onApplyWindowInsets(windowInsets0);
    }

    @DoNotInline
    public static void c(View view0) {
        view0.requestApplyInsets();
    }
}


package androidx.core.view;

import android.view.View;
import android.view.WindowInsetsController;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class n0 {
    @DoNotInline
    public static int a(View view0) {
        return view0.getImportantForContentCapture();
    }

    @DoNotInline
    public static CharSequence b(View view0) {
        return view0.getStateDescription();
    }

    @Nullable
    public static WindowInsetsControllerCompat c(@NonNull View view0) {
        WindowInsetsController windowInsetsController0 = view0.getWindowInsetsController();
        return windowInsetsController0 == null ? null : WindowInsetsControllerCompat.toWindowInsetsControllerCompat(windowInsetsController0);
    }

    @DoNotInline
    public static boolean d(View view0) {
        return view0.isImportantForContentCapture();
    }

    @DoNotInline
    public static void e(View view0, int v) {
        view0.setImportantForContentCapture(v);
    }

    @DoNotInline
    public static void f(View view0, CharSequence charSequence0) {
        view0.setStateDescription(charSequence0);
    }
}


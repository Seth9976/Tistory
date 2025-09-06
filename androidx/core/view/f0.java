package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.WindowInsets;

public final class f0 implements View.OnApplyWindowInsetsListener {
    public WindowInsetsCompat a;
    public final View b;
    public final OnApplyWindowInsetsListener c;

    public f0(View view0, OnApplyWindowInsetsListener onApplyWindowInsetsListener0) {
        this.b = view0;
        this.c = onApplyWindowInsetsListener0;
        super();
        this.a = null;
    }

    @Override  // android.view.View$OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
        WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.toWindowInsetsCompat(windowInsets0, view0);
        int v = Build.VERSION.SDK_INT;
        OnApplyWindowInsetsListener onApplyWindowInsetsListener0 = this.c;
        if(v < 30) {
            g0.a(windowInsets0, this.b);
            if(windowInsetsCompat0.equals(this.a)) {
                return onApplyWindowInsetsListener0.onApplyWindowInsets(view0, windowInsetsCompat0).toWindowInsets();
            }
        }
        this.a = windowInsetsCompat0;
        WindowInsetsCompat windowInsetsCompat1 = onApplyWindowInsetsListener0.onApplyWindowInsets(view0, windowInsetsCompat0);
        if(v >= 30) {
            return windowInsetsCompat1.toWindowInsets();
        }
        ViewCompat.requestApplyInsets(view0);
        return windowInsetsCompat1.toWindowInsets();
    }
}


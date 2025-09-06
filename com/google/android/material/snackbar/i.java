package com.google.android.material.snackbar;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

public final class i implements OnApplyWindowInsetsListener {
    public final BaseTransientBottomBar a;

    public i(BaseTransientBottomBar baseTransientBottomBar0) {
        this.a = baseTransientBottomBar0;
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0) {
        this.a.o = windowInsetsCompat0.getSystemWindowInsetBottom();
        this.a.p = windowInsetsCompat0.getSystemWindowInsetLeft();
        this.a.q = windowInsetsCompat0.getSystemWindowInsetRight();
        this.a.e();
        return windowInsetsCompat0;
    }
}


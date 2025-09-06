package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

public final class y implements OnApplyWindowInsetsListener {
    public final com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener a;
    public final RelativePadding b;

    public y(com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener viewUtils$OnApplyWindowInsetsListener0, RelativePadding viewUtils$RelativePadding0) {
        this.a = viewUtils$OnApplyWindowInsetsListener0;
        this.b = viewUtils$RelativePadding0;
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0) {
        RelativePadding viewUtils$RelativePadding0 = new RelativePadding(this.b);
        return this.a.onApplyWindowInsets(view0, windowInsetsCompat0, viewUtils$RelativePadding0);
    }
}


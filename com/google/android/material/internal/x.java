package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;

public final class x implements OnApplyWindowInsetsListener {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final OnApplyWindowInsetsListener d;

    public x(boolean z, boolean z1, boolean z2, OnApplyWindowInsetsListener viewUtils$OnApplyWindowInsetsListener0) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = viewUtils$OnApplyWindowInsetsListener0;
    }

    @Override  // com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0, RelativePadding viewUtils$RelativePadding0) {
        if(this.a) {
            int v = viewUtils$RelativePadding0.bottom;
            viewUtils$RelativePadding0.bottom = windowInsetsCompat0.getSystemWindowInsetBottom() + v;
        }
        boolean z = ViewUtils.isLayoutRtl(view0);
        if(this.b) {
            if(z) {
                int v1 = viewUtils$RelativePadding0.end;
                viewUtils$RelativePadding0.end = windowInsetsCompat0.getSystemWindowInsetLeft() + v1;
            }
            else {
                int v2 = viewUtils$RelativePadding0.start;
                viewUtils$RelativePadding0.start = windowInsetsCompat0.getSystemWindowInsetLeft() + v2;
            }
        }
        if(this.c) {
            if(z) {
                int v3 = viewUtils$RelativePadding0.start;
                viewUtils$RelativePadding0.start = windowInsetsCompat0.getSystemWindowInsetRight() + v3;
            }
            else {
                int v4 = viewUtils$RelativePadding0.end;
                viewUtils$RelativePadding0.end = windowInsetsCompat0.getSystemWindowInsetRight() + v4;
            }
        }
        viewUtils$RelativePadding0.applyToView(view0);
        return this.d == null ? windowInsetsCompat0 : this.d.onApplyWindowInsets(view0, windowInsetsCompat0, viewUtils$RelativePadding0);
    }
}


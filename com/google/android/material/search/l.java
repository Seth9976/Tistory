package com.google.android.material.search;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.ViewUtils.RelativePadding;
import com.google.android.material.internal.ViewUtils;

public final class l implements OnApplyWindowInsetsListener, com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener {
    public final SearchView a;

    public l(SearchView searchView0) {
        this.a = searchView0;
        super();
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0) {
        SearchView.a(this.a, windowInsetsCompat0);
        return windowInsetsCompat0;
    }

    @Override  // com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0, RelativePadding viewUtils$RelativePadding0) {
        boolean z = ViewUtils.isLayoutRtl(this.a.g);
        int v = z ? viewUtils$RelativePadding0.end : viewUtils$RelativePadding0.start;
        int v1 = z ? viewUtils$RelativePadding0.start : viewUtils$RelativePadding0.end;
        this.a.g.setPadding(windowInsetsCompat0.getSystemWindowInsetLeft() + v, viewUtils$RelativePadding0.top, windowInsetsCompat0.getSystemWindowInsetRight() + v1, viewUtils$RelativePadding0.bottom);
        return windowInsetsCompat0;
    }
}


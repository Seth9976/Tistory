package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

public final class b implements OnApplyWindowInsetsListener {
    public final BottomSheetDialog a;

    public b(BottomSheetDialog bottomSheetDialog0) {
        this.a = bottomSheetDialog0;
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0) {
        BottomSheetDialog bottomSheetDialog0 = this.a;
        d d0 = bottomSheetDialog0.n;
        if(d0 != null) {
            bottomSheetDialog0.f.removeBottomSheetCallback(d0);
        }
        if(windowInsetsCompat0 != null) {
            d d1 = new d(bottomSheetDialog0.i, windowInsetsCompat0);
            bottomSheetDialog0.n = d1;
            d1.c(bottomSheetDialog0.getWindow());
            bottomSheetDialog0.f.addBottomSheetCallback(bottomSheetDialog0.n);
        }
        return windowInsetsCompat0;
    }
}


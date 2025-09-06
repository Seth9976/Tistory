package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

public final class w implements OnApplyWindowInsetsListener {
    public final int a;
    public final View b;
    public final int c;

    public w(int v, View view0, int v1) {
        this.a = v;
        this.b = view0;
        this.c = v1;
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0) {
        int v = windowInsetsCompat0.getInsets(7).top;
        View view1 = this.b;
        int v1 = this.a;
        if(v1 >= 0) {
            view1.getLayoutParams().height = v1 + v;
            view1.setLayoutParams(view1.getLayoutParams());
        }
        int v2 = view1.getPaddingLeft();
        int v3 = view1.getPaddingRight();
        int v4 = view1.getPaddingBottom();
        view1.setPadding(v2, this.c + v, v3, v4);
        return windowInsetsCompat0;
    }
}


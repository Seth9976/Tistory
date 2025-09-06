package com.google.android.material.datepicker;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearSmoothScroller;

public final class f0 extends LinearSmoothScroller {
    @Override  // androidx.recyclerview.widget.LinearSmoothScroller
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics0) {
        return 100.0f / ((float)displayMetrics0.densityDpi);
    }
}


package com.google.android.material.carousel;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;

public final class h extends LinearSmoothScroller {
    public final LayoutManager l;
    public final CarouselSnapHelper m;

    public h(CarouselSnapHelper carouselSnapHelper0, Context context0, LayoutManager recyclerView$LayoutManager0) {
        this.m = carouselSnapHelper0;
        this.l = recyclerView$LayoutManager0;
        super(context0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.LinearSmoothScroller
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics0) {
        return this.l.canScrollVertically() ? 50.0f / ((float)displayMetrics0.densityDpi) : 100.0f / ((float)displayMetrics0.densityDpi);
    }

    @Override  // androidx.recyclerview.widget.LinearSmoothScroller
    public final void onTargetFound(View view0, State recyclerView$State0, Action recyclerView$SmoothScroller$Action0) {
        RecyclerView recyclerView0 = this.m.e;
        if(recyclerView0 != null) {
            int[] arr_v = CarouselSnapHelper.b(recyclerView0.getLayoutManager(), view0, true);
            int v = arr_v[0];
            int v1 = arr_v[1];
            int v2 = this.calculateTimeForDeceleration(Math.max(Math.abs(v), Math.abs(v1)));
            if(v2 > 0) {
                recyclerView$SmoothScroller$Action0.update(v, v1, v2, this.mDecelerateInterpolator);
            }
        }
    }
}


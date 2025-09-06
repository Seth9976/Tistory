package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;

public final class b extends LinearSmoothScroller {
    public final CarouselLayoutManager l;

    public b(CarouselLayoutManager carouselLayoutManager0, Context context0) {
        this.l = carouselLayoutManager0;
        super(context0);
    }

    @Override  // androidx.recyclerview.widget.LinearSmoothScroller
    public final int calculateDxToMakeVisible(View view0, int v) {
        CarouselLayoutManager carouselLayoutManager0 = this.l;
        if(carouselLayoutManager0.g != null && carouselLayoutManager0.isHorizontal()) {
            int v1 = carouselLayoutManager0.getPosition(view0);
            float f = (float)carouselLayoutManager0.o(v1, carouselLayoutManager0.m(v1));
            return (int)(((float)carouselLayoutManager0.a) - f);
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.LinearSmoothScroller
    public final int calculateDyToMakeVisible(View view0, int v) {
        CarouselLayoutManager carouselLayoutManager0 = this.l;
        if(carouselLayoutManager0.g != null && !carouselLayoutManager0.isHorizontal()) {
            int v1 = carouselLayoutManager0.getPosition(view0);
            float f = (float)carouselLayoutManager0.o(v1, carouselLayoutManager0.m(v1));
            return (int)(((float)carouselLayoutManager0.a) - f);
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller
    public final PointF computeScrollVectorForPosition(int v) {
        return this.l.computeScrollVectorForPosition(v);
    }
}


package com.google.android.material.carousel;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;

public class FullScreenCarouselStrategy extends CarouselStrategy {
    @Override  // com.google.android.material.carousel.CarouselStrategy
    public final l c(CarouselLayoutManager carouselLayoutManager0, View view0) {
        int v1;
        int v;
        float f;
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(carouselLayoutManager0.isHorizontal()) {
            f = (float)carouselLayoutManager0.getContainerWidth();
            v = recyclerView$LayoutParams0.leftMargin;
            v1 = recyclerView$LayoutParams0.rightMargin;
        }
        else {
            f = (float)carouselLayoutManager0.getContainerHeight();
            v = recyclerView$LayoutParams0.topMargin;
            v1 = recyclerView$LayoutParams0.bottomMargin;
        }
        float f1 = (float)(v + v1);
        a a0 = new a(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, Math.min(f + f1, f), 1, f);
        return i.d(view0.getContext(), f1, f, a0);
    }
}


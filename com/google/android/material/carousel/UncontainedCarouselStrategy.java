package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import com.google.android.material.R.dimen;

public final class UncontainedCarouselStrategy extends CarouselStrategy {
    @Override  // com.google.android.material.carousel.CarouselStrategy
    public final l c(CarouselLayoutManager carouselLayoutManager0, View view0) {
        int v = carouselLayoutManager0.isHorizontal() ? carouselLayoutManager0.getContainerWidth() : carouselLayoutManager0.getContainerHeight();
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        float f = (float)(recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin);
        float f1 = (float)view0.getMeasuredHeight();
        if(carouselLayoutManager0.isHorizontal()) {
            f = (float)(recyclerView$LayoutParams0.leftMargin + recyclerView$LayoutParams0.rightMargin);
            f1 = (float)view0.getMeasuredWidth();
        }
        float f2 = f1 + f;
        float f3 = view0.getContext().getResources().getDimension(dimen.m3_carousel_gone_size);
        float f4 = view0.getContext().getResources().getDimension(dimen.m3_carousel_gone_size) + f;
        int v1 = 1;
        int v2 = Math.max(1, ((int)Math.floor(((float)v) / f2)));
        float f5 = ((float)v2) * f2;
        float f6 = ((float)v) - f5;
        if(carouselLayoutManager0.getCarouselAlignment() == 1) {
            float f7 = Math.max(Math.min(3.0f * (f6 / 2.0f), f2), view0.getContext().getResources().getDimension(dimen.m3_carousel_small_item_size_min) + f);
            float f8 = Math.min(f4, f2);
            float f9 = 1.0f - (f8 - f) / (f2 - f);
            float f10 = 1.0f - (f7 - f) / (f2 - f);
            float f11 = f6 / 2.0f + 0.0f - f7 / 2.0f;
            float f12 = f11 + f7 / 2.0f;
            float f13 = f5 + f12;
            j j0 = new j(f2, ((float)v));
            j0.a(f11 - f7 / 2.0f - f8 / 2.0f, f9, f8, false, true);
            j0.a(f11, f10, f7, false, false);
            j0.c(f2 / 2.0f + f12, 0.0f, f2, v2, true);
            j0.a(f13 + f7 / 2.0f, f10, f7, false, false);
            j0.a(f13 + f7 + f8 / 2.0f, f9, f8, false, true);
            return j0.d();
        }
        if(f6 <= 0.0f) {
            v1 = 0;
        }
        float f14 = Math.min(f2, (Math.max(1.5f * f6, f3 + f) > 0.85f * f2 ? Math.max(0.85f * f2, f6 * 1.2f) : Math.max(1.5f * f6, f3 + f)));
        Context context0 = view0.getContext();
        float f15 = Math.min(f4, f2);
        float f16 = Math.max(f15, 0.5f * f14);
        float f17 = f5 + 0.0f;
        j j1 = new j(f2, ((float)v));
        j1.a(0.0f - f16 / 2.0f, 1.0f - (f16 - f) / (f2 - f), f16, false, true);
        j1.c(f2 / 2.0f, 0.0f, f2, v2, true);
        if(v1 > 0) {
            float f18 = f14 / 2.0f + f17;
            f17 += f14;
            j1.a(f18, 1.0f - (f14 - f) / (f2 - f), f14, false, false);
        }
        j1.a(context0.getResources().getDimension(dimen.m3_carousel_gone_size) / 2.0f + f17, 1.0f - (f15 - f) / (f2 - f), f15, false, true);
        return j1.d();
    }
}


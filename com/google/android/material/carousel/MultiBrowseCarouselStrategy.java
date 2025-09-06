package com.google.android.material.carousel;

import a5.b;
import android.view.View;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import com.google.android.material.R.dimen;

public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    public int a;
    public static final int[] b;
    public static final int[] c;

    static {
        MultiBrowseCarouselStrategy.b = new int[]{1};
        MultiBrowseCarouselStrategy.c = new int[]{1, 0};
    }

    public MultiBrowseCarouselStrategy() {
        this.a = 0;
    }

    @Override  // com.google.android.material.carousel.CarouselStrategy
    public final l c(CarouselLayoutManager carouselLayoutManager0, View view0) {
        float f = (float)carouselLayoutManager0.getContainerHeight();
        if(carouselLayoutManager0.isHorizontal()) {
            f = (float)carouselLayoutManager0.getContainerWidth();
        }
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        float f1 = (float)(recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin);
        float f2 = (float)view0.getMeasuredHeight();
        if(carouselLayoutManager0.isHorizontal()) {
            f1 = (float)(recyclerView$LayoutParams0.leftMargin + recyclerView$LayoutParams0.rightMargin);
            f2 = (float)view0.getMeasuredWidth();
        }
        float f3 = view0.getContext().getResources().getDimension(dimen.m3_carousel_small_item_size_min) + f1;
        float f4 = view0.getContext().getResources().getDimension(dimen.m3_carousel_small_item_size_max) + f1;
        float f5 = Math.min(f2 + f1, f);
        float f6 = MathUtils.clamp(f2 / 3.0f + f1, view0.getContext().getResources().getDimension(dimen.m3_carousel_small_item_size_min) + f1, view0.getContext().getResources().getDimension(dimen.m3_carousel_small_item_size_max) + f1);
        float f7 = (f5 + f6) / 2.0f;
        int[] arr_v = MultiBrowseCarouselStrategy.b;
        boolean z = false;
        if(Float.compare(f, 2.0f * f3) < 0) {
            arr_v = new int[]{0};
        }
        int[] arr_v1 = MultiBrowseCarouselStrategy.c;
        if(carouselLayoutManager0.getCarouselAlignment() == 1) {
            arr_v = CarouselStrategy.a(arr_v);
            arr_v1 = CarouselStrategy.a(arr_v1);
        }
        double f8 = Math.floor(b.a(f4, i.e(arr_v), f - ((float)i.e(arr_v1)) * f7, f5));
        int v = (int)Math.ceil(f / f5);
        int v1 = v - ((int)Math.max(1.0, f8)) + 1;
        int[] arr_v2 = new int[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_v2[v2] = v - v2;
        }
        a a0 = a.a(f, f6, f3, f4, arr_v, f7, arr_v1, f5, arr_v2);
        int v3 = a0.g;
        this.a = a0.c + a0.d + v3;
        int v4 = carouselLayoutManager0.getItemCount();
        int v5 = a0.c + a0.d + v3 - v4;
        if(v5 > 0 && (a0.c > 0 || a0.d > 1)) {
            z = true;
        }
        while(v5 > 0) {
            int v6 = a0.c;
            if(v6 > 0) {
                a0.c = v6 - 1;
            }
            else {
                int v7 = a0.d;
                if(v7 > 1) {
                    a0.d = v7 - 1;
                }
            }
            --v5;
        }
        if(z) {
            a0 = a.a(f, f6, f3, f4, new int[]{a0.c}, f7, new int[]{a0.d}, f5, new int[]{v3});
        }
        return i.c(view0.getContext(), f1, f, a0, carouselLayoutManager0.getCarouselAlignment());
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.carousel.CarouselStrategy
    public final boolean d(CarouselLayoutManager carouselLayoutManager0, int v) {
        return v < this.a && carouselLayoutManager0.getItemCount() >= this.a || v >= this.a && carouselLayoutManager0.getItemCount() < this.a;
    }
}


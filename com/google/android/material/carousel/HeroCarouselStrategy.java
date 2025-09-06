package com.google.android.material.carousel;

import android.view.View;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import com.google.android.material.R.dimen;

public class HeroCarouselStrategy extends CarouselStrategy {
    public int a;
    public static final int[] b;
    public static final int[] c;

    static {
        HeroCarouselStrategy.b = new int[]{1};
        HeroCarouselStrategy.c = new int[]{0, 1};
    }

    public HeroCarouselStrategy() {
        this.a = 0;
    }

    @Override  // com.google.android.material.carousel.CarouselStrategy
    public final l c(CarouselLayoutManager carouselLayoutManager0, View view0) {
        int v = carouselLayoutManager0.getContainerHeight();
        if(carouselLayoutManager0.isHorizontal()) {
            v = carouselLayoutManager0.getContainerWidth();
        }
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        float f = (float)(recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin);
        float f1 = (float)(view0.getMeasuredWidth() * 2);
        if(carouselLayoutManager0.isHorizontal()) {
            f = (float)(recyclerView$LayoutParams0.leftMargin + recyclerView$LayoutParams0.rightMargin);
            f1 = (float)(view0.getMeasuredHeight() * 2);
        }
        float f2 = view0.getContext().getResources().getDimension(dimen.m3_carousel_small_item_size_min) + f;
        float f3 = view0.getContext().getResources().getDimension(dimen.m3_carousel_small_item_size_max) + f;
        float f4 = Math.min(f1 + f, v);
        float f5 = MathUtils.clamp(f1 / 3.0f + f, view0.getContext().getResources().getDimension(dimen.m3_carousel_small_item_size_min) + f, view0.getContext().getResources().getDimension(dimen.m3_carousel_small_item_size_max) + f);
        float f6 = (f4 + f5) / 2.0f;
        int[] arr_v = Float.compare(v, 2.0f * f2) >= 0 ? HeroCarouselStrategy.b : new int[]{0};
        int v1 = (int)Math.max(1.0, Math.floor((((float)v) - f3 * 1.0f) / f4));
        int v2 = ((int)Math.ceil(((float)v) / f4)) - v1 + 1;
        int[] arr_v1 = new int[v2];
        for(int v3 = 0; v3 < v2; ++v3) {
            arr_v1[v3] = v1 + v3;
        }
        int v4 = carouselLayoutManager0.getCarouselAlignment() == 1 ? 1 : 0;
        int[] arr_v2 = v4 == 0 ? arr_v : CarouselStrategy.a(arr_v);
        int[] arr_v3 = HeroCarouselStrategy.c;
        a a0 = a.a(v, f5, f2, f3, arr_v2, f6, (v4 == 0 ? arr_v3 : CarouselStrategy.a(arr_v3)), f4, arr_v1);
        this.a = a0.c + a0.d + a0.g;
        if(a0.c + a0.d + a0.g > carouselLayoutManager0.getItemCount()) {
            a0 = a.a(v, f5, f2, f3, arr_v, f6, arr_v3, f4, arr_v1);
            return i.c(view0.getContext(), f, ((float)v), a0, 0);
        }
        return i.c(view0.getContext(), f, ((float)v), a0, v4);
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.material.carousel.CarouselStrategy
    public final boolean d(CarouselLayoutManager carouselLayoutManager0, int v) {
        return carouselLayoutManager0.getCarouselAlignment() == 1 && (v < this.a && carouselLayoutManager0.getItemCount() >= this.a || v >= this.a && carouselLayoutManager0.getItemCount() < this.a);
    }
}


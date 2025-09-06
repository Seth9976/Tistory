package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;

public final class e extends g {
    public final CarouselLayoutManager b;

    public e(CarouselLayoutManager carouselLayoutManager0) {
        this.b = carouselLayoutManager0;
        super(1);
    }

    @Override  // com.google.android.material.carousel.g
    public final void a(RectF rectF0, RectF rectF1, RectF rectF2) {
        float f = rectF1.top;
        float f1 = rectF2.top;
        if(f < f1 && rectF1.bottom > f1) {
            float f2 = f1 - f;
            rectF0.top += f2;
            rectF2.top += f2;
        }
        float f3 = rectF1.bottom;
        float f4 = rectF2.bottom;
        if(f3 > f4 && rectF1.top < f4) {
            float f5 = f3 - f4;
            rectF0.bottom = Math.max(rectF0.bottom - f5, rectF0.top);
            rectF1.bottom = Math.max(rectF1.bottom - f5, rectF1.top);
        }
    }

    @Override  // com.google.android.material.carousel.g
    public final float b(LayoutParams recyclerView$LayoutParams0) {
        return (float)(recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin);
    }

    @Override  // com.google.android.material.carousel.g
    public final RectF c(float f, float f1, float f2, float f3) {
        return new RectF(0.0f, f2, f1, f - f2);
    }

    @Override  // com.google.android.material.carousel.g
    public final int d() {
        return this.b.getHeight();
    }

    @Override  // com.google.android.material.carousel.g
    public final int e() {
        return this.b.getHeight();
    }

    @Override  // com.google.android.material.carousel.g
    public final int f() {
        return this.b.getPaddingLeft();
    }

    @Override  // com.google.android.material.carousel.g
    public final int g() {
        int v = this.b.getPaddingRight();
        return this.b.getWidth() - v;
    }

    @Override  // com.google.android.material.carousel.g
    public final int h() {
        return 0;
    }

    @Override  // com.google.android.material.carousel.g
    public final int i() {
        return 0;
    }

    @Override  // com.google.android.material.carousel.g
    public final void j(int v, View view0, int v1) {
        int v2 = this.b.getPaddingLeft();
        int v3 = this.g();
        this.b.layoutDecoratedWithMargins(view0, v2, v, v3, v1);
    }

    @Override  // com.google.android.material.carousel.g
    public final void k(RectF rectF0, RectF rectF1, RectF rectF2) {
        if(Float.compare(rectF1.bottom, rectF2.top) <= 0) {
            float f = ((float)Math.floor(rectF0.bottom)) - 1.0f;
            rectF0.bottom = f;
            rectF0.top = Math.min(rectF0.top, f);
        }
        if(rectF1.top >= rectF2.bottom) {
            float f1 = ((float)Math.ceil(rectF0.top)) + 1.0f;
            rectF0.top = f1;
            rectF0.bottom = Math.max(f1, rectF0.bottom);
        }
    }

    @Override  // com.google.android.material.carousel.g
    public final void l(View view0, Rect rect0, float f, float f1) {
        view0.offsetTopAndBottom(((int)(f1 - (((float)rect0.top) + f))));
    }
}


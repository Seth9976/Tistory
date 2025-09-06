package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;

public final class f extends g {
    public final CarouselLayoutManager b;

    public f(CarouselLayoutManager carouselLayoutManager0) {
        this.b = carouselLayoutManager0;
        super(0);
    }

    @Override  // com.google.android.material.carousel.g
    public final void a(RectF rectF0, RectF rectF1, RectF rectF2) {
        float f = rectF1.left;
        float f1 = rectF2.left;
        if(f < f1 && rectF1.right > f1) {
            float f2 = f1 - f;
            rectF0.left += f2;
            rectF1.left += f2;
        }
        float f3 = rectF1.right;
        float f4 = rectF2.right;
        if(f3 > f4 && rectF1.left < f4) {
            float f5 = f3 - f4;
            rectF0.right = Math.max(rectF0.right - f5, rectF0.left);
            rectF1.right = Math.max(rectF1.right - f5, rectF1.left);
        }
    }

    @Override  // com.google.android.material.carousel.g
    public final float b(LayoutParams recyclerView$LayoutParams0) {
        return (float)(recyclerView$LayoutParams0.rightMargin + recyclerView$LayoutParams0.leftMargin);
    }

    @Override  // com.google.android.material.carousel.g
    public final RectF c(float f, float f1, float f2, float f3) {
        return new RectF(f3, 0.0f, f1 - f3, f);
    }

    @Override  // com.google.android.material.carousel.g
    public final int d() {
        int v = this.b.getPaddingBottom();
        return this.b.getHeight() - v;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.carousel.g
    public final int e() {
        return this.b.r() ? 0 : this.b.getWidth();
    }

    @Override  // com.google.android.material.carousel.g
    public final int f() {
        return 0;
    }

    @Override  // com.google.android.material.carousel.g
    public final int g() {
        return this.b.getWidth();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.carousel.g
    public final int h() {
        return this.b.r() ? this.b.getWidth() : 0;
    }

    @Override  // com.google.android.material.carousel.g
    public final int i() {
        return this.b.getPaddingTop();
    }

    @Override  // com.google.android.material.carousel.g
    public final void j(int v, View view0, int v1) {
        int v2 = this.b.getPaddingTop();
        int v3 = this.d();
        this.b.layoutDecoratedWithMargins(view0, v, v2, v1, v3);
    }

    @Override  // com.google.android.material.carousel.g
    public final void k(RectF rectF0, RectF rectF1, RectF rectF2) {
        if(Float.compare(rectF1.right, rectF2.left) <= 0) {
            float f = ((float)Math.floor(rectF0.right)) - 1.0f;
            rectF0.right = f;
            rectF0.left = Math.min(rectF0.left, f);
        }
        if(rectF1.left >= rectF2.right) {
            float f1 = ((float)Math.ceil(rectF0.left)) + 1.0f;
            rectF0.left = f1;
            rectF0.right = Math.max(f1, rectF0.right);
        }
    }

    @Override  // com.google.android.material.carousel.g
    public final void l(View view0, Rect rect0, float f, float f1) {
        view0.offsetLeftAndRight(((int)(f1 - (((float)rect0.left) + f))));
    }
}


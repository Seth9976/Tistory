package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.FillType;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.content.ContextCompat;
import com.google.android.material.R.color;

@Deprecated
public class ShadowDrawableWrapper extends DrawableWrapperCompat {
    public final Paint b;
    public final Paint c;
    public final RectF d;
    public float e;
    public Path f;
    public float g;
    public float h;
    public float i;
    public boolean j;
    public final int k;
    public final int l;
    public final int m;
    public boolean n;
    public float o;
    public boolean p;
    public static final double q;

    static {
        ShadowDrawableWrapper.q = 0.707107;
    }

    public ShadowDrawableWrapper(Context context0, Drawable drawable0, float f, float f1, float f2) {
        super(drawable0);
        this.j = true;
        this.n = true;
        this.p = false;
        this.k = ContextCompat.getColor(context0, color.design_fab_shadow_start_color);
        this.l = ContextCompat.getColor(context0, color.design_fab_shadow_mid_color);
        this.m = ContextCompat.getColor(context0, color.design_fab_shadow_end_color);
        Paint paint0 = new Paint(5);
        this.b = paint0;
        paint0.setStyle(Paint.Style.FILL);
        this.e = (float)Math.round(f);
        this.d = new RectF();
        Paint paint1 = new Paint(paint0);
        this.c = paint1;
        paint1.setAntiAlias(false);
        this.setShadowSize(f1, f2);
    }

    // 去混淆评级： 低(20)
    public static float calculateHorizontalPadding(float f, float f1, boolean z) {
        return z ? ((float)((1.0 - ShadowDrawableWrapper.q) * ((double)f1) + ((double)f))) : f;
    }

    // 去混淆评级： 低(20)
    public static float calculateVerticalPadding(float f, float f1, boolean z) {
        return z ? ((float)((1.0 - ShadowDrawableWrapper.q) * ((double)f1) + ((double)(f * 1.5f)))) : f * 1.5f;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public void draw(@NonNull Canvas canvas0) {
        int v8;
        float f15;
        float f14;
        int v6;
        float f13;
        int v5;
        float f12;
        float f11;
        Paint paint0 = this.c;
        Paint paint1 = this.b;
        RectF rectF0 = this.d;
        boolean z = false;
        if(this.j) {
            Rect rect0 = this.getBounds();
            rectF0.set(((float)rect0.left) + this.g, ((float)rect0.top) + 1.5f * this.g, ((float)rect0.right) - this.g, ((float)rect0.bottom) - 1.5f * this.g);
            this.getDrawable().setBounds(((int)rectF0.left), ((int)rectF0.top), ((int)rectF0.right), ((int)rectF0.bottom));
            float f = -this.e;
            RectF rectF1 = new RectF(f, f, this.e, this.e);
            RectF rectF2 = new RectF(rectF1);
            float f1 = -this.h;
            rectF2.inset(f1, f1);
            Path path0 = this.f;
            if(path0 == null) {
                this.f = new Path();
            }
            else {
                path0.reset();
            }
            this.f.setFillType(Path.FillType.EVEN_ODD);
            this.f.moveTo(-this.e, 0.0f);
            this.f.rLineTo(-this.h, 0.0f);
            this.f.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f.arcTo(rectF1, 270.0f, -90.0f, false);
            this.f.close();
            float f2 = -rectF2.top;
            int v = this.m;
            int v1 = this.l;
            int v2 = this.k;
            if(Float.compare(f2, 0.0f) > 0) {
                float f3 = this.e / f2;
                paint1.setShader(new RadialGradient(0.0f, 0.0f, f2, new int[]{0, v2, v1, v}, new float[]{0.0f, f3, (1.0f - f3) / 2.0f + f3, 1.0f}, Shader.TileMode.CLAMP));
            }
            paint0.setShader(new LinearGradient(0.0f, rectF1.top, 0.0f, rectF2.top, new int[]{v2, v1, v}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            paint0.setAntiAlias(false);
            this.j = false;
        }
        int v3 = canvas0.save();
        canvas0.rotate(this.o, rectF0.centerX(), rectF0.centerY());
        float f4 = this.e;
        float f5 = -f4 - this.h;
        boolean z1 = rectF0.width() - f4 * 2.0f > 0.0f;
        if(rectF0.height() - f4 * 2.0f > 0.0f) {
            z = true;
        }
        float f6 = this.i - 0.25f * this.i;
        float f7 = this.i - this.i * 1.0f;
        float f8 = f4 / (this.i - this.i * 0.5f + f4);
        float f9 = f4 / (f6 + f4);
        float f10 = f4 / (f7 + f4);
        int v4 = canvas0.save();
        canvas0.translate(rectF0.left + f4, rectF0.top + f4);
        canvas0.scale(f8, f9);
        canvas0.drawPath(this.f, paint1);
        if(z1) {
            canvas0.scale(1.0f / f8, 1.0f);
            f11 = f10;
            f12 = f9;
            v5 = v3;
            f13 = f8;
            canvas0.drawRect(0.0f, f5, rectF0.width() - f4 * 2.0f, -this.e, paint0);
        }
        else {
            f11 = f10;
            f12 = f9;
            v5 = v3;
            f13 = f8;
        }
        v6 = v4;
        canvas0.restoreToCount(v6);
        int v7 = canvas0.save();
        canvas0.translate(rectF0.right - f4, rectF0.bottom - f4);
        canvas0.scale(f13, f11);
        canvas0.rotate(180.0f);
        canvas0.drawPath(this.f, paint1);
        if(z1) {
            canvas0.scale(1.0f / f13, 1.0f);
            f14 = f11;
            f15 = f5;
            v8 = v7;
            canvas0.drawRect(0.0f, f5, rectF0.width() - f4 * 2.0f, this.h - this.e, paint0);
        }
        else {
            f14 = f11;
            f15 = f5;
            v8 = v7;
        }
        canvas0.restoreToCount(v8);
        int v9 = canvas0.save();
        canvas0.translate(rectF0.left + f4, rectF0.bottom - f4);
        canvas0.scale(f13, f14);
        canvas0.rotate(270.0f);
        canvas0.drawPath(this.f, paint1);
        if(z) {
            canvas0.scale(1.0f / f14, 1.0f);
            canvas0.drawRect(0.0f, f15, rectF0.height() - f4 * 2.0f, -this.e, paint0);
        }
        canvas0.restoreToCount(v9);
        int v10 = canvas0.save();
        canvas0.translate(rectF0.right - f4, rectF0.top + f4);
        canvas0.scale(f13, f12);
        canvas0.rotate(90.0f);
        canvas0.drawPath(this.f, paint1);
        if(z) {
            canvas0.scale(1.0f / f12, 1.0f);
            canvas0.drawRect(0.0f, f15, rectF0.height() - f4 * 2.0f, -this.e, paint0);
        }
        canvas0.restoreToCount(v10);
        canvas0.restoreToCount(v5);
        super.draw(canvas0);
    }

    public float getCornerRadius() {
        return this.e;
    }

    public float getMaxShadowSize() {
        return this.g;
    }

    public float getMinHeight() {
        return this.g * 3.0f + Math.max(this.g, this.g * 1.5f / 2.0f + this.e) * 2.0f;
    }

    public float getMinWidth() {
        return this.g * 2.0f + Math.max(this.g, this.g / 2.0f + this.e) * 2.0f;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public int getOpacity() {
        return -3;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public boolean getPadding(@NonNull Rect rect0) {
        int v = (int)Math.ceil(ShadowDrawableWrapper.calculateVerticalPadding(this.g, this.e, this.n));
        int v1 = (int)Math.ceil(ShadowDrawableWrapper.calculateHorizontalPadding(this.g, this.e, this.n));
        rect0.set(v1, v, v1, v);
        return true;
    }

    public float getShadowSize() {
        return this.i;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public void onBoundsChange(Rect rect0) {
        this.j = true;
    }

    public void setAddPaddingForCorners(boolean z) {
        this.n = z;
        this.invalidateSelf();
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public void setAlpha(int v) {
        super.setAlpha(v);
        this.b.setAlpha(v);
        this.c.setAlpha(v);
    }

    public void setCornerRadius(float f) {
        float f1 = (float)Math.round(f);
        if(this.e == f1) {
            return;
        }
        this.e = f1;
        this.j = true;
        this.invalidateSelf();
    }

    public void setMaxShadowSize(float f) {
        this.setShadowSize(this.i, f);
    }

    public final void setRotation(float f) {
        if(this.o != f) {
            this.o = f;
            this.invalidateSelf();
        }
    }

    public void setShadowSize(float f) {
        this.setShadowSize(f, this.g);
    }

    public void setShadowSize(float f, float f1) {
        if(f < 0.0f || f1 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        int v = Math.round(f);
        float f2 = (float)(v % 2 == 1 ? v - 1 : Math.round(f));
        int v1 = Math.round(f1);
        v1 = v1 % 2 == 1 ? v1 - 1 : Math.round(f1);
        if(f2 > ((float)v1)) {
            if(!this.p) {
                this.p = true;
            }
            f2 = (float)v1;
        }
        if(this.i == f2 && this.g == ((float)v1)) {
            return;
        }
        this.i = f2;
        this.g = (float)v1;
        this.h = (float)Math.round(f2 * 1.5f);
        this.j = true;
        this.invalidateSelf();
    }
}


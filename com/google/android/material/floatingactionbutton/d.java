package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

public final class d extends Drawable {
    public final ShapeAppearancePathProvider a;
    public final Paint b;
    public final Path c;
    public final Rect d;
    public final RectF e;
    public final RectF f;
    public final c g;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public ShapeAppearanceModel o;
    public ColorStateList p;

    public d(ShapeAppearanceModel shapeAppearanceModel0) {
        this.a = ShapeAppearancePathProvider.getInstance();
        this.c = new Path();
        this.d = new Rect();
        this.e = new RectF();
        this.f = new RectF();
        this.g = new c(this);
        this.n = true;
        this.o = shapeAppearanceModel0;
        Paint paint0 = new Paint(1);
        this.b = paint0;
        paint0.setStyle(Paint.Style.STROKE);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        Paint paint0 = this.b;
        Rect rect0 = this.d;
        if(this.n) {
            this.copyBounds(rect0);
            float f = this.h / ((float)rect0.height());
            int[] arr_v = {ColorUtils.compositeColors(this.i, this.m), ColorUtils.compositeColors(this.j, this.m), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.j, 0), this.m), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.l, 0), this.m), ColorUtils.compositeColors(this.l, this.m), ColorUtils.compositeColors(this.k, this.m)};
            paint0.setShader(new LinearGradient(0.0f, ((float)rect0.top), 0.0f, ((float)rect0.bottom), arr_v, new float[]{0.0f, f, 0.5f, 0.5f, 1.0f - f, 1.0f}, Shader.TileMode.CLAMP));
            this.n = false;
        }
        float f1 = paint0.getStrokeWidth();
        this.copyBounds(rect0);
        RectF rectF0 = this.e;
        rectF0.set(rect0);
        CornerSize cornerSize0 = this.o.getTopLeftCornerSize();
        Rect rect1 = this.getBounds();
        this.f.set(rect1);
        float f2 = Math.min(cornerSize0.getCornerSize(this.f), rectF0.width() / 2.0f);
        ShapeAppearanceModel shapeAppearanceModel0 = this.o;
        Rect rect2 = this.getBounds();
        this.f.set(rect2);
        if(shapeAppearanceModel0.isRoundRect(this.f)) {
            rectF0.inset(f1 / 2.0f, f1 / 2.0f);
            canvas0.drawRoundRect(rectF0, f2, f2, paint0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.h > 0.0f ? -3 : -2;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline0) {
        ShapeAppearanceModel shapeAppearanceModel0 = this.o;
        RectF rectF0 = this.f;
        rectF0.set(this.getBounds());
        if(shapeAppearanceModel0.isRoundRect(rectF0)) {
            CornerSize cornerSize0 = this.o.getTopLeftCornerSize();
            rectF0.set(this.getBounds());
            float f = cornerSize0.getCornerSize(rectF0);
            outline0.setRoundRect(this.getBounds(), f);
            return;
        }
        this.copyBounds(this.d);
        this.e.set(this.d);
        this.a.calculatePath(this.o, 1.0f, this.e, this.c);
        DrawableUtils.setOutlineToPath(outline0, this.c);
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect0) {
        ShapeAppearanceModel shapeAppearanceModel0 = this.o;
        Rect rect1 = this.getBounds();
        this.f.set(rect1);
        if(shapeAppearanceModel0.isRoundRect(this.f)) {
            int v = Math.round(this.h);
            rect0.set(v, v, v, v);
        }
        return true;
    }

    // 去混淆评级： 低(30)
    @Override  // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.p != null && this.p.isStateful() || super.isStateful();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect0) {
        this.n = true;
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] arr_v) {
        ColorStateList colorStateList0 = this.p;
        if(colorStateList0 != null) {
            int v = colorStateList0.getColorForState(arr_v, this.m);
            if(v != this.m) {
                this.n = true;
                this.m = v;
            }
        }
        if(this.n) {
            this.invalidateSelf();
        }
        return this.n;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
        this.b.setAlpha(v);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
        this.b.setColorFilter(colorFilter0);
        this.invalidateSelf();
    }
}


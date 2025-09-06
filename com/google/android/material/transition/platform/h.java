package com.google.android.material.transition.platform;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Op;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.transition.PathMotion;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import androidx.core.util.Preconditions;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import kotlin.text.q;

public final class h extends Drawable {
    public final g A;
    public final FadeModeEvaluator B;
    public final FitModeEvaluator C;
    public final boolean D;
    public final Paint E;
    public final Path F;
    public c G;
    public d H;
    public RectF I;
    public float J;
    public float K;
    public float L;
    public final View a;
    public final RectF b;
    public final ShapeAppearanceModel c;
    public final float d;
    public final View e;
    public final RectF f;
    public final ShapeAppearanceModel g;
    public final float h;
    public final Paint i;
    public final Paint j;
    public final Paint k;
    public final Paint l;
    public final Paint m;
    public final e n;
    public final PathMeasure o;
    public final float p;
    public final float[] q;
    public final boolean r;
    public final float s;
    public final float t;
    public final boolean u;
    public final MaterialShapeDrawable v;
    public final RectF w;
    public final RectF x;
    public final RectF y;
    public final RectF z;

    public h(PathMotion pathMotion0, View view0, RectF rectF0, ShapeAppearanceModel shapeAppearanceModel0, float f, View view1, RectF rectF1, ShapeAppearanceModel shapeAppearanceModel1, float f1, int v, int v1, int v2, int v3, boolean z, boolean z1, FadeModeEvaluator fadeModeEvaluator0, FitModeEvaluator fitModeEvaluator0, g g0, boolean z2) {
        Paint paint0 = new Paint();
        this.i = paint0;
        Paint paint1 = new Paint();
        this.j = paint1;
        Paint paint2 = new Paint();
        this.k = paint2;
        this.l = new Paint();
        Paint paint3 = new Paint();
        this.m = paint3;
        this.n = new e();
        float[] arr_f = new float[2];
        this.q = arr_f;
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable();
        this.v = materialShapeDrawable0;
        Paint paint4 = new Paint();
        this.E = paint4;
        this.F = new Path();
        this.a = view0;
        this.b = rectF0;
        this.c = shapeAppearanceModel0;
        this.d = f;
        this.e = view1;
        this.f = rectF1;
        this.g = shapeAppearanceModel1;
        this.h = f1;
        this.r = z;
        this.u = z1;
        this.B = fadeModeEvaluator0;
        this.C = fitModeEvaluator0;
        this.A = g0;
        this.D = z2;
        WindowManager windowManager0 = (WindowManager)view0.getContext().getSystemService("window");
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        windowManager0.getDefaultDisplay().getMetrics(displayMetrics0);
        this.s = (float)displayMetrics0.widthPixels;
        this.t = (float)displayMetrics0.heightPixels;
        paint0.setColor(v);
        paint1.setColor(v1);
        paint2.setColor(v2);
        materialShapeDrawable0.setFillColor(ColorStateList.valueOf(0));
        materialShapeDrawable0.setShadowCompatibilityMode(2);
        materialShapeDrawable0.setShadowBitmapDrawingEnable(false);
        materialShapeDrawable0.setShadowColor(0xFF888888);
        RectF rectF2 = new RectF(rectF0);
        this.w = rectF2;
        this.x = new RectF(rectF2);
        RectF rectF3 = new RectF(rectF2);
        this.y = rectF3;
        this.z = new RectF(rectF3);
        PointF pointF0 = new PointF(rectF0.centerX(), rectF0.top);
        PointF pointF1 = new PointF(rectF1.centerX(), rectF1.top);
        PathMeasure pathMeasure0 = new PathMeasure(pathMotion0.getPath(pointF0.x, pointF0.y, pointF1.x, pointF1.y), false);
        this.o = pathMeasure0;
        this.p = pathMeasure0.getLength();
        arr_f[0] = rectF0.centerX();
        arr_f[1] = rectF0.top;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, v3, v3, Shader.TileMode.CLAMP));
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(10.0f);
        this.d(0.0f);
    }

    public final void a(Canvas canvas0) {
        this.c(canvas0, this.k);
        Rect rect0 = this.getBounds();
        float f = this.y.left;
        float f1 = this.y.top;
        float f2 = this.H.b;
        int v = this.G.b;
        if(v > 0) {
            int v1 = canvas0.save();
            canvas0.translate(f, f1);
            canvas0.scale(f2, f2);
            if(v < 0xFF) {
                l.a.set(rect0);
                canvas0.saveLayerAlpha(l.a, v);
            }
            this.e.draw(canvas0);
            canvas0.restoreToCount(v1);
        }
    }

    public final void b(Canvas canvas0) {
        this.c(canvas0, this.j);
        Rect rect0 = this.getBounds();
        float f = this.w.left;
        float f1 = this.w.top;
        float f2 = this.H.a;
        int v = this.G.a;
        if(v > 0) {
            int v1 = canvas0.save();
            canvas0.translate(f, f1);
            canvas0.scale(f2, f2);
            if(v < 0xFF) {
                l.a.set(rect0);
                canvas0.saveLayerAlpha(l.a, v);
            }
            this.a.draw(canvas0);
            canvas0.restoreToCount(v1);
        }
    }

    public final void c(Canvas canvas0, Paint paint0) {
        if(paint0.getColor() != 0 && paint0.getAlpha() > 0) {
            canvas0.drawRect(this.getBounds(), paint0);
        }
    }

    public final void d(float f) {
        float f5;
        float f4;
        this.L = f;
        this.m.setAlpha(((int)(this.r ? l.c(0.0f, 255.0f, f) : l.c(255.0f, 0.0f, f))));
        float f1 = this.p;
        PathMeasure pathMeasure0 = this.o;
        float[] arr_f = this.q;
        pathMeasure0.getPosTan(f1 * f, arr_f, null);
        float f2 = arr_f[0];
        float f3 = arr_f[1];
        int v = Float.compare(f, 1.0f);
        if(v > 0 || f < 0.0f) {
            if(v > 0) {
                f4 = (f - 1.0f) / 0.01f;
                f5 = 0.99f;
            }
            else {
                f5 = 0.01f;
                f4 = f / 0.01f * -1.0f;
            }
            pathMeasure0.getPosTan(f1 * f5, arr_f, null);
            f2 = q.a(f2, arr_f[0], f4, f2);
            f3 = q.a(f3, arr_f[1], f4, f3);
        }
        g g0 = this.A;
        float f6 = (float)(((Float)Preconditions.checkNotNull(g0.b.a)));
        float f7 = (float)(((Float)Preconditions.checkNotNull(g0.b.b)));
        float f8 = this.b.width();
        float f9 = this.b.height();
        float f10 = this.f.width();
        float f11 = this.f.height();
        d d0 = this.C.evaluate(f, f6, f7, f8, f9, f10, f11);
        this.H = d0;
        RectF rectF0 = this.w;
        rectF0.set(f2 - d0.c / 2.0f, f3, d0.c / 2.0f + f2, d0.d + f3);
        float f12 = this.H.e / 2.0f;
        this.y.set(f2 - f12, f3, f12 + f2, this.H.f + f3);
        RectF rectF1 = this.x;
        rectF1.set(rectF0);
        RectF rectF2 = this.z;
        rectF2.set(this.y);
        float f13 = (float)(((Float)Preconditions.checkNotNull(g0.c.a)));
        float f14 = (float)(((Float)Preconditions.checkNotNull(g0.c.b)));
        boolean z = this.C.shouldMaskStartBounds(this.H);
        this.C.applyMask((z ? rectF1 : rectF2), (z ? l.d(0.0f, 1.0f, f13, f14, f, false) : 1.0f - l.d(0.0f, 1.0f, f13, f14, f, false)), this.H);
        this.I = new RectF(Math.min(rectF1.left, rectF2.left), Math.min(rectF1.top, rectF2.top), Math.max(rectF1.right, rectF2.right), Math.max(rectF1.bottom, rectF2.bottom));
        e e0 = this.n;
        e0.getClass();
        float f15 = g0.d.getStart();
        float f16 = g0.d.getEnd();
        ShapeAppearanceModel shapeAppearanceModel0 = this.c;
        if(Float.compare(f, f15) >= 0) {
            shapeAppearanceModel0 = Float.compare(f, f16) <= 0 ? (shapeAppearanceModel0.getTopLeftCornerSize().getCornerSize(rectF0) != 0.0f || shapeAppearanceModel0.getTopRightCornerSize().getCornerSize(rectF0) != 0.0f || shapeAppearanceModel0.getBottomRightCornerSize().getCornerSize(rectF0) != 0.0f || shapeAppearanceModel0.getBottomLeftCornerSize().getCornerSize(rectF0) != 0.0f ? shapeAppearanceModel0 : this.g).toBuilder().setTopLeftCornerSize(new AbsoluteCornerSize(l.d(shapeAppearanceModel0.getTopLeftCornerSize().getCornerSize(rectF0), this.g.getTopLeftCornerSize().getCornerSize(rectF2), f15, f16, f, false))).setTopRightCornerSize(new AbsoluteCornerSize(l.d(shapeAppearanceModel0.getTopRightCornerSize().getCornerSize(rectF0), this.g.getTopRightCornerSize().getCornerSize(rectF2), f15, f16, f, false))).setBottomLeftCornerSize(new AbsoluteCornerSize(l.d(shapeAppearanceModel0.getBottomLeftCornerSize().getCornerSize(rectF0), this.g.getBottomLeftCornerSize().getCornerSize(rectF2), f15, f16, f, false))).setBottomRightCornerSize(new AbsoluteCornerSize(l.d(shapeAppearanceModel0.getBottomRightCornerSize().getCornerSize(rectF0), this.g.getBottomRightCornerSize().getCornerSize(rectF2), f15, f16, f, false))).build() : this.g;
        }
        e0.e = shapeAppearanceModel0;
        e0.d.calculatePath(shapeAppearanceModel0, 1.0f, rectF1, e0.b);
        e0.d.calculatePath(e0.e, 1.0f, rectF2, e0.c);
        e0.a.op(e0.b, e0.c, Path.Op.UNION);
        this.J = l.c(this.d, this.h, f);
        float f17 = this.I.centerX();
        float f18 = this.I.centerY();
        float f19 = this.J;
        float f20 = (float)(((int)(f18 / this.t * 1.5f * f19)));
        this.K = f20;
        this.l.setShadowLayer(f19, ((float)(((int)((f17 / (this.s / 2.0f) - 1.0f) * 0.3f * f19)))), f20, 0x2D000000);
        float f21 = (float)(((Float)Preconditions.checkNotNull(g0.a.a)));
        float f22 = (float)(((Float)Preconditions.checkNotNull(g0.a.b)));
        this.G = this.B.evaluate(f, f21, f22, 0.35f);
        Paint paint0 = this.j;
        if(paint0.getColor() != 0) {
            paint0.setAlpha(this.G.a);
        }
        Paint paint1 = this.k;
        if(paint1.getColor() != 0) {
            paint1.setAlpha(this.G.b);
        }
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        Paint paint0 = this.m;
        if(paint0.getAlpha() > 0) {
            canvas0.drawRect(this.getBounds(), paint0);
        }
        boolean z = this.D;
        int v = z ? canvas0.save() : -1;
        e e0 = this.n;
        if(this.u && this.J > 0.0f) {
            canvas0.save();
            canvas0.clipPath(e0.a, Region.Op.DIFFERENCE);
            if(Build.VERSION.SDK_INT > 28) {
                ShapeAppearanceModel shapeAppearanceModel0 = e0.e;
                boolean z1 = shapeAppearanceModel0.isRoundRect(this.I);
                Paint paint1 = this.l;
                if(z1) {
                    float f = shapeAppearanceModel0.getTopLeftCornerSize().getCornerSize(this.I);
                    canvas0.drawRoundRect(this.I, f, f, paint1);
                }
                else {
                    canvas0.drawPath(e0.a, paint1);
                }
            }
            else {
                this.v.setBounds(((int)this.I.left), ((int)this.I.top), ((int)this.I.right), ((int)this.I.bottom));
                this.v.setElevation(this.J);
                this.v.setShadowVerticalOffset(((int)this.K));
                this.v.setShapeAppearanceModel(e0.e);
                this.v.draw(canvas0);
            }
            canvas0.restore();
        }
        canvas0.clipPath(e0.a);
        this.c(canvas0, this.i);
        if(this.G.c) {
            this.b(canvas0);
            this.a(canvas0);
        }
        else {
            this.a(canvas0);
            this.b(canvas0);
        }
        if(z) {
            canvas0.restoreToCount(v);
            RectF rectF0 = this.w;
            Path path0 = this.F;
            PointF pointF0 = new PointF(rectF0.centerX(), rectF0.top);
            Paint paint2 = this.E;
            if(Float.compare(this.L, 0.0f) == 0) {
                path0.reset();
                path0.moveTo(pointF0.x, pointF0.y);
            }
            else {
                path0.lineTo(pointF0.x, pointF0.y);
                paint2.setColor(0xFFFF00FF);
                canvas0.drawPath(path0, paint2);
            }
            paint2.setColor(0xFFFFFF00);
            canvas0.drawRect(this.x, paint2);
            paint2.setColor(0xFF00FF00);
            canvas0.drawRect(rectF0, paint2);
            paint2.setColor(0xFF00FFFF);
            canvas0.drawRect(this.z, paint2);
            paint2.setColor(0xFF0000FF);
            canvas0.drawRect(this.y, paint2);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
        throw new UnsupportedOperationException("Setting alpha on is not supported");
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
        throw new UnsupportedOperationException("Setting a color filter is not supported");
    }
}


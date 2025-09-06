package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Shader.TileMode;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ShadowRenderer {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public int e;
    public int f;
    public final Path g;
    public final Paint h;
    public static final int[] i;
    public static final float[] j;
    public static final int[] k;
    public static final float[] l;

    static {
        ShadowRenderer.i = new int[3];
        ShadowRenderer.j = new float[]{0.0f, 0.5f, 1.0f};
        ShadowRenderer.k = new int[4];
        ShadowRenderer.l = new float[]{0.0f, 0.0f, 0.5f, 1.0f};
    }

    public ShadowRenderer() {
        this(0xFF000000);
    }

    public ShadowRenderer(int v) {
        this.g = new Path();
        Paint paint0 = new Paint();
        this.h = paint0;
        this.a = new Paint();
        this.setShadowColor(v);
        paint0.setColor(0);
        Paint paint1 = new Paint(4);
        this.b = paint1;
        paint1.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint1);
    }

    public void drawCornerShadow(@NonNull Canvas canvas0, @Nullable Matrix matrix0, @NonNull RectF rectF0, int v, float f, float f1) {
        boolean z = Float.compare(f1, 0.0f) < 0;
        Path path0 = this.g;
        int[] arr_v = ShadowRenderer.k;
        if(z) {
            arr_v[0] = 0;
            arr_v[1] = this.f;
            arr_v[2] = this.e;
            arr_v[3] = this.d;
        }
        else {
            path0.rewind();
            path0.moveTo(rectF0.centerX(), rectF0.centerY());
            path0.arcTo(rectF0, f, f1);
            path0.close();
            float f2 = (float)(-v);
            rectF0.inset(f2, f2);
            arr_v[0] = 0;
            arr_v[1] = this.d;
            arr_v[2] = this.e;
            arr_v[3] = this.f;
        }
        float f3 = rectF0.width();
        if(f3 / 2.0f <= 0.0f) {
            return;
        }
        float f4 = 1.0f - ((float)v) / (f3 / 2.0f);
        ShadowRenderer.l[1] = f4;
        ShadowRenderer.l[2] = (1.0f - f4) / 2.0f + f4;
        RadialGradient radialGradient0 = new RadialGradient(rectF0.centerX(), rectF0.centerY(), f3 / 2.0f, arr_v, ShadowRenderer.l, Shader.TileMode.CLAMP);
        Paint paint0 = this.b;
        paint0.setShader(radialGradient0);
        canvas0.save();
        canvas0.concat(matrix0);
        canvas0.scale(1.0f, rectF0.height() / rectF0.width());
        if(!z) {
            canvas0.clipPath(path0, Region.Op.DIFFERENCE);
            canvas0.drawPath(path0, this.h);
        }
        canvas0.drawArc(rectF0, f, f1, true, paint0);
        canvas0.restore();
    }

    public void drawEdgeShadow(@NonNull Canvas canvas0, @Nullable Matrix matrix0, @NonNull RectF rectF0, int v) {
        rectF0.bottom += (float)v;
        rectF0.offset(0.0f, ((float)(-v)));
        ShadowRenderer.i[0] = this.f;
        ShadowRenderer.i[1] = this.e;
        ShadowRenderer.i[2] = this.d;
        LinearGradient linearGradient0 = new LinearGradient(rectF0.left, rectF0.top, rectF0.left, rectF0.bottom, ShadowRenderer.i, ShadowRenderer.j, Shader.TileMode.CLAMP);
        this.c.setShader(linearGradient0);
        canvas0.save();
        canvas0.concat(matrix0);
        canvas0.drawRect(rectF0, this.c);
        canvas0.restore();
    }

    public void drawInnerCornerShadow(@NonNull Canvas canvas0, @Nullable Matrix matrix0, @NonNull RectF rectF0, int v, float f, float f1, @NonNull float[] arr_f) {
        if(f1 > 0.0f) {
            f += f1;
            f1 = -f1;
        }
        this.drawCornerShadow(canvas0, matrix0, rectF0, v, f, f1);
        this.g.rewind();
        this.g.moveTo(arr_f[0], arr_f[1]);
        this.g.arcTo(rectF0, f, f1);
        this.g.close();
        canvas0.save();
        canvas0.concat(matrix0);
        canvas0.scale(1.0f, rectF0.height() / rectF0.width());
        canvas0.drawPath(this.g, this.h);
        canvas0.drawPath(this.g, this.a);
        canvas0.restore();
    }

    @NonNull
    public Paint getShadowPaint() {
        return this.a;
    }

    public void setShadowColor(int v) {
        this.d = ColorUtils.setAlphaComponent(v, 68);
        this.e = ColorUtils.setAlphaComponent(v, 20);
        this.f = ColorUtils.setAlphaComponent(v, 0);
        this.a.setColor(this.d);
    }
}


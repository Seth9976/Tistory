package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.android.material.shadow.ShadowRenderer;

public final class g extends i {
    public final PathLineOperation c;
    public final PathLineOperation d;
    public final float e;
    public final float f;

    public g(PathLineOperation shapePath$PathLineOperation0, PathLineOperation shapePath$PathLineOperation1, float f, float f1) {
        this.c = shapePath$PathLineOperation0;
        this.d = shapePath$PathLineOperation1;
        this.e = f;
        this.f = f1;
    }

    @Override  // com.google.android.material.shape.i
    public final void a(Matrix matrix0, ShadowRenderer shadowRenderer0, int v, Canvas canvas0) {
        float f = (this.b() - this.c() + 360.0f) % 360.0f;
        if(f > 180.0f) {
            f -= 360.0f;
        }
        if(f > 0.0f) {
            return;
        }
        float f1 = this.e;
        float f2 = this.f;
        double f3 = Math.hypot(this.c.a - f1, this.c.b - f2);
        PathLineOperation shapePath$PathLineOperation0 = this.c;
        double f4 = Math.hypot(this.d.a - shapePath$PathLineOperation0.a, this.d.b - shapePath$PathLineOperation0.b);
        float f5 = (float)Math.min(v, Math.min(f3, f4));
        double f6 = Math.tan(Math.toRadians(-f / 2.0f)) * ((double)f5);
        Matrix matrix1 = this.a;
        if(Double.compare(f3, f6) > 0) {
            RectF rectF0 = new RectF(0.0f, 0.0f, ((float)(f3 - f6)), 0.0f);
            matrix1.set(matrix0);
            matrix1.preTranslate(f1, f2);
            matrix1.preRotate(this.c());
            shadowRenderer0.drawEdgeShadow(canvas0, matrix1, rectF0, v);
        }
        RectF rectF1 = new RectF(0.0f, 0.0f, f5 * 2.0f, f5 * 2.0f);
        matrix1.set(matrix0);
        matrix1.preTranslate(shapePath$PathLineOperation0.a, shapePath$PathLineOperation0.b);
        matrix1.preRotate(this.c());
        matrix1.preTranslate(((float)(-f6 - ((double)f5))), -2.0f * f5);
        shadowRenderer0.drawInnerCornerShadow(canvas0, matrix1, rectF1, ((int)f5), 450.0f, f, new float[]{((float)(((double)f5) + f6)), f5 * 2.0f});
        if(f4 > f6) {
            RectF rectF2 = new RectF(0.0f, 0.0f, ((float)(f4 - f6)), 0.0f);
            matrix1.set(matrix0);
            matrix1.preTranslate(shapePath$PathLineOperation0.a, shapePath$PathLineOperation0.b);
            matrix1.preRotate(this.b());
            matrix1.preTranslate(((float)f6), 0.0f);
            shadowRenderer0.drawEdgeShadow(canvas0, matrix1, rectF2, v);
        }
    }

    public final float b() {
        return (float)Math.toDegrees(Math.atan((this.d.b - this.c.b) / (this.d.a - this.c.a)));
    }

    public final float c() {
        return (float)Math.toDegrees(Math.atan((this.c.b - this.f) / (this.c.a - this.e)));
    }
}


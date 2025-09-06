package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.android.material.shadow.ShadowRenderer;

public final class h extends i {
    public final PathLineOperation c;
    public final float d;
    public final float e;

    public h(PathLineOperation shapePath$PathLineOperation0, float f, float f1) {
        this.c = shapePath$PathLineOperation0;
        this.d = f;
        this.e = f1;
    }

    @Override  // com.google.android.material.shape.i
    public final void a(Matrix matrix0, ShadowRenderer shadowRenderer0, int v, Canvas canvas0) {
        RectF rectF0 = new RectF(0.0f, 0.0f, ((float)Math.hypot(this.c.b - this.e, this.c.a - this.d)), 0.0f);
        this.a.set(matrix0);
        this.a.preTranslate(this.d, this.e);
        float f = this.b();
        this.a.preRotate(f);
        shadowRenderer0.drawEdgeShadow(canvas0, this.a, rectF0, v);
    }

    public final float b() {
        return (float)Math.toDegrees(Math.atan((this.c.b - this.e) / (this.c.a - this.d)));
    }
}


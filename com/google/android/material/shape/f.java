package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.android.material.shadow.ShadowRenderer;

public final class f extends i {
    public final PathArcOperation c;

    public f(PathArcOperation shapePath$PathArcOperation0) {
        this.c = shapePath$PathArcOperation0;
    }

    @Override  // com.google.android.material.shape.i
    public final void a(Matrix matrix0, ShadowRenderer shadowRenderer0, int v, Canvas canvas0) {
        float f = this.c.startAngle;
        float f1 = this.c.sweepAngle;
        shadowRenderer0.drawCornerShadow(canvas0, matrix0, new RectF(this.c.left, this.c.top, this.c.right, this.c.bottom), v, f, f1);
    }
}


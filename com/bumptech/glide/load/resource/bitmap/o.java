package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.RectF;

public final class o implements DrawRoundedCornerFn {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public o(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.TransformationUtils$DrawRoundedCornerFn
    public final void drawRoundedCorners(Canvas canvas0, Paint paint0, RectF rectF0) {
        Path path0 = new Path();
        path0.addRoundRect(rectF0, new float[]{this.a, this.a, this.b, this.b, this.c, this.c, this.d, this.d}, Path.Direction.CW);
        canvas0.drawPath(path0, paint0);
    }
}


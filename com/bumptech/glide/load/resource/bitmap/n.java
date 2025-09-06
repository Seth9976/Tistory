package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public final class n implements DrawRoundedCornerFn {
    public final int a;

    public n(int v) {
        this.a = v;
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.TransformationUtils$DrawRoundedCornerFn
    public final void drawRoundedCorners(Canvas canvas0, Paint paint0, RectF rectF0) {
        canvas0.drawRoundRect(rectF0, ((float)this.a), ((float)this.a), paint0);
    }
}


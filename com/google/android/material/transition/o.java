package com.google.android.material.transition;

import android.graphics.RectF;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator;

public final class o implements CornerSizeUnaryOperator {
    public final int a;
    public final RectF b;

    public o(RectF rectF0, int v) {
        this.a = v;
        this.b = rectF0;
        super();
    }

    @Override  // com.google.android.material.shape.ShapeAppearanceModel$CornerSizeUnaryOperator
    public final CornerSize apply(CornerSize cornerSize0) {
        return RelativeCornerSize.createFromCornerSize(this.b, cornerSize0);
    }
}


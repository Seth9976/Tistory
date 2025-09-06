package com.google.android.material.shape;

public final class c implements CornerSizeUnaryOperator {
    public final float a;

    public c(float f) {
        this.a = f;
    }

    @Override  // com.google.android.material.shape.ShapeAppearanceModel$CornerSizeUnaryOperator
    public final CornerSize apply(CornerSize cornerSize0) {
        return !(cornerSize0 instanceof RelativeCornerSize) ? new AdjustedCornerSize(this.a, cornerSize0) : cornerSize0;
    }
}


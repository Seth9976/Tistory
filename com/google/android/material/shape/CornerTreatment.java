package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;

public class CornerTreatment {
    @Deprecated
    public void getCornerPath(float f, float f1, @NonNull ShapePath shapePath0) {
    }

    public void getCornerPath(@NonNull ShapePath shapePath0, float f, float f1, float f2) {
    }

    public void getCornerPath(@NonNull ShapePath shapePath0, float f, float f1, @NonNull RectF rectF0, @NonNull CornerSize cornerSize0) {
        this.getCornerPath(shapePath0, f, f1, cornerSize0.getCornerSize(rectF0));
    }
}


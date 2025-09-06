package com.google.android.material.shape;

import androidx.annotation.NonNull;

public class EdgeTreatment {
    public boolean a() {
        return this instanceof MarkerEdgeTreatment;
    }

    public void getEdgePath(float f, float f1, float f2, @NonNull ShapePath shapePath0) {
        shapePath0.lineTo(f, 0.0f);
    }

    @Deprecated
    public void getEdgePath(float f, float f1, @NonNull ShapePath shapePath0) {
        this.getEdgePath(f, f / 2.0f, f1, shapePath0);
    }
}


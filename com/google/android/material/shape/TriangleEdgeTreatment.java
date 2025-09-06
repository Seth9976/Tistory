package com.google.android.material.shape;

import androidx.annotation.NonNull;

public class TriangleEdgeTreatment extends EdgeTreatment {
    public final float a;
    public final boolean b;

    public TriangleEdgeTreatment(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override  // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f1, float f2, @NonNull ShapePath shapePath0) {
        float f3 = this.a;
        if(this.b) {
            shapePath0.lineTo(f1 - f3 * f2, 0.0f);
            shapePath0.lineTo(f1, f3 * f2, f3 * f2 + f1, 0.0f);
            shapePath0.lineTo(f, 0.0f);
            return;
        }
        shapePath0.lineTo(f1 - f3 * f2, 0.0f, f1, -f3 * f2);
        shapePath0.lineTo(f3 * f2 + f1, 0.0f, f, 0.0f);
    }
}


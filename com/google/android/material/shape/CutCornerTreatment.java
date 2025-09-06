package com.google.android.material.shape;

import androidx.annotation.NonNull;

public class CutCornerTreatment extends CornerTreatment {
    public final float a;

    public CutCornerTreatment() {
        this.a = -1.0f;
    }

    @Deprecated
    public CutCornerTreatment(float f) {
        this.a = f;
    }

    @Override  // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath0, float f, float f1, float f2) {
        shapePath0.reset(0.0f, f2 * f1, 180.0f, 180.0f - f);
        shapePath0.lineTo(((float)(Math.sin(Math.toRadians(f)) * ((double)f2) * ((double)f1))), ((float)(Math.sin(Math.toRadians(90.0f - f)) * ((double)f2) * ((double)f1))));
    }
}


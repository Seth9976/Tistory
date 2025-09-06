package com.google.android.material.shape;

import androidx.annotation.NonNull;

public final class MarkerEdgeTreatment extends EdgeTreatment {
    public final float a;

    public MarkerEdgeTreatment(float f) {
        this.a = f - 0.001f;
    }

    @Override  // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f1, float f2, @NonNull ShapePath shapePath0) {
        float f3 = (float)(1.414214 * ((double)this.a) / 2.0);
        float f4 = (float)Math.sqrt(Math.pow(this.a, 2.0) - Math.pow(f3, 2.0));
        shapePath0.reset(f1 - f3, ((float)(-(1.414214 * ((double)this.a) - ((double)this.a)))) + f4);
        shapePath0.lineTo(f1, ((float)(-(1.414214 * ((double)this.a) - ((double)this.a)))));
        shapePath0.lineTo(f1 + f3, ((float)(-(1.414214 * ((double)this.a) - ((double)this.a)))) + f4);
    }
}


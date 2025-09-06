package com.google.android.material.shape;

import androidx.annotation.NonNull;

public final class OffsetEdgeTreatment extends EdgeTreatment {
    public final EdgeTreatment a;
    public final float b;

    public OffsetEdgeTreatment(@NonNull EdgeTreatment edgeTreatment0, float f) {
        this.a = edgeTreatment0;
        this.b = f;
    }

    @Override  // com.google.android.material.shape.EdgeTreatment
    public final boolean a() {
        return this.a.a();
    }

    @Override  // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f1, float f2, @NonNull ShapePath shapePath0) {
        this.a.getEdgePath(f, f1 - this.b, f2, shapePath0);
    }
}


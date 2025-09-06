package com.google.android.material.bottomappbar;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;

    public BottomAppBarTopEdgeTreatment(float f, float f1, float f2) {
        this.f = -1.0f;
        this.b = f;
        this.a = f1;
        this.b(f2);
        this.e = 0.0f;
    }

    public final void b(float f) {
        if(f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.d = f;
    }

    @Override  // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f1, float f2, @NonNull ShapePath shapePath0) {
        float f10;
        float f9;
        float f3 = this.c;
        if(f3 == 0.0f) {
            shapePath0.lineTo(f, 0.0f);
            return;
        }
        float f4 = (this.b * 2.0f + f3) / 2.0f;
        float f5 = f2 * this.a;
        float f6 = f1 + this.e;
        float f7 = (1.0f - f2) * f4 + this.d * f2;
        if(f7 / f4 >= 1.0f) {
            shapePath0.lineTo(f, 0.0f);
            return;
        }
        float f8 = this.f * f2;
        boolean z = this.f == -1.0f || Math.abs(this.f * 2.0f - f3) < 0.1f;
        if(z) {
            f10 = f7;
            f9 = 0.0f;
        }
        else {
            f9 = 1.75f;
            f10 = 0.0f;
        }
        float f11 = f10 + f5;
        float f12 = (float)Math.sqrt((f4 + f5) * (f4 + f5) - f11 * f11);
        float f13 = f6 - f12;
        float f14 = (float)Math.toDegrees(Math.atan(f12 / f11));
        float f15 = 90.0f - f14 + f9;
        shapePath0.lineTo(f13, 0.0f);
        shapePath0.addArc(f13 - f5, 0.0f, f13 + f5, f5 * 2.0f, 270.0f, f14);
        if(z) {
            shapePath0.addArc(f6 - f4, -f4 - f10, f6 + f4, f4 - f10, 180.0f - f15, f15 * 2.0f - 180.0f);
        }
        else {
            shapePath0.addArc(f6 - f4, -(f8 + this.b), f6 - f4 + (this.b + f8 * 2.0f), this.b + f8, 180.0f - f15, (f15 * 2.0f - 180.0f) / 2.0f);
            float f16 = f6 + f4;
            shapePath0.lineTo(f16 - (this.b / 2.0f + f8), this.b + f8);
            shapePath0.addArc(f16 - (f8 * 2.0f + this.b), -(f8 + this.b), f16, this.b + f8, 90.0f, f15 - 90.0f);
        }
        shapePath0.addArc(f6 + f12 - f5, 0.0f, f6 + f12 + f5, f5 * 2.0f, 270.0f - f14, f14);
        shapePath0.lineTo(f, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.f;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public float getFabDiameter() {
        return this.c;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public float getHorizontalOffset() {
        return this.e;
    }

    public void setFabCornerSize(float f) {
        this.f = f;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setFabDiameter(float f) {
        this.c = f;
    }
}


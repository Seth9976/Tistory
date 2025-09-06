package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class ContrastCurve {
    public final double a;
    public final double b;
    public final double c;
    public final double d;

    public ContrastCurve(double f, double f1, double f2, double f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    public double getContrast(double f) {
        if(f <= -1.0) {
            return this.a;
        }
        if(Double.compare(f, 0.0) < 0) {
            return (f + 1.0) / 1.0 * this.b + (1.0 - (f + 1.0) / 1.0) * this.a;
        }
        if(f < 0.5) {
            return (f - 0.0) / 0.5 * this.c + (1.0 - (f - 0.0) / 0.5) * this.b;
        }
        return f < 1.0 ? (f - 0.5) / 0.5 * this.d + (1.0 - (f - 0.5) / 0.5) * this.c : this.d;
    }
}


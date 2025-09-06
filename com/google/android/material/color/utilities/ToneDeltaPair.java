package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class ToneDeltaPair {
    public final DynamicColor a;
    public final DynamicColor b;
    public final double c;
    public final TonePolarity d;
    public final boolean e;

    public ToneDeltaPair(@NonNull DynamicColor dynamicColor0, @NonNull DynamicColor dynamicColor1, double f, @NonNull TonePolarity tonePolarity0, boolean z) {
        this.a = dynamicColor0;
        this.b = dynamicColor1;
        this.c = f;
        this.d = tonePolarity0;
        this.e = z;
    }

    public double getDelta() {
        return this.c;
    }

    @NonNull
    public TonePolarity getPolarity() {
        return this.d;
    }

    @NonNull
    public DynamicColor getRoleA() {
        return this.a;
    }

    @NonNull
    public DynamicColor getRoleB() {
        return this.b;
    }

    public boolean getStayTogether() {
        return this.e;
    }
}


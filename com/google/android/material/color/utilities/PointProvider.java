package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public interface PointProvider {
    double distance(double[] arg1, double[] arg2);

    double[] fromInt(int arg1);

    int toInt(double[] arg1);
}


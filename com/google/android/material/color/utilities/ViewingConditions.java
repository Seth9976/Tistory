package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT;
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double[] g;
    public final double h;
    public final double i;
    public final double j;

    static {
        ViewingConditions.DEFAULT = ViewingConditions.defaultWithBackgroundLstar(50.0);
    }

    public ViewingConditions(double f, double f1, double f2, double f3, double f4, double f5, double[] arr_f, double f6, double f7, double f8) {
        this.f = f;
        this.a = f1;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.g = arr_f;
        this.h = f6;
        this.i = f7;
        this.j = f8;
    }

    // 去混淆评级： 低(20)
    public static ViewingConditions defaultWithBackgroundLstar(double f) {
        return ViewingConditions.make(ColorUtils.whitePointD65(), 11.725678, f, 2.0, false);
    }

    public double getAw() {
        return this.a;
    }

    public double getFlRoot() {
        return this.i;
    }

    public double getN() {
        return this.f;
    }

    public double getNbb() {
        return this.b;
    }

    public double[] getRgbD() {
        return this.g;
    }

    public static ViewingConditions make(double[] arr_f, double f, double f1, double f2, boolean z) {
        double f3 = arr_f[0];
        double[] arr_f1 = Cam16.k[0];
        double f4 = arr_f1[0] * f3;
        double f5 = arr_f[1];
        double f6 = arr_f1[1] * f5 + f4;
        double f7 = arr_f[2];
        double f8 = arr_f1[2] * f7 + f6;
        double[] arr_f2 = Cam16.k[1];
        double f9 = arr_f2[2] * f7 + (arr_f2[1] * f5 + arr_f2[0] * f3);
        double[] arr_f3 = Cam16.k[2];
        double f10 = f7 * arr_f3[2] + (f5 * arr_f3[1] + f3 * arr_f3[0]);
        double f11 = f2 / 10.0 + 0.8;
        double f12 = MathUtils.clampDouble(0.0, 1.0, (z ? 1.0 : (1.0 - Math.exp((-f - 42.0) / 92.0) * 0.277778) * f11));
        double[] arr_f4 = {100.0 / f8 * f12 + 1.0 - f12, 100.0 / f9 * f12 + 1.0 - f12, 100.0 / f10 * f12 + 1.0 - f12};
        double f13 = 1.0 / (5.0 * f + 1.0);
        double f14 = f13 * f13 * f13 * f13;
        double f15 = Math.cbrt(5.0 * f) * (0.1 * (1.0 - f14) * (1.0 - f14)) + f14 * f;
        double f16 = ColorUtils.yFromLstar(Math.max(0.1, f1)) / arr_f[1];
        double f17 = Math.pow(f16, 0.2);
        double f18 = Math.pow(arr_f4[0] * f15 * f8 / 100.0, 0.42);
        double f19 = Math.pow(arr_f4[1] * f15 * f9 / 100.0, 0.42);
        double f20 = Math.pow(arr_f4[2] * f15 * f10 / 100.0, 0.42);
        new double[]{f18 * 400.0 / (f18 + 27.13), f19 * 400.0 / (f19 + 27.13), 400.0 * f20 / (f20 + 27.13)};
        return new ViewingConditions(f16, (400.0 * f20 / (f20 + 27.13) * 0.05 + (f18 * 400.0 / (f18 + 27.13) * 2.0 + f19 * 400.0 / (f19 + 27.13))) * (0.725 / f17), 0.725 / f17, 0.725 / f17, (f11 >= 0.9 ? (f11 - 0.9) * 6.9 + (1.0 - (f11 - 0.9) * 10.0) * 0.59 : (f11 - 0.8) * 5.9 + (1.0 - (f11 - 0.8) * 10.0) * 0.525), f11, arr_f4, f15, Math.pow(f15, 0.25), Math.sqrt(f16) + 1.48);
    }
}


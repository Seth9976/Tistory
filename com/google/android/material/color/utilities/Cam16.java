package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class Cam16 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final double[] j;
    public static final double[][] k;
    public static final double[][] l;

    static {
        Cam16.k = new double[][]{new double[]{0.401288, 0.650173, -0.051461}, new double[]{-0.250268, 1.204414, 0.045854}, new double[]{-0.002079, 0.048952, 0.953127}};
        Cam16.l = new double[][]{new double[]{1.862068, -1.011255, 0.149187}, new double[]{0.387527, 0.621447, -0.008974}, new double[]{-0.015842, -0.034123, 1.049964}};
    }

    public Cam16(double f, double f1, double f2, double f3, double f4, double f5, double f6, double f7, double f8) {
        this.j = new double[]{0.0, 0.0, 0.0};
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
    }

    public static Cam16 a(double f, double f1, double f2, ViewingConditions viewingConditions0) {
        double[] arr_f = Cam16.k[0];
        double f3 = arr_f[2] * f2 + (arr_f[1] * f1 + arr_f[0] * f);
        double[] arr_f1 = Cam16.k[1];
        double f4 = arr_f1[2] * f2 + (arr_f1[1] * f1 + arr_f1[0] * f);
        double[] arr_f2 = Cam16.k[2];
        double f5 = arr_f2[2] * f2 + (arr_f2[1] * f1 + arr_f2[0] * f);
        double f6 = viewingConditions0.getRgbD()[0] * f3;
        double f7 = viewingConditions0.getRgbD()[1] * f4;
        double f8 = viewingConditions0.getRgbD()[2] * f5;
        double f9 = Math.pow(Math.abs(f6) * viewingConditions0.h / 100.0, 0.42);
        double f10 = Math.pow(Math.abs(f7) * viewingConditions0.h / 100.0, 0.42);
        double f11 = Math.pow(Math.abs(f8) * viewingConditions0.h / 100.0, 0.42);
        double f12 = Math.signum(f6) * 400.0 * f9 / (f9 + 27.13);
        double f13 = Math.signum(f7) * 400.0 * f10 / (f10 + 27.13);
        double f14 = Math.signum(f8) * 400.0 * f11 / (f11 + 27.13);
        double f15 = (-12.0 * f13 + f12 * 11.0 + f14) / 11.0;
        double f16 = (f12 + f13 - f14 * 2.0) / 9.0;
        double f17 = Math.toDegrees(Math.atan2(f16, f15));
        if(Double.compare(f17, 0.0) < 0) {
            f17 += 360.0;
        }
        else if(f17 >= 360.0) {
            f17 -= 360.0;
        }
        double f18 = Math.toRadians(f17);
        double f19 = Math.pow(viewingConditions0.getNbb() * ((f12 * 40.0 + f13 * 20.0 + f14) / 20.0) / viewingConditions0.getAw(), viewingConditions0.j * viewingConditions0.d);
        double f20 = f19 * 100.0 / 100.0;
        double f21 = Math.pow(Math.hypot(f15, f16) * ((Math.cos(Math.toRadians((f17 < 20.14 ? f17 + 360.0 : f17)) + 2.0) + 3.8) * 961.538462 * viewingConditions0.e * viewingConditions0.c) / ((21.0 * f14 + (f12 * 20.0 + f13 * 20.0)) / 20.0 + 0.305), 0.9) * Math.pow(1.64 - Math.pow(0.29, viewingConditions0.getN()), 0.73);
        double f22 = Math.sqrt(f20) * f21;
        double f23 = viewingConditions0.getFlRoot() * f22;
        double f24 = Math.log1p(0.0228 * f23);
        return new Cam16(f17, f22, f19 * 100.0, viewingConditions0.getFlRoot() * ((viewingConditions0.getAw() + 4.0) * (Math.sqrt(f20) * (4.0 / viewingConditions0.d))), f23, Math.sqrt(f21 * viewingConditions0.d / (viewingConditions0.getAw() + 4.0)) * 50.0, 1.7 * (f19 * 100.0) / (0.007 * (f19 * 100.0) + 1.0), Math.cos(f18) * (f24 * 43.859649), Math.sin(f18) * (f24 * 43.859649));
    }

    public final double[] b(ViewingConditions viewingConditions0, double[] arr_f) {
        double f = Math.pow((Double.compare(this.getChroma(), 0.0) == 0 || this.getJ() == 0.0 ? 0.0 : this.getChroma() / Math.sqrt(this.getJ() / 100.0)) / Math.pow(1.64 - Math.pow(0.29, viewingConditions0.getN()), 0.73), 1.111111);
        double f1 = Math.toRadians(this.getHue());
        double f2 = Math.pow(this.getJ() / 100.0, 1.0 / viewingConditions0.d / viewingConditions0.j) * viewingConditions0.getAw() / viewingConditions0.getNbb();
        double f3 = Math.sin(f1);
        double f4 = Math.cos(f1);
        double f5 = (f2 + 0.305) * 23.0 * f / (f * 108.0 * f3 + (11.0 * f * f4 + (Math.cos(f1 + 2.0) + 3.8) * 961.538462 * viewingConditions0.e * viewingConditions0.c * 23.0));
        double f6 = f4 * f5;
        double f7 = f5 * f3;
        double f8 = (288.0 * f7 + (451.0 * f6 + f2 * 460.0)) / 1403.0;
        double f9 = (f2 * 460.0 - 891.0 * f6 - 261.0 * f7) / 1403.0;
        double f10 = (f2 * 460.0 - f6 * 220.0 - f7 * 6300.0) / 1403.0;
        double f11 = Math.pow(Math.max(0.0, Math.abs(f8) * 27.13 / (400.0 - Math.abs(f8))), 2.380952) * (100.0 / viewingConditions0.h * Math.signum(f8)) / viewingConditions0.getRgbD()[0];
        double f12 = Math.pow(Math.max(0.0, Math.abs(f9) * 27.13 / (400.0 - Math.abs(f9))), 2.380952) * (100.0 / viewingConditions0.h * Math.signum(f9)) / viewingConditions0.getRgbD()[1];
        double f13 = Math.pow(Math.max(0.0, Math.abs(f10) * 27.13 / (400.0 - Math.abs(f10))), 2.380952) * (100.0 / viewingConditions0.h * Math.signum(f10)) / viewingConditions0.getRgbD()[2];
        double[] arr_f1 = Cam16.l[0];
        double f14 = arr_f1[2] * f13 + (arr_f1[1] * f12 + arr_f1[0] * f11);
        double[] arr_f2 = Cam16.l[1];
        double f15 = arr_f2[2] * f13 + (arr_f2[1] * f12 + arr_f2[0] * f11);
        double[] arr_f3 = Cam16.l[2];
        double f16 = f13 * arr_f3[2] + (f12 * arr_f3[1] + f11 * arr_f3[0]);
        if(arr_f != null) {
            arr_f[0] = f14;
            arr_f[1] = f15;
            arr_f[2] = f16;
            return arr_f;
        }
        return new double[]{f14, f15, f16};
    }

    public static Cam16 fromInt(int v) {
        double f = ColorUtils.linearized((0xFF0000 & v) >> 16);
        double f1 = ColorUtils.linearized((0xFF00 & v) >> 8);
        double f2 = ColorUtils.linearized(v & 0xFF);
        return Cam16.a(0.18051 * f2 + (0.357621 * f1 + 0.412339 * f), 0.0722 * f2 + (0.7152 * f1 + 0.2126 * f), f2 * 0.950345 + (f1 * 0.119164 + f * 0.019321), ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcs(double f, double f1, double f2) {
        return Cam16.fromUcsInViewingConditions(f, f1, f2, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(double f, double f1, double f2, ViewingConditions viewingConditions0) {
        double f3 = Math.expm1(Math.hypot(f1, f2) * 0.0228) / 0.0228 / viewingConditions0.getFlRoot();
        double f4 = Math.atan2(f2, f1) * 57.29578;
        f4 = f4 < 0.0 ? f4 + 360.0 : Math.atan2(f2, f1) * 57.29578;
        double f5 = f / (1.0 - (f - 100.0) * 0.007);
        double f6 = viewingConditions0.getFlRoot() * f3;
        double f7 = Math.toRadians(f4);
        double f8 = Math.log1p(0.0228 * f6);
        return new Cam16(f4, f3, f5, viewingConditions0.getFlRoot() * ((viewingConditions0.getAw() + 4.0) * (Math.sqrt(f5 / 100.0) * (4.0 / viewingConditions0.d))), f6, Math.sqrt(f3 / Math.sqrt(f5 / 100.0) * viewingConditions0.d / (viewingConditions0.getAw() + 4.0)) * 50.0, 1.7 * f5 / (0.007 * f5 + 1.0), Math.cos(f7) * (f8 * 43.859649), Math.sin(f7) * (f8 * 43.859649));
    }

    public double getAstar() {
        return this.h;
    }

    public double getBstar() {
        return this.i;
    }

    public double getChroma() {
        return this.b;
    }

    public double getHue() {
        return this.a;
    }

    public double getJ() {
        return this.c;
    }

    public double getJstar() {
        return this.g;
    }

    public double getM() {
        return this.e;
    }

    public double getQ() {
        return this.d;
    }

    public double getS() {
        return this.f;
    }

    public int toInt() {
        double[] arr_f = this.b(ViewingConditions.DEFAULT, this.j);
        return ColorUtils.argbFromXyz(arr_f[0], arr_f[1], arr_f[2]);
    }
}


package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class Hct {
    public double a;
    public double b;
    public double c;
    public int d;

    public Hct(int v) {
        this.a(v);
    }

    public final void a(int v) {
        this.d = v;
        Cam16 cam160 = Cam16.fromInt(v);
        this.a = cam160.getHue();
        this.b = cam160.getChroma();
        this.c = ColorUtils.lstarFromArgb(v);
    }

    public static Hct from(double f, double f1, double f2) {
        return new Hct(HctSolver.solveToInt(f, f1, f2));
    }

    public static Hct fromInt(int v) {
        return new Hct(v);
    }

    public double getChroma() {
        return this.b;
    }

    public double getHue() {
        return this.a;
    }

    public double getTone() {
        return this.c;
    }

    public Hct inViewingConditions(ViewingConditions viewingConditions0) {
        double[] arr_f = Cam16.fromInt(this.toInt()).b(viewingConditions0, null);
        Cam16 cam160 = Cam16.a(arr_f[0], arr_f[1], arr_f[2], ViewingConditions.DEFAULT);
        return Hct.from(cam160.getHue(), cam160.getChroma(), ColorUtils.lstarFromY(arr_f[1]));
    }

    public void setChroma(double f) {
        this.a(HctSolver.solveToInt(this.a, f, this.c));
    }

    public void setHue(double f) {
        this.a(HctSolver.solveToInt(f, this.b, this.c));
    }

    public void setTone(double f) {
        this.a(HctSolver.solveToInt(this.a, this.b, f));
    }

    public int toInt() {
        return this.d;
    }
}


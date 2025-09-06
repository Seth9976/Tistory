package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.HashMap;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class TonalPalette {
    public final HashMap a;
    public final Hct b;
    public final double c;
    public final double d;

    public TonalPalette(double f, double f1, Hct hct0) {
        this.a = new HashMap();
        this.c = f;
        this.d = f1;
        this.b = hct0;
    }

    public static TonalPalette fromHct(Hct hct0) {
        return new TonalPalette(hct0.getHue(), hct0.getChroma(), hct0);
    }

    public static TonalPalette fromHueAndChroma(double f, double f1) {
        Hct hct0 = Hct.from(f, f1, 50.0);
        Hct hct1 = hct0;
        double f2 = Math.abs(hct0.getChroma() - f1);
        for(double f3 = 1.0; f3 < 50.0 && Math.round(f1) != Math.round(hct1.getChroma()); ++f3) {
            Hct hct2 = Hct.from(f, f1, f3 + 50.0);
            double f4 = Math.abs(hct2.getChroma() - f1);
            if(f4 < f2) {
                hct1 = hct2;
                f2 = f4;
            }
            Hct hct3 = Hct.from(f, f1, 50.0 - f3);
            double f5 = Math.abs(hct3.getChroma() - f1);
            if(f5 < f2) {
                hct1 = hct3;
                f2 = f5;
            }
        }
        return new TonalPalette(f, f1, hct1);
    }

    public static TonalPalette fromInt(int v) {
        return TonalPalette.fromHct(Hct.fromInt(v));
    }

    public double getChroma() {
        return this.d;
    }

    public Hct getHct(double f) {
        return Hct.from(this.c, this.d, f);
    }

    public double getHue() {
        return this.c;
    }

    public Hct getKeyColor() {
        return this.b;
    }

    public int tone(int v) {
        HashMap hashMap0 = this.a;
        Integer integer0 = (Integer)hashMap0.get(v);
        if(integer0 == null) {
            integer0 = Hct.from(this.c, this.d, v).toInt();
            hashMap0.put(v, integer0);
        }
        return (int)integer0;
    }
}


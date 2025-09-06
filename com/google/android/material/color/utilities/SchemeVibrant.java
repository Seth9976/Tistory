package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SchemeVibrant extends DynamicScheme {
    public static final double[] a;
    public static final double[] b;
    public static final double[] c;

    static {
        SchemeVibrant.a = new double[]{0.0, 41.0, 61.0, 101.0, 131.0, 181.0, 251.0, 301.0, 360.0};
        SchemeVibrant.b = new double[]{18.0, 15.0, 10.0, 12.0, 15.0, 18.0, 15.0, 12.0, 12.0};
        SchemeVibrant.c = new double[]{35.0, 30.0, 20.0, 25.0, 30.0, 35.0, 30.0, 25.0, 25.0};
    }

    public SchemeVibrant(Hct hct0, boolean z, double f) {
        TonalPalette tonalPalette0 = TonalPalette.fromHueAndChroma(hct0.getHue(), 200.0);
        TonalPalette tonalPalette1 = TonalPalette.fromHueAndChroma(DynamicScheme.getRotatedHue(hct0, SchemeVibrant.a, SchemeVibrant.b), 24.0);
        TonalPalette tonalPalette2 = TonalPalette.fromHueAndChroma(DynamicScheme.getRotatedHue(hct0, SchemeVibrant.a, SchemeVibrant.c), 32.0);
        TonalPalette tonalPalette3 = TonalPalette.fromHueAndChroma(hct0.getHue(), 10.0);
        TonalPalette tonalPalette4 = TonalPalette.fromHueAndChroma(hct0.getHue(), 12.0);
        super(hct0, Variant.VIBRANT, z, f, tonalPalette0, tonalPalette1, tonalPalette2, tonalPalette3, tonalPalette4);
    }
}


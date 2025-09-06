package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SchemeExpressive extends DynamicScheme {
    public static final double[] a;
    public static final double[] b;
    public static final double[] c;

    static {
        SchemeExpressive.a = new double[]{0.0, 21.0, 51.0, 121.0, 151.0, 191.0, 271.0, 321.0, 360.0};
        SchemeExpressive.b = new double[]{45.0, 95.0, 45.0, 20.0, 45.0, 90.0, 45.0, 45.0, 45.0};
        SchemeExpressive.c = new double[]{120.0, 120.0, 20.0, 45.0, 20.0, 15.0, 20.0, 120.0, 120.0};
    }

    public SchemeExpressive(Hct hct0, boolean z, double f) {
        TonalPalette tonalPalette0 = TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct0.getHue() + 240.0), 40.0);
        TonalPalette tonalPalette1 = TonalPalette.fromHueAndChroma(DynamicScheme.getRotatedHue(hct0, SchemeExpressive.a, SchemeExpressive.b), 24.0);
        TonalPalette tonalPalette2 = TonalPalette.fromHueAndChroma(DynamicScheme.getRotatedHue(hct0, SchemeExpressive.a, SchemeExpressive.c), 32.0);
        TonalPalette tonalPalette3 = TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct0.getHue() + 15.0), 8.0);
        TonalPalette tonalPalette4 = TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct0.getHue() + 15.0), 12.0);
        super(hct0, Variant.EXPRESSIVE, z, f, tonalPalette0, tonalPalette1, tonalPalette2, tonalPalette3, tonalPalette4);
    }
}


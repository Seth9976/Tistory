package com.google.android.material.color.utilities;

import java.util.function.Function;

public final class b implements Function {
    public final int a;

    public b(int v) {
        this.a = v;
        super();
    }

    @Override
    public final Object apply(Object object0) {
        double f = 100.0;
        DynamicScheme dynamicScheme0 = (DynamicScheme)object0;
        switch(this.a) {
            case 0: {
                return dynamicScheme0.neutralPalette;
            }
            case 1: {
                return dynamicScheme0.secondaryPalette;
            }
            case 2: {
                if(MaterialDynamicColors.b(dynamicScheme0)) {
                    if(dynamicScheme0.isDark) {
                        f = 10.0;
                    }
                    return f;
                }
                if(dynamicScheme0.isDark) {
                    f = 20.0;
                }
                return f;
            }
            case 3: {
                return dynamicScheme0.secondaryPalette;
            }
            case 4: {
                return dynamicScheme0.isDark ? 80.0 : 40.0;
            }
            case 5: {
                return dynamicScheme0.neutralPalette;
            }
            case 6: {
                return dynamicScheme0.isDark ? 4.0 : 100.0;
            }
            case 7: {
                return dynamicScheme0.neutralVariantPalette;
            }
            case 8: {
                return dynamicScheme0.isDark ? 60.0 : 50.0;
            }
            case 9: {
                return dynamicScheme0.neutralPalette;
            }
            case 10: {
                return dynamicScheme0.primaryPalette;
            }
            case 11: {
                return dynamicScheme0.isDark ? 80.0 : 40.0;
            }
            case 12: {
                return dynamicScheme0.secondaryPalette;
            }
            case 13: {
                return 10.0;
            }
            case 14: {
                return dynamicScheme0.neutralPalette;
            }
            case 15: {
                return dynamicScheme0.isDark ? 20.0 : 95.0;
            }
            case 16: {
                return dynamicScheme0.tertiaryPalette;
            }
            case 17: {
                return dynamicScheme0.neutralPalette.getKeyColor().getTone();
            }
            case 18: {
                return dynamicScheme0.secondaryPalette;
            }
            case 19: {
                return dynamicScheme0.primaryPalette;
            }
            case 20: {
                return MaterialDynamicColors.b(dynamicScheme0) ? 100.0 : 10.0;
            }
            case 21: {
                return dynamicScheme0.errorPalette;
            }
            case 22: {
                return dynamicScheme0.neutralPalette;
            }
            case 23: {
                return dynamicScheme0.isDark ? 80.0 : 40.0;
            }
            case 24: {
                return dynamicScheme0.neutralPalette;
            }
            case 25: {
                return dynamicScheme0.isDark ? 10.0 : 90.0;
            }
            case 26: {
                return dynamicScheme0.neutralPalette;
            }
            case 27: {
                return dynamicScheme0.isDark ? 12.0 : 94.0;
            }
            default: {
                return dynamicScheme0.neutralVariantPalette;
            }
        }
    }
}


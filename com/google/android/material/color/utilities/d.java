package com.google.android.material.color.utilities;

import java.util.function.Function;

public final class d implements Function {
    public final int a;

    public d(int v) {
        this.a = v;
        super();
    }

    @Override
    public final Object apply(Object object0) {
        DynamicScheme dynamicScheme0 = (DynamicScheme)object0;
        switch(this.a) {
            case 0: {
                return dynamicScheme0.neutralPalette;
            }
            case 1: {
                return dynamicScheme0.isDark ? 90.0 : 20.0;
            }
            case 2: {
                return dynamicScheme0.isDark ? 6.0 : 87.0;
            }
            case 3: {
                return dynamicScheme0.errorPalette;
            }
            case 4: {
                return dynamicScheme0.isDark ? 90.0 : 10.0;
            }
            case 5: {
                return dynamicScheme0.neutralVariantPalette;
            }
            case 6: {
                return dynamicScheme0.isDark ? 30.0 : 80.0;
            }
            case 7: {
                return dynamicScheme0.errorPalette;
            }
            case 8: {
                return dynamicScheme0.isDark ? 30.0 : 90.0;
            }
            case 9: {
                return dynamicScheme0.tertiaryPalette;
            }
            case 10: {
                return MaterialDynamicColors.b(dynamicScheme0) ? 40.0 : 90.0;
            }
            case 11: {
                return dynamicScheme0.neutralVariantPalette;
            }
            case 12: {
                return dynamicScheme0.primaryPalette;
            }
            case 13: {
                if(MaterialDynamicColors.b(dynamicScheme0)) {
                    return dynamicScheme0.isDark ? 100.0 : 0.0;
                }
                return dynamicScheme0.isDark ? 80.0 : 40.0;
            }
            case 14: {
                return dynamicScheme0.neutralPalette;
            }
            case 15: {
                return dynamicScheme0.secondaryPalette;
            }
            case 16: {
                return MaterialDynamicColors.b(dynamicScheme0) ? 25.0 : 30.0;
            }
            case 17: {
                return dynamicScheme0.tertiaryPalette;
            }
            case 18: {
                return dynamicScheme0.isDark ? 80.0 : 30.0;
            }
            case 19: {
                if(MaterialDynamicColors.b(dynamicScheme0)) {
                    return dynamicScheme0.isDark ? 90.0 : 25.0;
                }
                return dynamicScheme0.isDark ? 80.0 : 40.0;
            }
            case 20: {
                return dynamicScheme0.primaryPalette;
            }
            case 21: {
                return dynamicScheme0.isDark ? 30.0 : 90.0;
            }
            case 22: {
                return dynamicScheme0.primaryPalette;
            }
            case 23: {
                return dynamicScheme0.primaryPalette.getKeyColor().getTone();
            }
            case 24: {
                return dynamicScheme0.isDark ? 6.0 : 98.0;
            }
            case 25: {
                return dynamicScheme0.tertiaryPalette;
            }
            case 26: {
                return MaterialDynamicColors.b(dynamicScheme0) ? 90.0 : 30.0;
            }
            case 27: {
                return dynamicScheme0.secondaryPalette;
            }
            case 28: {
                return dynamicScheme0.secondaryPalette.getKeyColor().getTone();
            }
            default: {
                return dynamicScheme0.neutralPalette;
            }
        }
    }
}


package com.google.android.material.color.utilities;

import java.util.function.Function;

public final class f implements Function {
    public final int a;

    public f(int v) {
        this.a = v;
        super();
    }

    @Override
    public final Object apply(Object object0) {
        DynamicScheme dynamicScheme0 = (DynamicScheme)object0;
        switch(this.a) {
            case 0: {
                return dynamicScheme0.secondaryPalette;
            }
            case 1: {
                return MaterialDynamicColors.b(dynamicScheme0) ? 80.0 : 90.0;
            }
            case 2: {
                return dynamicScheme0.primaryPalette;
            }
            case 3: {
                return MaterialDynamicColors.b(dynamicScheme0) ? 90.0 : 30.0;
            }
            case 4: {
                return dynamicScheme0.tertiaryPalette;
            }
            case 5: {
                return MaterialDynamicColors.b(dynamicScheme0) ? 30.0 : 80.0;
            }
            case 6: {
                return dynamicScheme0.errorPalette;
            }
            case 7: {
                return dynamicScheme0.isDark ? 20.0 : 100.0;
            }
            case 8: {
                return dynamicScheme0.neutralPalette;
            }
            case 9: {
                return dynamicScheme0.isDark ? 10.0 : 90.0;
            }
            case 10: {
                return dynamicScheme0.primaryPalette;
            }
            case 11: {
                return dynamicScheme0.secondaryPalette;
            }
            case 12: {
                return MaterialDynamicColors.b(dynamicScheme0) ? 70.0 : 80.0;
            }
            case 13: {
                return dynamicScheme0.neutralPalette;
            }
            case 14: {
                return dynamicScheme0.neutralVariantPalette;
            }
            case 15: {
                return dynamicScheme0.isDark ? 30.0 : 90.0;
            }
            case 16: {
                return dynamicScheme0.neutralVariantPalette;
            }
            case 17: {
                return dynamicScheme0.neutralVariantPalette.getKeyColor().getTone();
            }
            case 18: {
                return dynamicScheme0.neutralPalette;
            }
            case 19: {
                return dynamicScheme0.isDark ? 10.0 : 90.0;
            }
            case 20: {
                return dynamicScheme0.neutralPalette;
            }
            case 21: {
                return 0.0;
            }
            case 22: {
                return dynamicScheme0.neutralPalette;
            }
            case 23: {
                return dynamicScheme0.isDark ? 90.0 : 10.0;
            }
            case 24: {
                return dynamicScheme0.isDark ? 22.0 : 90.0;
            }
            case 25: {
                return dynamicScheme0.primaryPalette;
            }
            case 26: {
                return MaterialDynamicColors.b(dynamicScheme0) ? 40.0 : 90.0;
            }
            case 27: {
                return dynamicScheme0.primaryPalette;
            }
            case 28: {
                return MaterialDynamicColors.b(dynamicScheme0) ? 30.0 : 80.0;
            }
            default: {
                return dynamicScheme0.tertiaryPalette;
            }
        }
    }
}


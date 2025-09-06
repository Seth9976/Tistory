package com.google.android.material.color.utilities;

import java.util.function.Function;

public final class c implements Function {
    public final int a;
    public final MaterialDynamicColors b;

    public c(MaterialDynamicColors materialDynamicColors0, int v) {
        this.a = v;
        this.b = materialDynamicColors0;
        super();
    }

    @Override
    public final Object apply(Object object0) {
        switch(this.a) {
            case 0: {
                return this.b.secondary();
            }
            case 1: {
                return new ToneDeltaPair(this.b.secondaryContainer(), this.b.secondary(), 15.0, TonePolarity.NEARER, false);
            }
            case 2: {
                return this.b.secondaryFixedDim();
            }
            case 3: {
                return this.b.secondaryFixed();
            }
            case 4: {
                return this.b.inverseSurface();
            }
            case 5: {
                MaterialDynamicColors materialDynamicColors0 = this.b;
                materialDynamicColors0.getClass();
                if(MaterialDynamicColors.b(((DynamicScheme)object0))) {
                    return ((DynamicScheme)object0).isDark ? 0.0 : 100.0;
                }
                if(!MaterialDynamicColors.a(((DynamicScheme)object0))) {
                    return ((DynamicScheme)object0).isDark ? 90.0 : 10.0;
                }
                return DynamicColor.foregroundTone(((double)(((Double)materialDynamicColors0.tertiaryContainer().tone.apply(((DynamicScheme)object0))))), 4.5);
            }
            case 6: {
                return this.b.tertiaryContainer();
            }
            case 7: {
                MaterialDynamicColors materialDynamicColors1 = this.b;
                materialDynamicColors1.getClass();
                if(!MaterialDynamicColors.a(((DynamicScheme)object0))) {
                    return ((DynamicScheme)object0).isDark ? 90.0 : 10.0;
                }
                return DynamicColor.foregroundTone(((double)(((Double)materialDynamicColors1.secondaryContainer().tone.apply(((DynamicScheme)object0))))), 4.5);
            }
            case 8: {
                return this.b.secondaryContainer();
            }
            case 9: {
                return this.b.primaryFixedDim();
            }
            case 10: {
                return this.b.primaryFixed();
            }
            case 11: {
                return new ToneDeltaPair(this.b.errorContainer(), this.b.error(), 15.0, TonePolarity.NEARER, false);
            }
            case 12: {
                return this.b.errorContainer();
            }
            case 13: {
                return new ToneDeltaPair(this.b.errorContainer(), this.b.error(), 15.0, TonePolarity.NEARER, false);
            }
            case 14: {
                return new ToneDeltaPair(this.b.tertiaryFixed(), this.b.tertiaryFixedDim(), 10.0, TonePolarity.LIGHTER, true);
            }
            case 15: {
                return new ToneDeltaPair(this.b.primaryContainer(), this.b.primary(), 15.0, TonePolarity.NEARER, false);
            }
            case 16: {
                return this.b.secondaryFixedDim();
            }
            case 17: {
                return this.b.secondaryFixed();
            }
            case 18: {
                return new ToneDeltaPair(this.b.tertiaryContainer(), this.b.tertiary(), 15.0, TonePolarity.NEARER, false);
            }
            case 19: {
                return this.b.tertiaryFixedDim();
            }
            case 20: {
                return this.b.tertiaryFixed();
            }
            case 21: {
                return new ToneDeltaPair(this.b.secondaryContainer(), this.b.secondary(), 15.0, TonePolarity.NEARER, false);
            }
            case 22: {
                return this.b.tertiaryFixedDim();
            }
            case 23: {
                return this.b.tertiaryFixed();
            }
            case 24: {
                return new ToneDeltaPair(this.b.primaryContainer(), this.b.primary(), 15.0, TonePolarity.NEARER, false);
            }
            case 25: {
                return this.b.background();
            }
            case 26: {
                return this.b.primary();
            }
            case 27: {
                return this.b.inverseSurface();
            }
            case 28: {
                return new ToneDeltaPair(this.b.secondaryFixed(), this.b.secondaryFixedDim(), 10.0, TonePolarity.LIGHTER, true);
            }
            default: {
                return this.b.primaryFixedDim();
            }
        }
    }
}


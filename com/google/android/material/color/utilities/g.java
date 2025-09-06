package com.google.android.material.color.utilities;

import java.util.function.Function;

public final class g implements Function {
    public final int a;
    public final MaterialDynamicColors b;

    public g(MaterialDynamicColors materialDynamicColors0, int v) {
        this.a = v;
        this.b = materialDynamicColors0;
        super();
    }

    @Override
    public final Object apply(Object object0) {
        switch(this.a) {
            case 0: {
                DynamicScheme dynamicScheme0 = (DynamicScheme)object0;
                return this.b.primaryFixed();
            }
            case 1: {
                DynamicScheme dynamicScheme1 = (DynamicScheme)object0;
                return new ToneDeltaPair(this.b.tertiaryFixed(), this.b.tertiaryFixedDim(), 10.0, TonePolarity.LIGHTER, true);
            }
            case 2: {
                DynamicScheme dynamicScheme2 = (DynamicScheme)object0;
                return this.b.tertiary();
            }
            case 3: {
                DynamicScheme dynamicScheme3 = (DynamicScheme)object0;
                return this.b.error();
            }
            case 4: {
                MaterialDynamicColors materialDynamicColors0 = this.b;
                materialDynamicColors0.getClass();
                if(MaterialDynamicColors.a(((DynamicScheme)object0))) {
                    return DynamicColor.foregroundTone(((double)(((Double)materialDynamicColors0.primaryContainer().tone.apply(((DynamicScheme)object0))))), 4.5);
                }
                if(MaterialDynamicColors.b(((DynamicScheme)object0))) {
                    return ((DynamicScheme)object0).isDark ? 0.0 : 100.0;
                }
                return ((DynamicScheme)object0).isDark ? 90.0 : 10.0;
            }
            case 5: {
                DynamicScheme dynamicScheme4 = (DynamicScheme)object0;
                return this.b.primaryContainer();
            }
            case 6: {
                DynamicScheme dynamicScheme5 = (DynamicScheme)object0;
                return new ToneDeltaPair(this.b.secondaryFixed(), this.b.secondaryFixedDim(), 10.0, TonePolarity.LIGHTER, true);
            }
            case 7: {
                DynamicScheme dynamicScheme6 = (DynamicScheme)object0;
                return new ToneDeltaPair(this.b.primaryFixed(), this.b.primaryFixedDim(), 10.0, TonePolarity.LIGHTER, true);
            }
            case 8: {
                DynamicScheme dynamicScheme7 = (DynamicScheme)object0;
                return new ToneDeltaPair(this.b.primaryFixed(), this.b.primaryFixedDim(), 10.0, TonePolarity.LIGHTER, true);
            }
            case 9: {
                DynamicScheme dynamicScheme8 = (DynamicScheme)object0;
                return new ToneDeltaPair(this.b.tertiaryContainer(), this.b.tertiary(), 15.0, TonePolarity.NEARER, false);
            }
            default: {
                return this.b.highestSurface(((DynamicScheme)object0));
            }
        }
    }
}


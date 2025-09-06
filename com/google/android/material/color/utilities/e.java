package com.google.android.material.color.utilities;

import java.util.function.Function;

public final class e implements Function {
    public final int a;

    public e(int v) {
        this.a = v;
        super();
    }

    @Override
    public final Object apply(Object object0) {
        double f = 30.0;
        switch(this.a) {
            case 0: {
                return ((DynamicScheme)object0).isDark ? 10.0 : 96.0;
            }
            case 1: {
                return ((DynamicScheme)object0).secondaryPalette;
            }
            case 2: {
                double f1 = ((DynamicScheme)object0).isDark ? 30.0 : 90.0;
                if(MaterialDynamicColors.b(((DynamicScheme)object0))) {
                    if(!((DynamicScheme)object0).isDark) {
                        f = 85.0;
                    }
                    return f;
                }
                if(!MaterialDynamicColors.a(((DynamicScheme)object0))) {
                    return f1;
                }
                double f2 = ((DynamicScheme)object0).secondaryPalette.getHue();
                double f3 = ((DynamicScheme)object0).secondaryPalette.getChroma();
                boolean z = ((DynamicScheme)object0).isDark;
                Hct hct0 = Hct.from(f2, f3, f1);
                if(hct0.getChroma() < f3) {
                    Hct hct1 = hct0;
                    for(double f4 = hct0.getChroma(); hct1.getChroma() < f3; f4 = Math.max(f4, hct2.getChroma())) {
                        f1 += (z ? 1.0 : -1.0);
                        Hct hct2 = Hct.from(f2, f3, f1);
                        if(f4 > hct2.getChroma() || Math.abs(hct2.getChroma() - f3) < 0.4) {
                            break;
                        }
                        if(Math.abs(hct2.getChroma() - f3) < Math.abs(hct1.getChroma() - f3)) {
                            hct1 = hct2;
                        }
                    }
                }
                return MaterialDynamicColors.c(((DynamicScheme)object0).secondaryPalette.getHct(f1), ((DynamicScheme)object0));
            }
            case 3: {
                return ((DynamicScheme)object0).neutralPalette;
            }
            case 4: {
                return ((DynamicScheme)object0).tertiaryPalette;
            }
            case 5: {
                return MaterialDynamicColors.b(((DynamicScheme)object0)) ? 100.0 : 10.0;
            }
            case 6: {
                return ((DynamicScheme)object0).tertiaryPalette;
            }
            case 7: {
                return ((DynamicScheme)object0).tertiaryPalette.getKeyColor().getTone();
            }
            case 8: {
                return ((DynamicScheme)object0).neutralPalette;
            }
            case 9: {
                return ((DynamicScheme)object0).isDark ? 100.0 : 0.0;
            }
            case 10: {
                return ((DynamicScheme)object0).isDark ? 0.2 : 0.12;
            }
            case 11: {
                return ((DynamicScheme)object0).isDark ? 10.0 : 90.0;
            }
            case 12: {
                return ((DynamicScheme)object0).primaryPalette;
            }
            case 13: {
                if(MaterialDynamicColors.a(((DynamicScheme)object0))) {
                    return MaterialDynamicColors.c(((DynamicScheme)object0).sourceColorHct, ((DynamicScheme)object0));
                }
                if(MaterialDynamicColors.b(((DynamicScheme)object0))) {
                    return ((DynamicScheme)object0).isDark ? 85.0 : 25.0;
                }
                return ((DynamicScheme)object0).isDark ? 30.0 : 90.0;
            }
            case 14: {
                return ((DynamicScheme)object0).neutralPalette;
            }
            case 15: {
                return ((DynamicScheme)object0).isDark ? 6.0 : 98.0;
            }
            case 16: {
                return ((DynamicScheme)object0).neutralPalette;
            }
            case 17: {
                return ((DynamicScheme)object0).isDark ? 17.0 : 92.0;
            }
            case 18: {
                return ((DynamicScheme)object0).neutralPalette;
            }
            case 19: {
                return ((DynamicScheme)object0).isDark ? 90.0 : 10.0;
            }
            case 20: {
                return ((DynamicScheme)object0).tertiaryPalette;
            }
            case 21: {
                return ((DynamicScheme)object0).neutralVariantPalette;
            }
            case 22: {
                return ((DynamicScheme)object0).isDark ? 30.0 : 80.0;
            }
            case 23: {
                return ((DynamicScheme)object0).neutralPalette;
            }
            case 24: {
                return ((DynamicScheme)object0).isDark ? 24.0 : 98.0;
            }
            case 25: {
                return ((DynamicScheme)object0).primaryPalette;
            }
            case 26: {
                if(MaterialDynamicColors.b(((DynamicScheme)object0))) {
                    return ((DynamicScheme)object0).isDark ? 10.0 : 90.0;
                }
                return ((DynamicScheme)object0).isDark ? 20.0 : 100.0;
            }
            case 27: {
                return ((DynamicScheme)object0).primaryPalette;
            }
            case 28: {
                return ((DynamicScheme)object0).isDark ? 40.0 : 80.0;
            }
            default: {
                if(MaterialDynamicColors.b(((DynamicScheme)object0))) {
                    return ((DynamicScheme)object0).isDark ? 10.0 : 90.0;
                }
                return ((DynamicScheme)object0).isDark ? 20.0 : 100.0;
            }
        }
    }
}


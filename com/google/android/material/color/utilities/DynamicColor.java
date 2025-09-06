package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class DynamicColor {
    public final HashMap a;
    public final Function background;
    public final ContrastCurve contrastCurve;
    public final boolean isBackground;
    public final String name;
    public final Function opacity;
    public final Function palette;
    public final Function secondBackground;
    public final Function tone;
    public final Function toneDeltaPair;

    public DynamicColor(@NonNull String s, @NonNull Function function0, @NonNull Function function1, boolean z, @Nullable Function function2, @Nullable Function function3, @Nullable ContrastCurve contrastCurve0, @Nullable Function function4) {
        this.a = new HashMap();
        this.name = s;
        this.palette = function0;
        this.tone = function1;
        this.isBackground = z;
        this.background = function2;
        this.secondBackground = function3;
        this.contrastCurve = contrastCurve0;
        this.toneDeltaPair = function4;
        this.opacity = null;
    }

    public DynamicColor(@NonNull String s, @NonNull Function function0, @NonNull Function function1, boolean z, @Nullable Function function2, @Nullable Function function3, @Nullable ContrastCurve contrastCurve0, @Nullable Function function4, @Nullable Function function5) {
        this.a = new HashMap();
        this.name = s;
        this.palette = function0;
        this.tone = function1;
        this.isBackground = z;
        this.background = function2;
        this.secondBackground = function3;
        this.contrastCurve = contrastCurve0;
        this.toneDeltaPair = function4;
        this.opacity = function5;
    }

    // 去混淆评级： 低(20)
    public static double enableLightForeground(double f) {
        return !DynamicColor.tonePrefersLightForeground(f) || DynamicColor.toneAllowsLightForeground(f) ? f : 49.0;
    }

    public static double foregroundTone(double f, double f1) {
        double f2 = Contrast.lighterUnsafe(f, f1);
        double f3 = Contrast.darkerUnsafe(f, f1);
        double f4 = Contrast.ratioOfTones(f2, f);
        double f5 = Contrast.ratioOfTones(f3, f);
        if(DynamicColor.tonePrefersLightForeground(f)) {
            return f4 >= f1 || f4 >= f5 || Math.abs(f4 - f5) < 0.1 && f4 < f1 && f5 < f1 ? f2 : f3;
        }
        return f5 < f1 && f5 < f4 ? f2 : f3;
    }

    @NonNull
    public static DynamicColor fromArgb(@NonNull String s, int v) {
        Hct hct0 = Hct.fromInt(v);
        return DynamicColor.fromPalette(s, new a(TonalPalette.fromInt(v), 0), new a(hct0, 1));
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String s, @NonNull Function function0, @NonNull Function function1) {
        return new DynamicColor(s, function0, function1, false, null, null, null, null);
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String s, @NonNull Function function0, @NonNull Function function1, boolean z) {
        return new DynamicColor(s, function0, function1, z, null, null, null, null);
    }

    public int getArgb(@NonNull DynamicScheme dynamicScheme0) {
        int v = this.getHct(dynamicScheme0).toInt();
        return this.opacity == null ? v : MathUtils.clampInt(0, 0xFF, ((int)Math.round(((double)(((Double)this.opacity.apply(dynamicScheme0)))) * 255.0))) << 24 | v & 0xFFFFFF;
    }

    @NonNull
    public Hct getHct(@NonNull DynamicScheme dynamicScheme0) {
        HashMap hashMap0 = this.a;
        Hct hct0 = (Hct)hashMap0.get(dynamicScheme0);
        if(hct0 != null) {
            return hct0;
        }
        double f = this.getTone(dynamicScheme0);
        Hct hct1 = ((TonalPalette)this.palette.apply(dynamicScheme0)).getHct(f);
        if(hashMap0.size() > 4) {
            hashMap0.clear();
        }
        hashMap0.put(dynamicScheme0, hct1);
        return hct1;
    }

    public double getTone(@NonNull DynamicScheme dynamicScheme0) {
        double f12;
        boolean z = dynamicScheme0.contrastLevel < 0.0;
        Function function0 = this.toneDeltaPair;
        if(function0 != null) {
            ToneDeltaPair toneDeltaPair0 = (ToneDeltaPair)function0.apply(dynamicScheme0);
            DynamicColor dynamicColor0 = toneDeltaPair0.getRoleA();
            DynamicColor dynamicColor1 = toneDeltaPair0.getRoleB();
            double f = toneDeltaPair0.getDelta();
            TonePolarity tonePolarity0 = toneDeltaPair0.getPolarity();
            boolean z1 = toneDeltaPair0.getStayTogether();
            double f1 = ((DynamicColor)this.background.apply(dynamicScheme0)).getTone(dynamicScheme0);
            boolean z2 = tonePolarity0 == TonePolarity.NEARER || tonePolarity0 == TonePolarity.LIGHTER && !dynamicScheme0.isDark || tonePolarity0 == TonePolarity.DARKER && dynamicScheme0.isDark;
            DynamicColor dynamicColor2 = z2 ? dynamicColor0 : dynamicColor1;
            DynamicColor dynamicColor3 = z2 ? dynamicColor1 : dynamicColor0;
            boolean z3 = this.name.equals(dynamicColor2.name);
            double f2 = dynamicScheme0.isDark ? 1.0 : -1.0;
            double f3 = dynamicColor2.contrastCurve.getContrast(dynamicScheme0.contrastLevel);
            double f4 = dynamicColor3.contrastCurve.getContrast(dynamicScheme0.contrastLevel);
            double f5 = (double)(((Double)dynamicColor2.tone.apply(dynamicScheme0)));
            if(Contrast.ratioOfTones(f1, f5) < f3) {
                f5 = DynamicColor.foregroundTone(f1, f3);
            }
            double f6 = f5;
            double f7 = (double)(((Double)dynamicColor3.tone.apply(dynamicScheme0)));
            if(Contrast.ratioOfTones(f1, f7) < f4) {
                f7 = DynamicColor.foregroundTone(f1, f4);
            }
            if(z) {
                f6 = DynamicColor.foregroundTone(f1, f3);
                f7 = DynamicColor.foregroundTone(f1, f4);
            }
            if((f7 - f6) * f2 < f) {
                double f8 = f * f2;
                f7 = MathUtils.clampDouble(0.0, 100.0, f6 + f8);
                if((f7 - f6) * f2 < f) {
                    f6 = MathUtils.clampDouble(0.0, 100.0, f7 - f8);
                }
            }
            if(Double.compare(50.0, f6) <= 0 && f6 < 60.0) {
                if(f2 > 0.0) {
                    return z3 ? 60.0 : Math.max(f7, f * f2 + 60.0);
                }
                return z3 ? 49.0 : Math.min(f7, f * f2 + 49.0);
            }
            if(50.0 <= f7 && f7 < 60.0) {
                if(z1) {
                    if(f2 > 0.0) {
                        return z3 ? 60.0 : Math.max(f7, f * f2 + 60.0);
                    }
                    return z3 ? 49.0 : Math.min(f7, f * f2 + 49.0);
                }
                if(f2 > 0.0) {
                    return z3 ? f6 : 60.0;
                }
                return z3 ? f6 : 49.0;
            }
            return z3 ? f6 : f7;
        }
        double f9 = (double)(((Double)this.tone.apply(dynamicScheme0)));
        Function function1 = this.background;
        if(function1 == null) {
            return f9;
        }
        double f10 = ((DynamicColor)function1.apply(dynamicScheme0)).getTone(dynamicScheme0);
        double f11 = this.contrastCurve.getContrast(dynamicScheme0.contrastLevel);
        if(Contrast.ratioOfTones(f10, f9) < f11) {
            f9 = DynamicColor.foregroundTone(f10, f11);
        }
        if(z) {
            f9 = DynamicColor.foregroundTone(f10, f11);
        }
        if(!this.isBackground || 50.0 > f9 || f9 >= 60.0) {
            f12 = f9;
        }
        else if(Contrast.ratioOfTones(49.0, f10) >= f11) {
            f12 = 49.0;
        }
        else {
            f12 = 60.0;
        }
        if(this.secondBackground != null) {
            double f13 = ((DynamicColor)this.background.apply(dynamicScheme0)).getTone(dynamicScheme0);
            double f14 = ((DynamicColor)this.secondBackground.apply(dynamicScheme0)).getTone(dynamicScheme0);
            double f15 = Math.max(f13, f14);
            double f16 = Math.min(f13, f14);
            if(Contrast.ratioOfTones(f15, f12) >= f11 && Contrast.ratioOfTones(f16, f12) >= f11) {
                return f12;
            }
            double f17 = Contrast.lighter(f15, f11);
            double f18 = Contrast.darker(f16, f11);
            ArrayList arrayList0 = new ArrayList();
            int v = Double.compare(f17, -1.0);
            if(v != 0) {
                arrayList0.add(f17);
            }
            int v1 = Double.compare(f18, -1.0);
            if(v1 != 0) {
                arrayList0.add(f18);
            }
            if(!DynamicColor.tonePrefersLightForeground(f13) && !DynamicColor.tonePrefersLightForeground(f14)) {
                if(arrayList0.size() == 1) {
                    return (double)(((Double)arrayList0.get(0)));
                }
                return v1 == 0 ? 0.0 : f18;
            }
            return v == 0 ? 100.0 : f17;
        }
        return f12;
    }

    public static boolean toneAllowsLightForeground(double f) {
        return Math.round(f) <= 49L;
    }

    public static boolean tonePrefersLightForeground(double f) {
        return Math.round(f) < 60L;
    }
}


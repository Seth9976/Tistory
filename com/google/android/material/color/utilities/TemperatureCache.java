package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.text.android.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class TemperatureCache {
    public final Hct a;
    public Hct b;
    public ArrayList c;
    public List d;
    public HashMap e;

    public TemperatureCache(Hct hct0) {
        this.a = hct0;
    }

    public final List a() {
        List list0 = this.d;
        if(list0 != null) {
            return list0;
        }
        ArrayList arrayList0 = new ArrayList();
        for(double f = 0.0; f <= 360.0; ++f) {
            arrayList0.add(Hct.from(f, this.a.getChroma(), this.a.getTone()));
        }
        List list1 = Collections.unmodifiableList(arrayList0);
        this.d = list1;
        return list1;
    }

    public final List b() {
        List list0 = this.c;
        if(list0 != null) {
            return list0;
        }
        ArrayList arrayList0 = new ArrayList(this.a());
        arrayList0.add(this.a);
        Collections.sort(arrayList0, Comparator.comparing(new a(this, 2), new j(3)));
        this.c = arrayList0;
        return arrayList0;
    }

    public final Map c() {
        Map map0 = this.e;
        if(map0 != null) {
            return map0;
        }
        ArrayList arrayList0 = new ArrayList(this.a());
        arrayList0.add(this.a);
        HashMap hashMap0 = new HashMap();
        for(Object object0: arrayList0) {
            hashMap0.put(((Hct)object0), TemperatureCache.rawTemperature(((Hct)object0)));
        }
        this.e = hashMap0;
        return hashMap0;
    }

    public final Hct d() {
        return (Hct)((ArrayList)this.b()).get(((ArrayList)this.b()).size() - 1);
    }

    public static boolean e(double f, double f1, double f2) {
        return Double.compare(f1, f2) >= 0 ? f1 <= f || f <= f2 : f1 <= f && f <= f2;
    }

    public List getAnalogousColors() {
        return this.getAnalogousColors(5, 12);
    }

    public List getAnalogousColors(int v, int v1) {
        Hct hct0 = this.a;
        int v2 = (int)Math.round(hct0.getHue());
        Hct hct1 = (Hct)this.a().get(v2);
        double f = this.getRelativeTemperature(hct1);
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(hct1);
        double f1 = 0.0;
        int v3 = 0;
        while(v3 < 360) {
            int v4 = MathUtils.sanitizeDegreesInt(v2 + v3);
            double f2 = this.getRelativeTemperature(((Hct)this.a().get(v4)));
            f1 += Math.abs(f2 - f);
            ++v3;
            f = f2;
        }
        double f3 = f1 / ((double)v1);
        double f4 = this.getRelativeTemperature(hct1);
        double f5 = 0.0;
        int v5 = 1;
        while(arrayList0.size() < v1) {
            int v6 = MathUtils.sanitizeDegreesInt(v2 + v5);
            Hct hct2 = (Hct)this.a().get(v6);
            double f6 = this.getRelativeTemperature(hct2);
            f5 += Math.abs(f6 - f4);
            boolean z = f5 >= ((double)arrayList0.size()) * f3;
            for(int v7 = 1; z && arrayList0.size() < v1; ++v7) {
                arrayList0.add(hct2);
                z = f5 >= ((double)(arrayList0.size() + v7)) * f3;
            }
            ++v5;
            if(v5 > 360) {
                while(arrayList0.size() < v1) {
                    arrayList0.add(hct2);
                }
                break;
            }
            else {
                f4 = f6;
                continue;
            }
            goto label_43;
        }
        List list0 = new ArrayList();
        ((ArrayList)list0).add(hct0);
        int v8 = (int)Math.floor((((double)v) - 1.0) / 2.0);
    label_43:
        for(int v9 = 1; v9 < v8 + 1; ++v9) {
            int v10;
            for(v10 = -v9; v10 < 0; v10 += arrayList0.size()) {
            }
            if(v10 >= arrayList0.size()) {
                v10 %= arrayList0.size();
            }
            ((ArrayList)list0).add(0, ((Hct)arrayList0.get(v10)));
        }
        for(int v11 = 1; v11 < v - v8; ++v11) {
            int v12;
            for(v12 = v11; v12 < 0; v12 += arrayList0.size()) {
            }
            if(v12 >= arrayList0.size()) {
                v12 %= arrayList0.size();
            }
            ((ArrayList)list0).add(((Hct)arrayList0.get(v12)));
        }
        return list0;
    }

    public Hct getComplement() {
        Hct hct0 = this.b;
        if(hct0 != null) {
            return hct0;
        }
        double f = ((Hct)((ArrayList)this.b()).get(0)).getHue();
        double f1 = (double)(((Double)((HashMap)this.c()).get(((Hct)((ArrayList)this.b()).get(0)))));
        double f2 = this.d().getHue();
        double f3 = (double)(((Double)((HashMap)this.c()).get(this.d())));
        Hct hct1 = this.a;
        boolean z = TemperatureCache.e(hct1.getHue(), f, f2);
        double f4 = z ? f2 : f;
        if(!z) {
            f = f2;
        }
        Hct hct2 = (Hct)this.a().get(((int)Math.round(hct1.getHue())));
        double f5 = this.getRelativeTemperature(hct1);
        double f6 = 1000.0;
        for(double f7 = 0.0; f7 <= 360.0; ++f7) {
            double f8 = MathUtils.sanitizeDegreesDouble(1.0 * f7 + f4);
            if(TemperatureCache.e(f8, f4, f)) {
                Hct hct3 = (Hct)this.a().get(((int)Math.round(f8)));
                double f9 = Math.abs(1.0 - f5 - (((double)(((Double)((HashMap)this.c()).get(hct3)))) - f1) / (f3 - f1));
                if(f9 < f6) {
                    hct2 = hct3;
                    f6 = f9;
                }
            }
        }
        this.b = hct2;
        return hct2;
    }

    public double getRelativeTemperature(Hct hct0) {
        double f = ((double)(((Double)((HashMap)this.c()).get(this.d())))) - ((double)(((Double)((HashMap)this.c()).get(((Hct)((ArrayList)this.b()).get(0))))));
        return f == 0.0 ? 0.5 : (((double)(((Double)((HashMap)this.c()).get(hct0)))) - ((double)(((Double)((HashMap)this.c()).get(((Hct)((ArrayList)this.b()).get(0))))))) / f;
    }

    public static double rawTemperature(Hct hct0) {
        double[] arr_f = ColorUtils.labFromArgb(hct0.toInt());
        return Math.cos(Math.toRadians(MathUtils.sanitizeDegreesDouble(MathUtils.sanitizeDegreesDouble(Math.toDegrees(Math.atan2(arr_f[2], arr_f[1]))) - 50.0))) * (Math.pow(Math.hypot(arr_f[1], arr_f[2]), 1.07) * 0.02) - 0.5;
    }
}


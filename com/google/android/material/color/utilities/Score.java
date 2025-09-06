package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class Score {
    public static List score(Map map0) {
        return Score.score(map0, 4, 0xFF4285F4, true);
    }

    public static List score(Map map0, int v) {
        return Score.score(map0, v, 0xFF4285F4, true);
    }

    public static List score(Map map0, int v, int v1) {
        return Score.score(map0, v, v1, true);
    }

    public static List score(Map map0, int v, int v1, boolean z) {
        ArrayList arrayList0 = new ArrayList();
        int[] arr_v = new int[360];
        double f = 0.0;
        for(Object object0: map0.entrySet()) {
            Hct hct0 = Hct.fromInt(((int)(((Integer)((Map.Entry)object0).getKey()))));
            arrayList0.add(hct0);
            int v2 = (int)Math.floor(hct0.getHue());
            int v3 = (int)(((Integer)((Map.Entry)object0).getValue()));
            arr_v[v2] += v3;
            f += (double)v3;
        }
        double[] arr_f = new double[360];
        for(int v4 = 0; v4 < 360; ++v4) {
            double f1 = ((double)arr_v[v4]) / f;
            for(int v5 = v4 - 14; v5 < v4 + 16; ++v5) {
                int v6 = MathUtils.sanitizeDegreesInt(v5);
                arr_f[v6] += f1;
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            Hct hct1 = (Hct)object1;
            double f2 = arr_f[MathUtils.sanitizeDegreesInt(((int)Math.round(hct1.getHue())))];
            if(!z || hct1.getChroma() >= 5.0 && f2 > 0.01) {
                arrayList1.add(new l(hct1, (hct1.getChroma() - 48.0) * (hct1.getChroma() < 48.0 ? 0.1 : 0.3) + f2 * 70.0));
            }
        }
        Collections.sort(arrayList1, new c(6));
        ArrayList arrayList2 = new ArrayList();
        int v7 = 90;
        while(v7 >= 15) {
            arrayList2.clear();
            for(Object object2: arrayList1) {
                Hct hct2 = ((l)object2).a;
                for(Object object3: arrayList2) {
                    if(MathUtils.differenceDegrees(hct2.getHue(), ((Hct)object3).getHue()) >= ((double)v7)) {
                        continue;
                    }
                    goto label_49;
                }
                arrayList2.add(hct2);
            label_49:
                if(arrayList2.size() >= v) {
                    break;
                }
            }
            if(arrayList2.size() >= v) {
                break;
            }
            --v7;
        }
        List list0 = new ArrayList();
        if(arrayList2.isEmpty()) {
            ((ArrayList)list0).add(v1);
            return list0;
        }
        for(Object object4: arrayList2) {
            ((ArrayList)list0).add(((Hct)object4).toInt());
        }
        return list0;
    }
}


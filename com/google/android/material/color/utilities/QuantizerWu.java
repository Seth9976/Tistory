package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import l1.a;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class QuantizerWu implements Quantizer {
    public int[] a;
    public int[] b;
    public int[] c;
    public int[] d;
    public double[] e;
    public j[] f;

    public static int a(j j0, int v, int[] arr_v) {
        switch(a.c(v)) {
            case 0: {
                return -arr_v[1089 * j0.a + 33 * j0.d + j0.f] + arr_v[1089 * j0.a + 33 * j0.d + j0.e] + arr_v[1089 * j0.a + 33 * j0.c + j0.f] - arr_v[1089 * j0.a + 33 * j0.c + j0.e];
            }
            case 1: {
                return -arr_v[1089 * j0.b + 33 * j0.c + j0.f] + arr_v[1089 * j0.b + 33 * j0.c + j0.e] + arr_v[1089 * j0.a + 33 * j0.c + j0.f] - arr_v[1089 * j0.a + 33 * j0.c + j0.e];
            }
            case 2: {
                return -arr_v[1089 * j0.b + 33 * j0.d + j0.e] + arr_v[1089 * j0.b + 33 * j0.c + j0.e] + arr_v[1089 * j0.a + 33 * j0.d + j0.e] - arr_v[1089 * j0.a + 33 * j0.c + j0.e];
            }
            default: {
                throw new IllegalArgumentException("unexpected direction " + androidx.room.a.D(v));
            }
        }
    }

    // 去混淆评级： 低(20)
    public static int b(int v, int v1, int v2) [...] // Inlined contents

    public final k c(j j0, int v, int v1, int v2, int v3, int v4, int v5, int v6) {
        int v7 = QuantizerWu.a(j0, v, this.b);
        int v8 = QuantizerWu.a(j0, v, this.c);
        int v9 = QuantizerWu.a(j0, v, this.d);
        int v10 = QuantizerWu.a(j0, v, this.a);
        int v11 = -1;
        double f = 0.0;
        for(int v12 = v1; v12 < v2; ++v12) {
            int v13 = QuantizerWu.d(j0, v, v12, this.b) + v7;
            int v14 = QuantizerWu.d(j0, v, v12, this.c) + v8;
            int v15 = QuantizerWu.d(j0, v, v12, this.d) + v9;
            int v16 = QuantizerWu.d(j0, v, v12, this.a) + v10;
            if(v16 != 0) {
                int v17 = v6 - v16;
                if(v17 != 0) {
                    double f1 = ((double)((v5 - v15) * (v5 - v15) + ((v4 - v14) * (v4 - v14) + (v3 - v13) * (v3 - v13)))) / ((double)v17) + ((double)(v15 * v15 + (v14 * v14 + v13 * v13))) / ((double)v16);
                    if(f1 > f) {
                        f = f1;
                        v11 = v12;
                    }
                }
            }
        }
        k k0 = new k();  // 初始化器: Ljava/lang/Object;-><init>()V
        k0.a = v11;
        k0.b = f;
        return k0;
    }

    public static int d(j j0, int v, int v1, int[] arr_v) {
        switch(a.c(v)) {
            case 0: {
                return arr_v[1089 * v1 + 33 * j0.d + j0.f] - arr_v[1089 * v1 + 33 * j0.d + j0.e] - arr_v[1089 * v1 + 33 * j0.c + j0.f] + arr_v[1089 * v1 + 33 * j0.c + j0.e];
            }
            case 1: {
                return arr_v[1089 * j0.b + 33 * v1 + j0.f] - arr_v[1089 * j0.b + 33 * v1 + j0.e] - arr_v[1089 * j0.a + 33 * v1 + j0.f] + arr_v[1089 * j0.a + 33 * v1 + j0.e];
            }
            case 2: {
                return arr_v[1089 * j0.b + 33 * j0.d + v1] - arr_v[1089 * j0.b + 33 * j0.c + v1] - arr_v[1089 * j0.a + 33 * j0.d + v1] + arr_v[1089 * j0.a + 33 * j0.c + v1];
            }
            default: {
                throw new IllegalArgumentException("unexpected direction " + androidx.room.a.D(v));
            }
        }
    }

    public final double e(j j0) {
        int v = QuantizerWu.f(j0, this.b);
        int v1 = QuantizerWu.f(j0, this.c);
        int v2 = QuantizerWu.f(j0, this.d);
        return this.e[QuantizerWu.b(j0.b, j0.d, j0.f)] - this.e[QuantizerWu.b(j0.b, j0.d, j0.e)] - this.e[QuantizerWu.b(j0.b, j0.c, j0.f)] + this.e[QuantizerWu.b(j0.b, j0.c, j0.e)] - this.e[QuantizerWu.b(j0.a, j0.d, j0.f)] + this.e[QuantizerWu.b(j0.a, j0.d, j0.e)] + this.e[QuantizerWu.b(j0.a, j0.c, j0.f)] - this.e[QuantizerWu.b(j0.a, j0.c, j0.e)] - ((double)(v2 * v2 + (v1 * v1 + v * v))) / ((double)QuantizerWu.f(j0, this.a));
    }

    public static int f(j j0, int[] arr_v) {
        return arr_v[1089 * j0.b + 33 * j0.d + j0.f] - arr_v[1089 * j0.b + 33 * j0.d + j0.e] - arr_v[1089 * j0.b + 33 * j0.c + j0.f] + arr_v[1089 * j0.b + 33 * j0.c + j0.e] - arr_v[1089 * j0.a + 33 * j0.d + j0.f] + arr_v[1089 * j0.a + 33 * j0.d + j0.e] + arr_v[1089 * j0.a + 33 * j0.c + j0.f] - arr_v[1089 * j0.a + 33 * j0.c + j0.e];
    }

    // This method was un-flattened
    @Override  // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] arr_v, int v) {
        int v28;
        ArrayList arrayList0;
        int v27;
        int v25;
        QuantizerResult quantizerResult0 = new QuantizerMap().quantize(arr_v, v);
        this.a = new int[0x8C61];
        this.b = new int[0x8C61];
        this.c = new int[0x8C61];
        this.d = new int[0x8C61];
        this.e = new double[0x8C61];
        for(Object object0: quantizerResult0.colorToCount.entrySet()) {
            int v1 = (int)(((Integer)((Map.Entry)object0).getKey()));
            int v2 = (int)(((Integer)((Map.Entry)object0).getValue()));
            int v3 = v1 >> 16 & 0xFF;
            int v4 = v1 >> 8 & 0xFF;
            int v5 = 1089 * ((v3 >> 3) + 1) + 33 * ((v4 >> 3) + 1) + (((v1 & 0xFF) >> 3) + 1);
            this.a[v5] += v2;
            this.b[v5] = v3 * v2 + this.b[v5];
            this.c[v5] = v4 * v2 + this.c[v5];
            this.d[v5] = (v1 & 0xFF) * v2 + this.d[v5];
            this.e[v5] += (double)(((v1 & 0xFF) * (v1 & 0xFF) + (v4 * v4 + v3 * v3)) * v2);
        }
        for(int v6 = 1; v6 < 33; ++v6) {
            int[] arr_v1 = new int[33];
            int[] arr_v2 = new int[33];
            int[] arr_v3 = new int[33];
            int[] arr_v4 = new int[33];
            double[] arr_f = new double[33];
            for(int v7 = 1; v7 < 33; ++v7) {
                int v8 = 0;
                int v9 = 0;
                int v10 = 0;
                int v11 = 0;
                double f = 0.0;
                for(int v12 = 1; v12 < 33; ++v12) {
                    int v13 = 1089 * v6 + 33 * v7 + v12;
                    v8 += this.a[v13];
                    v9 += this.b[v13];
                    v10 += this.c[v13];
                    v11 += this.d[v13];
                    f += this.e[v13];
                    arr_v1[v12] += v8;
                    arr_v2[v12] += v9;
                    arr_v3[v12] += v10;
                    arr_v4[v12] += v11;
                    arr_f[v12] += f;
                    int v14 = 1089 * (v6 - 1) + 33 * v7 + v12;
                    this.a[v13] = this.a[v14] + arr_v1[v12];
                    this.b[v13] = this.b[v14] + arr_v2[v12];
                    this.c[v13] = this.c[v14] + arr_v3[v12];
                    this.d[v13] = this.d[v14] + arr_v4[v12];
                    this.e[v13] = this.e[v14] + arr_f[v12];
                }
            }
        }
        this.f = new j[v];
        for(int v15 = 0; v15 < v; ++v15) {
            j[] arr_j = this.f;
            j j0 = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
            j0.a = 0;
            j0.b = 0;
            j0.c = 0;
            j0.d = 0;
            j0.e = 0;
            j0.f = 0;
            j0.g = 0;
            arr_j[v15] = j0;
        }
        double[] arr_f1 = new double[v];
        this.f[0].b = 0x20;
        this.f[0].d = 0x20;
        this.f[0].f = 0x20;
        int v16 = 1;
        int v17 = 0;
        while(true) {
            if(v16 >= v) {
                goto label_152;
            }
            j[] arr_j1 = this.f;
            j j1 = arr_j1[v17];
            j j2 = arr_j1[v16];
            int v18 = QuantizerWu.f(j1, this.b);
            int v19 = QuantizerWu.f(j1, this.c);
            int v20 = QuantizerWu.f(j1, this.d);
            int v21 = QuantizerWu.f(j1, this.a);
            j j3 = j2;
            j j4 = j1;
            k k0 = this.c(j1, 1, j1.a + 1, j1.b, v18, v19, v20, v21);
            k k1 = this.c(j4, 2, j4.c + 1, j4.d, v18, v19, v20, v21);
            k k2 = this.c(j4, 3, j4.e + 1, j4.f, v18, v19, v20, v21);
            double f1 = k0.b;
            double f2 = k1.b;
            int v22 = k0.a;
            double f3 = k2.b;
            if(Double.compare(f1, f2) < 0 || f1 < f3) {
                if(f2 < f1 || f2 < f3) {
                    j3.b = j4.b;
                    j3.d = j4.d;
                    j3.f = j4.f;
                    int v24 = k2.a;
                    j4.f = v24;
                    j3.a = j4.a;
                    j3.c = j4.c;
                    j3.e = v24;
                }
                else {
                    j3.b = j4.b;
                    j3.d = j4.d;
                    j3.f = j4.f;
                    int v23 = k1.a;
                    j4.d = v23;
                    j3.a = j4.a;
                    j3.c = v23;
                    j3.e = j4.e;
                }
                goto label_125;
            }
            else if(v22 >= 0) {
                j3.b = j4.b;
                j3.d = j4.d;
                j3.f = j4.f;
                j4.b = v22;
                j3.a = v22;
                j3.c = j4.c;
                j3.e = j4.e;
            label_125:
                j4.g = (j4.f - j4.e) * ((j4.d - j4.c) * (j4.b - j4.a));
                j3.g = (j3.f - j3.e) * ((j3.d - j3.c) * (j3.b - j3.a));
                j j5 = this.f[v17];
                arr_f1[v17] = j5.g <= 1 ? 0.0 : this.e(j5);
                j j6 = this.f[v16];
                arr_f1[v16] = j6.g <= 1 ? 0.0 : this.e(j6);
                v25 = v16;
            }
            else {
                arr_f1[v17] = 0.0;
                v25 = v16 - 1;
            }
            double f4 = arr_f1[0];
            v17 = 0;
            for(int v26 = 1; v26 <= v25; ++v26) {
                double f5 = arr_f1[v26];
                if(f5 > f4) {
                    v17 = v26;
                    f4 = f5;
                }
            }
            if(f4 <= 0.0) {
                v27 = v25 + 1;
            }
            else {
                v16 = v25 + 1;
                continue;
            label_152:
                v27 = v;
            }
            arrayList0 = new ArrayList();
            v28 = 0;
            break;
        }
        while(v28 < v27) {
            j j7 = this.f[v28];
            int v29 = QuantizerWu.f(j7, this.a);
            if(v29 > 0) {
                int v30 = QuantizerWu.f(j7, this.b);
                int v31 = QuantizerWu.f(j7, this.c);
                arrayList0.add(((int)(QuantizerWu.f(j7, this.d) / v29 & 0xFF | ((v30 / v29 & 0xFF) << 16 | 0xFF000000 | (v31 / v29 & 0xFF) << 8))));
            }
            ++v28;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object1: arrayList0) {
            ((Integer)object1).getClass();
            linkedHashMap0.put(((Integer)object1), 0);
        }
        return new QuantizerResult(linkedHashMap0);
    }
}


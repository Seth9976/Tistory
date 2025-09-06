package com.google.android.gms.internal.measurement;

import a5.b;
import androidx.room.a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

public final class k1 implements zzlx {
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final zzlm e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final d1 k;
    public final x1 l;
    public final v0 m;
    public static final int[] n;
    public static final Unsafe o;

    static {
        k1.n = new int[0];
        k1.o = d2.j();
    }

    public k1(int[] arr_v, Object[] arr_object, int v, int v1, zzlm zzlm0, boolean z, int[] arr_v1, int v2, int v3, d1 d10, x1 x10, v0 v00, h1 h10) {
        this.a = arr_v;
        this.b = arr_object;
        this.c = v;
        this.d = v1;
        this.g = z;
        this.f = v00 != null && zzlm0 instanceof zzkc;
        this.h = arr_v1;
        this.i = v2;
        this.j = v3;
        this.k = d10;
        this.l = x10;
        this.m = v00;
        this.e = zzlm0;
    }

    public final int A(Object object0) {
        int v12;
        int v10;
        int v9;
        int v8;
        int v7;
        Unsafe unsafe0 = k1.o;
        int v1 = 0;
        for(int v = 0; true; v += 3) {
            int[] arr_v = this.a;
            if(v >= arr_v.length) {
                break;
            }
            int v2 = this.b(v);
            int v3 = v2 >>> 20 & 0xFF;
            int v4 = arr_v[v];
            long v5 = (long)(v2 & 0xFFFFF);
            if(v3 >= zzjx.zzJ.zza() && v3 <= zzjx.zzW.zza()) {
                int v6 = arr_v[v + 2];
            }
            switch(v3) {
                case 0: {
                    if(this.r(v, object0)) {
                        v1 = a.a(v4 << 3, 8, v1);
                    }
                    break;
                }
                case 1: {
                    if(this.r(v, object0)) {
                        v1 = a.a(v4 << 3, 4, v1);
                    }
                    break;
                }
                case 2: {
                    if(this.r(v, object0)) {
                        v7 = zzjm.zzA(v4 << 3);
                        v8 = zzjm.zzB(d2.g(object0, v5));
                        v12 = v8 + v7;
                        v1 = v12 + v1;
                        break;
                    }
                    break;
                }
                case 3: {
                    if(this.r(v, object0)) {
                        v7 = zzjm.zzA(v4 << 3);
                        v8 = zzjm.zzB(d2.g(object0, v5));
                        v12 = v8 + v7;
                        v1 = v12 + v1;
                        break;
                    }
                    break;
                }
                case 4: {
                    if(this.r(v, object0)) {
                        v9 = zzjm.zzA(v4 << 3);
                        v10 = zzjm.zzv(d2.f(object0, v5));
                        v12 = v10 + v9;
                        v1 = v12 + v1;
                        break;
                    }
                    break;
                }
                case 5: {
                    if(this.r(v, object0)) {
                        v1 = a.a(v4 << 3, 8, v1);
                    }
                    break;
                }
                case 6: {
                    if(this.r(v, object0)) {
                        v1 = a.a(v4 << 3, 4, v1);
                    }
                    break;
                }
                case 7: {
                    if(this.r(v, object0)) {
                        v1 = a.a(v4 << 3, 1, v1);
                    }
                    break;
                }
                case 8: {
                    if(this.r(v, object0)) {
                        Object object1 = d2.i(object0, v5);
                        if(object1 instanceof zzje) {
                            int v11 = ((zzje)object1).zzd();
                            v1 = a.b(v11, v11, zzjm.zzA(v4 << 3), v1);
                        }
                        else {
                            v9 = zzjm.zzA(v4 << 3);
                            v10 = zzjm.zzy(((String)object1));
                            v12 = v10 + v9;
                            v1 = v12 + v1;
                        }
                        break;
                    }
                    break;
                }
                case 9: {
                    if(this.r(v, object0)) {
                        v12 = r1.L(v4, d2.i(object0, v5), this.e(v));
                        v1 = v12 + v1;
                        break;
                    }
                    break;
                }
                case 10: {
                    if(this.r(v, object0)) {
                        int v13 = ((zzje)d2.i(object0, v5)).zzd();
                        v1 = a.b(v13, v13, zzjm.zzA(v4 << 3), v1);
                    }
                    break;
                }
                case 11: {
                    if(this.r(v, object0)) {
                        v1 = a.a(d2.f(object0, v5), zzjm.zzA(v4 << 3), v1);
                    }
                    break;
                }
                case 12: {
                    if(this.r(v, object0)) {
                        v9 = zzjm.zzA(v4 << 3);
                        v10 = zzjm.zzv(d2.f(object0, v5));
                        v12 = v10 + v9;
                        v1 = v12 + v1;
                        break;
                    }
                    break;
                }
                case 13: {
                    if(this.r(v, object0)) {
                        v1 = a.a(v4 << 3, 4, v1);
                    }
                    break;
                }
                case 14: {
                    if(this.r(v, object0)) {
                        v1 = a.a(v4 << 3, 8, v1);
                    }
                    break;
                }
                case 15: {
                    if(this.r(v, object0)) {
                        int v14 = d2.f(object0, v5);
                        v1 = a.a(v14 >> 0x1F ^ v14 + v14, zzjm.zzA(v4 << 3), v1);
                    }
                    break;
                }
                case 16: {
                    if(this.r(v, object0)) {
                        long v15 = d2.g(object0, v5);
                        v1 = zzjm.zzB(v15 + v15 ^ v15 >> 0x3F) + zzjm.zzA(v4 << 3) + v1;
                    }
                    break;
                }
                case 17: {
                    if(this.r(v, object0)) {
                        v12 = zzjm.a(v4, ((zzlm)d2.i(object0, v5)), this.e(v));
                        v1 = v12 + v1;
                        break;
                    }
                    break;
                }
                case 18: {
                    v12 = r1.E(v4, ((List)d2.i(object0, v5)));
                    v1 = v12 + v1;
                    break;
                }
                case 19: {
                    v12 = r1.C(v4, ((List)d2.i(object0, v5)));
                    v1 = v12 + v1;
                    break;
                }
                case 20: {
                    v12 = r1.J(v4, ((List)d2.i(object0, v5)));
                    v1 = v12 + v1;
                    break;
                }
                case 21: {
                    v12 = r1.U(v4, ((List)d2.i(object0, v5)));
                    v1 = v12 + v1;
                    break;
                }
                case 22: {
                    v12 = r1.H(v4, ((List)d2.i(object0, v5)));
                    v1 = v12 + v1;
                    break;
                }
                case 23: {
                    v12 = r1.E(v4, ((List)d2.i(object0, v5)));
                    v1 = v12 + v1;
                    break;
                }
                case 24: {
                    v12 = r1.C(v4, ((List)d2.i(object0, v5)));
                    v1 = v12 + v1;
                    break;
                }
                case 25: {
                    v12 = r1.w(v4, ((List)d2.i(object0, v5)));
                    v1 = v12 + v1;
                    break;
                }
                case 26: {
                    v12 = r1.R(v4, ((List)d2.i(object0, v5)));
                    v1 = v12 + v1;
                    break;
                }
                case 27: {
                    v12 = r1.M(v4, ((List)d2.i(object0, v5)), this.e(v));
                    v1 = v12 + v1;
                    break;
                }
                case 28: {
                    v12 = r1.z(v4, ((List)d2.i(object0, v5)));
                    v1 = v12 + v1;
                    break;
                }
                case 29: {
                    v12 = r1.S(v4, ((List)d2.i(object0, v5)));
                    v1 = v12 + v1;
                    break;
                }
                case 30: {
                    v12 = r1.A(v4, ((List)d2.i(object0, v5)));
                    v1 = v12 + v1;
                    break;
                }
                case 0x1F: {
                    v12 = r1.C(v4, ((List)d2.i(object0, v5)));
                    v1 = v12 + v1;
                    break;
                }
                case 0x20: {
                    v12 = r1.E(v4, ((List)d2.i(object0, v5)));
                    v1 = v12 + v1;
                    break;
                }
                case 33: {
                    v12 = r1.N(v4, ((List)d2.i(object0, v5)));
                    v1 = v12 + v1;
                    break;
                }
                case 34: {
                    v12 = r1.P(v4, ((List)d2.i(object0, v5)));
                    v1 = v12 + v1;
                    break;
                }
                case 35: {
                    int v16 = r1.F(((List)unsafe0.getObject(object0, v5)));
                    if(v16 > 0) {
                        v1 = a.b(v16, zzjm.zzz(v4), v16, v1);
                    }
                    break;
                }
                case 36: {
                    int v17 = r1.D(((List)unsafe0.getObject(object0, v5)));
                    if(v17 > 0) {
                        v1 = a.b(v17, zzjm.zzz(v4), v17, v1);
                    }
                    break;
                }
                case 37: {
                    int v18 = r1.K(((List)unsafe0.getObject(object0, v5)));
                    if(v18 > 0) {
                        v1 = a.b(v18, zzjm.zzz(v4), v18, v1);
                    }
                    break;
                }
                case 38: {
                    int v19 = r1.V(((List)unsafe0.getObject(object0, v5)));
                    if(v19 > 0) {
                        v1 = a.b(v19, zzjm.zzz(v4), v19, v1);
                    }
                    break;
                }
                case 39: {
                    int v20 = r1.I(((List)unsafe0.getObject(object0, v5)));
                    if(v20 > 0) {
                        v1 = a.b(v20, zzjm.zzz(v4), v20, v1);
                    }
                    break;
                }
                case 40: {
                    int v21 = r1.F(((List)unsafe0.getObject(object0, v5)));
                    if(v21 > 0) {
                        v1 = a.b(v21, zzjm.zzz(v4), v21, v1);
                    }
                    break;
                }
                case 41: {
                    int v22 = r1.D(((List)unsafe0.getObject(object0, v5)));
                    if(v22 > 0) {
                        v1 = a.b(v22, zzjm.zzz(v4), v22, v1);
                    }
                    break;
                }
                case 42: {
                    int v23 = r1.y(((List)unsafe0.getObject(object0, v5)));
                    if(v23 > 0) {
                        v1 = a.b(v23, zzjm.zzz(v4), v23, v1);
                    }
                    break;
                }
                case 43: {
                    int v24 = r1.T(((List)unsafe0.getObject(object0, v5)));
                    if(v24 > 0) {
                        v1 = a.b(v24, zzjm.zzz(v4), v24, v1);
                    }
                    break;
                }
                case 44: {
                    int v25 = r1.B(((List)unsafe0.getObject(object0, v5)));
                    if(v25 > 0) {
                        v1 = a.b(v25, zzjm.zzz(v4), v25, v1);
                    }
                    break;
                }
                case 45: {
                    int v26 = r1.D(((List)unsafe0.getObject(object0, v5)));
                    if(v26 > 0) {
                        v1 = a.b(v26, zzjm.zzz(v4), v26, v1);
                    }
                    break;
                }
                case 46: {
                    int v27 = r1.F(((List)unsafe0.getObject(object0, v5)));
                    if(v27 > 0) {
                        v1 = a.b(v27, zzjm.zzz(v4), v27, v1);
                    }
                    break;
                }
                case 0x2F: {
                    int v28 = r1.O(((List)unsafe0.getObject(object0, v5)));
                    if(v28 > 0) {
                        v1 = a.b(v28, zzjm.zzz(v4), v28, v1);
                    }
                    break;
                }
                case 0x30: {
                    int v29 = r1.Q(((List)unsafe0.getObject(object0, v5)));
                    if(v29 > 0) {
                        v1 = a.b(v29, zzjm.zzz(v4), v29, v1);
                    }
                    break;
                }
                case 49: {
                    v12 = r1.G(v4, ((List)d2.i(object0, v5)), this.e(v));
                    v1 = v12 + v1;
                    break;
                }
                case 50: {
                    h1.a(d2.i(object0, v5), this.f(v));
                    break;
                }
                case 51: {
                    if(this.t(v4, v, object0)) {
                        v1 = a.a(v4 << 3, 8, v1);
                    }
                    break;
                }
                case 52: {
                    if(this.t(v4, v, object0)) {
                        v1 = a.a(v4 << 3, 4, v1);
                    }
                    break;
                }
                case 53: {
                    if(this.t(v4, v, object0)) {
                        v7 = zzjm.zzA(v4 << 3);
                        v8 = zzjm.zzB(k1.c(object0, v5));
                        v12 = v8 + v7;
                        v1 = v12 + v1;
                        break;
                    }
                    break;
                }
                case 54: {
                    if(this.t(v4, v, object0)) {
                        v12 = zzjm.zzB(k1.c(object0, v5)) + zzjm.zzA(v4 << 3);
                        v1 = v12 + v1;
                        break;
                    }
                    break;
                }
                case 55: {
                    if(this.t(v4, v, object0)) {
                        v9 = zzjm.zzA(v4 << 3);
                        v10 = zzjm.zzv(k1.B(object0, v5));
                        v12 = v10 + v9;
                        v1 = v12 + v1;
                        break;
                    }
                    break;
                }
                case 56: {
                    if(this.t(v4, v, object0)) {
                        v1 = a.a(v4 << 3, 8, v1);
                    }
                    break;
                }
                case 57: {
                    if(this.t(v4, v, object0)) {
                        v1 = a.a(v4 << 3, 4, v1);
                    }
                    break;
                }
                case 58: {
                    if(this.t(v4, v, object0)) {
                        v1 = a.a(v4 << 3, 1, v1);
                    }
                    break;
                }
                case 59: {
                    if(this.t(v4, v, object0)) {
                        Object object2 = d2.i(object0, v5);
                        if(object2 instanceof zzje) {
                            int v30 = ((zzje)object2).zzd();
                            v1 = a.b(v30, v30, zzjm.zzA(v4 << 3), v1);
                            break;
                        }
                        else {
                            v9 = zzjm.zzA(v4 << 3);
                            v10 = zzjm.zzy(((String)object2));
                        }
                        v12 = v10 + v9;
                        v1 = v12 + v1;
                        break;
                    }
                    break;
                }
                case 60: {
                    if(this.t(v4, v, object0)) {
                        v12 = r1.L(v4, d2.i(object0, v5), this.e(v));
                        v1 = v12 + v1;
                        break;
                    }
                    break;
                }
                case 61: {
                    if(this.t(v4, v, object0)) {
                        int v31 = ((zzje)d2.i(object0, v5)).zzd();
                        v1 = a.b(v31, v31, zzjm.zzA(v4 << 3), v1);
                    }
                    break;
                }
                case 62: {
                    if(this.t(v4, v, object0)) {
                        v1 = a.a(k1.B(object0, v5), zzjm.zzA(v4 << 3), v1);
                    }
                    break;
                }
                case 0x3F: {
                    if(this.t(v4, v, object0)) {
                        v12 = zzjm.zzv(k1.B(object0, v5)) + zzjm.zzA(v4 << 3);
                        v1 = v12 + v1;
                    }
                    break;
                }
                case 0x40: {
                    if(this.t(v4, v, object0)) {
                        v1 = a.a(v4 << 3, 4, v1);
                    }
                    break;
                }
                case 65: {
                    if(this.t(v4, v, object0)) {
                        v1 = a.a(v4 << 3, 8, v1);
                    }
                    break;
                }
                case 66: {
                    if(this.t(v4, v, object0)) {
                        int v32 = k1.B(object0, v5);
                        v1 = a.a(v32 >> 0x1F ^ v32 + v32, zzjm.zzA(v4 << 3), v1);
                    }
                    break;
                }
                case 67: {
                    if(this.t(v4, v, object0)) {
                        long v33 = k1.c(object0, v5);
                        v1 = zzjm.zzB(v33 + v33 ^ v33 >> 0x3F) + zzjm.zzA(v4 << 3) + v1;
                    }
                    break;
                }
                case 68: {
                    if(this.t(v4, v, object0)) {
                        v1 = zzjm.a(v4, ((zzlm)d2.i(object0, v5)), this.e(v)) + v1;
                    }
                }
            }
        }
        this.l.getClass();
        return x1.a(x1.b(object0)) + v1;
    }

    public static int B(Object object0, long v) {
        return (int)(((Integer)d2.c.m(object0, v)));
    }

    public final void C(int v, long v1, Object object0) {
        Unsafe unsafe0 = k1.o;
        Object object1 = this.f(v);
        Object object2 = unsafe0.getObject(object0, v1);
        if(!((zzlg)object2).zze()) {
            zzlg zzlg0 = zzlg.zza().zzb();
            h1.b(zzlg0, object2);
            unsafe0.putObject(object0, v1, zzlg0);
        }
        zzlf zzlf0 = (zzlf)object1;
        throw null;
    }

    public final int D(Object object0, byte[] arr_b, int v, int v1, int v2, int v3, int v4, int v5, int v6, long v7, int v8, m0 m00) {
        Unsafe unsafe0 = k1.o;
        long v9 = (long)(this.a[v8 + 2] & 0xFFFFF);
        switch(v6) {
            case 51: {
                if(v4 == 1) {
                    unsafe0.putObject(object0, v7, Double.longBitsToDouble(n0.q(v, arr_b)));
                    unsafe0.putInt(object0, v9, v3);
                    return v + 8;
                }
                break;
            }
            case 52: {
                if(v4 == 5) {
                    unsafe0.putObject(object0, v7, Float.intBitsToFloat(n0.c(v, arr_b)));
                    unsafe0.putInt(object0, v9, v3);
                    return v + 4;
                }
                break;
            }
            case 53: 
            case 54: {
                if(v4 == 0) {
                    int v10 = n0.n(arr_b, v, m00);
                    unsafe0.putObject(object0, v7, m00.b);
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 58: {
                if(v4 == 0) {
                    int v12 = n0.n(arr_b, v, m00);
                    unsafe0.putObject(object0, v7, Boolean.valueOf(m00.b != 0L));
                    unsafe0.putInt(object0, v9, v3);
                    return v12;
                }
                break;
            }
            case 59: {
                if(v4 == 2) {
                    int v13 = n0.k(arr_b, v, m00);
                    int v14 = m00.a;
                    if(v14 == 0) {
                        unsafe0.putObject(object0, v7, "");
                    }
                    else {
                        if((v5 & 0x20000000) != 0 && !f2.d(arr_b, v13, v13 + v14)) {
                            throw zzkp.a();
                        }
                        unsafe0.putObject(object0, v7, new String(arr_b, v13, v14, zzkn.a));
                        v13 += v14;
                    }
                    unsafe0.putInt(object0, v9, v3);
                    return v13;
                }
                break;
            }
            case 60: {
                if(v4 == 2) {
                    Object object1 = this.h(v3, v8, object0);
                    int v15 = n0.p(object1, this.e(v8), arr_b, v, v1, m00);
                    this.o(v3, object0, v8, object1);
                    return v15;
                }
                break;
            }
            case 61: {
                if(v4 == 2) {
                    int v16 = n0.a(arr_b, v, m00);
                    unsafe0.putObject(object0, v7, m00.c);
                    unsafe0.putInt(object0, v9, v3);
                    return v16;
                }
                break;
            }
            case 55: 
            case 62: {
                if(v4 == 0) {
                    int v11 = n0.k(arr_b, v, m00);
                    unsafe0.putObject(object0, v7, m00.a);
                    unsafe0.putInt(object0, v9, v3);
                    return v11;
                }
                break;
            }
            case 0x3F: {
                if(v4 == 0) {
                    int v17 = n0.k(arr_b, v, m00);
                    int v18 = m00.a;
                    zzkj zzkj0 = this.d(v8);
                    if(zzkj0 != null && !zzkj0.zza(v18)) {
                        k1.w(object0).b(v2, ((long)v18));
                        return v17;
                    }
                    unsafe0.putObject(object0, v7, v18);
                    unsafe0.putInt(object0, v9, v3);
                    return v17;
                }
                break;
            }
            case 57: 
            case 0x40: {
                if(v4 == 5) {
                    unsafe0.putObject(object0, v7, n0.c(v, arr_b));
                    unsafe0.putInt(object0, v9, v3);
                    return v + 4;
                }
                break;
            }
            case 56: 
            case 65: {
                if(v4 == 1) {
                    unsafe0.putObject(object0, v7, n0.q(v, arr_b));
                    unsafe0.putInt(object0, v9, v3);
                    return v + 8;
                }
                break;
            }
            case 66: {
                if(v4 == 0) {
                    int v19 = n0.k(arr_b, v, m00);
                    unsafe0.putObject(object0, v7, ((int)(-(m00.a & 1) ^ m00.a >>> 1)));
                    unsafe0.putInt(object0, v9, v3);
                    return v19;
                }
                break;
            }
            case 67: {
                if(v4 == 0) {
                    int v20 = n0.n(arr_b, v, m00);
                    unsafe0.putObject(object0, v7, ((long)(-(m00.b & 1L) ^ m00.b >>> 1)));
                    unsafe0.putInt(object0, v9, v3);
                    return v20;
                }
                break;
            }
            case 68: {
                if(v4 == 3) {
                    Object object2 = this.h(v3, v8, object0);
                    int v21 = n0.o(object2, this.e(v8), arr_b, v, v1, v2 & -8 | 4, m00);
                    this.o(v3, object0, v8, object2);
                    return v21;
                }
                break;
            }
            default: {
                return v;
            }
        }
        return v;
    }

    public final void E(Object object0, byte[] arr_b, int v, int v1, m0 m00) {
        int v30;
        int v29;
        int v26;
        int v27;
        int v25;
        int v24;
        Object object2;
        int v16;
        int v15;
        int v14;
        int v13;
        int v12;
        int v9;
        int v8;
        Object object1 = object0;
        k1.j(object0);
        Unsafe unsafe0 = k1.o;
        int v2 = v;
        int v3 = 0;
        int v4 = 0;
        int v5 = -1;
        int v6 = 0xFFFFF;
        while(v2 < v1) {
            int v7 = arr_b[v2];
            if(v7 < 0) {
                v8 = n0.l(v7, arr_b, v2 + 1, m00);
                v9 = m00.a;
            }
            else {
                v9 = v7;
                v8 = v2 + 1;
            }
            int v10 = this.d;
            int v11 = this.c;
            if(v9 >>> 3 <= v5) {
                if(v9 >>> 3 >= v11 && v9 >>> 3 <= v10) {
                    v12 = this.G(v9 >>> 3, 0);
                }
            }
            else if(v9 >>> 3 >= v11 && v9 >>> 3 <= v10) {
                v12 = this.G(v9 >>> 3, v3 / 3);
            }
            else {
                v12 = -1;
            }
            if(v12 == -1) {
                v13 = v9 >>> 3;
                v14 = v8;
                v15 = v4;
                v16 = 0;
                object2 = object1;
            }
            else {
                int[] arr_v = this.a;
                int v17 = arr_v[v12 + 1];
                int v18 = v17 >>> 20 & 0xFF;
                long v19 = (long)(v17 & 0xFFFFF);
                int v20 = v17;
                if(v18 <= 17) {
                    int v21 = arr_v[v12 + 2];
                    int v22 = 1 << (v21 >>> 20);
                    int v23 = v21 & 0xFFFFF;
                    if(v23 == v6) {
                        v25 = v6;
                    }
                    else {
                        if(v6 != 0xFFFFF) {
                            unsafe0.putInt(object1, ((long)v6), v4);
                        }
                        v24 = v23;
                        if(v24 != 0xFFFFF) {
                            v4 = unsafe0.getInt(object1, ((long)v24));
                        }
                        v25 = v24;
                    }
                    switch(v18) {
                        case 0: {
                            v13 = v9 >>> 3;
                            v26 = v8;
                            if((v9 & 7) == 1) {
                                d2.l(object1, v19, Double.longBitsToDouble(n0.q(v26, arr_b)));
                                v2 = v26 + 8;
                                goto label_121;
                            }
                            break;
                        }
                        case 1: {
                            v13 = v9 >>> 3;
                            v26 = v8;
                            if((v9 & 7) == 5) {
                                d2.m(object1, v19, Float.intBitsToFloat(n0.c(v26, arr_b)));
                                v2 = v26 + 4;
                                goto label_121;
                            }
                            break;
                        }
                        case 2: 
                        case 3: {
                            v13 = v9 >>> 3;
                            v26 = v8;
                            if((v9 & 7) == 0) {
                                v27 = n0.n(arr_b, v26, m00);
                                unsafe0.putLong(object0, v19, m00.b);
                                goto label_130;
                            }
                            break;
                        }
                        case 7: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 0) {
                                v2 = n0.n(arr_b, v8, m00);
                                d2.k(object1, v19, m00.b != 0L);
                                goto label_121;
                            }
                            v26 = v8;
                            break;
                        }
                        case 8: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 2) {
                                v2 = (v20 & 0x20000000) == 0 ? n0.h(arr_b, v8, m00) : n0.i(arr_b, v8, m00);
                                unsafe0.putObject(object1, v19, m00.c);
                                goto label_121;
                            }
                            v26 = v8;
                            break;
                        }
                        case 9: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 2) {
                                Object object3 = this.g(v12, object1);
                                v2 = n0.p(object3, this.e(v12), arr_b, v8, v1, m00);
                                this.n(v12, object1, object3);
                                goto label_121;
                            }
                            v26 = v8;
                            break;
                        }
                        case 10: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 2) {
                                v2 = n0.a(arr_b, v8, m00);
                                unsafe0.putObject(object1, v19, m00.c);
                                goto label_121;
                            }
                            v26 = v8;
                            break;
                        }
                        case 4: 
                        case 11: {
                            v13 = v9 >>> 3;
                            v26 = v8;
                            if((v9 & 7) == 0) {
                                v2 = n0.k(arr_b, v26, m00);
                                unsafe0.putInt(object1, v19, m00.a);
                                goto label_121;
                            }
                            break;
                        }
                        case 12: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 0) {
                                v2 = n0.k(arr_b, v8, m00);
                                unsafe0.putInt(object1, v19, m00.a);
                                goto label_121;
                            }
                            v26 = v8;
                            break;
                        }
                        case 6: 
                        case 13: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 5) {
                                unsafe0.putInt(object1, v19, n0.c(v8, arr_b));
                                v2 = v8 + 4;
                                goto label_121;
                            }
                            v26 = v8;
                            break;
                        }
                        case 5: 
                        case 14: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 1) {
                                unsafe0.putLong(object0, v19, n0.q(v8, arr_b));
                                v2 = v8 + 8;
                                goto label_121;
                            }
                            v26 = v8;
                            break;
                        }
                        case 15: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 0) {
                                v2 = n0.k(arr_b, v8, m00);
                                unsafe0.putInt(object1, v19, -(m00.a & 1) ^ m00.a >>> 1);
                            label_121:
                                v4 |= v22;
                                v3 = v12;
                                v6 = v25;
                                v5 = v13;
                                continue;
                            }
                            v26 = v8;
                            break;
                        }
                        case 16: {
                            if((v9 & 7) == 0) {
                                v27 = n0.n(arr_b, v8, m00);
                                v13 = v9 >>> 3;
                                unsafe0.putLong(object0, v19, -(m00.b & 1L) ^ m00.b >>> 1);
                            label_130:
                                v4 |= v22;
                                v3 = v12;
                                v2 = v27;
                                v6 = v25;
                                v5 = v13;
                                continue;
                            }
                            else {
                                v13 = v9 >>> 3;
                            }
                            v26 = v8;
                            break;
                        }
                        default: {
                            v13 = v9 >>> 3;
                            v26 = v8;
                        }
                    }
                    v15 = v4;
                    v16 = v12;
                    v14 = v26;
                    object2 = object1;
                    v6 = v25;
                }
                else {
                    v13 = v9 >>> 3;
                    if(v18 == 27) {
                        if((v9 & 7) == 2) {
                            zzkm zzkm0 = (zzkm)unsafe0.getObject(object1, v19);
                            if(!zzkm0.zzc()) {
                                int v28 = zzkm0.size();
                                zzkm0 = zzkm0.zzd((v28 == 0 ? 10 : v28 + v28));
                                unsafe0.putObject(object1, v19, zzkm0);
                            }
                            v2 = n0.e(this.e(v12), v9, arr_b, v8, v1, zzkm0, m00);
                            v3 = v12;
                            v5 = v13;
                            continue;
                        }
                        else {
                            v29 = v8;
                            v15 = v4;
                            v30 = v6;
                            v16 = v12;
                            v14 = v29;
                            v6 = v30;
                            object2 = object0;
                            goto label_199;
                        }
                        goto label_161;
                    }
                    else {
                    label_161:
                        if(v18 <= 49) {
                            v15 = v4;
                            v30 = v6;
                            v16 = v12;
                            v2 = this.F(object0, arr_b, v8, v1, v9, v13, v9 & 7, v12, ((long)v20), v18, v19, m00);
                            if(v2 == v8) {
                                object2 = object0;
                                v14 = v2;
                                goto label_198;
                            }
                            else {
                                object1 = object0;
                                v5 = v13;
                                v4 = v15;
                                v6 = v30;
                                v3 = v16;
                                continue;
                            }
                            goto label_176;
                        }
                        else {
                        label_176:
                            v29 = v8;
                            v15 = v4;
                            v30 = v6;
                            v16 = v12;
                            if(v18 == 50) {
                                if((v9 & 7) != 2) {
                                    v14 = v29;
                                    v6 = v30;
                                    object2 = object0;
                                    goto label_199;
                                }
                                this.C(v16, v19, object0);
                                throw null;
                            }
                            else {
                                object2 = object0;
                                v2 = this.D(object0, arr_b, v29, v1, v9, v13, v9 & 7, v20, v18, v19, v16, m00);
                                if(v2 == v29) {
                                    v14 = v2;
                                }
                                else {
                                    object1 = object2;
                                    v3 = v16;
                                    v5 = v13;
                                    v4 = v15;
                                    v6 = v30;
                                    continue;
                                }
                            }
                        }
                    label_198:
                        v6 = v30;
                    }
                }
            }
        label_199:
            v2 = n0.j(v9, arr_b, v14, v1, k1.w(object0), m00);
            object1 = object2;
            v5 = v13;
            v4 = v15;
            v3 = v16;
        }
        if(v6 != 0xFFFFF) {
            unsafe0.putInt(object1, ((long)v6), v4);
        }
        if(v2 != v1) {
            throw zzkp.c();
        }
    }

    public final int F(Object object0, byte[] arr_b, int v, int v1, int v2, int v3, int v4, int v5, long v6, int v7, long v8, m0 m00) {
        int v34;
        int v14;
        int v9 = v;
        Unsafe unsafe0 = k1.o;
        zzkm zzkm0 = (zzkm)unsafe0.getObject(object0, v8);
        if(!zzkm0.zzc()) {
            int v10 = zzkm0.size();
            zzkm0 = zzkm0.zzd((v10 == 0 ? 10 : v10 + v10));
            unsafe0.putObject(object0, v8, zzkm0);
        }
        switch(v7) {
            case 26: {
                if(v4 == 2) {
                    if(Long.compare(v6 & 0x20000000L, 0L) == 0) {
                        v14 = n0.k(arr_b, v9, m00);
                        int v25 = m00.a;
                        if(v25 < 0) {
                            throw zzkp.b();
                        }
                        if(v25 == 0) {
                            zzkm0.add("");
                            goto label_129;
                        }
                        else {
                            zzkm0.add(new String(arr_b, v14, v25, zzkn.a));
                        }
                    alab1:
                        while(true) {
                            v14 += v25;
                            while(true) {
                            label_129:
                                if(v14 >= v1) {
                                    return v14;
                                }
                                int v26 = n0.k(arr_b, v14, m00);
                                if(v2 != m00.a) {
                                    return v14;
                                }
                                v14 = n0.k(arr_b, v26, m00);
                                v25 = m00.a;
                                if(v25 < 0) {
                                    break alab1;
                                }
                                if(v25 != 0) {
                                    zzkm0.add(new String(arr_b, v14, v25, zzkn.a));
                                    break;
                                }
                                zzkm0.add("");
                            }
                        }
                        throw zzkp.b();
                    }
                    v14 = n0.k(arr_b, v9, m00);
                    int v27 = m00.a;
                    if(v27 < 0) {
                        throw zzkp.b();
                    }
                    if(v27 == 0) {
                        zzkm0.add("");
                        goto label_152;
                    }
                    int v28 = v14 + v27;
                    if(!f2.d(arr_b, v14, v28)) {
                        throw zzkp.a();
                    }
                    zzkm0.add(new String(arr_b, v14, v27, zzkn.a));
                alab2:
                    while(true) {
                        v14 = v28;
                        while(true) {
                        label_152:
                            if(v14 >= v1) {
                                return v14;
                            }
                            int v29 = n0.k(arr_b, v14, m00);
                            if(v2 != m00.a) {
                                return v14;
                            }
                            v14 = n0.k(arr_b, v29, m00);
                            int v30 = m00.a;
                            if(v30 < 0) {
                                throw zzkp.b();
                            }
                            if(v30 != 0) {
                                v28 = v14 + v30;
                                if(!f2.d(arr_b, v14, v28)) {
                                    break alab2;
                                }
                                zzkm0.add(new String(arr_b, v14, v30, zzkn.a));
                                break;
                            }
                            zzkm0.add("");
                        }
                    }
                    throw zzkp.a();
                }
                break;
            }
            case 27: {
                return v4 == 2 ? n0.e(this.e(v5), v2, arr_b, v, v1, zzkm0, m00) : v9;
            label_13:
                if(v4 == 3) {
                    zzlx zzlx0 = this.e(v5);
                    int v11 = v2 & -8 | 4;
                    int v12 = n0.d(zzlx0, arr_b, v, v1, v11, m00);
                    zzkm0.add(m00.c);
                    while(v12 < v1) {
                        int v13 = n0.k(arr_b, v12, m00);
                        if(v2 != m00.a) {
                            break;
                        }
                        v12 = n0.d(zzlx0, arr_b, v13, v1, v11, m00);
                        zzkm0.add(m00.c);
                    }
                    return v12;
                }
                break;
            }
            case 28: {
                if(v4 == 2) {
                    int v31 = n0.k(arr_b, v9, m00);
                    int v32 = m00.a;
                    if(v32 < 0) {
                        throw zzkp.b();
                    }
                    if(v32 > arr_b.length - v31) {
                        throw zzkp.d();
                    }
                    if(v32 == 0) {
                        zzkm0.add(zzje.zzb);
                        goto label_179;
                    }
                    else {
                        zzkm0.add(zzje.zzl(arr_b, v31, v32));
                    }
                alab3:
                    while(true) {
                        v31 += v32;
                        while(true) {
                        label_179:
                            if(v31 >= v1) {
                                return v31;
                            }
                            int v33 = n0.k(arr_b, v31, m00);
                            if(v2 != m00.a) {
                                return v31;
                            }
                            v31 = n0.k(arr_b, v33, m00);
                            v32 = m00.a;
                            if(v32 < 0) {
                                throw zzkp.b();
                            }
                            if(v32 > arr_b.length - v31) {
                                break alab3;
                            }
                            if(v32 != 0) {
                                zzkm0.add(zzje.zzl(arr_b, v31, v32));
                                break;
                            }
                            zzkm0.add(zzje.zzb);
                        }
                    }
                    throw zzkp.d();
                }
                break;
            }
            case 18: 
            case 35: {
                if(v4 == 2) {
                    a.u(zzkm0);
                    v14 = n0.k(arr_b, v9, m00);
                    int v15 = m00.a + v14;
                    if(v14 >= v15) {
                        if(v14 != v15) {
                            throw zzkp.d();
                        }
                        return v14;
                    }
                    n0.q(v14, arr_b);
                    throw null;
                }
                if(v4 == 1) {
                    a.u(zzkm0);
                    n0.q(v9, arr_b);
                    throw null;
                }
                break;
            }
            case 19: 
            case 36: {
                if(v4 == 2) {
                    a.u(zzkm0);
                    v14 = n0.k(arr_b, v9, m00);
                    int v16 = m00.a + v14;
                    if(v14 >= v16) {
                        if(v14 != v16) {
                            throw zzkp.d();
                        }
                        return v14;
                    }
                    n0.c(v14, arr_b);
                    throw null;
                }
                if(v4 == 5) {
                    a.u(zzkm0);
                    n0.c(v9, arr_b);
                    throw null;
                }
                break;
            }
            case 20: 
            case 21: 
            case 37: 
            case 38: {
                if(v4 == 2) {
                    v14 = n0.k(arr_b, v9, m00);
                    int v17 = m00.a + v14;
                    while(v14 < v17) {
                        v14 = n0.n(arr_b, v14, m00);
                        ((e1)zzkm0).a(m00.b);
                    }
                    if(v14 != v17) {
                        throw zzkp.d();
                    }
                    return v14;
                }
                if(v4 == 0) {
                    int v18 = n0.n(arr_b, v9, m00);
                    ((e1)zzkm0).a(m00.b);
                    while(v18 < v1) {
                        int v19 = n0.k(arr_b, v18, m00);
                        if(v2 != m00.a) {
                            break;
                        }
                        v18 = n0.n(arr_b, v19, m00);
                        ((e1)zzkm0).a(m00.b);
                    }
                    return v18;
                }
                break;
            }
            case 25: 
            case 42: {
                if(v4 == 2) {
                    a.u(zzkm0);
                    v14 = n0.k(arr_b, v9, m00);
                    int v24 = m00.a + v14;
                    if(v14 >= v24) {
                        if(v14 != v24) {
                            throw zzkp.d();
                        }
                        return v14;
                    }
                    n0.n(arr_b, v14, m00);
                    throw null;
                }
                if(v4 == 0) {
                    a.u(zzkm0);
                    n0.n(arr_b, v9, m00);
                    throw null;
                }
                break;
            }
            case 22: 
            case 29: 
            case 39: 
            case 43: {
                if(v4 == 2) {
                    return n0.g(arr_b, v9, zzkm0, m00);
                }
                return v4 == 0 ? n0.m(v2, arr_b, v, v1, zzkm0, m00) : v9;
            }
            case 30: 
            case 44: {
                if(v4 == 2) {
                    v34 = n0.g(arr_b, v9, zzkm0, m00);
                }
                else if(v4 == 0) {
                    v34 = n0.m(v2, arr_b, v, v1, zzkm0, m00);
                }
                else {
                    break;
                }
                r1.a(object0, v3, zzkm0, this.d(v5), this.l);
                return v34;
            }
            case 24: 
            case 0x1F: 
            case 41: 
            case 45: {
                if(v4 == 2) {
                    v14 = n0.k(arr_b, v9, m00);
                    int v22 = m00.a + v14;
                    while(v14 < v22) {
                        ((a1)zzkm0).a(n0.c(v14, arr_b));
                        v14 += 4;
                    }
                    if(v14 != v22) {
                        throw zzkp.d();
                    }
                    return v14;
                }
                if(v4 == 5) {
                    ((a1)zzkm0).a(n0.c(v9, arr_b));
                    int v23;
                    while((v23 = v9 + 4) < v1) {
                        v9 = n0.k(arr_b, v23, m00);
                        if(v2 != m00.a) {
                            break;
                        }
                        ((a1)zzkm0).a(n0.c(v9, arr_b));
                    }
                    return v23;
                }
                break;
            }
            case 23: 
            case 0x20: 
            case 40: 
            case 46: {
                if(v4 == 2) {
                    v14 = n0.k(arr_b, v9, m00);
                    int v20 = m00.a + v14;
                    while(v14 < v20) {
                        ((e1)zzkm0).a(n0.q(v14, arr_b));
                        v14 += 8;
                    }
                    if(v14 != v20) {
                        throw zzkp.d();
                    }
                    return v14;
                }
                if(v4 == 1) {
                    ((e1)zzkm0).a(n0.q(v9, arr_b));
                    int v21;
                    while((v21 = v9 + 8) < v1) {
                        v9 = n0.k(arr_b, v21, m00);
                        if(v2 != m00.a) {
                            break;
                        }
                        ((e1)zzkm0).a(n0.q(v9, arr_b));
                    }
                    return v21;
                }
                break;
            }
            case 33: 
            case 0x2F: {
                if(v4 == 2) {
                    v14 = n0.k(arr_b, v9, m00);
                    int v35 = m00.a + v14;
                    while(v14 < v35) {
                        v14 = n0.k(arr_b, v14, m00);
                        ((a1)zzkm0).a(-(m00.a & 1) ^ m00.a >>> 1);
                    }
                    if(v14 != v35) {
                        throw zzkp.d();
                    }
                    return v14;
                }
                if(v4 == 0) {
                    int v36 = n0.k(arr_b, v9, m00);
                    ((a1)zzkm0).a(-(m00.a & 1) ^ m00.a >>> 1);
                    while(v36 < v1) {
                        int v37 = n0.k(arr_b, v36, m00);
                        if(v2 != m00.a) {
                            break;
                        }
                        v36 = n0.k(arr_b, v37, m00);
                        ((a1)zzkm0).a(-(m00.a & 1) ^ m00.a >>> 1);
                    }
                    return v36;
                }
                break;
            }
            case 34: 
            case 0x30: {
                if(v4 == 2) {
                    v14 = n0.k(arr_b, v9, m00);
                    int v38 = m00.a + v14;
                    while(v14 < v38) {
                        v14 = n0.n(arr_b, v14, m00);
                        ((e1)zzkm0).a(-(m00.b & 1L) ^ m00.b >>> 1);
                    }
                    if(v14 != v38) {
                        throw zzkp.d();
                    }
                    return v14;
                }
                if(v4 == 0) {
                    int v39 = n0.n(arr_b, v9, m00);
                    ((e1)zzkm0).a(-(m00.b & 1L) ^ m00.b >>> 1);
                    while(v39 < v1) {
                        int v40 = n0.k(arr_b, v39, m00);
                        if(v2 != m00.a) {
                            break;
                        }
                        v39 = n0.n(arr_b, v40, m00);
                        ((e1)zzkm0).a(-(m00.b & 1L) ^ m00.b >>> 1);
                    }
                    return v39;
                }
                break;
            }
            default: {
                goto label_13;
            }
        }
        return v9;
    }

    public final int G(int v, int v1) {
        int[] arr_v = this.a;
        int v2 = arr_v.length / 3 - 1;
        while(v1 <= v2) {
            int v3 = v2 + v1 >>> 1;
            int v4 = v3 * 3;
            int v5 = arr_v[v4];
            if(v == v5) {
                return v4;
            }
            if(v < v5) {
                v2 = v3 - 1;
            }
            else {
                v1 = v3 + 1;
            }
        }
        return -1;
    }

    public static int a(int v) [...] // Inlined contents

    public final int b(int v) {
        return this.a[v + 1];
    }

    public static long c(Object object0, long v) {
        return (long)(((Long)d2.c.m(object0, v)));
    }

    public final zzkj d(int v) {
        return (zzkj)this.b[v / 3 * 2 + 1];
    }

    public final zzlx e(int v) {
        int v1 = v / 3 + v / 3;
        Object[] arr_object = this.b;
        zzlx zzlx0 = (zzlx)arr_object[v1];
        if(zzlx0 != null) {
            return zzlx0;
        }
        zzlx zzlx1 = o1.c.a(((Class)arr_object[v1 + 1]));
        arr_object[v1] = zzlx1;
        return zzlx1;
    }

    public final Object f(int v) {
        return this.b[v / 3 + v / 3];
    }

    public final Object g(int v, Object object0) {
        zzlx zzlx0 = this.e(v);
        int v1 = this.b(v);
        if(!this.r(v, object0)) {
            return zzlx0.zze();
        }
        Object object1 = k1.o.getObject(object0, ((long)(v1 & 0xFFFFF)));
        if(k1.s(object1)) {
            return object1;
        }
        Object object2 = zzlx0.zze();
        if(object1 != null) {
            zzlx0.zzg(object2, object1);
        }
        return object2;
    }

    public final Object h(int v, int v1, Object object0) {
        zzlx zzlx0 = this.e(v1);
        if(!this.t(v, v1, object0)) {
            return zzlx0.zze();
        }
        int v2 = this.b(v1);
        Object object1 = k1.o.getObject(object0, ((long)(v2 & 0xFFFFF)));
        if(k1.s(object1)) {
            return object1;
        }
        Object object2 = zzlx0.zze();
        if(object1 != null) {
            zzlx0.zzg(object2, object1);
        }
        return object2;
    }

    public static Field i(Class class0, String s) {
        try {
            return class0.getDeclaredField(s);
        }
        catch(NoSuchFieldException unused_ex) {
            Field[] arr_field = class0.getDeclaredFields();
            for(int v = 0; v < arr_field.length; ++v) {
                Field field0 = arr_field[v];
                if(s.equals(field0.getName())) {
                    return field0;
                }
            }
            String s1 = Arrays.toString(arr_field);
            StringBuilder stringBuilder0 = b.w("Field ", s, " for ", class0.getName(), " not found. Known fields are ");
            stringBuilder0.append(s1);
            throw new RuntimeException(stringBuilder0.toString());
        }
    }

    public static void j(Object object0) {
        if(!k1.s(object0)) {
            throw new IllegalArgumentException("Mutating immutable message: " + object0);
        }
    }

    public final void k(int v, Object object0, Object object1) {
        if(!this.r(v, object1)) {
            return;
        }
        int v1 = this.b(v);
        Unsafe unsafe0 = k1.o;
        Object object2 = unsafe0.getObject(object1, ((long)(v1 & 0xFFFFF)));
        if(object2 == null) {
            throw new IllegalStateException("Source subfield " + this.a[v] + " is present but null: " + object1.toString());
        }
        zzlx zzlx0 = this.e(v);
        if(!this.r(v, object0)) {
            if(k1.s(object2)) {
                Object object3 = zzlx0.zze();
                zzlx0.zzg(object3, object2);
                unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object3);
            }
            else {
                unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object2);
            }
            this.m(v, object0);
            return;
        }
        Object object4 = unsafe0.getObject(object0, ((long)(v1 & 0xFFFFF)));
        if(!k1.s(object4)) {
            Object object5 = zzlx0.zze();
            zzlx0.zzg(object5, object4);
            unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object5);
            object4 = object5;
        }
        zzlx0.zzg(object4, object2);
    }

    public final void l(int v, Object object0, Object object1) {
        int[] arr_v = this.a;
        int v1 = arr_v[v];
        if(!this.t(v1, v, object1)) {
            return;
        }
        int v2 = this.b(v);
        Unsafe unsafe0 = k1.o;
        Object object2 = unsafe0.getObject(object1, ((long)(v2 & 0xFFFFF)));
        if(object2 == null) {
            throw new IllegalStateException("Source subfield " + arr_v[v] + " is present but null: " + object1.toString());
        }
        zzlx zzlx0 = this.e(v);
        if(!this.t(v1, v, object0)) {
            if(k1.s(object2)) {
                Object object3 = zzlx0.zze();
                zzlx0.zzg(object3, object2);
                unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object3);
            }
            else {
                unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object2);
            }
            d2.n(v1, ((long)(arr_v[v + 2] & 0xFFFFF)), object0);
            return;
        }
        Object object4 = unsafe0.getObject(object0, ((long)(v2 & 0xFFFFF)));
        if(!k1.s(object4)) {
            Object object5 = zzlx0.zze();
            zzlx0.zzg(object5, object4);
            unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object5);
            object4 = object5;
        }
        zzlx0.zzg(object4, object2);
    }

    public final void m(int v, Object object0) {
        int v1 = this.a[v + 2];
        if(((long)(0xFFFFF & v1)) == 0xFFFFFL) {
            return;
        }
        d2.n(1 << (v1 >>> 20) | d2.c.j(object0, ((long)(0xFFFFF & v1))), ((long)(0xFFFFF & v1)), object0);
    }

    public final void n(int v, Object object0, Object object1) {
        int v1 = this.b(v);
        k1.o.putObject(object0, ((long)(v1 & 0xFFFFF)), object1);
        this.m(v, object0);
    }

    public final void o(int v, Object object0, int v1, Object object1) {
        int v2 = this.b(v1);
        k1.o.putObject(object0, ((long)(v2 & 0xFFFFF)), object1);
        d2.n(v, ((long)(this.a[v1 + 2] & 0xFFFFF)), object0);
    }

    public final void p(Object object0, zzng zzng0) {
        int v8;
        if(!this.f) {
            int[] arr_v = this.a;
            Unsafe unsafe0 = k1.o;
            int v = 0xFFFFF;
            int v2 = 0;
            for(int v1 = 0; v1 < arr_v.length; v1 += 3) {
                int v3 = this.b(v1);
                int v4 = arr_v[v1];
                int v5 = v3 >>> 20 & 0xFF;
                if(v5 <= 17) {
                    int v6 = arr_v[v1 + 2];
                    int v7 = v6 & 0xFFFFF;
                    if(v7 != v) {
                        v2 = unsafe0.getInt(object0, ((long)v7));
                        v = v7;
                    }
                    v8 = 1 << (v6 >>> 20);
                }
                else {
                    v8 = 0;
                }
                long v9 = (long)(v3 & 0xFFFFF);
                switch(v5) {
                    case 0: {
                        if((v8 & v2) != 0) {
                            zzng0.zzf(v4, d2.d(object0, v9));
                        }
                        break;
                    }
                    case 1: {
                        if((v8 & v2) != 0) {
                            zzng0.zzo(v4, d2.e(object0, v9));
                        }
                        break;
                    }
                    case 2: {
                        if((v8 & v2) != 0) {
                            zzng0.zzt(v4, unsafe0.getLong(object0, v9));
                        }
                        break;
                    }
                    case 3: {
                        if((v8 & v2) != 0) {
                            zzng0.zzJ(v4, unsafe0.getLong(object0, v9));
                        }
                        break;
                    }
                    case 4: {
                        if((v8 & v2) != 0) {
                            zzng0.zzr(v4, unsafe0.getInt(object0, v9));
                        }
                        break;
                    }
                    case 5: {
                        if((v8 & v2) != 0) {
                            zzng0.zzm(v4, unsafe0.getLong(object0, v9));
                        }
                        break;
                    }
                    case 6: {
                        if((v8 & v2) != 0) {
                            zzng0.zzk(v4, unsafe0.getInt(object0, v9));
                        }
                        break;
                    }
                    case 7: {
                        if((v8 & v2) != 0) {
                            zzng0.zzb(v4, d2.s(object0, v9));
                        }
                        break;
                    }
                    case 8: {
                        if((v8 & v2) != 0) {
                            k1.u(v4, unsafe0.getObject(object0, v9), zzng0);
                        }
                        break;
                    }
                    case 9: {
                        if((v8 & v2) != 0) {
                            zzng0.zzv(v4, unsafe0.getObject(object0, v9), this.e(v1));
                        }
                        break;
                    }
                    case 10: {
                        if((v8 & v2) != 0) {
                            zzng0.zzd(v4, ((zzje)unsafe0.getObject(object0, v9)));
                        }
                        break;
                    }
                    case 11: {
                        if((v8 & v2) != 0) {
                            zzng0.zzH(v4, unsafe0.getInt(object0, v9));
                        }
                        break;
                    }
                    case 12: {
                        if((v8 & v2) != 0) {
                            zzng0.zzi(v4, unsafe0.getInt(object0, v9));
                        }
                        break;
                    }
                    case 13: {
                        if((v8 & v2) != 0) {
                            zzng0.zzw(v4, unsafe0.getInt(object0, v9));
                        }
                        break;
                    }
                    case 14: {
                        if((v8 & v2) != 0) {
                            zzng0.zzy(v4, unsafe0.getLong(object0, v9));
                        }
                        break;
                    }
                    case 15: {
                        if((v8 & v2) != 0) {
                            zzng0.zzA(v4, unsafe0.getInt(object0, v9));
                        }
                        break;
                    }
                    case 16: {
                        if((v8 & v2) != 0) {
                            zzng0.zzC(v4, unsafe0.getLong(object0, v9));
                        }
                        break;
                    }
                    case 17: {
                        if((v8 & v2) != 0) {
                            zzng0.zzq(v4, unsafe0.getObject(object0, v9), this.e(v1));
                        }
                        break;
                    }
                    case 18: {
                        r1.f(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, false);
                        break;
                    }
                    case 19: {
                        r1.j(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, false);
                        break;
                    }
                    case 20: {
                        r1.m(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, false);
                        break;
                    }
                    case 21: {
                        r1.u(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, false);
                        break;
                    }
                    case 22: {
                        r1.l(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, false);
                        break;
                    }
                    case 23: {
                        r1.i(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, false);
                        break;
                    }
                    case 24: {
                        r1.h(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, false);
                        break;
                    }
                    case 25: {
                        r1.d(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, false);
                        break;
                    }
                    case 26: {
                        r1.s(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0);
                        break;
                    }
                    case 27: {
                        r1.n(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, this.e(v1));
                        break;
                    }
                    case 28: {
                        r1.e(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0);
                        break;
                    }
                    case 29: {
                        r1.t(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, false);
                        break;
                    }
                    case 30: {
                        r1.g(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, false);
                        break;
                    }
                    case 0x1F: {
                        r1.o(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, false);
                        break;
                    }
                    case 0x20: {
                        r1.p(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, false);
                        break;
                    }
                    case 33: {
                        r1.q(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, false);
                        break;
                    }
                    case 34: {
                        r1.r(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, false);
                        break;
                    }
                    case 35: {
                        r1.f(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, true);
                        break;
                    }
                    case 36: {
                        r1.j(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, true);
                        break;
                    }
                    case 37: {
                        r1.m(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, true);
                        break;
                    }
                    case 38: {
                        r1.u(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, true);
                        break;
                    }
                    case 39: {
                        r1.l(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, true);
                        break;
                    }
                    case 40: {
                        r1.i(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, true);
                        break;
                    }
                    case 41: {
                        r1.h(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, true);
                        break;
                    }
                    case 42: {
                        r1.d(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, true);
                        break;
                    }
                    case 43: {
                        r1.t(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, true);
                        break;
                    }
                    case 44: {
                        r1.g(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, true);
                        break;
                    }
                    case 45: {
                        r1.o(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, true);
                        break;
                    }
                    case 46: {
                        r1.p(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, true);
                        break;
                    }
                    case 0x2F: {
                        r1.q(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, true);
                        break;
                    }
                    case 0x30: {
                        r1.r(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, true);
                        break;
                    }
                    case 49: {
                        r1.k(arr_v[v1], ((List)unsafe0.getObject(object0, v9)), zzng0, this.e(v1));
                        break;
                    }
                    case 50: {
                        if(unsafe0.getObject(object0, v9) != null) {
                            zzlf zzlf0 = (zzlf)this.f(v1);
                            throw null;
                        }
                        break;
                    }
                    case 51: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzf(v4, ((double)(((Double)d2.c.m(object0, v9)))));
                        }
                        break;
                    }
                    case 52: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzo(v4, ((float)(((Float)d2.c.m(object0, v9)))));
                        }
                        break;
                    }
                    case 53: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzt(v4, k1.c(object0, v9));
                        }
                        break;
                    }
                    case 54: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzJ(v4, k1.c(object0, v9));
                        }
                        break;
                    }
                    case 55: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzr(v4, k1.B(object0, v9));
                        }
                        break;
                    }
                    case 56: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzm(v4, k1.c(object0, v9));
                        }
                        break;
                    }
                    case 57: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzk(v4, k1.B(object0, v9));
                        }
                        break;
                    }
                    case 58: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzb(v4, ((Boolean)d2.c.m(object0, v9)).booleanValue());
                        }
                        break;
                    }
                    case 59: {
                        if(this.t(v4, v1, object0)) {
                            k1.u(v4, unsafe0.getObject(object0, v9), zzng0);
                        }
                        break;
                    }
                    case 60: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzv(v4, unsafe0.getObject(object0, v9), this.e(v1));
                        }
                        break;
                    }
                    case 61: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzd(v4, ((zzje)unsafe0.getObject(object0, v9)));
                        }
                        break;
                    }
                    case 62: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzH(v4, k1.B(object0, v9));
                        }
                        break;
                    }
                    case 0x3F: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzi(v4, k1.B(object0, v9));
                        }
                        break;
                    }
                    case 0x40: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzw(v4, k1.B(object0, v9));
                        }
                        break;
                    }
                    case 65: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzy(v4, k1.c(object0, v9));
                        }
                        break;
                    }
                    case 66: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzA(v4, k1.B(object0, v9));
                        }
                        break;
                    }
                    case 67: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzC(v4, k1.c(object0, v9));
                        }
                        break;
                    }
                    case 68: {
                        if(this.t(v4, v1, object0)) {
                            zzng0.zzq(v4, unsafe0.getObject(object0, v9), this.e(v1));
                        }
                    }
                }
            }
            this.l.getClass();
            x1.d(x1.b(object0), zzng0);
            return;
        }
        this.m.getClass();
        v0.a(object0);
        throw null;
    }

    public final boolean q(int v, Object object0, Object object1) {
        return this.r(v, object0) == this.r(v, object1);
    }

    public final boolean r(int v, Object object0) {
        int v1 = this.a[v + 2];
        if(Long.compare(v1 & 0xFFFFF, 0xFFFFFL) == 0) {
            int v2 = this.b(v);
            switch(v2 >>> 20 & 0xFF) {
                case 0: {
                    return Double.doubleToRawLongBits(d2.c.a(object0, ((long)(v2 & 0xFFFFF)))) != 0L;
                }
                case 1: {
                    return Float.floatToRawIntBits(d2.c.b(object0, ((long)(v2 & 0xFFFFF)))) != 0;
                }
                case 2: {
                    return d2.c.k(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 3: {
                    return d2.c.k(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 4: {
                    return d2.c.j(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 5: {
                    return d2.c.k(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 6: {
                    return d2.c.j(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 7: {
                    return d2.c.g(object0, ((long)(v2 & 0xFFFFF)));
                }
                case 8: {
                    Object object1 = d2.c.m(object0, ((long)(v2 & 0xFFFFF)));
                    if(object1 instanceof String) {
                        return !((String)object1).isEmpty();
                    }
                    if(!(object1 instanceof zzje)) {
                        throw new IllegalArgumentException();
                    }
                    return !zzje.zzb.equals(object1);
                }
                case 9: {
                    return d2.c.m(object0, ((long)(v2 & 0xFFFFF))) != null;
                }
                case 10: {
                    Object object2 = d2.c.m(object0, ((long)(v2 & 0xFFFFF)));
                    return !zzje.zzb.equals(object2);
                }
                case 11: {
                    return d2.c.j(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 12: {
                    return d2.c.j(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 13: {
                    return d2.c.j(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 14: {
                    return d2.c.k(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 15: {
                    return d2.c.j(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 16: {
                    return d2.c.k(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 17: {
                    return d2.c.m(object0, ((long)(v2 & 0xFFFFF))) != null;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        return (d2.c.j(object0, ((long)(v1 & 0xFFFFF))) & 1 << (v1 >>> 20)) != 0;
    }

    public static boolean s(Object object0) {
        if(object0 == null) {
            return false;
        }
        return object0 instanceof zzkf ? ((zzkf)object0).f() : true;
    }

    public final boolean t(int v, int v1, Object object0) {
        return d2.c.j(object0, ((long)(this.a[v1 + 2] & 0xFFFFF))) == v;
    }

    public static final void u(int v, Object object0, zzng zzng0) {
        if(object0 instanceof String) {
            zzng0.zzF(v, ((String)object0));
            return;
        }
        zzng0.zzd(v, ((zzje)object0));
    }

    public final int v(Object object0, byte[] arr_b, int v, int v1, int v2, m0 m00) {
        int v43;
        int v42;
        int v41;
        int v34;
        int v33;
        int v32;
        int v36;
        int v37;
        int v31;
        int v23;
        int v22;
        k1 k11;
        int[] arr_v1;
        int v21;
        int v20;
        int v19;
        int v18;
        int v17;
        int v16;
        int v12;
        int v11;
        k1 k10 = this;
        int v3 = v2;
        k1.j(object0);
        Unsafe unsafe0 = k1.o;
        int v4 = v;
        int v5 = 0;
        int v6 = -1;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0xFFFFF;
        while(true) {
            int[] arr_v = k10.a;
            if(v4 >= v1) {
                arr_v1 = arr_v;
                v23 = v3;
                k11 = k10;
                break;
            }
            int v10 = arr_b[v4];
            if(v10 < 0) {
                v11 = n0.l(v10, arr_b, v4 + 1, m00);
                v12 = m00.a;
            }
            else {
                v12 = v10;
                v11 = v4 + 1;
            }
            int v13 = v12 >>> 3;
            int v14 = k10.d;
            int v15 = k10.c;
            if(v13 > v6) {
                v16 = v13 < v15 || v13 > v14 ? -1 : k10.G(v13, v7 / 3);
            }
            else {
                v16 = v13 < v15 || v13 > v14 ? -1 : k10.G(v13, 0);
            }
            if(v16 == -1) {
                v17 = v11;
                v18 = 0;
                v19 = v8;
                v20 = v9;
                v21 = v13;
                arr_v1 = arr_v;
                k11 = k10;
                v22 = v12;
                v23 = v2;
            }
            else {
                int v24 = arr_v[v16 + 1];
                int v25 = v24 >>> 20 & 0xFF;
                int v26 = v24;
                long v27 = (long)(v24 & 0xFFFFF);
                if(v25 <= 17) {
                    int v28 = arr_v[v16 + 2];
                    int v29 = 1 << (v28 >>> 20);
                    int v30 = v28 & 0xFFFFF;
                    if(v30 == v9) {
                        v19 = v8;
                        v20 = v9;
                    }
                    else {
                        if(v9 != 0xFFFFF) {
                            unsafe0.putInt(object0, ((long)v9), v8);
                        }
                        v31 = v30;
                        v20 = v31;
                        v19 = unsafe0.getInt(object0, ((long)v31));
                    }
                    switch(v25) {
                        case 0: {
                        label_73:
                            v32 = v11;
                            v34 = v16;
                            v21 = v13;
                            v33 = v12;
                            if((v12 & 7) == 1) {
                                d2.l(object0, v27, Double.longBitsToDouble(n0.q(v32, arr_b)));
                                v4 = v32 + 8;
                                goto label_118;
                            }
                            break;
                        }
                        case 1: {
                            v32 = v11;
                            v34 = v16;
                            v21 = v13;
                            v33 = v12;
                            if((v12 & 7) == 5) {
                                d2.m(object0, v27, Float.intBitsToFloat(n0.c(v32, arr_b)));
                                v4 = v32 + 4;
                                goto label_118;
                            }
                            break;
                        }
                        case 2: 
                        case 3: {
                            v32 = v11;
                            v34 = v16;
                            v21 = v13;
                            v33 = v12;
                            if((v12 & 7) == 0) {
                                int v35 = n0.n(arr_b, v32, m00);
                                unsafe0.putLong(object0, v27, m00.b);
                                v8 = v19 | v29;
                                v6 = v21;
                                v3 = v2;
                                v5 = v33;
                                v4 = v35;
                                v7 = v34;
                                v9 = v20;
                                continue;
                            }
                            break;
                        }
                        case 7: {
                            v32 = v11;
                            v36 = v16;
                            v21 = v13;
                            v33 = v12;
                            if((v12 & 7) == 0) {
                                v4 = n0.n(arr_b, v32, m00);
                                d2.k(object0, v27, m00.b != 0L);
                                goto label_147;
                            }
                            v34 = v36;
                            break;
                        }
                        case 8: {
                            v32 = v11;
                            v36 = v16;
                            v21 = v13;
                            v33 = v12;
                            if((v12 & 7) == 2) {
                                v4 = (v26 & 0x20000000) == 0 ? n0.h(arr_b, v32, m00) : n0.i(arr_b, v32, m00);
                                unsafe0.putObject(object0, v27, m00.c);
                            label_147:
                                v6 = v21;
                                v3 = v2;
                                v7 = v36;
                                v9 = v20;
                                v8 = v19 | v29;
                                v5 = v33;
                                continue;
                            }
                            v34 = v36;
                            break;
                        }
                        case 9: {
                            v32 = v11;
                            v37 = v16;
                            v21 = v13;
                            v33 = v12;
                            if((v12 & 7) == 2) {
                                Object object2 = k10.g(v37, object0);
                                v4 = n0.p(object2, k10.e(v37), arr_b, v32, v1, m00);
                                k10.n(v37, object0, object2);
                                v8 = v19 | v29;
                                v6 = v21;
                                v3 = v2;
                                v5 = v33;
                                v7 = v37;
                                v9 = v20;
                                continue;
                            }
                            v34 = v37;
                            break;
                        }
                        case 10: {
                            v32 = v11;
                            v37 = v16;
                            v21 = v13;
                            v33 = v12;
                            if((v12 & 7) == 2) {
                                v4 = n0.a(arr_b, v32, m00);
                                unsafe0.putObject(object0, v27, m00.c);
                                goto label_203;
                            }
                            v34 = v37;
                            break;
                        }
                        case 4: 
                        case 11: {
                            v32 = v11;
                            v34 = v16;
                            v21 = v13;
                            v33 = v12;
                            if((v12 & 7) == 0) {
                                v4 = n0.k(arr_b, v32, m00);
                                unsafe0.putInt(object0, v27, m00.a);
                                goto label_118;
                            }
                            break;
                        }
                        case 12: {
                            v32 = v11;
                            v37 = v16;
                            v21 = v13;
                            v33 = v12;
                            if((v12 & 7) == 0) {
                                v4 = n0.k(arr_b, v32, m00);
                                int v38 = m00.a;
                                zzkj zzkj0 = k10.d(v37);
                                if(zzkj0 == null || zzkj0.zza(v38)) {
                                    unsafe0.putInt(object0, v27, v38);
                                    goto label_203;
                                }
                                else {
                                    k1.w(object0).b(v33, ((long)v38));
                                    v6 = v21;
                                    v3 = v2;
                                    v7 = v37;
                                    v5 = v33;
                                    v8 = v19;
                                    v9 = v20;
                                    continue;
                                }
                                goto label_196;
                            }
                            v34 = v37;
                            break;
                        }
                        case 6: 
                        case 13: {
                            v32 = v11;
                            v36 = v16;
                            v21 = v13;
                            v33 = v12;
                            if((v12 & 7) == 5) {
                                unsafe0.putInt(object0, v27, n0.c(v32, arr_b));
                                v4 = v32 + 4;
                                goto label_147;
                            }
                            v34 = v36;
                            break;
                        }
                        case 5: 
                        case 14: {
                            v32 = v11;
                            v36 = v16;
                            v21 = v13;
                            v33 = v12;
                            if((v12 & 7) == 1) {
                                v34 = v36;
                                unsafe0.putLong(object0, v27, n0.q(v32, arr_b));
                                v4 = v32 + 8;
                            label_118:
                                v8 = v19 | v29;
                                v6 = v21;
                                v3 = v2;
                                v5 = v33;
                                v7 = v34;
                                v9 = v20;
                                continue;
                            }
                            v34 = v36;
                            break;
                        }
                        case 15: {
                        label_196:
                            v32 = v11;
                            v37 = v16;
                            v21 = v13;
                            v33 = v12;
                            if((v12 & 7) == 0) {
                                v4 = n0.k(arr_b, v32, m00);
                                unsafe0.putInt(object0, v27, -(m00.a & 1) ^ m00.a >>> 1);
                            label_203:
                                v8 = v19 | v29;
                                v6 = v21;
                                v3 = v2;
                                v7 = v37;
                                v5 = v33;
                                v9 = v20;
                                continue;
                            }
                            v34 = v37;
                            break;
                        }
                        case 16: {
                            v32 = v11;
                            v21 = v13;
                            v33 = v12;
                            if((v12 & 7) == 0) {
                                int v39 = n0.n(arr_b, v32, m00);
                                unsafe0.putLong(object0, v27, -(m00.b & 1L) ^ m00.b >>> 1);
                                v8 = v19 | v29;
                                v6 = v21;
                                v3 = v2;
                                v5 = v33;
                                v4 = v39;
                                v7 = v16;
                                v9 = v20;
                                continue;
                            }
                            else {
                                v34 = v16;
                            }
                            break;
                        }
                        default: {
                            if((v12 & 7) == 3) {
                                Object object1 = k10.g(v16, object0);
                                v4 = n0.o(object1, k10.e(v16), arr_b, v11, v1, v13 << 3 | 4, m00);
                                k10.n(v16, object0, object1);
                                v8 = v19 | v29;
                                v6 = v13;
                                v5 = v12;
                                v7 = v16;
                                v9 = v20;
                                v3 = v2;
                                continue;
                            }
                            else {
                                v32 = v11;
                                v21 = v13;
                                v33 = v12;
                                v34 = v16;
                                break;
                            }
                            goto label_73;
                        }
                    }
                    v22 = v33;
                    arr_v1 = arr_v;
                    v17 = v32;
                    v18 = v34;
                    k11 = k10;
                    v23 = v2;
                }
                else {
                    v21 = v13;
                    if(v25 == 27) {
                        if((v12 & 7) == 2) {
                            zzkm zzkm0 = (zzkm)unsafe0.getObject(object0, v27);
                            if(!zzkm0.zzc()) {
                                int v40 = zzkm0.size();
                                zzkm0 = zzkm0.zzd((v40 == 0 ? 10 : v40 + v40));
                                unsafe0.putObject(object0, v27, zzkm0);
                            }
                            v4 = n0.e(k10.e(v16), v12, arr_b, v11, v1, zzkm0, m00);
                            v6 = v21;
                            v3 = v2;
                            v5 = v12;
                            v7 = v16;
                            continue;
                        }
                        else {
                            v19 = v8;
                            v20 = v9;
                            v41 = v11;
                            v42 = v12;
                            arr_v1 = arr_v;
                            v18 = v16;
                            goto label_280;
                        }
                        goto label_254;
                    }
                    else {
                    label_254:
                        v19 = v8;
                        v20 = v9;
                        if(v25 <= 49) {
                            v42 = v12;
                            arr_v1 = arr_v;
                            v18 = v16;
                            v4 = this.F(object0, arr_b, v11, v1, v12, v21, v12 & 7, v16, ((long)v26), v25, v27, m00);
                            if(v4 == v11) {
                                k11 = this;
                                v23 = v2;
                                v17 = v4;
                                v22 = v42;
                                goto label_301;
                            }
                            else {
                                k10 = this;
                                v6 = v21;
                                v3 = v2;
                                v5 = v42;
                                v8 = v19;
                                v9 = v20;
                                v7 = v18;
                                continue;
                            }
                            goto label_274;
                        }
                        else {
                        label_274:
                            v41 = v11;
                            v42 = v12;
                            arr_v1 = arr_v;
                            v18 = v16;
                            if(v25 == 50) {
                                if((v12 & 7) != 2) {
                                label_280:
                                    k11 = this;
                                    v23 = v2;
                                    v17 = v41;
                                    v22 = v42;
                                    goto label_301;
                                }
                                this.C(v18, v27, object0);
                                throw null;
                            }
                            else {
                                k11 = this;
                                v4 = this.D(object0, arr_b, v41, v1, v42, v21, v12 & 7, v26, v25, v27, v18, m00);
                                if(v4 == v41) {
                                    v23 = v2;
                                    v17 = v4;
                                    v22 = v42;
                                }
                                else {
                                    v6 = v21;
                                    v3 = v2;
                                    k10 = k11;
                                    v5 = v42;
                                    v7 = v18;
                                    v8 = v19;
                                    v9 = v20;
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        label_301:
            if(v22 == v23 && v23 != 0) {
                v4 = v17;
                v5 = v22;
                v8 = v19;
                v9 = v20;
                break;
            }
            if(k11.f) {
                zzjr zzjr0 = m00.d;
                if(zzjr0 == zzjr.c) {
                    v43 = v21;
                }
                else {
                    v43 = v21;
                    if(zzjr0.zzb(k11.e, v43) != null) {
                        zzkc zzkc0 = (zzkc)object0;
                        throw null;
                    }
                }
            }
            else {
                v43 = v21;
            }
            v4 = n0.j(v22, arr_b, v17, v1, k1.w(object0), m00);
            v3 = v23;
            v5 = v22;
            v6 = v43;
            k10 = k11;
            v8 = v19;
            v9 = v20;
            v7 = v18;
        }
        if(v9 != 0xFFFFF) {
            unsafe0.putInt(object0, ((long)v9), v8);
        }
        int v44 = k11.i;
        while(v44 < k11.j) {
            int v45 = k11.h[v44];
            int v46 = arr_v1[v45];
            Object object3 = d2.i(object0, ((long)(k11.b(v45) & 0xFFFFF)));
            if(object3 == null || k11.d(v45) == null) {
                ++v44;
                continue;
            }
            zzlg zzlg0 = (zzlg)object3;
            zzlf zzlf0 = (zzlf)k11.f(v45);
            throw null;
        }
        if(v23 == 0) {
            if(v4 != v1) {
                throw zzkp.c();
            }
            return v4;
        }
        if(v4 > v1 || v5 != v23) {
            throw zzkp.c();
        }
        return v4;
    }

    public static zzmp w(Object object0) {
        zzmp zzmp0 = ((zzkf)object0).zzc;
        if(zzmp0 == zzmp.zzc()) {
            zzmp0 = zzmp.a();
            ((zzkf)object0).zzc = zzmp0;
        }
        return zzmp0;
    }

    public static k1 x(zzlj zzlj0, d1 d10, x1 x10, v0 v00, h1 h10) {
        if(!(zzlj0 instanceof q1)) {
            throw new ClassCastException();
        }
        return k1.y(((q1)zzlj0), d10, x10, v00, h10);
    }

    public static k1 y(q1 q10, d1 d10, x1 x10, v0 v00, h1 h10) {
        Field field3;
        int v90;
        int v84;
        int v83;
        int v82;
        int v81;
        int v80;
        Field field1;
        int v78;
        int v77;
        Field field0;
        int v75;
        int v74;
        int v73;
        int v68;
        int v62;
        int v14;
        int[] arr_v;
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        int v8;
        int v2;
        boolean z = q10.zzc() == 2;
        String s = q10.a();
        int v = s.length();
        if(s.charAt(0) >= 0xD800) {
            for(int v1 = 1; true; v1 = v2) {
                v2 = v1 + 1;
                if(s.charAt(v1) < 0xD800) {
                    break;
                }
            }
        }
        else {
            v2 = 1;
        }
        int v3 = v2 + 1;
        int v4 = s.charAt(v2);
        if(v4 >= 0xD800) {
            int v5 = v4 & 0x1FFF;
            int v6 = 13;
            int v7;
            while((v7 = s.charAt(v3)) >= 0xD800) {
                v5 |= (v7 & 0x1FFF) << v6;
                v6 += 13;
                ++v3;
            }
            v4 = v5 | v7 << v6;
            ++v3;
        }
        if(v4 == 0) {
            v8 = 0;
            v9 = 0;
            v10 = 0;
            v11 = 0;
            v12 = 0;
            v13 = 0;
            arr_v = k1.n;
            v14 = 0;
        }
        else {
            int v15 = v3 + 1;
            int v16 = s.charAt(v3);
            if(v16 >= 0xD800) {
                int v17 = v16 & 0x1FFF;
                int v18 = 13;
                int v19;
                while((v19 = s.charAt(v15)) >= 0xD800) {
                    v17 |= (v19 & 0x1FFF) << v18;
                    v18 += 13;
                    ++v15;
                }
                v16 = v17 | v19 << v18;
                ++v15;
            }
            int v20 = v15 + 1;
            int v21 = s.charAt(v15);
            if(v21 >= 0xD800) {
                int v22 = v21 & 0x1FFF;
                int v23 = 13;
                int v24;
                while((v24 = s.charAt(v20)) >= 0xD800) {
                    v22 |= (v24 & 0x1FFF) << v23;
                    v23 += 13;
                    ++v20;
                }
                v21 = v22 | v24 << v23;
                ++v20;
            }
            int v25 = v20 + 1;
            v8 = s.charAt(v20);
            if(v8 >= 0xD800) {
                int v26 = v8 & 0x1FFF;
                int v27 = 13;
                int v28;
                while((v28 = s.charAt(v25)) >= 0xD800) {
                    v26 |= (v28 & 0x1FFF) << v27;
                    v27 += 13;
                    ++v25;
                }
                v8 = v26 | v28 << v27;
                ++v25;
            }
            int v29 = v25 + 1;
            v9 = s.charAt(v25);
            if(v9 >= 0xD800) {
                int v30 = v9 & 0x1FFF;
                int v31 = 13;
                int v32;
                while((v32 = s.charAt(v29)) >= 0xD800) {
                    v30 |= (v32 & 0x1FFF) << v31;
                    v31 += 13;
                    ++v29;
                }
                v9 = v30 | v32 << v31;
                ++v29;
            }
            int v33 = v29 + 1;
            v10 = s.charAt(v29);
            if(v10 >= 0xD800) {
                int v34 = v10 & 0x1FFF;
                int v35 = 13;
                int v36;
                while((v36 = s.charAt(v33)) >= 0xD800) {
                    v34 |= (v36 & 0x1FFF) << v35;
                    v35 += 13;
                    ++v33;
                }
                v10 = v34 | v36 << v35;
                ++v33;
            }
            int v37 = v33 + 1;
            int v38 = s.charAt(v33);
            if(v38 >= 0xD800) {
                int v39 = v38 & 0x1FFF;
                int v40 = 13;
                int v41;
                while((v41 = s.charAt(v37)) >= 0xD800) {
                    v39 |= (v41 & 0x1FFF) << v40;
                    v40 += 13;
                    ++v37;
                }
                v38 = v39 | v41 << v40;
                ++v37;
            }
            int v42 = v37 + 1;
            int v43 = s.charAt(v37);
            if(v43 >= 0xD800) {
                int v44 = v43 & 0x1FFF;
                int v45 = 13;
                int v46;
                while((v46 = s.charAt(v42)) >= 0xD800) {
                    v44 |= (v46 & 0x1FFF) << v45;
                    v45 += 13;
                    ++v42;
                }
                v43 = v44 | v46 << v45;
                ++v42;
            }
            int v47 = v42 + 1;
            int v48 = s.charAt(v42);
            if(v48 >= 0xD800) {
                int v49 = v48 & 0x1FFF;
                int v50 = 13;
                int v51;
                while((v51 = s.charAt(v47)) >= 0xD800) {
                    v49 |= (v51 & 0x1FFF) << v50;
                    v50 += 13;
                    ++v47;
                }
                v48 = v49 | v51 << v50;
                ++v47;
            }
            arr_v = new int[v48 + v38 + v43];
            v13 = v16 * 2 + v21;
            v14 = v16;
            v3 = v47;
            v12 = v38;
            v11 = v48;
        }
        Unsafe unsafe0 = k1.o;
        Object[] arr_object = q10.b();
        Class class0 = q10.zza().getClass();
        int[] arr_v1 = new int[v10 * 3];
        Object[] arr_object1 = new Object[v10 + v10];
        int v52 = v12 + v11;
        int v53 = v11;
        int v54 = v52;
        int v55 = 0;
        int v56 = 0;
        while(v3 < v) {
            int v57 = s.charAt(v3);
            if(v57 >= 0xD800) {
                int v58 = v57 & 0x1FFF;
                int v59 = v3 + 1;
                int v60 = 13;
                int v61;
                while((v61 = s.charAt(v59)) >= 0xD800) {
                    v58 |= (v61 & 0x1FFF) << v60;
                    v60 += 13;
                    ++v59;
                }
                v57 = v58 | v61 << v60;
                v62 = v59 + 1;
            }
            else {
                v62 = v3 + 1;
            }
            int v63 = s.charAt(v62);
            if(v63 >= 0xD800) {
                int v64 = v63 & 0x1FFF;
                int v65 = v62 + 1;
                int v66 = 13;
                int v67;
                while((v67 = s.charAt(v65)) >= 0xD800) {
                    v64 |= (v67 & 0x1FFF) << v66;
                    v66 += 13;
                    ++v65;
                }
                v63 = v64 | v67 << v66;
                v68 = v65 + 1;
            }
            else {
                v68 = v62 + 1;
            }
            if((v63 & 0x400) != 0) {
                arr_v[v56] = v55;
                ++v56;
            }
            if((v63 & 0xFF) >= 51) {
                int v69 = s.charAt(v68);
                if(v69 >= 0xD800) {
                    int v70 = v69 & 0x1FFF;
                    int v71 = v68 + 1;
                    int v72 = 13;
                    while(true) {
                        v73 = s.charAt(v71);
                        v74 = v11;
                        if(v73 < 0xD800) {
                            break;
                        }
                        v70 |= (v73 & 0x1FFF) << v72;
                        v72 += 13;
                        ++v71;
                        v11 = v74;
                    }
                    v69 = v70 | v73 << v72;
                    v75 = v71 + 1;
                }
                else {
                    v74 = v11;
                    v75 = v68 + 1;
                }
                switch((v63 & 0xFF) - 51) {
                    case 12: {
                        if(!z) {
                            arr_object1[v55 / 3 + v55 / 3 + 1] = arr_object[v13];
                            ++v13;
                        }
                        break;
                    }
                    case 9: 
                    case 17: {
                        arr_object1[v55 / 3 + v55 / 3 + 1] = arr_object[v13];
                        ++v13;
                    }
                }
                int v76 = v69 + v69;
                Object object0 = arr_object[v76];
                if(object0 instanceof Field) {
                    field0 = (Field)object0;
                }
                else {
                    field0 = k1.i(class0, ((String)object0));
                    arr_object[v76] = field0;
                }
                v77 = v8;
                v78 = v9;
                int v79 = (int)unsafe0.objectFieldOffset(field0);
                Object object1 = arr_object[v76 + 1];
                if(object1 instanceof Field) {
                    field1 = (Field)object1;
                }
                else {
                    field1 = k1.i(class0, ((String)object1));
                    arr_object[v76 + 1] = field1;
                }
                v80 = (int)unsafe0.objectFieldOffset(field1);
                v81 = v75;
                v82 = v79;
                v83 = 0;
            }
            else {
                v77 = v8;
                v78 = v9;
                v74 = v11;
                Field field2 = k1.i(class0, ((String)arr_object[v13]));
                switch(v63 & 0xFF) {
                    case 9: 
                    case 17: {
                        arr_object1[v55 / 3 + v55 / 3 + 1] = field2.getType();
                        v84 = v13 + 1;
                        break;
                    }
                    case 12: 
                    case 30: 
                    case 44: {
                        if(!z) {
                            arr_object1[v55 / 3 + v55 / 3 + 1] = arr_object[v13 + 1];
                            v84 = v13 + 2;
                            break;
                        }
                        v84 = v13 + 1;
                        break;
                    }
                    case 27: 
                    case 49: {
                        arr_object1[v55 / 3 + v55 / 3 + 1] = arr_object[v13 + 1];
                        v84 = v13 + 2;
                        break;
                    }
                    case 50: {
                        arr_v[v53] = v55;
                        int v85 = v55 / 3 + v55 / 3;
                        arr_object1[v85] = arr_object[v13 + 1];
                        if((v63 & 0x800) == 0) {
                            ++v53;
                            v84 = v13 + 2;
                        }
                        else {
                            arr_object1[v85 + 1] = arr_object[v13 + 2];
                            ++v53;
                            v84 = v13 + 3;
                        }
                        break;
                    }
                    default: {
                        v84 = v13 + 1;
                        break;
                    }
                }
                v82 = (int)unsafe0.objectFieldOffset(field2);
                v13 = v84;
                if((v63 & 0x1000) != 0x1000 || (v63 & 0xFF) > 17) {
                    v80 = 0xFFFFF;
                    v81 = v68;
                    v83 = 0;
                }
                else {
                    int v86 = v68 + 1;
                    int v87 = s.charAt(v68);
                    if(v87 >= 0xD800) {
                        int v88 = v87 & 0x1FFF;
                        int v89 = 13;
                        while(true) {
                            v81 = v86 + 1;
                            v90 = s.charAt(v86);
                            if(v90 < 0xD800) {
                                break;
                            }
                            v88 |= (v90 & 0x1FFF) << v89;
                            v89 += 13;
                            v86 = v81;
                        }
                        v87 = v88 | v90 << v89;
                    }
                    else {
                        v81 = v86;
                    }
                    int v91 = v87 / 0x20 + v14 * 2;
                    Object object2 = arr_object[v91];
                    if(object2 instanceof Field) {
                        field3 = (Field)object2;
                    }
                    else {
                        field3 = k1.i(class0, ((String)object2));
                        arr_object[v91] = field3;
                    }
                    v80 = (int)unsafe0.objectFieldOffset(field3);
                    v83 = v87 % 0x20;
                }
                if((v63 & 0xFF) >= 18 && (v63 & 0xFF) <= 49) {
                    arr_v[v54] = v82;
                    ++v54;
                }
            }
            arr_v1[v55] = v57;
            int v92 = v55 + 2;
            arr_v1[v55 + 1] = ((v63 & 0x200) == 0 ? 0 : 0x20000000) | ((v63 & 0x100) == 0 ? 0 : 0x10000000) | (v63 & 0xFF) << 20 | v82;
            v55 += 3;
            arr_v1[v92] = v83 << 20 | v80;
            v8 = v77;
            v3 = v81;
            v9 = v78;
            v11 = v74;
        }
        return new k1(arr_v1, arr_object1, v8, v9, q10.zza(), z, arr_v, v11, v52, d10, x10, v00, h10);
    }

    public final int z(Object object0) {
        int v16;
        int v14;
        int v13;
        int v12;
        int v11;
        int v9;
        Unsafe unsafe0 = k1.o;
        int v = 0xFFFFF;
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 0; true; v1 += 3) {
            int[] arr_v = this.a;
            if(v1 >= arr_v.length) {
                break;
            }
            int v4 = this.b(v1);
            int v5 = arr_v[v1];
            int v6 = v4 >>> 20 & 0xFF;
            if(v6 <= 17) {
                int v7 = arr_v[v1 + 2];
                int v8 = v7 & 0xFFFFF;
                v9 = 1 << (v7 >>> 20);
                if(v8 != v) {
                    v3 = unsafe0.getInt(object0, ((long)v8));
                    v = v8;
                }
            }
            else {
                v9 = 0;
            }
            long v10 = (long)(v4 & 0xFFFFF);
            switch(v6) {
                case 0: {
                    if((v3 & v9) != 0) {
                        v2 = a.a(v5 << 3, 8, v2);
                    }
                    break;
                }
                case 1: {
                    if((v3 & v9) != 0) {
                        v2 = a.a(v5 << 3, 4, v2);
                    }
                    break;
                }
                case 2: {
                    if((v9 & v3) != 0) {
                        v11 = zzjm.zzA(v5 << 3);
                        v12 = zzjm.zzB(unsafe0.getLong(object0, v10));
                        v16 = v12 + v11;
                        v2 += v16;
                        break;
                    }
                    break;
                }
                case 3: {
                    if((v9 & v3) != 0) {
                        v11 = zzjm.zzA(v5 << 3);
                        v12 = zzjm.zzB(unsafe0.getLong(object0, v10));
                        v16 = v12 + v11;
                        v2 += v16;
                        break;
                    }
                    break;
                }
                case 4: {
                    if((v9 & v3) != 0) {
                        v13 = zzjm.zzA(v5 << 3);
                        v14 = zzjm.zzv(unsafe0.getInt(object0, v10));
                        v16 = v14 + v13;
                        v2 += v16;
                        break;
                    }
                    break;
                }
                case 5: {
                    if((v3 & v9) != 0) {
                        v2 = a.a(v5 << 3, 8, v2);
                    }
                    break;
                }
                case 6: {
                    if((v3 & v9) != 0) {
                        v2 = a.a(v5 << 3, 4, v2);
                    }
                    break;
                }
                case 7: {
                    if((v3 & v9) != 0) {
                        v2 = a.a(v5 << 3, 1, v2);
                    }
                    break;
                }
                case 8: {
                    if((v9 & v3) != 0) {
                        Object object1 = unsafe0.getObject(object0, v10);
                        if(object1 instanceof zzje) {
                            int v15 = ((zzje)object1).zzd();
                            v2 = a.b(v15, v15, zzjm.zzA(v5 << 3), v2);
                        }
                        else {
                            v13 = zzjm.zzA(v5 << 3);
                            v14 = zzjm.zzy(((String)object1));
                            v16 = v14 + v13;
                            v2 += v16;
                        }
                        break;
                    }
                    break;
                }
                case 9: {
                    if((v9 & v3) != 0) {
                        v16 = r1.L(v5, unsafe0.getObject(object0, v10), this.e(v1));
                        v2 += v16;
                        break;
                    }
                    break;
                }
                case 10: {
                    if((v9 & v3) != 0) {
                        int v17 = ((zzje)unsafe0.getObject(object0, v10)).zzd();
                        v2 = a.b(v17, v17, zzjm.zzA(v5 << 3), v2);
                    }
                    break;
                }
                case 11: {
                    if((v9 & v3) != 0) {
                        v2 = a.a(unsafe0.getInt(object0, v10), zzjm.zzA(v5 << 3), v2);
                    }
                    break;
                }
                case 12: {
                    if((v9 & v3) != 0) {
                        v13 = zzjm.zzA(v5 << 3);
                        v14 = zzjm.zzv(unsafe0.getInt(object0, v10));
                        v16 = v14 + v13;
                        v2 += v16;
                        break;
                    }
                    break;
                }
                case 13: {
                    if((v3 & v9) != 0) {
                        v2 = a.a(v5 << 3, 4, v2);
                    }
                    break;
                }
                case 14: {
                    if((v3 & v9) != 0) {
                        v2 = a.a(v5 << 3, 8, v2);
                    }
                    break;
                }
                case 15: {
                    if((v9 & v3) != 0) {
                        int v18 = unsafe0.getInt(object0, v10);
                        v2 = a.a(v18 >> 0x1F ^ v18 + v18, zzjm.zzA(v5 << 3), v2);
                    }
                    break;
                }
                case 16: {
                    if((v9 & v3) != 0) {
                        long v19 = unsafe0.getLong(object0, v10);
                        v11 = zzjm.zzA(v5 << 3);
                        v12 = zzjm.zzB(v19 >> 0x3F ^ v19 + v19);
                        v16 = v12 + v11;
                        v2 += v16;
                        break;
                    }
                    break;
                }
                case 17: {
                    if((v9 & v3) != 0) {
                        v16 = zzjm.a(v5, ((zzlm)unsafe0.getObject(object0, v10)), this.e(v1));
                        v2 += v16;
                        break;
                    }
                    break;
                }
                case 18: {
                    v16 = r1.E(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v16;
                    break;
                }
                case 19: {
                    v16 = r1.C(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v16;
                    break;
                }
                case 20: {
                    v16 = r1.J(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v16;
                    break;
                }
                case 21: {
                    v16 = r1.U(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v16;
                    break;
                }
                case 22: {
                    v16 = r1.H(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v16;
                    break;
                }
                case 23: {
                    v16 = r1.E(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v16;
                    break;
                }
                case 24: {
                    v16 = r1.C(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v16;
                    break;
                }
                case 25: {
                    v16 = r1.w(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v16;
                    break;
                }
                case 26: {
                    v16 = r1.R(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v16;
                    break;
                }
                case 27: {
                    v16 = r1.M(v5, ((List)unsafe0.getObject(object0, v10)), this.e(v1));
                    v2 += v16;
                    break;
                }
                case 28: {
                    v16 = r1.z(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v16;
                    break;
                }
                case 29: {
                    v16 = r1.S(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v16;
                    break;
                }
                case 30: {
                    v16 = r1.A(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v16;
                    break;
                }
                case 0x1F: {
                    v16 = r1.C(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v16;
                    break;
                }
                case 0x20: {
                    v16 = r1.E(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v16;
                    break;
                }
                case 33: {
                    v16 = r1.N(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v16;
                    break;
                }
                case 34: {
                    v16 = r1.P(v5, ((List)unsafe0.getObject(object0, v10)));
                    v2 += v16;
                    break;
                }
                case 35: {
                    int v20 = r1.F(((List)unsafe0.getObject(object0, v10)));
                    if(v20 > 0) {
                        v2 = a.b(v20, zzjm.zzz(v5), v20, v2);
                    }
                    break;
                }
                case 36: {
                    int v21 = r1.D(((List)unsafe0.getObject(object0, v10)));
                    if(v21 > 0) {
                        v2 = a.b(v21, zzjm.zzz(v5), v21, v2);
                    }
                    break;
                }
                case 37: {
                    int v22 = r1.K(((List)unsafe0.getObject(object0, v10)));
                    if(v22 > 0) {
                        v2 = a.b(v22, zzjm.zzz(v5), v22, v2);
                    }
                    break;
                }
                case 38: {
                    int v23 = r1.V(((List)unsafe0.getObject(object0, v10)));
                    if(v23 > 0) {
                        v2 = a.b(v23, zzjm.zzz(v5), v23, v2);
                    }
                    break;
                }
                case 39: {
                    int v24 = r1.I(((List)unsafe0.getObject(object0, v10)));
                    if(v24 > 0) {
                        v2 = a.b(v24, zzjm.zzz(v5), v24, v2);
                    }
                    break;
                }
                case 40: {
                    int v25 = r1.F(((List)unsafe0.getObject(object0, v10)));
                    if(v25 > 0) {
                        v2 = a.b(v25, zzjm.zzz(v5), v25, v2);
                    }
                    break;
                }
                case 41: {
                    int v26 = r1.D(((List)unsafe0.getObject(object0, v10)));
                    if(v26 > 0) {
                        v2 = a.b(v26, zzjm.zzz(v5), v26, v2);
                    }
                    break;
                }
                case 42: {
                    int v27 = r1.y(((List)unsafe0.getObject(object0, v10)));
                    if(v27 > 0) {
                        v2 = a.b(v27, zzjm.zzz(v5), v27, v2);
                    }
                    break;
                }
                case 43: {
                    int v28 = r1.T(((List)unsafe0.getObject(object0, v10)));
                    if(v28 > 0) {
                        v2 = a.b(v28, zzjm.zzz(v5), v28, v2);
                    }
                    break;
                }
                case 44: {
                    int v29 = r1.B(((List)unsafe0.getObject(object0, v10)));
                    if(v29 > 0) {
                        v2 = a.b(v29, zzjm.zzz(v5), v29, v2);
                    }
                    break;
                }
                case 45: {
                    int v30 = r1.D(((List)unsafe0.getObject(object0, v10)));
                    if(v30 > 0) {
                        v2 = a.b(v30, zzjm.zzz(v5), v30, v2);
                    }
                    break;
                }
                case 46: {
                    int v31 = r1.F(((List)unsafe0.getObject(object0, v10)));
                    if(v31 > 0) {
                        v2 = a.b(v31, zzjm.zzz(v5), v31, v2);
                    }
                    break;
                }
                case 0x2F: {
                    int v32 = r1.O(((List)unsafe0.getObject(object0, v10)));
                    if(v32 > 0) {
                        v2 = a.b(v32, zzjm.zzz(v5), v32, v2);
                    }
                    break;
                }
                case 0x30: {
                    int v33 = r1.Q(((List)unsafe0.getObject(object0, v10)));
                    if(v33 > 0) {
                        v2 = a.b(v33, zzjm.zzz(v5), v33, v2);
                    }
                    break;
                }
                case 49: {
                    v16 = r1.G(v5, ((List)unsafe0.getObject(object0, v10)), this.e(v1));
                    v2 += v16;
                    break;
                }
                case 50: {
                    h1.a(unsafe0.getObject(object0, v10), this.f(v1));
                    break;
                }
                case 51: {
                    if(this.t(v5, v1, object0)) {
                        v2 = a.a(v5 << 3, 8, v2);
                    }
                    break;
                }
                case 52: {
                    if(this.t(v5, v1, object0)) {
                        v2 = a.a(v5 << 3, 4, v2);
                    }
                    break;
                }
                case 53: {
                    if(this.t(v5, v1, object0)) {
                        v11 = zzjm.zzA(v5 << 3);
                        v12 = zzjm.zzB(k1.c(object0, v10));
                        v16 = v12 + v11;
                        v2 += v16;
                        break;
                    }
                    break;
                }
                case 54: {
                    if(this.t(v5, v1, object0)) {
                        v11 = zzjm.zzA(v5 << 3);
                        v12 = zzjm.zzB(k1.c(object0, v10));
                        v16 = v12 + v11;
                        v2 += v16;
                        break;
                    }
                    break;
                }
                case 55: {
                    if(this.t(v5, v1, object0)) {
                        v13 = zzjm.zzA(v5 << 3);
                        v14 = zzjm.zzv(k1.B(object0, v10));
                        v16 = v14 + v13;
                        v2 += v16;
                        break;
                    }
                    break;
                }
                case 56: {
                    if(this.t(v5, v1, object0)) {
                        v2 = a.a(v5 << 3, 8, v2);
                    }
                    break;
                }
                case 57: {
                    if(this.t(v5, v1, object0)) {
                        v2 = a.a(v5 << 3, 4, v2);
                    }
                    break;
                }
                case 58: {
                    if(this.t(v5, v1, object0)) {
                        v2 = a.a(v5 << 3, 1, v2);
                    }
                    break;
                }
                case 59: {
                    if(this.t(v5, v1, object0)) {
                        Object object2 = unsafe0.getObject(object0, v10);
                        if(object2 instanceof zzje) {
                            int v34 = ((zzje)object2).zzd();
                            v2 = a.b(v34, v34, zzjm.zzA(v5 << 3), v2);
                            break;
                        }
                        else {
                            v13 = zzjm.zzA(v5 << 3);
                            v14 = zzjm.zzy(((String)object2));
                        }
                        v16 = v14 + v13;
                        v2 += v16;
                        break;
                    }
                    break;
                }
                case 60: {
                    if(this.t(v5, v1, object0)) {
                        v16 = r1.L(v5, unsafe0.getObject(object0, v10), this.e(v1));
                        v2 += v16;
                        break;
                    }
                    break;
                }
                case 61: {
                    if(this.t(v5, v1, object0)) {
                        int v35 = ((zzje)unsafe0.getObject(object0, v10)).zzd();
                        v2 = a.b(v35, v35, zzjm.zzA(v5 << 3), v2);
                    }
                    break;
                }
                case 62: {
                    if(this.t(v5, v1, object0)) {
                        v2 = a.a(k1.B(object0, v10), zzjm.zzA(v5 << 3), v2);
                    }
                    break;
                }
                case 0x3F: {
                    if(this.t(v5, v1, object0)) {
                        v16 = zzjm.zzv(k1.B(object0, v10)) + zzjm.zzA(v5 << 3);
                        v2 += v16;
                        break;
                    }
                    break;
                }
                case 0x40: {
                    if(this.t(v5, v1, object0)) {
                        v2 = a.a(v5 << 3, 4, v2);
                    }
                    break;
                }
                case 65: {
                    if(this.t(v5, v1, object0)) {
                        v2 = a.a(v5 << 3, 8, v2);
                    }
                    break;
                }
                case 66: {
                    if(this.t(v5, v1, object0)) {
                        int v36 = k1.B(object0, v10);
                        v2 = a.a(v36 >> 0x1F ^ v36 + v36, zzjm.zzA(v5 << 3), v2);
                    }
                    break;
                }
                case 67: {
                    if(this.t(v5, v1, object0)) {
                        long v37 = k1.c(object0, v10);
                        v16 = zzjm.zzB(v37 >> 0x3F ^ v37 + v37) + zzjm.zzA(v5 << 3);
                        v2 += v16;
                    }
                    break;
                }
                case 68: {
                    if(this.t(v5, v1, object0)) {
                        v2 += zzjm.a(v5, ((zzlm)unsafe0.getObject(object0, v10)), this.e(v1));
                    }
                }
            }
        }
        this.l.getClass();
        int v38 = x1.a(x1.b(object0));
        if(!this.f) {
            return v38 + v2;
        }
        this.m.getClass();
        v0.a(object0);
        throw null;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final int zza(Object object0) {
        return this.g ? this.A(object0) : this.z(object0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final int zzb(Object object0) {
        int v7;
        int v6;
        int[] arr_v = this.a;
        int v1 = 0;
        for(int v = 0; v < arr_v.length; v += 3) {
            int v2 = this.b(v);
            int v3 = arr_v[v];
            long v4 = (long)(0xFFFFF & v2);
            int v5 = 37;
            switch(v2 >>> 20 & 0xFF) {
                case 0: {
                    v6 = v1 * 53;
                    v7 = zzkn.zzc(Double.doubleToLongBits(d2.c.a(object0, v4)));
                    v1 = v7 + v6;
                    break;
                }
                case 1: {
                    v6 = v1 * 53;
                    v7 = Float.floatToIntBits(d2.c.b(object0, v4));
                    v1 = v7 + v6;
                    break;
                }
                case 2: {
                    v6 = v1 * 53;
                    v7 = zzkn.zzc(d2.c.k(object0, v4));
                    v1 = v7 + v6;
                    break;
                }
                case 3: {
                    v6 = v1 * 53;
                    v7 = zzkn.zzc(d2.c.k(object0, v4));
                    v1 = v7 + v6;
                    break;
                }
                case 4: {
                    v1 = d2.c.j(object0, v4) + v1 * 53;
                    break;
                }
                case 5: {
                    v1 = zzkn.zzc(d2.c.k(object0, v4)) + v1 * 53;
                    break;
                }
                case 6: {
                    v1 = d2.c.j(object0, v4) + v1 * 53;
                    break;
                }
                case 7: {
                    v1 = zzkn.zza(d2.c.g(object0, v4)) + v1 * 53;
                    break;
                }
                case 8: {
                    v1 = ((String)d2.c.m(object0, v4)).hashCode() + v1 * 53;
                    break;
                }
                case 9: {
                    Object object1 = d2.c.m(object0, v4);
                    if(object1 != null) {
                        v5 = object1.hashCode();
                    }
                    v1 = v1 * 53 + v5;
                    break;
                }
                case 10: {
                    v1 = d2.c.m(object0, v4).hashCode() + v1 * 53;
                    break;
                }
                case 11: {
                    v1 = d2.c.j(object0, v4) + v1 * 53;
                    break;
                }
                case 12: {
                    v1 = d2.c.j(object0, v4) + v1 * 53;
                    break;
                }
                case 13: {
                    v1 = d2.c.j(object0, v4) + v1 * 53;
                    break;
                }
                case 14: {
                    v1 = zzkn.zzc(d2.c.k(object0, v4)) + v1 * 53;
                    break;
                }
                case 15: {
                    v1 = d2.c.j(object0, v4) + v1 * 53;
                    break;
                }
                case 16: {
                    v1 = zzkn.zzc(d2.c.k(object0, v4)) + v1 * 53;
                    break;
                }
                case 17: {
                    Object object2 = d2.c.m(object0, v4);
                    if(object2 != null) {
                        v5 = object2.hashCode();
                    }
                    v1 = v1 * 53 + v5;
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    v1 = d2.c.m(object0, v4).hashCode() + v1 * 53;
                    break;
                }
                case 50: {
                    v1 = d2.c.m(object0, v4).hashCode() + v1 * 53;
                    break;
                }
                case 51: {
                    if(this.t(v3, v, object0)) {
                        v1 = zzkn.zzc(Double.doubleToLongBits(((double)(((Double)d2.c.m(object0, v4)))))) + v1 * 53;
                    }
                    break;
                }
                case 52: {
                    if(this.t(v3, v, object0)) {
                        v1 = Float.floatToIntBits(((float)(((Float)d2.c.m(object0, v4))))) + v1 * 53;
                    }
                    break;
                }
                case 53: {
                    if(this.t(v3, v, object0)) {
                        v1 = zzkn.zzc(k1.c(object0, v4)) + v1 * 53;
                    }
                    break;
                }
                case 54: {
                    if(this.t(v3, v, object0)) {
                        v1 = zzkn.zzc(k1.c(object0, v4)) + v1 * 53;
                    }
                    break;
                }
                case 55: {
                    if(this.t(v3, v, object0)) {
                        v1 = k1.B(object0, v4) + v1 * 53;
                    }
                    break;
                }
                case 56: {
                    if(this.t(v3, v, object0)) {
                        v1 = zzkn.zzc(k1.c(object0, v4)) + v1 * 53;
                    }
                    break;
                }
                case 57: {
                    if(this.t(v3, v, object0)) {
                        v1 = k1.B(object0, v4) + v1 * 53;
                    }
                    break;
                }
                case 58: {
                    if(this.t(v3, v, object0)) {
                        v1 = zzkn.zza(((Boolean)d2.c.m(object0, v4)).booleanValue()) + v1 * 53;
                    }
                    break;
                }
                case 59: {
                    if(this.t(v3, v, object0)) {
                        v1 = ((String)d2.c.m(object0, v4)).hashCode() + v1 * 53;
                    }
                    break;
                }
                case 60: {
                    if(this.t(v3, v, object0)) {
                        v1 = d2.c.m(object0, v4).hashCode() + v1 * 53;
                    }
                    break;
                }
                case 61: {
                    if(this.t(v3, v, object0)) {
                        v1 = d2.c.m(object0, v4).hashCode() + v1 * 53;
                    }
                    break;
                }
                case 62: {
                    if(this.t(v3, v, object0)) {
                        v1 = k1.B(object0, v4) + v1 * 53;
                    }
                    break;
                }
                case 0x3F: {
                    if(this.t(v3, v, object0)) {
                        v1 = k1.B(object0, v4) + v1 * 53;
                    }
                    break;
                }
                case 0x40: {
                    if(this.t(v3, v, object0)) {
                        v1 = k1.B(object0, v4) + v1 * 53;
                    }
                    break;
                }
                case 65: {
                    if(this.t(v3, v, object0)) {
                        v1 = zzkn.zzc(k1.c(object0, v4)) + v1 * 53;
                    }
                    break;
                }
                case 66: {
                    if(this.t(v3, v, object0)) {
                        v1 = k1.B(object0, v4) + v1 * 53;
                    }
                    break;
                }
                case 67: {
                    if(this.t(v3, v, object0)) {
                        v1 = zzkn.zzc(k1.c(object0, v4)) + v1 * 53;
                    }
                    break;
                }
                case 68: {
                    if(this.t(v3, v, object0)) {
                        v1 = d2.c.m(object0, v4).hashCode() + v1 * 53;
                    }
                }
            }
        }
        this.l.getClass();
        int v8 = ((zzkf)object0).zzc.hashCode();
        if(!this.f) {
            return v8 + v1 * 53;
        }
        this.m.getClass();
        v0.a(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final Object zze() {
        return (zzkf)((zzkf)this.e).zzl(4, null, null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final void zzf(Object object0) {
        int v = 0;
        if(!k1.s(object0)) {
            return;
        }
        if(object0 instanceof zzkf) {
            ((zzkf)object0).e();
            ((zzkf)object0).zzb = 0;
            ((zzkf)object0).d();
        }
        while(v < this.a.length) {
            int v1 = this.b(v);
            long v2 = (long)(0xFFFFF & v1);
            int v3 = v1 >>> 20 & 0xFF;
            if(v3 == 9) {
            label_22:
                if(this.r(v, object0)) {
                    this.e(v).zzf(k1.o.getObject(object0, v2));
                }
            }
            else {
                switch(v3) {
                    case 17: {
                        goto label_22;
                    }
                    case 18: 
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: 
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: 
                    case 29: 
                    case 30: 
                    case 0x1F: 
                    case 0x20: 
                    case 33: 
                    case 34: 
                    case 35: 
                    case 36: 
                    case 37: 
                    case 38: 
                    case 39: 
                    case 40: 
                    case 41: 
                    case 42: 
                    case 43: 
                    case 44: 
                    case 45: 
                    case 46: 
                    case 0x2F: 
                    case 0x30: 
                    case 49: {
                        this.k.a(object0, v2);
                        break;
                    }
                    case 50: {
                        Unsafe unsafe0 = k1.o;
                        Object object1 = unsafe0.getObject(object0, v2);
                        if(object1 != null) {
                            ((zzlg)object1).zzc();
                            unsafe0.putObject(object0, v2, object1);
                        }
                    }
                }
            }
            v += 3;
        }
        this.l.getClass();
        x1.c(object0);
        if(!this.f) {
            return;
        }
        this.m.getClass();
        v0.b(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final void zzg(Object object0, Object object1) {
        k1.j(object0);
        object1.getClass();
        for(int v = 0; true; v += 3) {
            int[] arr_v = this.a;
            if(v >= arr_v.length) {
                break;
            }
            int v1 = this.b(v);
            long v2 = (long)(v1 & 0xFFFFF);
            int v3 = arr_v[v];
            switch(v1 >>> 20 & 0xFF) {
                case 0: {
                    if(this.r(v, object1)) {
                        d2.l(object0, v2, d2.c.a(object1, v2));
                        this.m(v, object0);
                    }
                    break;
                }
                case 1: {
                    if(this.r(v, object1)) {
                        d2.m(object0, v2, d2.c.b(object1, v2));
                        this.m(v, object0);
                    }
                    break;
                }
                case 2: {
                    if(this.r(v, object1)) {
                        long v4 = d2.c.k(object1, v2);
                        d2.c.o(object0, v2, v4);
                        this.m(v, object0);
                    }
                    break;
                }
                case 3: {
                    if(this.r(v, object1)) {
                        long v5 = d2.c.k(object1, v2);
                        d2.c.o(object0, v2, v5);
                        this.m(v, object0);
                    }
                    break;
                }
                case 4: {
                    if(this.r(v, object1)) {
                        d2.n(d2.c.j(object1, v2), v2, object0);
                        this.m(v, object0);
                    }
                    break;
                }
                case 5: {
                    if(this.r(v, object1)) {
                        long v6 = d2.c.k(object1, v2);
                        d2.c.o(object0, v2, v6);
                        this.m(v, object0);
                    }
                    break;
                }
                case 6: {
                    if(this.r(v, object1)) {
                        d2.n(d2.c.j(object1, v2), v2, object0);
                        this.m(v, object0);
                    }
                    break;
                }
                case 7: {
                    if(this.r(v, object1)) {
                        d2.k(object0, v2, d2.c.g(object1, v2));
                        this.m(v, object0);
                    }
                    break;
                }
                case 8: {
                    if(this.r(v, object1)) {
                        d2.o(v2, object0, d2.c.m(object1, v2));
                        this.m(v, object0);
                    }
                    break;
                }
                case 9: {
                    this.k(v, object0, object1);
                    break;
                }
                case 10: {
                    if(this.r(v, object1)) {
                        d2.o(v2, object0, d2.c.m(object1, v2));
                        this.m(v, object0);
                    }
                    break;
                }
                case 11: {
                    if(this.r(v, object1)) {
                        d2.n(d2.c.j(object1, v2), v2, object0);
                        this.m(v, object0);
                    }
                    break;
                }
                case 12: {
                    if(this.r(v, object1)) {
                        d2.n(d2.c.j(object1, v2), v2, object0);
                        this.m(v, object0);
                    }
                    break;
                }
                case 13: {
                    if(this.r(v, object1)) {
                        d2.n(d2.c.j(object1, v2), v2, object0);
                        this.m(v, object0);
                    }
                    break;
                }
                case 14: {
                    if(this.r(v, object1)) {
                        long v7 = d2.c.k(object1, v2);
                        d2.c.o(object0, v2, v7);
                        this.m(v, object0);
                    }
                    break;
                }
                case 15: {
                    if(this.r(v, object1)) {
                        d2.n(d2.c.j(object1, v2), v2, object0);
                        this.m(v, object0);
                    }
                    break;
                }
                case 16: {
                    if(this.r(v, object1)) {
                        long v8 = d2.c.k(object1, v2);
                        d2.c.o(object0, v2, v8);
                        this.m(v, object0);
                    }
                    break;
                }
                case 17: {
                    this.k(v, object0, object1);
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    this.k.b(v2, object0, object1);
                    break;
                }
                case 50: {
                    d2.o(v2, object0, h1.b(d2.c.m(object0, v2), d2.c.m(object1, v2)));
                    break;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: {
                    if(this.t(v3, v, object1)) {
                        d2.o(v2, object0, d2.c.m(object1, v2));
                        d2.n(v3, ((long)(arr_v[v + 2] & 0xFFFFF)), object0);
                    }
                    break;
                }
                case 60: {
                    this.l(v, object0, object1);
                    break;
                }
                case 61: 
                case 62: 
                case 0x3F: 
                case 0x40: 
                case 65: 
                case 66: 
                case 67: {
                    if(this.t(v3, v, object1)) {
                        d2.o(v2, object0, d2.c.m(object1, v2));
                        d2.n(v3, ((long)(arr_v[v + 2] & 0xFFFFF)), object0);
                    }
                    break;
                }
                case 68: {
                    this.l(v, object0, object1);
                }
            }
        }
        r1.c(this.l, object0, object1);
        if(!this.f) {
            return;
        }
        this.m.getClass();
        v0.a(object1);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final void zzh(Object object0, byte[] arr_b, int v, int v1, m0 m00) {
        if(this.g) {
            this.E(object0, arr_b, v, v1, m00);
            return;
        }
        this.v(object0, arr_b, v, v1, 0, m00);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final void zzi(Object object0, zzng zzng0) {
        if(this.g) {
            if(!this.f) {
                int[] arr_v = this.a;
                for(int v = 0; v < arr_v.length; v += 3) {
                    int v1 = this.b(v);
                    int v2 = arr_v[v];
                    switch(v1 >>> 20 & 0xFF) {
                        case 0: {
                            if(this.r(v, object0)) {
                                zzng0.zzf(v2, d2.c.a(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 1: {
                            if(this.r(v, object0)) {
                                zzng0.zzo(v2, d2.c.b(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 2: {
                            if(this.r(v, object0)) {
                                zzng0.zzt(v2, d2.c.k(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 3: {
                            if(this.r(v, object0)) {
                                zzng0.zzJ(v2, d2.c.k(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 4: {
                            if(this.r(v, object0)) {
                                zzng0.zzr(v2, d2.c.j(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 5: {
                            if(this.r(v, object0)) {
                                zzng0.zzm(v2, d2.c.k(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 6: {
                            if(this.r(v, object0)) {
                                zzng0.zzk(v2, d2.c.j(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 7: {
                            if(this.r(v, object0)) {
                                zzng0.zzb(v2, d2.c.g(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 8: {
                            if(this.r(v, object0)) {
                                k1.u(v2, d2.c.m(object0, ((long)(v1 & 0xFFFFF))), zzng0);
                            }
                            break;
                        }
                        case 9: {
                            if(this.r(v, object0)) {
                                zzng0.zzv(v2, d2.c.m(object0, ((long)(v1 & 0xFFFFF))), this.e(v));
                            }
                            break;
                        }
                        case 10: {
                            if(this.r(v, object0)) {
                                zzng0.zzd(v2, ((zzje)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))));
                            }
                            break;
                        }
                        case 11: {
                            if(this.r(v, object0)) {
                                zzng0.zzH(v2, d2.c.j(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 12: {
                            if(this.r(v, object0)) {
                                zzng0.zzi(v2, d2.c.j(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 13: {
                            if(this.r(v, object0)) {
                                zzng0.zzw(v2, d2.c.j(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 14: {
                            if(this.r(v, object0)) {
                                zzng0.zzy(v2, d2.c.k(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 15: {
                            if(this.r(v, object0)) {
                                zzng0.zzA(v2, d2.c.j(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 16: {
                            if(this.r(v, object0)) {
                                zzng0.zzC(v2, d2.c.k(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 17: {
                            if(this.r(v, object0)) {
                                zzng0.zzq(v2, d2.c.m(object0, ((long)(v1 & 0xFFFFF))), this.e(v));
                            }
                            break;
                        }
                        case 18: {
                            r1.f(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, false);
                            break;
                        }
                        case 19: {
                            r1.j(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, false);
                            break;
                        }
                        case 20: {
                            r1.m(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, false);
                            break;
                        }
                        case 21: {
                            r1.u(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, false);
                            break;
                        }
                        case 22: {
                            r1.l(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, false);
                            break;
                        }
                        case 23: {
                            r1.i(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, false);
                            break;
                        }
                        case 24: {
                            r1.h(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, false);
                            break;
                        }
                        case 25: {
                            r1.d(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, false);
                            break;
                        }
                        case 26: {
                            r1.s(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0);
                            break;
                        }
                        case 27: {
                            r1.n(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, this.e(v));
                            break;
                        }
                        case 28: {
                            r1.e(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0);
                            break;
                        }
                        case 29: {
                            r1.t(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, false);
                            break;
                        }
                        case 30: {
                            r1.g(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, false);
                            break;
                        }
                        case 0x1F: {
                            r1.o(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, false);
                            break;
                        }
                        case 0x20: {
                            r1.p(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, false);
                            break;
                        }
                        case 33: {
                            r1.q(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, false);
                            break;
                        }
                        case 34: {
                            r1.r(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, false);
                            break;
                        }
                        case 35: {
                            r1.f(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, true);
                            break;
                        }
                        case 36: {
                            r1.j(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, true);
                            break;
                        }
                        case 37: {
                            r1.m(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, true);
                            break;
                        }
                        case 38: {
                            r1.u(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, true);
                            break;
                        }
                        case 39: {
                            r1.l(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, true);
                            break;
                        }
                        case 40: {
                            r1.i(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, true);
                            break;
                        }
                        case 41: {
                            r1.h(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, true);
                            break;
                        }
                        case 42: {
                            r1.d(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, true);
                            break;
                        }
                        case 43: {
                            r1.t(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, true);
                            break;
                        }
                        case 44: {
                            r1.g(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, true);
                            break;
                        }
                        case 45: {
                            r1.o(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, true);
                            break;
                        }
                        case 46: {
                            r1.p(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, true);
                            break;
                        }
                        case 0x2F: {
                            r1.q(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, true);
                            break;
                        }
                        case 0x30: {
                            r1.r(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, true);
                            break;
                        }
                        case 49: {
                            r1.k(v2, ((List)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))), zzng0, this.e(v));
                            break;
                        }
                        case 50: {
                            if(d2.c.m(object0, ((long)(v1 & 0xFFFFF))) != null) {
                                zzlf zzlf0 = (zzlf)this.f(v);
                                throw null;
                            }
                            break;
                        }
                        case 51: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzf(v2, ((double)(((Double)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))))));
                            }
                            break;
                        }
                        case 52: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzo(v2, ((float)(((Float)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))))));
                            }
                            break;
                        }
                        case 53: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzt(v2, k1.c(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 54: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzJ(v2, k1.c(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 55: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzr(v2, k1.B(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 56: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzm(v2, k1.c(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 57: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzk(v2, k1.B(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 58: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzb(v2, ((Boolean)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))).booleanValue());
                            }
                            break;
                        }
                        case 59: {
                            if(this.t(v2, v, object0)) {
                                k1.u(v2, d2.c.m(object0, ((long)(v1 & 0xFFFFF))), zzng0);
                            }
                            break;
                        }
                        case 60: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzv(v2, d2.c.m(object0, ((long)(v1 & 0xFFFFF))), this.e(v));
                            }
                            break;
                        }
                        case 61: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzd(v2, ((zzje)d2.c.m(object0, ((long)(v1 & 0xFFFFF)))));
                            }
                            break;
                        }
                        case 62: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzH(v2, k1.B(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 0x3F: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzi(v2, k1.B(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 0x40: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzw(v2, k1.B(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 65: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzy(v2, k1.c(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 66: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzA(v2, k1.B(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 67: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzC(v2, k1.c(object0, ((long)(v1 & 0xFFFFF))));
                            }
                            break;
                        }
                        case 68: {
                            if(this.t(v2, v, object0)) {
                                zzng0.zzq(v2, d2.c.m(object0, ((long)(v1 & 0xFFFFF))), this.e(v));
                            }
                        }
                    }
                }
                this.l.getClass();
                ((zzkf)object0).zzc.zzk(zzng0);
                return;
            }
            this.m.getClass();
            v0.a(object0);
            throw null;
        }
        this.p(object0, zzng0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzj(Object object0, Object object1) {
        boolean z;
        int[] arr_v = this.a;
        int v = 0;
        while(v < arr_v.length) {
            int v1 = this.b(v);
            long v2 = (long)(v1 & 0xFFFFF);
            switch(v1 >>> 20 & 0xFF) {
                case 0: {
                    if(this.q(v, object0, object1) && Double.doubleToLongBits(d2.c.a(object0, v2)) == Double.doubleToLongBits(d2.c.a(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 1: {
                    if(this.q(v, object0, object1) && Float.floatToIntBits(d2.c.b(object0, v2)) == Float.floatToIntBits(d2.c.b(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 2: {
                    if(this.q(v, object0, object1) && d2.c.k(object0, v2) == d2.c.k(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 3: {
                    if(this.q(v, object0, object1) && d2.c.k(object0, v2) == d2.c.k(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 4: {
                    if(this.q(v, object0, object1) && d2.c.j(object0, v2) == d2.c.j(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 5: {
                    if(this.q(v, object0, object1) && d2.c.k(object0, v2) == d2.c.k(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 6: {
                    if(this.q(v, object0, object1) && d2.c.j(object0, v2) == d2.c.j(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 7: {
                    if(this.q(v, object0, object1) && d2.c.g(object0, v2) == d2.c.g(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 8: {
                    if(this.q(v, object0, object1) && r1.v(d2.c.m(object0, v2), d2.c.m(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 9: {
                    if(this.q(v, object0, object1) && r1.v(d2.c.m(object0, v2), d2.c.m(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 10: {
                    if(this.q(v, object0, object1) && r1.v(d2.c.m(object0, v2), d2.c.m(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 11: {
                    if(this.q(v, object0, object1) && d2.c.j(object0, v2) == d2.c.j(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 12: {
                    if(this.q(v, object0, object1) && d2.c.j(object0, v2) == d2.c.j(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 13: {
                    if(this.q(v, object0, object1) && d2.c.j(object0, v2) == d2.c.j(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 14: {
                    if(this.q(v, object0, object1) && d2.c.k(object0, v2) == d2.c.k(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 15: {
                    if(this.q(v, object0, object1) && d2.c.j(object0, v2) == d2.c.j(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 16: {
                    if(this.q(v, object0, object1) && d2.c.k(object0, v2) == d2.c.k(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 17: {
                    if(this.q(v, object0, object1) && r1.v(d2.c.m(object0, v2), d2.c.m(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    z = r1.v(d2.c.m(object0, v2), d2.c.m(object1, v2));
                    goto label_46;
                }
                case 50: {
                    z = r1.v(d2.c.m(object0, v2), d2.c.m(object1, v2));
                label_46:
                    if(!z) {
                        return false;
                    }
                    break;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: 
                case 60: 
                case 61: 
                case 62: 
                case 0x3F: 
                case 0x40: 
                case 65: 
                case 66: 
                case 67: 
                case 68: {
                    long v3 = (long)(arr_v[v + 2] & 0xFFFFF);
                    if(d2.c.j(object0, v3) != d2.c.j(object1, v3) || !r1.v(d2.c.m(object0, v2), d2.c.m(object1, v2))) {
                        return false;
                    }
                }
            }
            v += 3;
        }
        this.l.getClass();
        if(!((zzkf)object0).zzc.equals(((zzkf)object1).zzc)) {
            return false;
        }
        if(!this.f) {
            return true;
        }
        this.m.getClass();
        v0.a(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzk(Object object0) {
        int v = 0xFFFFF;
        int v2 = 0;
        for(int v1 = 0; true; ++v1) {
            boolean z = true;
            if(v1 >= this.i) {
                break;
            }
            int v3 = this.h[v1];
            int v4 = this.a[v3];
            int v5 = this.b(v3);
            int v6 = this.a[v3 + 2];
            int v7 = v6 & 0xFFFFF;
            int v8 = 1 << (v6 >>> 20);
            if(v7 != v) {
                if(v7 != 0xFFFFF) {
                    v2 = k1.o.getInt(object0, ((long)v7));
                }
                v = v7;
            }
            if((0x10000000 & v5) != 0 && !(v == 0xFFFFF ? this.r(v3, object0) : (v2 & v8) != 0)) {
                return false;
            }
            switch(v5 >>> 20 & 0xFF) {
                case 9: 
                case 17: {
                    if(v == 0xFFFFF) {
                        z = this.r(v3, object0);
                    }
                    else if((v2 & v8) == 0) {
                        z = false;
                    }
                    if(z && !this.e(v3).zzk(d2.c.m(object0, ((long)(v5 & 0xFFFFF))))) {
                        return false;
                    }
                    break;
                }
                case 27: 
                case 49: {
                    List list0 = (List)d2.i(object0, ((long)(v5 & 0xFFFFF)));
                    if(!list0.isEmpty()) {
                        zzlx zzlx0 = this.e(v3);
                        for(int v9 = 0; v9 < list0.size(); ++v9) {
                            if(!zzlx0.zzk(list0.get(v9))) {
                                return false;
                            }
                        }
                    }
                    break;
                }
                case 50: {
                    if(!((zzlg)d2.i(object0, ((long)(v5 & 0xFFFFF)))).isEmpty()) {
                        zzlf zzlf0 = (zzlf)this.f(v3);
                        throw null;
                    }
                    break;
                }
                case 60: 
                case 68: {
                    if(this.t(v4, v3, object0) && !this.e(v3).zzk(d2.c.m(object0, ((long)(v5 & 0xFFFFF))))) {
                        return false;
                    }
                }
            }
        }
        if(!this.f) {
            return true;
        }
        this.m.getClass();
        v0.a(object0);
        throw null;
    }
}


package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.R.dimen;

public abstract class i {
    public static float a(float f, float f1, int v) {
        return ((float)Math.max(0, v - 1)) * f1 + f;
    }

    public static float b(float f, float f1, int v) {
        return v <= 0 ? f : f1 / 2.0f + f;
    }

    public static l c(Context context0, float f, float f1, a a0, int v) {
        float f16;
        float f15;
        float f14;
        j j1;
        if(v == 1) {
            float f2 = Math.min(context0.getResources().getDimension(dimen.m3_carousel_gone_size) + f, a0.f);
            float f3 = i.b(0.0f, a0.b, a0.c);
            float f4 = i.f(0.0f, i.a(f3, a0.b, ((int)Math.floor(((float)a0.c) / 2.0f))), a0.b, a0.c);
            float f5 = i.b(f4, a0.e, a0.d);
            float f6 = i.f(f4, i.a(f5, a0.e, ((int)Math.floor(((float)a0.d) / 2.0f))), a0.e, a0.d);
            float f7 = i.b(f6, a0.f, a0.g);
            float f8 = i.f(f6, i.a(f7, a0.f, a0.g), a0.f, a0.g);
            float f9 = i.b(f8, a0.e, a0.d);
            float f10 = i.b(i.f(f8, i.a(f9, a0.e, ((int)Math.ceil(((float)a0.d) / 2.0f))), a0.e, a0.d), a0.b, a0.c);
            float f11 = 1.0f - (f2 - f) / (a0.f - f);
            float f12 = 1.0f - (a0.b - f) / (a0.f - f);
            float f13 = 1.0f - (a0.e - f) / (a0.f - f);
            j j0 = new j(a0.f, f1);
            j0.a(0.0f - f2 / 2.0f, f11, f2, false, true);
            int v1 = a0.c;
            if(v1 > 0) {
                j1 = j0;
                f14 = f9;
                f15 = f7;
                f16 = f5;
                j0.c(f3, f12, a0.b, ((int)Math.floor(((float)v1) / 2.0f)), false);
            }
            else {
                j1 = j0;
                f14 = f9;
                f15 = f7;
                f16 = f5;
            }
            int v2 = a0.d;
            if(v2 > 0) {
                j1.c(f16, f13, a0.e, ((int)Math.floor(((float)v2) / 2.0f)), false);
            }
            j1.c(f15, 0.0f, a0.f, a0.g, true);
            int v3 = a0.d;
            if(v3 > 0) {
                j1.c(f14, f13, a0.e, ((int)Math.ceil(((float)v3) / 2.0f)), false);
            }
            int v4 = a0.c;
            if(v4 > 0) {
                j1.c(f10, f12, a0.b, ((int)Math.ceil(((float)v4) / 2.0f)), false);
            }
            j1.a(f1 + f2 / 2.0f, f11, f2, false, true);
            return j1.d();
        }
        return i.d(context0, f, f1, a0);
    }

    public static l d(Context context0, float f, float f1, a a0) {
        float f2 = Math.min(context0.getResources().getDimension(dimen.m3_carousel_gone_size) + f, a0.f);
        float f3 = i.b(0.0f, a0.f, a0.g);
        float f4 = i.f(0.0f, i.a(f3, a0.f, a0.g), a0.f, a0.g);
        float f5 = i.b(f4, a0.e, a0.d);
        float f6 = i.b(i.f(f4, f5, a0.e, a0.d), a0.b, a0.c);
        float f7 = 1.0f - (f2 - f) / (a0.f - f);
        float f8 = 1.0f - (a0.b - f) / (a0.f - f);
        float f9 = 1.0f - (a0.e - f) / (a0.f - f);
        j j0 = new j(a0.f, f1);
        j0.a(0.0f - f2 / 2.0f, f7, f2, false, true);
        j0.c(f3, 0.0f, a0.f, a0.g, true);
        if(a0.d > 0) {
            j0.a(f5, f9, a0.e, false, false);
        }
        int v = a0.c;
        if(v > 0) {
            j0.c(f6, f8, a0.b, v, false);
        }
        j0.a(f2 / 2.0f + f1, f7, f2, false, true);
        return j0.d();
    }

    public static int e(int[] arr_v) [...] // 潜在的解密器

    public static float f(float f, float f1, float f2, int v) {
        return v <= 0 ? f : f2 / 2.0f + f1;
    }
}


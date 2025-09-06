package com.google.android.material.transition;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

public abstract class p {
    public static final RectF a;

    static {
        p.a = new RectF();
    }

    public static View a(int v, View view0) {
        String s = view0.getResources().getResourceName(v);
        while(view0 != null) {
            if(view0.getId() == v) {
                return view0;
            }
            ViewParent viewParent0 = view0.getParent();
            if(!(viewParent0 instanceof View)) {
                break;
            }
            view0 = (View)viewParent0;
        }
        throw new IllegalArgumentException(s + " is not a valid ancestor");
    }

    public static RectF b(View view0) {
        int[] arr_v = new int[2];
        view0.getLocationOnScreen(arr_v);
        int v = arr_v[0];
        int v1 = arr_v[1];
        return new RectF(((float)v), ((float)v1), ((float)(view0.getWidth() + v)), ((float)(view0.getHeight() + v1)));
    }

    public static float c(float f, float f1, float f2) {
        return (f1 - f) * f2 + f;
    }

    public static float d(float f, float f1, float f2, float f3, float f4, boolean z) {
        if(z && (f4 < 0.0f || f4 > 1.0f)) {
            return p.c(f, f1, f4);
        }
        if(f4 < f2) {
            return f;
        }
        return f4 > f3 ? f1 : p.c(f, f1, (f4 - f2) / (f3 - f2));
    }

    public static int e(int v, float f, float f1, int v1, float f2) {
        if(f2 < f) {
            return v;
        }
        return f2 > f1 ? v1 : ((int)p.c(v, v1, (f2 - f) / (f1 - f)));
    }
}


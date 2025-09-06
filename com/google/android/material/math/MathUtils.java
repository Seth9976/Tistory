package com.google.android.material.math;

public final class MathUtils {
    public static final float DEFAULT_EPSILON = 0.0001f;

    public static float dist(float f, float f1, float f2, float f3) {
        return (float)Math.hypot(f2 - f, f3 - f1);
    }

    public static float distanceToFurthestCorner(float f, float f1, float f2, float f3, float f4, float f5) {
        float f6 = MathUtils.dist(f, f1, f2, f3);
        float f7 = MathUtils.dist(f, f1, f4, f3);
        float f8 = MathUtils.dist(f, f1, f4, f5);
        float f9 = MathUtils.dist(f, f1, f2, f5);
        if(f6 <= f7 || f6 <= f8 || f6 <= f9) {
            if(f7 > f8 && f7 > f9) {
                return f7;
            }
            return f8 > f9 ? f8 : f9;
        }
        return f6;
    }

    public static float floorMod(float f, int v) {
        int v1 = (int)(f / ((float)v));
        if(Math.signum(f) * ((float)v) < 0.0f && ((float)(v1 * v)) != f) {
            --v1;
        }
        return f - ((float)(v1 * v));
    }

    public static int floorMod(int v, int v1) {
        int v2 = v / v1;
        if((v ^ v1) < 0 && v2 * v1 != v) {
            --v2;
        }
        return v - v2 * v1;
    }

    public static boolean geq(float f, float f1, float f2) {
        return f + f2 >= f1;
    }

    public static float lerp(float f, float f1, float f2) [...] // Inlined contents
}


package c3;

import android.graphics.Color;
import androidx.core.graphics.ColorUtils;

public abstract class a {
    public static final float[][] a;
    public static final float[][] b;
    public static final float[] c;
    public static final float[][] d;

    static {
        a.a = new float[][]{new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
        a.b = new float[][]{new float[]{1.862068f, -1.011255f, 0.149187f}, new float[]{0.387527f, 0.621447f, -0.008974f}, new float[]{-0.015842f, -0.034123f, 1.049964f}};
        a.c = new float[]{95.046997f, 100.0f, 108.883003f};
        a.d = new float[][]{new float[]{0.412339f, 0.357621f, 0.18051f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.019321f, 0.119164f, 0.950345f}};
    }

    public static int a(float f) {
        if(f < 1.0f) {
            return 0xFF000000;
        }
        if(f > 99.0f) {
            return -1;
        }
        float f1 = (f + 16.0f) / 116.0f;
        float f2 = Float.compare(f, 8.0f) <= 0 ? f / 903.296326f : f1 * f1 * f1;
        float f3 = f1 * f1 * f1;
        boolean z = Float.compare(f3, 0.008856f) > 0;
        float f4 = z ? f3 : (f1 * 116.0f - 16.0f) / 903.296326f;
        if(!z) {
            f3 = (f1 * 116.0f - 16.0f) / 903.296326f;
        }
        return ColorUtils.XYZToColor(f4 * a.c[0], f2 * a.c[1], f3 * a.c[2]);
    }

    public static float b(int v) {
        float f = a.c(Color.red(v));
        float f1 = a.c(Color.green(v));
        float f2 = a.c(Color.blue(v));
        float[] arr_f = a.d[1];
        float f3 = (f2 * arr_f[2] + (f1 * arr_f[1] + f * arr_f[0])) / 100.0f;
        return f3 <= 0.008856f ? f3 * 903.296326f : ((float)Math.cbrt(f3)) * 116.0f - 16.0f;
    }

    public static float c(int v) {
        return Float.compare(((float)v) / 255.0f, 0.04045f) > 0 ? ((float)Math.pow((((float)v) / 255.0f + 0.055f) / 1.055f, 2.4)) * 100.0f : ((float)v) / 255.0f / 12.92f * 100.0f;
    }

    public static float d() [...] // Inlined contents
}


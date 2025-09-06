package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ColorUtils {
    public static final double[][] a;
    public static final double[][] b;
    public static final double[] c;

    static {
        ColorUtils.a = new double[][]{new double[]{0.412339, 0.357621, 0.18051}, new double[]{0.2126, 0.7152, 0.0722}, new double[]{0.019321, 0.119164, 0.950345}};
        ColorUtils.b = new double[][]{new double[]{3.241377, -1.537665, -0.498854}, new double[]{-0.969145, 1.875885, 0.041566}, new double[]{0.055621, -0.203955, 1.05718}};
        ColorUtils.c = new double[]{95.047, 100.0, 108.883};
    }

    public static double a(double f) {
        return f > 0.008856 ? Math.pow(f, 0.333333) : (f * 903.296296 + 16.0) / 116.0;
    }

    public static int alphaFromArgb(int v) [...] // Inlined contents

    public static int argbFromLab(double f, double f1, double f2) {
        double f3 = (((long)f) + 0x4030000000000000L) / 116.0;
        return ColorUtils.argbFromXyz(ColorUtils.b(((long)f1) / 0x407F400000000000L + f3) * ColorUtils.c[0], ColorUtils.b(f3) * ColorUtils.c[1], ColorUtils.b(f3 - f2 / 200.0) * ColorUtils.c[2]);
    }

    public static int argbFromLinrgb(double[] arr_f) {
        return ColorUtils.argbFromRgb(ColorUtils.delinearized(arr_f[0]), ColorUtils.delinearized(arr_f[1]), ColorUtils.delinearized(arr_f[2]));
    }

    public static int argbFromLstar(double f) {
        int v = ColorUtils.delinearized(ColorUtils.yFromLstar(f));
        return (v & 0xFF) << 16 | 0xFF000000 | (v & 0xFF) << 8 | v & 0xFF;
    }

    public static int argbFromRgb(int v, int v1, int v2) [...] // Inlined contents

    public static int argbFromXyz(double f, double f1, double f2) {
        double[] arr_f = ColorUtils.b[0];
        double f3 = arr_f[2] * f2 + (arr_f[1] * f1 + arr_f[0] * f);
        double[] arr_f1 = ColorUtils.b[1];
        double f4 = arr_f1[2] * f2 + (arr_f1[1] * f1 + arr_f1[0] * f);
        double[] arr_f2 = ColorUtils.b[2];
        return ColorUtils.argbFromRgb(ColorUtils.delinearized(f3), ColorUtils.delinearized(f4), ColorUtils.delinearized(arr_f2[2] * f2 + (arr_f2[1] * f1 + arr_f2[0] * f)));
    }

    public static double b(double f) {
        double f1 = f * f * f;
        return f1 > 0.008856 ? f1 : (f * 116.0 - 16.0) / 903.296296;
    }

    public static int blueFromArgb(int v) [...] // Inlined contents

    public static int delinearized(double f) {
        return ((long)f) / 0x4059000000000000L <= 0.003131 ? MathUtils.clampInt(0, 0xFF, ((int)Math.round(((long)f) / 0x4059000000000000L * 3294.6))) : MathUtils.clampInt(0, 0xFF, ((int)Math.round((Math.pow(((long)f) / 0x4059000000000000L, 0.416667) * 1.055 - 0.055) * 255.0)));
    }

    public static int greenFromArgb(int v) [...] // Inlined contents

    public static boolean isOpaque(int v) {
        return (v >> 24 & 0xFF) >= 0xFF;
    }

    public static double[] labFromArgb(int v) {
        double f = ColorUtils.linearized(v >> 16 & 0xFF);
        double f1 = ColorUtils.linearized(v >> 8 & 0xFF);
        double f2 = ColorUtils.linearized(v & 0xFF);
        double[] arr_f = ColorUtils.a[0];
        double f3 = arr_f[2] * f2 + (arr_f[1] * f1 + arr_f[0] * f);
        double[] arr_f1 = ColorUtils.a[1];
        double f4 = arr_f1[2] * f2 + (arr_f1[1] * f1 + arr_f1[0] * f);
        double[] arr_f2 = ColorUtils.a[2];
        double f5 = arr_f2[2] * f2 + (arr_f2[1] * f1 + arr_f2[0] * f);
        double f6 = ColorUtils.a(f3 / ColorUtils.c[0]);
        double f7 = ColorUtils.a(f4 / ColorUtils.c[1]);
        return new double[]{116.0 * f7 - 16.0, (f6 - f7) * 500.0, (f7 - ColorUtils.a(f5 / ColorUtils.c[2])) * 200.0};
    }

    public static double linearized(int v) {
        return Double.compare(((double)v) / 255.0, 0.04045) > 0 ? Math.pow((((double)v) / 255.0 + 0.055) / 1.055, 2.4) * 100.0 : ((double)v) / 255.0 / 12.92 * 100.0;
    }

    public static double lstarFromArgb(int v) {
        return ColorUtils.a(ColorUtils.xyzFromArgb(v)[1] / 100.0) * 116.0 - 16.0;
    }

    public static double lstarFromY(double f) {
        return ColorUtils.a(f / 100.0) * 116.0 - 16.0;
    }

    public static int redFromArgb(int v) [...] // Inlined contents

    public static double[] whitePointD65() {
        return ColorUtils.c;
    }

    public static double[] xyzFromArgb(int v) {
        return MathUtils.matrixMultiply(new double[]{ColorUtils.linearized(v >> 16 & 0xFF), ColorUtils.linearized(v >> 8 & 0xFF), ColorUtils.linearized(v & 0xFF)}, ColorUtils.a);
    }

    public static double yFromLstar(double f) [...] // 潜在的解密器
}


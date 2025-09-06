package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import androidx.core.content.res.CamColor;

public final class ColorUtils {
    public static final ThreadLocal a;

    static {
        ColorUtils.a = new ThreadLocal();
    }

    @ColorInt
    public static int HSLToColor(@NonNull float[] arr_f) {
        float f = arr_f[0];
        float f1 = (1.0f - Math.abs(arr_f[2] * 2.0f - 1.0f)) * arr_f[1];
        float f2 = arr_f[2] - 0.5f * f1;
        float f3 = (1.0f - Math.abs(f / 60.0f % 2.0f - 1.0f)) * f1;
        switch(((int)f) / 60) {
            case 0: {
                return Color.rgb(ColorUtils.b(Math.round((f1 + f2) * 255.0f)), ColorUtils.b(Math.round((f3 + f2) * 255.0f)), ColorUtils.b(Math.round(f2 * 255.0f)));
            }
            case 1: {
                return Color.rgb(ColorUtils.b(Math.round((f3 + f2) * 255.0f)), ColorUtils.b(Math.round((f1 + f2) * 255.0f)), ColorUtils.b(Math.round(f2 * 255.0f)));
            }
            case 2: {
                return Color.rgb(ColorUtils.b(Math.round(f2 * 255.0f)), ColorUtils.b(Math.round((f1 + f2) * 255.0f)), ColorUtils.b(Math.round((f3 + f2) * 255.0f)));
            }
            case 3: {
                return Color.rgb(ColorUtils.b(Math.round(f2 * 255.0f)), ColorUtils.b(Math.round((f3 + f2) * 255.0f)), ColorUtils.b(Math.round((f1 + f2) * 255.0f)));
            }
            case 4: {
                return Color.rgb(ColorUtils.b(Math.round((f3 + f2) * 255.0f)), ColorUtils.b(Math.round(f2 * 255.0f)), ColorUtils.b(Math.round((f1 + f2) * 255.0f)));
            }
            case 5: 
            case 6: {
                return Color.rgb(ColorUtils.b(Math.round((f1 + f2) * 255.0f)), ColorUtils.b(Math.round(f2 * 255.0f)), ColorUtils.b(Math.round((f3 + f2) * 255.0f)));
            }
            default: {
                return 0xFF000000;
            }
        }
    }

    @ColorInt
    public static int LABToColor(@FloatRange(from = 0.0, to = 100.0) double f, @FloatRange(from = -128.0, to = 127.0) double f1, @FloatRange(from = -128.0, to = 127.0) double f2) {
        ThreadLocal threadLocal0 = ColorUtils.a;
        double[] arr_f = (double[])threadLocal0.get();
        if(arr_f == null) {
            arr_f = new double[3];
            threadLocal0.set(arr_f);
        }
        ColorUtils.LABToXYZ(f, f1, f2, arr_f);
        return ColorUtils.XYZToColor(arr_f[0], arr_f[1], arr_f[2]);
    }

    public static void LABToXYZ(@FloatRange(from = 0.0, to = 100.0) double f, @FloatRange(from = -128.0, to = 127.0) double f1, @FloatRange(from = -128.0, to = 127.0) double f2, @NonNull double[] arr_f) {
        double f3 = (f + 16.0) / 116.0;
        double f4 = f1 / 500.0 + f3;
        double f5 = f3 - f2 / 200.0;
        arr_f[0] = (Double.compare(Math.pow(f4, 3.0), 0.008856) > 0 ? Math.pow(f4, 3.0) : (f4 * 116.0 - 16.0) / 903.3) * 95.047;
        arr_f[1] = (f > 7.999625 ? Math.pow(f3, 3.0) : f / 903.3) * 100.0;
        arr_f[2] = (Math.pow(f5, 3.0) > 0.008856 ? Math.pow(f5, 3.0) : (f5 * 116.0 - 16.0) / 903.3) * 108.883;
    }

    @ColorInt
    public static int M3HCTToColor(@FloatRange(from = 0.0, to = 360.0, toInclusive = false) float f, @FloatRange(from = 0.0, to = Infinity, toInclusive = false) float f1, @FloatRange(from = 0.0, to = 100.0) float f2) {
        return CamColor.toColor(f, f1, f2);
    }

    public static void RGBToHSL(@IntRange(from = 0L, to = 0xFFL) int v, @IntRange(from = 0L, to = 0xFFL) int v1, @IntRange(from = 0L, to = 0xFFL) int v2, @NonNull float[] arr_f) {
        float f6;
        float f5;
        float f = Math.max(((float)v) / 255.0f, Math.max(((float)v1) / 255.0f, ((float)v2) / 255.0f));
        float f1 = Math.min(((float)v) / 255.0f, Math.min(((float)v1) / 255.0f, ((float)v2) / 255.0f));
        float f2 = f - f1;
        float f3 = (f + f1) / 2.0f;
        float f4 = 0.0f;
        if(Float.compare(f, f1) == 0) {
            f5 = 0.0f;
            f6 = 0.0f;
        }
        else {
            if(f == ((float)v) / 255.0f) {
                f5 = (((float)v1) / 255.0f - ((float)v2) / 255.0f) / f2 % 6.0f;
            }
            else {
                f5 = f == ((float)v1) / 255.0f ? (((float)v2) / 255.0f - ((float)v) / 255.0f) / f2 + 2.0f : 4.0f + (((float)v) / 255.0f - ((float)v1) / 255.0f) / f2;
            }
            f6 = f2 / (1.0f - Math.abs(2.0f * f3 - 1.0f));
        }
        float f7 = f5 * 60.0f % 360.0f;
        f7 = f7 < 0.0f ? f7 + 360.0f : f5 * 60.0f % 360.0f;
        arr_f[0] = f7 < 0.0f ? 0.0f : Math.min(f7, 360.0f);
        arr_f[1] = f6 < 0.0f ? 0.0f : Math.min(f6, 1.0f);
        if(f3 >= 0.0f) {
            f4 = Math.min(f3, 1.0f);
        }
        arr_f[2] = f4;
    }

    public static void RGBToLAB(@IntRange(from = 0L, to = 0xFFL) int v, @IntRange(from = 0L, to = 0xFFL) int v1, @IntRange(from = 0L, to = 0xFFL) int v2, @NonNull double[] arr_f) {
        ColorUtils.RGBToXYZ(v, v1, v2, arr_f);
        ColorUtils.XYZToLAB(arr_f[0], arr_f[1], arr_f[2], arr_f);
    }

    public static void RGBToXYZ(@IntRange(from = 0L, to = 0xFFL) int v, @IntRange(from = 0L, to = 0xFFL) int v1, @IntRange(from = 0L, to = 0xFFL) int v2, @NonNull double[] arr_f) {
        if(arr_f.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double f = Double.compare(((double)v) / 255.0, 0.04045) >= 0 ? Math.pow((((double)v) / 255.0 + 0.055) / 1.055, 2.4) : ((double)v) / 255.0 / 12.92;
        double f1 = ((double)v1) / 255.0 < 0.04045 ? ((double)v1) / 255.0 / 12.92 : Math.pow((((double)v1) / 255.0 + 0.055) / 1.055, 2.4);
        double f2 = ((double)v2) / 255.0 < 0.04045 ? ((double)v2) / 255.0 / 12.92 : Math.pow((((double)v2) / 255.0 + 0.055) / 1.055, 2.4);
        arr_f[0] = (0.1805 * f2 + (0.3576 * f1 + 0.4124 * f)) * 100.0;
        arr_f[1] = (0.0722 * f2 + (0.7152 * f1 + 0.2126 * f)) * 100.0;
        arr_f[2] = (f2 * 0.9505 + (f1 * 0.1192 + f * 0.0193)) * 100.0;
    }

    @ColorInt
    public static int XYZToColor(@FloatRange(from = 0.0, to = 95.047) double f, @FloatRange(from = 0.0, to = 100.0) double f1, @FloatRange(from = 0.0, to = 108.883) double f2) {
        double f3 = (-0.4986 * f2 + (-1.5372 * f1 + 3.2406 * f)) / 100.0;
        double f4 = (0.0415 * f2 + (1.8758 * f1 + -0.9689 * f)) / 100.0;
        double f5 = (1.057 * f2 + (-0.204 * f1 + 0.0557 * f)) / 100.0;
        double f6 = Double.compare(f3, 0.003131) <= 0 ? f3 * 12.92 : Math.pow(f3, 0.416667) * 1.055 - 0.055;
        double f7 = f4 > 0.003131 ? Math.pow(f4, 0.416667) * 1.055 - 0.055 : f4 * 12.92;
        return f5 > 0.003131 ? Color.rgb(ColorUtils.b(((int)Math.round(f6 * 255.0))), ColorUtils.b(((int)Math.round(f7 * 255.0))), ColorUtils.b(((int)Math.round((Math.pow(f5, 0.416667) * 1.055 - 0.055) * 255.0)))) : Color.rgb(ColorUtils.b(((int)Math.round(f6 * 255.0))), ColorUtils.b(((int)Math.round(f7 * 255.0))), ColorUtils.b(((int)Math.round(f5 * 3294.6))));
    }

    public static void XYZToLAB(@FloatRange(from = 0.0, to = 95.047) double f, @FloatRange(from = 0.0, to = 100.0) double f1, @FloatRange(from = 0.0, to = 108.883) double f2, @NonNull double[] arr_f) {
        if(arr_f.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double f3 = ColorUtils.c(f1 / 100.0);
        arr_f[0] = Math.max(0.0, 116.0 * f3 - 16.0);
        arr_f[1] = (ColorUtils.c(((long)f) / 0x4057C3020C49BA5EL) - f3) * 500.0;
        arr_f[2] = (f3 - ColorUtils.c(f2 / 108.883)) * 200.0;
    }

    public static int a(int v, int v1, int v2, int v3, int v4) {
        return v4 == 0 ? 0 : ((0xFF - v1) * (v2 * v3) + v * 0xFF * v1) / (v4 * 0xFF);
    }

    public static int b(int v) [...] // 潜在的解密器

    @ColorInt
    public static int blendARGB(@ColorInt int v, @ColorInt int v1, @FloatRange(from = 0.0, to = 1.0) float f) {
        float f1 = ((float)Color.alpha(v)) * (1.0f - f);
        float f2 = ((float)Color.alpha(v1)) * f + f1;
        float f3 = ((float)Color.red(v)) * (1.0f - f);
        float f4 = ((float)Color.red(v1)) * f + f3;
        float f5 = ((float)Color.green(v)) * (1.0f - f);
        float f6 = ((float)Color.green(v1)) * f + f5;
        float f7 = ((float)Color.blue(v)) * (1.0f - f);
        return Color.argb(((int)f2), ((int)f4), ((int)f6), ((int)(((float)Color.blue(v1)) * f + f7)));
    }

    public static void blendHSL(@NonNull float[] arr_f, @NonNull float[] arr_f1, @FloatRange(from = 0.0, to = 1.0) float f, @NonNull float[] arr_f2) {
        if(arr_f2.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f1 = arr_f[0];
        float f2 = arr_f1[0];
        if(Float.compare(Math.abs(f2 - f1), 180.0f) > 0) {
            if(f2 > f1) {
                f1 += 360.0f;
            }
            else {
                f2 += 360.0f;
            }
        }
        arr_f2[0] = ((f2 - f1) * f + f1) % 360.0f;
        arr_f2[1] = arr_f1[1] * f + arr_f[1] * (1.0f - f);
        arr_f2[2] = arr_f1[2] * f + arr_f[2] * (1.0f - f);
    }

    public static void blendLAB(@NonNull double[] arr_f, @NonNull double[] arr_f1, @FloatRange(from = 0.0, to = 1.0) double f, @NonNull double[] arr_f2) {
        if(arr_f2.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        arr_f2[0] = arr_f1[0] * f + arr_f[0] * (1.0 - f);
        arr_f2[1] = arr_f1[1] * f + arr_f[1] * (1.0 - f);
        arr_f2[2] = arr_f1[2] * f + arr_f[2] * (1.0 - f);
    }

    public static double c(double f) {
        return f > 0.008856 ? Math.pow(f, 0.333333) : (f * 903.3 + 16.0) / 116.0;
    }

    public static double calculateContrast(@ColorInt int v, @ColorInt int v1) {
        if(Color.alpha(v1) != 0xFF) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(v1));
        }
        if(Color.alpha(v) < 0xFF) {
            v = ColorUtils.compositeColors(v, v1);
        }
        double f = ColorUtils.calculateLuminance(v);
        double f1 = ColorUtils.calculateLuminance(v1);
        return Math.max(f + 0.05, f1 + 0.05) / Math.min(f + 0.05, f1 + 0.05);
    }

    @FloatRange(from = 0.0, to = 1.0)
    public static double calculateLuminance(@ColorInt int v) {
        ThreadLocal threadLocal0 = ColorUtils.a;
        double[] arr_f = (double[])threadLocal0.get();
        if(arr_f == null) {
            arr_f = new double[3];
            threadLocal0.set(arr_f);
        }
        ColorUtils.colorToXYZ(v, arr_f);
        return arr_f[1] / 100.0;
    }

    public static int calculateMinimumAlpha(@ColorInt int v, @ColorInt int v1, float f) {
        int v2 = 0xFF;
        if(Color.alpha(v1) != 0xFF) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(v1));
        }
        if(ColorUtils.calculateContrast(ColorUtils.setAlphaComponent(v, 0xFF), v1) < ((double)f)) {
            return -1;
        }
        int v4 = 0;
        for(int v3 = 0; v3 <= 10 && v2 - v4 > 1; ++v3) {
            int v5 = (v4 + v2) / 2;
            if(ColorUtils.calculateContrast(ColorUtils.setAlphaComponent(v, v5), v1) < ((double)f)) {
                v4 = v5;
            }
            else {
                v2 = v5;
            }
        }
        return v2;
    }

    public static void colorToHSL(@ColorInt int v, @NonNull float[] arr_f) {
        ColorUtils.RGBToHSL(Color.red(v), Color.green(v), Color.blue(v), arr_f);
    }

    public static void colorToLAB(@ColorInt int v, @NonNull double[] arr_f) {
        ColorUtils.RGBToLAB(Color.red(v), Color.green(v), Color.blue(v), arr_f);
    }

    public static void colorToM3HCT(@ColorInt int v, @NonNull @Size(3L) float[] arr_f) {
        CamColor.getM3HCTfromColor(v, arr_f);
    }

    public static void colorToXYZ(@ColorInt int v, @NonNull double[] arr_f) {
        ColorUtils.RGBToXYZ(Color.red(v), Color.green(v), Color.blue(v), arr_f);
    }

    public static int compositeColors(@ColorInt int v, @ColorInt int v1) {
        int v2 = Color.alpha(v1);
        int v3 = Color.alpha(v);
        int v4 = 0xFF - (0xFF - v3) * (0xFF - v2) / 0xFF;
        return Color.argb(v4, ColorUtils.a(Color.red(v), v3, Color.red(v1), v2, v4), ColorUtils.a(Color.green(v), v3, Color.green(v1), v2, v4), ColorUtils.a(Color.blue(v), v3, Color.blue(v1), v2, v4));
    }

    @NonNull
    @RequiresApi(26)
    public static Color compositeColors(@NonNull Color color0, @NonNull Color color1) {
        return g.a(color0, color1);
    }

    public static double distanceEuclidean(@NonNull double[] arr_f, @NonNull double[] arr_f1) {
        return Math.sqrt(Math.pow(arr_f[2] - arr_f1[2], 2.0) + (Math.pow(arr_f[1] - arr_f1[1], 2.0) + Math.pow(arr_f[0] - arr_f1[0], 2.0)));
    }

    @ColorInt
    public static int setAlphaComponent(@ColorInt int v, @IntRange(from = 0L, to = 0xFFL) int v1) {
        if(v1 < 0 || v1 > 0xFF) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return v & 0xFFFFFF | v1 << 24;
    }
}


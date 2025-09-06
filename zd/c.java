package zd;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

public abstract class c extends b {
    @SinceKotlin(version = "1.2")
    public static final double acosh(double f) {
        if(f < 1.0) {
            return NaN;
        }
        if(f > a.d) {
            return Math.log(f) + a.a;
        }
        if(f - 1.0 >= a.c) {
            return Math.log(Math.sqrt(f * f - 1.0) + f);
        }
        double f1 = Math.sqrt(f - 1.0);
        return (f1 >= a.b ? f1 - f1 * f1 * f1 / 12.0 : Math.sqrt(f - 1.0)) * 1.414214;
    }

    @SinceKotlin(version = "1.2")
    public static final double asinh(double f) {
        double f1 = a.c;
        if(f >= f1) {
            if(Double.compare(f, a.e) > 0) {
                return f > a.d ? Math.log(f) + a.a : Math.log(1.0 / (f * 2.0) + f * 2.0);
            }
            return Math.log(Math.sqrt(f * f + 1.0) + f);
        }
        if(f <= -f1) {
            return -c.asinh(-f);
        }
        return Math.abs(f) >= a.b ? f - f * f * f / 6.0 : f;
    }

    @SinceKotlin(version = "1.2")
    public static final double atanh(double f) {
        if(Math.abs(f) < a.c) {
            return Math.abs(f) > a.b ? f + f * f * f / 3.0 : f;
        }
        return Math.log((f + 1.0) / (1.0 - f)) / 2.0;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static void getAbsoluteValue$annotations(double f) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static void getAbsoluteValue$annotations(float f) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static void getAbsoluteValue$annotations(int v) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static void getAbsoluteValue$annotations(long v) {
    }

    public static int getSign(int v) {
        if(v < 0) {
            return -1;
        }
        return v <= 0 ? 0 : 1;
    }

    public static int getSign(long v) {
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            return -1;
        }
        return v1 <= 0 ? 0 : 1;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static void getSign$annotations(double f) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static void getSign$annotations(float f) {
    }

    @SinceKotlin(version = "1.2")
    public static void getSign$annotations(int v) {
    }

    @SinceKotlin(version = "1.2")
    public static void getSign$annotations(long v) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static void getUlp$annotations(double f) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static void getUlp$annotations(float f) {
    }

    @SinceKotlin(version = "1.2")
    public static final double log(double f, double f1) {
        return f1 <= 0.0 || f1 == 1.0 ? NaN : Math.log(f) / Math.log(f1);
    }

    @SinceKotlin(version = "1.2")
    public static final float log(float f, float f1) {
        return f1 <= 0.0f || f1 == 1.0f ? NaNf : ((float)(Math.log(f) / Math.log(f1)));
    }

    @SinceKotlin(version = "1.2")
    public static final double log2(double f) {
        return Math.log(f) / a.a;
    }

    @SinceKotlin(version = "1.2")
    public static final float log2(float f) {
        return (float)(Math.log(f) / a.a);
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(double f) {
        if(Double.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if(f > 2147483647.0) {
            return 0x7FFFFFFF;
        }
        return f < -2147483648.0 ? 0x80000000 : ((int)Math.round(f));
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(float f) {
        if(Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    @SinceKotlin(version = "1.2")
    public static long roundToLong(double f) {
        if(Double.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    @SinceKotlin(version = "1.2")
    public static long roundToLong(float f) {
        return c.roundToLong(f);
    }

    @SinceKotlin(version = "1.2")
    public static final double truncate(double f) {
        if(!Double.isNaN(f) && !Double.isInfinite(f)) {
            return f > 0.0 ? Math.floor(f) : Math.ceil(f);
        }
        return f;
    }

    @SinceKotlin(version = "1.2")
    public static final float truncate(float f) {
        if(!Float.isNaN(f) && !Float.isInfinite(f)) {
            return f > 0.0f ? ((float)Math.floor(f)) : ((float)Math.ceil(f));
        }
        return f;
    }
}


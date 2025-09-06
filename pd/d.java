package pd;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class d extends c {
    @SinceKotlin(version = "1.4")
    public static final byte maxOf(byte b, @NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "other");
        for(int v = 0; v < arr_b.length; ++v) {
            b = (byte)Math.max(b, arr_b[v]);
        }
        return b;
    }

    @SinceKotlin(version = "1.4")
    public static final double maxOf(double f, @NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "other");
        for(int v = 0; v < arr_f.length; ++v) {
            f = Math.max(f, arr_f[v]);
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    public static float maxOf(float f, @NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "other");
        for(int v = 0; v < arr_f.length; ++v) {
            f = Math.max(f, arr_f[v]);
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    public static int maxOf(int v, @NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "other");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = Math.max(v, arr_v[v1]);
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    public static final long maxOf(long v, @NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "other");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = Math.max(v, arr_v[v1]);
        }
        return v;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static Comparable maxOf(@NotNull Comparable comparable0, @NotNull Comparable comparable1) {
        Intrinsics.checkNotNullParameter(comparable0, "a");
        Intrinsics.checkNotNullParameter(comparable1, "b");
        return comparable0.compareTo(comparable1) >= 0 ? comparable0 : comparable1;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Comparable maxOf(@NotNull Comparable comparable0, @NotNull Comparable comparable1, @NotNull Comparable comparable2) {
        Intrinsics.checkNotNullParameter(comparable0, "a");
        Intrinsics.checkNotNullParameter(comparable1, "b");
        Intrinsics.checkNotNullParameter(comparable2, "c");
        return d.maxOf(comparable0, d.maxOf(comparable1, comparable2));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final Comparable maxOf(@NotNull Comparable comparable0, @NotNull Comparable[] arr_comparable) {
        Intrinsics.checkNotNullParameter(comparable0, "a");
        Intrinsics.checkNotNullParameter(arr_comparable, "other");
        for(int v = 0; v < arr_comparable.length; ++v) {
            comparable0 = d.maxOf(comparable0, arr_comparable[v]);
        }
        return comparable0;
    }

    @SinceKotlin(version = "1.4")
    public static final short maxOf(short v, @NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "other");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = (short)Math.max(v, arr_v[v1]);
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    public static final byte minOf(byte b, @NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "other");
        for(int v = 0; v < arr_b.length; ++v) {
            b = (byte)Math.min(b, arr_b[v]);
        }
        return b;
    }

    @SinceKotlin(version = "1.4")
    public static final double minOf(double f, @NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "other");
        for(int v = 0; v < arr_f.length; ++v) {
            f = Math.min(f, arr_f[v]);
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    public static float minOf(float f, @NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "other");
        for(int v = 0; v < arr_f.length; ++v) {
            f = Math.min(f, arr_f[v]);
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    public static final int minOf(int v, @NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "other");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = Math.min(v, arr_v[v1]);
        }
        return v;
    }

    @SinceKotlin(version = "1.4")
    public static final long minOf(long v, @NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "other");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = Math.min(v, arr_v[v1]);
        }
        return v;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Comparable minOf(@NotNull Comparable comparable0, @NotNull Comparable comparable1) {
        Intrinsics.checkNotNullParameter(comparable0, "a");
        Intrinsics.checkNotNullParameter(comparable1, "b");
        return comparable0.compareTo(comparable1) <= 0 ? comparable0 : comparable1;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Comparable minOf(@NotNull Comparable comparable0, @NotNull Comparable comparable1, @NotNull Comparable comparable2) {
        Intrinsics.checkNotNullParameter(comparable0, "a");
        Intrinsics.checkNotNullParameter(comparable1, "b");
        Intrinsics.checkNotNullParameter(comparable2, "c");
        return d.minOf(comparable0, d.minOf(comparable1, comparable2));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final Comparable minOf(@NotNull Comparable comparable0, @NotNull Comparable[] arr_comparable) {
        Intrinsics.checkNotNullParameter(comparable0, "a");
        Intrinsics.checkNotNullParameter(arr_comparable, "other");
        for(int v = 0; v < arr_comparable.length; ++v) {
            comparable0 = d.minOf(comparable0, arr_comparable[v]);
        }
        return comparable0;
    }

    @SinceKotlin(version = "1.4")
    public static final short minOf(short v, @NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "other");
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = (short)Math.min(v, arr_v[v1]);
        }
        return v;
    }
}


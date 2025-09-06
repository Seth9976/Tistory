package pd;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class h {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short maxOf-5PvTz6A(short v, short v1) {
        return Intrinsics.compare(v & 0xFFFF, 0xFFFF & v1) >= 0 ? v : v1;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int maxOf-J1ME1BU(int v, int v1) {
        return Integer.compareUnsigned(v, v1) >= 0 ? v : v1;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte maxOf-Kr8caGY(byte b, byte b1) {
        return Intrinsics.compare(b & 0xFF, b1 & 0xFF) >= 0 ? b : b1;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final int maxOf-Md2H83M(int v, @NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "other");
        int v1 = UIntArray.getSize-impl(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            v = h.maxOf-J1ME1BU(v, UIntArray.get-pVg5ArA(arr_v, v2));
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final long maxOf-R03FKyM(long v, @NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "other");
        int v1 = ULongArray.getSize-impl(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            v = h.maxOf-eb3DHEI(v, ULongArray.get-s-VKNKU(arr_v, v2));
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final byte maxOf-Wr6uiD8(byte b, @NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "other");
        int v = UByteArray.getSize-impl(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            b = h.maxOf-Kr8caGY(b, UByteArray.get-w2LRezQ(arr_b, v1));
        }
        return b;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long maxOf-eb3DHEI(long v, long v1) {
        return Long.compareUnsigned(v, v1) >= 0 ? v : v1;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final short maxOf-t1qELG4(short v, @NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "other");
        int v1 = UShortArray.getSize-impl(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            v = h.maxOf-5PvTz6A(v, UShortArray.get-Mh2AYeg(arr_v, v2));
        }
        return v;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short minOf-5PvTz6A(short v, short v1) {
        return Intrinsics.compare(v & 0xFFFF, 0xFFFF & v1) <= 0 ? v : v1;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int minOf-J1ME1BU(int v, int v1) {
        return Integer.compareUnsigned(v, v1) <= 0 ? v : v1;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte minOf-Kr8caGY(byte b, byte b1) {
        return Intrinsics.compare(b & 0xFF, b1 & 0xFF) <= 0 ? b : b1;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final int minOf-Md2H83M(int v, @NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "other");
        int v1 = UIntArray.getSize-impl(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            v = h.minOf-J1ME1BU(v, UIntArray.get-pVg5ArA(arr_v, v2));
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final long minOf-R03FKyM(long v, @NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "other");
        int v1 = ULongArray.getSize-impl(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            v = h.minOf-eb3DHEI(v, ULongArray.get-s-VKNKU(arr_v, v2));
        }
        return v;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final byte minOf-Wr6uiD8(byte b, @NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "other");
        int v = UByteArray.getSize-impl(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            b = h.minOf-Kr8caGY(b, UByteArray.get-w2LRezQ(arr_b, v1));
        }
        return b;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long minOf-eb3DHEI(long v, long v1) {
        return Long.compareUnsigned(v, v1) <= 0 ? v : v1;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    public static final short minOf-t1qELG4(short v, @NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "other");
        int v1 = UShortArray.getSize-impl(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            v = h.minOf-5PvTz6A(v, UShortArray.get-Mh2AYeg(arr_v, v2));
        }
        return v;
    }
}


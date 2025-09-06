package io.reactivex.internal.util;

public final class Pow2 {
    public static boolean isPowerOfTwo(int v) {
        return (v & v - 1) == 0;
    }

    public static int roundToPowerOfTwo(int v) {
        return 1 << 0x20 - Integer.numberOfLeadingZeros(v - 1);
    }
}


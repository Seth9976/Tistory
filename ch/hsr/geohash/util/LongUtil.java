package ch.hsr.geohash.util;

public class LongUtil {
    public static final long FIRST_BIT = 0x8000000000000000L;

    public static final int commonPrefixLength(long v, long v1) {
        int v2 = 0;
        while(v2 < 0x40 && (v & 0x8000000000000000L) == (0x8000000000000000L & v1)) {
            ++v2;
            v <<= 1;
            v1 <<= 1;
        }
        return v2;
    }
}


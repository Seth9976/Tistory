package md;

import g.a;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;

public abstract class e extends a {
    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final byte rotateLeft(byte b, int v) {
        return (byte)((b & 0xFF) >>> 8 - (v & 7) | b << (v & 7));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final short rotateLeft(short v, int v1) {
        return (short)((v & 0xFFFF) >>> 16 - (v1 & 15) | v << (v1 & 15));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final byte rotateRight(byte b, int v) {
        return (byte)((b & 0xFF) >>> (v & 7) | b << 8 - (v & 7));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final short rotateRight(short v, int v1) {
        return (short)((v & 0xFFFF) >>> (v1 & 15) | v << 16 - (v1 & 15));
    }
}


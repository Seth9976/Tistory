package androidx.compose.ui.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\u001A\u0011\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0086\b\u001A\u0011\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0002\u001A\u00020\u0006H\u0086\b\u001A\r\u0010\u0007\u001A\u00020\u0006*\u00020\u0001H\u0086\b\u001A\r\u0010\u0007\u001A\u00020\u0006*\u00020\u0005H\u0086\b¨\u0006\b"}, d2 = {"doubleFromBits", "", "bits", "", "floatFromBits", "", "", "fastRoundToInt", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class InlineClassHelper_jvmKt {
    public static final double doubleFromBits(long v) {
        return Double.longBitsToDouble(v);
    }

    public static final int fastRoundToInt(double f) {
        return (int)Math.round(f);
    }

    public static final int fastRoundToInt(float f) {
        return Math.round(f);
    }

    public static final float floatFromBits(int v) {
        return Float.intBitsToFloat(v);
    }
}


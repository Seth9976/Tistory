package androidx.compose.runtime.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000B\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001A\u0015\u0010\u0006\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0002H\u0080\b\u001A\u0015\u0010\u0006\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0004H\u0080\b\"\u0018\u0010\u0000\u001A\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0000\u001A\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0000\u0010\u0005¨\u0006\b"}, d2 = {"isNan", "", "", "(D)Z", "", "(F)Z", "equalsWithNanFix", "other", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FloatingPointEquality_androidKt {
    public static final boolean equalsWithNanFix(double f, double f1) {
        return f == f1;
    }

    public static final boolean equalsWithNanFix(float f, float f1) {
        return f == f1;
    }

    public static final boolean isNan(double f) {
        return (Double.doubleToRawLongBits(f) & 0x7FFFFFFFFFFFFFFFL) > 0x7FF0000000000000L;
    }

    public static final boolean isNan(float f) {
        return (Float.floatToRawIntBits(f) & 0x7FFFFFFF) > 0x7F800000;
    }
}


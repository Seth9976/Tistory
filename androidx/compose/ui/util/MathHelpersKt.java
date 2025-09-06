package androidx.compose.ui.util;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import zd.c;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u001A\u000E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001\u001A)\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u0001H\u0086\b\u001A)\u0010\b\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u0001H\u0086\b\u001A\u001E\u0010\t\u001A\u00020\u00012\u0006\u0010\n\u001A\u00020\u00012\u0006\u0010\u000B\u001A\u00020\u00012\u0006\u0010\f\u001A\u00020\u0001\u001A\u001E\u0010\t\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u0001\u001A\u001E\u0010\t\u001A\u00020\u000E2\u0006\u0010\n\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u0001\u001A\u0015\u0010\u000F\u001A\u00020\u0010*\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u0010H\u0086\b\u001A\u0015\u0010\u000F\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001A\u00020\u0001H\u0086\b\u001A\u0015\u0010\u0012\u001A\u00020\u0010*\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0010H\u0086\b\u001A\u0015\u0010\u0012\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u0001H\u0086\b\u001A\u001D\u0010\u0014\u001A\u00020\u0010*\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0010H\u0086\b\u001A\u001D\u0010\u0014\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u0001H\u0086\b¨\u0006\u0015"}, d2 = {"fastCbrt", "", "x", "fastMaxOf", "a", "b", "c", "d", "fastMinOf", "lerp", "start", "stop", "fraction", "", "", "fastCoerceAtLeast", "", "minimumValue", "fastCoerceAtMost", "maximumValue", "fastCoerceIn", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMathHelpers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,241:1\n78#1,9:243\n104#1,9:252\n28#2:242\n22#2:261\n*S KotlinDebug\n*F\n+ 1 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n71#1:243,9\n97#1:252,9\n31#1:242\n233#1:261\n*E\n"})
public final class MathHelpersKt {
    public static final float fastCbrt(float f) {
        float f1 = Float.intBitsToFloat(((int)((((long)Float.floatToRawIntBits(f)) & 0x1FFFFFFFFL) / 3L)) + 0x2A510554);
        float f2 = f1 - (f1 - f / (f1 * f1)) * 0.333333f;
        return f2 - (f2 - f / (f2 * f2)) * 0.333333f;
    }

    public static final double fastCoerceAtLeast(double f, double f1) {
        return f < f1 ? f1 : f;
    }

    public static final float fastCoerceAtLeast(float f, float f1) {
        return f < f1 ? f1 : f;
    }

    public static final double fastCoerceAtMost(double f, double f1) {
        return f > f1 ? f1 : f;
    }

    public static final float fastCoerceAtMost(float f, float f1) {
        return f > f1 ? f1 : f;
    }

    public static final double fastCoerceIn(double f, double f1, double f2) {
        if(f < f1) {
            f = f1;
        }
        return f > f2 ? f2 : f;
    }

    public static final float fastCoerceIn(float f, float f1, float f2) {
        if(f < f1) {
            f = f1;
        }
        return f > f2 ? f2 : f;
    }

    public static final float fastMaxOf(float f, float f1, float f2, float f3) {
        return Math.max(f, Math.max(f1, Math.max(f2, f3)));
    }

    public static final float fastMinOf(float f, float f1, float f2, float f3) {
        return Math.min(f, Math.min(f1, Math.min(f2, f3)));
    }

    public static final float lerp(float f, float f1, float f2) [...] // Inlined contents

    public static final int lerp(int v, int v1, float f) {
        return v + ((int)Math.round(((double)(v1 - v)) * ((double)f)));
    }

    public static final long lerp(long v, long v1, float f) {
        return c.roundToLong(((double)(v1 - v)) * ((double)f)) + v;
    }
}


package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u001D\u0010\r\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000FH\u0007¢\u0006\u0002\u0010\u0011\u001A*\u0010\u0012\u001A\u00020\u00022\u0006\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u0014\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u000FH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001A%\u0010\u0018\u001A\u00020\u0002*\u00020\u00022\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00020\u001AH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001B\u0010\u001C\"\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\u001E\u0010\u0007\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006\"\u001E\u0010\n\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"isFinite", "", "Landroidx/compose/ui/geometry/Offset;", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite-k-4lQ0M", "(J)Z", "isSpecified", "isSpecified-k-4lQ0M$annotations", "isSpecified-k-4lQ0M", "isUnspecified", "isUnspecified-k-4lQ0M$annotations", "isUnspecified-k-4lQ0M", "Offset", "x", "", "y", "(FF)J", "lerp", "start", "stop", "fraction", "lerp-Wko1d7g", "(JJF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-3MmeM6k", "(JLkotlin/jvm/functions/Function0;)J", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,311:1\n63#2,3:312\n72#2:315\n86#2:317\n63#2,3:319\n22#3:316\n22#3:318\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n31#1:312,3\n272#1:315\n273#1:317\n271#1:319,3\n272#1:316\n273#1:318\n*E\n"})
public final class OffsetKt {
    @Stable
    public static final long Offset(float f, float f1) [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static final boolean isFinite-k-4lQ0M(long v) [...] // Inlined contents

    @Stable
    public static void isFinite-k-4lQ0M$annotations(long v) {
    }

    public static final boolean isSpecified-k-4lQ0M(long v) {
        return (v & 0x7FFFFFFF7FFFFFFFL) != 0x7FC000007FC00000L;
    }

    @Stable
    public static void isSpecified-k-4lQ0M$annotations(long v) {
    }

    public static final boolean isUnspecified-k-4lQ0M(long v) {
        return (v & 0x7FFFFFFF7FFFFFFFL) == 0x7FC000007FC00000L;
    }

    @Stable
    public static void isUnspecified-k-4lQ0M$annotations(long v) {
    }

    @Stable
    public static final long lerp-Wko1d7g(long v, long v1, float f) {
        return ((long)Float.floatToRawIntBits(f * Float.intBitsToFloat(((int)(v1 >> 0x20))) + (1.0f - f) * Float.intBitsToFloat(((int)(v >> 0x20))))) << 0x20 | ((long)Float.floatToRawIntBits(f * Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))) + (1.0f - f) * Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))))) & 0xFFFFFFFFL;
    }

    public static final long takeOrElse-3MmeM6k(long v, @NotNull Function0 function00) {
        return OffsetKt.isSpecified-k-4lQ0M(v) ? v : ((Offset)function00.invoke()).unbox-impl();
    }
}


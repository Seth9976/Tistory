package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u001D\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0013\u001A*\u0010\u0014\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u00022\u0006\u0010\u0016\u001A\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001A%\u0010\u001A\u001A\u00020\u0002*\u00020\u00022\f\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00020\u001CH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001D\u0010\u001E\u001A\u001F\u0010\u001F\u001A\u00020\u0002*\u00020 2\u0006\u0010!\u001A\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001A\u001F\u0010\u001F\u001A\u00020\u0002*\u00020\u00112\u0006\u0010!\u001A\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b\"\u0010$\u001A\u001F\u0010\u001F\u001A\u00020\u0002*\u00020%2\u0006\u0010!\u001A\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b\"\u0010&\u001A\u0016\u0010\'\u001A\u00020(*\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\u001F\u0010\u0007\u001A\u00020\b*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u000B\"\u001F\u0010\f\u001A\u00020\b*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0004\u001A\u0004\b\u000E\u0010\u000B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006+"}, d2 = {"center", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Size;", "getCenter-uvyYCjk$annotations", "(J)V", "getCenter-uvyYCjk", "(J)J", "isSpecified", "", "isSpecified-uvyYCjk$annotations", "isSpecified-uvyYCjk", "(J)Z", "isUnspecified", "isUnspecified-uvyYCjk$annotations", "isUnspecified-uvyYCjk", "Size", "width", "", "height", "(FF)J", "lerp", "start", "stop", "fraction", "lerp-VgWVRYQ", "(JJF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-TmRCtEA", "(JLkotlin/jvm/functions/Function0;)J", "times", "", "size", "times-d16Qtg0", "(DJ)J", "(FJ)J", "", "(IJ)J", "toRect", "Landroidx/compose/ui/geometry/Rect;", "toRect-uvyYCjk", "(J)Landroidx/compose/ui/geometry/Rect;", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,285:1\n198#1:289\n63#2,3:286\n72#2:290\n86#2:292\n63#2,3:294\n72#2:297\n86#2:299\n22#3:291\n22#3:293\n22#3:298\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n212#1:289\n34#1:286,3\n239#1:290\n240#1:292\n238#1:294,3\n283#1:297\n283#1:299\n239#1:291\n240#1:293\n283#1:298\n*E\n"})
public final class SizeKt {
    @Stable
    public static final long Size(float f, float f1) [...] // 潜在的解密器

    public static final long getCenter-uvyYCjk(long v) {
        if(v == 0x7FC000007FC00000L) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        return OffsetKt.Offset(Float.intBitsToFloat(((int)(v >> 0x20))) / 2.0f, Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) / 2.0f);
    }

    @Stable
    public static void getCenter-uvyYCjk$annotations(long v) {
    }

    public static final boolean isSpecified-uvyYCjk(long v) {
        return v != 0x7FC000007FC00000L;
    }

    @Stable
    public static void isSpecified-uvyYCjk$annotations(long v) {
    }

    public static final boolean isUnspecified-uvyYCjk(long v) {
        return v == 0x7FC000007FC00000L;
    }

    @Stable
    public static void isUnspecified-uvyYCjk$annotations(long v) {
    }

    @Stable
    public static final long lerp-VgWVRYQ(long v, long v1, float f) {
        if(v == 0x7FC000007FC00000L || v1 == 0x7FC000007FC00000L) {
            InlineClassHelperKt.throwIllegalStateException("Offset is unspecified");
        }
        return ((long)Float.floatToRawIntBits(f * Float.intBitsToFloat(((int)(v1 >> 0x20))) + (1.0f - f) * Float.intBitsToFloat(((int)(v >> 0x20))))) << 0x20 | ((long)Float.floatToRawIntBits(f * Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))) + (1.0f - f) * Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))))) & 0xFFFFFFFFL;
    }

    public static final long takeOrElse-TmRCtEA(long v, @NotNull Function0 function00) {
        return v == 0x7FC000007FC00000L ? ((Size)function00.invoke()).unbox-impl() : v;
    }

    @Stable
    public static final long times-d16Qtg0(double f, long v) {
        return Size.times-7Ah8Wj8(v, ((float)f));
    }

    @Stable
    public static final long times-d16Qtg0(float f, long v) {
        return Size.times-7Ah8Wj8(v, f);
    }

    @Stable
    public static final long times-d16Qtg0(int v, long v1) {
        return Size.times-7Ah8Wj8(v1, ((float)v));
    }

    // 去混淆评级： 低(20)
    @Stable
    @NotNull
    public static final Rect toRect-uvyYCjk(long v) {
        return RectKt.Rect-tz77jQw(0L, v);
    }
}


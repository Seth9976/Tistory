package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\u001D\u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\tH\u0007¢\u0006\u0002\u0010\u000B\u001A\u0016\u0010\f\u001A\u00020\u0002*\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u0006\u001A\u001F\u0010\u000F\u001A\u00020\u0002*\u00020\t2\u0006\u0010\u0010\u001A\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001A\u0016\u0010\u0013\u001A\u00020\u0014*\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001A\u0016\u0010\u0017\u001A\u00020\u0002*\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0006\u001A\u0016\u0010\u0019\u001A\u00020\r*\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001A\u0010\u0006\"\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001B"}, d2 = {"center", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntSize;", "getCenter-ozmzZPI$annotations", "(J)V", "getCenter-ozmzZPI", "(J)J", "IntSize", "width", "", "height", "(II)J", "roundToIntSize", "Landroidx/compose/ui/geometry/Size;", "roundToIntSize-uvyYCjk", "times", "size", "times-O0kMr_c", "(IJ)J", "toIntRect", "Landroidx/compose/ui/unit/IntRect;", "toIntRect-ozmzZPI", "(J)Landroidx/compose/ui/unit/IntRect;", "toIntSize", "toIntSize-uvyYCjk", "toSize", "toSize-ozmzZPI", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,146:1\n100#2:147\n100#2:148\n100#2:151\n26#3:149\n26#3:150\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n33#1:147\n133#1:148\n141#1:151\n142#1:149\n143#1:150\n*E\n"})
public final class IntSizeKt {
    @Stable
    public static final long IntSize(int v, int v1) [...] // 潜在的解密器

    public static final long getCenter-ozmzZPI(long v) {
        return v << 0x20 >> 33 & 0xFFFFFFFFL | v >> 33 << 0x20;
    }

    @Stable
    public static void getCenter-ozmzZPI$annotations(long v) {
    }

    @Stable
    public static final long roundToIntSize-uvyYCjk(long v) {
        float f = Size.getWidth-impl(v);
        return IntSize.constructor-impl(((long)Math.round(Size.getHeight-impl(v))) & 0xFFFFFFFFL | ((long)Math.round(f)) << 0x20);
    }

    @Stable
    public static final long times-O0kMr_c(int v, long v1) {
        return IntSize.times-YEO4UFw(v1, v);
    }

    // 去混淆评级： 低(20)
    @Stable
    @NotNull
    public static final IntRect toIntRect-ozmzZPI(long v) {
        return IntRectKt.IntRect-VbeCjmY(0L, v);
    }

    @Stable
    public static final long toIntSize-uvyYCjk(long v) {
        int v1 = (int)Size.getWidth-impl(v);
        return IntSize.constructor-impl(((long)(((int)Size.getHeight-impl(v)))) & 0xFFFFFFFFL | ((long)v1) << 0x20);
    }

    @Stable
    public static final long toSize-ozmzZPI(long v) {
        return SizeKt.Size(IntSize.getWidth-impl(v), IntSize.getHeight-impl(v));
    }
}


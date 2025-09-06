package com.kakao.kandinsky.designsystem.util;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zd.c;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u001C\u0010\f\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\r\u001A\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u001C\u0010\f\u001A\u00020\u0007*\u00020\u00072\u0006\u0010\r\u001A\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001A\u0014\u0010\u0013\u001A\u00020\u0002*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001A\u0014\u0010\u0016\u001A\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015\u001A\u0014\u0010\u0018\u001A\u00020\u0019*\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u001A\u0010\u001B\u001A\u000F\u0010\u001C\u001A\u00020\u0007*\u00020\u0019¢\u0006\u0002\u0010\u001D\u001A\u000F\u0010\u001E\u001A\u00020\u0002*\u00020\u0019¢\u0006\u0002\u0010\u001D\"\u0015\u0010\u0000\u001A\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001A\u00020\u0006*\u00020\u00078F¢\u0006\u0006\u001A\u0004\b\b\u0010\t\"\u0015\u0010\n\u001A\u00020\u0006*\u00020\u00078F¢\u0006\u0006\u001A\u0004\b\u000B\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001F"}, d2 = {"aspectRatio", "", "Landroidx/compose/ui/geometry/Size;", "getAspectRatio-uvyYCjk", "(J)F", "isEmpty", "", "Landroidx/compose/ui/unit/IntSize;", "isEmpty-ozmzZPI", "(J)Z", "isNotEmpty", "isNotEmpty-ozmzZPI", "correctionMax", "max", "correctionMax-TmRCtEA", "(JF)J", "", "correctionMax-viCIZxY", "(JI)J", "reverse", "reverse-uvyYCjk", "(J)J", "roundToIntSize", "roundToIntSize-uvyYCjk", "toAndroidSize", "Landroid/util/Size;", "toAndroidSize-ozmzZPI", "(J)Landroid/util/Size;", "toComposeIntSize", "(Landroid/util/Size;)J", "toComposeSize", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class SizeExtensionKt {
    public static final long correctionMax-TmRCtEA(long v, float f) {
        if(f <= Size.getWidth-impl(v) || f <= Size.getHeight-impl(v)) {
            return Size.getWidth-impl(v) > Size.getHeight-impl(v) ? SizeKt.Size(f, Size.getHeight-impl(v) * f / Size.getWidth-impl(v)) : SizeKt.Size(Size.getWidth-impl(v) * f / Size.getHeight-impl(v), f);
        }
        return v;
    }

    public static final long correctionMax-viCIZxY(long v, int v1) {
        return SizeExtensionKt.roundToIntSize-uvyYCjk(SizeExtensionKt.correctionMax-TmRCtEA(IntSizeKt.toSize-ozmzZPI(v), ((float)v1)));
    }

    public static final float getAspectRatio-uvyYCjk(long v) {
        return Size.getWidth-impl(v) / Size.getHeight-impl(v);
    }

    public static final boolean isEmpty-ozmzZPI(long v) {
        return IntSize.getWidth-impl(v) <= 0 || IntSize.getHeight-impl(v) <= 0;
    }

    public static final boolean isNotEmpty-ozmzZPI(long v) {
        return IntSize.getWidth-impl(v) > 0 || IntSize.getHeight-impl(v) > 0;
    }

    public static final long reverse-uvyYCjk(long v) {
        return SizeKt.Size(Size.getHeight-impl(v), Size.getWidth-impl(v));
    }

    public static final long roundToIntSize-uvyYCjk(long v) {
        return IntSizeKt.IntSize(c.roundToInt(Size.getWidth-impl(v)), c.roundToInt(Size.getHeight-impl(v)));
    }

    @NotNull
    public static final android.util.Size toAndroidSize-ozmzZPI(long v) {
        return new android.util.Size(IntSize.getWidth-impl(v), IntSize.getHeight-impl(v));
    }

    public static final long toComposeIntSize(@NotNull android.util.Size size0) {
        Intrinsics.checkNotNullParameter(size0, "<this>");
        return IntSizeKt.IntSize(size0.getWidth(), size0.getHeight());
    }

    public static final long toComposeSize(@NotNull android.util.Size size0) {
        Intrinsics.checkNotNullParameter(size0, "<this>");
        return SizeKt.Size(size0.getWidth(), size0.getHeight());
    }
}


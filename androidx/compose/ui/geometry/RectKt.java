package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\u001A\"\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A\"\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001A\"\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u000B\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A \u0010\u0010\u001A\u00020\u00012\u0006\u0010\u0011\u001A\u00020\u00012\u0006\u0010\u0012\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\rH\u0007\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0014"}, d2 = {"Rect", "Landroidx/compose/ui/geometry/Rect;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "bottomRight", "Rect-0a9Yr6o", "(JJ)Landroidx/compose/ui/geometry/Rect;", "offset", "size", "Landroidx/compose/ui/geometry/Size;", "Rect-tz77jQw", "center", "radius", "", "Rect-3MmeM6k", "(JF)Landroidx/compose/ui/geometry/Rect;", "lerp", "start", "stop", "fraction", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class RectKt {
    @Stable
    @NotNull
    public static final Rect Rect-0a9Yr6o(long v, long v1) {
        return new Rect(Offset.getX-impl(v), Offset.getY-impl(v), Offset.getX-impl(v1), Offset.getY-impl(v1));
    }

    @Stable
    @NotNull
    public static final Rect Rect-3MmeM6k(long v, float f) {
        return new Rect(Offset.getX-impl(v) - f, Offset.getY-impl(v) - f, Offset.getX-impl(v) + f, Offset.getY-impl(v) + f);
    }

    @Stable
    @NotNull
    public static final Rect Rect-tz77jQw(long v, long v1) {
        return new Rect(Offset.getX-impl(v), Offset.getY-impl(v), Size.getWidth-impl(v1) + Offset.getX-impl(v), Size.getHeight-impl(v1) + Offset.getY-impl(v));
    }

    @Stable
    @NotNull
    public static final Rect lerp(@NotNull Rect rect0, @NotNull Rect rect1, float f) {
        return new Rect(MathHelpersKt.lerp(rect0.getLeft(), rect1.getLeft(), f), MathHelpersKt.lerp(rect0.getTop(), rect1.getTop(), f), MathHelpersKt.lerp(rect0.getRight(), rect1.getRight(), f), MathHelpersKt.lerp(rect0.getBottom(), rect1.getBottom(), f));
    }
}


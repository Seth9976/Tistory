package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\"\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A\"\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001A\"\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u000B\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A \u0010\u0010\u001A\u00020\u00012\u0006\u0010\u0011\u001A\u00020\u00012\u0006\u0010\u0012\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u0014H\u0007\u001A\f\u0010\u0015\u001A\u00020\u0001*\u00020\u0016H\u0007\u001A\f\u0010\u0017\u001A\u00020\u0016*\u00020\u0001H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0018"}, d2 = {"IntRect", "Landroidx/compose/ui/unit/IntRect;", "topLeft", "Landroidx/compose/ui/unit/IntOffset;", "bottomRight", "IntRect-E1MhUcY", "(JJ)Landroidx/compose/ui/unit/IntRect;", "offset", "size", "Landroidx/compose/ui/unit/IntSize;", "IntRect-VbeCjmY", "center", "radius", "", "IntRect-ar5cAso", "(JI)Landroidx/compose/ui/unit/IntRect;", "lerp", "start", "stop", "fraction", "", "roundToIntRect", "Landroidx/compose/ui/geometry/Rect;", "toRect", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIntRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,335:1\n26#2:336\n26#2:337\n26#2:338\n26#2:339\n*S KotlinDebug\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n*L\n330#1:336\n331#1:337\n332#1:338\n333#1:339\n*E\n"})
public final class IntRectKt {
    @Stable
    @NotNull
    public static final IntRect IntRect-E1MhUcY(long v, long v1) {
        return new IntRect(IntOffset.getX-impl(v), IntOffset.getY-impl(v), IntOffset.getX-impl(v1), IntOffset.getY-impl(v1));
    }

    @Stable
    @NotNull
    public static final IntRect IntRect-VbeCjmY(long v, long v1) {
        return new IntRect(IntOffset.getX-impl(v), IntOffset.getY-impl(v), IntSize.getWidth-impl(v1) + IntOffset.getX-impl(v), IntSize.getHeight-impl(v1) + IntOffset.getY-impl(v));
    }

    @Stable
    @NotNull
    public static final IntRect IntRect-ar5cAso(long v, int v1) {
        return new IntRect(IntOffset.getX-impl(v) - v1, IntOffset.getY-impl(v) - v1, IntOffset.getX-impl(v) + v1, IntOffset.getY-impl(v) + v1);
    }

    @Stable
    @NotNull
    public static final IntRect lerp(@NotNull IntRect intRect0, @NotNull IntRect intRect1, float f) {
        return new IntRect(MathHelpersKt.lerp(intRect0.getLeft(), intRect1.getLeft(), f), MathHelpersKt.lerp(intRect0.getTop(), intRect1.getTop(), f), MathHelpersKt.lerp(intRect0.getRight(), intRect1.getRight(), f), MathHelpersKt.lerp(intRect0.getBottom(), intRect1.getBottom(), f));
    }

    @Stable
    @NotNull
    public static final IntRect roundToIntRect(@NotNull Rect rect0) {
        return new IntRect(Math.round(rect0.getLeft()), Math.round(rect0.getTop()), Math.round(rect0.getRight()), Math.round(rect0.getBottom()));
    }

    @Stable
    @NotNull
    public static final Rect toRect(@NotNull IntRect intRect0) {
        return new Rect(((float)intRect0.getLeft()), ((float)intRect0.getTop()), ((float)intRect0.getRight()), ((float)intRect0.getBottom()));
    }
}


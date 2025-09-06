package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A*\u0010\u0004\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001A*\u0010\u0006\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0005\u001A&\u0010\r\u001A\u00020\u0000*\u00020\u00072\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000E"}, d2 = {"", "right", "Lkotlin/Function0;", "defaultValue", "addExactOrElse", "(IILkotlin/jvm/functions/Function0;)I", "subtractExactOrElse", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Rect;", "rect1", "rect2", "findClosestRect-9KIMszo", "(JLandroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)I", "findClosestRect", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathUtils.kt\nandroidx/compose/foundation/text/input/internal/MathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class MathUtilsKt {
    public static final float a(long v, Rect rect0) {
        if(SelectionManagerKt.containsInclusive-Uv8p0NA(rect0, v)) {
            return 0.0f;
        }
        float f = Offset.getDistanceSquared-impl(Offset.minus-MK-Hz9U(rect0.getTopLeft-F1C5BW0(), v));
        if(f >= 3.402823E+38f) {
            f = 3.402823E+38f;
        }
        float f1 = Offset.getDistanceSquared-impl(Offset.minus-MK-Hz9U(rect0.getTopRight-F1C5BW0(), v));
        if(f1 < f) {
            f = f1;
        }
        float f2 = Offset.getDistanceSquared-impl(Offset.minus-MK-Hz9U(rect0.getBottomLeft-F1C5BW0(), v));
        if(f2 < f) {
            f = f2;
        }
        float f3 = Offset.getDistanceSquared-impl(Offset.minus-MK-Hz9U(rect0.getBottomRight-F1C5BW0(), v));
        return f3 < f ? f3 : f;
    }

    public static final int addExactOrElse(int v, int v1, @NotNull Function0 function00) {
        int v2 = v + v1;
        return ((v ^ v2) & (v1 ^ v2)) >= 0 ? v2 : ((Number)function00.invoke()).intValue();
    }

    public static final int findClosestRect-9KIMszo(long v, @NotNull Rect rect0, @NotNull Rect rect1) {
        int v1 = Float.compare(MathUtilsKt.a(v, rect0), MathUtilsKt.a(v, rect1));
        if(v1 == 0) {
            return 0;
        }
        return v1 >= 0 ? 1 : -1;
    }

    public static final int subtractExactOrElse(int v, int v1, @NotNull Function0 function00) {
        int v2 = v - v1;
        return ((v ^ v2) & (v1 ^ v)) >= 0 ? v2 : ((Number)function00.invoke()).intValue();
    }
}


package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\"\u0010\t\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000F\u001A\u00020\f2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000Ej\u0002\b\u0010j\u0002\b\u0011\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode;", "", "Landroidx/compose/ui/geometry/Offset;", "position", "Landroidx/compose/ui/geometry/Rect;", "bounds", "", "compare-3MmeM6k$foundation_release", "(JLandroidx/compose/ui/geometry/Rect;)I", "compare", "start", "end", "", "isSelected-2x9bVx0$foundation_release", "(Landroidx/compose/ui/geometry/Rect;JJ)Z", "isSelected", "Vertical", "Horizontal", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract enum SelectionMode {
    Vertical(null) /* 警告！未生成枚举子类：androidx.compose.foundation.text.selection.m1 */,
    Horizontal(null) /* 警告！未生成枚举子类：androidx.compose.foundation.text.selection.l1 */;

    public SelectionMode(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public static boolean a(Rect rect0, long v) {
        float f = Offset.getX-impl(v);
        if(rect0.getLeft() <= f && f <= rect0.getRight()) {
            float f1 = Offset.getY-impl(v);
            return rect0.getTop() <= f1 && f1 <= rect0.getBottom();
        }
        return false;
    }

    public abstract int compare-3MmeM6k$foundation_release(long arg1, @NotNull Rect arg2);

    public final boolean isSelected-2x9bVx0$foundation_release(@NotNull Rect rect0, long v, long v1) {
        int v2 = 1;
        if(!SelectionMode.a(rect0, v) && !SelectionMode.a(rect0, v1)) {
            int v3 = this.compare-3MmeM6k$foundation_release(v, rect0);
            if(this.compare-3MmeM6k$foundation_release(v1, rect0) <= 0) {
                v2 = 0;
            }
            return (v3 <= 0 ? 0 : 1) ^ v2;
        }
        return true;
    }
}


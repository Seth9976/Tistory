package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.ranges.c;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001A2\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001A*\u0010\u000B\u001A\u00020\f2\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A2\u0010\u0010\u001A\u00020\f2\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0013"}, d2 = {"finalConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxIntrinsicWidth", "", "finalConstraints-tfFHcEY", "(JZIF)J", "finalMaxLines", "", "maxLinesIn", "finalMaxLines-xdlQI24", "(ZII)I", "finalMaxWidth", "finalMaxWidth-tfFHcEY", "(JZIF)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LayoutUtilsKt {
    public static final long finalConstraints-tfFHcEY(long v, boolean z, int v1, float f) {
        int v2 = LayoutUtilsKt.finalMaxWidth-tfFHcEY(v, z, v1, f);
        return Constraints.Companion.fitPrioritizingWidth-Zbe2FdA(0, v2, 0, Constraints.getMaxHeight-impl(v));
    }

    // 去混淆评级： 低(40)
    public static final int finalMaxLines-xdlQI24(boolean z, int v, int v1) {
        return !z && TextOverflow.equals-impl0(v, 2) ? 1 : c.coerceAtLeast(v1, 1);
    }

    // 去混淆评级： 低(25)
    public static final int finalMaxWidth-tfFHcEY(long v, boolean z, int v1, float f) {
        int v2 = !z && !TextOverflow.equals-impl0(v1, 2) || !Constraints.getHasBoundedWidth-impl(v) ? 0x7FFFFFFF : Constraints.getMaxWidth-impl(v);
        return Constraints.getMinWidth-impl(v) == v2 ? v2 : c.coerceIn(TextDelegateKt.ceilToIntPx(f), Constraints.getMinWidth-impl(v), v2);
    }
}


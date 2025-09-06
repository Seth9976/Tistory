package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@LayoutScopeMarker
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\'J \u0010\u0006\u001A\u00020\u0003*\u00020\u00032\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\'J\u0014\u0010\u0006\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u000B\u001A\u00020\fH\'J \u0010\r\u001A\u00020\u0003*\u00020\u00032\b\b\u0001\u0010\r\u001A\u00020\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u0010H\'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/ColumnScope;", "", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLine", "Landroidx/compose/ui/layout/VerticalAlignmentLine;", "weight", "", "fill", "", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ColumnScope {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Modifier weight$default(ColumnScope columnScope0, Modifier modifier0, float f, boolean z, int v, Object object0) {
            return ColumnScope.weight$default(columnScope0, modifier0, f, z, v, object0);
        }
    }

    @Stable
    @NotNull
    Modifier align(@NotNull Modifier arg1, @NotNull Horizontal arg2);

    @Stable
    @NotNull
    Modifier alignBy(@NotNull Modifier arg1, @NotNull VerticalAlignmentLine arg2);

    @Stable
    @NotNull
    Modifier alignBy(@NotNull Modifier arg1, @NotNull Function1 arg2);

    @Stable
    @NotNull
    Modifier weight(@NotNull Modifier arg1, @FloatRange(from = 0.0, fromInclusive = false) float arg2, boolean arg3);

    static Modifier weight$default(ColumnScope columnScope0, Modifier modifier0, float f, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if((v & 2) != 0) {
            z = true;
        }
        return columnScope0.weight(modifier0, f, z);
    }
}


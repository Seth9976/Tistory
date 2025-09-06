package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ExperimentalLayoutApi
@LayoutScopeMarker
@Immutable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001A\u00020\u0003*\u00020\u00032\b\b\u0003\u0010\u0004\u001A\u00020\u0005H\'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/FlowRowScope;", "Landroidx/compose/foundation/layout/RowScope;", "fillMaxRowHeight", "Landroidx/compose/ui/Modifier;", "fraction", "", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface FlowRowScope extends RowScope {
    @ExperimentalLayoutApi
    @NotNull
    Modifier fillMaxRowHeight(@NotNull Modifier arg1, @FloatRange(from = 0.0, to = 1.0) float arg2);

    static Modifier fillMaxRowHeight$default(FlowRowScope flowRowScope0, Modifier modifier0, float f, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxRowHeight");
        }
        if((v & 1) != 0) {
            f = 1.0f;
        }
        return flowRowScope0.fillMaxRowHeight(modifier0, f);
    }
}


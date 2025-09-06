package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@ExperimentalLayoutApi
@LayoutScopeMarker
@Immutable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001R\u001A\u0010\u0002\u001A\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R\u001A\u0010\b\u001A\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001A\u0004\b\n\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/FlowRowOverflowScope;", "Landroidx/compose/foundation/layout/FlowRowScope;", "shownItemCount", "", "getShownItemCount$annotations", "()V", "getShownItemCount", "()I", "totalItemCount", "getTotalItemCount$annotations", "getTotalItemCount", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface FlowRowOverflowScope extends FlowRowScope {
    int getShownItemCount();

    @ExperimentalLayoutApi
    static void getShownItemCount$annotations() {
    }

    int getTotalItemCount();

    @ExperimentalLayoutApi
    static void getTotalItemCount$annotations() {
    }
}


package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001A\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"mainAxisViewportSize", "", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "getMainAxisViewportSize", "(Landroidx/compose/foundation/pager/PagerLayoutInfo;)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PagerLayoutInfoKt {
    public static final int getMainAxisViewportSize(@NotNull PagerLayoutInfo pagerLayoutInfo0) {
        return pagerLayoutInfo0.getOrientation() == Orientation.Vertical ? IntSize.getHeight-impl(pagerLayoutInfo0.getViewportSize-YbymL2g()) : IntSize.getWidth-impl(pagerLayoutInfo0.getViewportSize-YbymL2g());
    }
}


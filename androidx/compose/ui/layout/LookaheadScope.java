package androidx.compose.ui.layout;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J2\u0010\u0007\u001A\u00020\b*\u00020\u00032\u0006\u0010\t\u001A\u00020\u00032\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\f\u0010\u000F\u001A\u00020\u0003*\u00020\u0003H&R\u0016\u0010\u0002\u001A\u00020\u0003*\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/LookaheadScope;", "", "lookaheadScopeCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "localLookaheadPositionOf", "Landroidx/compose/ui/geometry/Offset;", "sourceCoordinates", "relativeToSource", "includeMotionFrameOfReference", "", "localLookaheadPositionOf-au-aQtc", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "toLookaheadCoordinates", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LookaheadScope {
    @NotNull
    LayoutCoordinates getLookaheadScopeCoordinates(@NotNull PlacementScope arg1);

    default long localLookaheadPositionOf-au-aQtc(@NotNull LayoutCoordinates layoutCoordinates0, @NotNull LayoutCoordinates layoutCoordinates1, long v, boolean z) {
        return LookaheadScopeKt.localLookaheadPositionOf-Fgt4K4Q(this, layoutCoordinates0, layoutCoordinates1, v, z);
    }

    static long localLookaheadPositionOf-au-aQtc$default(LookaheadScope lookaheadScope0, LayoutCoordinates layoutCoordinates0, LayoutCoordinates layoutCoordinates1, long v, boolean z, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-au-aQtc");
        }
        if((v1 & 2) != 0) {
            v = 0L;
        }
        if((v1 & 4) != 0) {
            z = true;
        }
        return lookaheadScope0.localLookaheadPositionOf-au-aQtc(layoutCoordinates0, layoutCoordinates1, v, z);
    }

    @NotNull
    LayoutCoordinates toLookaheadCoordinates(@NotNull LayoutCoordinates arg1);
}


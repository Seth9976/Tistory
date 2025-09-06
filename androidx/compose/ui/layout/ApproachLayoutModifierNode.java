package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import z1.c;
import z1.d;
import z1.e;
import z1.f;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001A\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001A\u00020\t*\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000EH&ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010J\u0014\u0010\u0011\u001A\u00020\u0003*\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u0014H\u0016J\u001C\u0010\u0015\u001A\u00020\u0016*\u00020\u00172\u0006\u0010\u000B\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u0016H\u0016J\u001C\u0010\u001A\u001A\u00020\u0016*\u00020\u00172\u0006\u0010\u000B\u001A\u00020\u00182\u0006\u0010\u001B\u001A\u00020\u0016H\u0016J&\u0010\u001C\u001A\u00020\t*\u00020\u001D2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000EH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001E\u0010\u001FJ\u001C\u0010 \u001A\u00020\u0016*\u00020\u00172\u0006\u0010\u000B\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u0016H\u0016J\u001C\u0010!\u001A\u00020\u0016*\u00020\u00172\u0006\u0010\u000B\u001A\u00020\u00182\u0006\u0010\u001B\u001A\u00020\u0016H\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "isMeasurementApproachInProgress", "", "lookaheadSize", "Landroidx/compose/ui/unit/IntSize;", "isMeasurementApproachInProgress-ozmzZPI", "(J)Z", "approachMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "approachMeasure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "isPlacementApproachInProgress", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "lookaheadCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "maxApproachIntrinsicHeight", "", "Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxApproachIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureScope;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minApproachIntrinsicHeight", "minApproachIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ApproachLayoutModifierNode extends LayoutModifierNode {
    // 检测为 Lambda 实现
    @NotNull
    MeasureResult approachMeasure-3p2s80s(@NotNull ApproachMeasureScope arg1, @NotNull Measurable arg2, long arg3);

    boolean isMeasurementApproachInProgress-ozmzZPI(long arg1);

    default boolean isPlacementApproachInProgress(@NotNull PlacementScope placeable$PlacementScope0, @NotNull LayoutCoordinates layoutCoordinates0) {
        return false;
    }

    default int maxApproachIntrinsicHeight(@NotNull ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        c c0 = (ApproachMeasureScope arg1, Measurable arg2, long arg3) -> ;;
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(c0, approachIntrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    default int maxApproachIntrinsicWidth(@NotNull ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        d d0 = (ApproachMeasureScope arg1, Measurable arg2, long arg3) -> ;;
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(d0, approachIntrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    default MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull Measurable measurable0, long v) {
        Placeable placeable0 = measurable0.measure-BRTryo0(v);
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new a(placeable0), 4, null);
    }

    default int minApproachIntrinsicHeight(@NotNull ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        e e0 = (ApproachMeasureScope arg1, Measurable arg2, long arg3) -> ;;
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(e0, approachIntrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    default int minApproachIntrinsicWidth(@NotNull ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        f f0 = (ApproachMeasureScope arg1, Measurable arg2, long arg3) -> ;;
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(f0, approachIntrinsicMeasureScope0, intrinsicMeasurable0, v);
    }
}


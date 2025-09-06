package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001C\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0003H\u0016J\u001C\u0010\b\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0003H\u0016J&\u0010\n\u001A\u00020\u000B*\u00020\f2\u0006\u0010\u0005\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001C\u0010\u0012\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0003H\u0016J\u001C\u0010\u0013\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0003H\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LayoutModifierNode extends DelegatableNode {
    default int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        j j0 = (MeasureScope arg1, Measurable arg2, long arg3) -> ;;
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(j0, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    default int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        k k0 = (MeasureScope arg1, Measurable arg2, long arg3) -> ;;
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(k0, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    // 检测为 Lambda 实现
    @NotNull
    MeasureResult measure-3p2s80s(@NotNull MeasureScope arg1, @NotNull Measurable arg2, long arg3);

    default int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        l l0 = (MeasureScope arg1, Measurable arg2, long arg3) -> ;;
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(l0, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    default int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        m m0 = (MeasureScope arg1, Measurable arg2, long arg3) -> ;;
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(m0, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }
}


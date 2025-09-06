package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.ApproachIntrinsicMeasureScope;
import androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.IntrinsicsMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.ConstraintsKt;
import b2.o;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0004\u0017\u0018\u0019\u001AJ/\u0010\f\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000BJ/\u0010\u000F\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\bH\u0000¢\u0006\u0004\b\u000E\u0010\u000BJ/\u0010\u0011\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u000BJ/\u0010\u0013\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u000BJ/\u0010\f\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00152\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u0016J/\u0010\u000F\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00152\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\bH\u0000¢\u0006\u0004\b\u000E\u0010\u0016J/\u0010\u0011\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00152\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0016J/\u0010\u0013\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00152\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u0016¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics;", "", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$ApproachMeasureBlock;", "measureBlock", "Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "intrinsicMeasurable", "", "h", "minWidth$ui_release", "(Landroidx/compose/ui/node/NodeMeasuringIntrinsics$ApproachMeasureBlock;Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "minWidth", "w", "minHeight$ui_release", "minHeight", "maxWidth$ui_release", "maxWidth", "maxHeight$ui_release", "maxHeight", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$MeasureBlock;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "(Landroidx/compose/ui/node/NodeMeasuringIntrinsics$MeasureBlock;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "ApproachMeasureBlock", "b2/o", "b2/p", "MeasureBlock", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NodeMeasuringIntrinsics {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J&\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$ApproachMeasureBlock;", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface ApproachMeasureBlock {
        @NotNull
        MeasureResult measure-3p2s80s(@NotNull ApproachMeasureScope arg1, @NotNull Measurable arg2, long arg3);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J&\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$MeasureBlock;", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface MeasureBlock {
        @NotNull
        MeasureResult measure-3p2s80s(@NotNull MeasureScope arg1, @NotNull Measurable arg2, long arg3);
    }

    public static final int $stable;
    @NotNull
    public static final NodeMeasuringIntrinsics INSTANCE;

    static {
        NodeMeasuringIntrinsics.INSTANCE = new NodeMeasuringIntrinsics();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final int maxHeight$ui_release(@NotNull ApproachMeasureBlock nodeMeasuringIntrinsics$ApproachMeasureBlock0, @NotNull ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        o o0 = new o(intrinsicMeasurable0, 2, 2, 0);
        long v1 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
        return nodeMeasuringIntrinsics$ApproachMeasureBlock0.measure-3p2s80s(new ApproachIntrinsicsMeasureScope(approachIntrinsicMeasureScope0, approachIntrinsicMeasureScope0.getLayoutDirection()), o0, v1).getHeight();
    }

    public final int maxHeight$ui_release(@NotNull MeasureBlock nodeMeasuringIntrinsics$MeasureBlock0, @NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        o o0 = new o(intrinsicMeasurable0, 2, 2, 0);
        long v1 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
        return nodeMeasuringIntrinsics$MeasureBlock0.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), o0, v1).getHeight();
    }

    public final int maxWidth$ui_release(@NotNull ApproachMeasureBlock nodeMeasuringIntrinsics$ApproachMeasureBlock0, @NotNull ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        o o0 = new o(intrinsicMeasurable0, 2, 1, 0);
        long v1 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
        return nodeMeasuringIntrinsics$ApproachMeasureBlock0.measure-3p2s80s(new ApproachIntrinsicsMeasureScope(approachIntrinsicMeasureScope0, approachIntrinsicMeasureScope0.getLayoutDirection()), o0, v1).getWidth();
    }

    public final int maxWidth$ui_release(@NotNull MeasureBlock nodeMeasuringIntrinsics$MeasureBlock0, @NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        o o0 = new o(intrinsicMeasurable0, 2, 1, 0);
        long v1 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
        return nodeMeasuringIntrinsics$MeasureBlock0.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), o0, v1).getWidth();
    }

    public final int minHeight$ui_release(@NotNull ApproachMeasureBlock nodeMeasuringIntrinsics$ApproachMeasureBlock0, @NotNull ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        o o0 = new o(intrinsicMeasurable0, 1, 2, 0);
        long v1 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
        return nodeMeasuringIntrinsics$ApproachMeasureBlock0.measure-3p2s80s(new ApproachIntrinsicsMeasureScope(approachIntrinsicMeasureScope0, approachIntrinsicMeasureScope0.getLayoutDirection()), o0, v1).getHeight();
    }

    public final int minHeight$ui_release(@NotNull MeasureBlock nodeMeasuringIntrinsics$MeasureBlock0, @NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        o o0 = new o(intrinsicMeasurable0, 1, 2, 0);
        long v1 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
        return nodeMeasuringIntrinsics$MeasureBlock0.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), o0, v1).getHeight();
    }

    public final int minWidth$ui_release(@NotNull ApproachMeasureBlock nodeMeasuringIntrinsics$ApproachMeasureBlock0, @NotNull ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        o o0 = new o(intrinsicMeasurable0, 1, 1, 0);
        long v1 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
        return nodeMeasuringIntrinsics$ApproachMeasureBlock0.measure-3p2s80s(new ApproachIntrinsicsMeasureScope(approachIntrinsicMeasureScope0, approachIntrinsicMeasureScope0.getLayoutDirection()), o0, v1).getWidth();
    }

    public final int minWidth$ui_release(@NotNull MeasureBlock nodeMeasuringIntrinsics$MeasureBlock0, @NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        o o0 = new o(intrinsicMeasurable0, 1, 1, 0);
        long v1 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
        return nodeMeasuringIntrinsics$MeasureBlock0.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), o0, v1).getWidth();
    }
}


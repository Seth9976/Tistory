package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.ranges.c;

public final class a4 extends Node implements LayoutModifierNode {
    public float n;
    public float o;

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        int v1 = intrinsicMeasurable0.maxIntrinsicHeight(v);
        return Dp.equals-impl0(this.o, NaNf) ? c.coerceAtLeast(v1, 0) : c.coerceAtLeast(v1, intrinsicMeasureScope0.roundToPx-0680j_4(this.o));
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        int v1 = intrinsicMeasurable0.maxIntrinsicWidth(v);
        return Dp.equals-impl0(this.n, NaNf) ? c.coerceAtLeast(v1, 0) : c.coerceAtLeast(v1, intrinsicMeasureScope0.roundToPx-0680j_4(this.n));
    }

    // 去混淆评级： 低(30)
    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        Placeable placeable0 = measurable0.measure-BRTryo0(ConstraintsKt.Constraints((Dp.equals-impl0(this.n, NaNf) || Constraints.getMinWidth-impl(v) != 0 ? Constraints.getMinWidth-impl(v) : c.coerceAtLeast(c.coerceAtMost(measureScope0.roundToPx-0680j_4(this.n), Constraints.getMaxWidth-impl(v)), 0)), Constraints.getMaxWidth-impl(v), (Dp.equals-impl0(this.o, NaNf) || Constraints.getMinHeight-impl(v) != 0 ? Constraints.getMinHeight-impl(v) : c.coerceAtLeast(c.coerceAtMost(measureScope0.roundToPx-0680j_4(this.o), Constraints.getMaxHeight-impl(v)), 0)), Constraints.getMaxHeight-impl(v)));
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new z3(placeable0), 4, null);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        int v1 = intrinsicMeasurable0.minIntrinsicHeight(v);
        return Dp.equals-impl0(this.o, NaNf) ? c.coerceAtLeast(v1, 0) : c.coerceAtLeast(v1, intrinsicMeasureScope0.roundToPx-0680j_4(this.o));
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        int v1 = intrinsicMeasurable0.minIntrinsicWidth(v);
        return Dp.equals-impl0(this.n, NaNf) ? c.coerceAtLeast(v1, 0) : c.coerceAtLeast(v1, intrinsicMeasureScope0.roundToPx-0680j_4(this.n));
    }
}


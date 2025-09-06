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

public final class u3 extends Node implements LayoutModifierNode {
    public float n;
    public float o;
    public float p;
    public float q;
    public boolean r;

    public final long b(IntrinsicMeasureScope intrinsicMeasureScope0) {
        int v3;
        int v = 0;
        int v1 = Dp.equals-impl0(this.p, NaNf) ? 0x7FFFFFFF : c.coerceAtLeast(intrinsicMeasureScope0.roundToPx-0680j_4(this.p), 0);
        int v2 = Dp.equals-impl0(this.q, NaNf) ? 0x7FFFFFFF : c.coerceAtLeast(intrinsicMeasureScope0.roundToPx-0680j_4(this.q), 0);
        if(Dp.equals-impl0(this.n, NaNf)) {
            v3 = 0;
        }
        else {
            v3 = c.coerceAtLeast(c.coerceAtMost(intrinsicMeasureScope0.roundToPx-0680j_4(this.n), v1), 0);
            if(v3 == 0x7FFFFFFF) {
                v3 = 0;
            }
        }
        if(!Dp.equals-impl0(this.o, NaNf)) {
            int v4 = c.coerceAtLeast(c.coerceAtMost(intrinsicMeasureScope0.roundToPx-0680j_4(this.o), v2), 0);
            if(v4 != 0x7FFFFFFF) {
                v = v4;
            }
        }
        return ConstraintsKt.Constraints(v3, v1, v, v2);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        long v1 = this.b(intrinsicMeasureScope0);
        return Constraints.getHasFixedHeight-impl(v1) ? Constraints.getMaxHeight-impl(v1) : ConstraintsKt.constrainHeight-K40F9xA(v1, intrinsicMeasurable0.maxIntrinsicHeight(v));
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        long v1 = this.b(intrinsicMeasureScope0);
        return Constraints.getHasFixedWidth-impl(v1) ? Constraints.getMaxWidth-impl(v1) : ConstraintsKt.constrainWidth-K40F9xA(v1, intrinsicMeasurable0.maxIntrinsicWidth(v));
    }

    // 去混淆评级： 低(46)
    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        long v1 = this.b(measureScope0);
        Placeable placeable0 = measurable0.measure-BRTryo0((this.r ? ConstraintsKt.constrain-N9IONVI(v, v1) : ConstraintsKt.Constraints((Dp.equals-impl0(this.n, NaNf) ? c.coerceAtMost(Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v1)) : Constraints.getMinWidth-impl(v1)), (Dp.equals-impl0(this.p, NaNf) ? c.coerceAtLeast(Constraints.getMaxWidth-impl(v), Constraints.getMinWidth-impl(v1)) : Constraints.getMaxWidth-impl(v1)), (Dp.equals-impl0(this.o, NaNf) ? c.coerceAtMost(Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v1)) : Constraints.getMinHeight-impl(v1)), (Dp.equals-impl0(this.q, NaNf) ? c.coerceAtLeast(Constraints.getMaxHeight-impl(v), Constraints.getMinHeight-impl(v1)) : Constraints.getMaxHeight-impl(v1)))));
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new t3(placeable0), 4, null);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        long v1 = this.b(intrinsicMeasureScope0);
        return Constraints.getHasFixedHeight-impl(v1) ? Constraints.getMaxHeight-impl(v1) : ConstraintsKt.constrainHeight-K40F9xA(v1, intrinsicMeasurable0.minIntrinsicHeight(v));
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        long v1 = this.b(intrinsicMeasureScope0);
        return Constraints.getHasFixedWidth-impl(v1) ? Constraints.getMaxWidth-impl(v1) : ConstraintsKt.constrainWidth-K40F9xA(v1, intrinsicMeasurable0.minIntrinsicWidth(v));
    }
}


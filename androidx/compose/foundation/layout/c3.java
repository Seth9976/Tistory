package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;

public abstract class c3 extends Node implements LayoutModifierNode {
    public abstract long b(Measurable arg1, long arg2);

    public abstract boolean c();

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return intrinsicMeasurable0.maxIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return intrinsicMeasurable0.maxIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        long v1 = this.b(measurable0, v);
        if(this.c()) {
            v1 = ConstraintsKt.constrain-N9IONVI(v, v1);
        }
        Placeable placeable0 = measurable0.measure-BRTryo0(v1);
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new b3(placeable0), 4, null);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return intrinsicMeasurable0.minIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return intrinsicMeasurable0.minIntrinsicWidth(v);
    }
}


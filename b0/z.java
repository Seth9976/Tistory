package b0;

import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;

public final class z extends Node implements LayoutModifierNode {
    public float n;
    public State o;
    public State p;

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        State state0 = this.o;
        int v1 = state0 == null || ((Number)state0.getValue()).intValue() == 0x7FFFFFFF ? 0x7FFFFFFF : Math.round(((Number)state0.getValue()).floatValue() * this.n);
        State state1 = this.p;
        int v2 = state1 == null || ((Number)state1.getValue()).intValue() == 0x7FFFFFFF ? 0x7FFFFFFF : Math.round(((Number)state1.getValue()).floatValue() * this.n);
        int v3 = v1 == 0x7FFFFFFF ? Constraints.getMinWidth-impl(v) : v1;
        int v4 = v2 == 0x7FFFFFFF ? Constraints.getMinHeight-impl(v) : v2;
        if(v1 == 0x7FFFFFFF) {
            v1 = Constraints.getMaxWidth-impl(v);
        }
        if(v2 == 0x7FFFFFFF) {
            v2 = Constraints.getMaxHeight-impl(v);
        }
        Placeable placeable0 = measurable0.measure-BRTryo0(ConstraintsKt.Constraints(v3, v1, v4, v2));
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new y(placeable0), 4, null);
    }
}


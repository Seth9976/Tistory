package w0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

public final class t0 extends Node implements LayoutModifierNode {
    public AnchoredDraggableState n;
    public Function2 o;
    public Orientation p;
    public boolean q;

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        Placeable placeable0 = measurable0.measure-BRTryo0(v);
        if(!measureScope0.isLookingAhead() || !this.q) {
            Pair pair0 = (Pair)this.o.invoke(IntSize.box-impl(IntSizeKt.IntSize(placeable0.getWidth(), placeable0.getHeight())), Constraints.box-impl(v));
            this.n.updateAnchors(((DraggableAnchors)pair0.getFirst()), pair0.getSecond());
        }
        this.q = measureScope0.isLookingAhead() || this.q;
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new s0(measureScope0, this, placeable0), 4, null);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onDetach() {
        this.q = false;
    }
}


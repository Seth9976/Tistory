package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final class b extends Node implements ApproachLayoutModifierNode {
    public Function3 n;
    public Function1 o;
    public Function2 p;

    @Override  // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public final MeasureResult approachMeasure-3p2s80s(ApproachMeasureScope approachMeasureScope0, Measurable measurable0, long v) {
        return (MeasureResult)this.n.invoke(approachMeasureScope0, measurable0, Constraints.box-impl(v));
    }

    @Override  // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public final boolean isMeasurementApproachInProgress-ozmzZPI(long v) {
        return ((Boolean)this.o.invoke(IntSize.box-impl(v))).booleanValue();
    }

    @Override  // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public final boolean isPlacementApproachInProgress(PlacementScope placeable$PlacementScope0, LayoutCoordinates layoutCoordinates0) {
        return ((Boolean)this.p.invoke(placeable$PlacementScope0, layoutCoordinates0)).booleanValue();
    }
}


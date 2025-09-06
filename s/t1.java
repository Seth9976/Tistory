package s;

import androidx.compose.animation.n;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class t1 extends Node implements LayoutModifierNode {
    public Constraints n;
    public final MutableState o;
    public final MutableState p;

    public t1(n n0, Function0 function00) {
        this.o = SnapshotStateKt.mutableStateOf$default(n0, null, 2, null);
        this.p = SnapshotStateKt.mutableStateOf$default(function00, null, 2, null);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        if(measureScope0.isLookingAhead()) {
            this.n = Constraints.box-impl(v);
        }
        Constraints constraints0 = this.n;
        Intrinsics.checkNotNull(constraints0);
        Placeable placeable0 = measurable0.measure-BRTryo0(constraints0.unbox-impl());
        long v1 = IntSizeKt.IntSize(placeable0.getWidth(), placeable0.getHeight());
        long v2 = ConstraintsKt.constrain-4WqzIAM(v, v1);
        return MeasureScope.layout$default(measureScope0, IntSize.getWidth-impl(v2), IntSize.getHeight-impl(v2), null, new s1(this, placeable0, v1, v2, measureScope0), 4, null);
    }
}


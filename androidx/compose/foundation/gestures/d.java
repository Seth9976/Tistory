package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import qd.a;
import z.n;

public final class d extends DragGestureNode {
    public OverscrollEffect A;
    public boolean B;
    public AnchoredDraggableState x;
    public Orientation y;
    public Boolean z;

    public final boolean c() {
        Boolean boolean0 = this.z;
        if(boolean0 == null) {
            return DelegatableNodeKt.requireLayoutDirection(this) == LayoutDirection.Rtl && this.y == Orientation.Horizontal;
        }
        Intrinsics.checkNotNull(boolean0);
        return boolean0.booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    public final Object drag(Function2 function20, Continuation continuation0) {
        Object object0 = AnchoredDraggableState.anchoredDrag$default(this.x, null, new c(function20, this, null), continuation0, 1, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    public final void onDragStarted-k-4lQ0M(long v) {
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    public final void onDragStopped-TH1AsA0(long v) {
        if(!this.isAttached()) {
            return;
        }
        BuildersKt.launch$default(this.getCoroutineScope(), null, null, new n(this, v, null), 3, null);
    }

    @Override  // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean startDragImmediately() {
        return this.B;
    }
}


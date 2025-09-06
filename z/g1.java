package z;

import androidx.compose.foundation.gestures.DragGestureNode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class g1 extends ContinuationImpl {
    public DragGestureNode o;
    public Object p;
    public final DragGestureNode q;
    public int r;

    public g1(DragGestureNode dragGestureNode0, Continuation continuation0) {
        this.q = dragGestureNode0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return DragGestureNode.access$processDragCancel(this.q, this);
    }
}


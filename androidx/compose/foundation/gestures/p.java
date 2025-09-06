package androidx.compose.foundation.gestures;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class p extends ContinuationImpl {
    public DragGestureNode o;
    public DragStopped p;
    public Object q;
    public final DragGestureNode r;
    public int s;

    public p(DragGestureNode dragGestureNode0, Continuation continuation0) {
        this.r = dragGestureNode0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return DragGestureNode.access$processDragStop(this.r, null, this);
    }
}


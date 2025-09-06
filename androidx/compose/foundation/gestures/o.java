package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.DragInteraction.Start;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class o extends ContinuationImpl {
    public DragGestureNode o;
    public DragStarted p;
    public Start q;
    public Object r;
    public final DragGestureNode s;
    public int t;

    public o(DragGestureNode dragGestureNode0, Continuation continuation0) {
        this.s = dragGestureNode0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return DragGestureNode.access$processDragStart(this.s, null, this);
    }
}


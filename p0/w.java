package p0;

import androidx.compose.material.AnchoredDraggableState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class w extends ContinuationImpl {
    public AnchoredDraggableState o;
    public Object p;
    public final AnchoredDraggableState q;
    public int r;

    public w(AnchoredDraggableState anchoredDraggableState0, Continuation continuation0) {
        this.q = anchoredDraggableState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.anchoredDrag(null, null, null, this);
    }
}


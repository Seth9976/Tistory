package androidx.compose.foundation.gestures.snapping;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h extends ContinuationImpl {
    public Object o;
    public final SnapFlingBehavior p;
    public int q;

    public h(SnapFlingBehavior snapFlingBehavior0, Continuation continuation0) {
        this.p = snapFlingBehavior0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return SnapFlingBehavior.access$tryApproach(this.p, null, 0.0f, 0.0f, null, this);
    }
}


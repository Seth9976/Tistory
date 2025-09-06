package androidx.compose.foundation.gestures.snapping;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

public final class c extends ContinuationImpl {
    public Function1 o;
    public Object p;
    public final SnapFlingBehavior q;
    public int r;

    public c(SnapFlingBehavior snapFlingBehavior0, Continuation continuation0) {
        this.q = snapFlingBehavior0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.a(null, 0.0f, null, this);
    }
}


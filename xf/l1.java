package xf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ReduceKt.firstOrNull..inlined.collectWhile.2;

public final class l1 extends ContinuationImpl {
    public ObjectRef o;
    public FlowKt__ReduceKt.firstOrNull..inlined.collectWhile.2 p;
    public Object q;
    public int r;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.r |= 0x80000000;
        return FlowKt.firstOrNull(null, null, this);
    }
}


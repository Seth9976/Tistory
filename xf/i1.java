package xf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ReduceKt.first..inlined.collectWhile.1;

public final class i1 extends ContinuationImpl {
    public ObjectRef o;
    public FlowKt__ReduceKt.first..inlined.collectWhile.1 p;
    public Object q;
    public int r;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.r |= 0x80000000;
        return FlowKt.first(null, this);
    }
}


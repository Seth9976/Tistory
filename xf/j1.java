package xf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ReduceKt.first..inlined.collectWhile.2;

public final class j1 extends ContinuationImpl {
    public Function2 o;
    public ObjectRef p;
    public FlowKt__ReduceKt.first..inlined.collectWhile.2 q;
    public Object r;
    public int s;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.s |= 0x80000000;
        return FlowKt.first(null, null, this);
    }
}


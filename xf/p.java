package xf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.IntRef;
import kotlinx.coroutines.flow.FlowKt;

public final class p extends ContinuationImpl {
    public IntRef o;
    public Object p;
    public int q;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.q |= 0x80000000;
        return FlowKt.count(null, this);
    }
}


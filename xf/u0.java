package xf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__LimitKt.collectWhile.collector.1;

public final class u0 extends ContinuationImpl {
    public FlowKt__LimitKt.collectWhile.collector.1 o;
    public Object p;
    public int q;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.q |= 0x80000000;
        return d1.b(null, null, this);
    }
}


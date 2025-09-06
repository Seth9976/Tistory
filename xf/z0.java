package xf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

public final class z0 extends ContinuationImpl {
    public FlowCollector o;
    public Object p;
    public int q;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.q |= 0x80000000;
        return d1.a(null, null, this);
    }
}


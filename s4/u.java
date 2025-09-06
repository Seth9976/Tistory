package s4;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class u extends ContinuationImpl {
    public Object o;
    public final androidx.paging.FlowExtKt.combineWithoutBatching.2.1.1.1 p;
    public int q;

    public u(androidx.paging.FlowExtKt.combineWithoutBatching.2.1.1.1 flowExtKt$combineWithoutBatching$2$1$1$10, Continuation continuation0) {
        this.p = flowExtKt$combineWithoutBatching$2$1$1$10;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.emit(null, this);
    }
}


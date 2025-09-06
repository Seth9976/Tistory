package kotlinx.coroutines.selects;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class a extends ContinuationImpl {
    public Object o;
    public final SelectImplementation p;
    public int q;

    public a(SelectImplementation selectImplementation0, Continuation continuation0) {
        this.p = selectImplementation0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return SelectImplementation.access$processResultAndInvokeBlockRecoveringException(this.p, null, null, this);
    }
}


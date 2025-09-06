package bg;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.selects.SelectImplementation;

public final class d extends ContinuationImpl {
    public SelectImplementation o;
    public Object p;
    public final SelectImplementation q;
    public int r;

    public d(SelectImplementation selectImplementation0, Continuation continuation0) {
        this.q = selectImplementation0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return SelectImplementation.access$doSelectSuspend(this.q, this);
    }
}


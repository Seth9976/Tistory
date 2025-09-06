package w3;

import androidx.datastore.core.MultiProcessCoordinator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h0 extends ContinuationImpl {
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public final MultiProcessCoordinator s;
    public int t;

    public h0(MultiProcessCoordinator multiProcessCoordinator0, Continuation continuation0) {
        this.s = multiProcessCoordinator0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.lock(null, this);
    }
}


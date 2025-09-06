package w3;

import androidx.datastore.core.SingleProcessCoordinator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

public final class m0 extends ContinuationImpl {
    public Mutex o;
    public boolean p;
    public Object q;
    public final SingleProcessCoordinator r;
    public int s;

    public m0(SingleProcessCoordinator singleProcessCoordinator0, Continuation continuation0) {
        this.r = singleProcessCoordinator0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.tryLock(null, this);
    }
}


package w3;

import androidx.datastore.core.RunOnce;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

public final class j0 extends ContinuationImpl {
    public RunOnce o;
    public Mutex p;
    public Object q;
    public final RunOnce r;
    public int s;

    public j0(RunOnce runOnce0, Continuation continuation0) {
        this.r = runOnce0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.runIfNeeded(this);
    }
}


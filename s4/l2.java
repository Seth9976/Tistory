package s4;

import androidx.paging.UnbatchedFlowCombiner;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

public final class l2 extends ContinuationImpl {
    public UnbatchedFlowCombiner o;
    public Object p;
    public Mutex q;
    public int r;
    public Object s;
    public final UnbatchedFlowCombiner t;
    public int u;

    public l2(UnbatchedFlowCombiner unbatchedFlowCombiner0, Continuation continuation0) {
        this.t = unbatchedFlowCombiner0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return this.t.onNext(0, null, this);
    }
}


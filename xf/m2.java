package xf;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.flow.SharedFlowImpl;

public final class m2 implements DisposableHandle {
    public final SharedFlowImpl a;
    public final long b;
    public final Object c;
    public final CancellableContinuationImpl d;

    public m2(SharedFlowImpl sharedFlowImpl0, long v, Object object0, CancellableContinuationImpl cancellableContinuationImpl0) {
        this.a = sharedFlowImpl0;
        this.b = v;
        this.c = object0;
        this.d = cancellableContinuationImpl0;
    }

    @Override  // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        SharedFlowImpl.access$cancelEmitter(this.a, this);
    }
}


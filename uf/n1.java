package uf;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;

public final class n1 implements Waiter {
    public final CancellableContinuationImpl a;

    public n1(CancellableContinuationImpl cancellableContinuationImpl0) {
        this.a = cancellableContinuationImpl0;
    }

    @Override  // kotlinx.coroutines.Waiter
    public final void invokeOnCancellation(Segment segment0, int v) {
        this.a.invokeOnCancellation(segment0, v);
    }
}


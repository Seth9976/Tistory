package uf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;

public final class h implements Waiter {
    public final CancellableContinuationImpl a;
    public final CancellableContinuationImpl b;

    public h(CancellableContinuationImpl cancellableContinuationImpl0) {
        this.a = cancellableContinuationImpl0;
        Intrinsics.checkNotNull(cancellableContinuationImpl0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
        this.b = cancellableContinuationImpl0;
    }

    @Override  // kotlinx.coroutines.Waiter
    public final void invokeOnCancellation(Segment segment0, int v) {
        this.b.invokeOnCancellation(segment0, v);
    }
}


package rd;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;

public final class b implements Continuation {
    public Result a;

    @Override  // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override  // kotlin.coroutines.Continuation
    public final void resumeWith(Object object0) {
        synchronized(this) {
            this.a = Result.box-impl(object0);
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
        }
    }
}


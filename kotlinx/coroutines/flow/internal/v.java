package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.internal.ScopeCoroutine;

public final class v extends ScopeCoroutine {
    // 去混淆评级： 低(20)
    @Override  // kotlinx.coroutines.JobSupport
    public final boolean childCancelled(Throwable throwable0) {
        return throwable0 instanceof ChildCancelledException ? true : this.cancelImpl$kotlinx_coroutines_core(throwable0);
    }
}


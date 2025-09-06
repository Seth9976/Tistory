package sf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.SelectClause1;

public final class j extends JobSupport implements CompletableDeferred {
    public j(Job job0) {
        super(true);
        this.initParentJob(job0);
    }

    @Override  // kotlinx.coroutines.Deferred
    public final Object await(Continuation continuation0) {
        return this.awaitInternal(continuation0);
    }

    @Override  // kotlinx.coroutines.CompletableDeferred
    public final boolean completeExceptionally(Throwable throwable0) {
        return this.makeCompleting$kotlinx_coroutines_core(new CompletedExceptionally(throwable0, false, 2, null));
    }

    @Override  // kotlinx.coroutines.Deferred
    public final SelectClause1 getOnAwait() {
        SelectClause1 selectClause10 = this.getOnAwaitInternal();
        Intrinsics.checkNotNull(selectClause10, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return selectClause10;
    }

    @Override  // kotlinx.coroutines.JobSupport
    public final boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return true;
    }
}


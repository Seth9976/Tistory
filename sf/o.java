package sf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.selects.SelectClause1;

public class o extends AbstractCoroutine implements Deferred {
    @Override  // kotlinx.coroutines.Deferred
    public final Object await(Continuation continuation0) {
        return this.awaitInternal(continuation0);
    }

    @Override  // kotlinx.coroutines.Deferred
    public final SelectClause1 getOnAwait() {
        SelectClause1 selectClause10 = this.getOnAwaitInternal();
        Intrinsics.checkNotNull(selectClause10, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return selectClause10;
    }
}


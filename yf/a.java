package yf;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.Job.DefaultImpls;

public final class a extends AbstractCoroutine implements BiFunction {
    public final CompletableFuture d;

    public a(CoroutineContext coroutineContext0, CompletableFuture completableFuture0) {
        super(coroutineContext0, true, true);
        this.d = completableFuture0;
    }

    @Override
    public final Object apply(Object object0, Object object1) {
        Throwable throwable0 = (Throwable)object1;
        DefaultImpls.cancel$default(this, null, 1, null);
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.AbstractCoroutine
    public final void onCancelled(Throwable throwable0, boolean z) {
        this.d.completeExceptionally(throwable0);
    }

    @Override  // kotlinx.coroutines.AbstractCoroutine
    public final void onCompleted(Object object0) {
        this.d.complete(object0);
    }
}


package zf;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay.DefaultImpls;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatchersKt;

public final class d extends MainCoroutineDispatcher implements Delay {
    public final void a() {
        MainDispatchersKt.throwMissingMainDispatcherException();
        throw new KotlinNothingValueException();
    }

    @Override  // kotlinx.coroutines.Delay
    public final Object delay(long v, Continuation continuation0) {
        return DefaultImpls.delay(this, v, continuation0);
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext0, Runnable runnable0) {
        this.a();
        throw null;
    }

    @Override  // kotlinx.coroutines.MainCoroutineDispatcher
    public final MainCoroutineDispatcher getImmediate() {
        return this;
    }

    @Override  // kotlinx.coroutines.Delay
    public final DisposableHandle invokeOnTimeout(long v, Runnable runnable0, CoroutineContext coroutineContext0) {
        this.a();
        throw null;
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext0) {
        this.a();
        throw null;
    }

    @Override  // kotlinx.coroutines.MainCoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int v) {
        this.a();
        throw null;
    }

    @Override  // kotlinx.coroutines.Delay
    public final void scheduleResumeAfterDelay(long v, CancellableContinuation cancellableContinuation0) {
        this.a();
        throw null;
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.coroutines.MainCoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Main[missing" + ']';
    }
}


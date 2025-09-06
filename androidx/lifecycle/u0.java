package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;

public final class u0 extends Lambda implements Function1 {
    public final CoroutineDispatcher w;
    public final Lifecycle x;
    public final androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.observer.1 y;

    public u0(CoroutineDispatcher coroutineDispatcher0, Lifecycle lifecycle0, androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.observer.1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$10) {
        this.w = coroutineDispatcher0;
        this.x = lifecycle0;
        this.y = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        EmptyCoroutineContext emptyCoroutineContext0 = EmptyCoroutineContext.INSTANCE;
        CoroutineDispatcher coroutineDispatcher0 = this.w;
        androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.observer.1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$10 = this.y;
        Lifecycle lifecycle0 = this.x;
        if(coroutineDispatcher0.isDispatchNeeded(emptyCoroutineContext0)) {
            coroutineDispatcher0.dispatch(emptyCoroutineContext0, new WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.2.invoke..inlined.Runnable.1(lifecycle0, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$10));
            return Unit.INSTANCE;
        }
        lifecycle0.removeObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$10);
        return Unit.INSTANCE;
    }
}


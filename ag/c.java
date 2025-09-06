package ag;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.scheduling.TasksKt;

public final class c extends CoroutineDispatcher {
    public static final c b;

    static {
        c.b = new c();  // 初始化器: Lkotlinx/coroutines/CoroutineDispatcher;-><init>()V
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext0, Runnable runnable0) {
        DefaultScheduler.INSTANCE.dispatchWithContext$kotlinx_coroutines_core(runnable0, TasksKt.BlockingContext, false);
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(CoroutineContext coroutineContext0, Runnable runnable0) {
        DefaultScheduler.INSTANCE.dispatchWithContext$kotlinx_coroutines_core(runnable0, TasksKt.BlockingContext, true);
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int v) {
        LimitedDispatcherKt.checkParallelism(v);
        return v >= TasksKt.MAX_POOL_SIZE ? this : super.limitedParallelism(v);
    }
}


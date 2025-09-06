package sf;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

public final class q implements Executor {
    public final CoroutineDispatcher a;

    public q(CoroutineDispatcher coroutineDispatcher0) {
        this.a = coroutineDispatcher0;
    }

    @Override
    public final void execute(Runnable runnable0) {
        EmptyCoroutineContext emptyCoroutineContext0 = EmptyCoroutineContext.INSTANCE;
        CoroutineDispatcher coroutineDispatcher0 = this.a;
        if(coroutineDispatcher0.isDispatchNeeded(emptyCoroutineContext0)) {
            coroutineDispatcher0.dispatch(emptyCoroutineContext0, runnable0);
            return;
        }
        runnable0.run();
    }

    // 去混淆评级： 低(20)
    @Override
    public final String toString() {
        return "CoroutineDispatcher@e8b0194";
    }
}


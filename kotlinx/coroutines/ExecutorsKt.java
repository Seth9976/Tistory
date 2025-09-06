package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import sf.q;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0011\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001A\u0011\u0010\u0000\u001A\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\b\u0003\u001A\n\u0010\u0006\u001A\u00020\u0002*\u00020\u0001*\u0010\b\u0007\u0010\u0007\"\u00020\u00042\u00020\u0004B\u0002\b\b¨\u0006\t"}, d2 = {"asCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "from", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/ExecutorService;", "asExecutor", "CloseableCoroutineDispatcher", "Lkotlinx/coroutines/ExperimentalCoroutinesApi;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ExecutorsKt {
    @ExperimentalCoroutinesApi
    public static void CloseableCoroutineDispatcher$annotations() {
    }

    @NotNull
    public static final Executor asExecutor(@NotNull CoroutineDispatcher coroutineDispatcher0) {
        ExecutorCoroutineDispatcher executorCoroutineDispatcher0 = coroutineDispatcher0 instanceof ExecutorCoroutineDispatcher ? ((ExecutorCoroutineDispatcher)coroutineDispatcher0) : null;
        if(executorCoroutineDispatcher0 != null) {
            Executor executor0 = executorCoroutineDispatcher0.getExecutor();
            if(executor0 != null) {
                return executor0;
            }
        }
        return new q(coroutineDispatcher0);
    }

    @JvmName(name = "from")
    @NotNull
    public static final CoroutineDispatcher from(@NotNull Executor executor0) {
        q q0 = executor0 instanceof q ? ((q)executor0) : null;
        if(q0 != null) {
            CoroutineDispatcher coroutineDispatcher0 = q0.a;
            if(coroutineDispatcher0 != null) {
                return coroutineDispatcher0;
            }
        }
        return new ExecutorCoroutineDispatcherImpl(executor0);
    }

    @JvmName(name = "from")
    @NotNull
    public static final ExecutorCoroutineDispatcher from(@NotNull ExecutorService executorService0) {
        return new ExecutorCoroutineDispatcherImpl(executorService0);
    }
}


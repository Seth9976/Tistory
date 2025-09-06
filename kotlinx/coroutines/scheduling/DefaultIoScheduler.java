package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.c;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.SystemPropsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0004\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0017¢\u0006\u0004\b\u000B\u0010\fJ#\u0010\u0011\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\r2\n\u0010\u0010\u001A\u00060\u0003j\u0002`\u000FH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\r2\n\u0010\u0010\u001A\u00060\u0003j\u0002`\u000FH\u0017¢\u0006\u0004\b\u0013\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001B\u001A\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Lkotlinx/coroutines/scheduling/DefaultIoScheduler;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "", "parallelism", "Lkotlinx/coroutines/CoroutineDispatcher;", "limitedParallelism", "(I)Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/Runnable;", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "close", "()V", "", "toString", "()Ljava/lang/String;", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DefaultIoScheduler extends ExecutorCoroutineDispatcher implements Executor {
    @NotNull
    public static final DefaultIoScheduler INSTANCE;
    public static final CoroutineDispatcher b;

    static {
        DefaultIoScheduler.INSTANCE = new DefaultIoScheduler();  // 初始化器: Lkotlinx/coroutines/ExecutorCoroutineDispatcher;-><init>()V
        int v = SystemPropsKt.systemProp$default("kotlinx.coroutines.io.parallelism", c.coerceAtLeast(0x40, 8), 0, 0, 12, null);
        DefaultIoScheduler.b = ag.c.b.limitedParallelism(v);
    }

    @Override  // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext coroutineContext0, @NotNull Runnable runnable0) {
        DefaultIoScheduler.b.dispatch(coroutineContext0, runnable0);
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    @InternalCoroutinesApi
    public void dispatchYield(@NotNull CoroutineContext coroutineContext0, @NotNull Runnable runnable0) {
        DefaultIoScheduler.b.dispatchYield(coroutineContext0, runnable0);
    }

    @Override
    public void execute(@NotNull Runnable runnable0) {
        this.dispatch(EmptyCoroutineContext.INSTANCE, runnable0);
    }

    @Override  // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    public Executor getExecutor() {
        return this;
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    @ExperimentalCoroutinesApi
    @NotNull
    public CoroutineDispatcher limitedParallelism(int v) {
        return ag.c.b.limitedParallelism(v);
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return "Dispatchers.IO";
    }
}


package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001A\u00020\u00102\u0006\u0010\f\u001A\u00020\u000B2\n\u0010\u000F\u001A\u00060\rj\u0002`\u000EH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001A\u00020\u00102\u0006\u0010\f\u001A\u00020\u000B2\n\u0010\u000F\u001A\u00060\rj\u0002`\u000EH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J+\u0010\u0019\u001A\u00020\u00102\n\u0010\u000F\u001A\u00060\rj\u0002`\u000E2\u0006\u0010\f\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u001A\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001D\u001A\u00020\u0010H\u0000¢\u0006\u0004\b\u001C\u0010\u001BJ\u0017\u0010!\u001A\u00020\u00102\u0006\u0010\u001E\u001A\u00020\u0005H\u0000¢\u0006\u0004\b\u001F\u0010 J\u000F\u0010#\u001A\u00020\u0010H\u0000¢\u0006\u0004\b\"\u0010\u001BR\u0014\u0010\'\u001A\u00020$8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b%\u0010&¨\u0006("}, d2 = {"Lkotlinx/coroutines/scheduling/SchedulerCoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "Lkotlinx/coroutines/scheduling/TaskContext;", "", "tailDispatch", "dispatchWithContext$kotlinx_coroutines_core", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;Z)V", "dispatchWithContext", "close", "()V", "usePrivateScheduler$kotlinx_coroutines_core", "usePrivateScheduler", "timeout", "shutdown$kotlinx_coroutines_core", "(J)V", "shutdown", "restore$kotlinx_coroutines_core", "restore", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class SchedulerCoroutineDispatcher extends ExecutorCoroutineDispatcher {
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public CoroutineScheduler f;

    public SchedulerCoroutineDispatcher() {
        this(0, 0, 0L, null, 15, null);
    }

    public SchedulerCoroutineDispatcher(int v, int v1, long v2, @NotNull String s) {
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = s;
        this.f = new CoroutineScheduler(v, v1, v2, s);
    }

    public SchedulerCoroutineDispatcher(int v, int v1, long v2, String s, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v3 & 1) != 0) {
            v = TasksKt.CORE_POOL_SIZE;
        }
        if((v3 & 2) != 0) {
            v1 = TasksKt.MAX_POOL_SIZE;
        }
        if((v3 & 4) != 0) {
            v2 = TasksKt.IDLE_WORKER_KEEP_ALIVE_NS;
        }
        if((v3 & 8) != 0) {
            s = "CoroutineScheduler";
        }
        this(v, v1, v2, s);
    }

    @Override  // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public void close() {
        this.f.close();
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext coroutineContext0, @NotNull Runnable runnable0) {
        CoroutineScheduler.dispatch$default(this.f, runnable0, null, false, 6, null);
    }

    public final void dispatchWithContext$kotlinx_coroutines_core(@NotNull Runnable runnable0, @NotNull TaskContext taskContext0, boolean z) {
        this.f.dispatch(runnable0, taskContext0, z);
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(@NotNull CoroutineContext coroutineContext0, @NotNull Runnable runnable0) {
        CoroutineScheduler.dispatch$default(this.f, runnable0, null, true, 2, null);
    }

    @Override  // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    public Executor getExecutor() {
        return this.f;
    }

    public final void restore$kotlinx_coroutines_core() {
        this.usePrivateScheduler$kotlinx_coroutines_core();
    }

    public final void shutdown$kotlinx_coroutines_core(long v) {
        synchronized(this) {
            this.f.shutdown(v);
        }
    }

    public final void usePrivateScheduler$kotlinx_coroutines_core() {
        synchronized(this) {
            this.f.shutdown(1000L);
            this.f = new CoroutineScheduler(this.b, this.c, this.d, this.e);
        }
    }
}


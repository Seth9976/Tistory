package kotlinx.coroutines.scheduling;

import ag.a;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DefaultExecutor;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\'\b\u0016\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\u000BB\u001D\b\u0017\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\fJ#\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u000E\u001A\u00020\r2\n\u0010\u0011\u001A\u00060\u000Fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001A\u00020\u00122\u0006\u0010\u000E\u001A\u00020\r2\n\u0010\u0011\u001A\u00060\u000Fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001C\u001A\u00020\u001B2\b\b\u0002\u0010\u001A\u001A\u00020\u0002¢\u0006\u0004\b\u001C\u0010\u001DJ\u0015\u0010\u001E\u001A\u00020\u001B2\u0006\u0010\u001A\u001A\u00020\u0002¢\u0006\u0004\b\u001E\u0010\u001DJ+\u0010$\u001A\u00020\u00122\n\u0010\u0011\u001A\u00060\u000Fj\u0002`\u00102\u0006\u0010\u000E\u001A\u00020\u001F2\u0006\u0010!\u001A\u00020 H\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010(\u001A\u00020%8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b&\u0010\'¨\u0006)"}, d2 = {"Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "(IILjava/lang/String;)V", "(II)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "close", "()V", "toString", "()Ljava/lang/String;", "parallelism", "Lkotlinx/coroutines/CoroutineDispatcher;", "blocking", "(I)Lkotlinx/coroutines/CoroutineDispatcher;", "limited", "Lkotlinx/coroutines/scheduling/TaskContext;", "", "tailDispatch", "dispatchWithContext$kotlinx_coroutines_core", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;Z)V", "dispatchWithContext", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
@SourceDebugExtension({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
public class ExperimentalCoroutineDispatcher extends ExecutorCoroutineDispatcher {
    public final int b;
    public final CoroutineScheduler c;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility for Ktor 1.0-beta")
    public ExperimentalCoroutineDispatcher(int v, int v1) {
        this(v, v1, TasksKt.IDLE_WORKER_KEEP_ALIVE_NS, null, 8, null);
    }

    public ExperimentalCoroutineDispatcher(int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = TasksKt.CORE_POOL_SIZE;
        }
        if((v2 & 2) != 0) {
            v1 = TasksKt.MAX_POOL_SIZE;
        }
        this(v, v1);
    }

    public ExperimentalCoroutineDispatcher(int v, int v1, long v2, @NotNull String s) {
        this.b = v;
        this.c = new CoroutineScheduler(v, v1, v2, s);
    }

    public ExperimentalCoroutineDispatcher(int v, int v1, long v2, String s, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v3 & 8) != 0) {
            s = "CoroutineScheduler";
        }
        this(v, v1, v2, s);
    }

    public ExperimentalCoroutineDispatcher(int v, int v1, @NotNull String s) {
        this(v, v1, TasksKt.IDLE_WORKER_KEEP_ALIVE_NS, s);
    }

    public ExperimentalCoroutineDispatcher(int v, int v1, String s, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = TasksKt.CORE_POOL_SIZE;
        }
        if((v2 & 2) != 0) {
            v1 = TasksKt.MAX_POOL_SIZE;
        }
        if((v2 & 4) != 0) {
            s = "DefaultDispatcher";
        }
        this(v, v1, s);
    }

    @NotNull
    public final CoroutineDispatcher blocking(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but have " + v).toString());
        }
        return new a(this, v, 1);
    }

    public static CoroutineDispatcher blocking$default(ExperimentalCoroutineDispatcher experimentalCoroutineDispatcher0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
        }
        if((v1 & 1) != 0) {
            v = 16;
        }
        return experimentalCoroutineDispatcher0.blocking(v);
    }

    @Override  // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public void close() {
        this.c.close();
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext coroutineContext0, @NotNull Runnable runnable0) {
        try {
            CoroutineScheduler.dispatch$default(this.c, runnable0, null, false, 6, null);
        }
        catch(RejectedExecutionException unused_ex) {
            DefaultExecutor.INSTANCE.dispatch(coroutineContext0, runnable0);
        }
    }

    public final void dispatchWithContext$kotlinx_coroutines_core(@NotNull Runnable runnable0, @NotNull TaskContext taskContext0, boolean z) {
        CoroutineScheduler coroutineScheduler0;
        try {
            coroutineScheduler0 = this.c;
            coroutineScheduler0.dispatch(runnable0, taskContext0, z);
        }
        catch(RejectedExecutionException unused_ex) {
            Task task0 = coroutineScheduler0.createTask(runnable0, taskContext0);
            DefaultExecutor.INSTANCE.enqueue(task0);
        }
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(@NotNull CoroutineContext coroutineContext0, @NotNull Runnable runnable0) {
        try {
            CoroutineScheduler.dispatch$default(this.c, runnable0, null, true, 2, null);
        }
        catch(RejectedExecutionException unused_ex) {
            DefaultExecutor.INSTANCE.dispatchYield(coroutineContext0, runnable0);
        }
    }

    @Override  // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    public Executor getExecutor() {
        return this.c;
    }

    @NotNull
    public final CoroutineDispatcher limited(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but have " + v).toString());
        }
        int v1 = this.b;
        if(v > v1) {
            throw new IllegalArgumentException(("Expected parallelism level lesser than core pool size (" + v1 + "), but have " + v).toString());
        }
        return new a(this, v, 0);
    }

    // 去混淆评级： 低(40)
    @Override  // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return "CoroutineDispatcher@7860fcb2[scheduler = " + this.c + ']';
    }
}


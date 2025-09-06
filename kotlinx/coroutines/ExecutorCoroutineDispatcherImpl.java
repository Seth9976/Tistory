package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ConcurrentKt;
import l5.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sf.r;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001A\u00020\f2\u0006\u0010\b\u001A\u00020\u00072\n\u0010\u000B\u001A\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ%\u0010\u0013\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u000F2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0010\u001A\u00020\u000F2\n\u0010\u000B\u001A\u00060\tj\u0002`\n2\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\u001A\u0010 \u001A\u00020\u001F2\b\u0010\u001E\u001A\u0004\u0018\u00010\u001DH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000F\u0010#\u001A\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001A\u0010\u0004\u001A\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(¨\u0006)"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcherImpl;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "timeMillis", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/DisposableHandle;", "close", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ExecutorCoroutineDispatcherImpl extends ExecutorCoroutineDispatcher implements Delay {
    public final Executor b;

    public ExecutorCoroutineDispatcherImpl(@NotNull Executor executor0) {
        this.b = executor0;
        ConcurrentKt.removeFutureOnCancel(this.getExecutor());
    }

    @Override  // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public void close() {
        Executor executor0 = this.getExecutor();
        ExecutorService executorService0 = executor0 instanceof ExecutorService ? ((ExecutorService)executor0) : null;
        if(executorService0 != null) {
            executorService0.shutdown();
        }
    }

    @Override  // kotlinx.coroutines.Delay
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object delay(long v, @NotNull Continuation continuation0) {
        return DefaultImpls.delay(this, v, continuation0);
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext coroutineContext0, @NotNull Runnable runnable0) {
        Runnable runnable1;
        try {
            Executor executor0 = this.getExecutor();
            AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
            if(abstractTimeSource0 == null) {
                runnable1 = runnable0;
            }
            else {
                runnable1 = abstractTimeSource0.wrapTask(runnable0);
                if(runnable1 == null) {
                    runnable1 = runnable0;
                }
            }
            executor0.execute(runnable1);
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            AbstractTimeSource abstractTimeSource1 = AbstractTimeSourceKt.getTimeSource();
            if(abstractTimeSource1 != null) {
                abstractTimeSource1.unTrackTask();
            }
            JobKt.cancel(coroutineContext0, ExceptionsKt.CancellationException("The task was rejected", rejectedExecutionException0));
            Dispatchers.getIO().dispatch(coroutineContext0, runnable0);
        }
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof ExecutorCoroutineDispatcherImpl && ((ExecutorCoroutineDispatcherImpl)object0).getExecutor() == this.getExecutor();
    }

    @Override  // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    public Executor getExecutor() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this.getExecutor());
    }

    @Override  // kotlinx.coroutines.Delay
    @NotNull
    public DisposableHandle invokeOnTimeout(long v, @NotNull Runnable runnable0, @NotNull CoroutineContext coroutineContext0) {
        Executor executor0 = this.getExecutor();
        ScheduledFuture scheduledFuture0 = null;
        ScheduledExecutorService scheduledExecutorService0 = executor0 instanceof ScheduledExecutorService ? ((ScheduledExecutorService)executor0) : null;
        if(scheduledExecutorService0 != null) {
            try {
                scheduledFuture0 = scheduledExecutorService0.schedule(runnable0, v, TimeUnit.MILLISECONDS);
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                JobKt.cancel(coroutineContext0, ExceptionsKt.CancellationException("The task was rejected", rejectedExecutionException0));
            }
        }
        return scheduledFuture0 != null ? new r(scheduledFuture0) : DefaultExecutor.INSTANCE.invokeOnTimeout(v, runnable0, coroutineContext0);
    }

    @Override  // kotlinx.coroutines.Delay
    public void scheduleResumeAfterDelay(long v, @NotNull CancellableContinuation cancellableContinuation0) {
        Executor executor0 = this.getExecutor();
        ScheduledFuture scheduledFuture0 = null;
        ScheduledExecutorService scheduledExecutorService0 = executor0 instanceof ScheduledExecutorService ? ((ScheduledExecutorService)executor0) : null;
        if(scheduledExecutorService0 != null) {
            a a0 = new a(this, cancellableContinuation0, false, 3);
            CoroutineContext coroutineContext0 = cancellableContinuation0.getContext();
            try {
                scheduledFuture0 = scheduledExecutorService0.schedule(a0, v, TimeUnit.MILLISECONDS);
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                JobKt.cancel(coroutineContext0, ExceptionsKt.CancellationException("The task was rejected", rejectedExecutionException0));
            }
        }
        if(scheduledFuture0 != null) {
            JobKt.cancelFutureOnCancellation(cancellableContinuation0, scheduledFuture0);
            return;
        }
        DefaultExecutor.INSTANCE.scheduleResumeAfterDelay(v, cancellableContinuation0);
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return this.getExecutor().toString();
    }
}


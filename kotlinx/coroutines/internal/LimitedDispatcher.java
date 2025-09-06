package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import l5.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0001\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001B\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0097Aø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\fJ,\u0010\u0014\u001A\u00020\u00132\u0006\u0010\r\u001A\u00020\b2\n\u0010\u0010\u001A\u00060\u000Ej\u0002`\u000F2\u0006\u0010\u0012\u001A\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0018\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\b2\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\n0\u0016H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001A\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u0004H\u0017¢\u0006\u0004\b\u001A\u0010\u001BJ#\u0010\u001C\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\u00112\n\u0010\u0010\u001A\u00060\u000Ej\u0002`\u000FH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ#\u0010\u001E\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\u00112\n\u0010\u0010\u001A\u00060\u000Ej\u0002`\u000FH\u0017¢\u0006\u0004\b\u001E\u0010\u001DR\u000B\u0010 \u001A\u00020\u001F8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "dispatcher", "", "parallelism", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "", "time", "", "delay", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "limitedParallelism", "(I)Lkotlinx/coroutines/CoroutineDispatcher;", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "l5/a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,134:1\n66#1,8:135\n66#1,8:143\n28#2,4:151\n28#2,4:156\n20#3:155\n20#3:160\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n48#1:135,8\n55#1:143,8\n79#1:151,4\n92#1:156,4\n79#1:155\n92#1:160\n*E\n"})
public final class LimitedDispatcher extends CoroutineDispatcher implements Delay {
    public final CoroutineDispatcher b;
    public final int c;
    public final Delay d;
    public final LockFreeTaskQueue e;
    public final Object f;
    public static final AtomicIntegerFieldUpdater g;
    @Volatile
    private volatile int runningWorkers;

    static {
        LimitedDispatcher.g = AtomicIntegerFieldUpdater.newUpdater(LimitedDispatcher.class, "runningWorkers");
    }

    public LimitedDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher0, int v) {
        this.b = coroutineDispatcher0;
        this.c = v;
        Delay delay0 = coroutineDispatcher0 instanceof Delay ? ((Delay)coroutineDispatcher0) : null;
        if(delay0 == null) {
            delay0 = DefaultExecutorKt.getDefaultDelay();
        }
        this.d = delay0;
        this.e = new LockFreeTaskQueue(false);
        this.f = new Object();
    }

    public final Runnable a() {
        Runnable runnable0;
        while((runnable0 = (Runnable)this.e.removeFirstOrNull()) == null) {
            synchronized(this.f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = LimitedDispatcher.g;
                atomicIntegerFieldUpdater0.decrementAndGet(this);
                if(this.e.getSize() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater0.incrementAndGet(this);
            }
        }
        return runnable0;
    }

    public final boolean b() {
        synchronized(this.f) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = LimitedDispatcher.g;
            if(atomicIntegerFieldUpdater0.get(this) >= this.c) {
                return false;
            }
            atomicIntegerFieldUpdater0.incrementAndGet(this);
            return true;
        }
    }

    @Override  // kotlinx.coroutines.Delay
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object delay(long v, @NotNull Continuation continuation0) {
        return this.d.delay(v, continuation0);
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext coroutineContext0, @NotNull Runnable runnable0) {
        this.e.addLast(runnable0);
        if(LimitedDispatcher.g.get(this) < this.c && this.b()) {
            Runnable runnable1 = this.a();
            if(runnable1 != null) {
                a a0 = new a(4, this, runnable1);
                this.b.dispatch(this, a0);
            }
        }
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    @InternalCoroutinesApi
    public void dispatchYield(@NotNull CoroutineContext coroutineContext0, @NotNull Runnable runnable0) {
        this.e.addLast(runnable0);
        if(LimitedDispatcher.g.get(this) < this.c && this.b()) {
            Runnable runnable1 = this.a();
            if(runnable1 != null) {
                a a0 = new a(4, this, runnable1);
                this.b.dispatchYield(this, a0);
            }
        }
    }

    @Override  // kotlinx.coroutines.Delay
    @NotNull
    public DisposableHandle invokeOnTimeout(long v, @NotNull Runnable runnable0, @NotNull CoroutineContext coroutineContext0) {
        return this.d.invokeOnTimeout(v, runnable0, coroutineContext0);
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    @ExperimentalCoroutinesApi
    @NotNull
    public CoroutineDispatcher limitedParallelism(int v) {
        LimitedDispatcherKt.checkParallelism(v);
        return v >= this.c ? this : super.limitedParallelism(v);
    }

    @Override  // kotlinx.coroutines.Delay
    public void scheduleResumeAfterDelay(long v, @NotNull CancellableContinuation cancellableContinuation0) {
        this.d.scheduleResumeAfterDelay(v, cancellableContinuation0);
    }
}


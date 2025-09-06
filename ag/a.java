package ag;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher;
import kotlinx.coroutines.scheduling.TaskContext;

public final class a extends ExecutorCoroutineDispatcher implements Executor, TaskContext {
    public final ExperimentalCoroutineDispatcher b;
    public final int c;
    public final int d;
    public final ConcurrentLinkedQueue e;
    public static final AtomicIntegerFieldUpdater f;
    @Volatile
    private volatile int inFlightTasks;

    static {
        a.f = AtomicIntegerFieldUpdater.newUpdater(a.class, "inFlightTasks");
    }

    public a(ExperimentalCoroutineDispatcher experimentalCoroutineDispatcher0, int v, int v1) {
        this.b = experimentalCoroutineDispatcher0;
        this.c = v;
        this.d = v1;
        this.e = new ConcurrentLinkedQueue();
    }

    public final void a(Runnable runnable0, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = a.f;
            int v = atomicIntegerFieldUpdater0.incrementAndGet(this);
            int v1 = this.c;
            if(v <= v1) {
                this.b.dispatchWithContext$kotlinx_coroutines_core(runnable0, this, z);
                return;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue0 = this.e;
            concurrentLinkedQueue0.add(runnable0);
            if(atomicIntegerFieldUpdater0.decrementAndGet(this) >= v1) {
                return;
            }
            runnable0 = (Runnable)concurrentLinkedQueue0.poll();
        }
        while(runnable0 != null);
    }

    @Override  // kotlinx.coroutines.scheduling.TaskContext
    public final void afterTask() {
        ConcurrentLinkedQueue concurrentLinkedQueue0 = this.e;
        Runnable runnable0 = (Runnable)concurrentLinkedQueue0.poll();
        if(runnable0 != null) {
            this.b.dispatchWithContext$kotlinx_coroutines_core(runnable0, this, true);
            return;
        }
        a.f.decrementAndGet(this);
        Runnable runnable1 = (Runnable)concurrentLinkedQueue0.poll();
        if(runnable1 == null) {
            return;
        }
        this.a(runnable1, true);
    }

    @Override  // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher");
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext0, Runnable runnable0) {
        this.a(runnable0, false);
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(CoroutineContext coroutineContext0, Runnable runnable0) {
        this.a(runnable0, true);
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.a(runnable0, false);
    }

    @Override  // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public final Executor getExecutor() {
        return this;
    }

    @Override  // kotlinx.coroutines.scheduling.TaskContext
    public final int getTaskMode() {
        return this.d;
    }

    // 去混淆评级： 低(40)
    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "CoroutineDispatcher@191b1e11[dispatcher = " + this.b + ']';
    }
}


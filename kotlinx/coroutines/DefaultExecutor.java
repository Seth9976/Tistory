package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u001B\u0010\u0006\u001A\u00020\u00052\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\f\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ+\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0010\u001A\u00020\b2\n\u0010\u0011\u001A\u00060\u0002j\u0002`\u00032\u0006\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u000FJ\u000F\u0010\u0019\u001A\u00020\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\u000FJ\u0015\u0010\u001B\u001A\u00020\u00052\u0006\u0010\u001A\u001A\u00020\b¢\u0006\u0004\b\u001B\u0010\u001CR\u0014\u0010\u001E\u001A\u00020\u001D8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001E\u0010\u001FR\u001E\u0010!\u001A\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000E¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010\u000FR\u0016\u0010%\u001A\u00020$8\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001A\u00020 8TX\u0094\u0004¢\u0006\u0006\u001A\u0004\b\'\u0010(R\u0014\u0010-\u001A\u00020*8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b+\u0010,¨\u0006."}, d2 = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopImplBase;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "enqueue", "(Ljava/lang/Runnable;)V", "", "now", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "delayedTask", "reschedule", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)V", "shutdown", "()V", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/DisposableHandle;", "run", "ensureStarted$kotlinx_coroutines_core", "ensureStarted", "timeout", "shutdownForTests", "(J)V", "", "THREAD_NAME", "Ljava/lang/String;", "Ljava/lang/Thread;", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "debugStatus", "I", "getThread", "()Ljava/lang/Thread;", "thread", "", "isThreadPresent$kotlinx_coroutines_core", "()Z", "isThreadPresent", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDefaultExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultExecutor.kt\nkotlinx/coroutines/DefaultExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
public final class DefaultExecutor extends EventLoopImplBase implements Runnable {
    @NotNull
    public static final DefaultExecutor INSTANCE = null;
    @NotNull
    public static final String THREAD_NAME = "kotlinx.coroutines.DefaultExecutor";
    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final long h;

    static {
        DefaultExecutor defaultExecutor0 = new DefaultExecutor();  // 初始化器: Lkotlinx/coroutines/EventLoopImplBase;-><init>()V
        DefaultExecutor.INSTANCE = defaultExecutor0;
        EventLoop.incrementUseCount$default(defaultExecutor0, false, 1, null);
        DefaultExecutor.h = TimeUnit.MILLISECONDS.toNanos(1000L);
    }

    public final void b() {
        synchronized(this) {
        }
    }

    public final Thread c() {
        synchronized(this) {
            Thread thread0 = DefaultExecutor._thread;
            if(thread0 == null) {
                thread0 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                DefaultExecutor._thread = thread0;
                thread0.setDaemon(true);
                thread0.start();
            }
            return thread0;
        }
    }

    public static boolean d() [...] // 潜在的解密器

    @Override  // kotlinx.coroutines.EventLoopImplBase
    public void enqueue(@NotNull Runnable runnable0) {
        if(DefaultExecutor.debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.enqueue(runnable0);
    }

    public final void ensureStarted$kotlinx_coroutines_core() {
        synchronized(this) {
            DefaultExecutor.debugStatus = 0;
            this.c();
            while(DefaultExecutor.debugStatus == 0) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                this.wait();
            }
        }
    }

    @Override  // kotlinx.coroutines.EventLoopImplPlatform
    @NotNull
    public Thread getThread() {
        return DefaultExecutor._thread == null ? this.c() : DefaultExecutor._thread;
    }

    @Override  // kotlinx.coroutines.EventLoopImplBase
    @NotNull
    public DisposableHandle invokeOnTimeout(long v, @NotNull Runnable runnable0, @NotNull CoroutineContext coroutineContext0) {
        return this.scheduleInvokeOnTimeout(v, runnable0);
    }

    public final boolean isThreadPresent$kotlinx_coroutines_core() {
        return DefaultExecutor._thread != null;
    }

    @Override  // kotlinx.coroutines.EventLoopImplPlatform
    public void reschedule(long v, @NotNull DelayedTask eventLoopImplBase$DelayedTask0) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override
    public void run() {
        Unit unit0;
        ThreadLocalEventLoop.INSTANCE.setEventLoop$kotlinx_coroutines_core(this);
        AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
        if(abstractTimeSource0 != null) {
            abstractTimeSource0.registerTimeLoopThread();
        }
        try {
            synchronized(this) {
                DefaultExecutor.debugStatus = 1;
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                this.notifyAll();
            }
            long v1 = 0x7FFFFFFFFFFFFFFFL;
            while(true) {
                Thread.interrupted();
                long v2 = this.processNextEvent();
                if(Long.compare(v2, 0x7FFFFFFFFFFFFFFFL) == 0) {
                    AbstractTimeSource abstractTimeSource1 = AbstractTimeSourceKt.getTimeSource();
                    long v3 = abstractTimeSource1 == null ? System.nanoTime() : abstractTimeSource1.nanoTime();
                    if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                        v1 = DefaultExecutor.h + v3;
                    }
                    long v4 = v1 - v3;
                    if(v4 <= 0L) {
                        break;
                    }
                    v2 = c.coerceAtMost(v2, v4);
                }
                else {
                    v1 = 0x7FFFFFFFFFFFFFFFL;
                }
                if(v2 > 0L) {
                    AbstractTimeSource abstractTimeSource2 = AbstractTimeSourceKt.getTimeSource();
                    if(abstractTimeSource2 == null) {
                        unit0 = null;
                    }
                    else {
                        abstractTimeSource2.parkNanos(this, v2);
                        unit0 = Unit.INSTANCE;
                    }
                    if(unit0 == null) {
                        LockSupport.parkNanos(this, v2);
                    }
                }
            }
        }
        finally {
            DefaultExecutor._thread = null;
            this.b();
            AbstractTimeSource abstractTimeSource3 = AbstractTimeSourceKt.getTimeSource();
            if(abstractTimeSource3 != null) {
                abstractTimeSource3.unregisterTimeLoopThread();
            }
            if(!this.isEmpty()) {
                this.getThread();
            }
        }
    }

    @Override  // kotlinx.coroutines.EventLoopImplBase
    public void shutdown() {
        DefaultExecutor.debugStatus = 4;
        super.shutdown();
    }

    public final void shutdownForTests(long v) {
        Unit unit0;
        synchronized(this) {
            long v2 = System.currentTimeMillis();
            DefaultExecutor.debugStatus = 2;
            while(DefaultExecutor._thread != null) {
                Thread thread0 = DefaultExecutor._thread;
                if(thread0 != null) {
                    AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
                    if(abstractTimeSource0 == null) {
                        unit0 = null;
                    }
                    else {
                        abstractTimeSource0.unpark(thread0);
                        unit0 = Unit.INSTANCE;
                    }
                    if(unit0 == null) {
                        LockSupport.unpark(thread0);
                    }
                }
                if(v2 + v - System.currentTimeMillis() <= 0L) {
                    break;
                }
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                this.wait(v);
            }
            DefaultExecutor.debugStatus = 0;
        }
    }
}


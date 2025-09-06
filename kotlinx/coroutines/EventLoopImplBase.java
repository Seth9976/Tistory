package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004./01B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0006\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J%\u0010\u000B\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00050\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ#\u0010\u0011\u001A\u00020\u00102\u0006\u0010\b\u001A\u00020\u00072\n\u0010\u000F\u001A\u00060\rj\u0002`\u000EH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001A\u00020\u00052\u0006\u0010\u0016\u001A\u00020\u00152\n\u0010\u000F\u001A\u00060\rj\u0002`\u000E¢\u0006\u0004\b\u0017\u0010\u0018J\u001B\u0010\u001A\u001A\u00020\u00052\n\u0010\u0019\u001A\u00060\rj\u0002`\u000EH\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ\u001D\u0010\u001F\u001A\u00020\u00052\u0006\u0010\u001C\u001A\u00020\u00072\u0006\u0010\u001E\u001A\u00020\u001D¢\u0006\u0004\b\u001F\u0010 J\u000F\u0010!\u001A\u00020\u0005H\u0004¢\u0006\u0004\b!\u0010\u0004R\u0014\u0010#\u001A\u00020\"8TX\u0094\u0004¢\u0006\u0006\u001A\u0004\b#\u0010$R\u0014\u0010&\u001A\u00020\u00078TX\u0094\u0004¢\u0006\u0006\u001A\u0004\b%\u0010\u0014R\u0013\u0010)\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010(0\'8\u0002X\u0082\u0004R\u000B\u0010+\u001A\u00020*8\u0002X\u0082\u0004R\u0013\u0010-\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010,0\'8\u0002X\u0082\u0004¨\u00062"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;", "<init>", "()V", "", "shutdown", "", "timeMillis", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/DisposableHandle;", "scheduleInvokeOnTimeout", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/DisposableHandle;", "processNextEvent", "()J", "Lkotlin/coroutines/CoroutineContext;", "context", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "task", "enqueue", "(Ljava/lang/Runnable;)V", "now", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "delayedTask", "schedule", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)V", "resetAll", "", "isEmpty", "()Z", "getNextTime", "nextTime", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "_delayed", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleted", "", "_queue", "kotlinx/coroutines/b", "kotlinx/coroutines/c", "DelayedTask", "DelayedTaskQueue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n60#2:544\n61#2,7:550\n28#3,4:545\n20#4:549\n56#5:557\n1#6:558\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n269#1:544\n269#1:550,7\n269#1:545,4\n269#1:549\n280#1:557\n*E\n"})
public abstract class EventLoopImplBase extends EventLoopImplPlatform implements Delay {
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000F\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u0018\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0010\u001A\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\b2\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001B\u001A\u00020\u001A¢\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001E\u001A\u00020\u001DH\u0016¢\u0006\u0004\b\u001E\u0010\u001FR\u0016\u0010\t\u001A\u00020\b8\u0006@\u0006X\u0087\u000E¢\u0006\u0006\n\u0004\b\t\u0010 R\u0018\u0010!\u001A\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010)\u001A\u00020\r8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R0\u00100\u001A\b\u0012\u0002\b\u0003\u0018\u00010*2\f\u0010+\u001A\b\u0012\u0002\b\u0003\u0018\u00010*8V@VX\u0096\u000E¢\u0006\f\u001A\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "<init>", "(J)V", "other", "", "compareTo", "(Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;)I", "now", "", "timeToExecute", "(J)Z", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "delayed", "Lkotlinx/coroutines/EventLoopImplBase;", "eventLoop", "scheduleTask", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;Lkotlinx/coroutines/EventLoopImplBase;)I", "", "dispose", "()V", "", "toString", "()Ljava/lang/String;", "J", "_heap", "Ljava/lang/Object;", "a", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "value", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "heap", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,543:1\n28#2,4:544\n28#2,4:550\n28#2,4:562\n20#3:548\n20#3:554\n20#3:566\n72#4:549\n73#4,7:555\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n437#1:544,4\n439#1:550,4\n479#1:562,4\n437#1:548\n439#1:554\n479#1:566\n439#1:549\n439#1:555,7\n*E\n"})
    public static abstract class DelayedTask implements Comparable, Runnable, DisposableHandle, ThreadSafeHeapNode {
        @Nullable
        private volatile Object _heap;
        public int a;
        @JvmField
        public long nanoTime;

        public DelayedTask(long v) {
            this.nanoTime = v;
            this.a = -1;
        }

        @Override
        public int compareTo(Object object0) {
            return this.compareTo(((DelayedTask)object0));
        }

        public int compareTo(@NotNull DelayedTask eventLoopImplBase$DelayedTask0) {
            int v = Long.compare(this.nanoTime - eventLoopImplBase$DelayedTask0.nanoTime, 0L);
            if(v > 0) {
                return 1;
            }
            return v >= 0 ? 0 : -1;
        }

        @Override  // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            __monitor_enter(this);
            try {
                Object object0 = this._heap;
                if(object0 != EventLoop_commonKt.access$getDISPOSED_TASK$p()) {
                    DelayedTaskQueue eventLoopImplBase$DelayedTaskQueue0 = object0 instanceof DelayedTaskQueue ? ((DelayedTaskQueue)object0) : null;
                    if(eventLoopImplBase$DelayedTaskQueue0 != null) {
                        eventLoopImplBase$DelayedTaskQueue0.remove(this);
                    }
                    this._heap = EventLoop_commonKt.access$getDISPOSED_TASK$p();
                    goto label_11;
                }
                goto label_13;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(this);
            throw throwable0;
        label_11:
            __monitor_exit(this);
            return;
        label_13:
            __monitor_exit(this);
        }

        // 去混淆评级： 低(20)
        @Override  // kotlinx.coroutines.internal.ThreadSafeHeapNode
        @Nullable
        public ThreadSafeHeap getHeap() {
            return this._heap instanceof ThreadSafeHeap ? ((ThreadSafeHeap)this._heap) : null;
        }

        @Override  // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public int getIndex() {
            return this.a;
        }

        public final int scheduleTask(long v, @NotNull DelayedTaskQueue eventLoopImplBase$DelayedTaskQueue0, @NotNull EventLoopImplBase eventLoopImplBase0) {
            synchronized(this) {
                if(this._heap == EventLoop_commonKt.access$getDISPOSED_TASK$p()) {
                    return 2;
                }
                __monitor_enter(eventLoopImplBase$DelayedTaskQueue0);
                try {
                    DelayedTask eventLoopImplBase$DelayedTask0 = (DelayedTask)eventLoopImplBase$DelayedTaskQueue0.firstImpl();
                    if(!EventLoopImplBase.access$isCompleted(eventLoopImplBase0)) {
                        if(eventLoopImplBase$DelayedTask0 == null) {
                            eventLoopImplBase$DelayedTaskQueue0.timeNow = v;
                        }
                        else {
                            long v2 = eventLoopImplBase$DelayedTask0.nanoTime;
                            if(v2 - v < 0L) {
                                v = v2;
                            }
                            if(v - eventLoopImplBase$DelayedTaskQueue0.timeNow > 0L) {
                                eventLoopImplBase$DelayedTaskQueue0.timeNow = v;
                            }
                        }
                        long v3 = eventLoopImplBase$DelayedTaskQueue0.timeNow;
                        if(this.nanoTime - v3 < 0L) {
                            this.nanoTime = v3;
                        }
                        eventLoopImplBase$DelayedTaskQueue0.addImpl(this);
                        goto label_27;
                    }
                    goto label_30;
                }
                catch(Throwable throwable0) {
                }
                __monitor_exit(eventLoopImplBase$DelayedTaskQueue0);
                throw throwable0;
            label_27:
                __monitor_exit(eventLoopImplBase$DelayedTaskQueue0);
                return 0;
            label_30:
                __monitor_exit(eventLoopImplBase$DelayedTaskQueue0);
                return 1;
            }
        }

        @Override  // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setHeap(@Nullable ThreadSafeHeap threadSafeHeap0) {
            if(this._heap == EventLoop_commonKt.access$getDISPOSED_TASK$p()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = threadSafeHeap0;
        }

        @Override  // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setIndex(int v) {
            this.a = v;
        }

        public final boolean timeToExecute(long v) {
            return v - this.nanoTime >= 0L;
        }

        @Override
        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001A\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0003\u001A\u00020\u00048\u0006@\u0006X\u0087\u000E¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "timeNow", "", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class DelayedTaskQueue extends ThreadSafeHeap {
        @JvmField
        public long timeNow;

        public DelayedTaskQueue(long v) {
            this.timeNow = v;
        }
    }

    @Volatile
    @Nullable
    private volatile Object _delayed;
    @Volatile
    private volatile int _isCompleted;
    @Volatile
    @Nullable
    private volatile Object _queue;
    public static final AtomicReferenceFieldUpdater e;
    public static final AtomicReferenceFieldUpdater f;
    public static final AtomicIntegerFieldUpdater g;

    static {
        EventLoopImplBase.e = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue");
        EventLoopImplBase.f = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed");
        EventLoopImplBase.g = AtomicIntegerFieldUpdater.newUpdater(EventLoopImplBase.class, "_isCompleted");
    }

    public EventLoopImplBase() {
        this._isCompleted = 0;
    }

    public final boolean a(Runnable runnable0) {
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = EventLoopImplBase.e;
            Object object0 = atomicReferenceFieldUpdater0.get(this);
            if(EventLoopImplBase.g.get(this) != 0) {
                return false;
            }
            if(object0 == null) {
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, null, runnable0)) {
                        return true;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(this) == null);
            }
            else {
                if(object0 instanceof LockFreeTaskQueueCore) {
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                    int v = ((LockFreeTaskQueueCore)object0).addLast(runnable0);
                    switch(v) {
                        case 0: {
                            return true;
                        label_15:
                            if(v != 2) {
                                continue;
                            }
                            return false;
                        }
                        case 1: {
                            LockFreeTaskQueueCore lockFreeTaskQueueCore0 = ((LockFreeTaskQueueCore)object0).next();
                            while(!atomicReferenceFieldUpdater0.compareAndSet(this, object0, lockFreeTaskQueueCore0) && atomicReferenceFieldUpdater0.get(this) == object0) {
                            }
                            continue;
                        }
                        default: {
                            goto label_15;
                        }
                    }
                }
                if(object0 == EventLoop_commonKt.access$getCLOSED_EMPTY$p()) {
                    return false;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore1 = new LockFreeTaskQueueCore(8, true);
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                lockFreeTaskQueueCore1.addLast(((Runnable)object0));
                lockFreeTaskQueueCore1.addLast(runnable0);
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, object0, lockFreeTaskQueueCore1)) {
                        return true;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(this) == object0);
            }
        }
    }

    public static final boolean access$isCompleted(EventLoopImplBase eventLoopImplBase0) {
        eventLoopImplBase0.getClass();
        return EventLoopImplBase.g.get(eventLoopImplBase0) != 0;
    }

    @Override  // kotlinx.coroutines.Delay
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object delay(long v, @NotNull Continuation continuation0) {
        return DefaultImpls.delay(this, v, continuation0);
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(@NotNull CoroutineContext coroutineContext0, @NotNull Runnable runnable0) {
        this.enqueue(runnable0);
    }

    public void enqueue(@NotNull Runnable runnable0) {
        if(this.a(runnable0)) {
            this.unpark();
            return;
        }
        DefaultExecutor.INSTANCE.enqueue(runnable0);
    }

    @Override  // kotlinx.coroutines.EventLoop
    public long getNextTime() {
        if(super.getNextTime() == 0L) {
            return 0L;
        }
        Object object0 = EventLoopImplBase.e.get(this);
        if(object0 != null) {
            if(!(object0 instanceof LockFreeTaskQueueCore)) {
                return object0 == EventLoop_commonKt.access$getCLOSED_EMPTY$p() ? 0x7FFFFFFFFFFFFFFFL : 0L;
            }
            else if(!((LockFreeTaskQueueCore)object0).isEmpty()) {
                return 0L;
            }
        }
        DelayedTaskQueue eventLoopImplBase$DelayedTaskQueue0 = (DelayedTaskQueue)EventLoopImplBase.f.get(this);
        if(eventLoopImplBase$DelayedTaskQueue0 != null) {
            DelayedTask eventLoopImplBase$DelayedTask0 = (DelayedTask)eventLoopImplBase$DelayedTaskQueue0.peek();
            if(eventLoopImplBase$DelayedTask0 != null) {
                AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
                return abstractTimeSource0 == null ? c.coerceAtLeast(eventLoopImplBase$DelayedTask0.nanoTime - System.nanoTime(), 0L) : c.coerceAtLeast(eventLoopImplBase$DelayedTask0.nanoTime - abstractTimeSource0.nanoTime(), 0L);
            }
        }
        return 0x7FFFFFFFFFFFFFFFL;
    }

    @Override  // kotlinx.coroutines.Delay
    @NotNull
    public DisposableHandle invokeOnTimeout(long v, @NotNull Runnable runnable0, @NotNull CoroutineContext coroutineContext0) {
        return DefaultImpls.invokeOnTimeout(this, v, runnable0, coroutineContext0);
    }

    @Override  // kotlinx.coroutines.EventLoop
    public boolean isEmpty() {
        if(!this.isUnconfinedQueueEmpty()) {
            return false;
        }
        DelayedTaskQueue eventLoopImplBase$DelayedTaskQueue0 = (DelayedTaskQueue)EventLoopImplBase.f.get(this);
        if(eventLoopImplBase$DelayedTaskQueue0 != null && !eventLoopImplBase$DelayedTaskQueue0.isEmpty()) {
            return false;
        }
        Object object0 = EventLoopImplBase.e.get(this);
        if(object0 == null) {
            return true;
        }
        return object0 instanceof LockFreeTaskQueueCore ? ((LockFreeTaskQueueCore)object0).isEmpty() : object0 == EventLoop_commonKt.access$getCLOSED_EMPTY$p();
    }

    @Override  // kotlinx.coroutines.EventLoop
    public long processNextEvent() {
        ThreadSafeHeapNode threadSafeHeapNode1;
        if(this.processUnconfinedEvent()) {
            return 0L;
        }
        DelayedTaskQueue eventLoopImplBase$DelayedTaskQueue0 = (DelayedTaskQueue)EventLoopImplBase.f.get(this);
        Runnable runnable0 = null;
        if(eventLoopImplBase$DelayedTaskQueue0 != null && !eventLoopImplBase$DelayedTaskQueue0.isEmpty()) {
            AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
            long v = abstractTimeSource0 == null ? System.nanoTime() : abstractTimeSource0.nanoTime();
            while(true) {
                __monitor_enter(eventLoopImplBase$DelayedTaskQueue0);
                try {
                    ThreadSafeHeapNode threadSafeHeapNode0 = eventLoopImplBase$DelayedTaskQueue0.firstImpl();
                    if(threadSafeHeapNode0 == null) {
                        goto label_20;
                    }
                    else {
                        threadSafeHeapNode1 = (((DelayedTask)threadSafeHeapNode0).timeToExecute(v) ? this.a(((DelayedTask)threadSafeHeapNode0)) : false) ? eventLoopImplBase$DelayedTaskQueue0.removeAtImpl(0) : null;
                        goto label_18;
                    }
                    goto label_22;
                }
                catch(Throwable throwable0) {
                }
                __monitor_exit(eventLoopImplBase$DelayedTaskQueue0);
                throw throwable0;
            label_18:
                __monitor_exit(eventLoopImplBase$DelayedTaskQueue0);
                goto label_22;
            label_20:
                __monitor_exit(eventLoopImplBase$DelayedTaskQueue0);
                threadSafeHeapNode1 = null;
            label_22:
                if(((DelayedTask)threadSafeHeapNode1) == null) {
                    break;
                }
            }
        }
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = EventLoopImplBase.e;
            Object object0 = atomicReferenceFieldUpdater0.get(this);
            if(object0 == null) {
                break;
            }
            if(!(object0 instanceof LockFreeTaskQueueCore)) {
                if(object0 != EventLoop_commonKt.access$getCLOSED_EMPTY$p()) {
                label_37:
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, object0, null)) {
                        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                        runnable0 = (Runnable)object0;
                    }
                    else {
                        if(atomicReferenceFieldUpdater0.get(this) != object0) {
                            continue;
                        }
                        if(false) {
                            break;
                        }
                        goto label_37;
                    }
                }
                break;
            }
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
            Object object1 = ((LockFreeTaskQueueCore)object0).removeFirstOrNull();
            if(object1 != LockFreeTaskQueueCore.REMOVE_FROZEN) {
                runnable0 = (Runnable)object1;
                break;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCore0 = ((LockFreeTaskQueueCore)object0).next();
            while(!atomicReferenceFieldUpdater0.compareAndSet(this, object0, lockFreeTaskQueueCore0) && atomicReferenceFieldUpdater0.get(this) == object0) {
            }
        }
        if(runnable0 != null) {
            runnable0.run();
            return 0L;
        }
        return this.getNextTime();
    }

    public final void resetAll() {
        EventLoopImplBase.e.set(this, null);
        EventLoopImplBase.f.set(this, null);
    }

    public final void schedule(long v, @NotNull DelayedTask eventLoopImplBase$DelayedTask0) {
        int v1;
        boolean z = EventLoopImplBase.g.get(this) != 0;
        DelayedTask eventLoopImplBase$DelayedTask1 = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = EventLoopImplBase.f;
        if(z) {
            v1 = 1;
        }
        else {
            DelayedTaskQueue eventLoopImplBase$DelayedTaskQueue0 = (DelayedTaskQueue)atomicReferenceFieldUpdater0.get(this);
            if(eventLoopImplBase$DelayedTaskQueue0 == null) {
                DelayedTaskQueue eventLoopImplBase$DelayedTaskQueue1 = new DelayedTaskQueue(v);
                while(!atomicReferenceFieldUpdater0.compareAndSet(this, null, eventLoopImplBase$DelayedTaskQueue1) && atomicReferenceFieldUpdater0.get(this) == null) {
                }
                Object object0 = atomicReferenceFieldUpdater0.get(this);
                Intrinsics.checkNotNull(object0);
                eventLoopImplBase$DelayedTaskQueue0 = (DelayedTaskQueue)object0;
            }
            v1 = eventLoopImplBase$DelayedTask0.scheduleTask(v, eventLoopImplBase$DelayedTaskQueue0, this);
        }
        switch(v1) {
            case 0: {
                DelayedTaskQueue eventLoopImplBase$DelayedTaskQueue2 = (DelayedTaskQueue)atomicReferenceFieldUpdater0.get(this);
                if(eventLoopImplBase$DelayedTaskQueue2 != null) {
                    eventLoopImplBase$DelayedTask1 = (DelayedTask)eventLoopImplBase$DelayedTaskQueue2.peek();
                }
                if(eventLoopImplBase$DelayedTask1 == eventLoopImplBase$DelayedTask0) {
                    this.unpark();
                }
                break;
            }
            case 1: {
                this.reschedule(v, eventLoopImplBase$DelayedTask0);
                return;
            label_19:
                if(v1 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                break;
            }
            default: {
                goto label_19;
            }
        }
    }

    @NotNull
    public final DisposableHandle scheduleInvokeOnTimeout(long v, @NotNull Runnable runnable0) {
        long v1 = EventLoop_commonKt.delayToNanos(v);
        if(v1 < 0x3FFFFFFFFFFFFFFFL) {
            AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
            long v2 = abstractTimeSource0 == null ? System.nanoTime() : abstractTimeSource0.nanoTime();
            DisposableHandle disposableHandle0 = new kotlinx.coroutines.c(v1 + v2, runnable0);
            this.schedule(v2, ((DelayedTask)disposableHandle0));
            return disposableHandle0;
        }
        return NonDisposableHandle.INSTANCE;
    }

    @Override  // kotlinx.coroutines.Delay
    public void scheduleResumeAfterDelay(long v, @NotNull CancellableContinuation cancellableContinuation0) {
        long v1 = EventLoop_commonKt.delayToNanos(v);
        if(v1 < 0x3FFFFFFFFFFFFFFFL) {
            AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
            long v2 = abstractTimeSource0 == null ? System.nanoTime() : abstractTimeSource0.nanoTime();
            b b0 = new b(this, v1 + v2, cancellableContinuation0);
            this.schedule(v2, b0);
            CancellableContinuationKt.disposeOnCancellation(cancellableContinuation0, b0);
        }
    }

    @Override  // kotlinx.coroutines.EventLoop
    public void shutdown() {
        ThreadLocalEventLoop.INSTANCE.resetEventLoop$kotlinx_coroutines_core();
        EventLoopImplBase.g.set(this, 1);
    alab1:
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = EventLoopImplBase.e;
            Object object0 = atomicReferenceFieldUpdater0.get(this);
            if(object0 == null) {
                Symbol symbol0 = EventLoop_commonKt.access$getCLOSED_EMPTY$p();
                while(true) {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, null, symbol0)) {
                        break alab1;
                    }
                    if(atomicReferenceFieldUpdater0.get(this) == null) {
                        continue;
                    }
                    continue alab1;
                }
            }
            if(object0 instanceof LockFreeTaskQueueCore) {
                ((LockFreeTaskQueueCore)object0).close();
            }
            else if(object0 != EventLoop_commonKt.access$getCLOSED_EMPTY$p()) {
                LockFreeTaskQueueCore lockFreeTaskQueueCore0 = new LockFreeTaskQueueCore(8, true);
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                lockFreeTaskQueueCore0.addLast(((Runnable)object0));
            label_16:
                if(!atomicReferenceFieldUpdater0.compareAndSet(this, object0, lockFreeTaskQueueCore0)) {
                    if(atomicReferenceFieldUpdater0.get(this) != object0) {
                        continue;
                    }
                    if(false) {
                        break;
                    }
                    goto label_16;
                }
            }
            break;
        }
        while(this.processNextEvent() <= 0L) {
        }
        AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
        long v = abstractTimeSource0 == null ? System.nanoTime() : abstractTimeSource0.nanoTime();
        DelayedTaskQueue eventLoopImplBase$DelayedTaskQueue0;
        while((eventLoopImplBase$DelayedTaskQueue0 = (DelayedTaskQueue)EventLoopImplBase.f.get(this)) != null) {
            DelayedTask eventLoopImplBase$DelayedTask0 = (DelayedTask)eventLoopImplBase$DelayedTaskQueue0.removeFirstOrNull();
            if(eventLoopImplBase$DelayedTask0 == null) {
                break;
            }
            this.reschedule(v, eventLoopImplBase$DelayedTask0);
        }
    }
}


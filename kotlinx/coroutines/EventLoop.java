package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LimitedDispatcherKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000B\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\u000E\u001A\u00020\r2\n\u0010\f\u001A\u0006\u0012\u0002\b\u00030\u000B¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0011\u001A\u00020\r2\b\b\u0002\u0010\u0010\u001A\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001A\u00020\r2\b\b\u0002\u0010\u0010\u001A\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001A\u00020\u00012\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0003R\u0014\u0010\u0019\u001A\u00020\u00078TX\u0094\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\tR\u0014\u0010\u001B\u001A\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0006R\u0011\u0010\u001C\u001A\u00020\u00078F¢\u0006\u0006\u001A\u0004\b\u001C\u0010\tR\u0011\u0010\u001D\u001A\u00020\u00078F¢\u0006\u0006\u001A\u0004\b\u001D\u0010\tR\u0011\u0010\u001E\u001A\u00020\u00078F¢\u0006\u0006\u001A\u0004\b\u001E\u0010\t¨\u0006\u001F"}, d2 = {"Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "", "processNextEvent", "()J", "", "processUnconfinedEvent", "()Z", "shouldBeProcessedFromContext", "Lkotlinx/coroutines/DispatchedTask;", "task", "", "dispatchUnconfined", "(Lkotlinx/coroutines/DispatchedTask;)V", "unconfined", "incrementUseCount", "(Z)V", "decrementUseCount", "", "parallelism", "limitedParallelism", "(I)Lkotlinx/coroutines/CoroutineDispatcher;", "shutdown", "isEmpty", "getNextTime", "nextTime", "isActive", "isUnconfinedLoopActive", "isUnconfinedQueueEmpty", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
public abstract class EventLoop extends CoroutineDispatcher {
    public long b;
    public boolean c;
    public ArrayDeque d;

    public final void decrementUseCount(boolean z) {
        long v = this.b - (z ? 0x100000000L : 1L);
        this.b = v;
        if(v > 0L) {
            return;
        }
        if(this.c) {
            this.shutdown();
        }
    }

    public static void decrementUseCount$default(EventLoop eventLoop0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if((v & 1) != 0) {
            z = false;
        }
        eventLoop0.decrementUseCount(z);
    }

    public final void dispatchUnconfined(@NotNull DispatchedTask dispatchedTask0) {
        ArrayDeque arrayDeque0 = this.d;
        if(arrayDeque0 == null) {
            arrayDeque0 = new ArrayDeque();
            this.d = arrayDeque0;
        }
        arrayDeque0.addLast(dispatchedTask0);
    }

    public long getNextTime() {
        ArrayDeque arrayDeque0 = this.d;
        if(arrayDeque0 == null) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        return arrayDeque0.isEmpty() ? 0x7FFFFFFFFFFFFFFFL : 0L;
    }

    public final void incrementUseCount(boolean z) {
        this.b = (z ? 0x100000000L : 1L) + this.b;
        if(!z) {
            this.c = true;
        }
    }

    public static void incrementUseCount$default(EventLoop eventLoop0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if((v & 1) != 0) {
            z = false;
        }
        eventLoop0.incrementUseCount(z);
    }

    public final boolean isActive() {
        return this.b > 0L;
    }

    public boolean isEmpty() {
        return this.isUnconfinedQueueEmpty();
    }

    public final boolean isUnconfinedLoopActive() {
        return this.b >= 0x100000000L;
    }

    public final boolean isUnconfinedQueueEmpty() {
        return this.d == null ? true : this.d.isEmpty();
    }

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public final CoroutineDispatcher limitedParallelism(int v) {
        LimitedDispatcherKt.checkParallelism(v);
        return this;
    }

    public long processNextEvent() {
        return this.processUnconfinedEvent() ? 0L : 0x7FFFFFFFFFFFFFFFL;
    }

    public final boolean processUnconfinedEvent() {
        ArrayDeque arrayDeque0 = this.d;
        if(arrayDeque0 == null) {
            return false;
        }
        DispatchedTask dispatchedTask0 = (DispatchedTask)arrayDeque0.removeFirstOrNull();
        if(dispatchedTask0 == null) {
            return false;
        }
        dispatchedTask0.run();
        return true;
    }

    public boolean shouldBeProcessedFromContext() [...] // Inlined contents

    public void shutdown() {
    }
}


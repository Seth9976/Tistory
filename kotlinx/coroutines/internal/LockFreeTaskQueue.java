package kotlinx.coroutines.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001A\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00028\u0000¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001A\u00020\u0014J\u0006\u0010\u0015\u001A\u00020\u0004J&\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\u00180\u0017\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u0019\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00180\u001AJ\r\u0010\u001B\u001A\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001CR\u001F\u0010\u0006\u001A\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\t0\u0007X\u0082\u0004R\u0011\u0010\n\u001A\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\f\u001A\u00020\r8F¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u001D"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "E", "", "singleConsumer", "", "(Z)V", "_cur", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Lkotlinx/coroutines/internal/Core;", "isEmpty", "()Z", "size", "", "getSize", "()I", "addLast", "element", "(Ljava/lang/Object;)Z", "close", "", "isClosed", "map", "", "R", "transform", "Lkotlin/Function1;", "removeFirstOrNull", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class LockFreeTaskQueue {
    @Volatile
    @Nullable
    private volatile Object _cur;
    public static final AtomicReferenceFieldUpdater a;

    static {
        LockFreeTaskQueue.a = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur");
    }

    public LockFreeTaskQueue(boolean z) {
        this._cur = new LockFreeTaskQueueCore(8, z);
    }

    public final boolean addLast(@NotNull Object object0) {
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = LockFreeTaskQueue.a;
            LockFreeTaskQueueCore lockFreeTaskQueueCore0 = (LockFreeTaskQueueCore)atomicReferenceFieldUpdater0.get(this);
            int v = lockFreeTaskQueueCore0.addLast(object0);
            switch(v) {
                case 0: {
                    return true;
                label_6:
                    if(v != 2) {
                        continue;
                    }
                    return false;
                }
                case 1: {
                    LockFreeTaskQueueCore lockFreeTaskQueueCore1 = lockFreeTaskQueueCore0.next();
                    break;
                }
                default: {
                    goto label_6;
                }
            }
        label_9:
            if(!atomicReferenceFieldUpdater0.compareAndSet(this, lockFreeTaskQueueCore0, lockFreeTaskQueueCore1) && atomicReferenceFieldUpdater0.get(this) == lockFreeTaskQueueCore0) {
                break;
            }
        }
        goto label_9;
    }

    public final void close() {
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = LockFreeTaskQueue.a;
            LockFreeTaskQueueCore lockFreeTaskQueueCore0 = (LockFreeTaskQueueCore)atomicReferenceFieldUpdater0.get(this);
            if(lockFreeTaskQueueCore0.close()) {
                break;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCore1 = lockFreeTaskQueueCore0.next();
            while(!atomicReferenceFieldUpdater0.compareAndSet(this, lockFreeTaskQueueCore0, lockFreeTaskQueueCore1) && atomicReferenceFieldUpdater0.get(this) == lockFreeTaskQueueCore0) {
            }
        }
    }

    public final int getSize() {
        return ((LockFreeTaskQueueCore)LockFreeTaskQueue.a.get(this)).getSize();
    }

    public final boolean isClosed() {
        return ((LockFreeTaskQueueCore)LockFreeTaskQueue.a.get(this)).isClosed();
    }

    public final boolean isEmpty() {
        return ((LockFreeTaskQueueCore)LockFreeTaskQueue.a.get(this)).isEmpty();
    }

    @NotNull
    public final List map(@NotNull Function1 function10) {
        return ((LockFreeTaskQueueCore)LockFreeTaskQueue.a.get(this)).map(function10);
    }

    @Nullable
    public final Object removeFirstOrNull() {
        Object object0;
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = LockFreeTaskQueue.a;
            LockFreeTaskQueueCore lockFreeTaskQueueCore0 = (LockFreeTaskQueueCore)atomicReferenceFieldUpdater0.get(this);
            object0 = lockFreeTaskQueueCore0.removeFirstOrNull();
            if(object0 != LockFreeTaskQueueCore.REMOVE_FROZEN) {
                break;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCore1 = lockFreeTaskQueueCore0.next();
            while(!atomicReferenceFieldUpdater0.compareAndSet(this, lockFreeTaskQueueCore0, lockFreeTaskQueueCore1) && atomicReferenceFieldUpdater0.get(this) == lockFreeTaskQueueCore0) {
            }
        }
        return object0;
    }
}


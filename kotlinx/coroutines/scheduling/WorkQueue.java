package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ)\u0010\u0012\u001A\u00020\u00112\n\u0010\u000E\u001A\u00060\fj\u0002`\r2\u000E\u0010\u0010\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000F¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0006J\u000F\u0010\u0015\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0006J\u0015\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0017\u001A\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001AR\u0014\u0010\u001D\u001A\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001CR\u000B\u0010\u001F\u001A\u00020\u001E8\u0002X\u0082\u0004R\u000B\u0010 \u001A\u00020\u001E8\u0002X\u0082\u0004R\u0013\u0010\"\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040!8\u0002X\u0082\u0004R\u000B\u0010#\u001A\u00020\u001E8\u0002X\u0082\u0004¨\u0006$"}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "<init>", "()V", "Lkotlinx/coroutines/scheduling/Task;", "poll", "()Lkotlinx/coroutines/scheduling/Task;", "task", "", "fair", "add", "(Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "Lkotlin/jvm/internal/Ref$ObjectRef;", "stolenTaskRef", "", "trySteal", "(ILkotlin/jvm/internal/Ref$ObjectRef;)J", "pollBlocking", "pollCpu", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalQueue", "", "offloadAllWorkTo", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)V", "getSize$kotlinx_coroutines_core", "()I", "size", "Lkotlinx/atomicfu/AtomicInt;", "blockingTasksInBuffer", "consumerIndex", "Lkotlinx/atomicfu/AtomicRef;", "lastScheduledTask", "producerIndex", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,255:1\n93#2:256\n93#2:257\n93#2:258\n93#2:261\n93#2:262\n1#3:259\n25#4:260\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n95#1:256\n162#1:257\n185#1:258\n205#1:261\n249#1:262\n205#1:260\n*E\n"})
public final class WorkQueue {
    public final AtomicReferenceArray a;
    public static final AtomicReferenceFieldUpdater b;
    @Volatile
    private volatile int blockingTasksInBuffer;
    public static final AtomicIntegerFieldUpdater c;
    @Volatile
    private volatile int consumerIndex;
    public static final AtomicIntegerFieldUpdater d;
    public static final AtomicIntegerFieldUpdater e;
    @Volatile
    @Nullable
    private volatile Object lastScheduledTask;
    @Volatile
    private volatile int producerIndex;

    static {
        WorkQueue.b = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask");
        WorkQueue.c = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex");
        WorkQueue.d = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex");
        WorkQueue.e = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer");
    }

    public WorkQueue() {
        this.a = new AtomicReferenceArray(0x80);
    }

    public final Task a(Task task0) {
        AtomicReferenceArray atomicReferenceArray0;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = WorkQueue.c;
        if(atomicIntegerFieldUpdater0.get(this) - WorkQueue.d.get(this) == 0x7F) {
            return task0;
        }
        if(task0.taskContext.getTaskMode() == 1) {
            WorkQueue.e.incrementAndGet(this);
        }
        int v = atomicIntegerFieldUpdater0.get(this);
        while(true) {
            atomicReferenceArray0 = this.a;
            if(atomicReferenceArray0.get(v & 0x7F) == null) {
                break;
            }
            Thread.yield();
        }
        atomicReferenceArray0.lazySet(v & 0x7F, task0);
        atomicIntegerFieldUpdater0.incrementAndGet(this);
        return null;
    }

    @Nullable
    public final Task add(@NotNull Task task0, boolean z) {
        if(z) {
            return this.a(task0);
        }
        Task task1 = (Task)WorkQueue.b.getAndSet(this, task0);
        return task1 == null ? null : this.a(task1);
    }

    public static Task add$default(WorkQueue workQueue0, Task task0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return workQueue0.add(task0, z);
    }

    public final Task b() {
        Task task0;
        int v;
        do {
            do {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = WorkQueue.d;
                v = atomicIntegerFieldUpdater0.get(this);
                if(v - WorkQueue.c.get(this) == 0) {
                    return null;
                }
            }
            while(!atomicIntegerFieldUpdater0.compareAndSet(this, v, v + 1));
            task0 = (Task)this.a.getAndSet(v & 0x7F, null);
        }
        while(task0 == null);
        if(task0.taskContext.getTaskMode() == 1) {
            WorkQueue.e.decrementAndGet(this);
        }
        return task0;
    }

    public final Task c(boolean z) {
        Task task1;
        while(true) {
            boolean z1 = true;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = WorkQueue.b;
            Task task0 = (Task)atomicReferenceFieldUpdater0.get(this);
            if(task0 == null) {
                break;
            }
            if(task0.taskContext.getTaskMode() != 1) {
                z1 = false;
            }
            if(z1 != z) {
                break;
            }
            do {
                if(atomicReferenceFieldUpdater0.compareAndSet(this, task0, null)) {
                    return task0;
                }
            }
            while(atomicReferenceFieldUpdater0.get(this) == task0);
        }
        int v = WorkQueue.d.get(this);
        int v1 = WorkQueue.c.get(this);
        do {
            if(v == v1 || z && WorkQueue.e.get(this) == 0) {
                return null;
            }
            --v1;
            task1 = this.d(v1, z);
        }
        while(task1 == null);
        return task1;
    }

    public final Task d(int v, boolean z) {
        boolean z1 = true;
        AtomicReferenceArray atomicReferenceArray0 = this.a;
        Task task0 = (Task)atomicReferenceArray0.get(v & 0x7F);
        if(task0 != null) {
            if(task0.taskContext.getTaskMode() != 1) {
                z1 = false;
            }
            if(z1 == z) {
                while(true) {
                    if(atomicReferenceArray0.compareAndSet(v & 0x7F, task0, null)) {
                        if(z) {
                            WorkQueue.e.decrementAndGet(this);
                        }
                        return task0;
                    }
                    if(atomicReferenceArray0.get(v & 0x7F) != task0) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    public final int getSize$kotlinx_coroutines_core() {
        return WorkQueue.b.get(this) == null ? WorkQueue.c.get(this) - WorkQueue.d.get(this) : WorkQueue.c.get(this) - WorkQueue.d.get(this) + 1;
    }

    public final void offloadAllWorkTo(@NotNull GlobalQueue globalQueue0) {
        Task task0 = (Task)WorkQueue.b.getAndSet(this, null);
        if(task0 != null) {
            globalQueue0.addLast(task0);
        }
        Task task1;
        while((task1 = this.b()) != null) {
            globalQueue0.addLast(task1);
        }
    }

    @Nullable
    public final Task poll() {
        Task task0 = (Task)WorkQueue.b.getAndSet(this, null);
        return task0 == null ? this.b() : task0;
    }

    @Nullable
    public final Task pollBlocking() {
        return this.c(true);
    }

    @Nullable
    public final Task pollCpu() {
        return this.c(false);
    }

    public final long trySteal(int v, @NotNull ObjectRef ref$ObjectRef0) {
        Task task0;
        if(v == 3) {
            task0 = this.b();
            goto label_11;
        }
        int v1 = WorkQueue.d.get(this);
        int v2 = WorkQueue.c.get(this);
        while(true) {
            if(v1 != v2 && (v != 1 || WorkQueue.e.get(this) != 0)) {
                Task task1 = this.d(v1, v == 1);
                if(task1 == null) {
                    goto label_27;
                }
                else {
                    task0 = task1;
                }
            }
            else {
                task0 = null;
            }
        label_11:
            if(task0 != null) {
                ref$ObjectRef0.element = task0;
                return -1L;
            }
            while(true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = WorkQueue.b;
                Task task2 = (Task)atomicReferenceFieldUpdater0.get(this);
                if(task2 == null || ((task2.taskContext.getTaskMode() == 1 ? 1 : 2) & v) == 0) {
                    break;
                }
                long v3 = TasksKt.schedulerTimeSource.nanoTime() - task2.submissionTime;
                long v4 = TasksKt.WORK_STEALING_TIME_RESOLUTION_NS;
                if(v3 < v4) {
                    return v4 - v3;
                }
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, task2, null)) {
                        ref$ObjectRef0.element = task2;
                        return -1L;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(this) == task2);
            }
            return -2L;
        label_27:
            ++v1;
        }
    }
}


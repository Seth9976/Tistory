package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import og.a;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001EB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\r\u0010\u000EJ5\u0010\r\u001A\u00020\f2\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u000B\u001A\u00020\n2\u000E\b\u0004\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\n0\u000FH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\r\u0010\u0011J?\u0010\u0014\u001A\u00020\f2\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\u0013\u001A\u00020\u00122\u000E\b\u0004\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\f0\u000FH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001A\u00020\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\'\u0010\u001C\u001A\u00020\u00122\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0019\u001A\u00020\u0012H\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\r\u0010\u001D\u001A\u00020\f\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\r\u0010\u001F\u001A\u00020\f\u00A2\u0006\u0004\b\u001F\u0010\u001EJ\u000F\u0010\"\u001A\u00020\u0012H\u0000\u00A2\u0006\u0004\b \u0010!J\u000F\u0010#\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b#\u0010$R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(R\u001A\u0010\u0005\u001A\u00020\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010$R\"\u0010\u001F\u001A\u00020\u00128\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b,\u0010-\u001A\u0004\b.\u0010!\"\u0004\b/\u00100R$\u00107\u001A\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b1\u00102\u001A\u0004\b3\u00104\"\u0004\b5\u00106R \u0010=\u001A\b\u0012\u0004\u0012\u00020\b088\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<R\"\u0010A\u001A\u00020\u00128\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b>\u0010-\u001A\u0004\b?\u0010!\"\u0004\b@\u00100R\u0017\u0010D\u001A\b\u0012\u0004\u0012\u00020\b0B8F\u00A2\u0006\u0006\u001A\u0004\bC\u0010<\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006F"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "", "name", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Ljava/lang/String;)V", "Lokhttp3/internal/concurrent/Task;", "task", "", "delayNanos", "", "schedule", "(Lokhttp3/internal/concurrent/Task;J)V", "Lkotlin/Function0;", "block", "(Ljava/lang/String;JLkotlin/jvm/functions/Function0;)V", "", "cancelable", "execute", "(Ljava/lang/String;JZLkotlin/jvm/functions/Function0;)V", "Ljava/util/concurrent/CountDownLatch;", "idleLatch", "()Ljava/util/concurrent/CountDownLatch;", "recurrence", "scheduleAndDecide$okhttp", "(Lokhttp3/internal/concurrent/Task;JZ)Z", "scheduleAndDecide", "cancelAll", "()V", "shutdown", "cancelAllAndDecide$okhttp", "()Z", "cancelAllAndDecide", "toString", "()Ljava/lang/String;", "a", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "b", "Ljava/lang/String;", "getName$okhttp", "c", "Z", "getShutdown$okhttp", "setShutdown$okhttp", "(Z)V", "d", "Lokhttp3/internal/concurrent/Task;", "getActiveTask$okhttp", "()Lokhttp3/internal/concurrent/Task;", "setActiveTask$okhttp", "(Lokhttp3/internal/concurrent/Task;)V", "activeTask", "", "e", "Ljava/util/List;", "getFutureTasks$okhttp", "()Ljava/util/List;", "futureTasks", "f", "getCancelActiveTask$okhttp", "setCancelActiveTask$okhttp", "cancelActiveTask", "", "getScheduledTasks", "scheduledTasks", "og/a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n1#2:219\n25#3,4:220\n25#3,4:224\n25#3,4:228\n25#3,4:232\n25#3,4:251\n350#4,7:236\n615#5,4:243\n615#5,4:247\n*S KotlinDebug\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n*L\n65#1:220,4\n68#1:224,4\n153#1:228,4\n159#1:232,4\n208#1:251,4\n165#1:236,7\n179#1:243,4\n189#1:247,4\n*E\n"})
public final class TaskQueue {
    public final TaskRunner a;
    public final String b;
    public boolean c;
    public Task d;
    public final ArrayList e;
    public boolean f;

    public TaskQueue(@NotNull TaskRunner taskRunner0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(taskRunner0, "taskRunner");
        Intrinsics.checkNotNullParameter(s, "name");
        super();
        this.a = taskRunner0;
        this.b = s;
        this.e = new ArrayList();
    }

    public final void cancelAll() {
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2180 MUST NOT hold lock on " + this);
        }
        synchronized(this.a) {
            if(this.cancelAllAndDecide$okhttp()) {
                this.a.kickCoordinator$okhttp(this);
            }
        }
    }

    public final boolean cancelAllAndDecide$okhttp() {
        Task task0 = this.d;
        if(task0 != null) {
            Intrinsics.checkNotNull(task0);
            if(task0.getCancelable()) {
                this.f = true;
            }
        }
        ArrayList arrayList0 = this.e;
        int v = arrayList0.size() - 1;
        boolean z = false;
        while(-1 < v) {
            if(((Task)arrayList0.get(v)).getCancelable()) {
                Task task1 = (Task)arrayList0.get(v);
                if(TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.access$log(task1, this, "canceled");
                }
                arrayList0.remove(v);
                z = true;
            }
            --v;
        }
        return z;
    }

    public final void execute(@NotNull String s, long v, boolean z, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function00, "block");
        this.schedule(new Task(z, function00) {
            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                this.e.invoke();
                return -1L;
            }
        }, v);
    }

    public static void execute$default(TaskQueue taskQueue0, String s, long v, boolean z, Function0 function00, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        if((v1 & 4) != 0) {
            z = true;
        }
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function00, "block");
        taskQueue0.schedule(new okhttp3.internal.concurrent.TaskQueue.execute.1(s, z, function00), v);
    }

    @Nullable
    public final Task getActiveTask$okhttp() {
        return this.d;
    }

    public final boolean getCancelActiveTask$okhttp() {
        return this.f;
    }

    @NotNull
    public final List getFutureTasks$okhttp() {
        return this.e;
    }

    @NotNull
    public final String getName$okhttp() {
        return this.b;
    }

    @NotNull
    public final List getScheduledTasks() {
        synchronized(this.a) {
            return CollectionsKt___CollectionsKt.toList(this.e);
        }
    }

    public final boolean getShutdown$okhttp() {
        return this.c;
    }

    @NotNull
    public final TaskRunner getTaskRunner$okhttp() {
        return this.a;
    }

    @NotNull
    public final CountDownLatch idleLatch() {
        synchronized(this.a) {
            if(this.d == null && this.e.isEmpty()) {
                return new CountDownLatch(0);
            }
            Task task0 = this.d;
            if(task0 instanceof a) {
                return ((a)task0).e;
            }
            for(Object object0: this.e) {
                Task task1 = (Task)object0;
                if(task1 instanceof a) {
                    return ((a)task1).e;
                }
                if(false) {
                    break;
                }
            }
            a a0 = new a();
            if(this.scheduleAndDecide$okhttp(a0, 0L, false)) {
                this.a.kickCoordinator$okhttp(this);
            }
            return a0.e;
        }
    }

    public final void schedule(@NotNull String s, long v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function00, "block");
        this.schedule(new Task(function00) {
            public final Function0 e;

            {
                this.e = function00;
                super(s, false, 2, null);
            }

            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                return ((Number)this.e.invoke()).longValue();
            }
        }, v);
    }

    public final void schedule(@NotNull Task task0, long v) {
        Intrinsics.checkNotNullParameter(task0, "task");
        synchronized(this.a) {
            if(this.c) {
                if(task0.getCancelable()) {
                    if(TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                        TaskLoggerKt.access$log(task0, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                if(TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.access$log(task0, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if(this.scheduleAndDecide$okhttp(task0, v, false)) {
                this.a.kickCoordinator$okhttp(this);
            }
        }
    }

    public static void schedule$default(TaskQueue taskQueue0, String s, long v, Function0 function00, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function00, "block");
        taskQueue0.schedule(new okhttp3.internal.concurrent.TaskQueue.schedule.2(s, function00), v);
    }

    public static void schedule$default(TaskQueue taskQueue0, Task task0, long v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        taskQueue0.schedule(task0, v);
    }

    public final boolean scheduleAndDecide$okhttp(@NotNull Task task0, long v, boolean z) {
        Intrinsics.checkNotNullParameter(task0, "task");
        task0.initQueue$okhttp(this);
        long v1 = this.a.getBackend().nanoTime();
        long v2 = v1 + v;
        ArrayList arrayList0 = this.e;
        int v3 = arrayList0.indexOf(task0);
        if(v3 != -1) {
            if(task0.getNextExecuteNanoTime$okhttp() <= v2) {
                if(TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.access$log(task0, this, "already scheduled");
                }
                return false;
            }
            arrayList0.remove(v3);
        }
        task0.setNextExecuteNanoTime$okhttp(v2);
        if(TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            TaskLoggerKt.access$log(task0, this, (z ? "run again after " + TaskLoggerKt.formatDuration(v2 - v1) : "scheduled after " + TaskLoggerKt.formatDuration(v2 - v1)));
        }
        int v4 = 0;
        Iterator iterator0 = arrayList0.iterator();
        while(true) {
            if(!iterator0.hasNext()) {
                v4 = -1;
                break;
            }
            Object object0 = iterator0.next();
            if(((Task)object0).getNextExecuteNanoTime$okhttp() - v1 > v) {
                break;
            }
            ++v4;
        }
        if(v4 == -1) {
            v4 = arrayList0.size();
        }
        arrayList0.add(v4, task0);
        return v4 == 0;
    }

    public final void setActiveTask$okhttp(@Nullable Task task0) {
        this.d = task0;
    }

    public final void setCancelActiveTask$okhttp(boolean z) {
        this.f = z;
    }

    public final void setShutdown$okhttp(boolean z) {
        this.c = z;
    }

    public final void shutdown() {
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2159 MUST NOT hold lock on " + this);
        }
        synchronized(this.a) {
            this.c = true;
            if(this.cancelAllAndDecide$okhttp()) {
                this.a.kickCoordinator$okhttp(this);
            }
        }
    }

    @Override
    @NotNull
    public String toString() {
        return this.b;
    }
}


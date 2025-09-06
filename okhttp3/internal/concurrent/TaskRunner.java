package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\f\u0018\u0000 \u001A2\u00020\u0001:\u0003\u001B\u001A\u001CB\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\r\u001A\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u000F\u001A\u00020\u0006¢\u0006\u0004\b\u000F\u0010\u0010J\u0013\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001A\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001D"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "backend", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner$Backend;)V", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "", "kickCoordinator$okhttp", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "kickCoordinator", "Lokhttp3/internal/concurrent/Task;", "awaitTaskToRun", "()Lokhttp3/internal/concurrent/Task;", "newQueue", "()Lokhttp3/internal/concurrent/TaskQueue;", "", "activeQueues", "()Ljava/util/List;", "cancelAll", "()V", "a", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "getBackend", "()Lokhttp3/internal/concurrent/TaskRunner$Backend;", "Companion", "Backend", "RealBackend", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n+ 2 Util.kt\nokhttp3/internal/Util\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n608#2,4:315\n608#2,4:319\n615#2,4:323\n608#2,4:327\n608#2,4:331\n1#3:335\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n*L\n79#1:315,4\n97#1:319,4\n108#1:323,4\n126#1:327,4\n152#1:331,4\n*E\n"})
public final class TaskRunner {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0010\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0018\u0010\u0007\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\tH&J\u0010\u0010\n\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\fH&J\b\u0010\r\u001A\u00020\tH&¨\u0006\u000E"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "beforeTask", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "coordinatorNotify", "coordinatorWait", "nanos", "", "execute", "runnable", "Ljava/lang/Runnable;", "nanoTime", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Backend {
        void beforeTask(@NotNull TaskRunner arg1);

        void coordinatorNotify(@NotNull TaskRunner arg1);

        void coordinatorWait(@NotNull TaskRunner arg1, long arg2);

        void execute(@NotNull Runnable arg1);

        long nanoTime();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001A\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "Lokhttp3/internal/concurrent/TaskRunner;", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Logger getLogger() {
            return TaskRunner.h;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000E\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u000E\u0010\nJ\u001F\u0010\u0010\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001A\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "", "beforeTask", "(Lokhttp3/internal/concurrent/TaskRunner;)V", "", "nanoTime", "()J", "coordinatorNotify", "nanos", "coordinatorWait", "(Lokhttp3/internal/concurrent/TaskRunner;J)V", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)V", "shutdown", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,314:1\n560#2:315\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n*L\n281#1:315\n*E\n"})
    public static final class RealBackend implements Backend {
        public final ThreadPoolExecutor a;

        public RealBackend(@NotNull ThreadFactory threadFactory0) {
            Intrinsics.checkNotNullParameter(threadFactory0, "threadFactory");
            super();
            this.a = new ThreadPoolExecutor(0, 0x7FFFFFFF, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory0);
        }

        @Override  // okhttp3.internal.concurrent.TaskRunner$Backend
        public void beforeTask(@NotNull TaskRunner taskRunner0) {
            Intrinsics.checkNotNullParameter(taskRunner0, "taskRunner");
        }

        @Override  // okhttp3.internal.concurrent.TaskRunner$Backend
        public void coordinatorNotify(@NotNull TaskRunner taskRunner0) {
            Intrinsics.checkNotNullParameter(taskRunner0, "taskRunner");
            taskRunner0.notify();
        }

        @Override  // okhttp3.internal.concurrent.TaskRunner$Backend
        public void coordinatorWait(@NotNull TaskRunner taskRunner0, long v) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner0, "taskRunner");
            if(v / 1000000L > 0L || v > 0L) {
                taskRunner0.wait(v / 1000000L, ((int)(v - 1000000L * (v / 1000000L))));
            }
        }

        @Override  // okhttp3.internal.concurrent.TaskRunner$Backend
        public void execute(@NotNull Runnable runnable0) {
            Intrinsics.checkNotNullParameter(runnable0, "runnable");
            this.a.execute(runnable0);
        }

        @Override  // okhttp3.internal.concurrent.TaskRunner$Backend
        public long nanoTime() {
            return System.nanoTime();
        }

        public final void shutdown() {
            this.a.shutdown();
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final TaskRunner INSTANCE;
    public final Backend a;
    public int b;
    public boolean c;
    public long d;
    public final ArrayList e;
    public final ArrayList f;
    public final okhttp3.internal.concurrent.TaskRunner.runnable.1 g;
    public static final Logger h;

    static {
        TaskRunner.Companion = new Companion(null);
        TaskRunner.INSTANCE = new TaskRunner(new RealBackend(Util.threadFactory((Util.okHttpName + " TaskRunner"), true)));
        Logger logger0 = Logger.getLogger("okhttp3.internal.concurrent.TaskRunner");
        Intrinsics.checkNotNullExpressionValue(logger0, "getLogger(TaskRunner::class.java.name)");
        TaskRunner.h = logger0;
    }

    public TaskRunner(@NotNull Backend taskRunner$Backend0) {
        Intrinsics.checkNotNullParameter(taskRunner$Backend0, "backend");
        super();
        this.a = taskRunner$Backend0;
        this.b = 10000;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new Runnable() {
            public final TaskRunner a;

            {
                this.a = taskRunner0;
            }

            @Override
            public void run() {
                Task task0;
                long v1;
                while(true) {
                    synchronized(this.a) {
                        task0 = this.a.awaitTaskToRun();
                    }
                    if(task0 == null) {
                        return;
                    }
                    TaskQueue taskQueue0 = task0.getQueue$okhttp();
                    Intrinsics.checkNotNull(taskQueue0);
                    TaskRunner taskRunner0 = this.a;
                    boolean z = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
                    if(z) {
                        v1 = taskQueue0.getTaskRunner$okhttp().getBackend().nanoTime();
                        TaskLoggerKt.access$log(task0, taskQueue0, "starting");
                    }
                    else {
                        v1 = -1L;
                    }
                    try {
                        TaskRunner.access$runTask(taskRunner0, task0);
                        if(!z) {
                            continue;
                        }
                    }
                    catch(Throwable throwable0) {
                        try {
                            taskRunner0.getBackend().execute(this);
                            throw throwable0;
                        }
                        catch(Throwable throwable1) {
                            if(z) {
                                TaskLoggerKt.access$log(task0, taskQueue0, "failed a run in " + TaskLoggerKt.formatDuration(taskQueue0.getTaskRunner$okhttp().getBackend().nanoTime() - v1));
                            }
                            throw throwable1;
                        }
                    }
                    TaskLoggerKt.access$log(task0, taskQueue0, "finished run in " + TaskLoggerKt.formatDuration(taskQueue0.getTaskRunner$okhttp().getBackend().nanoTime() - v1));
                }
            }
        };
    }

    public final void a(Task task0, long v) {
        if(Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2141 MUST hold lock on " + this);
        }
        TaskQueue taskQueue0 = task0.getQueue$okhttp();
        Intrinsics.checkNotNull(taskQueue0);
        if(taskQueue0.getActiveTask$okhttp() != task0) {
            throw new IllegalStateException("Check failed.");
        }
        taskQueue0.setCancelActiveTask$okhttp(false);
        taskQueue0.setActiveTask$okhttp(null);
        this.e.remove(taskQueue0);
        if(v != -1L && !taskQueue0.getCancelActiveTask$okhttp() && !taskQueue0.getShutdown$okhttp()) {
            taskQueue0.scheduleAndDecide$okhttp(task0, v, true);
        }
        if(!taskQueue0.getFutureTasks$okhttp().isEmpty()) {
            this.f.add(taskQueue0);
        }
    }

    public static final void access$runTask(TaskRunner taskRunner0, Task task0) {
        long v;
        taskRunner0.getClass();
        if(Util.assertionsEnabled && Thread.holdsLock(taskRunner0)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2115 MUST NOT hold lock on " + taskRunner0);
        }
        Thread thread0 = Thread.currentThread();
        thread0.setName(task0.getName());
        try {
            v = task0.runOnce();
        }
        catch(Throwable throwable0) {
            synchronized(taskRunner0) {
                taskRunner0.a(task0, -1L);
            }
            thread0.setName("jeb-dexdec-sb-st-2115");
            throw throwable0;
        }
        synchronized(taskRunner0) {
            taskRunner0.a(task0, v);
        }
        thread0.setName("jeb-dexdec-sb-st-2115");
    }

    @NotNull
    public final List activeQueues() {
        synchronized(this) {
            return CollectionsKt___CollectionsKt.plus(this.e, this.f);
        }
    }

    @Nullable
    public final Task awaitTaskToRun() {
        boolean z;
        long v2;
        if(Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2221 MUST hold lock on " + this);
        }
        while(true) {
            ArrayList arrayList0 = this.f;
            if(arrayList0.isEmpty()) {
                return null;
            }
            Backend taskRunner$Backend0 = this.a;
            long v = taskRunner$Backend0.nanoTime();
            long v1 = 0x7FFFFFFFFFFFFFFFL;
            Task task0 = null;
            Iterator iterator0 = arrayList0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    v2 = v;
                    z = false;
                    break;
                }
                Object object0 = iterator0.next();
                Task task1 = (Task)((TaskQueue)object0).getFutureTasks$okhttp().get(0);
                v2 = v;
                long v3 = Math.max(0L, task1.getNextExecuteNanoTime$okhttp() - v);
                if(v3 > 0L) {
                    v1 = Math.min(v3, v1);
                }
                else if(task0 == null) {
                    task0 = task1;
                }
                else {
                    z = true;
                    break;
                }
                v = v2;
            }
            if(task0 != null) {
                if(Util.assertionsEnabled && !Thread.holdsLock(this)) {
                    throw new AssertionError("Thread jeb-dexdec-sb-st-2221 MUST hold lock on " + this);
                }
                task0.setNextExecuteNanoTime$okhttp(-1L);
                TaskQueue taskQueue0 = task0.getQueue$okhttp();
                Intrinsics.checkNotNull(taskQueue0);
                taskQueue0.getFutureTasks$okhttp().remove(task0);
                arrayList0.remove(taskQueue0);
                taskQueue0.setActiveTask$okhttp(task0);
                this.e.add(taskQueue0);
                if(z || !this.c && !arrayList0.isEmpty()) {
                    taskRunner$Backend0.execute(this.g);
                }
                return task0;
            }
            if(this.c) {
                if(v1 < this.d - v2) {
                    taskRunner$Backend0.coordinatorNotify(this);
                }
                return null;
            }
            try {
                this.c = true;
                this.d = v2 + v1;
                taskRunner$Backend0.coordinatorWait(this, v1);
            }
            catch(InterruptedException unused_ex) {
                this.cancelAll();
            }
            finally {
                this.c = false;
            }
        }
    }

    public final void cancelAll() {
        ArrayList arrayList0 = this.e;
        for(int v = arrayList0.size() - 1; -1 < v; --v) {
            ((TaskQueue)arrayList0.get(v)).cancelAllAndDecide$okhttp();
        }
        ArrayList arrayList1 = this.f;
        for(int v1 = arrayList1.size() - 1; -1 < v1; --v1) {
            TaskQueue taskQueue0 = (TaskQueue)arrayList1.get(v1);
            taskQueue0.cancelAllAndDecide$okhttp();
            if(taskQueue0.getFutureTasks$okhttp().isEmpty()) {
                arrayList1.remove(v1);
            }
        }
    }

    @NotNull
    public final Backend getBackend() {
        return this.a;
    }

    public final void kickCoordinator$okhttp(@NotNull TaskQueue taskQueue0) {
        Intrinsics.checkNotNullParameter(taskQueue0, "taskQueue");
        if(Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2177 MUST hold lock on " + this);
        }
        if(taskQueue0.getActiveTask$okhttp() == null) {
            ArrayList arrayList0 = this.f;
            if(taskQueue0.getFutureTasks$okhttp().isEmpty()) {
                arrayList0.remove(taskQueue0);
            }
            else {
                Util.addIfAbsent(arrayList0, taskQueue0);
            }
        }
        Backend taskRunner$Backend0 = this.a;
        if(this.c) {
            taskRunner$Backend0.coordinatorNotify(this);
            return;
        }
        taskRunner$Backend0.execute(this.g);
    }

    @NotNull
    public final TaskQueue newQueue() {
        int v;
        synchronized(this) {
            v = this.b;
            this.b = v + 1;
        }
        return new TaskQueue(this, "Q" + v);
    }
}


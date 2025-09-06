package kotlinx.coroutines.scheduling;

import ag.b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.ranges.c;
import kotlinx.coroutines.internal.SystemPropsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0010\u0010\u0000\u001A\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001A\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001A\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001A\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001A\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001A\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000E\u0010\n\u001A\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u000B\u001A\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\f\u001A\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0012\u0010\r\u001A\u00020\u000E8\u0000@\u0000X\u0081\u000E¢\u0006\u0002\n\u0000\"\u0019\u0010\u000F\u001A\u00020\u0010*\u00020\u00118À\u0002X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0012¨\u0006\u0013"}, d2 = {"BlockingContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "CORE_POOL_SIZE", "", "DEFAULT_SCHEDULER_NAME", "", "IDLE_WORKER_KEEP_ALIVE_NS", "", "MAX_POOL_SIZE", "NonBlockingContext", "TASK_NON_BLOCKING", "TASK_PROBABLY_BLOCKING", "WORK_STEALING_TIME_RESOLUTION_NS", "schedulerTimeSource", "Lkotlinx/coroutines/scheduling/SchedulerTimeSource;", "isBlocking", "", "Lkotlinx/coroutines/scheduling/Task;", "(Lkotlinx/coroutines/scheduling/Task;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TasksKt {
    @JvmField
    @NotNull
    public static final TaskContext BlockingContext = null;
    @JvmField
    public static final int CORE_POOL_SIZE = 0;
    @JvmField
    @NotNull
    public static final String DEFAULT_SCHEDULER_NAME = null;
    @JvmField
    public static final long IDLE_WORKER_KEEP_ALIVE_NS = 0L;
    @JvmField
    public static final int MAX_POOL_SIZE = 0;
    @JvmField
    @NotNull
    public static final TaskContext NonBlockingContext = null;
    public static final int TASK_NON_BLOCKING = 0;
    public static final int TASK_PROBABLY_BLOCKING = 1;
    @JvmField
    public static final long WORK_STEALING_TIME_RESOLUTION_NS;
    @JvmField
    @NotNull
    public static SchedulerTimeSource schedulerTimeSource;

    static {
        TasksKt.DEFAULT_SCHEDULER_NAME = "DefaultDispatcher";
        TasksKt.WORK_STEALING_TIME_RESOLUTION_NS = SystemPropsKt.systemProp$default("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        TasksKt.CORE_POOL_SIZE = SystemPropsKt.systemProp$default("kotlinx.coroutines.scheduler.core.pool.size", c.coerceAtLeast(8, 2), 1, 0, 8, null);
        TasksKt.MAX_POOL_SIZE = SystemPropsKt.systemProp$default("kotlinx.coroutines.scheduler.max.pool.size", 0x1FFFFE, 0, 0x1FFFFE, 4, null);
        TasksKt.IDLE_WORKER_KEEP_ALIVE_NS = TimeUnit.SECONDS.toNanos(SystemPropsKt.systemProp$default("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        TasksKt.schedulerTimeSource = NanoTimeSource.INSTANCE;
        TasksKt.NonBlockingContext = new b(0);
        TasksKt.BlockingContext = new b(1);
    }

    public static final boolean isBlocking(@NotNull Task task0) {
        return task0.taskContext.getTaskMode() == 1;
    }
}


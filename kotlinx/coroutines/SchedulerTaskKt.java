package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.scheduling.Task;
import kotlinx.coroutines.scheduling.TaskContext;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0011\u0010\t\u001A\u00020\n*\u00060\u0001j\u0002`\u0002H\u0080\b\"&\u0010\u0000\u001A\u00060\u0001j\u0002`\u0002*\u00060\u0003j\u0002`\u00048@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\b*\f\b\u0000\u0010\u000B\"\u00020\u00032\u00020\u0003*\f\b\u0000\u0010\f\"\u00020\u00012\u00020\u0001¨\u0006\r"}, d2 = {"taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "Lkotlinx/coroutines/SchedulerTaskContext;", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "getTaskContext$annotations", "(Lkotlinx/coroutines/scheduling/Task;)V", "getTaskContext", "(Lkotlinx/coroutines/scheduling/Task;)Lkotlinx/coroutines/scheduling/TaskContext;", "afterTask", "", "SchedulerTask", "SchedulerTaskContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SchedulerTaskKt {
    public static final void afterTask(@NotNull TaskContext taskContext0) {
        taskContext0.afterTask();
    }

    @NotNull
    public static final TaskContext getTaskContext(@NotNull Task task0) {
        return task0.taskContext;
    }

    public static void getTaskContext$annotations(Task task0) {
    }
}


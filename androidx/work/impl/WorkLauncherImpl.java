package androidx.work.impl;

import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.impl.utils.StartWorkRunnable;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001F\u0010\u0011\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Landroidx/work/impl/WorkLauncherImpl;", "Landroidx/work/impl/WorkLauncher;", "Landroidx/work/impl/Processor;", "processor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "workTaskExecutor", "<init>", "(Landroidx/work/impl/Processor;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "Landroidx/work/impl/StartStopToken;", "workSpecId", "Landroidx/work/WorkerParameters$RuntimeExtras;", "runtimeExtras", "", "startWork", "(Landroidx/work/impl/StartStopToken;Landroidx/work/WorkerParameters$RuntimeExtras;)V", "", "reason", "stopWork", "(Landroidx/work/impl/StartStopToken;I)V", "a", "Landroidx/work/impl/Processor;", "getProcessor", "()Landroidx/work/impl/Processor;", "b", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "getWorkTaskExecutor", "()Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WorkLauncherImpl implements WorkLauncher {
    public final Processor a;
    public final TaskExecutor b;

    public WorkLauncherImpl(@NotNull Processor processor0, @NotNull TaskExecutor taskExecutor0) {
        Intrinsics.checkNotNullParameter(processor0, "processor");
        Intrinsics.checkNotNullParameter(taskExecutor0, "workTaskExecutor");
        super();
        this.a = processor0;
        this.b = taskExecutor0;
    }

    @NotNull
    public final Processor getProcessor() {
        return this.a;
    }

    @NotNull
    public final TaskExecutor getWorkTaskExecutor() {
        return this.b;
    }

    @Override  // androidx.work.impl.WorkLauncher
    public void startWork(@NotNull StartStopToken startStopToken0, @Nullable RuntimeExtras workerParameters$RuntimeExtras0) {
        Intrinsics.checkNotNullParameter(startStopToken0, "workSpecId");
        StartWorkRunnable startWorkRunnable0 = new StartWorkRunnable(this.a, startStopToken0, workerParameters$RuntimeExtras0);
        this.b.executeOnTaskThread(startWorkRunnable0);
    }

    @Override  // androidx.work.impl.WorkLauncher
    public void stopWork(@NotNull StartStopToken startStopToken0, int v) {
        Intrinsics.checkNotNullParameter(startStopToken0, "workSpecId");
        StopWorkRunnable stopWorkRunnable0 = new StopWorkRunnable(this.a, startStopToken0, false, v);
        this.b.executeOnTaskThread(stopWorkRunnable0);
    }
}


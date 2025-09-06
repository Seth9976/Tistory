package androidx.work.impl;

import android.content.Context;
import androidx.compose.foundation.text.selection.c1;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.R.bool;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\u001A\u00E1\u0001\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0097\u0001\b\u0002\u0010\u0012\u001A\u0090\u0001\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000F0\fj\u0002`\u0011H\u0007\u00A2\u0006\u0004\b\u0014\u0010\u0015\u001A\'\u0010\u0019\u001A\u00020\u00132\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001A\u00B0\u0001\u0010\u001B\u001A\u0090\u0001\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000F0\fj\u0002`\u00112\u0012\u0010\u001B\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u001A\"\u00020\u0010\u00A2\u0006\u0004\b\u001B\u0010\u001C*\u00A0\u0002\u0010\u001D\"\u008C\u0001\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000F0\f2\u008C\u0001\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000F0\f\u00A8\u0006\u001E"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/Configuration;", "configuration", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "workTaskExecutor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/impl/constraints/trackers/Trackers;", "trackers", "Landroidx/work/impl/Processor;", "processor", "Lkotlin/Function6;", "Lkotlin/ParameterName;", "name", "", "Landroidx/work/impl/Scheduler;", "Landroidx/work/impl/SchedulersCreator;", "schedulersCreator", "Landroidx/work/impl/WorkManagerImpl;", "createWorkManager", "(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;Lkotlin/jvm/functions/Function6;)Landroidx/work/impl/WorkManagerImpl;", "WorkManagerImpl", "createTestWorkManager", "(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)Landroidx/work/impl/WorkManagerImpl;", "TestWorkManagerImpl", "", "schedulers", "([Landroidx/work/impl/Scheduler;)Lkotlin/jvm/functions/Function6;", "SchedulersCreator", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class WorkManagerImplExtKt {
    public static final List access$createSchedulers(Context context0, Configuration configuration0, TaskExecutor taskExecutor0, WorkDatabase workDatabase0, Trackers trackers0, Processor processor0) {
        SystemJobScheduler systemJobScheduler0 = new SystemJobScheduler(context0, workDatabase0, configuration0);
        PackageManagerHelper.setComponentEnabled(context0, SystemJobService.class, true);
        Logger.get().debug("WM-Schedulers", "Created SystemJobScheduler and enabled SystemJobService");
        Intrinsics.checkNotNullExpressionValue(systemJobScheduler0, "createBestAvailableBackg…kDatabase, configuration)");
        return CollectionsKt__CollectionsKt.listOf(new Scheduler[]{systemJobScheduler0, new GreedyScheduler(context0, configuration0, trackers0, processor0, new WorkLauncherImpl(processor0, taskExecutor0), taskExecutor0)});
    }

    @JvmName(name = "createTestWorkManager")
    @NotNull
    public static final WorkManagerImpl createTestWorkManager(@NotNull Context context0, @NotNull Configuration configuration0, @NotNull TaskExecutor taskExecutor0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(configuration0, "configuration");
        Intrinsics.checkNotNullParameter(taskExecutor0, "workTaskExecutor");
        SerialExecutor serialExecutor0 = taskExecutor0.getSerialTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(serialExecutor0, "workTaskExecutor.serialTaskExecutor");
        return WorkManagerImplExtKt.createWorkManager$default(context0, configuration0, taskExecutor0, WorkDatabase.Companion.create(context0, serialExecutor0, configuration0.getClock(), true), null, null, null, 0x70, null);
    }

    @JvmName(name = "createWorkManager")
    @JvmOverloads
    @NotNull
    public static final WorkManagerImpl createWorkManager(@NotNull Context context0, @NotNull Configuration configuration0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(configuration0, "configuration");
        return WorkManagerImplExtKt.createWorkManager$default(context0, configuration0, null, null, null, null, null, 0x7C, null);
    }

    @JvmName(name = "createWorkManager")
    @JvmOverloads
    @NotNull
    public static final WorkManagerImpl createWorkManager(@NotNull Context context0, @NotNull Configuration configuration0, @NotNull TaskExecutor taskExecutor0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(configuration0, "configuration");
        Intrinsics.checkNotNullParameter(taskExecutor0, "workTaskExecutor");
        return WorkManagerImplExtKt.createWorkManager$default(context0, configuration0, taskExecutor0, null, null, null, null, 120, null);
    }

    @JvmName(name = "createWorkManager")
    @JvmOverloads
    @NotNull
    public static final WorkManagerImpl createWorkManager(@NotNull Context context0, @NotNull Configuration configuration0, @NotNull TaskExecutor taskExecutor0, @NotNull WorkDatabase workDatabase0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(configuration0, "configuration");
        Intrinsics.checkNotNullParameter(taskExecutor0, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase0, "workDatabase");
        return WorkManagerImplExtKt.createWorkManager$default(context0, configuration0, taskExecutor0, workDatabase0, null, null, null, 0x70, null);
    }

    @JvmName(name = "createWorkManager")
    @JvmOverloads
    @NotNull
    public static final WorkManagerImpl createWorkManager(@NotNull Context context0, @NotNull Configuration configuration0, @NotNull TaskExecutor taskExecutor0, @NotNull WorkDatabase workDatabase0, @NotNull Trackers trackers0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(configuration0, "configuration");
        Intrinsics.checkNotNullParameter(taskExecutor0, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase0, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers0, "trackers");
        return WorkManagerImplExtKt.createWorkManager$default(context0, configuration0, taskExecutor0, workDatabase0, trackers0, null, null, 0x60, null);
    }

    @JvmName(name = "createWorkManager")
    @JvmOverloads
    @NotNull
    public static final WorkManagerImpl createWorkManager(@NotNull Context context0, @NotNull Configuration configuration0, @NotNull TaskExecutor taskExecutor0, @NotNull WorkDatabase workDatabase0, @NotNull Trackers trackers0, @NotNull Processor processor0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(configuration0, "configuration");
        Intrinsics.checkNotNullParameter(taskExecutor0, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase0, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers0, "trackers");
        Intrinsics.checkNotNullParameter(processor0, "processor");
        return WorkManagerImplExtKt.createWorkManager$default(context0, configuration0, taskExecutor0, workDatabase0, trackers0, processor0, null, 0x40, null);
    }

    @JvmName(name = "createWorkManager")
    @JvmOverloads
    @NotNull
    public static final WorkManagerImpl createWorkManager(@NotNull Context context0, @NotNull Configuration configuration0, @NotNull TaskExecutor taskExecutor0, @NotNull WorkDatabase workDatabase0, @NotNull Trackers trackers0, @NotNull Processor processor0, @NotNull Function6 function60) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(configuration0, "configuration");
        Intrinsics.checkNotNullParameter(taskExecutor0, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase0, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers0, "trackers");
        Intrinsics.checkNotNullParameter(processor0, "processor");
        Intrinsics.checkNotNullParameter(function60, "schedulersCreator");
        Object object0 = function60.invoke(context0, configuration0, taskExecutor0, workDatabase0, trackers0, processor0);
        return new WorkManagerImpl(context0.getApplicationContext(), configuration0, taskExecutor0, workDatabase0, ((List)object0), processor0, trackers0);
    }

    public static WorkManagerImpl createWorkManager$default(Context context0, Configuration configuration0, TaskExecutor taskExecutor0, WorkDatabase workDatabase0, Trackers trackers0, Processor processor0, Function6 function60, int v, Object object0) {
        Trackers trackers1;
        WorkDatabase workDatabase1;
        TaskExecutor taskExecutor1 = (v & 4) == 0 ? taskExecutor0 : new WorkManagerTaskExecutor(configuration0.getTaskExecutor());
        if((v & 8) == 0) {
            workDatabase1 = workDatabase0;
        }
        else {
            Context context1 = context0.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context1, "context.applicationContext");
            SerialExecutor serialExecutor0 = taskExecutor1.getSerialTaskExecutor();
            Intrinsics.checkNotNullExpressionValue(serialExecutor0, "workTaskExecutor.serialTaskExecutor");
            boolean z = context0.getResources().getBoolean(bool.workmanager_test_configuration);
            workDatabase1 = WorkDatabase.Companion.create(context1, serialExecutor0, configuration0.getClock(), z);
        }
        if((v & 16) == 0) {
            trackers1 = trackers0;
        }
        else {
            Context context2 = context0.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context.applicationContext");
            trackers1 = new Trackers(context2, taskExecutor1, null, null, null, null, 60, null);
        }
        Processor processor1 = (v & 0x20) == 0 ? processor0 : new Processor(context0.getApplicationContext(), configuration0, taskExecutor1, workDatabase1);
        return (v & 0x40) == 0 ? WorkManagerImplExtKt.createWorkManager(context0, configuration0, taskExecutor1, workDatabase1, trackers1, processor1, function60) : WorkManagerImplExtKt.createWorkManager(context0, configuration0, taskExecutor1, workDatabase1, trackers1, processor1, i.a);
    }

    @NotNull
    public static final Function6 schedulers(@NotNull Scheduler[] arr_scheduler) {
        Intrinsics.checkNotNullParameter(arr_scheduler, "schedulers");
        return new c1(arr_scheduler, 1);
    }
}


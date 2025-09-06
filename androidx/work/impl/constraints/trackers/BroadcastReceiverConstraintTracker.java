package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0010\u0010\u000FR\u0014\u0010\u0014\u001A\u00020\u00118&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "T", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroid/content/Context;", "context", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "Landroid/content/Intent;", "intent", "", "onBroadcastReceive", "(Landroid/content/Intent;)V", "startTracking", "()V", "stopTracking", "Landroid/content/IntentFilter;", "getIntentFilter", "()Landroid/content/IntentFilter;", "intentFilter", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class BroadcastReceiverConstraintTracker extends ConstraintTracker {
    public final androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker.broadcastReceiver.1 f;

    public BroadcastReceiverConstraintTracker(@NotNull Context context0, @NotNull TaskExecutor taskExecutor0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(taskExecutor0, "taskExecutor");
        super(context0, taskExecutor0);
        this.f = new BroadcastReceiver() {
            @Override  // android.content.BroadcastReceiver
            public void onReceive(@NotNull Context context0, @NotNull Intent intent0) {
                Intrinsics.checkNotNullParameter(context0, "context");
                Intrinsics.checkNotNullParameter(intent0, "intent");
                this.a.onBroadcastReceive(intent0);
            }
        };
    }

    @NotNull
    public abstract IntentFilter getIntentFilter();

    public abstract void onBroadcastReceive(@NotNull Intent arg1);

    @Override  // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        Logger.get().debug("WM-BrdcstRcvrCnstrntTrc", this.getClass().getSimpleName() + ": registering receiver");
        IntentFilter intentFilter0 = this.getIntentFilter();
        this.getAppContext().registerReceiver(this.f, intentFilter0);
    }

    @Override  // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        Logger.get().debug("WM-BrdcstRcvrCnstrntTrc", this.getClass().getSimpleName() + ": unregistering receiver");
        this.getAppContext().unregisterReceiver(this.f);
    }
}


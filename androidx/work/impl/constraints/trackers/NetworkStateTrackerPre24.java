package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0015\u001A\u00020\u00108VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/work/impl/constraints/trackers/NetworkStateTrackerPre24;", "Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "Landroid/content/Context;", "context", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "Landroid/content/Intent;", "intent", "", "onBroadcastReceive", "(Landroid/content/Intent;)V", "readSystemState", "()Landroidx/work/impl/constraints/NetworkState;", "Landroid/content/IntentFilter;", "getIntentFilter", "()Landroid/content/IntentFilter;", "getIntentFilter$annotations", "()V", "intentFilter", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NetworkStateTrackerPre24 extends BroadcastReceiverConstraintTracker {
    public final ConnectivityManager g;

    public NetworkStateTrackerPre24(@NotNull Context context0, @NotNull TaskExecutor taskExecutor0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(taskExecutor0, "taskExecutor");
        super(context0, taskExecutor0);
        Object object0 = this.getAppContext().getSystemService("connectivity");
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.g = (ConnectivityManager)object0;
    }

    @Override  // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    @NotNull
    public IntentFilter getIntentFilter() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public static void getIntentFilter$annotations() {
    }

    @Override  // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void onBroadcastReceive(@NotNull Intent intent0) {
        Intrinsics.checkNotNullParameter(intent0, "intent");
        if(Intrinsics.areEqual(intent0.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            Logger.get().debug("WM-NetworkStateTracker", "Network broadcast received");
            this.setState(NetworkStateTrackerKt.getActiveNetworkState(this.g));
        }
    }

    @NotNull
    public NetworkState readSystemState() {
        return NetworkStateTrackerKt.getActiveNetworkState(this.g);
    }

    @Override  // androidx.work.impl.constraints.trackers.ConstraintTracker
    public Object readSystemState() {
        return this.readSystemState();
    }
}


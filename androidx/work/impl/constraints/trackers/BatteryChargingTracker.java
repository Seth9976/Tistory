package androidx.work.impl.constraints.trackers;

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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0013\u001A\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/constraints/trackers/BatteryChargingTracker;", "Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "", "Landroid/content/Context;", "context", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "readSystemState", "()Ljava/lang/Boolean;", "Landroid/content/Intent;", "intent", "", "onBroadcastReceive", "(Landroid/content/Intent;)V", "Landroid/content/IntentFilter;", "getIntentFilter", "()Landroid/content/IntentFilter;", "intentFilter", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BatteryChargingTracker extends BroadcastReceiverConstraintTracker {
    public BatteryChargingTracker(@NotNull Context context0, @NotNull TaskExecutor taskExecutor0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(taskExecutor0, "taskExecutor");
        super(context0, taskExecutor0);
    }

    @Override  // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    @NotNull
    public IntentFilter getIntentFilter() {
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.os.action.CHARGING");
        intentFilter0.addAction("android.os.action.DISCHARGING");
        return intentFilter0;
    }

    @Override  // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void onBroadcastReceive(@NotNull Intent intent0) {
        Intrinsics.checkNotNullParameter(intent0, "intent");
        String s = intent0.getAction();
        if(s == null) {
            return;
        }
        Logger.get().debug("WM-BatteryChrgTracker", "Received " + s);
        switch(s) {
            case "android.intent.action.ACTION_POWER_CONNECTED": {
                this.setState(Boolean.TRUE);
                return;
            }
            case "android.intent.action.ACTION_POWER_DISCONNECTED": {
                this.setState(Boolean.FALSE);
                return;
            }
            case "android.os.action.CHARGING": {
                this.setState(Boolean.TRUE);
                return;
            }
            case "android.os.action.DISCHARGING": {
                this.setState(Boolean.FALSE);
            }
        }
    }

    @NotNull
    public Boolean readSystemState() {
        Intent intent0 = this.getAppContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if(intent0 == null) {
            Logger.get().error("WM-BatteryChrgTracker", "getInitialState - null intent received");
            return false;
        }
        switch(intent0.getIntExtra("status", -1)) {
            case 2: 
            case 5: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // androidx.work.impl.constraints.trackers.ConstraintTracker
    public Object readSystemState() {
        return this.readSystemState();
    }
}


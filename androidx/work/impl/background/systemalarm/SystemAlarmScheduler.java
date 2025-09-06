package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SystemAlarmScheduler implements Scheduler {
    public final Context a;
    public static final String b;

    static {
        SystemAlarmScheduler.b = "WM-SystemAlarmScheduler";
    }

    public SystemAlarmScheduler(@NonNull Context context0) {
        this.a = context0.getApplicationContext();
    }

    @Override  // androidx.work.impl.Scheduler
    public void cancel(@NonNull String s) {
        Intent intent0 = new Intent(this.a, SystemAlarmService.class);
        intent0.setAction("ACTION_STOP_WORK");
        intent0.putExtra("KEY_WORKSPEC_ID", s);
        this.a.startService(intent0);
    }

    @Override  // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    @Override  // androidx.work.impl.Scheduler
    public void schedule(@NonNull WorkSpec[] arr_workSpec) {
        for(int v = 0; v < arr_workSpec.length; ++v) {
            WorkSpec workSpec0 = arr_workSpec[v];
            Logger.get().debug("WM-SystemAlarmScheduler", "Scheduling work with workSpecId " + workSpec0.id);
            WorkGenerationalId workGenerationalId0 = WorkSpecKt.generationalId(workSpec0);
            Intent intent0 = new Intent(this.a, SystemAlarmService.class);
            intent0.setAction("ACTION_SCHEDULE_WORK");
            CommandHandler.c(intent0, workGenerationalId0);
            this.a.startService(intent0);
        }
    }
}


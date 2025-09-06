package androidx.work.impl.background.systemalarm;

import a5.b;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.w0;
import androidx.work.Logger;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.constraints.ConstraintsState.ConstraintsMet;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;

@RestrictTo({Scope.LIBRARY_GROUP})
public class DelayMetCommandHandler implements OnConstraintsStateChangedListener, TimeLimitExceededListener {
    public final Context a;
    public final int b;
    public final WorkGenerationalId c;
    public final SystemAlarmDispatcher d;
    public final WorkConstraintsTracker e;
    public final Object f;
    public int g;
    public final SerialExecutor h;
    public final Executor i;
    public PowerManager.WakeLock j;
    public boolean k;
    public final StartStopToken l;
    public final CoroutineDispatcher m;
    public volatile Job n;
    public static final String o;

    static {
        DelayMetCommandHandler.o = "WM-DelayMetCommandHandl";
    }

    public DelayMetCommandHandler(Context context0, int v, SystemAlarmDispatcher systemAlarmDispatcher0, StartStopToken startStopToken0) {
        this.a = context0;
        this.b = v;
        this.d = systemAlarmDispatcher0;
        this.c = startStopToken0.getId();
        this.l = startStopToken0;
        this.h = systemAlarmDispatcher0.b.getSerialTaskExecutor();
        this.i = systemAlarmDispatcher0.b.getMainThreadExecutor();
        this.m = systemAlarmDispatcher0.b.getTaskCoroutineDispatcher();
        this.e = new WorkConstraintsTracker(systemAlarmDispatcher0.e.getTrackers());
        this.k = false;
        this.g = 0;
        this.f = new Object();
    }

    public static void a(DelayMetCommandHandler delayMetCommandHandler0) {
        WorkGenerationalId workGenerationalId0 = delayMetCommandHandler0.c;
        String s = workGenerationalId0.getWorkSpecId();
        if(delayMetCommandHandler0.g < 2) {
            delayMetCommandHandler0.g = 2;
            Logger.get().debug("WM-DelayMetCommandHandl", "Stopping work for WorkSpec " + s);
            Context context0 = delayMetCommandHandler0.a;
            Class class0 = SystemAlarmService.class;
            Intent intent0 = new Intent(context0, class0);
            intent0.setAction("ACTION_STOP_WORK");
            CommandHandler.c(intent0, workGenerationalId0);
            SystemAlarmDispatcher systemAlarmDispatcher0 = delayMetCommandHandler0.d;
            int v = delayMetCommandHandler0.b;
            w0 w00 = new w0(systemAlarmDispatcher0, intent0, v, 1);
            Executor executor0 = delayMetCommandHandler0.i;
            executor0.execute(w00);
            if(systemAlarmDispatcher0.d.isEnqueued(workGenerationalId0.getWorkSpecId())) {
                Logger.get().debug("WM-DelayMetCommandHandl", "WorkSpec " + s + " needs to be rescheduled");
                Intent intent1 = new Intent(context0, class0);
                intent1.setAction("ACTION_SCHEDULE_WORK");
                CommandHandler.c(intent1, workGenerationalId0);
                executor0.execute(new w0(systemAlarmDispatcher0, intent1, v, 1));
                return;
            }
            Logger.get().debug("WM-DelayMetCommandHandl", "Processor does not have WorkSpec " + s + ". No need to reschedule");
            return;
        }
        Logger.get().debug("WM-DelayMetCommandHandl", "Already stopped work for " + s);
    }

    public static void b(DelayMetCommandHandler delayMetCommandHandler0) {
        WorkGenerationalId workGenerationalId0 = delayMetCommandHandler0.c;
        if(delayMetCommandHandler0.g == 0) {
            delayMetCommandHandler0.g = 1;
            Logger.get().debug("WM-DelayMetCommandHandl", "onAllConstraintsMet for " + workGenerationalId0);
            SystemAlarmDispatcher systemAlarmDispatcher0 = delayMetCommandHandler0.d;
            if(systemAlarmDispatcher0.d.startWork(delayMetCommandHandler0.l)) {
                systemAlarmDispatcher0.c.startTimer(workGenerationalId0, 600000L, delayMetCommandHandler0);
                return;
            }
            delayMetCommandHandler0.c();
            return;
        }
        Logger.get().debug("WM-DelayMetCommandHandl", "Already started work for " + workGenerationalId0);
    }

    public final void c() {
        synchronized(this.f) {
            if(this.n != null) {
                this.n.cancel(null);
            }
            this.d.c.stopTimer(this.c);
            if(this.j != null && this.j.isHeld()) {
                Logger.get().debug("WM-DelayMetCommandHandl", "Releasing wakelock " + this.j + "for WorkSpec " + this.c);
                this.j.release();
            }
        }
    }

    public final void d() {
        String s = this.c.getWorkSpecId();
        StringBuilder stringBuilder0 = b.u(s, " (");
        stringBuilder0.append(this.b);
        stringBuilder0.append(")");
        this.j = WakeLocks.newWakeLock(this.a, stringBuilder0.toString());
        Logger.get().debug("WM-DelayMetCommandHandl", "Acquiring wakelock " + this.j + "for WorkSpec " + s);
        this.j.acquire();
        WorkSpec workSpec0 = this.d.e.getWorkDatabase().workSpecDao().getWorkSpec(s);
        if(workSpec0 == null) {
            e e0 = new e(this, 0);
            this.h.execute(e0);
            return;
        }
        boolean z = workSpec0.hasConstraints();
        this.k = z;
        if(!z) {
            Logger.get().debug("WM-DelayMetCommandHandl", "No constraints for " + s);
            e e1 = new e(this, 1);
            this.h.execute(e1);
            return;
        }
        this.n = WorkConstraintsTrackerKt.listen(this.e, workSpec0, this.m, this);
    }

    public final void e(boolean z) {
        Logger logger0 = Logger.get();
        WorkGenerationalId workGenerationalId0 = this.c;
        logger0.debug("WM-DelayMetCommandHandl", "onExecuted " + workGenerationalId0 + ", " + z);
        this.c();
        Class class0 = SystemAlarmService.class;
        int v = this.b;
        SystemAlarmDispatcher systemAlarmDispatcher0 = this.d;
        Executor executor0 = this.i;
        Context context0 = this.a;
        if(z) {
            Intent intent0 = new Intent(context0, class0);
            intent0.setAction("ACTION_SCHEDULE_WORK");
            CommandHandler.c(intent0, workGenerationalId0);
            executor0.execute(new w0(systemAlarmDispatcher0, intent0, v, 1));
        }
        if(this.k) {
            Intent intent1 = new Intent(context0, class0);
            intent1.setAction("ACTION_CONSTRAINTS_CHANGED");
            executor0.execute(new w0(systemAlarmDispatcher0, intent1, v, 1));
        }
    }

    @Override  // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(@NonNull WorkSpec workSpec0, @NonNull ConstraintsState constraintsState0) {
        SerialExecutor serialExecutor0 = this.h;
        if(constraintsState0 instanceof ConstraintsMet) {
            serialExecutor0.execute(new e(this, 1));
            return;
        }
        serialExecutor0.execute(new e(this, 0));
    }

    @Override  // androidx.work.impl.utils.WorkTimer$TimeLimitExceededListener
    public void onTimeLimitExceeded(@NonNull WorkGenerationalId workGenerationalId0) {
        Logger.get().debug("WM-DelayMetCommandHandl", "Exceeded time limits on execution for " + workGenerationalId0);
        e e0 = new e(this, 0);
        this.h.execute(e0);
    }
}


package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.w0;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.concurrent.Executor;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SystemAlarmDispatcher implements ExecutionListener {
    interface CommandsCompletedListener {
        void onAllCommandsCompleted();
    }

    public final Context a;
    public final TaskExecutor b;
    public final WorkTimer c;
    public final Processor d;
    public final WorkManagerImpl e;
    public final CommandHandler f;
    public final ArrayList g;
    public Intent h;
    public SystemAlarmService i;
    public final WorkLauncher j;
    public static final String k;

    static {
        SystemAlarmDispatcher.k = "WM-SystemAlarmDispatche";
    }

    public SystemAlarmDispatcher(SystemAlarmService systemAlarmService0) {
        Context context0 = systemAlarmService0.getApplicationContext();
        this.a = context0;
        StartStopTokens startStopTokens0 = new StartStopTokens();
        WorkManagerImpl workManagerImpl0 = WorkManagerImpl.getInstance(systemAlarmService0);
        this.e = workManagerImpl0;
        this.f = new CommandHandler(context0, workManagerImpl0.getConfiguration().getClock(), startStopTokens0);
        this.c = new WorkTimer(workManagerImpl0.getConfiguration().getRunnableScheduler());
        Processor processor0 = workManagerImpl0.getProcessor();
        this.d = processor0;
        TaskExecutor taskExecutor0 = workManagerImpl0.getWorkTaskExecutor();
        this.b = taskExecutor0;
        this.j = new WorkLauncherImpl(processor0, taskExecutor0);
        processor0.addExecutionListener(this);
        this.g = new ArrayList();
        this.h = null;
    }

    public static void a() {
        if(Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @MainThread
    public boolean add(@NonNull Intent intent0, int v) {
        Logger.get().debug("WM-SystemAlarmDispatche", "Adding command " + intent0 + " (" + v + ")");
        SystemAlarmDispatcher.a();
        String s = intent0.getAction();
        if(TextUtils.isEmpty(s)) {
            Logger.get().warning("WM-SystemAlarmDispatche", "Unknown command. Ignoring");
            return false;
        }
        if("ACTION_CONSTRAINTS_CHANGED".equals(s)) {
            SystemAlarmDispatcher.a();
            synchronized(this.g) {
                for(Object object0: this.g) {
                    if("ACTION_CONSTRAINTS_CHANGED".equals(((Intent)object0).getAction())) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        intent0.putExtra("KEY_START_ID", v);
        synchronized(this.g) {
            this.g.add(intent0);
            if(this.g.isEmpty()) {
                this.b();
            }
            return true;
        }
    }

    public final void b() {
        SystemAlarmDispatcher.a();
        PowerManager.WakeLock powerManager$WakeLock0 = WakeLocks.newWakeLock(this.a, "ProcessCommand");
        try {
            powerManager$WakeLock0.acquire();
            f f0 = new f(this, 1);
            this.e.getWorkTaskExecutor().executeOnTaskThread(f0);
        }
        finally {
            powerManager$WakeLock0.release();
        }
    }

    @Override  // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId0, boolean z) {
        Executor executor0 = this.b.getMainThreadExecutor();
        Intent intent0 = new Intent(this.a, SystemAlarmService.class);
        intent0.setAction("ACTION_EXECUTION_COMPLETED");
        intent0.putExtra("KEY_NEEDS_RESCHEDULE", z);
        CommandHandler.c(intent0, workGenerationalId0);
        executor0.execute(new w0(this, intent0, 0, 1));
    }
}


package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.utils.WakeLocks;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SystemAlarmService extends LifecycleService implements CommandsCompletedListener {
    public SystemAlarmDispatcher b;
    public boolean c;
    public static final String d;

    static {
        SystemAlarmService.d = "WM-SystemAlarmService";
    }

    @Override  // androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$CommandsCompletedListener
    @MainThread
    public void onAllCommandsCompleted() {
        this.c = true;
        Logger.get().debug("WM-SystemAlarmService", "All commands completed in dispatcher");
        WakeLocks.checkWakeLocks();
        this.stopSelf();
    }

    @Override  // androidx.lifecycle.LifecycleService
    public void onCreate() {
        super.onCreate();
        SystemAlarmDispatcher systemAlarmDispatcher0 = new SystemAlarmDispatcher(this);
        this.b = systemAlarmDispatcher0;
        if(systemAlarmDispatcher0.i == null) {
            systemAlarmDispatcher0.i = this;
        }
        else {
            Logger.get().error("WM-SystemAlarmDispatche", "A completion listener for SystemAlarmDispatcher already exists.");
        }
        this.c = false;
    }

    @Override  // androidx.lifecycle.LifecycleService
    public void onDestroy() {
        super.onDestroy();
        this.c = true;
        SystemAlarmDispatcher systemAlarmDispatcher0 = this.b;
        systemAlarmDispatcher0.getClass();
        Logger.get().debug("WM-SystemAlarmDispatche", "Destroying SystemAlarmDispatcher");
        systemAlarmDispatcher0.d.removeExecutionListener(systemAlarmDispatcher0);
        systemAlarmDispatcher0.i = null;
    }

    @Override  // androidx.lifecycle.LifecycleService
    public int onStartCommand(Intent intent0, int v, int v1) {
        super.onStartCommand(intent0, v, v1);
        if(this.c) {
            Logger.get().info("WM-SystemAlarmService", "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            SystemAlarmDispatcher systemAlarmDispatcher0 = this.b;
            systemAlarmDispatcher0.getClass();
            Logger.get().debug("WM-SystemAlarmDispatche", "Destroying SystemAlarmDispatcher");
            systemAlarmDispatcher0.d.removeExecutionListener(systemAlarmDispatcher0);
            systemAlarmDispatcher0.i = null;
            SystemAlarmDispatcher systemAlarmDispatcher1 = new SystemAlarmDispatcher(this);
            this.b = systemAlarmDispatcher1;
            if(systemAlarmDispatcher1.i == null) {
                systemAlarmDispatcher1.i = this;
            }
            else {
                Logger.get().error("WM-SystemAlarmDispatche", "A completion listener for SystemAlarmDispatcher already exists.");
            }
            this.c = false;
        }
        if(intent0 != null) {
            this.b.add(intent0, v1);
        }
        return 3;
    }
}


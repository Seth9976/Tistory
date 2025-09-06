package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.work.Logger;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;

public final class f implements Runnable {
    public final int a;
    public final SystemAlarmDispatcher b;

    public f(SystemAlarmDispatcher systemAlarmDispatcher0, int v) {
        this.a = v;
        this.b = systemAlarmDispatcher0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            synchronized(this.b.g) {
                this.b.h = (Intent)this.b.g.get(0);
            }
            Intent intent0 = this.b.h;
            if(intent0 != null) {
                String s = intent0.getAction();
                int v1 = this.b.h.getIntExtra("KEY_START_ID", 0);
                Logger.get().debug("WM-SystemAlarmDispatche", "Processing command " + this.b.h + ", " + v1);
                PowerManager.WakeLock powerManager$WakeLock0 = WakeLocks.newWakeLock(this.b.a, s + " (" + v1 + ")");
                try {
                    Logger.get().debug("WM-SystemAlarmDispatche", "Acquiring operation wake lock (" + s + ") " + powerManager$WakeLock0);
                    powerManager$WakeLock0.acquire();
                    this.b.f.a(this.b.h, v1, this.b);
                }
                catch(Throwable throwable0) {
                    Logger.get().error("WM-SystemAlarmDispatche", "Unexpected error in onHandleIntent", throwable0);
                }
                finally {
                    Logger.get().debug("WM-SystemAlarmDispatche", "Releasing operation wake lock (" + s + ") " + powerManager$WakeLock0);
                    powerManager$WakeLock0.release();
                    this.b.b.getMainThreadExecutor().execute(new f(this.b, 0));
                }
                return;
            }
            return;
        }
        SystemAlarmDispatcher systemAlarmDispatcher0 = this.b;
        systemAlarmDispatcher0.getClass();
        Logger.get().debug("WM-SystemAlarmDispatche", "Checking if commands are complete.");
        SystemAlarmDispatcher.a();
        synchronized(systemAlarmDispatcher0.g) {
            if(systemAlarmDispatcher0.h != null) {
                Logger.get().debug("WM-SystemAlarmDispatche", "Removing command " + systemAlarmDispatcher0.h);
                if(!((Intent)systemAlarmDispatcher0.g.remove(0)).equals(systemAlarmDispatcher0.h)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                systemAlarmDispatcher0.h = null;
            }
            SerialExecutor serialExecutor0 = systemAlarmDispatcher0.b.getSerialTaskExecutor();
            synchronized(systemAlarmDispatcher0.f.c) {
                boolean z = systemAlarmDispatcher0.f.b.isEmpty();
            }
            if(z && (systemAlarmDispatcher0.g.isEmpty() && !serialExecutor0.hasPendingTasks())) {
                Logger.get().debug("WM-SystemAlarmDispatche", "No more commands & intents.");
                SystemAlarmService systemAlarmService0 = systemAlarmDispatcher0.i;
                if(systemAlarmService0 != null) {
                    systemAlarmService0.onAllCommandsCompleted();
                }
            }
            else if(!systemAlarmDispatcher0.g.isEmpty()) {
                systemAlarmDispatcher0.b();
            }
        }
    }
}


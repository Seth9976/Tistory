package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({Scope.LIBRARY_GROUP})
public class WorkTimer {
    @RestrictTo({Scope.LIBRARY_GROUP})
    public interface TimeLimitExceededListener {
        void onTimeLimitExceeded(@NonNull WorkGenerationalId arg1);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static class WorkTimerRunnable implements Runnable {
        public final WorkTimer a;
        public final WorkGenerationalId b;

        public WorkTimerRunnable(WorkTimer workTimer0, WorkGenerationalId workGenerationalId0) {
            this.a = workTimer0;
            this.b = workGenerationalId0;
        }

        @Override
        public void run() {
            synchronized(this.a.d) {
                if(((WorkTimerRunnable)this.a.b.remove(this.b)) == null) {
                    Logger.get().debug("WrkTimerRunnable", "Timer with " + this.b + " is already marked as complete.");
                }
                else {
                    TimeLimitExceededListener workTimer$TimeLimitExceededListener0 = (TimeLimitExceededListener)this.a.c.remove(this.b);
                    if(workTimer$TimeLimitExceededListener0 != null) {
                        workTimer$TimeLimitExceededListener0.onTimeLimitExceeded(this.b);
                    }
                }
            }
        }
    }

    public final RunnableScheduler a;
    public final HashMap b;
    public final HashMap c;
    public final Object d;
    public static final String e;

    static {
        WorkTimer.e = "WM-WorkTimer";
    }

    public WorkTimer(@NonNull RunnableScheduler runnableScheduler0) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = runnableScheduler0;
    }

    @NonNull
    @VisibleForTesting
    public Map getListeners() {
        synchronized(this.d) {
        }
        return this.c;
    }

    @NonNull
    @VisibleForTesting
    public Map getTimerMap() {
        synchronized(this.d) {
        }
        return this.b;
    }

    public void startTimer(@NonNull WorkGenerationalId workGenerationalId0, long v, @NonNull TimeLimitExceededListener workTimer$TimeLimitExceededListener0) {
        synchronized(this.d) {
            Logger.get().debug("WM-WorkTimer", "Starting timer for " + workGenerationalId0);
            this.stopTimer(workGenerationalId0);
            WorkTimerRunnable workTimer$WorkTimerRunnable0 = new WorkTimerRunnable(this, workGenerationalId0);
            this.b.put(workGenerationalId0, workTimer$WorkTimerRunnable0);
            this.c.put(workGenerationalId0, workTimer$TimeLimitExceededListener0);
            this.a.scheduleWithDelay(v, workTimer$WorkTimerRunnable0);
        }
    }

    public void stopTimer(@NonNull WorkGenerationalId workGenerationalId0) {
        synchronized(this.d) {
            if(((WorkTimerRunnable)this.b.remove(workGenerationalId0)) != null) {
                Logger.get().debug("WM-WorkTimer", "Stopping timer for " + workGenerationalId0);
                this.c.remove(workGenerationalId0);
            }
        }
    }
}


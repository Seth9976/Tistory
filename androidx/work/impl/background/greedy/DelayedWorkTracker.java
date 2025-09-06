package androidx.work.impl.background.greedy;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Clock;
import androidx.work.RunnableScheduler;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import l5.a;

@RestrictTo({Scope.LIBRARY_GROUP})
public class DelayedWorkTracker {
    public final Scheduler a;
    public final RunnableScheduler b;
    public final Clock c;
    public final HashMap d;
    public static final String e;

    static {
        DelayedWorkTracker.e = "WM-DelayedWorkTracker";
    }

    public DelayedWorkTracker(@NonNull Scheduler scheduler0, @NonNull RunnableScheduler runnableScheduler0, @NonNull Clock clock0) {
        this.a = scheduler0;
        this.b = runnableScheduler0;
        this.c = clock0;
        this.d = new HashMap();
    }

    public void schedule(@NonNull WorkSpec workSpec0, long v) {
        HashMap hashMap0 = this.d;
        Runnable runnable0 = (Runnable)hashMap0.remove(workSpec0.id);
        RunnableScheduler runnableScheduler0 = this.b;
        if(runnable0 != null) {
            runnableScheduler0.cancel(runnable0);
        }
        a a0 = new a(0, this, workSpec0);
        hashMap0.put(workSpec0.id, a0);
        runnableScheduler0.scheduleWithDelay(v - this.c.currentTimeMillis(), a0);
    }

    public void unschedule(@NonNull String s) {
        Runnable runnable0 = (Runnable)this.d.remove(s);
        if(runnable0 != null) {
            this.b.cancel(runnable0);
        }
    }
}


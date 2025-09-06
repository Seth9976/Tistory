package androidx.work.impl.background.greedy;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.WorkInfo.State;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.constraints.ConstraintsState.ConstraintsMet;
import androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashMap;
import java.util.HashSet;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import l5.b;

@RestrictTo({Scope.LIBRARY_GROUP})
public class GreedyScheduler implements ExecutionListener, Scheduler, OnConstraintsStateChangedListener {
    public final Context a;
    public final HashMap b;
    public DelayedWorkTracker c;
    public boolean d;
    public final Object e;
    public final StartStopTokens f;
    public final Processor g;
    public final WorkLauncher h;
    public final Configuration i;
    public final HashMap j;
    public Boolean k;
    public final WorkConstraintsTracker l;
    public final TaskExecutor m;
    public final TimeLimiter n;
    public static final String o;

    static {
        GreedyScheduler.o = "WM-GreedyScheduler";
    }

    public GreedyScheduler(@NonNull Context context0, @NonNull Configuration configuration0, @NonNull Trackers trackers0, @NonNull Processor processor0, @NonNull WorkLauncher workLauncher0, @NonNull TaskExecutor taskExecutor0) {
        this.b = new HashMap();
        this.e = new Object();
        this.f = new StartStopTokens();
        this.j = new HashMap();
        this.a = context0;
        RunnableScheduler runnableScheduler0 = configuration0.getRunnableScheduler();
        this.c = new DelayedWorkTracker(this, runnableScheduler0, configuration0.getClock());
        this.n = new TimeLimiter(runnableScheduler0, workLauncher0);
        this.m = taskExecutor0;
        this.l = new WorkConstraintsTracker(trackers0);
        this.i = configuration0;
        this.g = processor0;
        this.h = workLauncher0;
    }

    @Override  // androidx.work.impl.Scheduler
    public void cancel(@NonNull String s) {
        if(this.k == null) {
            this.k = Boolean.valueOf(ProcessUtils.isDefaultProcess(this.a, this.i));
        }
        if(!this.k.booleanValue()) {
            Logger.get().info("WM-GreedyScheduler", "Ignoring schedule request in non-main process");
            return;
        }
        if(!this.d) {
            this.g.addExecutionListener(this);
            this.d = true;
        }
        Logger.get().debug("WM-GreedyScheduler", "Cancelling work ID " + s);
        DelayedWorkTracker delayedWorkTracker0 = this.c;
        if(delayedWorkTracker0 != null) {
            delayedWorkTracker0.unschedule(s);
        }
        for(Object object0: this.f.remove(s)) {
            this.n.cancel(((StartStopToken)object0));
            this.h.stopWork(((StartStopToken)object0));
        }
    }

    @Override  // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return false;
    }

    @Override  // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(@NonNull WorkSpec workSpec0, @NonNull ConstraintsState constraintsState0) {
        WorkGenerationalId workGenerationalId0 = WorkSpecKt.generationalId(workSpec0);
        WorkLauncher workLauncher0 = this.h;
        TimeLimiter timeLimiter0 = this.n;
        StartStopTokens startStopTokens0 = this.f;
        if(!(constraintsState0 instanceof ConstraintsMet)) {
            Logger.get().debug("WM-GreedyScheduler", "Constraints not met: Cancelling work ID " + workGenerationalId0);
            StartStopToken startStopToken1 = startStopTokens0.remove(workGenerationalId0);
            if(startStopToken1 != null) {
                timeLimiter0.cancel(startStopToken1);
                workLauncher0.stopWorkWithReason(startStopToken1, ((ConstraintsNotMet)constraintsState0).getReason());
            }
        }
        else if(!startStopTokens0.contains(workGenerationalId0)) {
            Logger.get().debug("WM-GreedyScheduler", "Constraints met: Scheduling work ID " + workGenerationalId0);
            StartStopToken startStopToken0 = startStopTokens0.tokenFor(workGenerationalId0);
            timeLimiter0.track(startStopToken0);
            workLauncher0.startWork(startStopToken0);
        }
    }

    @Override  // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId0, boolean z) {
        Job job0;
        StartStopToken startStopToken0 = this.f.remove(workGenerationalId0);
        if(startStopToken0 != null) {
            this.n.cancel(startStopToken0);
        }
        synchronized(this.e) {
            job0 = (Job)this.b.remove(workGenerationalId0);
        }
        if(job0 != null) {
            Logger.get().debug("WM-GreedyScheduler", "Stopping tracking for " + workGenerationalId0);
            job0.cancel(null);
        }
        if(!z) {
            synchronized(this.e) {
                this.j.remove(workGenerationalId0);
            }
        }
    }

    @Override  // androidx.work.impl.Scheduler
    public void schedule(@NonNull WorkSpec[] arr_workSpec) {
        long v2;
        if(this.k == null) {
            this.k = Boolean.valueOf(ProcessUtils.isDefaultProcess(this.a, this.i));
        }
        if(!this.k.booleanValue()) {
            Logger.get().info("WM-GreedyScheduler", "Ignoring schedule request in a secondary process");
            return;
        }
        if(!this.d) {
            this.g.addExecutionListener(this);
            this.d = true;
        }
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        for(int v = 0; v < arr_workSpec.length; ++v) {
            WorkSpec workSpec0 = arr_workSpec[v];
            WorkGenerationalId workGenerationalId0 = WorkSpecKt.generationalId(workSpec0);
            if(!this.f.contains(workGenerationalId0)) {
                synchronized(this.e) {
                    WorkGenerationalId workGenerationalId1 = WorkSpecKt.generationalId(workSpec0);
                    b b0 = (b)this.j.get(workGenerationalId1);
                    if(b0 == null) {
                        b0 = new b(workSpec0.runAttemptCount, this.i.getClock().currentTimeMillis());
                        this.j.put(workGenerationalId1, b0);
                    }
                    v2 = ((long)Math.max(workSpec0.runAttemptCount - b0.a - 5, 0)) * 30000L + b0.b;
                }
                long v3 = Math.max(workSpec0.calculateNextRunTime(), v2);
                long v4 = this.i.getClock().currentTimeMillis();
                if(workSpec0.state == State.ENQUEUED) {
                    if(v4 < v3) {
                        DelayedWorkTracker delayedWorkTracker0 = this.c;
                        if(delayedWorkTracker0 != null) {
                            delayedWorkTracker0.schedule(workSpec0, v3);
                        }
                    }
                    else if(!workSpec0.hasConstraints()) {
                        WorkGenerationalId workGenerationalId2 = WorkSpecKt.generationalId(workSpec0);
                        if(!this.f.contains(workGenerationalId2)) {
                            Logger.get().debug("WM-GreedyScheduler", "Starting work for " + workSpec0.id);
                            StartStopToken startStopToken0 = this.f.tokenFor(workSpec0);
                            this.n.track(startStopToken0);
                            this.h.startWork(startStopToken0);
                        }
                    }
                    else if(workSpec0.constraints.requiresDeviceIdle()) {
                        Logger.get().debug("WM-GreedyScheduler", "Ignoring " + workSpec0 + ". Requires device idle.");
                    }
                    else if(workSpec0.constraints.hasContentUriTriggers()) {
                        Logger.get().debug("WM-GreedyScheduler", "Ignoring " + workSpec0 + ". Requires ContentUri triggers.");
                    }
                    else {
                        hashSet0.add(workSpec0);
                        hashSet1.add(workSpec0.id);
                    }
                }
            }
        }
        synchronized(this.e) {
            if(!hashSet0.isEmpty()) {
                String s = TextUtils.join(",", hashSet1);
                Logger.get().debug("WM-GreedyScheduler", "Starting tracking for " + s);
                for(Object object2: hashSet0) {
                    WorkSpec workSpec1 = (WorkSpec)object2;
                    WorkGenerationalId workGenerationalId3 = WorkSpecKt.generationalId(workSpec1);
                    if(!this.b.containsKey(workGenerationalId3)) {
                        CoroutineDispatcher coroutineDispatcher0 = this.m.getTaskCoroutineDispatcher();
                        Job job0 = WorkConstraintsTrackerKt.listen(this.l, workSpec1, coroutineDispatcher0, this);
                        this.b.put(workGenerationalId3, job0);
                    }
                }
            }
        }
    }

    @VisibleForTesting
    public void setDelayedWorkTracker(@NonNull DelayedWorkTracker delayedWorkTracker0) {
        this.c = delayedWorkTracker0;
    }
}


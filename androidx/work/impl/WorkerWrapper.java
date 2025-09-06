package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.activity.m;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.core.app.o;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.InputMerger;
import androidx.work.ListenableWorker.Result.Failure;
import androidx.work.ListenableWorker.Result.Retry;
import androidx.work.ListenableWorker.Result.Success;
import androidx.work.ListenableWorker.Result;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.SynchronousExecutor;
import androidx.work.impl.utils.WorkForegroundRunnable;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@RestrictTo({Scope.LIBRARY_GROUP})
public class WorkerWrapper implements Runnable {
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static class Builder {
        public final Context a;
        public ListenableWorker b;
        public final ForegroundProcessor c;
        public final TaskExecutor d;
        public final Configuration e;
        public final WorkDatabase f;
        public final WorkSpec g;
        public final List h;
        public RuntimeExtras i;

        @SuppressLint({"LambdaLast"})
        public Builder(@NonNull Context context0, @NonNull Configuration configuration0, @NonNull TaskExecutor taskExecutor0, @NonNull ForegroundProcessor foregroundProcessor0, @NonNull WorkDatabase workDatabase0, @NonNull WorkSpec workSpec0, @NonNull List list0) {
            this.i = new RuntimeExtras();
            this.a = context0.getApplicationContext();
            this.d = taskExecutor0;
            this.c = foregroundProcessor0;
            this.e = configuration0;
            this.f = workDatabase0;
            this.g = workSpec0;
            this.h = list0;
        }

        @NonNull
        public WorkerWrapper build() {
            return new WorkerWrapper(this);
        }

        @NonNull
        public Builder withRuntimeExtras(@Nullable RuntimeExtras workerParameters$RuntimeExtras0) {
            if(workerParameters$RuntimeExtras0 != null) {
                this.i = workerParameters$RuntimeExtras0;
            }
            return this;
        }

        @NonNull
        @VisibleForTesting
        public Builder withWorker(@NonNull ListenableWorker listenableWorker0) {
            this.b = listenableWorker0;
            return this;
        }
    }

    public final Context a;
    public final String b;
    public final RuntimeExtras c;
    public final WorkSpec d;
    public ListenableWorker e;
    public final TaskExecutor f;
    public Result g;
    public final Configuration h;
    public final Clock i;
    public final ForegroundProcessor j;
    public final WorkDatabase k;
    public final WorkSpecDao l;
    public final DependencyDao m;
    public final List n;
    public String o;
    public final SettableFuture p;
    public final SettableFuture q;
    public volatile int r;
    public static final String s;

    static {
        WorkerWrapper.s = "WM-WorkerWrapper";
    }

    public WorkerWrapper(Builder workerWrapper$Builder0) {
        this.g = Result.failure();
        this.p = SettableFuture.create();
        this.q = SettableFuture.create();
        this.r = 0xFFFFFF00;
        this.a = workerWrapper$Builder0.a;
        this.f = workerWrapper$Builder0.d;
        this.j = workerWrapper$Builder0.c;
        this.d = workerWrapper$Builder0.g;
        this.b = workerWrapper$Builder0.g.id;
        this.c = workerWrapper$Builder0.i;
        this.e = workerWrapper$Builder0.b;
        this.h = workerWrapper$Builder0.e;
        this.i = workerWrapper$Builder0.e.getClock();
        this.k = workerWrapper$Builder0.f;
        this.l = workerWrapper$Builder0.f.workSpecDao();
        this.m = workerWrapper$Builder0.f.dependencyDao();
        this.n = workerWrapper$Builder0.h;
    }

    public final void a(Result listenableWorker$Result0) {
        WorkSpec workSpec0 = this.d;
        if(listenableWorker$Result0 instanceof Success) {
            Logger.get().info("WM-WorkerWrapper", "Worker result SUCCESS for " + this.o);
            if(workSpec0.isPeriodic()) {
                this.d();
                return;
            }
            DependencyDao dependencyDao0 = this.m;
            WorkSpecDao workSpecDao0 = this.l;
            WorkDatabase workDatabase0 = this.k;
            workDatabase0.beginTransaction();
            try {
                workSpecDao0.setState(State.SUCCEEDED, this.b);
                Data data0 = ((Success)this.g).getOutputData();
                workSpecDao0.setOutput(this.b, data0);
                long v1 = this.i.currentTimeMillis();
                for(Object object0: dependencyDao0.getDependentWorkIds(this.b)) {
                    String s = (String)object0;
                    if(workSpecDao0.getState(s) == State.BLOCKED && dependencyDao0.hasCompletedAllPrerequisites(s)) {
                        Logger.get().info("WM-WorkerWrapper", "Setting status to enqueued for " + s);
                        workSpecDao0.setState(State.ENQUEUED, s);
                        workSpecDao0.setLastEnqueueTime(s, v1);
                    }
                }
                workDatabase0.setTransactionSuccessful();
            }
            finally {
                workDatabase0.endTransaction();
                this.e(false);
            }
            return;
        }
        if(listenableWorker$Result0 instanceof Retry) {
            Logger.get().info("WM-WorkerWrapper", "Worker result RETRY for " + this.o);
            this.c();
            return;
        }
        Logger.get().info("WM-WorkerWrapper", "Worker result FAILURE for " + this.o);
        if(workSpec0.isPeriodic()) {
            this.d();
            return;
        }
        this.g();
    }

    public final void b() {
        if(!this.h()) {
            this.k.beginTransaction();
            try {
                State workInfo$State0 = this.l.getState(this.b);
                this.k.workProgressDao().delete(this.b);
                if(workInfo$State0 == null) {
                    this.e(false);
                }
                else if(workInfo$State0 == State.RUNNING) {
                    this.a(this.g);
                }
                this.k.setTransactionSuccessful();
            }
            finally {
                this.k.endTransaction();
            }
        }
    }

    public final void c() {
        this.k.beginTransaction();
        try {
            this.l.setState(State.ENQUEUED, this.b);
            long v1 = this.i.currentTimeMillis();
            this.l.setLastEnqueueTime(this.b, v1);
            this.l.resetWorkSpecNextScheduleTimeOverride(this.b, this.d.getNextScheduleTimeOverrideGeneration());
            this.l.markWorkSpecScheduled(this.b, -1L);
            this.k.setTransactionSuccessful();
        }
        finally {
            this.k.endTransaction();
            this.e(true);
        }
    }

    public final void d() {
        this.k.beginTransaction();
        try {
            long v1 = this.i.currentTimeMillis();
            this.l.setLastEnqueueTime(this.b, v1);
            this.l.setState(State.ENQUEUED, this.b);
            this.l.resetWorkSpecRunAttemptCount(this.b);
            this.l.resetWorkSpecNextScheduleTimeOverride(this.b, this.d.getNextScheduleTimeOverrideGeneration());
            this.l.incrementPeriodCount(this.b);
            this.l.markWorkSpecScheduled(this.b, -1L);
            this.k.setTransactionSuccessful();
        }
        finally {
            this.k.endTransaction();
            this.e(false);
        }
    }

    public final void e(boolean z) {
        this.k.beginTransaction();
        try {
            if(!this.k.workSpecDao().hasUnfinishedWork()) {
                PackageManagerHelper.setComponentEnabled(this.a, RescheduleReceiver.class, false);
            }
            if(z) {
                this.l.setState(State.ENQUEUED, this.b);
                this.l.setStopReason(this.b, this.r);
                this.l.markWorkSpecScheduled(this.b, -1L);
            }
            this.k.setTransactionSuccessful();
        }
        finally {
            this.k.endTransaction();
        }
        this.p.set(Boolean.valueOf(z));
    }

    public final void f() {
        String s = this.b;
        State workInfo$State0 = this.l.getState(s);
        if(workInfo$State0 == State.RUNNING) {
            Logger.get().debug("WM-WorkerWrapper", "Status for " + s + " is RUNNING; not doing any work and rescheduling for later execution");
            this.e(true);
            return;
        }
        Logger.get().debug("WM-WorkerWrapper", "Status for " + s + " is " + workInfo$State0 + " ; not doing any work");
        this.e(false);
    }

    public final void g() {
        WorkSpecDao workSpecDao0;
        String s = this.b;
        WorkDatabase workDatabase0 = this.k;
        workDatabase0.beginTransaction();
        try {
            LinkedList linkedList0 = new LinkedList();
            linkedList0.add(s);
            while(true) {
                workSpecDao0 = this.l;
                if(linkedList0.isEmpty()) {
                    break;
                }
                String s1 = (String)linkedList0.remove();
                if(workSpecDao0.getState(s1) != State.CANCELLED) {
                    workSpecDao0.setState(State.FAILED, s1);
                }
                linkedList0.addAll(this.m.getDependentWorkIds(s1));
            }
            Data data0 = ((Failure)this.g).getOutputData();
            workSpecDao0.resetWorkSpecNextScheduleTimeOverride(s, this.d.getNextScheduleTimeOverrideGeneration());
            workSpecDao0.setOutput(s, data0);
            workDatabase0.setTransactionSuccessful();
        }
        finally {
            workDatabase0.endTransaction();
            this.e(false);
        }
    }

    @NonNull
    public ListenableFuture getFuture() {
        return this.p;
    }

    @NonNull
    public WorkGenerationalId getWorkGenerationalId() {
        return WorkSpecKt.generationalId(this.d);
    }

    @NonNull
    public WorkSpec getWorkSpec() {
        return this.d;
    }

    public final boolean h() {
        if(this.r != 0xFFFFFF00) {
            Logger.get().debug("WM-WorkerWrapper", "Work interrupted for " + this.o);
            State workInfo$State0 = this.l.getState(this.b);
            if(workInfo$State0 == null) {
                this.e(false);
                return true;
            }
            this.e(!workInfo$State0.isFinished());
            return true;
        }
        return false;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void interrupt(int v) {
        this.r = v;
        this.h();
        this.q.cancel(true);
        if(this.e != null && this.q.isCancelled()) {
            this.e.stop(v);
            return;
        }
        Logger.get().debug("WM-WorkerWrapper", "WorkSpec " + this.d + " is already done. Not interrupting.");
    }

    @Override
    @WorkerThread
    public void run() {
        boolean z1;
        Data data0;
        StringBuilder stringBuilder0 = new StringBuilder("Work [ id=");
        String s = this.b;
        stringBuilder0.append(s);
        stringBuilder0.append(", tags={ ");
        boolean z = true;
        for(Object object0: this.n) {
            if(z) {
                z = false;
            }
            else {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((String)object0));
        }
        stringBuilder0.append(" } ]");
        this.o = stringBuilder0.toString();
        WorkSpec workSpec0 = this.d;
        if(!this.h()) {
            WorkDatabase workDatabase0 = this.k;
            workDatabase0.beginTransaction();
            try {
                State workInfo$State0 = State.ENQUEUED;
                if(workSpec0.state != workInfo$State0) {
                    this.f();
                    workDatabase0.setTransactionSuccessful();
                    Logger.get().debug("WM-WorkerWrapper", workSpec0.workerClassName + " is not in ENQUEUED state. Nothing more to do");
                    return;
                }
                if((workSpec0.isPeriodic() || workSpec0.isBackedOff()) && this.i.currentTimeMillis() < workSpec0.calculateNextRunTime()) {
                    Logger.get().debug("WM-WorkerWrapper", "Delaying execution for " + workSpec0.workerClassName + " because it is being executed before schedule.");
                    this.e(true);
                    workDatabase0.setTransactionSuccessful();
                    return;
                }
                workDatabase0.setTransactionSuccessful();
            }
            finally {
                workDatabase0.endTransaction();
            }
            WorkSpecDao workSpecDao0 = this.l;
            Configuration configuration0 = this.h;
            if(workSpec0.isPeriodic()) {
                data0 = workSpec0.input;
            }
            else {
                InputMerger inputMerger0 = configuration0.getInputMergerFactory().createInputMergerWithDefaultFallback(workSpec0.inputMergerClassName);
                if(inputMerger0 == null) {
                    Logger.get().error("WM-WorkerWrapper", "Could not create Input Merger " + workSpec0.inputMergerClassName);
                    this.g();
                    return;
                }
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(workSpec0.input);
                arrayList0.addAll(workSpecDao0.getInputsFromPrerequisites(s));
                data0 = inputMerger0.merge(arrayList0);
            }
            UUID uUID0 = UUID.fromString(s);
            int v1 = workSpec0.runAttemptCount;
            WorkProgressUpdater workProgressUpdater0 = new WorkProgressUpdater(workDatabase0, this.f);
            WorkForegroundUpdater workForegroundUpdater0 = new WorkForegroundUpdater(workDatabase0, this.j, this.f);
            TaskExecutor taskExecutor0 = this.f;
            WorkerParameters workerParameters0 = new WorkerParameters(uUID0, data0, this.n, this.c, v1, workSpec0.getGeneration(), configuration0.getExecutor(), this.f, configuration0.getWorkerFactory(), workProgressUpdater0, workForegroundUpdater0);
            if(this.e == null) {
                this.e = configuration0.getWorkerFactory().createWorkerWithDefaultFallback(this.a, workSpec0.workerClassName, workerParameters0);
            }
            ListenableWorker listenableWorker0 = this.e;
            if(listenableWorker0 == null) {
                Logger.get().error("WM-WorkerWrapper", "Could not create Worker " + workSpec0.workerClassName);
                this.g();
                return;
            }
            if(listenableWorker0.isUsed()) {
                Logger.get().error("WM-WorkerWrapper", "Received an already-used Worker " + workSpec0.workerClassName + "; Worker Factory should return new instances");
                this.g();
                return;
            }
            this.e.setUsed();
            workDatabase0.beginTransaction();
            try {
                if(workSpecDao0.getState(s) == workInfo$State0) {
                    workSpecDao0.setState(State.RUNNING, s);
                    workSpecDao0.incrementWorkSpecRunAttemptCount(s);
                    workSpecDao0.setStopReason(s, 0xFFFFFF00);
                    z1 = true;
                }
                else {
                    z1 = false;
                }
                workDatabase0.setTransactionSuccessful();
            }
            finally {
                workDatabase0.endTransaction();
            }
            if(!z1) {
                this.f();
            }
            else if(!this.h()) {
                WorkForegroundRunnable workForegroundRunnable0 = new WorkForegroundRunnable(this.a, this.d, this.e, workerParameters0.getForegroundUpdater(), this.f);
                taskExecutor0.getMainThreadExecutor().execute(workForegroundRunnable0);
                ListenableFuture listenableFuture0 = workForegroundRunnable0.getFuture();
                m m0 = new m(8, this, listenableFuture0);
                SynchronousExecutor synchronousExecutor0 = new SynchronousExecutor();
                this.q.addListener(m0, synchronousExecutor0);
                listenableFuture0.addListener(new o(this, listenableFuture0, false, 6), taskExecutor0.getMainThreadExecutor());
                androidx.work.impl.m m1 = new androidx.work.impl.m(this, this.o);
                SerialExecutor serialExecutor0 = taskExecutor0.getSerialTaskExecutor();
                this.q.addListener(m1, serialExecutor0);
            }
        }
    }
}


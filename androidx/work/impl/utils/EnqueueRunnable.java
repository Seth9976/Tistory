package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.Operation.State.FAILURE;
import androidx.work.Operation;
import androidx.work.WorkInfo.State;
import androidx.work.WorkRequest;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkSpec.IdAndState;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP})
public class EnqueueRunnable implements Runnable {
    public final WorkContinuationImpl a;
    public final OperationImpl b;
    public static final String c;

    static {
        EnqueueRunnable.c = "WM-EnqueueRunnable";
    }

    public EnqueueRunnable(@NonNull WorkContinuationImpl workContinuationImpl0) {
        this(workContinuationImpl0, new OperationImpl());
    }

    public EnqueueRunnable(@NonNull WorkContinuationImpl workContinuationImpl0, @NonNull OperationImpl operationImpl0) {
        this.a = workContinuationImpl0;
        this.b = operationImpl0;
    }

    public static boolean a(WorkContinuationImpl workContinuationImpl0) {
        Iterator iterator4;
        boolean z4;
        int v3;
        boolean z3;
        boolean z2;
        boolean z;
        List list0 = workContinuationImpl0.getParents();
        if(list0 == null) {
            z = false;
        }
        else {
            z = false;
            for(Object object0: list0) {
                WorkContinuationImpl workContinuationImpl1 = (WorkContinuationImpl)object0;
                if(workContinuationImpl1.isEnqueued()) {
                    Logger.get().warning("WM-EnqueueRunnable", "Already enqueued work ids (" + TextUtils.join(", ", workContinuationImpl1.getIds()) + ")");
                }
                else {
                    z |= EnqueueRunnable.a(workContinuationImpl1);
                }
            }
        }
        WorkManagerImpl workManagerImpl0 = workContinuationImpl0.getWorkManagerImpl();
        List list1 = workContinuationImpl0.getWork();
        String[] arr_s = (String[])WorkContinuationImpl.prerequisitesFor(workContinuationImpl0).toArray(new String[0]);
        String s = workContinuationImpl0.getName();
        ExistingWorkPolicy existingWorkPolicy0 = workContinuationImpl0.getExistingWorkPolicy();
        long v = workManagerImpl0.getConfiguration().getClock().currentTimeMillis();
        WorkDatabase workDatabase0 = workManagerImpl0.getWorkDatabase();
        boolean z1 = arr_s != null && arr_s.length > 0;
        if(z1) {
            int v1 = arr_s.length;
            z2 = false;
            z3 = false;
            v3 = 1;
            for(int v2 = 0; v2 < v1; ++v2) {
                String s1 = arr_s[v2];
                WorkSpec workSpec0 = workDatabase0.workSpecDao().getWorkSpec(s1);
                if(workSpec0 == null) {
                    Logger.get().error("WM-EnqueueRunnable", "Prerequisite " + s1 + " doesn\'t exist; not enqueuing");
                    z4 = false;
                    workContinuationImpl0.markEnqueued();
                    return z | z4;
                }
                State workInfo$State0 = workSpec0.state;
                v3 &= (workInfo$State0 == State.SUCCEEDED ? 1 : 0);
                if(workInfo$State0 == State.FAILED) {
                    z3 = true;
                }
                else if(workInfo$State0 == State.CANCELLED) {
                    z2 = true;
                }
            }
        }
        else {
            v3 = 1;
            z2 = false;
            z3 = false;
        }
        boolean z5 = TextUtils.isEmpty(s);
        if(z5 || z1) {
            z4 = false;
        }
        else {
            List list2 = workDatabase0.workSpecDao().getWorkSpecIdAndStatesForName(s);
            if(list2.isEmpty()) {
                z4 = false;
            }
            else if(existingWorkPolicy0 != ExistingWorkPolicy.APPEND && existingWorkPolicy0 != ExistingWorkPolicy.APPEND_OR_REPLACE) {
                if(existingWorkPolicy0 == ExistingWorkPolicy.KEEP) {
                    for(Object object1: list2) {
                        State workInfo$State1 = ((IdAndState)object1).state;
                        if(workInfo$State1 != State.ENQUEUED && workInfo$State1 != State.RUNNING) {
                            continue;
                        }
                        z4 = false;
                        workContinuationImpl0.markEnqueued();
                        return z | z4;
                    }
                }
                CancelWorkRunnable.forName(s, workManagerImpl0, false).run();
                WorkSpecDao workSpecDao0 = workDatabase0.workSpecDao();
                for(Object object2: list2) {
                    workSpecDao0.delete(((IdAndState)object2).id);
                }
                z4 = true;
            }
            else {
                DependencyDao dependencyDao0 = workDatabase0.dependencyDao();
                List list3 = new ArrayList();
                for(Iterator iterator3 = list2.iterator(); iterator3.hasNext(); iterator3 = iterator4) {
                    Object object3 = iterator3.next();
                    IdAndState workSpec$IdAndState0 = (IdAndState)object3;
                    if(dependencyDao0.hasDependents(workSpec$IdAndState0.id)) {
                        iterator4 = iterator3;
                    }
                    else {
                        State workInfo$State2 = workSpec$IdAndState0.state;
                        iterator4 = iterator3;
                        int v4 = workInfo$State2 == State.SUCCEEDED ? 1 : 0;
                        if(workInfo$State2 == State.FAILED) {
                            z3 = true;
                        }
                        else if(workInfo$State2 == State.CANCELLED) {
                            z2 = true;
                        }
                        ((ArrayList)list3).add(workSpec$IdAndState0.id);
                        v3 &= v4;
                    }
                }
                if(existingWorkPolicy0 == ExistingWorkPolicy.APPEND_OR_REPLACE && (z2 || z3)) {
                    WorkSpecDao workSpecDao1 = workDatabase0.workSpecDao();
                    for(Object object4: workSpecDao1.getWorkSpecIdAndStatesForName(s)) {
                        workSpecDao1.delete(((IdAndState)object4).id);
                    }
                    list3 = Collections.emptyList();
                    z2 = false;
                    z3 = false;
                }
                arr_s = (String[])list3.toArray(arr_s);
                z1 = arr_s.length > 0;
                z4 = false;
            }
        }
        for(Object object5: list1) {
            WorkRequest workRequest0 = (WorkRequest)object5;
            WorkSpec workSpec1 = workRequest0.getWorkSpec();
            if(!z1 || v3 != 0) {
                workSpec1.lastEnqueueTime = v;
            }
            else if(z3) {
                workSpec1.state = State.FAILED;
            }
            else if(z2) {
                workSpec1.state = State.CANCELLED;
            }
            else {
                workSpec1.state = State.BLOCKED;
            }
            if(workSpec1.state == State.ENQUEUED) {
                z4 = true;
            }
            workDatabase0.workSpecDao().insertWorkSpec(EnqueueUtilsKt.wrapInConstraintTrackingWorkerIfNeeded(workManagerImpl0.getSchedulers(), workSpec1));
            if(z1) {
                for(int v5 = 0; v5 < arr_s.length; ++v5) {
                    String s2 = arr_s[v5];
                    Dependency dependency0 = new Dependency(workRequest0.getStringId(), s2);
                    workDatabase0.dependencyDao().insertDependency(dependency0);
                }
            }
            workDatabase0.workTagDao().insertTags(workRequest0.getStringId(), workRequest0.getTags());
            if(!z5) {
                workDatabase0.workNameDao().insert(new WorkName(s, workRequest0.getStringId()));
            }
        }
        workContinuationImpl0.markEnqueued();
        return z | z4;
    }

    @VisibleForTesting
    public boolean addToDatabase() {
        WorkManagerImpl workManagerImpl0 = this.a.getWorkManagerImpl();
        WorkDatabase workDatabase0 = workManagerImpl0.getWorkDatabase();
        workDatabase0.beginTransaction();
        try {
            EnqueueUtilsKt.checkContentUriTriggerWorkerLimits(workDatabase0, workManagerImpl0.getConfiguration(), this.a);
            boolean z = EnqueueRunnable.a(this.a);
            workDatabase0.setTransactionSuccessful();
            return z;
        }
        finally {
            workDatabase0.endTransaction();
        }
    }

    @NonNull
    public Operation getOperation() {
        return this.b;
    }

    @Override
    public void run() {
        OperationImpl operationImpl0;
        try {
            operationImpl0 = this.b;
            WorkContinuationImpl workContinuationImpl0 = this.a;
            if(workContinuationImpl0.hasCycles()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + workContinuationImpl0 + ")");
            }
            if(this.addToDatabase()) {
                PackageManagerHelper.setComponentEnabled(workContinuationImpl0.getWorkManagerImpl().getApplicationContext(), RescheduleReceiver.class, true);
                this.scheduleWorkInBackground();
            }
            operationImpl0.markState(Operation.SUCCESS);
            return;
        }
        catch(Throwable throwable0) {
        }
        operationImpl0.markState(new FAILURE(throwable0));
    }

    @VisibleForTesting
    public void scheduleWorkInBackground() {
        WorkManagerImpl workManagerImpl0 = this.a.getWorkManagerImpl();
        Schedulers.schedule(workManagerImpl0.getConfiguration(), workManagerImpl0.getWorkDatabase(), workManagerImpl0.getSchedulers());
    }
}


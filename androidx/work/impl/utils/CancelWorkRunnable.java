package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Operation.State.FAILURE;
import androidx.work.Operation;
import androidx.work.WorkInfo.State;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import java.util.LinkedList;
import java.util.UUID;

@RestrictTo({Scope.LIBRARY_GROUP})
public abstract class CancelWorkRunnable implements Runnable {
    public final OperationImpl a;

    public CancelWorkRunnable() {
        this.a = new OperationImpl();
    }

    public static void a(WorkManagerImpl workManagerImpl0, String s) {
        WorkDatabase workDatabase0 = workManagerImpl0.getWorkDatabase();
        WorkSpecDao workSpecDao0 = workDatabase0.workSpecDao();
        DependencyDao dependencyDao0 = workDatabase0.dependencyDao();
        LinkedList linkedList0 = new LinkedList();
        linkedList0.add(s);
        while(!linkedList0.isEmpty()) {
            String s1 = (String)linkedList0.remove();
            State workInfo$State0 = workSpecDao0.getState(s1);
            if(workInfo$State0 != State.SUCCEEDED && workInfo$State0 != State.FAILED) {
                workSpecDao0.setCancelledState(s1);
            }
            linkedList0.addAll(dependencyDao0.getDependentWorkIds(s1));
        }
        workManagerImpl0.getProcessor().stopAndCancelWork(s, 1);
        for(Object object0: workManagerImpl0.getSchedulers()) {
            ((Scheduler)object0).cancel(s);
        }
    }

    public abstract void b();

    @NonNull
    public static CancelWorkRunnable forAll(@NonNull WorkManagerImpl workManagerImpl0) {
        return new d(workManagerImpl0);
    }

    @NonNull
    public static CancelWorkRunnable forId(@NonNull UUID uUID0, @NonNull WorkManagerImpl workManagerImpl0) {
        return new b(workManagerImpl0, uUID0, 0);
    }

    @NonNull
    public static CancelWorkRunnable forName(@NonNull String s, @NonNull WorkManagerImpl workManagerImpl0, boolean z) {
        return new c(s, workManagerImpl0, z);
    }

    @NonNull
    public static CancelWorkRunnable forTag(@NonNull String s, @NonNull WorkManagerImpl workManagerImpl0) {
        return new b(workManagerImpl0, s, 1);
    }

    @NonNull
    public Operation getOperation() {
        return this.a;
    }

    @Override
    public void run() {
        OperationImpl operationImpl0;
        try {
            operationImpl0 = this.a;
            this.b();
            operationImpl0.markState(Operation.SUCCESS);
        }
        catch(Throwable throwable0) {
            operationImpl0.markState(new FAILURE(throwable0));
        }
    }
}


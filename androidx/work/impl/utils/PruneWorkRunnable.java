package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Operation.State.FAILURE;
import androidx.work.Operation;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.WorkManagerImpl;

@RestrictTo({Scope.LIBRARY_GROUP})
public class PruneWorkRunnable implements Runnable {
    public final WorkManagerImpl a;
    public final OperationImpl b;

    public PruneWorkRunnable(@NonNull WorkManagerImpl workManagerImpl0) {
        this.a = workManagerImpl0;
        this.b = new OperationImpl();
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
            this.a.getWorkDatabase().workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
            operationImpl0.markState(Operation.SUCCESS);
        }
        catch(Throwable throwable0) {
            operationImpl0.markState(new FAILURE(throwable0));
        }
    }
}


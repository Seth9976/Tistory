package androidx.work.impl;

import a5.b;
import androidx.activity.g0;
import androidx.work.Configuration;
import androidx.work.Operation.State.FAILURE;
import androidx.work.Operation;
import androidx.work.WorkInfo.State;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec.IdAndState;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class j implements Runnable {
    public final WorkManagerImpl a;
    public final String b;
    public final OperationImpl c;
    public final g0 d;
    public final WorkRequest e;

    public j(WorkManagerImpl workManagerImpl0, String s, OperationImpl operationImpl0, g0 g00, WorkRequest workRequest0) {
        this.a = workManagerImpl0;
        this.b = s;
        this.c = operationImpl0;
        this.d = g00;
        this.e = workRequest0;
    }

    @Override
    public final void run() {
        WorkManagerImpl workManagerImpl0 = this.a;
        Intrinsics.checkNotNullParameter(workManagerImpl0, "$this_enqueueUniquelyNamedPeriodic");
        String s = this.b;
        Intrinsics.checkNotNullParameter(s, "$name");
        OperationImpl operationImpl0 = this.c;
        Intrinsics.checkNotNullParameter(operationImpl0, "$operation");
        g0 g00 = this.d;
        Intrinsics.checkNotNullParameter(g00, "$enqueueNew");
        WorkRequest workRequest0 = this.e;
        Intrinsics.checkNotNullParameter(workRequest0, "$workRequest");
        WorkSpecDao workSpecDao0 = workManagerImpl0.getWorkDatabase().workSpecDao();
        List list0 = workSpecDao0.getWorkSpecIdAndStatesForName(s);
        if(list0.size() > 1) {
            operationImpl0.markState(new FAILURE(new UnsupportedOperationException("Can\'t apply UPDATE policy to the chains of work.")));
            return;
        }
        IdAndState workSpec$IdAndState0 = (IdAndState)CollectionsKt___CollectionsKt.firstOrNull(list0);
        if(workSpec$IdAndState0 == null) {
            g00.invoke();
            return;
        }
        WorkSpec workSpec0 = workSpecDao0.getWorkSpec(workSpec$IdAndState0.id);
        if(workSpec0 == null) {
            operationImpl0.markState(new FAILURE(new IllegalStateException(b.r(new StringBuilder("WorkSpec with "), workSpec$IdAndState0.id, ", that matches a name \"", s, "\", wasn\'t found"))));
            return;
        }
        if(!workSpec0.isPeriodic()) {
            operationImpl0.markState(new FAILURE(new UnsupportedOperationException("Can\'t update OneTimeWorker to Periodic Worker. Update operation must preserve worker\'s type.")));
            return;
        }
        if(workSpec$IdAndState0.state == State.CANCELLED) {
            workSpecDao0.delete(workSpec$IdAndState0.id);
            g00.invoke();
            return;
        }
        WorkSpec workSpec1 = WorkSpec.copy$default(workRequest0.getWorkSpec(), workSpec$IdAndState0.id, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 0x7FFFFE, null);
        try {
            Processor processor0 = workManagerImpl0.getProcessor();
            Intrinsics.checkNotNullExpressionValue(processor0, "processor");
            WorkDatabase workDatabase0 = workManagerImpl0.getWorkDatabase();
            Intrinsics.checkNotNullExpressionValue(workDatabase0, "workDatabase");
            Configuration configuration0 = workManagerImpl0.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration0, "configuration");
            List list1 = workManagerImpl0.getSchedulers();
            Intrinsics.checkNotNullExpressionValue(list1, "schedulers");
            WorkerUpdater.a(processor0, workDatabase0, configuration0, list1, workSpec1, workRequest0.getTags());
            operationImpl0.markState(Operation.SUCCESS);
        }
        catch(Throwable throwable0) {
            operationImpl0.markState(new FAILURE(throwable0));
        }
    }
}


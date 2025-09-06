package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.List;
import java.util.concurrent.Executor;

@RestrictTo({Scope.LIBRARY_GROUP})
public class Schedulers {
    public static final String GCM_SCHEDULER = "androidx.work.impl.background.gcm.GcmScheduler";
    public static final String a;

    static {
        Schedulers.a = "WM-Schedulers";
    }

    public static void a(WorkSpecDao workSpecDao0, Clock clock0, List list0) {
        if(list0.size() > 0) {
            long v = clock0.currentTimeMillis();
            for(Object object0: list0) {
                workSpecDao0.markWorkSpecScheduled(((WorkSpec)object0).id, v);
            }
        }
    }

    public static void registerRescheduling(@NonNull List list0, @NonNull Processor processor0, @NonNull Executor executor0, @NonNull WorkDatabase workDatabase0, @NonNull Configuration configuration0) {
        processor0.addExecutionListener(new b(executor0, list0, configuration0, workDatabase0));
    }

    public static void schedule(@NonNull Configuration configuration0, @NonNull WorkDatabase workDatabase0, @Nullable List list0) {
        List list3;
        List list2;
        if(list0 != null && list0.size() != 0) {
            WorkSpecDao workSpecDao0 = workDatabase0.workSpecDao();
            workDatabase0.beginTransaction();
            try {
                List list1 = workSpecDao0.getEligibleWorkForSchedulingWithContentUris();
                Schedulers.a(workSpecDao0, configuration0.getClock(), list1);
                list2 = workSpecDao0.getEligibleWorkForScheduling(configuration0.getMaxSchedulerLimit());
                Schedulers.a(workSpecDao0, configuration0.getClock(), list2);
                list2.addAll(list1);
                list3 = workSpecDao0.getAllEligibleWorkSpecsForScheduling(200);
                workDatabase0.setTransactionSuccessful();
            }
            finally {
                workDatabase0.endTransaction();
            }
            if(list2.size() > 0) {
                WorkSpec[] arr_workSpec = (WorkSpec[])list2.toArray(new WorkSpec[list2.size()]);
                for(Object object0: list0) {
                    Scheduler scheduler0 = (Scheduler)object0;
                    if(scheduler0.hasLimitedSchedulingSlots()) {
                        scheduler0.schedule(arr_workSpec);
                    }
                }
            }
            if(list3.size() > 0) {
                WorkSpec[] arr_workSpec1 = (WorkSpec[])list3.toArray(new WorkSpec[list3.size()]);
                for(Object object1: list0) {
                    Scheduler scheduler1 = (Scheduler)object1;
                    if(!scheduler1.hasLimitedSchedulingSlots()) {
                        scheduler1.schedule(arr_workSpec1);
                    }
                }
            }
        }
    }
}


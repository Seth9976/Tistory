package androidx.work.impl;

import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.utils.EnqueueUtilsKt;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class k implements Runnable {
    public final WorkDatabase a;
    public final WorkSpec b;
    public final WorkSpec c;
    public final List d;
    public final String e;
    public final Set f;
    public final boolean g;

    public k(WorkDatabase workDatabase0, WorkSpec workSpec0, WorkSpec workSpec1, List list0, String s, Set set0, boolean z) {
        this.a = workDatabase0;
        this.b = workSpec0;
        this.c = workSpec1;
        this.d = list0;
        this.e = s;
        this.f = set0;
        this.g = z;
    }

    @Override
    public final void run() {
        WorkDatabase workDatabase0 = this.a;
        Intrinsics.checkNotNullParameter(workDatabase0, "$workDatabase");
        Intrinsics.checkNotNullParameter(this.b, "$oldWorkSpec");
        Intrinsics.checkNotNullParameter(this.c, "$newWorkSpec");
        Intrinsics.checkNotNullParameter(this.d, "$schedulers");
        Intrinsics.checkNotNullParameter(this.e, "$workSpecId");
        Intrinsics.checkNotNullParameter(this.f, "$tags");
        WorkSpecDao workSpecDao0 = workDatabase0.workSpecDao();
        WorkTagDao workTagDao0 = workDatabase0.workTagDao();
        Set set0 = this.f;
        List list0 = this.d;
        String s = this.e;
        WorkSpec workSpec0 = this.c;
        WorkSpec workSpec1 = WorkSpec.copy$default(this.c, null, this.b.state, null, null, null, null, 0L, 0L, 0L, null, this.b.runAttemptCount, null, 0L, this.b.lastEnqueueTime, 0L, 0L, false, null, this.b.getPeriodCount(), this.b.getGeneration() + 1, this.b.getNextScheduleTimeOverride(), this.b.getNextScheduleTimeOverrideGeneration(), 0, 0x43DBFD, null);
        if(workSpec0.getNextScheduleTimeOverrideGeneration() == 1) {
            workSpec1.setNextScheduleTimeOverride(workSpec0.getNextScheduleTimeOverride());
            workSpec1.setNextScheduleTimeOverrideGeneration(workSpec1.getNextScheduleTimeOverrideGeneration() + 1);
        }
        workSpecDao0.updateWorkSpec(EnqueueUtilsKt.wrapInConstraintTrackingWorkerIfNeeded(list0, workSpec1));
        workTagDao0.deleteByWorkSpecId(s);
        workTagDao0.insertTags(s, set0);
        if(!this.g) {
            workSpecDao0.markWorkSpecScheduled(s, -1L);
            workDatabase0.workProgressDao().delete(s);
        }
    }
}


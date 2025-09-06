package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\t\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000B\u001A\u00020\u0006¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/work/impl/utils/IdGenerator;", "", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "<init>", "(Landroidx/work/impl/WorkDatabase;)V", "", "minInclusive", "maxInclusive", "nextJobSchedulerIdWithRange", "(II)I", "nextAlarmManagerId", "()I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class IdGenerator {
    public final WorkDatabase a;

    public IdGenerator(@NotNull WorkDatabase workDatabase0) {
        Intrinsics.checkNotNullParameter(workDatabase0, "workDatabase");
        super();
        this.a = workDatabase0;
    }

    public final int nextAlarmManagerId() {
        e e0 = new e(this, 0);
        Object object0 = this.a.runInTransaction(e0);
        Intrinsics.checkNotNullExpressionValue(object0, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number)object0).intValue();
    }

    public final int nextJobSchedulerIdWithRange(int v, int v1) {
        f f0 = new f(this, v, v1);
        Object object0 = this.a.runInTransaction(f0);
        Intrinsics.checkNotNullExpressionValue(object0, "workDatabase.runInTransa…            id\n        })");
        return ((Number)object0).intValue();
    }
}


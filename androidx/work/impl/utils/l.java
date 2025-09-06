package androidx.work.impl.utils;

import androidx.work.WorkQuery;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import java.util.List;

public final class l extends StatusRunnable {
    public final WorkManagerImpl b;
    public final WorkQuery c;

    public l(WorkManagerImpl workManagerImpl0, WorkQuery workQuery0) {
        this.b = workManagerImpl0;
        this.c = workQuery0;
        super();
    }

    @Override  // androidx.work.impl.utils.StatusRunnable
    public final Object a() {
        List list0 = this.b.getWorkDatabase().rawWorkInfoDao().getWorkInfoPojos(RawQueries.toRawQuery(this.c));
        return (List)WorkSpec.WORK_INFO_MAPPER.apply(list0);
    }
}


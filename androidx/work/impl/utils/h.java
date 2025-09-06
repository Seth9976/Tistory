package androidx.work.impl.utils;

import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import java.util.List;

public final class h extends StatusRunnable {
    public final WorkManagerImpl b;
    public final List c;

    public h(WorkManagerImpl workManagerImpl0, List list0) {
        this.b = workManagerImpl0;
        this.c = list0;
        super();
    }

    @Override  // androidx.work.impl.utils.StatusRunnable
    public final Object a() {
        List list0 = this.b.getWorkDatabase().workSpecDao().getWorkStatusPojoForIds(this.c);
        return (List)WorkSpec.WORK_INFO_MAPPER.apply(list0);
    }
}


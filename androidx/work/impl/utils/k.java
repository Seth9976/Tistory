package androidx.work.impl.utils;

import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import java.util.List;

public final class k extends StatusRunnable {
    public final WorkManagerImpl b;
    public final String c;

    public k(WorkManagerImpl workManagerImpl0, String s) {
        this.b = workManagerImpl0;
        this.c = s;
        super();
    }

    @Override  // androidx.work.impl.utils.StatusRunnable
    public final Object a() {
        List list0 = this.b.getWorkDatabase().workSpecDao().getWorkStatusPojoForName(this.c);
        return (List)WorkSpec.WORK_INFO_MAPPER.apply(list0);
    }
}


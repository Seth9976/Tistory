package androidx.work.impl.utils;

import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec.WorkInfoPojo;
import java.util.UUID;

public final class i extends StatusRunnable {
    public final WorkManagerImpl b;
    public final UUID c;

    public i(WorkManagerImpl workManagerImpl0, UUID uUID0) {
        this.b = workManagerImpl0;
        this.c = uUID0;
        super();
    }

    @Override  // androidx.work.impl.utils.StatusRunnable
    public final Object a() {
        WorkInfoPojo workSpec$WorkInfoPojo0 = this.b.getWorkDatabase().workSpecDao().getWorkStatusPojoForId(this.c.toString());
        return workSpec$WorkInfoPojo0 != null ? workSpec$WorkInfoPojo0.toWorkInfo() : null;
    }
}


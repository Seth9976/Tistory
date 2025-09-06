package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;

public final class d extends CancelWorkRunnable {
    public final WorkManagerImpl b;

    public d(WorkManagerImpl workManagerImpl0) {
        this.b = workManagerImpl0;
        super();
    }

    @Override  // androidx.work.impl.utils.CancelWorkRunnable
    public final void b() {
        WorkManagerImpl workManagerImpl0 = this.b;
        WorkDatabase workDatabase0 = workManagerImpl0.getWorkDatabase();
        workDatabase0.beginTransaction();
        try {
            for(Object object0: workDatabase0.workSpecDao().getAllUnfinishedWork()) {
                CancelWorkRunnable.a(workManagerImpl0, ((String)object0));
            }
            new PreferenceUtils(workManagerImpl0.getWorkDatabase()).setLastCancelAllTimeMillis(workManagerImpl0.getConfiguration().getClock().currentTimeMillis());
            workDatabase0.setTransactionSuccessful();
        }
        finally {
            workDatabase0.endTransaction();
        }
    }
}


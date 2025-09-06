package androidx.work.impl.utils;

import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;

public final class c extends CancelWorkRunnable {
    public final WorkManagerImpl b;
    public final String c;
    public final boolean d;

    public c(String s, WorkManagerImpl workManagerImpl0, boolean z) {
        this.b = workManagerImpl0;
        this.c = s;
        this.d = z;
        super();
    }

    @Override  // androidx.work.impl.utils.CancelWorkRunnable
    public final void b() {
        WorkManagerImpl workManagerImpl0 = this.b;
        WorkDatabase workDatabase0 = workManagerImpl0.getWorkDatabase();
        workDatabase0.beginTransaction();
        try {
            for(Object object0: workDatabase0.workSpecDao().getUnfinishedWorkWithName(this.c)) {
                CancelWorkRunnable.a(workManagerImpl0, ((String)object0));
            }
            workDatabase0.setTransactionSuccessful();
        }
        finally {
            workDatabase0.endTransaction();
        }
        if(this.d) {
            Schedulers.schedule(workManagerImpl0.getConfiguration(), workManagerImpl0.getWorkDatabase(), workManagerImpl0.getSchedulers());
        }
    }
}


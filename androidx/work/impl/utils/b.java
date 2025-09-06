package androidx.work.impl.utils;

import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import java.util.UUID;

public final class b extends CancelWorkRunnable {
    public final int b;
    public final WorkManagerImpl c;
    public final Object d;

    public b(WorkManagerImpl workManagerImpl0, Object object0, int v) {
        this.b = v;
        this.c = workManagerImpl0;
        this.d = object0;
        super();
    }

    @Override  // androidx.work.impl.utils.CancelWorkRunnable
    public final void b() {
        if(this.b != 0) {
            WorkManagerImpl workManagerImpl0 = this.c;
            WorkDatabase workDatabase0 = workManagerImpl0.getWorkDatabase();
            workDatabase0.beginTransaction();
            try {
                for(Object object0: workDatabase0.workSpecDao().getUnfinishedWorkWithTag(((String)this.d))) {
                    CancelWorkRunnable.a(workManagerImpl0, ((String)object0));
                }
                workDatabase0.setTransactionSuccessful();
            }
            finally {
                workDatabase0.endTransaction();
            }
            Schedulers.schedule(workManagerImpl0.getConfiguration(), workManagerImpl0.getWorkDatabase(), workManagerImpl0.getSchedulers());
            return;
        }
        WorkDatabase workDatabase1 = this.c.getWorkDatabase();
        workDatabase1.beginTransaction();
        try {
            CancelWorkRunnable.a(this.c, ((UUID)this.d).toString());
            workDatabase1.setTransactionSuccessful();
        }
        finally {
            workDatabase1.endTransaction();
        }
        Schedulers.schedule(this.c.getConfiguration(), this.c.getWorkDatabase(), this.c.getSchedulers());
    }
}


package e;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.Callable;
import kotlin.Unit;

public final class l implements Callable {
    public final long a;
    public final p b;

    public l(p p0, long v) {
        this.b = p0;
        this.a = v;
        super();
    }

    @Override
    public final Object call() {
        SupportSQLiteStatement supportSQLiteStatement0 = this.b.c.acquire();
        supportSQLiteStatement0.bindLong(1, this.a);
        try {
            this.b.a.beginTransaction();
            try {
                supportSQLiteStatement0.executeUpdateDelete();
                this.b.a.setTransactionSuccessful();
            }
            catch(Throwable throwable0) {
                this.b.a.endTransaction();
                throw throwable0;
            }
            this.b.a.endTransaction();
            return Unit.INSTANCE;
        }
        finally {
            this.b.c.release(supportSQLiteStatement0);
        }
    }
}


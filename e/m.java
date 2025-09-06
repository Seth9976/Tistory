package e;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.Callable;
import kotlin.Unit;

public final class m implements Callable {
    public final String a;
    public final long b;
    public final int c;
    public final p d;

    public m(p p0, String s, long v, int v1) {
        this.d = p0;
        this.a = s;
        this.b = v;
        this.c = v1;
        super();
    }

    @Override
    public final Object call() {
        SupportSQLiteStatement supportSQLiteStatement0 = this.d.d.acquire();
        supportSQLiteStatement0.bindString(1, this.a);
        supportSQLiteStatement0.bindLong(2, this.b);
        supportSQLiteStatement0.bindLong(3, ((long)this.c));
        try {
            this.d.a.beginTransaction();
            try {
                supportSQLiteStatement0.executeUpdateDelete();
                this.d.a.setTransactionSuccessful();
            }
            catch(Throwable throwable0) {
                this.d.a.endTransaction();
                throw throwable0;
            }
            this.d.a.endTransaction();
            return Unit.INSTANCE;
        }
        finally {
            this.d.d.release(supportSQLiteStatement0);
        }
    }
}


package e;

import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

public final class o implements Callable {
    public final List a;
    public final p b;

    public o(p p0, List list0) {
        this.b = p0;
        this.a = list0;
        super();
    }

    @Override
    public final Object call() {
        StringBuilder stringBuilder0 = StringUtil.newStringBuilder();
        stringBuilder0.append("DELETE FROM history WHERE uri in (");
        StringUtil.appendPlaceholders(stringBuilder0, this.a.size());
        stringBuilder0.append(")");
        SupportSQLiteStatement supportSQLiteStatement0 = this.b.a.compileStatement(stringBuilder0.toString());
        int v = 1;
        for(Object object0: this.a) {
            supportSQLiteStatement0.bindString(v, ((String)object0));
            ++v;
        }
        this.b.a.beginTransaction();
        try {
            supportSQLiteStatement0.executeUpdateDelete();
            this.b.a.setTransactionSuccessful();
            return Unit.INSTANCE;
        }
        finally {
            this.b.a.endTransaction();
        }
    }
}


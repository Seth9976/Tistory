package b5;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

public final class c implements DatabaseErrorHandler {
    public final Callback a;
    public final b b;

    public c(Callback supportSQLiteOpenHelper$Callback0, b b0) {
        this.a = supportSQLiteOpenHelper$Callback0;
        this.b = b0;
    }

    @Override  // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(this.a, "$callback");
        Intrinsics.checkNotNullParameter(this.b, "$dbRef");
        Intrinsics.checkNotNullExpressionValue(sQLiteDatabase0, "dbObj");
        FrameworkSQLiteDatabase frameworkSQLiteDatabase0 = e.h.getWrappedDb(this.b, sQLiteDatabase0);
        this.a.onCorruption(frameworkSQLiteDatabase0);
    }
}


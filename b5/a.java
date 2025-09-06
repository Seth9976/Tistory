package b5;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.compose.foundation.text.selection.a1;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.framework.FrameworkSQLiteProgram;
import kotlin.jvm.internal.Intrinsics;

public final class a implements SQLiteDatabase.CursorFactory {
    public final int a;
    public final Object b;

    public a(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.database.sqlite.SQLiteDatabase$CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) {
        Object object0 = this.b;
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(((a1)object0), "$tmp0");
            return (Cursor)((a1)object0).invoke(sQLiteDatabase0, sQLiteCursorDriver0, s, sQLiteQuery0);
        }
        Intrinsics.checkNotNullParameter(((SupportSQLiteQuery)object0), "$query");
        Intrinsics.checkNotNull(sQLiteQuery0);
        ((SupportSQLiteQuery)object0).bindTo(new FrameworkSQLiteProgram(sQLiteQuery0));
        return new SQLiteCursor(sQLiteCursorDriver0, s, sQLiteQuery0);
    }
}


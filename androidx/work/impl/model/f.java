package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class f implements Callable {
    public final int a;
    public final RoomSQLiteQuery b;
    public final WorkSpecDao_Impl c;

    public f(WorkSpecDao_Impl workSpecDao_Impl0, RoomSQLiteQuery roomSQLiteQuery0, int v) {
        this.a = v;
        this.c = workSpecDao_Impl0;
        this.b = roomSQLiteQuery0;
        super();
    }

    @Override
    public final Object call() {
        if(this.a != 0) {
            try(Cursor cursor0 = DBUtil.query(this.c.a, this.b, false, null)) {
                return cursor0.moveToFirst() ? cursor0.getLong(0) : 0L;
            }
        }
        RoomDatabase roomDatabase0 = this.c.a;
        this.c.a.beginTransaction();
        try {
            Cursor cursor1 = DBUtil.query(roomDatabase0, this.b, false, null);
            try {
                ArrayList arrayList0 = new ArrayList(cursor1.getCount());
                while(cursor1.moveToNext()) {
                    arrayList0.add((cursor1.isNull(0) ? null : cursor1.getString(0)));
                }
                roomDatabase0.setTransactionSuccessful();
                return arrayList0;
            }
            finally {
                cursor1.close();
            }
        }
        finally {
            roomDatabase0.endTransaction();
        }
    }

    @Override
    public final void finalize() {
        if(this.a != 0) {
            this.b.release();
            return;
        }
        this.b.release();
    }
}


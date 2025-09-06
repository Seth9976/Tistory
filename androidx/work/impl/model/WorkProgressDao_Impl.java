package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Data;
import java.util.Collections;
import java.util.List;

public final class WorkProgressDao_Impl implements WorkProgressDao {
    public final RoomDatabase a;
    public final a b;
    public final e c;
    public final e d;

    public WorkProgressDao_Impl(RoomDatabase roomDatabase0) {
        this.a = roomDatabase0;
        this.b = new a(roomDatabase0, 4);
        this.c = new e(roomDatabase0, 2);
        this.d = new e(roomDatabase0, 3);
    }

    @Override  // androidx.work.impl.model.WorkProgressDao
    public void delete(String s) {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.c;
        SupportSQLiteStatement supportSQLiteStatement0 = e0.acquire();
        if(s == null) {
            supportSQLiteStatement0.bindNull(1);
        }
        else {
            supportSQLiteStatement0.bindString(1, s);
        }
        roomDatabase0.beginTransaction();
        try {
            supportSQLiteStatement0.executeUpdateDelete();
            roomDatabase0.setTransactionSuccessful();
        }
        finally {
            roomDatabase0.endTransaction();
            e0.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkProgressDao
    public void deleteAll() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatement0 = this.d.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatement0.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        }
        finally {
            this.a.endTransaction();
            this.d.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkProgressDao
    public Data getProgressForWorkSpecId(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        this.a.assertNotSuspendingTransaction();
        Data data0 = null;
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            if(cursor0.moveToFirst()) {
                byte[] arr_b = cursor0.isNull(0) ? null : cursor0.getBlob(0);
                if(arr_b != null) {
                    data0 = Data.fromByteArray(arr_b);
                }
            }
            return data0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override  // androidx.work.impl.model.WorkProgressDao
    public void insert(WorkProgress workProgress0) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(workProgress0);
            this.a.setTransactionSuccessful();
        }
        finally {
            this.a.endTransaction();
        }
    }
}


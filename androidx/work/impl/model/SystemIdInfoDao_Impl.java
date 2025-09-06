package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SystemIdInfoDao_Impl implements SystemIdInfoDao {
    public final RoomDatabase a;
    public final a b;
    public final e c;
    public final e d;

    public SystemIdInfoDao_Impl(RoomDatabase roomDatabase0) {
        this.a = roomDatabase0;
        this.b = new a(roomDatabase0, 2);
        this.c = new e(roomDatabase0, 0);
        this.d = new e(roomDatabase0, 1);
    }

    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override  // androidx.work.impl.model.SystemIdInfoDao
    public SystemIdInfo getSystemIdInfo(WorkGenerationalId workGenerationalId0) {
        return DefaultImpls.getSystemIdInfo(this, workGenerationalId0);
    }

    @Override  // androidx.work.impl.model.SystemIdInfoDao
    public SystemIdInfo getSystemIdInfo(String s, int v) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        roomSQLiteQuery0.bindLong(2, ((long)v));
        this.a.assertNotSuspendingTransaction();
        SystemIdInfo systemIdInfo0 = null;
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            int v2 = CursorUtil.getColumnIndexOrThrow(cursor0, "work_spec_id");
            int v3 = CursorUtil.getColumnIndexOrThrow(cursor0, "generation");
            int v4 = CursorUtil.getColumnIndexOrThrow(cursor0, "system_id");
            if(cursor0.moveToFirst()) {
                if(!cursor0.isNull(v2)) {
                    systemIdInfo0 = cursor0.getString(v2);
                }
                systemIdInfo0 = new SystemIdInfo(((String)systemIdInfo0), cursor0.getInt(v3), cursor0.getInt(v4));
            }
            return systemIdInfo0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.SystemIdInfoDao
    public List getWorkSpecIds() {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                ((ArrayList)list0).add((cursor0.isNull(0) ? null : cursor0.getString(0)));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.SystemIdInfoDao
    public void insertSystemIdInfo(SystemIdInfo systemIdInfo0) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(systemIdInfo0);
            this.a.setTransactionSuccessful();
        }
        finally {
            this.a.endTransaction();
        }
    }

    @Override  // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(WorkGenerationalId workGenerationalId0) {
        DefaultImpls.removeSystemIdInfo(this, workGenerationalId0);
    }

    @Override  // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(String s) {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.d;
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

    @Override  // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(String s, int v) {
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
        supportSQLiteStatement0.bindLong(2, ((long)v));
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
}


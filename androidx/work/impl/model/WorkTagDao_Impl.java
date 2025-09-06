package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class WorkTagDao_Impl implements WorkTagDao {
    public final RoomDatabase a;
    public final a b;
    public final e c;

    public WorkTagDao_Impl(RoomDatabase roomDatabase0) {
        this.a = roomDatabase0;
        this.b = new a(roomDatabase0, 5);
        this.c = new e(roomDatabase0, 19);
    }

    @Override  // androidx.work.impl.model.WorkTagDao
    public void deleteByWorkSpecId(String s) {
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

    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override  // androidx.work.impl.model.WorkTagDao
    public List getTagsForWorkSpecId(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
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

    @Override  // androidx.work.impl.model.WorkTagDao
    public List getWorkSpecIdsWithTag(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT work_spec_id FROM worktag WHERE tag=?", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
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

    @Override  // androidx.work.impl.model.WorkTagDao
    public void insert(WorkTag workTag0) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(workTag0);
            this.a.setTransactionSuccessful();
        }
        finally {
            this.a.endTransaction();
        }
    }

    @Override  // androidx.work.impl.model.WorkTagDao
    public void insertTags(String s, Set set0) {
        DefaultImpls.insertTags(this, s, set0);
    }
}


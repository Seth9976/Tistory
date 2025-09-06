package com.kakao.tistory.data.database.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.kakao.tistory.data.database.DateConverts;
import com.kakao.tistory.data.database.entity.SearchKeyword;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SearchDao_Impl implements SearchDao {
    public final RoomDatabase a;
    public final h b;
    public final DateConverts c;
    public final i d;
    public final j e;
    public final k f;
    public final l g;

    public SearchDao_Impl(@NonNull RoomDatabase roomDatabase0) {
        this.c = new DateConverts();
        this.a = roomDatabase0;
        this.b = new h(this, roomDatabase0);
        this.d = new i(this, roomDatabase0);
        this.e = new j(roomDatabase0);
        this.f = new k(roomDatabase0);
        this.g = new l(roomDatabase0);
    }

    @Override  // com.kakao.tistory.data.database.dao.SearchDao
    public void clearAll() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatement0 = this.g.acquire();
        try {
            this.a.beginTransaction();
            try {
                supportSQLiteStatement0.executeUpdateDelete();
                this.a.setTransactionSuccessful();
            }
            catch(Throwable throwable0) {
                this.a.endTransaction();
                throw throwable0;
            }
            this.a.endTransaction();
        }
        finally {
            this.g.release(supportSQLiteStatement0);
        }
    }

    @Override  // com.kakao.tistory.data.database.dao.SearchDao
    public void clearOldKeywords(int v) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatement0 = this.f.acquire();
        supportSQLiteStatement0.bindLong(1, ((long)v));
        try {
            this.a.beginTransaction();
            try {
                supportSQLiteStatement0.executeUpdateDelete();
                this.a.setTransactionSuccessful();
            }
            catch(Throwable throwable0) {
                this.a.endTransaction();
                throw throwable0;
            }
            this.a.endTransaction();
        }
        finally {
            this.f.release(supportSQLiteStatement0);
        }
    }

    @Override  // com.kakao.tistory.data.database.dao.SearchDao
    public List getAll() {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT * FROM searchkeyword Order by date DESC", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            int v1 = CursorUtil.getColumnIndexOrThrow(cursor0, "id");
            int v2 = CursorUtil.getColumnIndexOrThrow(cursor0, "keyword");
            int v3 = CursorUtil.getColumnIndexOrThrow(cursor0, "date");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                Integer integer0 = cursor0.isNull(v1) ? null : cursor0.getInt(v1);
                String s = cursor0.isNull(v2) ? null : cursor0.getString(v2);
                Long long0 = cursor0.isNull(v3) ? null : cursor0.getLong(v3);
                ((ArrayList)list0).add(new SearchKeyword(integer0, s, this.c.fromTimestamp(long0)));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // com.kakao.tistory.data.database.dao.SearchDao
    public List getItems(String s, int v) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT * FROM searchkeyword where keyword LIKE \'%\'||?||\'%\' Order by date DESC limit ?", 2);
        roomSQLiteQuery0.bindString(1, s);
        roomSQLiteQuery0.bindLong(2, ((long)v));
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            int v2 = CursorUtil.getColumnIndexOrThrow(cursor0, "id");
            int v3 = CursorUtil.getColumnIndexOrThrow(cursor0, "keyword");
            int v4 = CursorUtil.getColumnIndexOrThrow(cursor0, "date");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                Integer integer0 = cursor0.isNull(v2) ? null : cursor0.getInt(v2);
                String s1 = cursor0.isNull(v3) ? null : cursor0.getString(v3);
                Long long0 = cursor0.isNull(v4) ? null : cursor0.getLong(v4);
                ((ArrayList)list0).add(new SearchKeyword(integer0, s1, this.c.fromTimestamp(long0)));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @NonNull
    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override  // com.kakao.tistory.data.database.dao.SearchDao
    public Integer getTargetId(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT id FROM searchkeyword where keyword=?", 1);
        roomSQLiteQuery0.bindString(1, s);
        this.a.assertNotSuspendingTransaction();
        Integer integer0 = null;
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            if(cursor0.moveToFirst() && !cursor0.isNull(0)) {
                integer0 = cursor0.getInt(0);
            }
            return integer0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // com.kakao.tistory.data.database.dao.SearchDao
    public void insertKeyword(SearchKeyword searchKeyword0) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(searchKeyword0);
            this.a.setTransactionSuccessful();
        }
        finally {
            this.a.endTransaction();
        }
    }

    @Override  // com.kakao.tistory.data.database.dao.SearchDao
    public void removeKeyword(String s) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatement0 = this.e.acquire();
        supportSQLiteStatement0.bindString(1, s);
        try {
            this.a.beginTransaction();
            try {
                supportSQLiteStatement0.executeUpdateDelete();
                this.a.setTransactionSuccessful();
            }
            catch(Throwable throwable0) {
                this.a.endTransaction();
                throw throwable0;
            }
            this.a.endTransaction();
        }
        finally {
            this.e.release(supportSQLiteStatement0);
        }
    }

    @Override  // com.kakao.tistory.data.database.dao.SearchDao
    public void updateKeyword(SearchKeyword searchKeyword0) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.d.handle(searchKeyword0);
            this.a.setTransactionSuccessful();
        }
        finally {
            this.a.endTransaction();
        }
    }
}


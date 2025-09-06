package com.kakao.tistory.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.kakao.tistory.data.database.dao.SearchDao;
import com.kakao.tistory.data.database.dao.SearchDao_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class SearchDatabase_Impl extends SearchDatabase {
    public volatile SearchDao_Impl b;

    @Override  // androidx.room.RoomDatabase
    public void clearAllTables() {
        this.assertNotMainThread();
        SupportSQLiteDatabase supportSQLiteDatabase0 = this.getOpenHelper().getWritableDatabase();
        try {
            this.beginTransaction();
            supportSQLiteDatabase0.execSQL("DELETE FROM `SearchKeyword`");
            this.setTransactionSuccessful();
        }
        finally {
            this.endTransaction();
            supportSQLiteDatabase0.query("PRAGMA wal_checkpoint(FULL)").close();
            if(!supportSQLiteDatabase0.inTransaction()) {
                supportSQLiteDatabase0.execSQL("VACUUM");
            }
        }
    }

    @Override  // androidx.room.RoomDatabase
    @NonNull
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), new String[]{"SearchKeyword"});
    }

    @Override  // androidx.room.RoomDatabase
    @NonNull
    public SupportSQLiteOpenHelper createOpenHelper(@NonNull DatabaseConfiguration databaseConfiguration0) {
        RoomOpenHelper roomOpenHelper0 = new RoomOpenHelper(databaseConfiguration0, new f(this), "fde8936c78c0883910ee2efaac2c53c0", "e5010ca6d49d7212e4f3d8b1358c3a9e");
        Configuration supportSQLiteOpenHelper$Configuration0 = Configuration.builder(databaseConfiguration0.context).name(databaseConfiguration0.name).callback(roomOpenHelper0).build();
        return databaseConfiguration0.sqliteOpenHelperFactory.create(supportSQLiteOpenHelper$Configuration0);
    }

    @Override  // androidx.room.RoomDatabase
    @NonNull
    public List getAutoMigrations(@NonNull Map map0) {
        return new ArrayList();
    }

    @Override  // androidx.room.RoomDatabase
    @NonNull
    public Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override  // androidx.room.RoomDatabase
    @NonNull
    public Map getRequiredTypeConverters() {
        Map map0 = new HashMap();
        List list0 = SearchDao_Impl.getRequiredConverters();
        ((HashMap)map0).put(SearchDao.class, list0);
        return map0;
    }

    @Override  // com.kakao.tistory.data.database.SearchDatabase
    public SearchDao getSearchDao() {
        if(this.b != null) {
            return this.b;
        }
        synchronized(this) {
            if(this.b == null) {
                this.b = new SearchDao_Impl(this);
            }
            return this.b;
        }
    }
}


package com.kakao.tistory.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.kakao.tistory.data.database.dao.AutoSaveDao;
import com.kakao.tistory.data.database.dao.AutoSaveDao_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AutoSaveDatabase_Impl extends AutoSaveDatabase {
    public volatile AutoSaveDao_Impl b;

    @Override  // androidx.room.RoomDatabase
    public void clearAllTables() {
        this.assertNotMainThread();
        SupportSQLiteDatabase supportSQLiteDatabase0 = this.getOpenHelper().getWritableDatabase();
        try {
            this.beginTransaction();
            supportSQLiteDatabase0.execSQL("DELETE FROM `auto_save_table`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), new String[]{"auto_save_table"});
    }

    @Override  // androidx.room.RoomDatabase
    @NonNull
    public SupportSQLiteOpenHelper createOpenHelper(@NonNull DatabaseConfiguration databaseConfiguration0) {
        RoomOpenHelper roomOpenHelper0 = new RoomOpenHelper(databaseConfiguration0, new c(this), "3c30a0e4c69a59187a6c6fc5e0ff558a", "1e433b29d3c1ddee88c2a65cbbc2d850");
        Configuration supportSQLiteOpenHelper$Configuration0 = Configuration.builder(databaseConfiguration0.context).name(databaseConfiguration0.name).callback(roomOpenHelper0).build();
        return databaseConfiguration0.sqliteOpenHelperFactory.create(supportSQLiteOpenHelper$Configuration0);
    }

    @Override  // androidx.room.RoomDatabase
    @NonNull
    public List getAutoMigrations(@NonNull Map map0) {
        return new ArrayList();
    }

    @Override  // com.kakao.tistory.data.database.AutoSaveDatabase
    public AutoSaveDao getAutoSaveDao() {
        if(this.b != null) {
            return this.b;
        }
        synchronized(this) {
            if(this.b == null) {
                this.b = new AutoSaveDao_Impl(this);
            }
            return this.b;
        }
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
        List list0 = AutoSaveDao_Impl.getRequiredConverters();
        ((HashMap)map0).put(AutoSaveDao.class, list0);
        return map0;
    }
}


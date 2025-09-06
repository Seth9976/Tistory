package com.kakao.kandinsky.signature.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ua.a;

public final class SignatureDatabase_Impl extends SignatureDatabase {
    public volatile SignatureDao_Impl n;

    @Override  // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase supportSQLiteDatabase0 = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            supportSQLiteDatabase0.execSQL("DELETE FROM `signature`");
            super.setTransactionSuccessful();
        }
        finally {
            super.endTransaction();
            supportSQLiteDatabase0.query("PRAGMA wal_checkpoint(FULL)").close();
            if(!supportSQLiteDatabase0.inTransaction()) {
                supportSQLiteDatabase0.execSQL("VACUUM");
            }
        }
    }

    @Override  // androidx.room.RoomDatabase
    @NonNull
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), new String[]{"signature"});
    }

    @Override  // androidx.room.RoomDatabase
    @NonNull
    public SupportSQLiteOpenHelper createOpenHelper(@NonNull DatabaseConfiguration databaseConfiguration0) {
        RoomOpenHelper roomOpenHelper0 = new RoomOpenHelper(databaseConfiguration0, new a(this), "8b865e17a56a7d591c40edcc366a9ef2", "b94d592015446523e61c7d780b06b965");
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
        List list0 = SignatureDao_Impl.getRequiredConverters();
        ((HashMap)map0).put(SignatureDao.class, list0);
        return map0;
    }

    @Override  // com.kakao.kandinsky.signature.database.SignatureDatabase
    public SignatureDao signatureDao() {
        if(this.n != null) {
            return this.n;
        }
        synchronized(this) {
            if(this.n == null) {
                this.n = new SignatureDao_Impl(this);
            }
            return this.n;
        }
    }
}


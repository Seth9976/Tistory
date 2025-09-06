package com.kakao.kandinsky.history;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import e.g;
import e.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class HistoryDatabase_Impl extends HistoryDatabase {
    public volatile p a;

    @Override  // com.kakao.kandinsky.history.HistoryDatabase
    public final g a() {
        if(this.a != null) {
            return this.a;
        }
        synchronized(this) {
            if(this.a == null) {
                this.a = new p(this);
            }
            return this.a;
        }
    }

    @Override  // androidx.room.RoomDatabase
    public final void clearAllTables() {
        this.assertNotMainThread();
        SupportSQLiteDatabase supportSQLiteDatabase0 = this.getOpenHelper().getWritableDatabase();
        try {
            this.beginTransaction();
            supportSQLiteDatabase0.execSQL("DELETE FROM `history`");
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
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), new String[]{"history"});
    }

    @Override  // androidx.room.RoomDatabase
    public final SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration0) {
        RoomOpenHelper roomOpenHelper0 = new RoomOpenHelper(databaseConfiguration0, new a(this), "928523d466da5a04377651a9d728a2b1", "2b7db94fb044a6eb1ff0659dbdce0950");
        Configuration supportSQLiteOpenHelper$Configuration0 = Configuration.builder(databaseConfiguration0.context).name(databaseConfiguration0.name).callback(roomOpenHelper0).build();
        return databaseConfiguration0.sqliteOpenHelperFactory.create(supportSQLiteOpenHelper$Configuration0);
    }

    @Override  // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map0) {
        return new ArrayList();
    }

    @Override  // androidx.room.RoomDatabase
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override  // androidx.room.RoomDatabase
    public final Map getRequiredTypeConverters() {
        Map map0 = new HashMap();
        List list0 = Collections.emptyList();
        ((HashMap)map0).put(g.class, list0);
        return map0;
    }
}


package com.kakao.kandinsky.history;

import androidx.room.RoomDatabase.Callback;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class a extends Delegate {
    public final HistoryDatabase_Impl a;

    public a(HistoryDatabase_Impl historyDatabase_Impl0) {
        this.a = historyDatabase_Impl0;
        super(1);
    }

    @Override  // androidx.room.RoomOpenHelper$Delegate
    public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase0) {
        supportSQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS `history` (`id` INTEGER NOT NULL, `uri` TEXT NOT NULL, `step` INTEGER NOT NULL, `lastUpdatedTime` INTEGER NOT NULL, `json` TEXT NOT NULL, PRIMARY KEY(`id`, `uri`, `step`))");
        supportSQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        supportSQLiteDatabase0.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'928523d466da5a04377651a9d728a2b1\')");
    }

    @Override  // androidx.room.RoomOpenHelper$Delegate
    public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase0) {
        supportSQLiteDatabase0.execSQL("DROP TABLE IF EXISTS `history`");
        List list0 = this.a.mCallbacks;
        if(list0 != null) {
            for(Object object0: list0) {
                ((Callback)object0).onDestructiveMigration(supportSQLiteDatabase0);
            }
        }
    }

    @Override  // androidx.room.RoomOpenHelper$Delegate
    public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase0) {
        List list0 = this.a.mCallbacks;
        if(list0 != null) {
            for(Object object0: list0) {
                ((Callback)object0).onCreate(supportSQLiteDatabase0);
            }
        }
    }

    @Override  // androidx.room.RoomOpenHelper$Delegate
    public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase0) {
        this.a.mDatabase = supportSQLiteDatabase0;
        this.a.internalInitInvalidationTracker(supportSQLiteDatabase0);
        List list0 = this.a.mCallbacks;
        if(list0 != null) {
            for(Object object0: list0) {
                ((Callback)object0).onOpen(supportSQLiteDatabase0);
            }
        }
    }

    @Override  // androidx.room.RoomOpenHelper$Delegate
    public final void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase0) {
    }

    @Override  // androidx.room.RoomOpenHelper$Delegate
    public final void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase0) {
        DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase0);
    }

    @Override  // androidx.room.RoomOpenHelper$Delegate
    public final ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase0) {
        HashMap hashMap0 = new HashMap(5);
        hashMap0.put("id", new Column("id", "INTEGER", true, 1, null, 1));
        hashMap0.put("uri", new Column("uri", "TEXT", true, 2, null, 1));
        hashMap0.put("step", new Column("step", "INTEGER", true, 3, null, 1));
        hashMap0.put("lastUpdatedTime", new Column("lastUpdatedTime", "INTEGER", true, 0, null, 1));
        hashMap0.put("json", new Column("json", "TEXT", true, 0, null, 1));
        TableInfo tableInfo0 = new TableInfo("history", hashMap0, new HashSet(0), new HashSet(0));
        TableInfo tableInfo1 = TableInfo.read(supportSQLiteDatabase0, "history");
        return tableInfo0.equals(tableInfo1) ? new ValidationResult(true, null) : new ValidationResult(false, "history(com.kakao.kandinsky.history.HistoryEntity).\n Expected:\n" + tableInfo0 + "\n Found:\n" + tableInfo1);
    }
}


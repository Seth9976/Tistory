package com.kakao.tistory.data.database;

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

public final class f extends Delegate {
    public final SearchDatabase_Impl a;

    public f(SearchDatabase_Impl searchDatabase_Impl0) {
        this.a = searchDatabase_Impl0;
        super(1);
    }

    @Override  // androidx.room.RoomOpenHelper$Delegate
    public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase0) {
        supportSQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS `SearchKeyword` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `keyword` TEXT, `date` INTEGER)");
        supportSQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        supportSQLiteDatabase0.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'fde8936c78c0883910ee2efaac2c53c0\')");
    }

    @Override  // androidx.room.RoomOpenHelper$Delegate
    public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase0) {
        supportSQLiteDatabase0.execSQL("DROP TABLE IF EXISTS `SearchKeyword`");
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
        HashMap hashMap0 = new HashMap(3);
        hashMap0.put("id", new Column("id", "INTEGER", false, 1, null, 1));
        hashMap0.put("keyword", new Column("keyword", "TEXT", false, 0, null, 1));
        hashMap0.put("date", new Column("date", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo0 = new TableInfo("SearchKeyword", hashMap0, new HashSet(0), new HashSet(0));
        TableInfo tableInfo1 = TableInfo.read(supportSQLiteDatabase0, "SearchKeyword");
        return tableInfo0.equals(tableInfo1) ? new ValidationResult(true, null) : new ValidationResult(false, "SearchKeyword(com.kakao.tistory.data.database.entity.SearchKeyword).\n Expected:\n" + tableInfo0 + "\n Found:\n" + tableInfo1);
    }
}


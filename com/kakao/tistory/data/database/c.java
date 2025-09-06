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

public final class c extends Delegate {
    public final AutoSaveDatabase_Impl a;

    public c(AutoSaveDatabase_Impl autoSaveDatabase_Impl0) {
        this.a = autoSaveDatabase_Impl0;
        super(1);
    }

    @Override  // androidx.room.RoomOpenHelper$Delegate
    public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase0) {
        supportSQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS `auto_save_table` (`blogName` TEXT NOT NULL, `entryId` INTEGER NOT NULL, `draftSequence` INTEGER NOT NULL, `title` TEXT, `postJson` TEXT NOT NULL, `thumbnail` TEXT, `categoryId` INTEGER, `categoryName` TEXT, `tags` TEXT, `daumLikeId` INTEGER, `daumLikeName` TEXT, `visibility` TEXT, `commentPermit` INTEGER NOT NULL, `reserveType` TEXT, `reserveTime` INTEGER, `passwordString` TEXT, `published` INTEGER, `updatedAt` INTEGER, PRIMARY KEY(`blogName`))");
        supportSQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        supportSQLiteDatabase0.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'3c30a0e4c69a59187a6c6fc5e0ff558a\')");
    }

    @Override  // androidx.room.RoomOpenHelper$Delegate
    public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase0) {
        supportSQLiteDatabase0.execSQL("DROP TABLE IF EXISTS `auto_save_table`");
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
        HashMap hashMap0 = new HashMap(18);
        hashMap0.put("blogName", new Column("blogName", "TEXT", true, 1, null, 1));
        hashMap0.put("entryId", new Column("entryId", "INTEGER", true, 0, null, 1));
        hashMap0.put("draftSequence", new Column("draftSequence", "INTEGER", true, 0, null, 1));
        hashMap0.put("title", new Column("title", "TEXT", false, 0, null, 1));
        hashMap0.put("postJson", new Column("postJson", "TEXT", true, 0, null, 1));
        hashMap0.put("thumbnail", new Column("thumbnail", "TEXT", false, 0, null, 1));
        hashMap0.put("categoryId", new Column("categoryId", "INTEGER", false, 0, null, 1));
        hashMap0.put("categoryName", new Column("categoryName", "TEXT", false, 0, null, 1));
        hashMap0.put("tags", new Column("tags", "TEXT", false, 0, null, 1));
        hashMap0.put("daumLikeId", new Column("daumLikeId", "INTEGER", false, 0, null, 1));
        hashMap0.put("daumLikeName", new Column("daumLikeName", "TEXT", false, 0, null, 1));
        hashMap0.put("visibility", new Column("visibility", "TEXT", false, 0, null, 1));
        hashMap0.put("commentPermit", new Column("commentPermit", "INTEGER", true, 0, null, 1));
        hashMap0.put("reserveType", new Column("reserveType", "TEXT", false, 0, null, 1));
        hashMap0.put("reserveTime", new Column("reserveTime", "INTEGER", false, 0, null, 1));
        hashMap0.put("passwordString", new Column("passwordString", "TEXT", false, 0, null, 1));
        hashMap0.put("published", new Column("published", "INTEGER", false, 0, null, 1));
        hashMap0.put("updatedAt", new Column("updatedAt", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo0 = new TableInfo("auto_save_table", hashMap0, new HashSet(0), new HashSet(0));
        TableInfo tableInfo1 = TableInfo.read(supportSQLiteDatabase0, "auto_save_table");
        return tableInfo0.equals(tableInfo1) ? new ValidationResult(true, null) : new ValidationResult(false, "auto_save_table(com.kakao.tistory.data.database.entity.AutoSavedModel).\n Expected:\n" + tableInfo0 + "\n Found:\n" + tableInfo1);
    }
}


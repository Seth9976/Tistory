package ua;

import androidx.room.RoomDatabase.Callback;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.kakao.kandinsky.signature.database.SignatureDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class a extends Delegate {
    public final SignatureDatabase_Impl b;

    public a(SignatureDatabase_Impl signatureDatabase_Impl0) {
        this.b = signatureDatabase_Impl0;
        super(3);
    }

    @Override  // androidx.room.RoomOpenHelper$Delegate
    public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase0) {
        supportSQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS `signature` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL, `updatedTime` INTEGER NOT NULL, `data` TEXT NOT NULL, `size` REAL NOT NULL, `angle` REAL NOT NULL, `horizontalPaddingRatio` REAL NOT NULL, `verticalPaddingRatio` REAL NOT NULL, `originalSize` TEXT NOT NULL, `fontSize` REAL NOT NULL, `lineHeight` REAL NOT NULL, `color` INTEGER NOT NULL, `alpha` REAL NOT NULL, `background` INTEGER NOT NULL, `backgroundAlpha` REAL NOT NULL, `boundsSize` TEXT NOT NULL, `textPadding` TEXT NOT NULL, `bold` INTEGER NOT NULL, `italic` INTEGER NOT NULL, `underLine` INTEGER NOT NULL, `align` INTEGER NOT NULL, `font` INTEGER, `watermark` INTEGER NOT NULL)");
        supportSQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        supportSQLiteDatabase0.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'8b865e17a56a7d591c40edcc366a9ef2\')");
    }

    @Override  // androidx.room.RoomOpenHelper$Delegate
    public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase0) {
        supportSQLiteDatabase0.execSQL("DROP TABLE IF EXISTS `signature`");
        List list0 = this.b.mCallbacks;
        if(list0 != null) {
            for(Object object0: list0) {
                ((Callback)object0).onDestructiveMigration(supportSQLiteDatabase0);
            }
        }
    }

    @Override  // androidx.room.RoomOpenHelper$Delegate
    public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase0) {
        List list0 = this.b.mCallbacks;
        if(list0 != null) {
            for(Object object0: list0) {
                ((Callback)object0).onCreate(supportSQLiteDatabase0);
            }
        }
    }

    @Override  // androidx.room.RoomOpenHelper$Delegate
    public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase0) {
        this.b.mDatabase = supportSQLiteDatabase0;
        this.b.internalInitInvalidationTracker(supportSQLiteDatabase0);
        List list0 = this.b.mCallbacks;
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
        HashMap hashMap0 = new HashMap(23);
        hashMap0.put("uid", new Column("uid", "INTEGER", true, 1, null, 1));
        hashMap0.put("type", new Column("type", "TEXT", true, 0, null, 1));
        hashMap0.put("updatedTime", new Column("updatedTime", "INTEGER", true, 0, null, 1));
        hashMap0.put("data", new Column("data", "TEXT", true, 0, null, 1));
        hashMap0.put("size", new Column("size", "REAL", true, 0, null, 1));
        hashMap0.put("angle", new Column("angle", "REAL", true, 0, null, 1));
        hashMap0.put("horizontalPaddingRatio", new Column("horizontalPaddingRatio", "REAL", true, 0, null, 1));
        hashMap0.put("verticalPaddingRatio", new Column("verticalPaddingRatio", "REAL", true, 0, null, 1));
        hashMap0.put("originalSize", new Column("originalSize", "TEXT", true, 0, null, 1));
        hashMap0.put("fontSize", new Column("fontSize", "REAL", true, 0, null, 1));
        hashMap0.put("lineHeight", new Column("lineHeight", "REAL", true, 0, null, 1));
        hashMap0.put("color", new Column("color", "INTEGER", true, 0, null, 1));
        hashMap0.put("alpha", new Column("alpha", "REAL", true, 0, null, 1));
        hashMap0.put("background", new Column("background", "INTEGER", true, 0, null, 1));
        hashMap0.put("backgroundAlpha", new Column("backgroundAlpha", "REAL", true, 0, null, 1));
        hashMap0.put("boundsSize", new Column("boundsSize", "TEXT", true, 0, null, 1));
        hashMap0.put("textPadding", new Column("textPadding", "TEXT", true, 0, null, 1));
        hashMap0.put("bold", new Column("bold", "INTEGER", true, 0, null, 1));
        hashMap0.put("italic", new Column("italic", "INTEGER", true, 0, null, 1));
        hashMap0.put("underLine", new Column("underLine", "INTEGER", true, 0, null, 1));
        hashMap0.put("align", new Column("align", "INTEGER", true, 0, null, 1));
        hashMap0.put("font", new Column("font", "INTEGER", false, 0, null, 1));
        hashMap0.put("watermark", new Column("watermark", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo0 = new TableInfo("signature", hashMap0, new HashSet(0), new HashSet(0));
        TableInfo tableInfo1 = TableInfo.read(supportSQLiteDatabase0, "signature");
        return tableInfo0.equals(tableInfo1) ? new ValidationResult(true, null) : new ValidationResult(false, "signature(com.kakao.kandinsky.signature.database.SignatureEntity).\n Expected:\n" + tableInfo0 + "\n Found:\n" + tableInfo1);
    }
}


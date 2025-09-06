package androidx.work.impl.model;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Data;
import com.kakao.kandinsky.signature.database.SignatureEntity;

public final class a extends EntityInsertionAdapter {
    public final int e;

    public a(RoomDatabase roomDatabase0, int v) {
        this.e = v;
        super(roomDatabase0);
    }

    @Override  // androidx.room.EntityInsertionAdapter
    public final void bind(SupportSQLiteStatement supportSQLiteStatement0, Object object0) {
        switch(this.e) {
            case 0: {
                if(((Dependency)object0).getWorkSpecId() == null) {
                    supportSQLiteStatement0.bindNull(1);
                }
                else {
                    supportSQLiteStatement0.bindString(1, ((Dependency)object0).getWorkSpecId());
                }
                if(((Dependency)object0).getPrerequisiteId() == null) {
                    supportSQLiteStatement0.bindNull(2);
                    return;
                }
                supportSQLiteStatement0.bindString(2, ((Dependency)object0).getPrerequisiteId());
                return;
            }
            case 1: {
                if(((Preference)object0).getKey() == null) {
                    supportSQLiteStatement0.bindNull(1);
                }
                else {
                    supportSQLiteStatement0.bindString(1, ((Preference)object0).getKey());
                }
                if(((Preference)object0).getValue() == null) {
                    supportSQLiteStatement0.bindNull(2);
                    return;
                }
                supportSQLiteStatement0.bindLong(2, ((long)((Preference)object0).getValue()));
                return;
            }
            case 2: {
                String s = ((SystemIdInfo)object0).workSpecId;
                if(s == null) {
                    supportSQLiteStatement0.bindNull(1);
                }
                else {
                    supportSQLiteStatement0.bindString(1, s);
                }
                supportSQLiteStatement0.bindLong(2, ((long)((SystemIdInfo)object0).getGeneration()));
                supportSQLiteStatement0.bindLong(3, ((long)((SystemIdInfo)object0).systemId));
                return;
            }
            case 3: {
                if(((WorkName)object0).getName() == null) {
                    supportSQLiteStatement0.bindNull(1);
                }
                else {
                    supportSQLiteStatement0.bindString(1, ((WorkName)object0).getName());
                }
                if(((WorkName)object0).getWorkSpecId() == null) {
                    supportSQLiteStatement0.bindNull(2);
                    return;
                }
                supportSQLiteStatement0.bindString(2, ((WorkName)object0).getWorkSpecId());
                return;
            }
            case 4: {
                if(((WorkProgress)object0).getWorkSpecId() == null) {
                    supportSQLiteStatement0.bindNull(1);
                }
                else {
                    supportSQLiteStatement0.bindString(1, ((WorkProgress)object0).getWorkSpecId());
                }
                byte[] arr_b = Data.toByteArrayInternal(((WorkProgress)object0).getProgress());
                if(arr_b == null) {
                    supportSQLiteStatement0.bindNull(2);
                    return;
                }
                supportSQLiteStatement0.bindBlob(2, arr_b);
                return;
            }
            case 5: {
                if(((WorkTag)object0).getTag() == null) {
                    supportSQLiteStatement0.bindNull(1);
                }
                else {
                    supportSQLiteStatement0.bindString(1, ((WorkTag)object0).getTag());
                }
                if(((WorkTag)object0).getWorkSpecId() == null) {
                    supportSQLiteStatement0.bindNull(2);
                    return;
                }
                supportSQLiteStatement0.bindString(2, ((WorkTag)object0).getWorkSpecId());
                return;
            }
            default: {
                SignatureEntity signatureEntity0 = (SignatureEntity)object0;
                supportSQLiteStatement0.bindLong(1, ((long)signatureEntity0.getUid()));
                supportSQLiteStatement0.bindString(2, signatureEntity0.getType());
                supportSQLiteStatement0.bindLong(3, signatureEntity0.getUpdatedTime());
                supportSQLiteStatement0.bindString(4, signatureEntity0.getData());
                supportSQLiteStatement0.bindDouble(5, ((double)signatureEntity0.getSize()));
                supportSQLiteStatement0.bindDouble(6, ((double)signatureEntity0.getAngle()));
                supportSQLiteStatement0.bindDouble(7, ((double)signatureEntity0.getHorizontalPaddingRatio()));
                supportSQLiteStatement0.bindDouble(8, ((double)signatureEntity0.getVerticalPaddingRatio()));
                supportSQLiteStatement0.bindString(9, signatureEntity0.getOriginalSize());
                supportSQLiteStatement0.bindDouble(10, ((double)signatureEntity0.getFontSize()));
                supportSQLiteStatement0.bindDouble(11, ((double)signatureEntity0.getLineHeight()));
                supportSQLiteStatement0.bindLong(12, ((long)signatureEntity0.getColor()));
                supportSQLiteStatement0.bindDouble(13, ((double)signatureEntity0.getAlpha()));
                supportSQLiteStatement0.bindLong(14, ((long)signatureEntity0.getBackground()));
                supportSQLiteStatement0.bindDouble(15, ((double)signatureEntity0.getBackgroundAlpha()));
                supportSQLiteStatement0.bindString(16, signatureEntity0.getBoundsSize());
                supportSQLiteStatement0.bindString(17, signatureEntity0.getTextPadding());
                supportSQLiteStatement0.bindLong(18, ((long)signatureEntity0.getBold()));
                supportSQLiteStatement0.bindLong(19, ((long)signatureEntity0.getItalic()));
                supportSQLiteStatement0.bindLong(20, ((long)signatureEntity0.getUnderLine()));
                supportSQLiteStatement0.bindLong(21, ((long)signatureEntity0.getAlign()));
                if(signatureEntity0.getFont() == null) {
                    supportSQLiteStatement0.bindNull(22);
                }
                else {
                    supportSQLiteStatement0.bindLong(22, ((long)(((int)signatureEntity0.getFont()))));
                }
                supportSQLiteStatement0.bindLong(23, ((long)signatureEntity0.getWatermark()));
            }
        }
    }

    @Override  // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        switch(this.e) {
            case 0: {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }
            case 1: {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }
            case 2: {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            }
            case 3: {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }
            case 4: {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }
            case 5: {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }
            default: {
                return "INSERT OR REPLACE INTO `signature` (`uid`,`type`,`updatedTime`,`data`,`size`,`angle`,`horizontalPaddingRatio`,`verticalPaddingRatio`,`originalSize`,`fontSize`,`lineHeight`,`color`,`alpha`,`background`,`backgroundAlpha`,`boundsSize`,`textPadding`,`bold`,`italic`,`underLine`,`align`,`font`,`watermark`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        }
    }
}


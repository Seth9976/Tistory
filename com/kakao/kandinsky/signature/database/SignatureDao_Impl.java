package com.kakao.kandinsky.signature.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.model.a;
import androidx.work.impl.model.b;
import androidx.work.impl.model.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.flow.Flow;

public final class SignatureDao_Impl implements SignatureDao {
    public final RoomDatabase a;
    public final a b;
    public final e c;
    public final e d;

    public SignatureDao_Impl(@NonNull RoomDatabase roomDatabase0) {
        this.a = roomDatabase0;
        this.b = new a(roomDatabase0, 6);
        this.c = new e(roomDatabase0, 20);
        this.d = new e(roomDatabase0, 21);
    }

    @Override  // com.kakao.kandinsky.signature.database.SignatureDao
    public void delete(int v) {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.c;
        SupportSQLiteStatement supportSQLiteStatement0 = e0.acquire();
        supportSQLiteStatement0.bindLong(1, ((long)v));
        try {
            roomDatabase0.beginTransaction();
            try {
                supportSQLiteStatement0.executeUpdateDelete();
                roomDatabase0.setTransactionSuccessful();
            }
            catch(Throwable throwable0) {
                roomDatabase0.endTransaction();
                throw throwable0;
            }
            roomDatabase0.endTransaction();
        }
        finally {
            e0.release(supportSQLiteStatement0);
        }
    }

    @Override  // com.kakao.kandinsky.signature.database.SignatureDao
    public void deleteOldData() {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.d;
        SupportSQLiteStatement supportSQLiteStatement0 = e0.acquire();
        try {
            roomDatabase0.beginTransaction();
            try {
                supportSQLiteStatement0.executeUpdateDelete();
                roomDatabase0.setTransactionSuccessful();
            }
            catch(Throwable throwable0) {
                roomDatabase0.endTransaction();
                throw throwable0;
            }
            roomDatabase0.endTransaction();
        }
        finally {
            e0.release(supportSQLiteStatement0);
        }
    }

    @Override  // com.kakao.kandinsky.signature.database.SignatureDao
    public List getAll() {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT * FROM signature ORDER BY updatedTime DESC", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            int v1 = CursorUtil.getColumnIndexOrThrow(cursor0, "uid");
            int v2 = CursorUtil.getColumnIndexOrThrow(cursor0, "type");
            int v3 = CursorUtil.getColumnIndexOrThrow(cursor0, "updatedTime");
            int v4 = CursorUtil.getColumnIndexOrThrow(cursor0, "data");
            int v5 = CursorUtil.getColumnIndexOrThrow(cursor0, "size");
            int v6 = CursorUtil.getColumnIndexOrThrow(cursor0, "angle");
            int v7 = CursorUtil.getColumnIndexOrThrow(cursor0, "horizontalPaddingRatio");
            int v8 = CursorUtil.getColumnIndexOrThrow(cursor0, "verticalPaddingRatio");
            int v9 = CursorUtil.getColumnIndexOrThrow(cursor0, "originalSize");
            int v10 = CursorUtil.getColumnIndexOrThrow(cursor0, "fontSize");
            int v11 = CursorUtil.getColumnIndexOrThrow(cursor0, "lineHeight");
            int v12 = CursorUtil.getColumnIndexOrThrow(cursor0, "color");
            int v13 = CursorUtil.getColumnIndexOrThrow(cursor0, "alpha");
            int v14 = CursorUtil.getColumnIndexOrThrow(cursor0, "background");
            int v15 = CursorUtil.getColumnIndexOrThrow(cursor0, "backgroundAlpha");
            int v16 = CursorUtil.getColumnIndexOrThrow(cursor0, "boundsSize");
            int v17 = CursorUtil.getColumnIndexOrThrow(cursor0, "textPadding");
            int v18 = CursorUtil.getColumnIndexOrThrow(cursor0, "bold");
            int v19 = CursorUtil.getColumnIndexOrThrow(cursor0, "italic");
            int v20 = CursorUtil.getColumnIndexOrThrow(cursor0, "underLine");
            int v21 = CursorUtil.getColumnIndexOrThrow(cursor0, "align");
            int v22 = CursorUtil.getColumnIndexOrThrow(cursor0, "font");
            int v23 = CursorUtil.getColumnIndexOrThrow(cursor0, "watermark");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                ((ArrayList)list0).add(new SignatureEntity(cursor0.getInt(v1), cursor0.getString(v2), cursor0.getLong(v3), cursor0.getString(v4), cursor0.getFloat(v5), cursor0.getFloat(v6), cursor0.getFloat(v7), cursor0.getFloat(v8), cursor0.getString(v9), cursor0.getFloat(v10), cursor0.getFloat(v11), cursor0.getInt(v12), cursor0.getFloat(v13), cursor0.getInt(v14), cursor0.getFloat(v15), cursor0.getString(v16), cursor0.getString(v17), cursor0.getInt(v18) != 0, cursor0.getInt(v19) != 0, cursor0.getInt(v20) != 0, cursor0.getInt(v21), (cursor0.isNull(v22) ? null : cursor0.getInt(v22)), cursor0.getInt(v23) != 0));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // com.kakao.kandinsky.signature.database.SignatureDao
    public Flow getAllFlow() {
        b b0 = new b(4, this, RoomSQLiteQuery.acquire("SELECT * FROM signature ORDER BY updatedTime DESC", 0));
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"signature"}, b0);
    }

    @NonNull
    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override  // com.kakao.kandinsky.signature.database.SignatureDao
    public long insert(SignatureEntity signatureEntity0) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long v1 = this.b.insertAndReturnId(signatureEntity0);
            this.a.setTransactionSuccessful();
            return v1;
        }
        finally {
            this.a.endTransaction();
        }
    }

    @Override  // com.kakao.kandinsky.signature.database.SignatureDao
    public int insertOrUpdate(SignatureEntity signatureEntity0) {
        this.a.beginTransaction();
        try {
            int v1 = DefaultImpls.insertOrUpdate(this, signatureEntity0);
            this.a.setTransactionSuccessful();
            return v1;
        }
        finally {
            this.a.endTransaction();
        }
    }
}


package com.kakao.tistory.data.database.dao;

import android.database.Cursor;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import com.kakao.tistory.data.database.entity.AutoSavedModel;
import java.util.concurrent.Callable;

public final class e implements Callable {
    public final RoomSQLiteQuery a;
    public final AutoSaveDao_Impl b;

    public e(AutoSaveDao_Impl autoSaveDao_Impl0, RoomSQLiteQuery roomSQLiteQuery0) {
        this.b = autoSaveDao_Impl0;
        this.a = roomSQLiteQuery0;
        super();
    }

    @Override
    public final Object call() {
        AutoSavedModel autoSavedModel0;
        Cursor cursor0 = DBUtil.query(this.b.a, this.a, false, null);
        try {
            int v1 = CursorUtil.getColumnIndexOrThrow(cursor0, "blogName");
            int v2 = CursorUtil.getColumnIndexOrThrow(cursor0, "entryId");
            int v3 = CursorUtil.getColumnIndexOrThrow(cursor0, "draftSequence");
            int v4 = CursorUtil.getColumnIndexOrThrow(cursor0, "title");
            int v5 = CursorUtil.getColumnIndexOrThrow(cursor0, "postJson");
            int v6 = CursorUtil.getColumnIndexOrThrow(cursor0, "thumbnail");
            int v7 = CursorUtil.getColumnIndexOrThrow(cursor0, "categoryId");
            int v8 = CursorUtil.getColumnIndexOrThrow(cursor0, "categoryName");
            int v9 = CursorUtil.getColumnIndexOrThrow(cursor0, "tags");
            int v10 = CursorUtil.getColumnIndexOrThrow(cursor0, "daumLikeId");
            int v11 = CursorUtil.getColumnIndexOrThrow(cursor0, "daumLikeName");
            int v12 = CursorUtil.getColumnIndexOrThrow(cursor0, "visibility");
            int v13 = CursorUtil.getColumnIndexOrThrow(cursor0, "commentPermit");
            int v14 = CursorUtil.getColumnIndexOrThrow(cursor0, "reserveType");
            int v15 = CursorUtil.getColumnIndexOrThrow(cursor0, "reserveTime");
            int v16 = CursorUtil.getColumnIndexOrThrow(cursor0, "passwordString");
            int v17 = CursorUtil.getColumnIndexOrThrow(cursor0, "published");
            int v18 = CursorUtil.getColumnIndexOrThrow(cursor0, "updatedAt");
            if(cursor0.moveToFirst()) {
                String s = cursor0.getString(v1);
                long v19 = cursor0.getLong(v2);
                long v20 = cursor0.getLong(v3);
                String s1 = cursor0.isNull(v4) ? null : cursor0.getString(v4);
                String s2 = cursor0.getString(v5);
                String s3 = cursor0.isNull(v6) ? null : cursor0.getString(v6);
                Integer integer0 = cursor0.isNull(v7) ? null : cursor0.getInt(v7);
                String s4 = cursor0.isNull(v8) ? null : cursor0.getString(v8);
                String s5 = cursor0.isNull(v9) ? null : cursor0.getString(v9);
                autoSavedModel0 = new AutoSavedModel(s, v19, v20, s1, s2, s3, integer0, s4, this.b.c.toList(s5), (cursor0.isNull(v10) ? null : cursor0.getInt(v10)), (cursor0.isNull(v11) ? null : cursor0.getString(v11)), (cursor0.isNull(v12) ? null : cursor0.getString(v12)), cursor0.getInt(v13), (cursor0.isNull(v14) ? null : cursor0.getString(v14)), (cursor0.isNull(v15) ? null : cursor0.getLong(v15)), (cursor0.isNull(v16) ? null : cursor0.getString(v16)), (cursor0.isNull(v17) ? null : cursor0.getLong(v17)), (cursor0.isNull(v18) ? null : cursor0.getLong(v18)));
            }
            else {
                autoSavedModel0 = null;
            }
            return autoSavedModel0;
        }
        finally {
            cursor0.close();
            this.a.release();
        }
    }
}


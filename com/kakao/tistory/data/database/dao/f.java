package com.kakao.tistory.data.database.dao;

import android.database.Cursor;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import com.kakao.tistory.domain.entity.autosave.EntryKeyEntity;
import java.util.concurrent.Callable;

public final class f implements Callable {
    public final RoomSQLiteQuery a;
    public final AutoSaveDao_Impl b;

    public f(AutoSaveDao_Impl autoSaveDao_Impl0, RoomSQLiteQuery roomSQLiteQuery0) {
        this.b = autoSaveDao_Impl0;
        this.a = roomSQLiteQuery0;
        super();
    }

    @Override
    public final Object call() {
        Object object0 = null;
        Cursor cursor0 = DBUtil.query(this.b.a, this.a, false, null);
        try {
            if(cursor0.moveToFirst()) {
                String s = cursor0.getString(0);
                long v1 = cursor0.getLong(1);
                if(!cursor0.isNull(2)) {
                    object0 = cursor0.getLong(2);
                }
                object0 = new EntryKeyEntity(s, v1, ((Long)object0));
            }
            return object0;
        }
        finally {
            cursor0.close();
            this.a.release();
        }
    }
}


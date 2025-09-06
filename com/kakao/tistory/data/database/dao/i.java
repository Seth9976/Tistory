package com.kakao.tistory.data.database.dao;

import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.kakao.tistory.data.database.entity.SearchKeyword;
import java.util.Date;

public final class i extends EntityDeletionOrUpdateAdapter {
    public final SearchDao_Impl a;

    public i(SearchDao_Impl searchDao_Impl0, RoomDatabase roomDatabase0) {
        this.a = searchDao_Impl0;
        super(roomDatabase0);
    }

    @Override  // androidx.room.EntityDeletionOrUpdateAdapter
    public final void bind(SupportSQLiteStatement supportSQLiteStatement0, Object object0) {
        if(((SearchKeyword)object0).getId() == null) {
            supportSQLiteStatement0.bindNull(1);
        }
        else {
            supportSQLiteStatement0.bindLong(1, ((long)(((int)((SearchKeyword)object0).getId()))));
        }
        if(((SearchKeyword)object0).getKeyword() == null) {
            supportSQLiteStatement0.bindNull(2);
        }
        else {
            supportSQLiteStatement0.bindString(2, ((SearchKeyword)object0).getKeyword());
        }
        Date date0 = ((SearchKeyword)object0).getDate();
        Long long0 = this.a.c.dateToTimestamp(date0);
        if(long0 == null) {
            supportSQLiteStatement0.bindNull(3);
        }
        else {
            supportSQLiteStatement0.bindLong(3, ((long)long0));
        }
        if(((SearchKeyword)object0).getId() == null) {
            supportSQLiteStatement0.bindNull(4);
            return;
        }
        supportSQLiteStatement0.bindLong(4, ((long)(((int)((SearchKeyword)object0).getId()))));
    }

    @Override  // androidx.room.EntityDeletionOrUpdateAdapter
    public final String createQuery() {
        return "UPDATE OR IGNORE `SearchKeyword` SET `id` = ?,`keyword` = ?,`date` = ? WHERE `id` = ?";
    }
}


package com.kakao.tistory.data.database;

import androidx.room.Room;
import com.kakao.android.base.BaseKt;

public abstract class e {
    public static final SearchDatabase a;

    static {
        e.a = (SearchDatabase)Room.databaseBuilder(BaseKt.getAppContext(), SearchDatabase.class, "search_database").fallbackToDestructiveMigration().build();
    }
}


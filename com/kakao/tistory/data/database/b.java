package com.kakao.tistory.data.database;

import androidx.room.Room;
import com.kakao.android.base.BaseKt;

public abstract class b {
    public static final AutoSaveDatabase a;

    static {
        b.a = (AutoSaveDatabase)Room.databaseBuilder(BaseKt.getAppContext(), AutoSaveDatabase.class, "auto_save_database").fallbackToDestructiveMigration().build();
    }
}


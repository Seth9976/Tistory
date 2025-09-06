package com.kakao.tistory.data.database.dao;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;

public final class l extends SharedSQLiteStatement {
    public l(RoomDatabase roomDatabase0) {
        super(roomDatabase0);
    }

    @Override  // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "DELETE FROM searchkeyword";
    }
}


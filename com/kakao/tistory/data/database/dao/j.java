package com.kakao.tistory.data.database.dao;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;

public final class j extends SharedSQLiteStatement {
    public j(RoomDatabase roomDatabase0) {
        super(roomDatabase0);
    }

    @Override  // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "DELETE FROM searchkeyword where keyword=?";
    }
}


package com.kakao.tistory.data.database.dao;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;

public final class k extends SharedSQLiteStatement {
    public k(RoomDatabase roomDatabase0) {
        super(roomDatabase0);
    }

    @Override  // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "DELETE FROM searchkeyword where date <= (SELECT date FROM searchkeyword Order by date DESC  limit ?,1)";
    }
}


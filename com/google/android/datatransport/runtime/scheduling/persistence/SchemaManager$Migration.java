package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;

public interface SchemaManager.Migration {
    void upgrade(SQLiteDatabase arg1);
}


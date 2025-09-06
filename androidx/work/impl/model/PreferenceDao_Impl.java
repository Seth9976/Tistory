package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import java.util.Collections;
import java.util.List;

public final class PreferenceDao_Impl implements PreferenceDao {
    public final RoomDatabase a;
    public final a b;

    public PreferenceDao_Impl(RoomDatabase roomDatabase0) {
        this.a = roomDatabase0;
        this.b = new a(roomDatabase0, 1);
    }

    @Override  // androidx.work.impl.model.PreferenceDao
    public Long getLongValue(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT long_value FROM Preference where `key`=?", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        this.a.assertNotSuspendingTransaction();
        Long long0 = null;
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            if(cursor0.moveToFirst() && !cursor0.isNull(0)) {
                long0 = cursor0.getLong(0);
            }
            return long0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.PreferenceDao
    public LiveData getObservableLongValue(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT long_value FROM Preference where `key`=?", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        b b0 = new b(0, this, roomSQLiteQuery0);
        return this.a.getInvalidationTracker().createLiveData(new String[]{"Preference"}, false, b0);
    }

    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override  // androidx.work.impl.model.PreferenceDao
    public void insertPreference(Preference preference0) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(preference0);
            this.a.setTransactionSuccessful();
        }
        finally {
            this.a.endTransaction();
        }
    }
}


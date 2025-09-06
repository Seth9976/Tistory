package com.kakao.tistory.data.database.dao;

import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import com.kakao.tistory.data.database.ListStringConverts;
import com.kakao.tistory.data.database.entity.AutoSavedModel;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

public final class AutoSaveDao_Impl implements AutoSaveDao {
    public final RoomDatabase a;
    public final a b;
    public final ListStringConverts c;
    public final b d;

    public AutoSaveDao_Impl(@NonNull RoomDatabase roomDatabase0) {
        this.c = new ListStringConverts();
        this.a = roomDatabase0;
        this.b = new a(this, roomDatabase0);
        this.d = new b(roomDatabase0);
    }

    @Override  // com.kakao.tistory.data.database.dao.AutoSaveDao
    public Object clearAll(Continuation continuation0) {
        d d0 = new d(this);
        return CoroutinesRoom.execute(this.a, true, d0, continuation0);
    }

    @Override  // com.kakao.tistory.data.database.dao.AutoSaveDao
    public Object existSavedPost(String s, long v, Continuation continuation0) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT blogName, entryId, draftSequence FROM auto_save_table WHERE blogName = ? AND entryId =? LIMIT 1", 2);
        roomSQLiteQuery0.bindString(1, s);
        roomSQLiteQuery0.bindLong(2, v);
        CancellationSignal cancellationSignal0 = DBUtil.createCancellationSignal();
        g g0 = new g(this, roomSQLiteQuery0);
        return CoroutinesRoom.execute(this.a, false, cancellationSignal0, g0, continuation0);
    }

    @Override  // com.kakao.tistory.data.database.dao.AutoSaveDao
    public Object existSavedPost(String s, Continuation continuation0) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT blogName, entryId, draftSequence FROM auto_save_table WHERE blogName = ? LIMIT 1", 1);
        roomSQLiteQuery0.bindString(1, s);
        CancellationSignal cancellationSignal0 = DBUtil.createCancellationSignal();
        f f0 = new f(this, roomSQLiteQuery0);
        return CoroutinesRoom.execute(this.a, false, cancellationSignal0, f0, continuation0);
    }

    @Override  // com.kakao.tistory.data.database.dao.AutoSaveDao
    public Object getAutoSavedPost(String s, long v, Continuation continuation0) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT * FROM auto_save_table WHERE blogName = ? AND entryId =? LIMIT 1", 2);
        roomSQLiteQuery0.bindString(1, s);
        roomSQLiteQuery0.bindLong(2, v);
        CancellationSignal cancellationSignal0 = DBUtil.createCancellationSignal();
        e e0 = new e(this, roomSQLiteQuery0);
        return CoroutinesRoom.execute(this.a, false, cancellationSignal0, e0, continuation0);
    }

    @NonNull
    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override  // com.kakao.tistory.data.database.dao.AutoSaveDao
    public Object insertAutoSavedPost(AutoSavedModel autoSavedModel0, Continuation continuation0) {
        c c0 = new c(this, autoSavedModel0);
        return CoroutinesRoom.execute(this.a, true, c0, continuation0);
    }
}


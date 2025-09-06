package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.paging.PositionalDataSource.LoadInitialCallback;
import androidx.paging.PositionalDataSource.LoadInitialParams;
import androidx.paging.PositionalDataSource.LoadRangeCallback;
import androidx.paging.PositionalDataSource.LoadRangeParams;
import androidx.paging.PositionalDataSource;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import x4.a;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public abstract class LimitOffsetDataSource extends PositionalDataSource {
    public final RoomSQLiteQuery e;
    public final String f;
    public final String g;
    public final RoomDatabase h;
    public final a i;
    public final boolean j;
    public final AtomicBoolean k;

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase0, @NonNull RoomSQLiteQuery roomSQLiteQuery0, boolean z, boolean z1, @NonNull String[] arr_s) {
        this.k = new AtomicBoolean(false);
        this.h = roomDatabase0;
        this.e = roomSQLiteQuery0;
        this.j = z;
        this.f = "SELECT COUNT(*) FROM ( " + roomSQLiteQuery0.getSql() + " )";
        this.g = "SELECT * FROM ( " + roomSQLiteQuery0.getSql() + " ) LIMIT ? OFFSET ?";
        this.i = new a(this, arr_s);
        if(z1) {
            this.c();
        }
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase0, @NonNull RoomSQLiteQuery roomSQLiteQuery0, boolean z, @NonNull String[] arr_s) {
        this(roomDatabase0, roomSQLiteQuery0, z, true, arr_s);
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase0, @NonNull SupportSQLiteQuery supportSQLiteQuery0, boolean z, boolean z1, @NonNull String[] arr_s) {
        this(roomDatabase0, RoomSQLiteQuery.copyFrom(supportSQLiteQuery0), z, z1, arr_s);
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase0, @NonNull SupportSQLiteQuery supportSQLiteQuery0, boolean z, @NonNull String[] arr_s) {
        this(roomDatabase0, RoomSQLiteQuery.copyFrom(supportSQLiteQuery0), z, arr_s);
    }

    public final RoomSQLiteQuery b(int v, int v1) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire(this.g, this.e.getArgCount() + 2);
        roomSQLiteQuery0.copyArgumentsFrom(this.e);
        roomSQLiteQuery0.bindLong(roomSQLiteQuery0.getArgCount() - 1, ((long)v1));
        roomSQLiteQuery0.bindLong(roomSQLiteQuery0.getArgCount(), ((long)v));
        return roomSQLiteQuery0;
    }

    public final void c() {
        if(this.k.compareAndSet(false, true)) {
            this.h.getInvalidationTracker().addWeakObserver(this.i);
        }
    }

    @NonNull
    public abstract List convertRows(@NonNull Cursor arg1);

    @RestrictTo({Scope.LIBRARY})
    public int countItems() {
        this.c();
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire(this.f, this.e.getArgCount());
        roomSQLiteQuery0.copyArgumentsFrom(this.e);
        Cursor cursor0 = this.h.query(roomSQLiteQuery0);
        try {
            return cursor0.moveToFirst() ? cursor0.getInt(0) : 0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.paging.DataSource
    public boolean isInvalid() {
        this.c();
        this.h.getInvalidationTracker().refreshVersionsSync();
        return super.isInvalid();
    }

    @Override  // androidx.paging.PositionalDataSource
    public void loadInitial(@NonNull LoadInitialParams positionalDataSource$LoadInitialParams0, @NonNull LoadInitialCallback positionalDataSource$LoadInitialCallback0) {
        int v2;
        RoomSQLiteQuery roomSQLiteQuery1;
        RoomSQLiteQuery roomSQLiteQuery0;
        int v;
        this.c();
        List list0 = Collections.emptyList();
        RoomDatabase roomDatabase0 = this.h;
        roomDatabase0.beginTransaction();
        Cursor cursor0 = null;
        try {
            v = this.countItems();
            if(v == 0) {
                v2 = 0;
                roomSQLiteQuery1 = null;
            }
            else {
                int v1 = PositionalDataSource.computeInitialLoadPosition(positionalDataSource$LoadInitialParams0, v);
                roomSQLiteQuery0 = this.b(v1, PositionalDataSource.computeInitialLoadSize(positionalDataSource$LoadInitialParams0, v1, v));
                try {
                    cursor0 = roomDatabase0.query(roomSQLiteQuery0);
                    List list1 = this.convertRows(cursor0);
                    roomDatabase0.setTransactionSuccessful();
                    roomSQLiteQuery1 = roomSQLiteQuery0;
                    v2 = v1;
                    list0 = list1;
                }
                catch(Throwable throwable0) {
                    goto label_23;
                }
            }
            goto label_29;
        }
        catch(Throwable throwable0) {
            roomSQLiteQuery0 = null;
        }
    label_23:
        if(cursor0 != null) {
            cursor0.close();
        }
        roomDatabase0.endTransaction();
        if(roomSQLiteQuery0 != null) {
            roomSQLiteQuery0.release();
        }
        throw throwable0;
    label_29:
        if(cursor0 != null) {
            cursor0.close();
        }
        roomDatabase0.endTransaction();
        if(roomSQLiteQuery1 != null) {
            roomSQLiteQuery1.release();
        }
        positionalDataSource$LoadInitialCallback0.onResult(list0, v2, v);
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY})
    public List loadRange(int v, int v1) {
        List list0;
        RoomSQLiteQuery roomSQLiteQuery0 = this.b(v, v1);
        RoomDatabase roomDatabase0 = this.h;
        if(this.j) {
            roomDatabase0.beginTransaction();
            Cursor cursor0 = null;
            try {
                cursor0 = roomDatabase0.query(roomSQLiteQuery0);
                list0 = this.convertRows(cursor0);
                roomDatabase0.setTransactionSuccessful();
            }
            catch(Throwable throwable0) {
                if(cursor0 != null) {
                    cursor0.close();
                }
                roomDatabase0.endTransaction();
                roomSQLiteQuery0.release();
                throw throwable0;
            }
            if(cursor0 != null) {
                cursor0.close();
            }
            roomDatabase0.endTransaction();
            roomSQLiteQuery0.release();
            return list0;
        }
        Cursor cursor1 = roomDatabase0.query(roomSQLiteQuery0);
        try {
            return this.convertRows(cursor1);
        }
        finally {
            cursor1.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.paging.PositionalDataSource
    public void loadRange(@NonNull LoadRangeParams positionalDataSource$LoadRangeParams0, @NonNull LoadRangeCallback positionalDataSource$LoadRangeCallback0) {
        positionalDataSource$LoadRangeCallback0.onResult(this.loadRange(positionalDataSource$LoadRangeParams0.startPosition, positionalDataSource$LoadRangeParams0.loadSize));
    }
}


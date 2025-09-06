package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.WorkInfo.State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class l implements Callable {
    public final RoomSQLiteQuery a;
    public final WorkSpecDao_Impl b;

    public l(WorkSpecDao_Impl workSpecDao_Impl0, RoomSQLiteQuery roomSQLiteQuery0) {
        this.b = workSpecDao_Impl0;
        this.a = roomSQLiteQuery0;
    }

    @Override
    public final Object call() {
        WorkSpecDao_Impl workSpecDao_Impl0 = this.b;
        RoomDatabase roomDatabase0 = workSpecDao_Impl0.a;
        workSpecDao_Impl0.a.beginTransaction();
        try {
            Cursor cursor0 = DBUtil.query(roomDatabase0, this.a, true, null);
            try {
                HashMap hashMap0 = new HashMap();
                HashMap hashMap1 = new HashMap();
                while(cursor0.moveToNext()) {
                    String s = cursor0.getString(0);
                    if(((ArrayList)hashMap0.get(s)) == null) {
                        hashMap0.put(s, new ArrayList());
                    }
                    String s1 = cursor0.getString(0);
                    if(((ArrayList)hashMap1.get(s1)) == null) {
                        hashMap1.put(s1, new ArrayList());
                    }
                }
                cursor0.moveToPosition(-1);
                workSpecDao_Impl0.b(hashMap0);
                workSpecDao_Impl0.a(hashMap1);
                ArrayList arrayList0 = new ArrayList(cursor0.getCount());
                while(cursor0.moveToNext()) {
                    String s2 = cursor0.isNull(0) ? null : cursor0.getString(0);
                    State workInfo$State0 = WorkTypeConverters.intToState(cursor0.getInt(1));
                    Data data0 = Data.fromByteArray((cursor0.isNull(2) ? null : cursor0.getBlob(2)));
                    int v2 = cursor0.getInt(3);
                    int v3 = cursor0.getInt(4);
                    long v4 = cursor0.getLong(13);
                    long v5 = cursor0.getLong(14);
                    long v6 = cursor0.getLong(15);
                    BackoffPolicy backoffPolicy0 = WorkTypeConverters.intToBackoffPolicy(cursor0.getInt(16));
                    long v7 = cursor0.getLong(17);
                    long v8 = cursor0.getLong(18);
                    int v9 = cursor0.getInt(19);
                    long v10 = cursor0.getLong(20);
                    int v11 = cursor0.getInt(21);
                    Constraints constraints0 = new Constraints(WorkTypeConverters.intToNetworkType(cursor0.getInt(5)), cursor0.getInt(6) != 0, cursor0.getInt(7) != 0, cursor0.getInt(8) != 0, cursor0.getInt(9) != 0, cursor0.getLong(10), cursor0.getLong(11), WorkTypeConverters.byteArrayToSetOfTriggers((cursor0.isNull(12) ? null : cursor0.getBlob(12))));
                    ArrayList arrayList1 = (ArrayList)hashMap0.get(cursor0.getString(0));
                    if(arrayList1 == null) {
                        arrayList1 = new ArrayList();
                    }
                    ArrayList arrayList2 = (ArrayList)hashMap1.get(cursor0.getString(0));
                    if(arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList0.add(new WorkInfoPojo(s2, workInfo$State0, data0, v4, v5, v6, constraints0, v2, backoffPolicy0, v7, v8, v9, v3, v10, v11, arrayList1, arrayList2));
                }
                roomDatabase0.setTransactionSuccessful();
                return arrayList0;
            }
            finally {
                cursor0.close();
            }
        }
        finally {
            roomDatabase0.endTransaction();
        }
    }

    @Override
    public final void finalize() {
        this.a.release();
    }
}


package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkInfo.State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Callable;

public final class c implements Callable {
    public final SupportSQLiteQuery a;
    public final RawWorkInfoDao_Impl b;

    public c(RawWorkInfoDao_Impl rawWorkInfoDao_Impl0, SupportSQLiteQuery supportSQLiteQuery0) {
        this.b = rawWorkInfoDao_Impl0;
        this.a = supportSQLiteQuery0;
    }

    @Override
    public final Object call() {
        Set set0;
        byte[] arr_b1;
        long v38;
        boolean z7;
        boolean z6;
        boolean z5;
        boolean z4;
        boolean z3;
        boolean z2;
        boolean z1;
        boolean z;
        NetworkType networkType0;
        int v37;
        long v36;
        int v35;
        int v34;
        int v33;
        long v32;
        int v31;
        long v30;
        BackoffPolicy backoffPolicy0;
        int v29;
        long v28;
        long v27;
        long v26;
        Data data0;
        byte[] arr_b;
        State workInfo$State0;
        String s2;
        int v22;
        try {
            RawWorkInfoDao_Impl rawWorkInfoDao_Impl0 = this.b;
            try(Cursor cursor0 = DBUtil.query(rawWorkInfoDao_Impl0.a, this.a, true, null)) {
                int v = CursorUtil.getColumnIndex(cursor0, "id");
                int v1 = CursorUtil.getColumnIndex(cursor0, "state");
                int v2 = CursorUtil.getColumnIndex(cursor0, "output");
                int v3 = CursorUtil.getColumnIndex(cursor0, "initial_delay");
                int v4 = CursorUtil.getColumnIndex(cursor0, "interval_duration");
                int v5 = CursorUtil.getColumnIndex(cursor0, "flex_duration");
                int v6 = CursorUtil.getColumnIndex(cursor0, "run_attempt_count");
                int v7 = CursorUtil.getColumnIndex(cursor0, "backoff_policy");
                int v8 = CursorUtil.getColumnIndex(cursor0, "backoff_delay_duration");
                int v9 = CursorUtil.getColumnIndex(cursor0, "last_enqueue_time");
                int v10 = CursorUtil.getColumnIndex(cursor0, "period_count");
                int v11 = CursorUtil.getColumnIndex(cursor0, "generation");
                int v12 = CursorUtil.getColumnIndex(cursor0, "next_schedule_time_override");
                int v13 = CursorUtil.getColumnIndex(cursor0, "stop_reason");
                int v14 = CursorUtil.getColumnIndex(cursor0, "required_network_type");
                int v15 = CursorUtil.getColumnIndex(cursor0, "requires_charging");
                int v16 = CursorUtil.getColumnIndex(cursor0, "requires_device_idle");
                int v17 = CursorUtil.getColumnIndex(cursor0, "requires_battery_not_low");
                int v18 = CursorUtil.getColumnIndex(cursor0, "requires_storage_not_low");
                int v19 = CursorUtil.getColumnIndex(cursor0, "trigger_content_update_delay");
                int v20 = CursorUtil.getColumnIndex(cursor0, "trigger_max_content_delay");
                int v21 = CursorUtil.getColumnIndex(cursor0, "content_uri_triggers");
                HashMap hashMap0 = new HashMap();
                HashMap hashMap1 = new HashMap();
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    String s = cursor0.getString(v);
                    if(((ArrayList)hashMap0.get(s)) == null) {
                        v22 = v10;
                        hashMap0.put(s, new ArrayList());
                    }
                    else {
                        v22 = v10;
                    }
                    String s1 = cursor0.getString(v);
                    if(((ArrayList)hashMap1.get(s1)) == null) {
                        hashMap1.put(s1, new ArrayList());
                    }
                    v10 = v22;
                }
                int v23 = v11;
                int v24 = v10;
                cursor0.moveToPosition(-1);
                rawWorkInfoDao_Impl0.b(hashMap0);
                rawWorkInfoDao_Impl0.a(hashMap1);
                ArrayList arrayList0 = new ArrayList(cursor0.getCount());
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    if(v == -1) {
                        s2 = null;
                    }
                    else if(!cursor0.isNull(v)) {
                        s2 = cursor0.getString(v);
                    }
                    if(v1 == -1) {
                        workInfo$State0 = null;
                    }
                    else {
                        workInfo$State0 = WorkTypeConverters.intToState(cursor0.getInt(v1));
                    }
                    if(v2 == -1) {
                        data0 = null;
                    }
                    else {
                        if(cursor0.isNull(v2)) {
                            arr_b = null;
                        }
                        else {
                            arr_b = cursor0.getBlob(v2);
                        }
                        data0 = Data.fromByteArray(arr_b);
                    }
                    long v25 = 0L;
                    if(v3 == -1) {
                        v26 = 0L;
                    }
                    else {
                        v26 = cursor0.getLong(v3);
                    }
                    if(v4 == -1) {
                        v27 = 0L;
                    }
                    else {
                        v27 = cursor0.getLong(v4);
                    }
                    if(v5 == -1) {
                        v28 = 0L;
                    }
                    else {
                        v28 = cursor0.getLong(v5);
                    }
                    if(v6 == -1) {
                        v29 = 0;
                    }
                    else {
                        v29 = cursor0.getInt(v6);
                    }
                    if(v7 == -1) {
                        backoffPolicy0 = null;
                    }
                    else {
                        backoffPolicy0 = WorkTypeConverters.intToBackoffPolicy(cursor0.getInt(v7));
                    }
                    if(v8 == -1) {
                        v30 = 0L;
                    }
                    else {
                        v30 = cursor0.getLong(v8);
                    }
                    if(v9 == -1) {
                        v31 = v24;
                        v32 = 0L;
                    }
                    else {
                        v32 = cursor0.getLong(v9);
                        v31 = v24;
                    }
                    if(v31 == -1) {
                        v33 = v23;
                        v34 = 0;
                    }
                    else {
                        v33 = v23;
                        v34 = cursor0.getInt(v31);
                    }
                    if(v33 == -1) {
                        v35 = 0;
                    }
                    else {
                        v35 = cursor0.getInt(v33);
                    }
                    if(v12 == -1) {
                        v36 = 0L;
                    }
                    else {
                        v36 = cursor0.getLong(v12);
                    }
                    if(v13 == -1) {
                        v37 = 0;
                    }
                    else {
                        v37 = cursor0.getInt(v13);
                    }
                    if(v14 == -1) {
                        networkType0 = null;
                    }
                    else {
                        networkType0 = WorkTypeConverters.intToNetworkType(cursor0.getInt(v14));
                    }
                    if(v15 == -1) {
                        z1 = false;
                    }
                    else {
                        if(cursor0.getInt(v15) == 0) {
                            z = false;
                        }
                        else {
                            z = true;
                        }
                        z1 = z;
                    }
                    if(v16 == -1) {
                        z3 = false;
                    }
                    else {
                        if(cursor0.getInt(v16) == 0) {
                            z2 = false;
                        }
                        else {
                            z2 = true;
                        }
                        z3 = z2;
                    }
                    if(v17 == -1) {
                        z5 = false;
                    }
                    else {
                        if(cursor0.getInt(v17) == 0) {
                            z4 = false;
                        }
                        else {
                            z4 = true;
                        }
                        z5 = z4;
                    }
                    if(v18 == -1) {
                        z7 = false;
                    }
                    else {
                        if(cursor0.getInt(v18) == 0) {
                            z6 = false;
                        }
                        else {
                            z6 = true;
                        }
                        z7 = z6;
                    }
                    if(v19 == -1) {
                        v38 = 0L;
                    }
                    else {
                        v38 = cursor0.getLong(v19);
                    }
                    if(v20 != -1) {
                        v25 = cursor0.getLong(v20);
                    }
                    if(v21 == -1) {
                        set0 = null;
                    }
                    else {
                        if(cursor0.isNull(v21)) {
                            arr_b1 = null;
                        }
                        else {
                            arr_b1 = cursor0.getBlob(v21);
                        }
                        set0 = WorkTypeConverters.byteArrayToSetOfTriggers(arr_b1);
                    }
                    Constraints constraints0 = new Constraints(networkType0, z1, z3, z5, z7, v38, v25, set0);
                    ArrayList arrayList1 = (ArrayList)hashMap0.get(cursor0.getString(v));
                    if(arrayList1 == null) {
                        arrayList1 = new ArrayList();
                    }
                    ArrayList arrayList2 = (ArrayList)hashMap1.get(cursor0.getString(v));
                    if(arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList0.add(new WorkInfoPojo(s2, workInfo$State0, data0, v26, v27, v28, constraints0, v29, backoffPolicy0, v30, v32, v34, v35, v36, v37, arrayList1, arrayList2));
                    v24 = v31;
                    v23 = v33;
                }
            }
            return arrayList0;
        }
        catch(Throwable throwable0) {
            throw throwable0;
        }
    }
}


package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkInfo.State;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.Flow;

public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {
    public final RoomDatabase a;

    public RawWorkInfoDao_Impl(RoomDatabase roomDatabase0) {
        this.a = roomDatabase0;
    }

    public final void a(HashMap hashMap0) {
        byte[] arr_b;
        Set set0 = hashMap0.keySet();
        if(set0.isEmpty()) {
            return;
        }
        if(hashMap0.size() > 999) {
            HashMap hashMap1 = new HashMap(999);
            Iterator iterator0 = set0.iterator();
        alab1:
            while(true) {
                int v;
                for(v = 0; true; ++v) {
                    if(!iterator0.hasNext()) {
                        break alab1;
                    }
                    Object object0 = iterator0.next();
                    hashMap1.put(((String)object0), ((ArrayList)hashMap0.get(((String)object0))));
                    if(v + 1 == 999) {
                        this.a(hashMap1);
                        hashMap1 = new HashMap(999);
                        break;
                    }
                }
            }
            if(v > 0) {
                this.a(hashMap1);
            }
            return;
        }
        StringBuilder stringBuilder0 = StringUtil.newStringBuilder();
        stringBuilder0.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int v1 = set0.size();
        StringUtil.appendPlaceholders(stringBuilder0, v1);
        stringBuilder0.append(")");
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire(stringBuilder0.toString(), v1);
        int v2 = 1;
        for(Object object1: set0) {
            String s = (String)object1;
            if(s == null) {
                roomSQLiteQuery0.bindNull(v2);
            }
            else {
                roomSQLiteQuery0.bindString(v2, s);
            }
            ++v2;
        }
        try(Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null)) {
            int v3 = CursorUtil.getColumnIndex(cursor0, "work_spec_id");
            if(v3 != -1) {
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    ArrayList arrayList0 = (ArrayList)hashMap0.get(cursor0.getString(v3));
                    if(arrayList0 != null) {
                        arr_b = cursor0.isNull(0) ? null : cursor0.getBlob(0);
                        arrayList0.add(Data.fromByteArray(arr_b));
                    }
                }
            }
        }
    }

    public final void b(HashMap hashMap0) {
        String s1;
        Set set0 = hashMap0.keySet();
        if(set0.isEmpty()) {
            return;
        }
        if(hashMap0.size() > 999) {
            HashMap hashMap1 = new HashMap(999);
            Iterator iterator0 = set0.iterator();
        alab1:
            while(true) {
                int v;
                for(v = 0; true; ++v) {
                    if(!iterator0.hasNext()) {
                        break alab1;
                    }
                    Object object0 = iterator0.next();
                    hashMap1.put(((String)object0), ((ArrayList)hashMap0.get(((String)object0))));
                    if(v + 1 == 999) {
                        this.b(hashMap1);
                        hashMap1 = new HashMap(999);
                        break;
                    }
                }
            }
            if(v > 0) {
                this.b(hashMap1);
            }
            return;
        }
        StringBuilder stringBuilder0 = StringUtil.newStringBuilder();
        stringBuilder0.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int v1 = set0.size();
        StringUtil.appendPlaceholders(stringBuilder0, v1);
        stringBuilder0.append(")");
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire(stringBuilder0.toString(), v1);
        int v2 = 1;
        for(Object object1: set0) {
            String s = (String)object1;
            if(s == null) {
                roomSQLiteQuery0.bindNull(v2);
            }
            else {
                roomSQLiteQuery0.bindString(v2, s);
            }
            ++v2;
        }
        try(Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null)) {
            int v3 = CursorUtil.getColumnIndex(cursor0, "work_spec_id");
            if(v3 != -1) {
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    ArrayList arrayList0 = (ArrayList)hashMap0.get(cursor0.getString(v3));
                    if(arrayList0 != null) {
                        s1 = cursor0.isNull(0) ? null : cursor0.getString(0);
                        arrayList0.add(s1);
                    }
                }
            }
        }
    }

    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override  // androidx.work.impl.model.RawWorkInfoDao
    public List getWorkInfoPojos(SupportSQLiteQuery supportSQLiteQuery0) {
        Set set0;
        byte[] arr_b1;
        long v36;
        boolean z6;
        boolean z5;
        boolean z4;
        boolean z3;
        boolean z2;
        boolean z1;
        NetworkType networkType0;
        int v35;
        long v34;
        int v33;
        int v32;
        long v31;
        int v30;
        long v29;
        BackoffPolicy backoffPolicy0;
        int v28;
        long v27;
        long v26;
        long v25;
        Data data0;
        byte[] arr_b;
        State workInfo$State0;
        String s2;
        int v22;
        try {
            this.a.assertNotSuspendingTransaction();
            try(Cursor cursor0 = DBUtil.query(this.a, supportSQLiteQuery0, true, null)) {
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
                int v23 = v10;
                cursor0.moveToPosition(-1);
                this.b(hashMap0);
                this.a(hashMap1);
                List list0 = new ArrayList(cursor0.getCount());
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
                    long v24 = 0L;
                    if(v3 == -1) {
                        v25 = 0L;
                    }
                    else {
                        v25 = cursor0.getLong(v3);
                    }
                    if(v4 == -1) {
                        v26 = 0L;
                    }
                    else {
                        v26 = cursor0.getLong(v4);
                    }
                    if(v5 == -1) {
                        v27 = 0L;
                    }
                    else {
                        v27 = cursor0.getLong(v5);
                    }
                    boolean z = false;
                    if(v6 == -1) {
                        v28 = 0;
                    }
                    else {
                        v28 = cursor0.getInt(v6);
                    }
                    if(v7 == -1) {
                        backoffPolicy0 = null;
                    }
                    else {
                        backoffPolicy0 = WorkTypeConverters.intToBackoffPolicy(cursor0.getInt(v7));
                    }
                    if(v8 == -1) {
                        v29 = 0L;
                    }
                    else {
                        v29 = cursor0.getLong(v8);
                    }
                    if(v9 == -1) {
                        v30 = v23;
                        v31 = 0L;
                    }
                    else {
                        v31 = cursor0.getLong(v9);
                        v30 = v23;
                    }
                    if(v30 == -1) {
                        v32 = 0;
                    }
                    else {
                        v32 = cursor0.getInt(v30);
                    }
                    if(v11 == -1) {
                        v33 = 0;
                    }
                    else {
                        v33 = cursor0.getInt(v11);
                    }
                    if(v12 == -1) {
                        v34 = 0L;
                    }
                    else {
                        v34 = cursor0.getLong(v12);
                    }
                    if(v13 == -1) {
                        v35 = 0;
                    }
                    else {
                        v35 = cursor0.getInt(v13);
                    }
                    if(v14 == -1) {
                        networkType0 = null;
                    }
                    else {
                        networkType0 = WorkTypeConverters.intToNetworkType(cursor0.getInt(v14));
                    }
                    if(v15 == -1) {
                        z2 = false;
                    }
                    else {
                        if(cursor0.getInt(v15) == 0) {
                            z1 = false;
                        }
                        else {
                            z1 = true;
                        }
                        z2 = z1;
                    }
                    if(v16 == -1) {
                        z4 = false;
                    }
                    else {
                        if(cursor0.getInt(v16) == 0) {
                            z3 = false;
                        }
                        else {
                            z3 = true;
                        }
                        z4 = z3;
                    }
                    if(v17 == -1) {
                        z6 = false;
                    }
                    else {
                        if(cursor0.getInt(v17) == 0) {
                            z5 = false;
                        }
                        else {
                            z5 = true;
                        }
                        z6 = z5;
                    }
                    if(v18 != -1 && cursor0.getInt(v18) != 0) {
                        z = true;
                    }
                    if(v19 == -1) {
                        v36 = 0L;
                    }
                    else {
                        v36 = cursor0.getLong(v19);
                    }
                    if(v20 != -1) {
                        v24 = cursor0.getLong(v20);
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
                    Constraints constraints0 = new Constraints(networkType0, z2, z4, z6, z, v36, v24, set0);
                    ArrayList arrayList0 = (ArrayList)hashMap0.get(cursor0.getString(v));
                    if(arrayList0 == null) {
                        arrayList0 = new ArrayList();
                    }
                    ArrayList arrayList1 = (ArrayList)hashMap1.get(cursor0.getString(v));
                    if(arrayList1 == null) {
                        arrayList1 = new ArrayList();
                    }
                    ((ArrayList)list0).add(new WorkInfoPojo(s2, workInfo$State0, data0, v25, v26, v27, constraints0, v28, backoffPolicy0, v29, v31, v32, v33, v34, v35, arrayList0, arrayList1));
                    v23 = v30;
                }
                return list0;
            }
        }
        catch(Throwable throwable0) {
            throw throwable0;
        }
    }

    @Override  // androidx.work.impl.model.RawWorkInfoDao
    public Flow getWorkInfoPojosFlow(SupportSQLiteQuery supportSQLiteQuery0) {
        d d0 = new d(this, supportSQLiteQuery0);
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, d0);
    }

    @Override  // androidx.work.impl.model.RawWorkInfoDao
    public LiveData getWorkInfoPojosLiveData(SupportSQLiteQuery supportSQLiteQuery0) {
        c c0 = new c(this, supportSQLiteQuery0);
        return this.a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, c0);
    }
}


package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo.State;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.Flow;

public final class WorkSpecDao_Impl implements WorkSpecDao {
    public final RoomDatabase a;
    public final h b;
    public final n c;
    public final e d;
    public final e e;
    public final e f;
    public final e g;
    public final e h;
    public final e i;
    public final e j;
    public final e k;
    public final e l;
    public final e m;
    public final e n;
    public final e o;
    public final e p;
    public final e q;
    public final e r;

    public WorkSpecDao_Impl(RoomDatabase roomDatabase0) {
        this.a = roomDatabase0;
        this.b = new h(roomDatabase0);  // 初始化器: Landroidx/room/EntityInsertionAdapter;-><init>(Landroidx/room/RoomDatabase;)V
        this.c = new n(roomDatabase0);  // 初始化器: Landroidx/room/EntityDeletionOrUpdateAdapter;-><init>(Landroidx/room/RoomDatabase;)V
        this.d = new e(roomDatabase0, 12);
        this.e = new e(roomDatabase0, 13);
        this.f = new e(roomDatabase0, 14);
        this.g = new e(roomDatabase0, 15);
        this.h = new e(roomDatabase0, 16);
        this.i = new e(roomDatabase0, 17);
        this.j = new e(roomDatabase0, 18);
        this.k = new e(roomDatabase0, 4);
        this.l = new e(roomDatabase0, 5);
        this.m = new e(roomDatabase0, 6);
        this.n = new e(roomDatabase0, 7);
        this.o = new e(roomDatabase0, 8);
        this.p = new e(roomDatabase0, 9);
        this.q = new e(roomDatabase0, 10);
        this.r = new e(roomDatabase0, 11);
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

    @Override  // androidx.work.impl.model.WorkSpecDao
    public int countNonFinishedContentUriTriggerWorkers() {
        int v = 0;
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            if(cursor0.moveToFirst()) {
                v = cursor0.getInt(0);
            }
            return v;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void delete(String s) {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.d;
        SupportSQLiteStatement supportSQLiteStatement0 = e0.acquire();
        if(s == null) {
            supportSQLiteStatement0.bindNull(1);
        }
        else {
            supportSQLiteStatement0.bindString(1, s);
        }
        roomDatabase0.beginTransaction();
        try {
            supportSQLiteStatement0.executeUpdateDelete();
            roomDatabase0.setTransactionSuccessful();
        }
        finally {
            roomDatabase0.endTransaction();
            e0.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List getAllEligibleWorkSpecsForScheduling(int v) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        roomSQLiteQuery0.bindLong(1, ((long)v));
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            int v2 = CursorUtil.getColumnIndexOrThrow(cursor0, "id");
            int v3 = CursorUtil.getColumnIndexOrThrow(cursor0, "state");
            int v4 = CursorUtil.getColumnIndexOrThrow(cursor0, "worker_class_name");
            int v5 = CursorUtil.getColumnIndexOrThrow(cursor0, "input_merger_class_name");
            int v6 = CursorUtil.getColumnIndexOrThrow(cursor0, "input");
            int v7 = CursorUtil.getColumnIndexOrThrow(cursor0, "output");
            int v8 = CursorUtil.getColumnIndexOrThrow(cursor0, "initial_delay");
            int v9 = CursorUtil.getColumnIndexOrThrow(cursor0, "interval_duration");
            int v10 = CursorUtil.getColumnIndexOrThrow(cursor0, "flex_duration");
            int v11 = CursorUtil.getColumnIndexOrThrow(cursor0, "run_attempt_count");
            int v12 = CursorUtil.getColumnIndexOrThrow(cursor0, "backoff_policy");
            int v13 = CursorUtil.getColumnIndexOrThrow(cursor0, "backoff_delay_duration");
            int v14 = CursorUtil.getColumnIndexOrThrow(cursor0, "last_enqueue_time");
            int v15 = CursorUtil.getColumnIndexOrThrow(cursor0, "minimum_retention_duration");
            int v16 = CursorUtil.getColumnIndexOrThrow(cursor0, "schedule_requested_at");
            int v17 = CursorUtil.getColumnIndexOrThrow(cursor0, "run_in_foreground");
            int v18 = CursorUtil.getColumnIndexOrThrow(cursor0, "out_of_quota_policy");
            int v19 = CursorUtil.getColumnIndexOrThrow(cursor0, "period_count");
            int v20 = CursorUtil.getColumnIndexOrThrow(cursor0, "generation");
            int v21 = CursorUtil.getColumnIndexOrThrow(cursor0, "next_schedule_time_override");
            int v22 = CursorUtil.getColumnIndexOrThrow(cursor0, "next_schedule_time_override_generation");
            int v23 = CursorUtil.getColumnIndexOrThrow(cursor0, "stop_reason");
            int v24 = CursorUtil.getColumnIndexOrThrow(cursor0, "required_network_type");
            int v25 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_charging");
            int v26 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_device_idle");
            int v27 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_battery_not_low");
            int v28 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_storage_not_low");
            int v29 = CursorUtil.getColumnIndexOrThrow(cursor0, "trigger_content_update_delay");
            int v30 = CursorUtil.getColumnIndexOrThrow(cursor0, "trigger_max_content_delay");
            int v31 = CursorUtil.getColumnIndexOrThrow(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.isNull(v2) ? null : cursor0.getString(v2);
                State workInfo$State0 = WorkTypeConverters.intToState(cursor0.getInt(v3));
                String s1 = cursor0.isNull(v4) ? null : cursor0.getString(v4);
                String s2 = cursor0.isNull(v5) ? null : cursor0.getString(v5);
                Data data0 = Data.fromByteArray((cursor0.isNull(v6) ? null : cursor0.getBlob(v6)));
                Data data1 = Data.fromByteArray((cursor0.isNull(v7) ? null : cursor0.getBlob(v7)));
                long v32 = cursor0.getLong(v8);
                long v33 = cursor0.getLong(v9);
                long v34 = cursor0.getLong(v10);
                int v35 = cursor0.getInt(v11);
                BackoffPolicy backoffPolicy0 = WorkTypeConverters.intToBackoffPolicy(cursor0.getInt(v12));
                long v36 = cursor0.getLong(v13);
                long v37 = cursor0.getLong(v14);
                long v38 = cursor0.getLong(v15);
                long v39 = cursor0.getLong(v16);
                boolean z = cursor0.getInt(v17) != 0;
                OutOfQuotaPolicy outOfQuotaPolicy0 = WorkTypeConverters.intToOutOfQuotaPolicy(cursor0.getInt(v18));
                int v40 = cursor0.getInt(v19);
                int v41 = cursor0.getInt(v20);
                long v42 = cursor0.getLong(v21);
                int v43 = cursor0.getInt(v22);
                int v44 = cursor0.getInt(v23);
                ((ArrayList)list0).add(new WorkSpec(s, workInfo$State0, s1, s2, data0, data1, v32, v33, v34, new Constraints(WorkTypeConverters.intToNetworkType(cursor0.getInt(v24)), cursor0.getInt(v25) != 0, cursor0.getInt(v26) != 0, cursor0.getInt(v27) != 0, cursor0.getInt(v28) != 0, cursor0.getLong(v29), cursor0.getLong(v30), WorkTypeConverters.byteArrayToSetOfTriggers((cursor0.isNull(v31) ? null : cursor0.getBlob(v31)))), v35, backoffPolicy0, v36, v37, v38, v39, z, outOfQuotaPolicy0, v40, v41, v42, v43, v44));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List getAllUnfinishedWork() {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                ((ArrayList)list0).add((cursor0.isNull(0) ? null : cursor0.getString(0)));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List getAllWorkSpecIds() {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                ((ArrayList)list0).add((cursor0.isNull(0) ? null : cursor0.getString(0)));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public LiveData getAllWorkSpecIdsLiveData() {
        f f0 = new f(this, RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0), 0);
        return this.a.getInvalidationTracker().createLiveData(new String[]{"workspec"}, true, f0);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List getEligibleWorkForScheduling(int v) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        roomSQLiteQuery0.bindLong(1, ((long)v));
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            int v2 = CursorUtil.getColumnIndexOrThrow(cursor0, "id");
            int v3 = CursorUtil.getColumnIndexOrThrow(cursor0, "state");
            int v4 = CursorUtil.getColumnIndexOrThrow(cursor0, "worker_class_name");
            int v5 = CursorUtil.getColumnIndexOrThrow(cursor0, "input_merger_class_name");
            int v6 = CursorUtil.getColumnIndexOrThrow(cursor0, "input");
            int v7 = CursorUtil.getColumnIndexOrThrow(cursor0, "output");
            int v8 = CursorUtil.getColumnIndexOrThrow(cursor0, "initial_delay");
            int v9 = CursorUtil.getColumnIndexOrThrow(cursor0, "interval_duration");
            int v10 = CursorUtil.getColumnIndexOrThrow(cursor0, "flex_duration");
            int v11 = CursorUtil.getColumnIndexOrThrow(cursor0, "run_attempt_count");
            int v12 = CursorUtil.getColumnIndexOrThrow(cursor0, "backoff_policy");
            int v13 = CursorUtil.getColumnIndexOrThrow(cursor0, "backoff_delay_duration");
            int v14 = CursorUtil.getColumnIndexOrThrow(cursor0, "last_enqueue_time");
            int v15 = CursorUtil.getColumnIndexOrThrow(cursor0, "minimum_retention_duration");
            int v16 = CursorUtil.getColumnIndexOrThrow(cursor0, "schedule_requested_at");
            int v17 = CursorUtil.getColumnIndexOrThrow(cursor0, "run_in_foreground");
            int v18 = CursorUtil.getColumnIndexOrThrow(cursor0, "out_of_quota_policy");
            int v19 = CursorUtil.getColumnIndexOrThrow(cursor0, "period_count");
            int v20 = CursorUtil.getColumnIndexOrThrow(cursor0, "generation");
            int v21 = CursorUtil.getColumnIndexOrThrow(cursor0, "next_schedule_time_override");
            int v22 = CursorUtil.getColumnIndexOrThrow(cursor0, "next_schedule_time_override_generation");
            int v23 = CursorUtil.getColumnIndexOrThrow(cursor0, "stop_reason");
            int v24 = CursorUtil.getColumnIndexOrThrow(cursor0, "required_network_type");
            int v25 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_charging");
            int v26 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_device_idle");
            int v27 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_battery_not_low");
            int v28 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_storage_not_low");
            int v29 = CursorUtil.getColumnIndexOrThrow(cursor0, "trigger_content_update_delay");
            int v30 = CursorUtil.getColumnIndexOrThrow(cursor0, "trigger_max_content_delay");
            int v31 = CursorUtil.getColumnIndexOrThrow(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.isNull(v2) ? null : cursor0.getString(v2);
                State workInfo$State0 = WorkTypeConverters.intToState(cursor0.getInt(v3));
                String s1 = cursor0.isNull(v4) ? null : cursor0.getString(v4);
                String s2 = cursor0.isNull(v5) ? null : cursor0.getString(v5);
                Data data0 = Data.fromByteArray((cursor0.isNull(v6) ? null : cursor0.getBlob(v6)));
                Data data1 = Data.fromByteArray((cursor0.isNull(v7) ? null : cursor0.getBlob(v7)));
                long v32 = cursor0.getLong(v8);
                long v33 = cursor0.getLong(v9);
                long v34 = cursor0.getLong(v10);
                int v35 = cursor0.getInt(v11);
                BackoffPolicy backoffPolicy0 = WorkTypeConverters.intToBackoffPolicy(cursor0.getInt(v12));
                long v36 = cursor0.getLong(v13);
                long v37 = cursor0.getLong(v14);
                long v38 = cursor0.getLong(v15);
                long v39 = cursor0.getLong(v16);
                boolean z = cursor0.getInt(v17) != 0;
                OutOfQuotaPolicy outOfQuotaPolicy0 = WorkTypeConverters.intToOutOfQuotaPolicy(cursor0.getInt(v18));
                int v40 = cursor0.getInt(v19);
                int v41 = cursor0.getInt(v20);
                long v42 = cursor0.getLong(v21);
                int v43 = cursor0.getInt(v22);
                int v44 = cursor0.getInt(v23);
                ((ArrayList)list0).add(new WorkSpec(s, workInfo$State0, s1, s2, data0, data1, v32, v33, v34, new Constraints(WorkTypeConverters.intToNetworkType(cursor0.getInt(v24)), cursor0.getInt(v25) != 0, cursor0.getInt(v26) != 0, cursor0.getInt(v27) != 0, cursor0.getInt(v28) != 0, cursor0.getLong(v29), cursor0.getLong(v30), WorkTypeConverters.byteArrayToSetOfTriggers((cursor0.isNull(v31) ? null : cursor0.getBlob(v31)))), v35, backoffPolicy0, v36, v37, v38, v39, z, outOfQuotaPolicy0, v40, v41, v42, v43, v44));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List getEligibleWorkForSchedulingWithContentUris() {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            int v1 = CursorUtil.getColumnIndexOrThrow(cursor0, "id");
            int v2 = CursorUtil.getColumnIndexOrThrow(cursor0, "state");
            int v3 = CursorUtil.getColumnIndexOrThrow(cursor0, "worker_class_name");
            int v4 = CursorUtil.getColumnIndexOrThrow(cursor0, "input_merger_class_name");
            int v5 = CursorUtil.getColumnIndexOrThrow(cursor0, "input");
            int v6 = CursorUtil.getColumnIndexOrThrow(cursor0, "output");
            int v7 = CursorUtil.getColumnIndexOrThrow(cursor0, "initial_delay");
            int v8 = CursorUtil.getColumnIndexOrThrow(cursor0, "interval_duration");
            int v9 = CursorUtil.getColumnIndexOrThrow(cursor0, "flex_duration");
            int v10 = CursorUtil.getColumnIndexOrThrow(cursor0, "run_attempt_count");
            int v11 = CursorUtil.getColumnIndexOrThrow(cursor0, "backoff_policy");
            int v12 = CursorUtil.getColumnIndexOrThrow(cursor0, "backoff_delay_duration");
            int v13 = CursorUtil.getColumnIndexOrThrow(cursor0, "last_enqueue_time");
            int v14 = CursorUtil.getColumnIndexOrThrow(cursor0, "minimum_retention_duration");
            int v15 = CursorUtil.getColumnIndexOrThrow(cursor0, "schedule_requested_at");
            int v16 = CursorUtil.getColumnIndexOrThrow(cursor0, "run_in_foreground");
            int v17 = CursorUtil.getColumnIndexOrThrow(cursor0, "out_of_quota_policy");
            int v18 = CursorUtil.getColumnIndexOrThrow(cursor0, "period_count");
            int v19 = CursorUtil.getColumnIndexOrThrow(cursor0, "generation");
            int v20 = CursorUtil.getColumnIndexOrThrow(cursor0, "next_schedule_time_override");
            int v21 = CursorUtil.getColumnIndexOrThrow(cursor0, "next_schedule_time_override_generation");
            int v22 = CursorUtil.getColumnIndexOrThrow(cursor0, "stop_reason");
            int v23 = CursorUtil.getColumnIndexOrThrow(cursor0, "required_network_type");
            int v24 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_charging");
            int v25 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_device_idle");
            int v26 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_battery_not_low");
            int v27 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_storage_not_low");
            int v28 = CursorUtil.getColumnIndexOrThrow(cursor0, "trigger_content_update_delay");
            int v29 = CursorUtil.getColumnIndexOrThrow(cursor0, "trigger_max_content_delay");
            int v30 = CursorUtil.getColumnIndexOrThrow(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.isNull(v1) ? null : cursor0.getString(v1);
                State workInfo$State0 = WorkTypeConverters.intToState(cursor0.getInt(v2));
                String s1 = cursor0.isNull(v3) ? null : cursor0.getString(v3);
                String s2 = cursor0.isNull(v4) ? null : cursor0.getString(v4);
                Data data0 = Data.fromByteArray((cursor0.isNull(v5) ? null : cursor0.getBlob(v5)));
                Data data1 = Data.fromByteArray((cursor0.isNull(v6) ? null : cursor0.getBlob(v6)));
                long v31 = cursor0.getLong(v7);
                long v32 = cursor0.getLong(v8);
                long v33 = cursor0.getLong(v9);
                int v34 = cursor0.getInt(v10);
                BackoffPolicy backoffPolicy0 = WorkTypeConverters.intToBackoffPolicy(cursor0.getInt(v11));
                long v35 = cursor0.getLong(v12);
                long v36 = cursor0.getLong(v13);
                long v37 = cursor0.getLong(v14);
                long v38 = cursor0.getLong(v15);
                boolean z = cursor0.getInt(v16) != 0;
                OutOfQuotaPolicy outOfQuotaPolicy0 = WorkTypeConverters.intToOutOfQuotaPolicy(cursor0.getInt(v17));
                int v39 = cursor0.getInt(v18);
                int v40 = cursor0.getInt(v19);
                long v41 = cursor0.getLong(v20);
                int v42 = cursor0.getInt(v21);
                int v43 = cursor0.getInt(v22);
                ((ArrayList)list0).add(new WorkSpec(s, workInfo$State0, s1, s2, data0, data1, v31, v32, v33, new Constraints(WorkTypeConverters.intToNetworkType(cursor0.getInt(v23)), cursor0.getInt(v24) != 0, cursor0.getInt(v25) != 0, cursor0.getInt(v26) != 0, cursor0.getInt(v27) != 0, cursor0.getLong(v28), cursor0.getLong(v29), WorkTypeConverters.byteArrayToSetOfTriggers((cursor0.isNull(v30) ? null : cursor0.getBlob(v30)))), v34, backoffPolicy0, v35, v36, v37, v38, z, outOfQuotaPolicy0, v39, v40, v41, v42, v43));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List getInputsFromPrerequisites(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                ((ArrayList)list0).add(Data.fromByteArray((cursor0.isNull(0) ? null : cursor0.getBlob(0))));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List getRecentlyCompletedWork(long v) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        roomSQLiteQuery0.bindLong(1, v);
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            int v2 = CursorUtil.getColumnIndexOrThrow(cursor0, "id");
            int v3 = CursorUtil.getColumnIndexOrThrow(cursor0, "state");
            int v4 = CursorUtil.getColumnIndexOrThrow(cursor0, "worker_class_name");
            int v5 = CursorUtil.getColumnIndexOrThrow(cursor0, "input_merger_class_name");
            int v6 = CursorUtil.getColumnIndexOrThrow(cursor0, "input");
            int v7 = CursorUtil.getColumnIndexOrThrow(cursor0, "output");
            int v8 = CursorUtil.getColumnIndexOrThrow(cursor0, "initial_delay");
            int v9 = CursorUtil.getColumnIndexOrThrow(cursor0, "interval_duration");
            int v10 = CursorUtil.getColumnIndexOrThrow(cursor0, "flex_duration");
            int v11 = CursorUtil.getColumnIndexOrThrow(cursor0, "run_attempt_count");
            int v12 = CursorUtil.getColumnIndexOrThrow(cursor0, "backoff_policy");
            int v13 = CursorUtil.getColumnIndexOrThrow(cursor0, "backoff_delay_duration");
            int v14 = CursorUtil.getColumnIndexOrThrow(cursor0, "last_enqueue_time");
            int v15 = CursorUtil.getColumnIndexOrThrow(cursor0, "minimum_retention_duration");
            int v16 = CursorUtil.getColumnIndexOrThrow(cursor0, "schedule_requested_at");
            int v17 = CursorUtil.getColumnIndexOrThrow(cursor0, "run_in_foreground");
            int v18 = CursorUtil.getColumnIndexOrThrow(cursor0, "out_of_quota_policy");
            int v19 = CursorUtil.getColumnIndexOrThrow(cursor0, "period_count");
            int v20 = CursorUtil.getColumnIndexOrThrow(cursor0, "generation");
            int v21 = CursorUtil.getColumnIndexOrThrow(cursor0, "next_schedule_time_override");
            int v22 = CursorUtil.getColumnIndexOrThrow(cursor0, "next_schedule_time_override_generation");
            int v23 = CursorUtil.getColumnIndexOrThrow(cursor0, "stop_reason");
            int v24 = CursorUtil.getColumnIndexOrThrow(cursor0, "required_network_type");
            int v25 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_charging");
            int v26 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_device_idle");
            int v27 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_battery_not_low");
            int v28 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_storage_not_low");
            int v29 = CursorUtil.getColumnIndexOrThrow(cursor0, "trigger_content_update_delay");
            int v30 = CursorUtil.getColumnIndexOrThrow(cursor0, "trigger_max_content_delay");
            int v31 = CursorUtil.getColumnIndexOrThrow(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.isNull(v2) ? null : cursor0.getString(v2);
                State workInfo$State0 = WorkTypeConverters.intToState(cursor0.getInt(v3));
                String s1 = cursor0.isNull(v4) ? null : cursor0.getString(v4);
                String s2 = cursor0.isNull(v5) ? null : cursor0.getString(v5);
                Data data0 = Data.fromByteArray((cursor0.isNull(v6) ? null : cursor0.getBlob(v6)));
                Data data1 = Data.fromByteArray((cursor0.isNull(v7) ? null : cursor0.getBlob(v7)));
                long v32 = cursor0.getLong(v8);
                long v33 = cursor0.getLong(v9);
                long v34 = cursor0.getLong(v10);
                int v35 = cursor0.getInt(v11);
                BackoffPolicy backoffPolicy0 = WorkTypeConverters.intToBackoffPolicy(cursor0.getInt(v12));
                long v36 = cursor0.getLong(v13);
                long v37 = cursor0.getLong(v14);
                long v38 = cursor0.getLong(v15);
                long v39 = cursor0.getLong(v16);
                boolean z = cursor0.getInt(v17) != 0;
                OutOfQuotaPolicy outOfQuotaPolicy0 = WorkTypeConverters.intToOutOfQuotaPolicy(cursor0.getInt(v18));
                int v40 = cursor0.getInt(v19);
                int v41 = cursor0.getInt(v20);
                long v42 = cursor0.getLong(v21);
                int v43 = cursor0.getInt(v22);
                int v44 = cursor0.getInt(v23);
                ((ArrayList)list0).add(new WorkSpec(s, workInfo$State0, s1, s2, data0, data1, v32, v33, v34, new Constraints(WorkTypeConverters.intToNetworkType(cursor0.getInt(v24)), cursor0.getInt(v25) != 0, cursor0.getInt(v26) != 0, cursor0.getInt(v27) != 0, cursor0.getInt(v28) != 0, cursor0.getLong(v29), cursor0.getLong(v30), WorkTypeConverters.byteArrayToSetOfTriggers((cursor0.isNull(v31) ? null : cursor0.getBlob(v31)))), v35, backoffPolicy0, v36, v37, v38, v39, z, outOfQuotaPolicy0, v40, v41, v42, v43, v44));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List getRunningWork() {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=1", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            int v1 = CursorUtil.getColumnIndexOrThrow(cursor0, "id");
            int v2 = CursorUtil.getColumnIndexOrThrow(cursor0, "state");
            int v3 = CursorUtil.getColumnIndexOrThrow(cursor0, "worker_class_name");
            int v4 = CursorUtil.getColumnIndexOrThrow(cursor0, "input_merger_class_name");
            int v5 = CursorUtil.getColumnIndexOrThrow(cursor0, "input");
            int v6 = CursorUtil.getColumnIndexOrThrow(cursor0, "output");
            int v7 = CursorUtil.getColumnIndexOrThrow(cursor0, "initial_delay");
            int v8 = CursorUtil.getColumnIndexOrThrow(cursor0, "interval_duration");
            int v9 = CursorUtil.getColumnIndexOrThrow(cursor0, "flex_duration");
            int v10 = CursorUtil.getColumnIndexOrThrow(cursor0, "run_attempt_count");
            int v11 = CursorUtil.getColumnIndexOrThrow(cursor0, "backoff_policy");
            int v12 = CursorUtil.getColumnIndexOrThrow(cursor0, "backoff_delay_duration");
            int v13 = CursorUtil.getColumnIndexOrThrow(cursor0, "last_enqueue_time");
            int v14 = CursorUtil.getColumnIndexOrThrow(cursor0, "minimum_retention_duration");
            int v15 = CursorUtil.getColumnIndexOrThrow(cursor0, "schedule_requested_at");
            int v16 = CursorUtil.getColumnIndexOrThrow(cursor0, "run_in_foreground");
            int v17 = CursorUtil.getColumnIndexOrThrow(cursor0, "out_of_quota_policy");
            int v18 = CursorUtil.getColumnIndexOrThrow(cursor0, "period_count");
            int v19 = CursorUtil.getColumnIndexOrThrow(cursor0, "generation");
            int v20 = CursorUtil.getColumnIndexOrThrow(cursor0, "next_schedule_time_override");
            int v21 = CursorUtil.getColumnIndexOrThrow(cursor0, "next_schedule_time_override_generation");
            int v22 = CursorUtil.getColumnIndexOrThrow(cursor0, "stop_reason");
            int v23 = CursorUtil.getColumnIndexOrThrow(cursor0, "required_network_type");
            int v24 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_charging");
            int v25 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_device_idle");
            int v26 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_battery_not_low");
            int v27 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_storage_not_low");
            int v28 = CursorUtil.getColumnIndexOrThrow(cursor0, "trigger_content_update_delay");
            int v29 = CursorUtil.getColumnIndexOrThrow(cursor0, "trigger_max_content_delay");
            int v30 = CursorUtil.getColumnIndexOrThrow(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.isNull(v1) ? null : cursor0.getString(v1);
                State workInfo$State0 = WorkTypeConverters.intToState(cursor0.getInt(v2));
                String s1 = cursor0.isNull(v3) ? null : cursor0.getString(v3);
                String s2 = cursor0.isNull(v4) ? null : cursor0.getString(v4);
                Data data0 = Data.fromByteArray((cursor0.isNull(v5) ? null : cursor0.getBlob(v5)));
                Data data1 = Data.fromByteArray((cursor0.isNull(v6) ? null : cursor0.getBlob(v6)));
                long v31 = cursor0.getLong(v7);
                long v32 = cursor0.getLong(v8);
                long v33 = cursor0.getLong(v9);
                int v34 = cursor0.getInt(v10);
                BackoffPolicy backoffPolicy0 = WorkTypeConverters.intToBackoffPolicy(cursor0.getInt(v11));
                long v35 = cursor0.getLong(v12);
                long v36 = cursor0.getLong(v13);
                long v37 = cursor0.getLong(v14);
                long v38 = cursor0.getLong(v15);
                boolean z = cursor0.getInt(v16) != 0;
                OutOfQuotaPolicy outOfQuotaPolicy0 = WorkTypeConverters.intToOutOfQuotaPolicy(cursor0.getInt(v17));
                int v39 = cursor0.getInt(v18);
                int v40 = cursor0.getInt(v19);
                long v41 = cursor0.getLong(v20);
                int v42 = cursor0.getInt(v21);
                int v43 = cursor0.getInt(v22);
                ((ArrayList)list0).add(new WorkSpec(s, workInfo$State0, s1, s2, data0, data1, v31, v32, v33, new Constraints(WorkTypeConverters.intToNetworkType(cursor0.getInt(v23)), cursor0.getInt(v24) != 0, cursor0.getInt(v25) != 0, cursor0.getInt(v26) != 0, cursor0.getInt(v27) != 0, cursor0.getLong(v28), cursor0.getLong(v29), WorkTypeConverters.byteArrayToSetOfTriggers((cursor0.isNull(v30) ? null : cursor0.getBlob(v30)))), v34, backoffPolicy0, v35, v36, v37, v38, z, outOfQuotaPolicy0, v39, v40, v41, v42, v43));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public LiveData getScheduleRequestedAtLiveData(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        f f0 = new f(this, roomSQLiteQuery0, 1);
        return this.a.getInvalidationTracker().createLiveData(new String[]{"workspec"}, false, f0);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List getScheduledWork() {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            int v1 = CursorUtil.getColumnIndexOrThrow(cursor0, "id");
            int v2 = CursorUtil.getColumnIndexOrThrow(cursor0, "state");
            int v3 = CursorUtil.getColumnIndexOrThrow(cursor0, "worker_class_name");
            int v4 = CursorUtil.getColumnIndexOrThrow(cursor0, "input_merger_class_name");
            int v5 = CursorUtil.getColumnIndexOrThrow(cursor0, "input");
            int v6 = CursorUtil.getColumnIndexOrThrow(cursor0, "output");
            int v7 = CursorUtil.getColumnIndexOrThrow(cursor0, "initial_delay");
            int v8 = CursorUtil.getColumnIndexOrThrow(cursor0, "interval_duration");
            int v9 = CursorUtil.getColumnIndexOrThrow(cursor0, "flex_duration");
            int v10 = CursorUtil.getColumnIndexOrThrow(cursor0, "run_attempt_count");
            int v11 = CursorUtil.getColumnIndexOrThrow(cursor0, "backoff_policy");
            int v12 = CursorUtil.getColumnIndexOrThrow(cursor0, "backoff_delay_duration");
            int v13 = CursorUtil.getColumnIndexOrThrow(cursor0, "last_enqueue_time");
            int v14 = CursorUtil.getColumnIndexOrThrow(cursor0, "minimum_retention_duration");
            int v15 = CursorUtil.getColumnIndexOrThrow(cursor0, "schedule_requested_at");
            int v16 = CursorUtil.getColumnIndexOrThrow(cursor0, "run_in_foreground");
            int v17 = CursorUtil.getColumnIndexOrThrow(cursor0, "out_of_quota_policy");
            int v18 = CursorUtil.getColumnIndexOrThrow(cursor0, "period_count");
            int v19 = CursorUtil.getColumnIndexOrThrow(cursor0, "generation");
            int v20 = CursorUtil.getColumnIndexOrThrow(cursor0, "next_schedule_time_override");
            int v21 = CursorUtil.getColumnIndexOrThrow(cursor0, "next_schedule_time_override_generation");
            int v22 = CursorUtil.getColumnIndexOrThrow(cursor0, "stop_reason");
            int v23 = CursorUtil.getColumnIndexOrThrow(cursor0, "required_network_type");
            int v24 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_charging");
            int v25 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_device_idle");
            int v26 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_battery_not_low");
            int v27 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_storage_not_low");
            int v28 = CursorUtil.getColumnIndexOrThrow(cursor0, "trigger_content_update_delay");
            int v29 = CursorUtil.getColumnIndexOrThrow(cursor0, "trigger_max_content_delay");
            int v30 = CursorUtil.getColumnIndexOrThrow(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.isNull(v1) ? null : cursor0.getString(v1);
                State workInfo$State0 = WorkTypeConverters.intToState(cursor0.getInt(v2));
                String s1 = cursor0.isNull(v3) ? null : cursor0.getString(v3);
                String s2 = cursor0.isNull(v4) ? null : cursor0.getString(v4);
                Data data0 = Data.fromByteArray((cursor0.isNull(v5) ? null : cursor0.getBlob(v5)));
                Data data1 = Data.fromByteArray((cursor0.isNull(v6) ? null : cursor0.getBlob(v6)));
                long v31 = cursor0.getLong(v7);
                long v32 = cursor0.getLong(v8);
                long v33 = cursor0.getLong(v9);
                int v34 = cursor0.getInt(v10);
                BackoffPolicy backoffPolicy0 = WorkTypeConverters.intToBackoffPolicy(cursor0.getInt(v11));
                long v35 = cursor0.getLong(v12);
                long v36 = cursor0.getLong(v13);
                long v37 = cursor0.getLong(v14);
                long v38 = cursor0.getLong(v15);
                boolean z = cursor0.getInt(v16) != 0;
                OutOfQuotaPolicy outOfQuotaPolicy0 = WorkTypeConverters.intToOutOfQuotaPolicy(cursor0.getInt(v17));
                int v39 = cursor0.getInt(v18);
                int v40 = cursor0.getInt(v19);
                long v41 = cursor0.getLong(v20);
                int v42 = cursor0.getInt(v21);
                int v43 = cursor0.getInt(v22);
                ((ArrayList)list0).add(new WorkSpec(s, workInfo$State0, s1, s2, data0, data1, v31, v32, v33, new Constraints(WorkTypeConverters.intToNetworkType(cursor0.getInt(v23)), cursor0.getInt(v24) != 0, cursor0.getInt(v25) != 0, cursor0.getInt(v26) != 0, cursor0.getInt(v27) != 0, cursor0.getLong(v28), cursor0.getLong(v29), WorkTypeConverters.byteArrayToSetOfTriggers((cursor0.isNull(v30) ? null : cursor0.getBlob(v30)))), v34, backoffPolicy0, v35, v36, v37, v38, z, outOfQuotaPolicy0, v39, v40, v41, v42, v43));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public State getState(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT state FROM workspec WHERE id=?", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        this.a.assertNotSuspendingTransaction();
        State workInfo$State0 = null;
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            if(cursor0.moveToFirst()) {
                Integer integer0 = cursor0.isNull(0) ? null : cursor0.getInt(0);
                if(integer0 != null) {
                    workInfo$State0 = WorkTypeConverters.intToState(((int)integer0));
                }
            }
            return workInfo$State0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List getUnfinishedWorkWithName(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                ((ArrayList)list0).add((cursor0.isNull(0) ? null : cursor0.getString(0)));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List getUnfinishedWorkWithTag(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                ((ArrayList)list0).add((cursor0.isNull(0) ? null : cursor0.getString(0)));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public WorkSpec getWorkSpec(String s) {
        WorkSpec workSpec0;
        boolean z4;
        int v48;
        boolean z3;
        int v47;
        boolean z2;
        int v46;
        boolean z1;
        int v45;
        boolean z;
        int v39;
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE id=?", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            int v1 = CursorUtil.getColumnIndexOrThrow(cursor0, "id");
            int v2 = CursorUtil.getColumnIndexOrThrow(cursor0, "state");
            int v3 = CursorUtil.getColumnIndexOrThrow(cursor0, "worker_class_name");
            int v4 = CursorUtil.getColumnIndexOrThrow(cursor0, "input_merger_class_name");
            int v5 = CursorUtil.getColumnIndexOrThrow(cursor0, "input");
            int v6 = CursorUtil.getColumnIndexOrThrow(cursor0, "output");
            int v7 = CursorUtil.getColumnIndexOrThrow(cursor0, "initial_delay");
            int v8 = CursorUtil.getColumnIndexOrThrow(cursor0, "interval_duration");
            int v9 = CursorUtil.getColumnIndexOrThrow(cursor0, "flex_duration");
            int v10 = CursorUtil.getColumnIndexOrThrow(cursor0, "run_attempt_count");
            int v11 = CursorUtil.getColumnIndexOrThrow(cursor0, "backoff_policy");
            int v12 = CursorUtil.getColumnIndexOrThrow(cursor0, "backoff_delay_duration");
            int v13 = CursorUtil.getColumnIndexOrThrow(cursor0, "last_enqueue_time");
            int v14 = CursorUtil.getColumnIndexOrThrow(cursor0, "minimum_retention_duration");
            int v15 = CursorUtil.getColumnIndexOrThrow(cursor0, "schedule_requested_at");
            int v16 = CursorUtil.getColumnIndexOrThrow(cursor0, "run_in_foreground");
            int v17 = CursorUtil.getColumnIndexOrThrow(cursor0, "out_of_quota_policy");
            int v18 = CursorUtil.getColumnIndexOrThrow(cursor0, "period_count");
            int v19 = CursorUtil.getColumnIndexOrThrow(cursor0, "generation");
            int v20 = CursorUtil.getColumnIndexOrThrow(cursor0, "next_schedule_time_override");
            int v21 = CursorUtil.getColumnIndexOrThrow(cursor0, "next_schedule_time_override_generation");
            int v22 = CursorUtil.getColumnIndexOrThrow(cursor0, "stop_reason");
            int v23 = CursorUtil.getColumnIndexOrThrow(cursor0, "required_network_type");
            int v24 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_charging");
            int v25 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_device_idle");
            int v26 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_battery_not_low");
            int v27 = CursorUtil.getColumnIndexOrThrow(cursor0, "requires_storage_not_low");
            int v28 = CursorUtil.getColumnIndexOrThrow(cursor0, "trigger_content_update_delay");
            int v29 = CursorUtil.getColumnIndexOrThrow(cursor0, "trigger_max_content_delay");
            int v30 = CursorUtil.getColumnIndexOrThrow(cursor0, "content_uri_triggers");
            if(cursor0.moveToFirst()) {
                String s1 = cursor0.isNull(v1) ? null : cursor0.getString(v1);
                State workInfo$State0 = WorkTypeConverters.intToState(cursor0.getInt(v2));
                String s2 = cursor0.isNull(v3) ? null : cursor0.getString(v3);
                String s3 = cursor0.isNull(v4) ? null : cursor0.getString(v4);
                Data data0 = Data.fromByteArray((cursor0.isNull(v5) ? null : cursor0.getBlob(v5)));
                Data data1 = Data.fromByteArray((cursor0.isNull(v6) ? null : cursor0.getBlob(v6)));
                long v31 = cursor0.getLong(v7);
                long v32 = cursor0.getLong(v8);
                long v33 = cursor0.getLong(v9);
                int v34 = cursor0.getInt(v10);
                BackoffPolicy backoffPolicy0 = WorkTypeConverters.intToBackoffPolicy(cursor0.getInt(v11));
                long v35 = cursor0.getLong(v12);
                long v36 = cursor0.getLong(v13);
                long v37 = cursor0.getLong(v14);
                long v38 = cursor0.getLong(v15);
                if(cursor0.getInt(v16) == 0) {
                    v39 = v17;
                    z = false;
                }
                else {
                    v39 = v17;
                    z = true;
                }
                OutOfQuotaPolicy outOfQuotaPolicy0 = WorkTypeConverters.intToOutOfQuotaPolicy(cursor0.getInt(v39));
                int v40 = cursor0.getInt(v18);
                int v41 = cursor0.getInt(v19);
                long v42 = cursor0.getLong(v20);
                int v43 = cursor0.getInt(v21);
                int v44 = cursor0.getInt(v22);
                NetworkType networkType0 = WorkTypeConverters.intToNetworkType(cursor0.getInt(v23));
                if(cursor0.getInt(v24) == 0) {
                    v45 = v25;
                    z1 = false;
                }
                else {
                    v45 = v25;
                    z1 = true;
                }
                if(cursor0.getInt(v45) == 0) {
                    v46 = v26;
                    z2 = false;
                }
                else {
                    v46 = v26;
                    z2 = true;
                }
                if(cursor0.getInt(v46) == 0) {
                    v47 = v27;
                    z3 = false;
                }
                else {
                    v47 = v27;
                    z3 = true;
                }
                if(cursor0.getInt(v47) == 0) {
                    v48 = v28;
                    z4 = false;
                }
                else {
                    v48 = v28;
                    z4 = true;
                }
                workSpec0 = new WorkSpec(s1, workInfo$State0, s2, s3, data0, data1, v31, v32, v33, new Constraints(networkType0, z1, z2, z3, z4, cursor0.getLong(v48), cursor0.getLong(v29), WorkTypeConverters.byteArrayToSetOfTriggers((cursor0.isNull(v30) ? null : cursor0.getBlob(v30)))), v34, backoffPolicy0, v35, v36, v37, v38, z, outOfQuotaPolicy0, v40, v41, v42, v43, v44);
            }
            else {
                workSpec0 = null;
            }
            return workSpec0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List getWorkSpecIdAndStatesForName(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                ((ArrayList)list0).add(new IdAndState((cursor0.isNull(0) ? null : cursor0.getString(0)), WorkTypeConverters.intToState(cursor0.getInt(1))));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public Flow getWorkStatusPojoFlowDataForIds(List list0) {
        StringBuilder stringBuilder0 = StringUtil.newStringBuilder();
        stringBuilder0.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int v = list0.size();
        StringUtil.appendPlaceholders(stringBuilder0, v);
        stringBuilder0.append(")");
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire(stringBuilder0.toString(), v);
        int v1 = 1;
        for(Object object0: list0) {
            String s = (String)object0;
            if(s == null) {
                roomSQLiteQuery0.bindNull(v1);
            }
            else {
                roomSQLiteQuery0.bindString(v1, s);
            }
            ++v1;
        }
        i i0 = new i(this, roomSQLiteQuery0);
        return CoroutinesRoom.createFlow(this.a, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, i0);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public Flow getWorkStatusPojoFlowForName(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        m m0 = new m(this, roomSQLiteQuery0);
        return CoroutinesRoom.createFlow(this.a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, m0);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public Flow getWorkStatusPojoFlowForTag(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        j j0 = new j(this, roomSQLiteQuery0);
        return CoroutinesRoom.createFlow(this.a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, j0);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public WorkInfoPojo getWorkStatusPojoForId(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        roomDatabase0.beginTransaction();
        WorkInfoPojo workSpec$WorkInfoPojo0 = null;
        try {
            Cursor cursor0 = DBUtil.query(roomDatabase0, roomSQLiteQuery0, true, null);
            try {
                HashMap hashMap0 = new HashMap();
                HashMap hashMap1 = new HashMap();
                while(cursor0.moveToNext()) {
                    String s1 = cursor0.getString(0);
                    if(((ArrayList)hashMap0.get(s1)) == null) {
                        hashMap0.put(s1, new ArrayList());
                    }
                    String s2 = cursor0.getString(0);
                    if(((ArrayList)hashMap1.get(s2)) == null) {
                        hashMap1.put(s2, new ArrayList());
                    }
                }
                cursor0.moveToPosition(-1);
                this.b(hashMap0);
                this.a(hashMap1);
                if(cursor0.moveToFirst()) {
                    String s3 = cursor0.isNull(0) ? null : cursor0.getString(0);
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
                    NetworkType networkType0 = WorkTypeConverters.intToNetworkType(cursor0.getInt(5));
                    boolean z = cursor0.getInt(6) != 0;
                    boolean z1 = cursor0.getInt(7) != 0;
                    boolean z2 = cursor0.getInt(8) != 0;
                    boolean z3 = cursor0.getInt(9) != 0;
                    long v12 = cursor0.getLong(10);
                    long v13 = cursor0.getLong(11);
                    if(!cursor0.isNull(12)) {
                        workSpec$WorkInfoPojo0 = cursor0.getBlob(12);
                    }
                    Constraints constraints0 = new Constraints(networkType0, z, z1, z2, z3, v12, v13, WorkTypeConverters.byteArrayToSetOfTriggers(((byte[])workSpec$WorkInfoPojo0)));
                    ArrayList arrayList0 = (ArrayList)hashMap0.get(cursor0.getString(0));
                    if(arrayList0 == null) {
                        arrayList0 = new ArrayList();
                    }
                    ArrayList arrayList1 = (ArrayList)hashMap1.get(cursor0.getString(0));
                    if(arrayList1 == null) {
                        arrayList1 = new ArrayList();
                    }
                    workSpec$WorkInfoPojo0 = new WorkInfoPojo(s3, workInfo$State0, data0, v4, v5, v6, constraints0, v2, backoffPolicy0, v7, v8, v9, v3, v10, v11, arrayList0, arrayList1);
                }
                roomDatabase0.setTransactionSuccessful();
                return workSpec$WorkInfoPojo0;
            }
            finally {
                cursor0.close();
                roomSQLiteQuery0.release();
            }
        }
        finally {
            roomDatabase0.endTransaction();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List getWorkStatusPojoForIds(List list0) {
        StringBuilder stringBuilder0 = StringUtil.newStringBuilder();
        stringBuilder0.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int v = list0.size();
        StringUtil.appendPlaceholders(stringBuilder0, v);
        stringBuilder0.append(")");
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire(stringBuilder0.toString(), v);
        int v1 = 1;
        for(Object object0: list0) {
            String s = (String)object0;
            if(s == null) {
                roomSQLiteQuery0.bindNull(v1);
            }
            else {
                roomSQLiteQuery0.bindString(v1, s);
            }
            ++v1;
        }
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        roomDatabase0.beginTransaction();
        try {
            Cursor cursor0 = DBUtil.query(roomDatabase0, roomSQLiteQuery0, true, null);
            try {
                HashMap hashMap0 = new HashMap();
                HashMap hashMap1 = new HashMap();
                while(cursor0.moveToNext()) {
                    String s1 = cursor0.getString(0);
                    if(((ArrayList)hashMap0.get(s1)) == null) {
                        hashMap0.put(s1, new ArrayList());
                    }
                    String s2 = cursor0.getString(0);
                    if(((ArrayList)hashMap1.get(s2)) == null) {
                        hashMap1.put(s2, new ArrayList());
                    }
                }
                cursor0.moveToPosition(-1);
                this.b(hashMap0);
                this.a(hashMap1);
                List list1 = new ArrayList(cursor0.getCount());
                while(cursor0.moveToNext()) {
                    String s3 = cursor0.isNull(0) ? null : cursor0.getString(0);
                    State workInfo$State0 = WorkTypeConverters.intToState(cursor0.getInt(1));
                    Data data0 = Data.fromByteArray((cursor0.isNull(2) ? null : cursor0.getBlob(2)));
                    int v4 = cursor0.getInt(3);
                    int v5 = cursor0.getInt(4);
                    long v6 = cursor0.getLong(13);
                    long v7 = cursor0.getLong(14);
                    long v8 = cursor0.getLong(15);
                    BackoffPolicy backoffPolicy0 = WorkTypeConverters.intToBackoffPolicy(cursor0.getInt(16));
                    long v9 = cursor0.getLong(17);
                    long v10 = cursor0.getLong(18);
                    int v11 = cursor0.getInt(19);
                    long v12 = cursor0.getLong(20);
                    int v13 = cursor0.getInt(21);
                    Constraints constraints0 = new Constraints(WorkTypeConverters.intToNetworkType(cursor0.getInt(5)), cursor0.getInt(6) != 0, cursor0.getInt(7) != 0, cursor0.getInt(8) != 0, cursor0.getInt(9) != 0, cursor0.getLong(10), cursor0.getLong(11), WorkTypeConverters.byteArrayToSetOfTriggers((cursor0.isNull(12) ? null : cursor0.getBlob(12))));
                    ArrayList arrayList0 = (ArrayList)hashMap0.get(cursor0.getString(0));
                    if(arrayList0 == null) {
                        arrayList0 = new ArrayList();
                    }
                    ArrayList arrayList1 = (ArrayList)hashMap1.get(cursor0.getString(0));
                    if(arrayList1 == null) {
                        arrayList1 = new ArrayList();
                    }
                    ((ArrayList)list1).add(new WorkInfoPojo(s3, workInfo$State0, data0, v6, v7, v8, constraints0, v4, backoffPolicy0, v9, v10, v11, v5, v12, v13, arrayList0, arrayList1));
                }
                roomDatabase0.setTransactionSuccessful();
                return list1;
            }
            finally {
                cursor0.close();
                roomSQLiteQuery0.release();
            }
        }
        finally {
            roomDatabase0.endTransaction();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List getWorkStatusPojoForName(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        roomDatabase0.beginTransaction();
        try {
            Cursor cursor0 = DBUtil.query(roomDatabase0, roomSQLiteQuery0, true, null);
            try {
                HashMap hashMap0 = new HashMap();
                HashMap hashMap1 = new HashMap();
                while(cursor0.moveToNext()) {
                    String s1 = cursor0.getString(0);
                    if(((ArrayList)hashMap0.get(s1)) == null) {
                        hashMap0.put(s1, new ArrayList());
                    }
                    String s2 = cursor0.getString(0);
                    if(((ArrayList)hashMap1.get(s2)) == null) {
                        hashMap1.put(s2, new ArrayList());
                    }
                }
                cursor0.moveToPosition(-1);
                this.b(hashMap0);
                this.a(hashMap1);
                List list0 = new ArrayList(cursor0.getCount());
                while(cursor0.moveToNext()) {
                    String s3 = cursor0.isNull(0) ? null : cursor0.getString(0);
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
                    ArrayList arrayList0 = (ArrayList)hashMap0.get(cursor0.getString(0));
                    if(arrayList0 == null) {
                        arrayList0 = new ArrayList();
                    }
                    ArrayList arrayList1 = (ArrayList)hashMap1.get(cursor0.getString(0));
                    if(arrayList1 == null) {
                        arrayList1 = new ArrayList();
                    }
                    ((ArrayList)list0).add(new WorkInfoPojo(s3, workInfo$State0, data0, v4, v5, v6, constraints0, v2, backoffPolicy0, v7, v8, v9, v3, v10, v11, arrayList0, arrayList1));
                }
                roomDatabase0.setTransactionSuccessful();
                return list0;
            }
            finally {
                cursor0.close();
                roomSQLiteQuery0.release();
            }
        }
        finally {
            roomDatabase0.endTransaction();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List getWorkStatusPojoForTag(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        roomDatabase0.beginTransaction();
        try {
            Cursor cursor0 = DBUtil.query(roomDatabase0, roomSQLiteQuery0, true, null);
            try {
                HashMap hashMap0 = new HashMap();
                HashMap hashMap1 = new HashMap();
                while(cursor0.moveToNext()) {
                    String s1 = cursor0.getString(0);
                    if(((ArrayList)hashMap0.get(s1)) == null) {
                        hashMap0.put(s1, new ArrayList());
                    }
                    String s2 = cursor0.getString(0);
                    if(((ArrayList)hashMap1.get(s2)) == null) {
                        hashMap1.put(s2, new ArrayList());
                    }
                }
                cursor0.moveToPosition(-1);
                this.b(hashMap0);
                this.a(hashMap1);
                List list0 = new ArrayList(cursor0.getCount());
                while(cursor0.moveToNext()) {
                    String s3 = cursor0.isNull(0) ? null : cursor0.getString(0);
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
                    ArrayList arrayList0 = (ArrayList)hashMap0.get(cursor0.getString(0));
                    if(arrayList0 == null) {
                        arrayList0 = new ArrayList();
                    }
                    ArrayList arrayList1 = (ArrayList)hashMap1.get(cursor0.getString(0));
                    if(arrayList1 == null) {
                        arrayList1 = new ArrayList();
                    }
                    ((ArrayList)list0).add(new WorkInfoPojo(s3, workInfo$State0, data0, v4, v5, v6, constraints0, v2, backoffPolicy0, v7, v8, v9, v3, v10, v11, arrayList0, arrayList1));
                }
                roomDatabase0.setTransactionSuccessful();
                return list0;
            }
            finally {
                cursor0.close();
                roomSQLiteQuery0.release();
            }
        }
        finally {
            roomDatabase0.endTransaction();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public LiveData getWorkStatusPojoLiveDataForIds(List list0) {
        StringBuilder stringBuilder0 = StringUtil.newStringBuilder();
        stringBuilder0.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int v = list0.size();
        StringUtil.appendPlaceholders(stringBuilder0, v);
        stringBuilder0.append(")");
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire(stringBuilder0.toString(), v);
        int v1 = 1;
        for(Object object0: list0) {
            String s = (String)object0;
            if(s == null) {
                roomSQLiteQuery0.bindNull(v1);
            }
            else {
                roomSQLiteQuery0.bindString(v1, s);
            }
            ++v1;
        }
        g g0 = new g(this, roomSQLiteQuery0);
        return this.a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, g0);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public LiveData getWorkStatusPojoLiveDataForName(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        l l0 = new l(this, roomSQLiteQuery0);
        return this.a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, l0);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public LiveData getWorkStatusPojoLiveDataForTag(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if(s == null) {
            roomSQLiteQuery0.bindNull(1);
        }
        else {
            roomSQLiteQuery0.bindString(1, s);
        }
        k k0 = new k(this, roomSQLiteQuery0);
        return this.a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, k0);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public boolean hasUnfinishedWork() {
        boolean z = false;
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.acquire("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursor0 = DBUtil.query(this.a, roomSQLiteQuery0, false, null);
        try {
            if(cursor0.moveToFirst() && cursor0.getInt(0) != 0) {
                z = true;
            }
            return z;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void incrementGeneration(String s) {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.q;
        SupportSQLiteStatement supportSQLiteStatement0 = e0.acquire();
        if(s == null) {
            supportSQLiteStatement0.bindNull(1);
        }
        else {
            supportSQLiteStatement0.bindString(1, s);
        }
        roomDatabase0.beginTransaction();
        try {
            supportSQLiteStatement0.executeUpdateDelete();
            roomDatabase0.setTransactionSuccessful();
        }
        finally {
            roomDatabase0.endTransaction();
            e0.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void incrementPeriodCount(String s) {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.g;
        SupportSQLiteStatement supportSQLiteStatement0 = e0.acquire();
        if(s == null) {
            supportSQLiteStatement0.bindNull(1);
        }
        else {
            supportSQLiteStatement0.bindString(1, s);
        }
        roomDatabase0.beginTransaction();
        try {
            supportSQLiteStatement0.executeUpdateDelete();
            roomDatabase0.setTransactionSuccessful();
        }
        finally {
            roomDatabase0.endTransaction();
            e0.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public int incrementWorkSpecRunAttemptCount(String s) {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.j;
        SupportSQLiteStatement supportSQLiteStatement0 = e0.acquire();
        if(s == null) {
            supportSQLiteStatement0.bindNull(1);
        }
        else {
            supportSQLiteStatement0.bindString(1, s);
        }
        roomDatabase0.beginTransaction();
        try {
            int v1 = supportSQLiteStatement0.executeUpdateDelete();
            roomDatabase0.setTransactionSuccessful();
            return v1;
        }
        finally {
            roomDatabase0.endTransaction();
            e0.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void insertWorkSpec(WorkSpec workSpec0) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(workSpec0);
            this.a.setTransactionSuccessful();
        }
        finally {
            this.a.endTransaction();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public int markWorkSpecScheduled(String s, long v) {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.n;
        SupportSQLiteStatement supportSQLiteStatement0 = e0.acquire();
        supportSQLiteStatement0.bindLong(1, v);
        if(s == null) {
            supportSQLiteStatement0.bindNull(2);
        }
        else {
            supportSQLiteStatement0.bindString(2, s);
        }
        roomDatabase0.beginTransaction();
        try {
            int v2 = supportSQLiteStatement0.executeUpdateDelete();
            roomDatabase0.setTransactionSuccessful();
            return v2;
        }
        finally {
            roomDatabase0.endTransaction();
            e0.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatement0 = this.p.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatement0.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        }
        finally {
            this.a.endTransaction();
            this.p.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public int resetScheduledState() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatement0 = this.o.acquire();
        this.a.beginTransaction();
        try {
            int v1 = supportSQLiteStatement0.executeUpdateDelete();
            this.a.setTransactionSuccessful();
            return v1;
        }
        finally {
            this.a.endTransaction();
            this.o.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void resetWorkSpecNextScheduleTimeOverride(String s, int v) {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.m;
        SupportSQLiteStatement supportSQLiteStatement0 = e0.acquire();
        if(s == null) {
            supportSQLiteStatement0.bindNull(1);
        }
        else {
            supportSQLiteStatement0.bindString(1, s);
        }
        supportSQLiteStatement0.bindLong(2, ((long)v));
        roomDatabase0.beginTransaction();
        try {
            supportSQLiteStatement0.executeUpdateDelete();
            roomDatabase0.setTransactionSuccessful();
        }
        finally {
            roomDatabase0.endTransaction();
            e0.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public int resetWorkSpecRunAttemptCount(String s) {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.k;
        SupportSQLiteStatement supportSQLiteStatement0 = e0.acquire();
        if(s == null) {
            supportSQLiteStatement0.bindNull(1);
        }
        else {
            supportSQLiteStatement0.bindString(1, s);
        }
        roomDatabase0.beginTransaction();
        try {
            int v1 = supportSQLiteStatement0.executeUpdateDelete();
            roomDatabase0.setTransactionSuccessful();
            return v1;
        }
        finally {
            roomDatabase0.endTransaction();
            e0.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public int setCancelledState(String s) {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.f;
        SupportSQLiteStatement supportSQLiteStatement0 = e0.acquire();
        if(s == null) {
            supportSQLiteStatement0.bindNull(1);
        }
        else {
            supportSQLiteStatement0.bindString(1, s);
        }
        roomDatabase0.beginTransaction();
        try {
            int v1 = supportSQLiteStatement0.executeUpdateDelete();
            roomDatabase0.setTransactionSuccessful();
            return v1;
        }
        finally {
            roomDatabase0.endTransaction();
            e0.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void setLastEnqueueTime(String s, long v) {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.i;
        SupportSQLiteStatement supportSQLiteStatement0 = e0.acquire();
        supportSQLiteStatement0.bindLong(1, v);
        if(s == null) {
            supportSQLiteStatement0.bindNull(2);
        }
        else {
            supportSQLiteStatement0.bindString(2, s);
        }
        roomDatabase0.beginTransaction();
        try {
            supportSQLiteStatement0.executeUpdateDelete();
            roomDatabase0.setTransactionSuccessful();
        }
        finally {
            roomDatabase0.endTransaction();
            e0.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void setNextScheduleTimeOverride(String s, long v) {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.l;
        SupportSQLiteStatement supportSQLiteStatement0 = e0.acquire();
        supportSQLiteStatement0.bindLong(1, v);
        if(s == null) {
            supportSQLiteStatement0.bindNull(2);
        }
        else {
            supportSQLiteStatement0.bindString(2, s);
        }
        roomDatabase0.beginTransaction();
        try {
            supportSQLiteStatement0.executeUpdateDelete();
            roomDatabase0.setTransactionSuccessful();
        }
        finally {
            roomDatabase0.endTransaction();
            e0.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void setOutput(String s, Data data0) {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.h;
        SupportSQLiteStatement supportSQLiteStatement0 = e0.acquire();
        byte[] arr_b = Data.toByteArrayInternal(data0);
        if(arr_b == null) {
            supportSQLiteStatement0.bindNull(1);
        }
        else {
            supportSQLiteStatement0.bindBlob(1, arr_b);
        }
        if(s == null) {
            supportSQLiteStatement0.bindNull(2);
        }
        else {
            supportSQLiteStatement0.bindString(2, s);
        }
        roomDatabase0.beginTransaction();
        try {
            supportSQLiteStatement0.executeUpdateDelete();
            roomDatabase0.setTransactionSuccessful();
        }
        finally {
            roomDatabase0.endTransaction();
            e0.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public int setState(State workInfo$State0, String s) {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.e;
        SupportSQLiteStatement supportSQLiteStatement0 = e0.acquire();
        supportSQLiteStatement0.bindLong(1, ((long)WorkTypeConverters.stateToInt(workInfo$State0)));
        if(s == null) {
            supportSQLiteStatement0.bindNull(2);
        }
        else {
            supportSQLiteStatement0.bindString(2, s);
        }
        roomDatabase0.beginTransaction();
        try {
            int v1 = supportSQLiteStatement0.executeUpdateDelete();
            roomDatabase0.setTransactionSuccessful();
            return v1;
        }
        finally {
            roomDatabase0.endTransaction();
            e0.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void setStopReason(String s, int v) {
        RoomDatabase roomDatabase0 = this.a;
        roomDatabase0.assertNotSuspendingTransaction();
        e e0 = this.r;
        SupportSQLiteStatement supportSQLiteStatement0 = e0.acquire();
        supportSQLiteStatement0.bindLong(1, ((long)v));
        if(s == null) {
            supportSQLiteStatement0.bindNull(2);
        }
        else {
            supportSQLiteStatement0.bindString(2, s);
        }
        roomDatabase0.beginTransaction();
        try {
            supportSQLiteStatement0.executeUpdateDelete();
            roomDatabase0.setTransactionSuccessful();
        }
        finally {
            roomDatabase0.endTransaction();
            e0.release(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void updateWorkSpec(WorkSpec workSpec0) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.c.handle(workSpec0);
            this.a.setTransactionSuccessful();
        }
        finally {
            this.a.endTransaction();
        }
    }
}


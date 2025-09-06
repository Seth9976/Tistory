package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Provider;
import javax.inject.Singleton;

@WorkerThread
@Singleton
public class SQLiteEventStore implements ClientHealthMetricsStore, EventStore, SynchronizationGuard {
    interface Function {
        Object apply(Object arg1);
    }

    interface Producer {
        Object produce();
    }

    public final o a;
    public final Clock b;
    public final Clock c;
    public final c d;
    public final Provider e;
    public static final Encoding f;

    static {
        SQLiteEventStore.f = Encoding.of("proto");
    }

    public SQLiteEventStore(Clock clock0, Clock clock1, c c0, o o0, Provider provider0) {
        this.a = o0;
        this.b = clock0;
        this.c = clock1;
        this.d = c0;
        this.e = provider0;
    }

    public final SQLiteDatabase a() {
        o o0 = this.a;
        Objects.requireNonNull(o0);
        Clock clock0 = this.c;
        long v = clock0.getTime();
        while(true) {
            try {
                return o0.getWritableDatabase();
            }
            catch(SQLiteDatabaseLockedException sQLiteDatabaseLockedException0) {
            }
            if(clock0.getTime() >= ((long)((a)this.d).d) + v) {
                break;
            }
            SystemClock.sleep(50L);
        }
        throw new SynchronizationException("Timed out while trying to open db.", sQLiteDatabaseLockedException0);
    }

    public final long b() {
        return this.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public static Long c(SQLiteDatabase sQLiteDatabase0, TransportContext transportContext0) {
        StringBuilder stringBuilder0 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList0 = new ArrayList(Arrays.asList(new String[]{transportContext0.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext0.getPriority()))}));
        if(transportContext0.getExtras() == null) {
            stringBuilder0.append(" and extras is null");
        }
        else {
            stringBuilder0.append(" and extras = ?");
            arrayList0.add(Base64.encodeToString(transportContext0.getExtras(), 0));
        }
        Object[] arr_object = arrayList0.toArray(new String[0]);
        try(Cursor cursor0 = sQLiteDatabase0.query("transport_contexts", new String[]{"_id"}, stringBuilder0.toString(), ((String[])arr_object), null, null, null)) {
            return !cursor0.moveToNext() ? null : cursor0.getLong(0);
        }
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public int cleanUp() {
        long v = this.b.getTime() - ((a)this.d).e;
        SQLiteDatabase sQLiteDatabase0 = this.a();
        sQLiteDatabase0.beginTransaction();
        try {
            String[] arr_s = {String.valueOf(v)};
            SQLiteEventStore.g(sQLiteDatabase0.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", arr_s), new i(this, 0));
            int v2 = sQLiteDatabase0.delete("events", "timestamp_ms < ?", arr_s);
            sQLiteDatabase0.setTransactionSuccessful();
            return v2;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    @RestrictTo({Scope.TESTS})
    public void clearDb() {
        SQLiteDatabase sQLiteDatabase0 = this.a();
        sQLiteDatabase0.beginTransaction();
        try {
            sQLiteDatabase0.delete("events", null, new String[0]);
            sQLiteDatabase0.delete("transport_contexts", null, new String[0]);
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    @Override
    public void close() {
        this.a.close();
    }

    public final Object d(Function sQLiteEventStore$Function0) {
        SQLiteDatabase sQLiteDatabase0 = this.a();
        sQLiteDatabase0.beginTransaction();
        try {
            Object object0 = sQLiteEventStore$Function0.apply(sQLiteDatabase0);
            sQLiteDatabase0.setTransactionSuccessful();
            return object0;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    public final ArrayList e(SQLiteDatabase sQLiteDatabase0, TransportContext transportContext0, int v) {
        ArrayList arrayList0 = new ArrayList();
        Long long0 = SQLiteEventStore.c(sQLiteDatabase0, transportContext0);
        if(long0 == null) {
            return arrayList0;
        }
        SQLiteEventStore.g(sQLiteDatabase0.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{long0.toString()}, null, null, null, String.valueOf(v)), new j(this, arrayList0, transportContext0, 1));
        return arrayList0;
    }

    public static String f(Iterable iterable0) {
        StringBuilder stringBuilder0 = new StringBuilder("(");
        Iterator iterator0 = iterable0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(((PersistedEvent)object0).getId());
            if(iterator0.hasNext()) {
                stringBuilder0.append(',');
            }
        }
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }

    public static Object g(Cursor cursor0, Function sQLiteEventStore$Function0) {
        try(cursor0) {
            return sQLiteEventStore$Function0.apply(cursor0);
        }
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public long getNextCallTime(TransportContext transportContext0) {
        try(Cursor cursor0 = this.a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{transportContext0.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext0.getPriority()))})) {
            return cursor0.moveToNext() ? cursor0.getLong(0) : 0L;
        }
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public boolean hasPendingEventsFor(TransportContext transportContext0) {
        Boolean boolean1;
        Boolean boolean0;
        SQLiteDatabase sQLiteDatabase0 = this.a();
        sQLiteDatabase0.beginTransaction();
        try {
            Long long0 = SQLiteEventStore.c(sQLiteDatabase0, transportContext0);
            if(long0 == null) {
                boolean0 = Boolean.FALSE;
            }
            else {
                Cursor cursor0 = this.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{long0.toString()});
                try {
                    boolean1 = Boolean.valueOf(cursor0.moveToNext());
                }
                catch(Throwable throwable0) {
                    cursor0.close();
                    throw throwable0;
                }
                cursor0.close();
                boolean0 = boolean1;
            }
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        return boolean0.booleanValue();
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public Iterable loadActiveContexts() {
        SQLiteDatabase sQLiteDatabase0 = this.a();
        sQLiteDatabase0.beginTransaction();
        try {
            List list0 = (List)SQLiteEventStore.g(sQLiteDatabase0.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new h(0));
            sQLiteDatabase0.setTransactionSuccessful();
            return list0;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public Iterable loadBatch(TransportContext transportContext0) {
        return (Iterable)this.d(new g(this, transportContext0));
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public ClientMetrics loadClientMetrics() {
        Builder clientMetrics$Builder0 = ClientMetrics.newBuilder();
        HashMap hashMap0 = new HashMap();
        SQLiteDatabase sQLiteDatabase0 = this.a();
        sQLiteDatabase0.beginTransaction();
        try {
            ClientMetrics clientMetrics0 = (ClientMetrics)SQLiteEventStore.g(sQLiteDatabase0.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new j(this, hashMap0, clientMetrics$Builder0, 2));
            sQLiteDatabase0.setTransactionSuccessful();
            return clientMetrics0;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    @Nullable
    public PersistedEvent persist(TransportContext transportContext0, EventInternal eventInternal0) {
        Logging.d("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", new Object[]{transportContext0.getPriority(), eventInternal0.getTransportName(), transportContext0.getBackendName()});
        long v = (long)(((Long)this.d(new j(this, eventInternal0, transportContext0, 0))));
        return v >= 1L ? PersistedEvent.create(v, transportContext0, eventInternal0) : null;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordFailure(Iterable iterable0) {
        if(!iterable0.iterator().hasNext()) {
            return;
        }
        String s = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + SQLiteEventStore.f(iterable0);
        SQLiteDatabase sQLiteDatabase0 = this.a();
        sQLiteDatabase0.beginTransaction();
        try {
            sQLiteDatabase0.compileStatement(s).execute();
            SQLiteEventStore.g(sQLiteDatabase0.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null), new i(this, 2));
            sQLiteDatabase0.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public void recordLogEventDropped(long v, Reason logEventDropped$Reason0, String s) {
        this.d(new l(v, logEventDropped$Reason0, s));
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordNextCallTime(TransportContext transportContext0, long v) {
        this.d(new k(transportContext0, v));
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordSuccess(Iterable iterable0) {
        if(!iterable0.iterator().hasNext()) {
            return;
        }
        this.a().compileStatement("DELETE FROM events WHERE _id in " + SQLiteEventStore.f(iterable0)).execute();
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public void resetClientMetrics() {
        this.d(new i(this, 1));
    }

    @Override  // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard
    public Object runCriticalSection(CriticalSection synchronizationGuard$CriticalSection0) {
        SQLiteDatabase sQLiteDatabase0 = this.a();
        Clock clock0 = this.c;
        long v = clock0.getTime();
        while(true) {
            try {
                sQLiteDatabase0.beginTransaction();
                break;
            }
            catch(SQLiteDatabaseLockedException sQLiteDatabaseLockedException0) {
                if(clock0.getTime() >= ((long)((a)this.d).d) + v) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", sQLiteDatabaseLockedException0);
                }
                SystemClock.sleep(50L);
            }
        }
        try {
            Object object0 = synchronizationGuard$CriticalSection0.execute();
            sQLiteDatabase0.setTransactionSuccessful();
            return object0;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }
}


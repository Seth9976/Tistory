package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal.Builder;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public final class j implements Function {
    public final int a;
    public final SQLiteEventStore b;
    public final Object c;
    public final Object d;

    public j(SQLiteEventStore sQLiteEventStore0, Object object0, Object object1, int v) {
        this.a = v;
        this.b = sQLiteEventStore0;
        this.d = object0;
        this.c = object1;
        super();
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function
    public final Object apply(Object object0) {
        TimeWindow timeWindow0;
        byte[] arr_b3;
        long v8;
        Object object1 = this.c;
        Object object2 = this.d;
        SQLiteEventStore sQLiteEventStore0 = this.b;
        switch(this.a) {
            case 0: {
                long v6 = sQLiteEventStore0.b();
                long v7 = sQLiteEventStore0.a().compileStatement("PRAGMA page_size").simpleQueryForLong();
                a a0 = (a)sQLiteEventStore0.d;
                if(Long.compare(v7 * v6, a0.b) >= 0) {
                    String s1 = ((EventInternal)object2).getTransportName();
                    sQLiteEventStore0.recordLogEventDropped(1L, Reason.CACHE_FULL, s1);
                    return -1L;
                }
                Long long0 = SQLiteEventStore.c(((SQLiteDatabase)object0), ((TransportContext)object1));
                if(long0 == null) {
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("backend_name", ((TransportContext)object1).getBackendName());
                    contentValues0.put("priority", PriorityMapping.toInt(((TransportContext)object1).getPriority()));
                    contentValues0.put("next_request_ms", 0);
                    if(((TransportContext)object1).getExtras() != null) {
                        contentValues0.put("extras", Base64.encodeToString(((TransportContext)object1).getExtras(), 0));
                    }
                    v8 = ((SQLiteDatabase)object0).insert("transport_contexts", null, contentValues0);
                }
                else {
                    v8 = (long)long0;
                }
                byte[] arr_b = ((EventInternal)object2).getEncodedPayload().getBytes();
                int v9 = a0.f;
                boolean z = arr_b.length <= v9;
                ContentValues contentValues1 = new ContentValues();
                contentValues1.put("context_id", v8);
                contentValues1.put("transport_name", ((EventInternal)object2).getTransportName());
                contentValues1.put("timestamp_ms", ((EventInternal)object2).getEventMillis());
                contentValues1.put("uptime_ms", ((EventInternal)object2).getUptimeMillis());
                contentValues1.put("payload_encoding", ((EventInternal)object2).getEncodedPayload().getEncoding().getName());
                contentValues1.put("code", ((EventInternal)object2).getCode());
                contentValues1.put("num_attempts", 0);
                contentValues1.put("inline", Boolean.valueOf(z));
                contentValues1.put("payload", (z ? arr_b : new byte[0]));
                long v10 = ((SQLiteDatabase)object0).insert("events", null, contentValues1);
                if(!z) {
                    int v11 = (int)Math.ceil(((double)arr_b.length) / ((double)v9));
                    for(int v12 = 1; v12 <= v11; ++v12) {
                        byte[] arr_b1 = Arrays.copyOfRange(arr_b, (v12 - 1) * v9, Math.min(v12 * v9, arr_b.length));
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("event_id", v10);
                        contentValues2.put("sequence_num", v12);
                        contentValues2.put("bytes", arr_b1);
                        ((SQLiteDatabase)object0).insert("event_payloads", null, contentValues2);
                    }
                }
                for(Object object4: ((EventInternal)object2).getMetadata().entrySet()) {
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put("event_id", v10);
                    contentValues3.put("name", ((String)((Map.Entry)object4).getKey()));
                    contentValues3.put("value", ((String)((Map.Entry)object4).getValue()));
                    ((SQLiteDatabase)object0).insert("event_metadata", null, contentValues3);
                }
                return v10;
            }
            case 1: {
                sQLiteEventStore0.getClass();
                while(((Cursor)object0).moveToNext()) {
                    long v13 = ((Cursor)object0).getLong(0);
                    boolean z1 = ((Cursor)object0).getInt(7) != 0;
                    Builder eventInternal$Builder0 = EventInternal.builder().setTransportName(((Cursor)object0).getString(1)).setEventMillis(((Cursor)object0).getLong(2)).setUptimeMillis(((Cursor)object0).getLong(3));
                    if(z1) {
                        String s2 = ((Cursor)object0).getString(4);
                        eventInternal$Builder0.setEncodedPayload(new EncodedPayload((s2 == null ? SQLiteEventStore.f : Encoding.of(s2)), ((Cursor)object0).getBlob(5)));
                    }
                    else {
                        String s3 = ((Cursor)object0).getString(4);
                        Encoding encoding0 = s3 == null ? SQLiteEventStore.f : Encoding.of(s3);
                        try(Cursor cursor1 = sQLiteEventStore0.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(v13)}, null, null, "sequence_num")) {
                            ArrayList arrayList0 = new ArrayList();
                            int v14;
                            for(v14 = 0; true; v14 += arr_b2.length) {
                                if(!cursor1.moveToNext()) {
                                    break;
                                }
                                byte[] arr_b2 = cursor1.getBlob(0);
                                arrayList0.add(arr_b2);
                            }
                            arr_b3 = new byte[v14];
                            int v15 = 0;
                            for(int v16 = 0; true; ++v16) {
                                if(v16 >= arrayList0.size()) {
                                    break;
                                }
                                byte[] arr_b4 = (byte[])arrayList0.get(v16);
                                System.arraycopy(arr_b4, 0, arr_b3, v15, arr_b4.length);
                                v15 += arr_b4.length;
                            }
                        }
                        eventInternal$Builder0.setEncodedPayload(new EncodedPayload(encoding0, arr_b3));
                    }
                    if(!((Cursor)object0).isNull(6)) {
                        eventInternal$Builder0.setCode(((Cursor)object0).getInt(6));
                    }
                    ((ArrayList)object2).add(PersistedEvent.create(v13, ((TransportContext)object1), eventInternal$Builder0.build()));
                }
                return null;
            }
            default: {
                sQLiteEventStore0.getClass();
                while(((Cursor)object0).moveToNext()) {
                    String s = ((Cursor)object0).getString(0);
                    int v = ((Cursor)object0).getInt(1);
                    Reason logEventDropped$Reason0 = Reason.REASON_UNKNOWN;
                    if(v != logEventDropped$Reason0.getNumber()) {
                        Reason logEventDropped$Reason1 = Reason.MESSAGE_TOO_OLD;
                        if(v != logEventDropped$Reason1.getNumber()) {
                            Reason logEventDropped$Reason2 = Reason.CACHE_FULL;
                            if(v == logEventDropped$Reason2.getNumber()) {
                                logEventDropped$Reason1 = logEventDropped$Reason2;
                            }
                            else {
                                Reason logEventDropped$Reason3 = Reason.PAYLOAD_TOO_BIG;
                                if(v == logEventDropped$Reason3.getNumber()) {
                                    logEventDropped$Reason1 = logEventDropped$Reason3;
                                }
                                else {
                                    Reason logEventDropped$Reason4 = Reason.MAX_RETRIES_REACHED;
                                    if(v == logEventDropped$Reason4.getNumber()) {
                                        logEventDropped$Reason1 = logEventDropped$Reason4;
                                    }
                                    else {
                                        Reason logEventDropped$Reason5 = Reason.INVALID_PAYLOD;
                                        if(v == logEventDropped$Reason5.getNumber()) {
                                            logEventDropped$Reason1 = logEventDropped$Reason5;
                                        }
                                        else {
                                            Reason logEventDropped$Reason6 = Reason.SERVER_ERROR;
                                            if(v == logEventDropped$Reason6.getNumber()) {
                                                logEventDropped$Reason1 = logEventDropped$Reason6;
                                            }
                                            else {
                                                Logging.d("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", v);
                                                goto label_35;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        logEventDropped$Reason0 = logEventDropped$Reason1;
                    }
                label_35:
                    long v1 = ((Cursor)object0).getLong(2);
                    if(!((HashMap)object2).containsKey(s)) {
                        ((HashMap)object2).put(s, new ArrayList());
                    }
                    ((List)((HashMap)object2).get(s)).add(LogEventDropped.newBuilder().setReason(logEventDropped$Reason0).setEventsDroppedCount(v1).build());
                }
                for(Object object3: ((HashMap)object2).entrySet()) {
                    ((com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder)object1).addLogSourceMetrics(LogSourceMetrics.newBuilder().setLogSource(((String)((Map.Entry)object3).getKey())).setLogEventDroppedList(((List)((Map.Entry)object3).getValue())).build());
                }
                long v2 = sQLiteEventStore0.b.getTime();
                SQLiteDatabase sQLiteDatabase0 = sQLiteEventStore0.a();
                sQLiteDatabase0.beginTransaction();
                try {
                    Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursor0.moveToNext();
                        long v4 = cursor0.getLong(0);
                        timeWindow0 = TimeWindow.newBuilder().setStartMs(v4).setEndMs(v2).build();
                    }
                    catch(Throwable throwable0) {
                        cursor0.close();
                        throw throwable0;
                    }
                    cursor0.close();
                    sQLiteDatabase0.setTransactionSuccessful();
                }
                finally {
                    sQLiteDatabase0.endTransaction();
                }
                ((com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder)object1).setWindow(timeWindow0);
                com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.Builder globalMetrics$Builder0 = GlobalMetrics.newBuilder();
                com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.Builder storageMetrics$Builder0 = StorageMetrics.newBuilder();
                long v5 = sQLiteEventStore0.b();
                ((com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder)object1).setGlobalMetrics(globalMetrics$Builder0.setStorageMetrics(storageMetrics$Builder0.setCurrentCacheSizeBytes(sQLiteEventStore0.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * v5).setMaxCacheSizeBytes(c.a.b).build()).build());
                ((com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder)object1).setAppNamespace(((String)sQLiteEventStore0.e.get()));
                return ((com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder)object1).build();
            }
        }
    }
}


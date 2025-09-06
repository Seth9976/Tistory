package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class i implements Function {
    public final int a;
    public final Object b;

    public i(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function
    public final Object apply(Object object0) {
        Object object1 = this.b;
        switch(this.a) {
            case 0: {
                ((SQLiteEventStore)object1).getClass();
                while(((Cursor)object0).moveToNext()) {
                    int v1 = ((Cursor)object0).getInt(0);
                    String s = ((Cursor)object0).getString(1);
                    ((SQLiteEventStore)object1).recordLogEventDropped(((long)v1), Reason.MESSAGE_TOO_OLD, s);
                }
                return null;
            }
            case 1: {
                ((SQLiteEventStore)object1).getClass();
                ((SQLiteDatabase)object0).compileStatement("DELETE FROM log_event_dropped").execute();
                ((SQLiteDatabase)object0).compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + ((SQLiteEventStore)object1).b.getTime()).execute();
                return null;
            }
            case 2: {
                ((SQLiteEventStore)object1).getClass();
                while(((Cursor)object0).moveToNext()) {
                    int v2 = ((Cursor)object0).getInt(0);
                    String s1 = ((Cursor)object0).getString(1);
                    ((SQLiteEventStore)object1).recordLogEventDropped(((long)v2), Reason.MAX_RETRIES_REACHED, s1);
                }
                return null;
            }
            default: {
                while(((Cursor)object0).moveToNext()) {
                    long v = ((Cursor)object0).getLong(0);
                    Set set0 = (Set)((HashMap)object1).get(v);
                    if(set0 == null) {
                        set0 = new HashSet();
                        ((HashMap)object1).put(v, set0);
                    }
                    set0.add(new m(((Cursor)object0).getString(1), ((Cursor)object0).getString(2)));
                }
                return null;
            }
        }
    }
}


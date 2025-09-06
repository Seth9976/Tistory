package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason;

public final class l implements Function {
    public final String a;
    public final Reason b;
    public final long c;

    public l(long v, Reason logEventDropped$Reason0, String s) {
        this.a = s;
        this.b = logEventDropped$Reason0;
        this.c = v;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function
    public final Object apply(Object object0) {
        Reason logEventDropped$Reason0 = this.b;
        String s = this.a;
        boolean z = ((Boolean)SQLiteEventStore.g(((SQLiteDatabase)object0).rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{s, Integer.toString(logEventDropped$Reason0.getNumber())}), new h(1))).booleanValue();
        long v = this.c;
        if(!z) {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("log_source", s);
            contentValues0.put("reason", logEventDropped$Reason0.getNumber());
            contentValues0.put("events_dropped_count", v);
            ((SQLiteDatabase)object0).insert("log_event_dropped", null, contentValues0);
            return null;
        }
        ((SQLiteDatabase)object0).execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + v + " WHERE log_source = ? AND reason = ?", new String[]{s, Integer.toString(logEventDropped$Reason0.getNumber())});
        return null;
    }
}


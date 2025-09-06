package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.util.PriorityMapping;

public final class k implements Function {
    public final long a;
    public final TransportContext b;

    public k(TransportContext transportContext0, long v) {
        this.a = v;
        this.b = transportContext0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function
    public final Object apply(Object object0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("next_request_ms", this.a);
        TransportContext transportContext0 = this.b;
        if(((SQLiteDatabase)object0).update("transport_contexts", contentValues0, "backend_name = ? and priority = ?", new String[]{transportContext0.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext0.getPriority()))}) < 1) {
            contentValues0.put("backend_name", transportContext0.getBackendName());
            contentValues0.put("priority", PriorityMapping.toInt(transportContext0.getPriority()));
            ((SQLiteDatabase)object0).insert("transport_contexts", null, contentValues0);
        }
        return null;
    }
}


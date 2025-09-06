package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.EventInternal.Builder;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;

public final class g implements Function {
    public final SQLiteEventStore a;
    public final TransportContext b;

    public g(SQLiteEventStore sQLiteEventStore0, TransportContext transportContext0) {
        this.a = sQLiteEventStore0;
        this.b = transportContext0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function
    public final Object apply(Object object0) {
        SQLiteEventStore sQLiteEventStore0 = this.a;
        a a0 = (a)sQLiteEventStore0.d;
        TransportContext transportContext0 = this.b;
        ArrayList arrayList0 = sQLiteEventStore0.e(((SQLiteDatabase)object0), transportContext0, a0.c);
        Priority[] arr_priority = Priority.values();
        for(int v1 = 0; v1 < arr_priority.length; ++v1) {
            Priority priority0 = arr_priority[v1];
            if(priority0 != transportContext0.getPriority()) {
                int v2 = a0.c - arrayList0.size();
                if(v2 <= 0) {
                    break;
                }
                arrayList0.addAll(sQLiteEventStore0.e(((SQLiteDatabase)object0), transportContext0.withPriority(priority0), v2));
            }
        }
        HashMap hashMap0 = new HashMap();
        StringBuilder stringBuilder0 = new StringBuilder("event_id IN (");
        for(int v = 0; v < arrayList0.size(); ++v) {
            stringBuilder0.append(((PersistedEvent)arrayList0.get(v)).getId());
            if(v < arrayList0.size() - 1) {
                stringBuilder0.append(',');
            }
        }
        stringBuilder0.append(')');
        SQLiteEventStore.g(((SQLiteDatabase)object0).query("event_metadata", new String[]{"event_id", "name", "value"}, stringBuilder0.toString(), null, null, null, null), new i(hashMap0, 3));
        ListIterator listIterator0 = arrayList0.listIterator();
        while(listIterator0.hasNext()) {
            PersistedEvent persistedEvent0 = (PersistedEvent)listIterator0.next();
            if(hashMap0.containsKey(persistedEvent0.getId())) {
                Builder eventInternal$Builder0 = persistedEvent0.getEvent().toBuilder();
                for(Object object1: ((Set)hashMap0.get(persistedEvent0.getId()))) {
                    eventInternal$Builder0.addMetadata(((m)object1).a, ((m)object1).b);
                }
                listIterator0.set(PersistedEvent.create(persistedEvent0.getId(), persistedEvent0.getTransportContext(), eventInternal$Builder0.build()));
            }
        }
        return arrayList0;
    }
}


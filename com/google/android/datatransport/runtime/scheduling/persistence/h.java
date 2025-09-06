package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.util.Base64;
import com.google.android.datatransport.runtime.TransportContext.Builder;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.ArrayList;

public final class h implements Function {
    public final int a;

    public h(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function
    public final Object apply(Object object0) {
        boolean z = false;
        if(this.a != 0) {
            if(((Cursor)object0).getCount() > 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        ArrayList arrayList0 = new ArrayList();
        while(((Cursor)object0).moveToNext()) {
            Builder transportContext$Builder0 = TransportContext.builder().setBackendName(((Cursor)object0).getString(1)).setPriority(PriorityMapping.valueOf(((Cursor)object0).getInt(2)));
            String s = ((Cursor)object0).getString(3);
            arrayList0.add(transportContext$Builder0.setExtras((s == null ? null : Base64.decode(s, 0))).build());
        }
        return arrayList0;
    }
}


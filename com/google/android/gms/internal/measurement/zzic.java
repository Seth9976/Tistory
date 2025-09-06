package com.google.android.gms.internal.measurement;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.Iterator;

public final class zzic implements zzhk {
    public static final ArrayMap a;

    static {
        zzic.a = new ArrayMap();
    }

    public static zzic a() {
        throw null;
    }

    public static void b() {
        synchronized(zzic.class) {
            ArrayMap arrayMap0 = zzic.a;
            Iterator iterator0 = arrayMap0.values().iterator();
            if(!iterator0.hasNext()) {
                arrayMap0.clear();
                return;
            }
            Object object0 = iterator0.next();
            ((zzic)object0).getClass();
        }
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhk
    @Nullable
    public final Object zzb(String s) {
        throw null;
    }
}


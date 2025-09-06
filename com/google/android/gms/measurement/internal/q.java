package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzff;

public final class q extends LruCache {
    public final zzfi j;

    public q(zzfi zzfi0) {
        this.j = zzfi0;
        super(20);
    }

    @Override  // androidx.collection.LruCache
    public final Object create(Object object0) {
        Preconditions.checkNotEmpty(((String)object0));
        zzfi zzfi0 = this.j;
        zzfi0.zzW();
        Preconditions.checkNotEmpty(((String)object0));
        if(!zzfi0.zzo(((String)object0))) {
            return null;
        }
        ArrayMap arrayMap0 = zzfi0.f;
        if(arrayMap0.containsKey(((String)object0)) && arrayMap0.get(((String)object0)) != null) {
            zzfi0.d(((String)object0), ((zzff)arrayMap0.get(((String)object0))));
            return (zzc)zzfi0.h.snapshot().get(((String)object0));
        }
        zzfi0.c(((String)object0));
        return (zzc)zzfi0.h.snapshot().get(((String)object0));
    }
}


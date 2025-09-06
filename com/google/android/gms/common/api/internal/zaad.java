package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.WeakHashMap;

public final class zaad {
    public final Map a;
    public final Map b;

    public zaad() {
        this.a = Collections.synchronizedMap(new WeakHashMap());
        this.b = Collections.synchronizedMap(new WeakHashMap());
    }

    public final void a(Status status0, boolean z) {
        synchronized(this.a) {
            HashMap hashMap0 = new HashMap(this.a);
        }
        synchronized(this.b) {
            HashMap hashMap1 = new HashMap(this.b);
        }
        for(Object object0: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(z || ((Boolean)map$Entry0.getValue()).booleanValue()) {
                ((BasePendingResult)map$Entry0.getKey()).forceFailureUnlessReady(status0);
            }
        }
        for(Object object1: hashMap1.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object1;
            if(z || ((Boolean)map$Entry1.getValue()).booleanValue()) {
                ((TaskCompletionSource)map$Entry1.getKey()).trySetException(new ApiException(status0));
            }
        }
    }

    public final void zaf() {
        this.a(GoogleApiManager.zaa, false);
    }
}


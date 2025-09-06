package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Set;

public final class zal {
    public final ArrayMap a;
    public final ArrayMap b;
    public final TaskCompletionSource c;
    public int d;
    public boolean e;

    public zal(Iterable iterable0) {
        this.b = new ArrayMap();
        this.c = new TaskCompletionSource();
        this.e = false;
        this.a = new ArrayMap();
        for(Object object0: iterable0) {
            ApiKey apiKey0 = ((HasApiKey)object0).getApiKey();
            this.a.put(apiKey0, null);
        }
        this.d = this.a.keySet().size();
    }

    public final Task zaa() {
        return this.c.getTask();
    }

    public final Set zab() {
        return this.a.keySet();
    }

    public final void zac(ApiKey apiKey0, ConnectionResult connectionResult0, @Nullable String s) {
        ArrayMap arrayMap0 = this.a;
        arrayMap0.put(apiKey0, connectionResult0);
        ArrayMap arrayMap1 = this.b;
        arrayMap1.put(apiKey0, s);
        --this.d;
        if(!connectionResult0.isSuccess()) {
            this.e = true;
        }
        if(this.d == 0) {
            TaskCompletionSource taskCompletionSource0 = this.c;
            if(this.e) {
                taskCompletionSource0.setException(new AvailabilityException(arrayMap0));
                return;
            }
            taskCompletionSource0.setResult(arrayMap1);
        }
    }
}


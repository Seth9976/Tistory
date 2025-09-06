package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api.Client;

public final class zal {
    public final SparseIntArray a;
    public final GoogleApiAvailabilityLight b;

    public zal() {
        this(GoogleApiAvailability.getInstance());
    }

    public zal(@NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight0) {
        this.a = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight0);
        this.b = googleApiAvailabilityLight0;
    }

    public final int zaa(Context context0, int v) {
        return this.a.get(v, -1);
    }

    public final int zab(@NonNull Context context0, @NonNull Client api$Client0) {
        SparseIntArray sparseIntArray0;
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(api$Client0);
        int v = 0;
        if(!api$Client0.requiresGooglePlayServices()) {
            return 0;
        }
        int v1 = api$Client0.getMinApkVersion();
        int v2 = this.zaa(context0, v1);
        if(v2 == -1) {
            for(int v3 = 0; true; ++v3) {
                sparseIntArray0 = this.a;
                if(v3 >= sparseIntArray0.size()) {
                    v = -1;
                    break;
                }
                int v4 = sparseIntArray0.keyAt(v3);
                if(v4 > v1 && sparseIntArray0.get(v4) == 0) {
                    break;
                }
            }
            v2 = v == -1 ? this.b.isGooglePlayServicesAvailable(context0, v1) : v;
            sparseIntArray0.put(v1, v2);
        }
        return v2;
    }

    public final void zac() {
        this.a.clear();
    }
}


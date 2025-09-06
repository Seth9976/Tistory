package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class zzen extends m1 {
    public zzen(zzkt zzkt0) {
        super(zzkt0);
    }

    public final boolean zza() {
        this.zzW();
        ConnectivityManager connectivityManager0 = (ConnectivityManager)this.zzt.zzau().getSystemService("connectivity");
        NetworkInfo networkInfo0 = null;
        if(connectivityManager0 != null) {
            try {
                networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            }
            catch(SecurityException unused_ex) {
            }
        }
        return networkInfo0 != null && networkInfo0.isConnected();
    }

    @Override  // com.google.android.gms.measurement.internal.m1
    public final boolean zzb() {
        return false;
    }
}


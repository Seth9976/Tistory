package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzeq {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final o e;

    public zzeq(o o0, String s, boolean z) {
        this.e = o0;
        super();
        Preconditions.checkNotEmpty(s);
        this.a = s;
        this.b = z;
    }

    @WorkerThread
    public final void zza(boolean z) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.e.a().edit();
        sharedPreferences$Editor0.putBoolean(this.a, z);
        sharedPreferences$Editor0.apply();
        this.d = z;
    }

    @WorkerThread
    public final boolean zzb() {
        if(!this.c) {
            this.c = true;
            this.d = this.e.a().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}


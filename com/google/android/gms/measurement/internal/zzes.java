package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzes {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final o e;

    public zzes(o o0, String s, long v) {
        this.e = o0;
        super();
        Preconditions.checkNotEmpty(s);
        this.a = s;
        this.b = v;
    }

    @WorkerThread
    public final long zza() {
        if(!this.c) {
            this.c = true;
            this.d = this.e.a().getLong(this.a, this.b);
        }
        return this.d;
    }

    @WorkerThread
    public final void zzb(long v) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.e.a().edit();
        sharedPreferences$Editor0.putLong(this.a, v);
        sharedPreferences$Editor0.apply();
        this.d = v;
    }
}


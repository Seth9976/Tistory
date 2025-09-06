package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzev {
    public final String a;
    public boolean b;
    public String c;
    public final o d;

    public zzev(o o0, String s, String s1) {
        this.d = o0;
        super();
        Preconditions.checkNotEmpty(s);
        this.a = s;
    }

    @WorkerThread
    public final String zza() {
        if(!this.b) {
            this.b = true;
            this.c = this.d.a().getString(this.a, null);
        }
        return this.c;
    }

    @WorkerThread
    public final void zzb(String s) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.d.a().edit();
        sharedPreferences$Editor0.putString(this.a, s);
        sharedPreferences$Editor0.apply();
        this.c = s;
    }
}


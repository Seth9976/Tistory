package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzeu {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final o e;

    public zzeu(o o0, long v) {
        this.e = o0;
        new String("health_monitor");
        Preconditions.checkArgument(v > 0L);
        this.a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.d = v;
    }

    public final void a() {
        this.e.zzg();
        long v = this.e.zzt.zzav().currentTimeMillis();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.e.a().edit();
        sharedPreferences$Editor0.remove(this.b);
        sharedPreferences$Editor0.remove(this.c);
        sharedPreferences$Editor0.putLong(this.a, v);
        sharedPreferences$Editor0.apply();
    }

    @WorkerThread
    public final Pair zza() {
        long v1;
        o o0 = this.e;
        o0.zzg();
        o0.zzg();
        long v = o0.a().getLong(this.a, 0L);
        if(v == 0L) {
            this.a();
            v1 = 0L;
        }
        else {
            v1 = Math.abs(v - o0.zzt.zzav().currentTimeMillis());
        }
        long v2 = this.d;
        if(Long.compare(v1, v2) < 0) {
            return null;
        }
        if(v1 > v2 + v2) {
            this.a();
            return null;
        }
        String s = o0.a().getString(this.c, null);
        long v3 = o0.a().getLong(this.b, 0L);
        this.a();
        return s == null || v3 <= 0L ? o.w : new Pair(s, v3);
    }

    @WorkerThread
    public final void zzb(String s, long v) {
        o o0 = this.e;
        o0.zzg();
        if(o0.a().getLong(this.a, 0L) == 0L) {
            this.a();
        }
        if(s == null) {
            s = "";
        }
        SharedPreferences sharedPreferences0 = o0.a();
        String s1 = this.b;
        long v1 = sharedPreferences0.getLong(s1, 0L);
        String s2 = this.c;
        if(Long.compare(v1, 0L) <= 0) {
            SharedPreferences.Editor sharedPreferences$Editor0 = o0.a().edit();
            sharedPreferences$Editor0.putString(s2, s);
            sharedPreferences$Editor0.putLong(s1, 1L);
            sharedPreferences$Editor0.apply();
            return;
        }
        long v2 = o0.zzt.zzv().d().nextLong();
        SharedPreferences.Editor sharedPreferences$Editor1 = o0.a().edit();
        if((0x7FFFFFFFFFFFFFFFL & v2) < 0x7FFFFFFFFFFFFFFFL / (v1 + 1L)) {
            sharedPreferences$Editor1.putString(s2, s);
        }
        sharedPreferences$Editor1.putLong(s1, v1 + 1L);
        sharedPreferences$Editor1.apply();
    }
}


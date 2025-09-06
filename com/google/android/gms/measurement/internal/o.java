package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;

public final class o extends b0 {
    public SharedPreferences b;
    public zzeu c;
    public final zzes d;
    public final zzev e;
    public String f;
    public boolean g;
    public long h;
    public final zzes i;
    public final zzeq j;
    public final zzev k;
    public final zzeq l;
    public final zzes m;
    public final zzes n;
    public boolean o;
    public final zzeq p;
    public final zzeq q;
    public final zzes r;
    public final zzev s;
    public final zzev t;
    public final zzes u;
    public final zzer v;
    public static final Pair w;

    static {
        o.w = new Pair("", 0L);
    }

    public o(zzfr zzfr0) {
        super(zzfr0);
        this.i = new zzes(this, "session_timeout", 1800000L);
        this.j = new zzeq(this, "start_new_session", true);
        this.m = new zzes(this, "last_pause_time", 0L);
        this.n = new zzes(this, "session_id", 0L);
        this.k = new zzev(this, "non_personalized_ads", null);
        this.l = new zzeq(this, "allow_remote_dynamite", false);
        this.d = new zzes(this, "first_open_time", 0L);
        new zzes(this, "app_install_time", 0L);
        this.e = new zzev(this, "app_instance_id", null);
        this.p = new zzeq(this, "app_backgrounded", false);
        this.q = new zzeq(this, "deep_link_retrieval_complete", false);
        this.r = new zzes(this, "deep_link_retrieval_attempts", 0L);
        this.s = new zzev(this, "firebase_feature_rollouts", null);
        this.t = new zzev(this, "deferred_attribution_cache", null);
        this.u = new zzes(this, "deferred_attribution_cache_timestamp", 0L);
        this.v = new zzer(this, "default_event_parameters", null);
    }

    public final SharedPreferences a() {
        this.zzg();
        this.zzu();
        Preconditions.checkNotNull(this.b);
        return this.b;
    }

    public final zzai b() {
        this.zzg();
        return zzai.zzb(this.a().getString("consent_settings", "G1"));
    }

    public final void c(boolean z) {
        this.zzg();
        this.zzt.zzay().zzj().zzb("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor sharedPreferences$Editor0 = this.a().edit();
        sharedPreferences$Editor0.putBoolean("deferred_analytics_collection", z);
        sharedPreferences$Editor0.apply();
    }

    public final boolean d(long v) {
        return v - this.i.zza() > this.m.zza();
    }

    @Override  // com.google.android.gms.measurement.internal.b0
    public final void zzaA() {
        SharedPreferences sharedPreferences0 = this.zzt.zzau().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.b = sharedPreferences0;
        boolean z = sharedPreferences0.getBoolean("has_been_opened", false);
        this.o = z;
        if(!z) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.b.edit();
            sharedPreferences$Editor0.putBoolean("has_been_opened", true);
            sharedPreferences$Editor0.apply();
        }
        this.c = new zzeu(this, Math.max(0L, ((long)(((Long)zzdu.zzb.zza(null))))));
    }

    @Override  // com.google.android.gms.measurement.internal.b0
    public final boolean zzf() {
        return true;
    }
}


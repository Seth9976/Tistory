package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zznw;
import g.a;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;

public final class zzfr implements zzgm {
    public volatile Boolean A;
    public volatile boolean B;
    public int C;
    public final AtomicInteger D;
    public final long E;
    public static volatile zzfr F;
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final zzab f;
    public final zzag g;
    public final o h;
    public final zzeh i;
    public final zzfo j;
    public final zzkc k;
    public final zzlb l;
    public final zzec m;
    public final Clock n;
    public final zzim o;
    public final zzhx p;
    public final zzd q;
    public final zzib r;
    public final String s;
    public zzea t;
    public zzjm u;
    public zzaq v;
    public zzdy w;
    public boolean x;
    public Boolean y;
    public long z;
    @VisibleForTesting
    protected Boolean zza;
    @VisibleForTesting
    protected Boolean zzb;

    public zzfr(zzgu zzgu0) {
        boolean z = false;
        this.x = false;
        this.D = new AtomicInteger(0);
        Preconditions.checkNotNull(zzgu0);
        Context context0 = zzgu0.a;
        zzab zzab0 = new zzab();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.f = zzab0;
        a.d = zzab0;
        this.a = context0;
        this.b = zzgu0.b;
        this.c = zzgu0.c;
        this.d = zzgu0.d;
        this.e = zzgu0.h;
        this.A = zzgu0.e;
        this.s = zzgu0.j;
        this.B = true;
        zzcl zzcl0 = zzgu0.g;
        if(zzcl0 != null) {
            Bundle bundle0 = zzcl0.zzg;
            if(bundle0 != null) {
                Object object0 = bundle0.get("measurementEnabled");
                if(object0 instanceof Boolean) {
                    this.zza = (Boolean)object0;
                }
                Object object1 = zzcl0.zzg.get("measurementDeactivated");
                if(object1 instanceof Boolean) {
                    this.zzb = (Boolean)object1;
                }
            }
        }
        com.google.android.gms.internal.measurement.zzib.zze(context0);
        Clock clock0 = DefaultClock.getInstance();
        this.n = clock0;
        this.E = zzgu0.i == null ? clock0.currentTimeMillis() : ((long)zzgu0.i);
        zzag zzag0 = new zzag(this);  // 初始化器: Lcom/google/android/gms/measurement/internal/a0;-><init>(Lcom/google/android/gms/measurement/internal/zzfr;)V
        zzag0.b = (String s, String s1) -> null;
        this.g = zzag0;
        o o0 = new o(this);
        o0.zzv();
        this.h = o0;
        zzeh zzeh0 = new zzeh(this);
        zzeh0.zzv();
        this.i = zzeh0;
        zzlb zzlb0 = new zzlb(this);
        zzlb0.zzv();
        this.l = zzlb0;
        this.m = new zzec(new r(this));
        this.q = new zzd(this);
        zzim zzim0 = new zzim(this);
        zzim0.zzb();
        this.o = zzim0;
        zzhx zzhx0 = new zzhx(this);
        zzhx0.zzb();
        this.p = zzhx0;
        zzkc zzkc0 = new zzkc(this);
        zzkc0.zzb();
        this.k = zzkc0;
        zzib zzib0 = new zzib(this);  // 初始化器: Lcom/google/android/gms/measurement/internal/b0;-><init>(Lcom/google/android/gms/measurement/internal/zzfr;)V
        zzib0.zzv();
        this.r = zzib0;
        zzfo zzfo0 = new zzfo(this);
        zzfo0.zzv();
        this.j = zzfo0;
        if(zzgu0.g == null || zzgu0.g.zzb == 0L) {
            z = true;
        }
        if(context0.getApplicationContext() instanceof Application) {
            zzhx zzhx1 = this.zzq();
            if(zzhx1.zzt.a.getApplicationContext() instanceof Application) {
                Application application0 = (Application)zzhx1.zzt.a.getApplicationContext();
                if(zzhx1.zza == null) {
                    zzhx1.zza = new n0(zzhx1);
                }
                if(z) {
                    application0.unregisterActivityLifecycleCallbacks(zzhx1.zza);
                    application0.registerActivityLifecycleCallbacks(zzhx1.zza);
                    androidx.room.a.B(zzhx1.zzt, "Registered activity lifecycle callback");
                }
            }
        }
        else {
            androidx.room.a.A(this, "Application context is not an Application");
        }
        zzfo0.zzp(new f(1, this, zzgu0));
    }

    public static final void a(p p0) {
        if(p0 == null) {
            throw new IllegalStateException("Component not created");
        }
        if(!p0.a) {
            throw new IllegalStateException("Component not initialized: " + p0.getClass());
        }
    }

    public static final void b(b0 b00) {
        if(b00 == null) {
            throw new IllegalStateException("Component not created");
        }
        if(!b00.a) {
            throw new IllegalStateException("Component not initialized: " + b00.getClass());
        }
    }

    @WorkerThread
    public final void zzE() {
        Pair pair0;
        this.zzaz().zzg();
        zzfr.b(this.zzr());
        String s = this.zzh().zzl();
        o o0 = this.zzm();
        o0.zzg();
        long v = o0.zzt.zzav().elapsedRealtime();
        String s1 = o0.f;
        if(s1 == null || v >= o0.h) {
            o0.h = o0.zzt.zzf().zzi(s, zzdu.zza) + v;
            try {
                Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(o0.zzt.zzau());
                o0.f = "";
                String s2 = advertisingIdClient$Info0.getId();
                if(s2 != null) {
                    o0.f = s2;
                }
                o0.g = advertisingIdClient$Info0.isLimitAdTrackingEnabled();
            }
            catch(Exception exception0) {
                o0.zzt.zzay().zzc().zzb("Unable to get advertising id", exception0);
                o0.f = "";
            }
            pair0 = new Pair(o0.f, Boolean.valueOf(o0.g));
        }
        else {
            pair0 = new Pair(s1, Boolean.valueOf(o0.g));
        }
        if(this.g.zzr() && !((Boolean)pair0.second).booleanValue() && !TextUtils.isEmpty(((CharSequence)pair0.first))) {
            zzib zzib0 = this.zzr();
            zzib0.zzu();
            ConnectivityManager connectivityManager0 = (ConnectivityManager)zzib0.zzt.a.getSystemService("connectivity");
            NetworkInfo networkInfo0 = null;
            if(connectivityManager0 != null) {
                try {
                    networkInfo0 = connectivityManager0.getActiveNetworkInfo();
                }
                catch(SecurityException unused_ex) {
                }
            }
            if(networkInfo0 != null && networkInfo0.isConnected()) {
                zzlb zzlb0 = this.zzv();
                this.zzh().zzt.g.zzh();
                URL uRL0 = zzlb0.zzE(74029L, s, ((String)pair0.first), this.zzm().r.zza() - 1L);
                if(uRL0 != null) {
                    zzib zzib1 = this.zzr();
                    zzfp zzfp0 = new zzfp(this);
                    zzib1.zzg();
                    zzib1.zzu();
                    Preconditions.checkNotNull(uRL0);
                    Preconditions.checkNotNull(zzfp0);
                    zzib1.zzt.zzaz().zzo(new p0(zzib1, s, uRL0, zzfp0));
                }
                return;
            }
            androidx.room.a.A(this, "Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        this.zzay().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    @WorkerThread
    public final void zzG(boolean z) {
        this.zzaz().zzg();
        this.B = z;
    }

    @WorkerThread
    public final void zzH(zzcl zzcl0) {
        zzai zzai1;
        this.zzaz().zzg();
        zzai zzai0 = this.zzm().b();
        o o0 = this.zzm();
        o0.zzg();
        int v = 100;
        int v1 = o0.a().getInt("consent_source", 100);
        zzag zzag0 = this.g;
        Boolean boolean0 = zzag0.c("google_analytics_default_allow_ad_storage");
        Boolean boolean1 = zzag0.c("google_analytics_default_allow_analytics_storage");
        long v2 = this.E;
        if((boolean0 != null || boolean1 != null) && zzai.zzj(-10, this.zzm().a().getInt("consent_source", 100))) {
            zzai1 = new zzai(boolean0, boolean1);
            v = -10;
        }
        else if(!TextUtils.isEmpty(this.zzh().zzm()) && (v1 == 0 || v1 == 30 || (v1 == 10 || v1 == 30) || v1 == 40)) {
            this.zzq().zzS(zzai.zza, -10, v2);
            zzai1 = null;
        }
        else if(!TextUtils.isEmpty(this.zzh().zzm()) || zzcl0 == null || zzcl0.zzg == null || !zzai.zzj(30, this.zzm().a().getInt("consent_source", 100))) {
            zzai1 = null;
        }
        else {
            zzai1 = zzai.zza(zzcl0.zzg);
            if(zzai1.equals(zzai.zza)) {
                zzai1 = null;
            }
            else {
                v = 30;
            }
        }
        if(zzai1 != null) {
            this.zzq().zzS(zzai1, v, v2);
            zzai0 = zzai1;
        }
        this.zzq().d(zzai0);
        if(this.zzm().d.zza() == 0L) {
            this.zzay().zzj().zzb("Persisting first open", v2);
            this.zzm().d.zzb(v2);
        }
        zzs zzs0 = this.zzq().l;
        if(zzs0.b() && zzs0.c()) {
            zzs0.a.zzm().t.zzb(null);
        }
        boolean z = false;
        if(this.zzM()) {
            if(TextUtils.isEmpty(this.zzh().zzm())) {
                zzdy zzdy0 = this.zzh();
                zzdy0.zza();
                if(!TextUtils.isEmpty(zzdy0.l)) {
                    goto label_60;
                }
            }
            else {
            label_60:
                zzlb zzlb0 = this.zzv();
                String s = this.zzh().zzm();
                o o1 = this.zzm();
                o1.zzg();
                String s1 = o1.a().getString("gmp_app_id", null);
                zzdy zzdy1 = this.zzh();
                zzdy1.zza();
                String s2 = zzdy1.l;
                o o2 = this.zzm();
                o2.zzg();
                String s3 = o2.a().getString("admob_app_id", null);
                zzlb0.getClass();
                if(zzlb.y(s, s1, s2, s3)) {
                    this.zzay().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    o o3 = this.zzm();
                    o3.zzg();
                    o3.zzg();
                    Boolean boolean2 = o3.a().contains("measurement_enabled") ? Boolean.valueOf(o3.a().getBoolean("measurement_enabled", true)) : null;
                    SharedPreferences.Editor sharedPreferences$Editor0 = o3.a().edit();
                    sharedPreferences$Editor0.clear();
                    sharedPreferences$Editor0.apply();
                    if(boolean2 != null) {
                        o3.zzg();
                        SharedPreferences.Editor sharedPreferences$Editor1 = o3.a().edit();
                        sharedPreferences$Editor1.putBoolean("measurement_enabled", boolean2.booleanValue());
                        sharedPreferences$Editor1.apply();
                    }
                    this.zzi().zzj();
                    this.u.zzs();
                    this.u.j();
                    this.zzm().d.zzb(v2);
                    this.zzm().e.zzb(null);
                }
                o o4 = this.zzm();
                String s4 = this.zzh().zzm();
                o4.zzg();
                SharedPreferences.Editor sharedPreferences$Editor2 = o4.a().edit();
                sharedPreferences$Editor2.putString("gmp_app_id", s4);
                sharedPreferences$Editor2.apply();
                o o5 = this.zzm();
                zzdy zzdy2 = this.zzh();
                zzdy2.zza();
                String s5 = zzdy2.l;
                o5.zzg();
                SharedPreferences.Editor sharedPreferences$Editor3 = o5.a().edit();
                sharedPreferences$Editor3.putString("admob_app_id", s5);
                sharedPreferences$Editor3.apply();
            }
            if(!this.zzm().b().zzi(zzah.zzb)) {
                this.zzm().e.zzb(null);
            }
            zzhx zzhx0 = this.zzq();
            String s6 = this.zzm().e.zza();
            zzhx0.e.set(s6);
            zznw.zzc();
            if(zzag0.zzs(null, zzdu.zzac)) {
                zzlb zzlb1 = this.zzv();
                try {
                    zzlb1.zzt.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                }
                catch(ClassNotFoundException unused_ex) {
                    if(!TextUtils.isEmpty(this.zzm().s.zza())) {
                        this.zzay().zzk().zza("Remote config removed with active feature rollouts");
                        this.zzm().s.zzb(null);
                    }
                }
            }
            if(TextUtils.isEmpty(this.zzh().zzm())) {
                zzdy zzdy3 = this.zzh();
                zzdy3.zza();
                if(!TextUtils.isEmpty(zzdy3.l)) {
                    goto label_122;
                }
            }
            else {
            label_122:
                boolean z1 = this.zzJ();
                SharedPreferences sharedPreferences0 = this.zzm().b;
                if(sharedPreferences0 != null) {
                    z = sharedPreferences0.contains("deferred_analytics_collection");
                }
                if(!z && !zzag0.zzv()) {
                    this.zzm().c(!z1);
                }
                if(z1) {
                    this.zzq().zzz();
                }
                this.zzu().zza.a();
                this.zzt().zzu(new AtomicReference());
                this.zzt().zzH(this.zzm().v.zza());
            }
        }
        else if(this.zzJ()) {
            if(!this.zzv().s("android.permission.INTERNET")) {
                androidx.room.a.v(this, "App is missing INTERNET permission");
            }
            if(!this.zzv().s("android.permission.ACCESS_NETWORK_STATE")) {
                androidx.room.a.v(this, "App is missing ACCESS_NETWORK_STATE permission");
            }
            Context context0 = this.a;
            if(!Wrappers.packageManager(context0).isCallerInstantApp() && !zzag0.d()) {
                if(!zzlb.x(context0)) {
                    androidx.room.a.v(this, "AppMeasurementReceiver not registered/enabled");
                }
                Preconditions.checkNotNull(context0);
                try {
                    PackageManager packageManager0 = context0.getPackageManager();
                    if(packageManager0 == null) {
                        goto label_53;
                    }
                    else {
                        ServiceInfo serviceInfo0 = packageManager0.getServiceInfo(new ComponentName(context0, "com.google.android.gms.measurement.AppMeasurementJobService"), 0);
                        if(serviceInfo0 == null) {
                            goto label_53;
                        }
                        else if(!serviceInfo0.enabled) {
                            goto label_53;
                        }
                    }
                    goto label_54;
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
            label_53:
                androidx.room.a.v(this, "AppMeasurementService not registered/enabled");
            }
        label_54:
            androidx.room.a.v(this, "Uploading is not possible. App measurement disabled");
        }
        this.zzm().l.zza(true);
    }

    @WorkerThread
    public final boolean zzI() {
        return this.A != null && this.A.booleanValue();
    }

    @WorkerThread
    public final boolean zzJ() {
        return this.zza() == 0;
    }

    @WorkerThread
    public final boolean zzK() {
        this.zzaz().zzg();
        return this.B;
    }

    @Pure
    public final boolean zzL() {
        return TextUtils.isEmpty(this.b);
    }

    @WorkerThread
    public final boolean zzM() {
        boolean z1;
        if(!this.x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        this.zzaz().zzg();
        Clock clock0 = this.n;
        if(this.y == null || this.z == 0L || !this.y.booleanValue() && Math.abs(clock0.elapsedRealtime() - this.z) > 1000L) {
            this.z = clock0.elapsedRealtime();
            boolean z = false;
            if(!this.zzv().s("android.permission.INTERNET") || !this.zzv().s("android.permission.ACCESS_NETWORK_STATE")) {
                goto label_19;
            }
            else {
                Context context0 = this.a;
                if(Wrappers.packageManager(context0).isCallerInstantApp() || this.g.d()) {
                    z1 = true;
                }
                else if(zzlb.x(context0)) {
                    Preconditions.checkNotNull(context0);
                    try {
                        PackageManager packageManager0 = context0.getPackageManager();
                        if(packageManager0 == null) {
                        label_19:
                            z1 = false;
                        }
                        else {
                            ServiceInfo serviceInfo0 = packageManager0.getServiceInfo(new ComponentName(context0, "com.google.android.gms.measurement.AppMeasurementJobService"), 0);
                            if(serviceInfo0 != null && serviceInfo0.enabled) {
                                z1 = true;
                                goto label_20;
                            }
                            goto label_19;
                        }
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                        goto label_19;
                    }
                }
                else {
                    goto label_19;
                }
            }
        label_20:
            this.y = Boolean.valueOf(z1);
            if(z1) {
                zzlb zzlb0 = this.zzv();
                String s = this.zzh().zzm();
                zzdy zzdy0 = this.zzh();
                zzdy0.zza();
                if(zzlb0.l(s, zzdy0.l)) {
                    z = true;
                }
                else {
                    zzdy zzdy1 = this.zzh();
                    zzdy1.zza();
                    if(!TextUtils.isEmpty(zzdy1.l)) {
                        z = true;
                    }
                }
                this.y = Boolean.valueOf(z);
            }
        }
        return this.y.booleanValue();
    }

    @Pure
    public final boolean zzN() {
        return this.e;
    }

    @WorkerThread
    public final int zza() {
        this.zzaz().zzg();
        if(this.g.zzv()) {
            return 1;
        }
        if(this.zzb != null && this.zzb.booleanValue()) {
            return 2;
        }
        this.zzaz().zzg();
        if(!this.B) {
            return 8;
        }
        o o0 = this.zzm();
        o0.zzg();
        Boolean boolean0 = o0.a().contains("measurement_enabled") ? Boolean.valueOf(o0.a().getBoolean("measurement_enabled", true)) : null;
        if(boolean0 != null) {
            return boolean0.booleanValue() ? 0 : 3;
        }
        Boolean boolean1 = this.g.c("firebase_analytics_collection_enabled");
        if(boolean1 != null) {
            return boolean1.booleanValue() ? 0 : 4;
        }
        Boolean boolean2 = this.zza;
        if(boolean2 != null) {
            return boolean2.booleanValue() ? 0 : 5;
        }
        return this.A != null && !this.A.booleanValue() ? 7 : 0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final Context zzau() {
        return this.a;
    }

    @Override  // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final Clock zzav() {
        return this.n;
    }

    @Override  // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final zzab zzaw() {
        return this.f;
    }

    @Override  // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final zzeh zzay() {
        zzfr.b(this.i);
        return this.i;
    }

    @Override  // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final zzfo zzaz() {
        zzfr.b(this.j);
        return this.j;
    }

    @Pure
    public final zzd zzd() {
        zzd zzd0 = this.q;
        if(zzd0 == null) {
            throw new IllegalStateException("Component not created");
        }
        return zzd0;
    }

    @Pure
    public final zzag zzf() {
        return this.g;
    }

    @Pure
    public final zzaq zzg() {
        zzfr.b(this.v);
        return this.v;
    }

    @Pure
    public final zzdy zzh() {
        zzfr.a(this.w);
        return this.w;
    }

    @Pure
    public final zzea zzi() {
        zzfr.a(this.t);
        return this.t;
    }

    @Pure
    public final zzec zzj() {
        return this.m;
    }

    public final zzeh zzl() {
        return this.i == null || !this.i.a ? null : this.i;
    }

    @Pure
    public final o zzm() {
        o o0 = this.h;
        if(o0 == null) {
            throw new IllegalStateException("Component not created");
        }
        return o0;
    }

    public static zzfr zzp(Context context0, zzcl zzcl0, Long long0) {
        if(zzcl0 != null && (zzcl0.zze == null || zzcl0.zzf == null)) {
            zzcl0 = new zzcl(zzcl0.zza, zzcl0.zzb, zzcl0.zzc, zzcl0.zzd, null, null, zzcl0.zzg, null);
        }
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(context0.getApplicationContext());
        if(zzfr.F == null) {
            synchronized(zzfr.class) {
                if(zzfr.F == null) {
                    zzfr.F = new zzfr(new zzgu(context0, zzcl0, long0));
                }
            }
        }
        else if(zzcl0 != null && (zzcl0.zzg != null && zzcl0.zzg.containsKey("dataCollectionDefaultEnabled"))) {
            Preconditions.checkNotNull(zzfr.F);
            zzfr zzfr0 = zzfr.F;
            zzfr0.A = Boolean.valueOf(zzcl0.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzfr.F);
        return zzfr.F;
    }

    @Pure
    public final zzhx zzq() {
        zzfr.a(this.p);
        return this.p;
    }

    @Pure
    public final zzib zzr() {
        zzfr.b(this.r);
        return this.r;
    }

    @Pure
    public final zzim zzs() {
        zzfr.a(this.o);
        return this.o;
    }

    @Pure
    public final zzjm zzt() {
        zzfr.a(this.u);
        return this.u;
    }

    @Pure
    public final zzkc zzu() {
        zzfr.a(this.k);
        return this.k;
    }

    @Pure
    public final zzlb zzv() {
        zzlb zzlb0 = this.l;
        if(zzlb0 == null) {
            throw new IllegalStateException("Component not created");
        }
        return zzlb0;
    }

    @Pure
    public final String zzw() {
        return this.b;
    }

    @Pure
    public final String zzx() {
        return this.c;
    }

    @Pure
    public final String zzy() {
        return this.d;
    }

    @Pure
    public final String zzz() {
        return this.s;
    }
}


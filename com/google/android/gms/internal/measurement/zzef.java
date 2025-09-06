package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzfj;
import com.google.android.gms.measurement.internal.zzgr;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzef {
    public final String a;
    public final AppMeasurementSdk b;
    public final ArrayList c;
    public int d;
    public boolean e;
    public final String f;
    public volatile zzcc g;
    public static volatile zzef h;
    protected final Clock zza;
    protected final ExecutorService zzb;

    public zzef(Context context0, String s, String s1, String s2, Bundle bundle0) {
        this.a = s == null || s2 == null || s1 == null || this.zzS() ? "FA" : s;
        this.zza = DefaultClock.getInstance();
        q q0 = new q();
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), q0);
        int v = 1;
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
        this.zzb = Executors.unconfigurableExecutorService(threadPoolExecutor0);
        this.b = new AppMeasurementSdk(this);
        this.c = new ArrayList();
        try {
            String s3 = zzid.zzc(context0, "google_app_id", zzfj.zza(context0));
        }
        catch(IllegalStateException unused_ex) {
            goto label_19;
        }
        if(s3 != null && !this.zzS()) {
            this.f = null;
            this.e = true;
            Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
    label_19:
        if(s2 == null || s1 == null || this.zzS()) {
            this.f = "fa";
            if(s1 == null || s2 == null) {
                if(s2 != null) {
                    v = 0;
                }
                if(((s1 == null ? 1 : 0) ^ v) != 0) {
                    Log.w(this.a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
            else {
                Log.v(this.a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        else {
            this.f = s1;
        }
        this.b(new m(this, s1, s2, context0, bundle0));
        Application application0 = (Application)context0.getApplicationContext();
        if(application0 == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
            return;
        }
        application0.registerActivityLifecycleCallbacks(new z(this));
    }

    public final void a(Exception exception0, boolean z, boolean z1) {
        this.e |= z;
        String s = this.a;
        if(z) {
            Log.w(s, "Data collection startup failed. No data will be collected.", exception0);
            return;
        }
        if(z1) {
            this.zzB(5, "Error with data collection. Data lost.", exception0, null, null);
        }
        Log.w(s, "Error with data collection. Data lost.", exception0);
    }

    public final void b(v v0) {
        this.zzb.execute(v0);
    }

    public final void zzA(String s, String s1, Bundle bundle0, long v) {
        this.b(new u(this, v, s, s1, bundle0, true, false));
    }

    public final void zzB(int v, String s, Object object0, Object object1, Object object2) {
        this.b(new p(this, s, object0));
    }

    public final void zzC(zzgs zzgs0) {
        x x0;
        Preconditions.checkNotNull(zzgs0);
        synchronized(this.c) {
            for(int v1 = 0; v1 < this.c.size(); ++v1) {
                if(zzgs0.equals(((Pair)this.c.get(v1)).first)) {
                    Log.w(this.a, "OnEventListener already registered.");
                    return;
                }
            }
            x0 = new x(zzgs0);
            Pair pair0 = new Pair(zzgs0, x0);
            this.c.add(pair0);
        }
        if(this.g != null) {
            try {
                this.g.registerOnMeasurementEventListener(x0);
                return;
            }
            catch(RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException unused_ex) {
                Log.w(this.a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.b(new t(this, x0, 0));
    }

    public final void zzD() {
        this.b(new k(this));
    }

    public final void zzE(Bundle bundle0) {
        this.b(new g(this, bundle0, 0));
    }

    public final void zzF(Bundle bundle0) {
        this.b(new g(this, bundle0, 1));
    }

    public final void zzG(Bundle bundle0) {
        this.b(new g(this, bundle0, 2));
    }

    public final void zzH(Activity activity0, String s, String s1) {
        this.b(new h(this, activity0, s, s1));
    }

    public final void zzI(boolean z) {
        this.b(new s(this, z));
    }

    public final void zzJ(Bundle bundle0) {
        this.b(new g(this, bundle0, 3));
    }

    public final void zzK(zzgr zzgr0) {
        w w0 = new w(zzgr0);
        if(this.g != null) {
            try {
                this.g.setEventInterceptor(w0);
                return;
            }
            catch(RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException unused_ex) {
                Log.w(this.a, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.b(new j(this, w0, 1));
    }

    public final void zzL(Boolean boolean0) {
        this.b(new j(this, boolean0, 0));
    }

    public final void zzM(long v) {
        this.b(new l(this, v));
    }

    public final void zzN(String s) {
        this.b(new i(this, s, 0));
    }

    public final void zzO(String s, String s1, Object object0, boolean z) {
        this.b(new o(this, s, s1, object0, z));
    }

    public final void zzP(zzgs zzgs0) {
        x x0;
        Pair pair0;
        Preconditions.checkNotNull(zzgs0);
        synchronized(this.c) {
            for(int v1 = 0; true; ++v1) {
                pair0 = null;
                if(v1 >= this.c.size()) {
                    break;
                }
                if(zzgs0.equals(((Pair)this.c.get(v1)).first)) {
                    pair0 = (Pair)this.c.get(v1);
                    break;
                }
            }
            if(pair0 == null) {
                Log.w(this.a, "OnEventListener had not been registered.");
                return;
            }
            this.c.remove(pair0);
            x0 = (x)pair0.second;
        }
        if(this.g != null) {
            try {
                this.g.unregisterOnMeasurementEventListener(x0);
                return;
            }
            catch(RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException unused_ex) {
                Log.w(this.a, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.b(new t(this, x0, 1));
    }

    public final boolean zzS() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzef.class.getClassLoader());
            return true;
        }
        catch(ClassNotFoundException unused_ex) {
            return false;
        }
    }

    public final int zza(String s) {
        zzbz zzbz0 = new zzbz();
        this.b(new p(this, s, zzbz0, 2));
        Integer integer0 = (Integer)zzbz.zzf(zzbz0.zzb(10000L), Integer.class);
        return integer0 == null ? 25 : ((int)integer0);
    }

    public final long zzb() {
        zzbz zzbz0 = new zzbz();
        this.b(new n(this, zzbz0, 2));
        Long long0 = zzbz0.zzc(500L);
        if(long0 == null) {
            long v = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
            int v1 = this.d + 1;
            this.d = v1;
            return v + ((long)v1);
        }
        return (long)long0;
    }

    public final Bundle zzc(Bundle bundle0, boolean z) {
        zzbz zzbz0 = new zzbz();
        this.b(new p(this, bundle0, zzbz0, 1));
        return z ? zzbz0.zzb(5000L) : null;
    }

    public final AppMeasurementSdk zzd() {
        return this.b;
    }

    public final zzcc zzf(Context context0, boolean z) {
        try {
            return zzcb.asInterface(DynamiteModule.load(context0, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, "com.google.android.gms.measurement.dynamite").instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        }
        catch(LoadingException dynamiteModule$LoadingException0) {
            this.a(dynamiteModule$LoadingException0, true, false);
            return null;
        }
    }

    public static zzef zzg(Context context0, String s, String s1, String s2, Bundle bundle0) {
        Preconditions.checkNotNull(context0);
        if(zzef.h == null) {
            synchronized(zzef.class) {
                if(zzef.h == null) {
                    zzef.h = new zzef(context0, s, s1, s2, bundle0);
                }
            }
        }
        return zzef.h;
    }

    @WorkerThread
    public final Long zzh() {
        zzbz zzbz0 = new zzbz();
        this.b(new n(this, zzbz0, 6));
        return zzbz0.zzc(120000L);
    }

    public final Object zzi(int v) {
        zzbz zzbz0 = new zzbz();
        this.b(new r(this, zzbz0, v));
        return zzbz.zzf(zzbz0.zzb(15000L), Object.class);
    }

    public final String zzk() {
        return this.f;
    }

    @WorkerThread
    public final String zzl() {
        zzbz zzbz0 = new zzbz();
        this.b(new n(this, zzbz0, 5));
        return zzbz0.zzd(120000L);
    }

    public final String zzm() {
        zzbz zzbz0 = new zzbz();
        this.b(new n(this, zzbz0, 1));
        return zzbz0.zzd(50L);
    }

    public final String zzn() {
        zzbz zzbz0 = new zzbz();
        this.b(new n(this, zzbz0, 4));
        return zzbz0.zzd(500L);
    }

    public final String zzo() {
        zzbz zzbz0 = new zzbz();
        this.b(new n(this, zzbz0, 3));
        return zzbz0.zzd(500L);
    }

    public final String zzp() {
        zzbz zzbz0 = new zzbz();
        this.b(new n(this, zzbz0, 0));
        return zzbz0.zzd(500L);
    }

    public final List zzq(String s, String s1) {
        zzbz zzbz0 = new zzbz();
        this.b(new h(this, s, s1, zzbz0, 1));
        List list0 = (List)zzbz.zzf(zzbz0.zzb(5000L), List.class);
        return list0 == null ? Collections.emptyList() : list0;
    }

    public final Map zzr(String s, String s1, boolean z) {
        zzbz zzbz0 = new zzbz();
        this.b(new o(this, s, s1, z, zzbz0));
        Bundle bundle0 = zzbz0.zzb(5000L);
        if(bundle0 != null && bundle0.size() != 0) {
            Map map0 = new HashMap(bundle0.size());
            for(Object object0: bundle0.keySet()) {
                String s2 = (String)object0;
                Object object1 = bundle0.get(s2);
                if(object1 instanceof Double || object1 instanceof Long || object1 instanceof String) {
                    ((HashMap)map0).put(s2, object1);
                }
            }
            return map0;
        }
        return Collections.emptyMap();
    }

    public final void zzv(String s) {
        this.b(new i(this, s, 1));
    }

    public final void zzw(String s, String s1, Bundle bundle0) {
        this.b(new h(this, s, s1, bundle0, 0));
    }

    public final void zzx(String s) {
        this.b(new i(this, s, 2));
    }

    public final void zzy(@NonNull String s, Bundle bundle0) {
        this.b(new u(this, null, null, s, bundle0, false, true));
    }

    public final void zzz(String s, String s1, Bundle bundle0) {
        this.b(new u(this, null, s, s1, bundle0, true, true));
    }
}


package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;

public final class zzim extends p {
    public volatile zzie b;
    public volatile zzie c;
    public final ConcurrentHashMap d;
    public Activity e;
    public volatile boolean f;
    public volatile zzie g;
    public zzie h;
    public boolean i;
    public final Object j;
    @VisibleForTesting
    protected zzie zza;

    public zzim(zzfr zzfr0) {
        super(zzfr0);
        this.j = new Object();
        this.d = new ConcurrentHashMap();
    }

    // 检测为 Lambda 实现
    public final void a(zzie zzie0, zzie zzie1, long v, boolean z, Bundle bundle0) [...]

    public final void b(zzie zzie0, boolean z, long v) {
        this.zzt.zzd().zzf(this.zzt.zzav().elapsedRealtime());
        boolean z1 = zzie0 != null && zzie0.a;
        if(this.zzt.zzu().zzb.a(v, z1, z) && zzie0 != null) {
            zzie0.a = false;
        }
    }

    public final String c(Class class0) {
        String s = class0.getCanonicalName();
        if(s == null) {
            return "Activity";
        }
        String[] arr_s = s.split("\\.");
        String s1 = arr_s.length <= 0 ? "" : arr_s[arr_s.length - 1];
        return s1.length() <= 100 ? s1 : s1.substring(0, 100);
    }

    public final zzie d(Activity activity0) {
        Preconditions.checkNotNull(activity0);
        zzie zzie0 = (zzie)this.d.get(activity0);
        if(zzie0 == null) {
            zzie zzie1 = new zzie(null, this.c(activity0.getClass()), this.zzt.zzv().zzq());
            this.d.put(activity0, zzie1);
            zzie0 = zzie1;
        }
        return this.g == null ? zzie0 : this.g;
    }

    public final void e(Activity activity0, zzie zzie0, boolean z) {
        zzie zzie2;
        zzie zzie1 = this.b == null ? this.c : this.b;
        if(zzie0.zzb == null) {
            String s = activity0 == null ? null : this.c(activity0.getClass());
            zzie2 = new zzie(zzie0.zza, s, zzie0.zzc, zzie0.zze, zzie0.zzf);
        }
        else {
            zzie2 = zzie0;
        }
        this.c = this.b;
        this.b = zzie2;
        long v = this.zzt.zzav().elapsedRealtime();
        this.zzt.zzaz().zzp(() -> {
            long v3;
            this.zzg();
            boolean z1 = false;
            boolean z2 = zzie1 == null || zzie1.zzc != zzie2.zzc || !zzif.zza(zzie1.zzb, zzie2.zzb) || !zzif.zza(zzie1.zza, zzie2.zza);
            if(z && this.zza != null) {
                z1 = true;
            }
            if(z2) {
                Bundle bundle1 = null == null ? new Bundle() : new Bundle(null);
                zzlb.zzK(zzie2, bundle1, true);
                if(zzie1 != null) {
                    String s = zzie1.zza;
                    if(s != null) {
                        bundle1.putString("_pn", s);
                    }
                    String s1 = zzie1.zzb;
                    if(s1 != null) {
                        bundle1.putString("_pc", s1);
                    }
                    bundle1.putLong("_pi", zzie1.zzc);
                }
                if(z1) {
                    zzkc zzkc0 = this.zzt.zzu();
                    long v1 = v - zzkc0.zzb.b;
                    zzkc0.zzb.b = v;
                    if(v1 > 0L) {
                        this.zzt.zzv().e(bundle1, v1);
                    }
                }
                if(!this.zzt.zzf().zzu()) {
                    bundle1.putLong("_mst", 1L);
                }
                String s2 = zzie2.zze ? "app" : "auto";
                long v2 = this.zzt.zzav().currentTimeMillis();
                if(zzie2.zze) {
                    v3 = zzie2.zzf;
                    if(v3 == 0L) {
                        v3 = v2;
                    }
                }
                else {
                    v3 = v2;
                }
                this.zzt.zzq().b(s2, "_vs", bundle1, v3);
            }
            if(z1) {
                this.b(this.zza, true, v);
            }
            this.zza = zzie2;
            if(zzie2.zze) {
                this.h = zzie2;
            }
            this.zzt.zzt().zzG(zzie2);
        });
    }

    @Override  // com.google.android.gms.measurement.internal.p
    public final boolean zzf() {
        return false;
    }

    public final zzie zzi() {
        return this.b;
    }

    @WorkerThread
    public final zzie zzj(boolean z) {
        this.zza();
        this.zzg();
        if(!z) {
            return this.zza;
        }
        return this.zza == null ? this.h : this.zza;
    }

    @MainThread
    public final void zzr(Activity activity0, Bundle bundle0) {
        if(!this.zzt.zzf().zzu()) {
            return;
        }
        if(bundle0 == null) {
            return;
        }
        Bundle bundle1 = bundle0.getBundle("com.google.app_measurement.screen_service");
        if(bundle1 == null) {
            return;
        }
        zzie zzie0 = new zzie(bundle1.getString("name"), bundle1.getString("referrer_name"), bundle1.getLong("id"));
        this.d.put(activity0, zzie0);
    }

    @MainThread
    public final void zzs(Activity activity0) {
        synchronized(this.j) {
            if(activity0 == this.e) {
                this.e = null;
            }
        }
        if(!this.zzt.zzf().zzu()) {
            return;
        }
        this.d.remove(activity0);
    }

    @MainThread
    public final void zzt(Activity activity0) {
        synchronized(this.j) {
            this.i = false;
            this.f = true;
        }
        long v = this.zzt.zzav().elapsedRealtime();
        if(!this.zzt.zzf().zzu()) {
            this.b = null;
            this.zzt.zzaz().zzp(new u0(this, v, 0));
            return;
        }
        zzie zzie0 = this.d(activity0);
        this.c = this.b;
        this.b = null;
        this.zzt.zzaz().zzp(new a(this, zzie0, v, 2));
    }

    @MainThread
    public final void zzu(Activity activity0) {
        synchronized(this.j) {
            this.i = true;
            if(activity0 != this.e) {
                synchronized(this.j) {
                    this.e = activity0;
                    this.f = false;
                }
                if(this.zzt.zzf().zzu()) {
                    this.g = null;
                    this.zzt.zzaz().zzp(new t0(this, 1));
                }
            }
        }
        if(!this.zzt.zzf().zzu()) {
            this.b = this.g;
            this.zzt.zzaz().zzp(new t0(this, 0));
            return;
        }
        this.e(activity0, this.d(activity0), false);
        zzd zzd0 = this.zzt.zzd();
        long v1 = zzd0.zzt.zzav().elapsedRealtime();
        zzd0.zzt.zzaz().zzp(new u0(zzd0, v1, 1));
    }

    @MainThread
    public final void zzv(Activity activity0, Bundle bundle0) {
        if(!this.zzt.zzf().zzu()) {
            return;
        }
        if(bundle0 == null) {
            return;
        }
        zzie zzie0 = (zzie)this.d.get(activity0);
        if(zzie0 == null) {
            return;
        }
        Bundle bundle1 = new Bundle();
        bundle1.putLong("id", zzie0.zzc);
        bundle1.putString("name", zzie0.zza);
        bundle1.putString("referrer_name", zzie0.zzb);
        bundle0.putBundle("com.google.app_measurement.screen_service", bundle1);
    }

    @Deprecated
    public final void zzw(@NonNull Activity activity0, @Size(max = 36L, min = 1L) String s, @Size(max = 36L, min = 1L) String s1) {
        if(!this.zzt.zzf().zzu()) {
            this.zzt.zzay().zzl().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzie zzie0 = this.b;
        if(zzie0 == null) {
            this.zzt.zzay().zzl().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if(this.d.get(activity0) == null) {
            this.zzt.zzay().zzl().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if(s1 == null) {
            s1 = this.c(activity0.getClass());
        }
        if(zzif.zza(zzie0.zzb, s1) && zzif.zza(zzie0.zza, s)) {
            this.zzt.zzay().zzl().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if(s != null && (s.length() <= 0 || s.length() > 100)) {
            this.zzt.zzay().zzl().zzb("Invalid screen name length in setCurrentScreen. Length", s.length());
            return;
        }
        if(s1 != null && (s1.length() <= 0 || s1.length() > 100)) {
            this.zzt.zzay().zzl().zzb("Invalid class name length in setCurrentScreen. Length", s1.length());
            return;
        }
        this.zzt.zzay().zzj().zzc("Setting current screen to name, class", (s == null ? "null" : s), s1);
        zzie zzie1 = new zzie(s, s1, this.zzt.zzv().zzq());
        this.d.put(activity0, zzie1);
        this.e(activity0, zzie1, true);
    }

    public final void zzx(Bundle bundle0, long v) {
        String s;
        String s2;
        synchronized(this.j) {
            if(!this.i) {
                this.zzt.zzay().zzl().zza("Cannot log screen view event when the app is in the background.");
                return;
            }
            s = bundle0.getString("screen_name");
            if(s != null && (s.length() <= 0 || s.length() > 100)) {
                this.zzt.zzay().zzl().zzb("Invalid screen name length for screen view. Length", s.length());
                return;
            }
            String s1 = bundle0.getString("screen_class");
            if(s1 != null && (s1.length() <= 0 || s1.length() > 100)) {
                this.zzt.zzay().zzl().zzb("Invalid screen class length for screen view. Length", s1.length());
                return;
            }
            if(s1 == null) {
                s2 = this.e == null ? "Activity" : this.c(this.e.getClass());
            }
            else {
                s2 = s1;
            }
            zzie zzie0 = this.b;
            if(this.f && zzie0 != null) {
                this.f = false;
                if(zzif.zza(zzie0.zzb, s2) && zzif.zza(zzie0.zza, s)) {
                    this.zzt.zzay().zzl().zza("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
        }
        this.zzt.zzay().zzj().zzc("Logging screen view with name, class", (s == null ? "null" : s), (s2 == null ? "null" : s2));
        zzie zzie1 = this.b == null ? this.c : this.b;
        zzie zzie2 = new zzie(s, s2, this.zzt.zzv().zzq(), true, v);
        this.b = zzie2;
        this.c = zzie1;
        this.g = zzie2;
        long v2 = this.zzt.zzav().elapsedRealtime();
        this.zzt.zzaz().zzp(new r0(this, bundle0, zzie2, zzie1, v2, 0));
    }
}


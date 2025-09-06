package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import androidx.room.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class zzag extends a0 {
    public Boolean a;
    public zzaf b;
    public Boolean c;

    public final String a(String s) {
        try {
            String s1 = (String)Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, s, "");
            Preconditions.checkNotNull(s1);
            return s1;
        }
        catch(ClassNotFoundException classNotFoundException0) {
            this.zzt.zzay().zzd().zzb("Could not find SystemProperties class", classNotFoundException0);
            return "";
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            this.zzt.zzay().zzd().zzb("Could not find SystemProperties.get() method", noSuchMethodException0);
            return "";
        }
        catch(IllegalAccessException illegalAccessException0) {
            this.zzt.zzay().zzd().zzb("Could not access SystemProperties.get()", illegalAccessException0);
            return "";
        }
        catch(InvocationTargetException invocationTargetException0) {
            this.zzt.zzay().zzd().zzb("SystemProperties.get() threw an exception", invocationTargetException0);
            return "";
        }
    }

    public final Bundle b() {
        try {
            if(this.zzt.zzau().getPackageManager() == null) {
                this.zzt.zzay().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo0 = Wrappers.packageManager(this.zzt.zzau()).getApplicationInfo("net.daum.android.tistoryapp", 0x80);
            if(applicationInfo0 == null) {
                this.zzt.zzay().zzd().zza("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo0.metaData;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
        }
        this.zzt.zzay().zzd().zzb("Failed to load metadata: Package name not found", packageManager$NameNotFoundException0);
        return null;
    }

    public final Boolean c(String s) {
        Preconditions.checkNotEmpty(s);
        Bundle bundle0 = this.b();
        if(bundle0 == null) {
            a.v(this.zzt, "Failed to load metadata: Metadata bundle is null");
            return null;
        }
        return bundle0.containsKey(s) ? Boolean.valueOf(bundle0.getBoolean(s)) : null;
    }

    public final boolean d() {
        if(this.a == null) {
            Boolean boolean0 = this.c("app_measurement_lite");
            this.a = boolean0;
            if(boolean0 == null) {
                this.a = Boolean.FALSE;
            }
        }
        return this.a.booleanValue() || !this.zzt.zzN();
    }

    public static final long zzA() {
        return (long)(((Long)zzdu.zzC.zza(null)));
    }

    @WorkerThread
    public final double zza(String s, zzdt zzdt0) {
        if(s == null) {
            return (double)(((Double)zzdt0.zza(null)));
        }
        String s1 = this.b.zza(s, zzdt0.zzb());
        if(TextUtils.isEmpty(s1)) {
            return (double)(((Double)zzdt0.zza(null)));
        }
        try {
            return (double)(((Double)zzdt0.zza(Double.parseDouble(s1))));
        }
        catch(NumberFormatException unused_ex) {
            return (double)(((Double)zzdt0.zza(null)));
        }
    }

    public final int zzc() {
        zzlb zzlb0 = this.zzt.zzv();
        Boolean boolean0 = zzlb0.zzt.zzt().d;
        return zzlb0.zzm() >= 201500 || boolean0 != null && !boolean0.booleanValue() ? 100 : 25;
    }

    public final int zzd(@Size(min = 1L) String s) {
        return this.zzf(s, zzdu.zzH, 25, 100);
    }

    @WorkerThread
    public final int zze(String s, zzdt zzdt0) {
        if(s == null) {
            return (int)(((Integer)zzdt0.zza(null)));
        }
        String s1 = this.b.zza(s, zzdt0.zzb());
        if(TextUtils.isEmpty(s1)) {
            return (int)(((Integer)zzdt0.zza(null)));
        }
        try {
            return (int)(((Integer)zzdt0.zza(Integer.parseInt(s1))));
        }
        catch(NumberFormatException unused_ex) {
            return (int)(((Integer)zzdt0.zza(null)));
        }
    }

    @WorkerThread
    public final int zzf(String s, zzdt zzdt0, int v, int v1) {
        return Math.max(Math.min(this.zze(s, zzdt0), v1), v);
    }

    public final long zzh() {
        return 74029L;
    }

    @WorkerThread
    public final long zzi(String s, zzdt zzdt0) {
        if(s == null) {
            return (long)(((Long)zzdt0.zza(null)));
        }
        String s1 = this.b.zza(s, zzdt0.zzb());
        if(TextUtils.isEmpty(s1)) {
            return (long)(((Long)zzdt0.zza(null)));
        }
        try {
            return (long)(((Long)zzdt0.zza(Long.parseLong(s1))));
        }
        catch(NumberFormatException unused_ex) {
            return (long)(((Long)zzdt0.zza(null)));
        }
    }

    public final String zzl() {
        return this.a("debug.firebase.analytics.app");
    }

    public final String zzm() {
        return this.a("debug.deferred.deeplink");
    }

    @WorkerThread
    public final String zzo(String s, zzdt zzdt0) {
        return s == null ? ((String)zzdt0.zza(null)) : ((String)zzdt0.zza(this.b.zza(s, zzdt0.zzb())));
    }

    public final boolean zzr() {
        Boolean boolean0 = this.c("google_analytics_adid_collection_enabled");
        return boolean0 == null || boolean0.booleanValue();
    }

    @WorkerThread
    public final boolean zzs(String s, zzdt zzdt0) {
        if(s == null) {
            return ((Boolean)zzdt0.zza(null)).booleanValue();
        }
        String s1 = this.b.zza(s, zzdt0.zzb());
        return TextUtils.isEmpty(s1) ? ((Boolean)zzdt0.zza(null)).booleanValue() : ((Boolean)zzdt0.zza(Boolean.valueOf("1".equals(s1)))).booleanValue();
    }

    public final boolean zzt(String s) {
        return "1".equals(this.b.zza(s, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean boolean0 = this.c("google_analytics_automatic_screen_reporting_enabled");
        return boolean0 == null || boolean0.booleanValue();
    }

    public final boolean zzv() {
        Boolean boolean0 = this.c("firebase_analytics_collection_deactivated");
        return boolean0 != null && boolean0.booleanValue();
    }

    public final boolean zzw(String s) {
        return "1".equals(this.b.zza(s, "measurement.event_sampling_enabled"));
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if(this.c == null) {
            synchronized(this) {
                if(this.c == null) {
                    boolean z = false;
                    ApplicationInfo applicationInfo0 = this.zzt.zzau().getApplicationInfo();
                    String s = ProcessUtils.getMyProcessName();
                    if(applicationInfo0 != null) {
                        if(applicationInfo0.processName != null && applicationInfo0.processName.equals(s)) {
                            z = true;
                        }
                        this.c = Boolean.valueOf(z);
                    }
                    if(this.c == null) {
                        this.c = Boolean.TRUE;
                        this.zzt.zzay().zzd().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.c.booleanValue();
    }

    public static final long zzz() {
        return (long)(((Long)zzdu.zzc.zza(null)));
    }
}


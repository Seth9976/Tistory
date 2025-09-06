package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.room.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class zzdy extends p {
    public String b;
    public String c;
    public int d;
    public String e;
    public long f;
    public final long g;
    public List h;
    public String i;
    public int j;
    public String k;
    public String l;
    public String m;
    public long n;
    public String o;

    public zzdy(zzfr zzfr0, long v) {
        super(zzfr0);
        this.n = 0L;
        this.o = null;
        this.g = v;
    }

    public final void a() {
        String s;
        this.zzg();
        if(this.zzt.zzm().b().zzi(zzah.zzb)) {
            byte[] arr_b = new byte[16];
            this.zzt.zzv().d().nextBytes(arr_b);
            s = String.format(Locale.US, "%032x", new BigInteger(1, arr_b));
        }
        else {
            this.zzt.zzay().zzc().zza("Analytics Storage consent is not granted");
            s = null;
        }
        this.zzt.zzay().zzc().zza("Resetting session stitching token to " + (s == null ? "null" : "not null"));
        this.m = s;
        this.n = this.zzt.zzav().currentTimeMillis();
    }

    @Override  // com.google.android.gms.measurement.internal.p
    @WorkerThread
    @EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    public final void zzd() {
        Integer integer0;
        PackageManager packageManager0 = this.zzt.zzau().getPackageManager();
        int v = 0x80000000;
        String s = "";
        String s1 = "unknown";
        String s2 = "Unknown";
        if(packageManager0 == null) {
            this.zzt.zzay().zzd().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzeh.zzn("net.daum.android.tistoryapp"));
        }
        else {
            try {
                s1 = packageManager0.getInstallerPackageName("net.daum.android.tistoryapp");
            }
            catch(IllegalArgumentException unused_ex) {
                this.zzt.zzay().zzd().zzb("Error retrieving app installer package name. appId", zzeh.zzn("net.daum.android.tistoryapp"));
            }
            if(s1 == null) {
                s1 = "manual_install";
            }
            else if("com.android.vending".equals(s1)) {
                s1 = "";
            }
            try {
                PackageInfo packageInfo0 = packageManager0.getPackageInfo("net.daum.android.tistoryapp", 0);
                if(packageInfo0 != null) {
                    CharSequence charSequence0 = packageManager0.getApplicationLabel(packageInfo0.applicationInfo);
                    if(!TextUtils.isEmpty(charSequence0)) {
                        charSequence0.toString();
                    }
                    s2 = packageInfo0.versionName;
                    v = packageInfo0.versionCode;
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                this.zzt.zzay().zzd().zzc("Error retrieving package info. appId, appName", zzeh.zzn("net.daum.android.tistoryapp"), "Unknown");
            }
        }
        this.b = "net.daum.android.tistoryapp";
        this.e = s1;
        this.c = s2;
        this.d = v;
        this.f = 0L;
        boolean z = !TextUtils.isEmpty(this.zzt.zzw()) && "am".equals(this.zzt.zzx());
        int v1 = this.zzt.zza();
        switch(v1) {
            case 0: {
                a.B(this.zzt, "App measurement collection enabled");
                break;
            }
            case 1: {
                this.zzt.zzay().zzi().zza("App measurement deactivated via the manifest");
                break;
            }
            case 2: {
                a.B(this.zzt, "App measurement deactivated via the init parameters");
                break;
            }
            case 3: {
                this.zzt.zzay().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            }
            case 4: {
                this.zzt.zzay().zzi().zza("App measurement disabled via the manifest");
                break;
            }
            case 5: {
                a.B(this.zzt, "App measurement disabled via the init parameters");
                break;
            }
            case 6: {
                this.zzt.zzay().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            }
            case 7: {
                this.zzt.zzay().zzi().zza("App measurement disabled via the global data collection setting");
                break;
            }
            default: {
                this.zzt.zzay().zzi().zza("App measurement disabled due to denied storage consent");
            }
        }
        this.k = "";
        this.l = "";
        if(z) {
            this.l = this.zzt.zzw();
        }
        try {
            String s3 = zzid.zzc(this.zzt.zzau(), "google_app_id", this.zzt.zzz());
            if(!TextUtils.isEmpty(s3)) {
                s = s3;
            }
            this.k = s;
            if(!TextUtils.isEmpty(s3)) {
                Context context0 = this.zzt.zzau();
                String s4 = this.zzt.zzz();
                Preconditions.checkNotNull(context0);
                Resources resources0 = context0.getResources();
                if(TextUtils.isEmpty(s4)) {
                    s4 = zzfj.zza(context0);
                }
                this.l = zzfj.zzb("admob_app_id", resources0, s4);
            }
            if(v1 == 0) {
                this.zzt.zzay().zzj().zzc("App measurement enabled for app package, google app id", this.b, (TextUtils.isEmpty(this.k) ? this.l : this.k));
            }
        }
        catch(IllegalStateException illegalStateException0) {
            this.zzt.zzay().zzd().zzc("Fetching Google App Id failed with exception. appId", zzeh.zzn("net.daum.android.tistoryapp"), illegalStateException0);
        }
        List list0 = null;
        this.h = null;
        zzag zzag0 = this.zzt.zzf();
        zzag0.getClass();
        new String("analytics.safelisted_events");
        Bundle bundle0 = zzag0.b();
        if(bundle0 == null) {
            a.v(zzag0.zzt, "Failed to load metadata: Metadata bundle is null");
            integer0 = null;
        }
        else {
            integer0 = bundle0.containsKey("analytics.safelisted_events") ? bundle0.getInt("analytics.safelisted_events") : null;
        }
        if(integer0 != null) {
            try {
                String[] arr_s = zzag0.zzt.zzau().getResources().getStringArray(((int)integer0));
                if(arr_s != null) {
                    list0 = Arrays.asList(arr_s);
                }
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                zzag0.zzt.zzay().zzd().zzb("Failed to load string array from metadata: resource not found", resources$NotFoundException0);
            }
        }
        if(list0 == null) {
            this.h = null;
        }
        else if(list0.isEmpty()) {
            this.zzt.zzay().zzl().zza("Safelisted event list is empty. Ignoring");
        }
        else {
            for(Object object0: list0) {
                if(this.zzt.zzv().q("safelisted event", ((String)object0))) {
                    continue;
                }
                goto label_101;
            }
            this.h = list0;
        }
    label_101:
        if(packageManager0 != null) {
            this.j = InstantApps.isInstantApp(this.zzt.zzau());
            return;
        }
        this.j = 0;
    }

    @Override  // com.google.android.gms.measurement.internal.p
    public final boolean zzf() {
        return true;
    }

    public final String zzl() {
        this.zza();
        Preconditions.checkNotNull(this.b);
        return this.b;
    }

    public final String zzm() {
        this.zzg();
        this.zza();
        Preconditions.checkNotNull(this.k);
        return this.k;
    }
}


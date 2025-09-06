package com.google.android.gms.measurement.internal;

import a5.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import androidx.room.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.internal.measurement.zzpj;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting
public final class zzjm extends p {
    public final zzjl b;
    public zzdx c;
    public volatile Boolean d;
    public final z0 e;
    public final k1 f;
    public final ArrayList g;
    public final z0 h;

    public zzjm(zzfr zzfr0) {
        super(zzfr0);
        this.g = new ArrayList();
        this.f = new k1(zzfr0.zzav());
        this.b = new zzjl(this);
        this.e = new z0(this, zzfr0, 0);
        this.h = new z0(this, zzfr0, 1);
    }

    public final void a(zzdx zzdx0, AbstractSafeParcelable abstractSafeParcelable0, zzq zzq0) {
        int v2;
        this.zzg();
        this.zza();
        int v1 = 0;
        for(int v = 100; v1 < 1001 && v == 100; v = v2) {
            ArrayList arrayList0 = new ArrayList();
            List list0 = this.zzt.zzi().zzi(100);
            if(list0 == null) {
                v2 = 0;
            }
            else {
                arrayList0.addAll(list0);
                v2 = list0.size();
            }
            if(abstractSafeParcelable0 != null && v2 < 100) {
                arrayList0.add(abstractSafeParcelable0);
            }
            int v3 = arrayList0.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                AbstractSafeParcelable abstractSafeParcelable1 = (AbstractSafeParcelable)arrayList0.get(v4);
                if(abstractSafeParcelable1 instanceof zzaw) {
                    try {
                        zzdx0.zzk(((zzaw)abstractSafeParcelable1), zzq0);
                    }
                    catch(RemoteException remoteException0) {
                        this.zzt.zzay().zzd().zzb("Failed to send event to the service", remoteException0);
                    }
                }
                else if(abstractSafeParcelable1 instanceof zzkw) {
                    try {
                        zzdx0.zzt(((zzkw)abstractSafeParcelable1), zzq0);
                    }
                    catch(RemoteException remoteException1) {
                        this.zzt.zzay().zzd().zzb("Failed to send user property to the service", remoteException1);
                    }
                }
                else if(abstractSafeParcelable1 instanceof zzac) {
                    try {
                        zzdx0.zzn(((zzac)abstractSafeParcelable1), zzq0);
                    }
                    catch(RemoteException remoteException2) {
                        this.zzt.zzay().zzd().zzb("Failed to send conditional user property to the service", remoteException2);
                    }
                }
                else {
                    a.v(this.zzt, "Discarding data. Unrecognized parcel type.");
                }
            }
            ++v1;
        }
    }

    public final boolean b() {
        this.zzg();
        this.zza();
        return !this.c() || this.zzt.zzv().zzm() >= ((int)(((Integer)zzdu.zzaf.zza(null))));
    }

    public final boolean c() {
        this.zzg();
        this.zza();
        if(this.d == null) {
            this.zzg();
            this.zza();
            o o0 = this.zzt.zzm();
            o0.zzg();
            boolean z = false;
            Boolean boolean0 = o0.a().contains("use_service") ? Boolean.valueOf(o0.a().getBoolean("use_service", false)) : null;
            boolean z1 = true;
            if(boolean0 == null || !boolean0.booleanValue()) {
                zzdy zzdy0 = this.zzt.zzh();
                zzdy0.zza();
                if(zzdy0.j == 1) {
                    z = true;
                }
                else {
                    a.B(this.zzt, "Checking service availability");
                    int v = this.zzt.zzv().zzo(12451000);
                    switch(v) {
                        case 0: {
                            a.B(this.zzt, "Service available");
                            z = true;
                            break;
                        }
                        case 1: {
                            a.B(this.zzt, "Service missing");
                            break;
                        }
                        case 2: {
                            this.zzt.zzay().zzc().zza("Service container out of date");
                            if(this.zzt.zzv().zzm() >= 0x4423) {
                                if(boolean0 != null) {
                                    z1 = false;
                                }
                                z = z1;
                                z1 = false;
                            }
                            break;
                        }
                        case 3: {
                            a.A(this.zzt, "Service disabled");
                            z1 = false;
                            break;
                        }
                        case 9: {
                            a.A(this.zzt, "Service invalid");
                            z1 = false;
                            break;
                        }
                        case 18: {
                            a.A(this.zzt, "Service updating");
                            z = true;
                            break;
                        }
                        default: {
                            this.zzt.zzay().zzk().zzb("Unexpected service status", v);
                            z1 = false;
                        }
                    }
                }
                if(!z && this.zzt.zzf().d()) {
                    a.v(this.zzt, "No way to upload. Consider using the full version of Analytics");
                }
                else if(z1) {
                    o o1 = this.zzt.zzm();
                    o1.zzg();
                    SharedPreferences.Editor sharedPreferences$Editor0 = o1.a().edit();
                    sharedPreferences$Editor0.putBoolean("use_service", z);
                    sharedPreferences$Editor0.apply();
                }
                z1 = z;
            }
            this.d = Boolean.valueOf(z1);
        }
        return this.d.booleanValue();
    }

    public final zzq d(boolean z) {
        int v7;
        List list1;
        String s8;
        String s5;
        Object object0;
        Class class0;
        String s;
        zzdy zzdy0 = this.zzt.zzh();
        if(z) {
            zzeh zzeh0 = this.zzt.zzay();
            if(zzeh0.zzt.zzm().c == null) {
                s = null;
            }
            else {
                Pair pair0 = zzeh0.zzt.zzm().c.zza();
                s = pair0 == null || pair0 == o.w ? null : b.m(String.valueOf(pair0.second), ":", ((String)pair0.first));
            }
        }
        else {
            s = null;
        }
        zzdy0.zzg();
        String s1 = zzdy0.zzl();
        String s2 = zzdy0.zzm();
        zzdy0.zza();
        String s3 = zzdy0.c;
        zzdy0.zza();
        long v = (long)zzdy0.d;
        zzdy0.zza();
        Preconditions.checkNotNull(zzdy0.e);
        String s4 = zzdy0.e;
        zzdy0.zzt.zzf().zzh();
        zzdy0.zza();
        zzdy0.zzg();
        long v1 = zzdy0.f;
        if(Long.compare(v1, 0L) == 0) {
            zzlb zzlb0 = zzdy0.zzt.zzv();
            Context context0 = zzdy0.zzt.zzau();
            zzlb0.zzg();
            Preconditions.checkNotNull(context0);
            new String("net.daum.android.tistoryapp");
            PackageManager packageManager0 = context0.getPackageManager();
            MessageDigest messageDigest0 = zzlb.c();
            long v2 = -1L;
            if(messageDigest0 == null) {
                a.v(zzlb0.zzt, "Could not get MD5 instance");
                v1 = -1L;
            }
            else if(packageManager0 == null) {
                v1 = 0L;
            }
            else {
                try {
                    if(zzlb0.u(context0, "net.daum.android.tistoryapp")) {
                        v2 = 0L;
                    }
                    else {
                        Signature[] arr_signature = Wrappers.packageManager(context0).getPackageInfo("net.daum.android.tistoryapp", 0x40).signatures;
                        if(arr_signature == null || arr_signature.length <= 0) {
                            zzlb0.zzt.zzay().zzk().zza("Could not get signatures");
                        }
                        else {
                            v2 = zzlb.I(messageDigest0.digest(arr_signature[0].toByteArray()));
                        }
                    }
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    zzlb0.zzt.zzay().zzd().zzb("Package name not found", packageManager$NameNotFoundException0);
                    v1 = 0L;
                    goto label_57;
                }
                v1 = v2;
            }
        label_57:
            zzdy0.f = v1;
        }
        boolean z1 = zzdy0.zzt.zzJ();
        int v3 = !zzdy0.zzt.zzm().o;
        zzdy0.zzg();
        if(zzdy0.zzt.zzJ()) {
            zzpj.zzc();
            if(zzdy0.zzt.zzf().zzs(null, zzdu.zzaa)) {
                a.B(zzdy0.zzt, "Disabled IID for tests.");
                goto label_76;
            }
            else {
                try {
                    class0 = zzdy0.zzt.zzau().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if(class0 == null) {
                        goto label_76;
                    }
                    else {
                        goto label_68;
                    }
                    goto label_77;
                }
                catch(ClassNotFoundException unused_ex) {
                    goto label_76;
                }
                try {
                label_68:
                    object0 = class0.getDeclaredMethod("getInstance", Context.class).invoke(null, zzdy0.zzt.zzau());
                }
                catch(Exception unused_ex) {
                    zzdy0.zzt.zzay().zzm().zza("Failed to obtain Firebase Analytics instance");
                    goto label_76;
                }
                if(object0 == null) {
                    goto label_76;
                }
                else {
                    try {
                        s5 = (String)class0.getDeclaredMethod("getFirebaseInstanceId", null).invoke(object0, null);
                    }
                    catch(Exception unused_ex) {
                        zzdy0.zzt.zzay().zzl().zza("Failed to retrieve Firebase Instance Id");
                        goto label_76;
                    }
                }
            }
        }
        else {
        label_76:
            s5 = null;
        }
    label_77:
        long v4 = zzdy0.zzt.zzm().d.zza();
        long v5 = Long.compare(v4, 0L) == 0 ? zzdy0.zzt.E : Math.min(zzdy0.zzt.E, v4);
        zzdy0.zza();
        int v6 = zzdy0.j;
        boolean z2 = zzdy0.zzt.zzf().zzr();
        o o0 = zzdy0.zzt.zzm();
        o0.zzg();
        boolean z3 = o0.a().getBoolean("deferred_analytics_collection", false);
        zzdy0.zza();
        String s6 = zzdy0.l;
        Boolean boolean0 = zzdy0.zzt.zzf().c("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolean1 = boolean0 == null ? null : Boolean.valueOf(!boolean0.booleanValue());
        List list0 = zzdy0.h;
        String s7 = zzdy0.zzt.zzm().b().zzh();
        if(zzdy0.i == null) {
            s8 = s6;
            if(zzdy0.zzt.zzf().zzs(null, zzdu.zzap)) {
                zzlb zzlb1 = zzdy0.zzt.zzv();
                byte[] arr_b = new byte[16];
                zzlb1.d().nextBytes(arr_b);
                list1 = list0;
                zzdy0.i = String.format(Locale.US, "%032x", new BigInteger(1, arr_b));
            }
            else {
                list1 = list0;
                zzdy0.i = "";
            }
        }
        else {
            s8 = s6;
            list1 = list0;
        }
        String s9 = zzdy0.i;
        zzpd.zzc();
        if(zzdy0.zzt.zzf().zzs(null, zzdu.zzam)) {
            zzdy0.zzg();
            if(zzdy0.n == 0L) {
                v7 = v6;
            }
            else {
                v7 = v6;
                long v8 = zzdy0.zzt.zzav().currentTimeMillis() - zzdy0.n;
                if(zzdy0.m != null && v8 > 86400000L && zzdy0.o == null) {
                    zzdy0.a();
                }
            }
            if(zzdy0.m == null) {
                zzdy0.a();
            }
            return new zzq(s1, s2, s3, v, s4, 74029L, v1, s, z1, ((boolean)v3), s5, v5, v7, z2, z3, s8, boolean1, zzdy0.g, list1, s7, s9, zzdy0.m);
        }
        return new zzq(s1, s2, s3, v, s4, 74029L, v1, s, z1, ((boolean)v3), s5, v5, v6, z2, z3, s8, boolean1, zzdy0.g, list1, s7, s9, null);
    }

    public final void e() {
        this.zzg();
        zzef zzef0 = this.zzt.zzay().zzj();
        ArrayList arrayList0 = this.g;
        zzef0.zzb("Processing queued up service tasks", arrayList0.size());
        for(Object object0: arrayList0) {
            Runnable runnable0 = (Runnable)object0;
            try {
                runnable0.run();
            }
            catch(RuntimeException runtimeException0) {
                this.zzt.zzay().zzd().zzb("Task exception while flushing queue", runtimeException0);
            }
        }
        arrayList0.clear();
        this.h.a();
    }

    public final void f() {
        this.zzg();
        this.f.b = this.f.a.elapsedRealtime();
        long v = (long)(((Long)zzdu.zzI.zza(null)));
        this.e.c(v);
    }

    public final void g(Runnable runnable0) {
        this.zzg();
        if(this.zzL()) {
            runnable0.run();
            return;
        }
        ArrayList arrayList0 = this.g;
        if(((long)arrayList0.size()) >= 1000L) {
            a.v(this.zzt, "Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList0.add(runnable0);
        this.h.c(60000L);
        this.j();
    }

    public final Boolean h() {
        return this.d;
    }

    public static void i(zzjm zzjm0, ComponentName componentName0) {
        zzjm0.zzg();
        if(zzjm0.c != null) {
            zzjm0.c = null;
            zzjm0.zzt.zzay().zzj().zzb("Disconnected from device MeasurementService", componentName0);
            zzjm0.zzg();
            zzjm0.j();
        }
    }

    public final void j() {
        this.zzg();
        this.zza();
        if(this.zzL()) {
            return;
        }
        boolean z = this.c();
        zzjl zzjl0 = this.b;
        if(!z) {
            if(!this.zzt.zzf().d()) {
                List list0 = this.zzt.zzau().getPackageManager().queryIntentServices(new Intent().setClassName(this.zzt.zzau(), "com.google.android.gms.measurement.AppMeasurementService"), 0x10000);
                if(list0 != null && !list0.isEmpty()) {
                    Intent intent0 = new Intent("com.google.android.gms.measurement.START");
                    intent0.setComponent(new ComponentName(this.zzt.zzau(), "com.google.android.gms.measurement.AppMeasurementService"));
                    zzjl0.zzb(intent0);
                    return;
                }
                a.v(this.zzt, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
            return;
        }
        zzjl0.zzc();
    }

    @WorkerThread
    public final void zzA(zzaw zzaw0, String s) {
        Preconditions.checkNotNull(zzaw0);
        this.zzg();
        this.zza();
        boolean z = this.zzt.zzi().zzo(zzaw0);
        this.g(new w0(this, this.d(true), z, zzaw0, 2));
    }

    @WorkerThread
    public final void zzB(zzcf zzcf0, zzaw zzaw0, String s) {
        this.zzg();
        this.zza();
        if(this.zzt.zzv().zzo(12451000) != 0) {
            a.A(this.zzt, "Not bundling data. Service unavailable or out of date");
            this.zzt.zzv().zzS(zzcf0, new byte[0]);
            return;
        }
        this.g(new h0(1, s, this, zzaw0, zzcf0));
    }

    @WorkerThread
    public final void zzC() {
        this.zzg();
        this.zza();
        zzq zzq0 = this.d(false);
        this.zzt.zzi().zzj();
        this.g(new x0(this, zzq0, 0));
    }

    @WorkerThread
    public final void zzE(zzac zzac0) {
        Preconditions.checkNotNull(zzac0);
        this.zzg();
        this.zza();
        boolean z = this.zzt.zzi().zzn(zzac0);
        zzac zzac1 = new zzac(zzac0);
        this.g(new w0(this, this.d(true), z, zzac1, 3));
    }

    @WorkerThread
    public final void zzF(boolean z) {
        this.zzg();
        this.zza();
        if(z) {
            this.zzt.zzi().zzj();
        }
        if(this.b()) {
            this.g(new x0(this, this.d(false), 3));
        }
    }

    @WorkerThread
    public final void zzG(zzie zzie0) {
        this.zzg();
        this.zza();
        this.g(new f(3, this, zzie0));
    }

    @WorkerThread
    public final void zzH(Bundle bundle0) {
        this.zzg();
        this.zza();
        this.g(new y0(this, this.d(false), bundle0, 2));
    }

    @WorkerThread
    public final void zzI() {
        this.zzg();
        this.zza();
        this.g(new x0(this, this.d(true), 2));
    }

    @WorkerThread
    @VisibleForTesting
    public final void zzJ(zzdx zzdx0) {
        this.zzg();
        Preconditions.checkNotNull(zzdx0);
        this.c = zzdx0;
        this.f();
        this.e();
    }

    @WorkerThread
    public final void zzK(zzkw zzkw0) {
        this.zzg();
        this.zza();
        boolean z = this.zzt.zzi().zzp(zzkw0);
        this.g(new w0(this, this.d(true), z, zzkw0, 0));
    }

    @WorkerThread
    public final boolean zzL() {
        this.zzg();
        this.zza();
        return this.c != null;
    }

    @Override  // com.google.android.gms.measurement.internal.p
    public final boolean zzf() {
        return false;
    }

    @WorkerThread
    public final void zzq() {
        this.zzg();
        this.zza();
        zzq zzq0 = this.d(true);
        this.zzt.zzi().zzk();
        this.g(new x0(this, zzq0, 1));
    }

    @WorkerThread
    public final void zzs() {
        this.zzg();
        this.zza();
        this.b.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzt.zzau(), this.b);
        }
        catch(IllegalStateException | IllegalArgumentException unused_ex) {
        }
        this.c = null;
    }

    @WorkerThread
    public final void zzt(zzcf zzcf0) {
        this.zzg();
        this.zza();
        this.g(new y0(this, this.d(false), zzcf0, 1));
    }

    @WorkerThread
    public final void zzu(AtomicReference atomicReference0) {
        this.zzg();
        this.zza();
        this.g(new y0(this, atomicReference0, 0, this.d(false)));
    }

    @WorkerThread
    public final void zzv(zzcf zzcf0, String s, String s1) {
        this.zzg();
        this.zza();
        this.g(new a1(this, s, s1, this.d(false), zzcf0));
    }

    @WorkerThread
    public final void zzw(AtomicReference atomicReference0, String s, String s1, String s2) {
        this.zzg();
        this.zza();
        this.g(new a1(this, atomicReference0, s1, s2, this.d(false)));
    }

    @WorkerThread
    public final void zzx(AtomicReference atomicReference0, boolean z) {
        this.zzg();
        this.zza();
        this.g(new w0(this, atomicReference0, this.d(false), z));
    }

    @WorkerThread
    public final void zzy(zzcf zzcf0, String s, String s1, boolean z) {
        this.zzg();
        this.zza();
        this.g(new v0(this, s, s1, this.d(false), z, zzcf0));
    }

    @WorkerThread
    public final void zzz(AtomicReference atomicReference0, String s, String s1, String s2, boolean z) {
        this.zzg();
        this.zza();
        this.g(new v0(this, atomicReference0, s1, s2, this.d(false), z));
    }
}


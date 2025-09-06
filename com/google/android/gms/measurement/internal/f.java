package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.room.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzpa;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class f implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public f(int v, Object object0, Object object1) {
        this.a = v;
        this.c = object0;
        this.b = object1;
        super();
    }

    public f(zzey zzey0, zzbr zzbr0, zzey zzey1) {
        this.a = 4;
        super();
        this.c = zzey0;
        this.b = zzbr0;
    }

    public f(zzkt zzkt0, Runnable runnable0) {
        this.a = 8;
        super();
        this.b = zzkt0;
        this.c = runnable0;
    }

    @Override
    public final void run() {
        Long long0;
        switch(this.a) {
            case 0: {
                ((zzgm)this.b).zzaw();
                if(zzab.zza()) {
                    ((zzgm)this.b).zzaz().zzp(this);
                    return;
                }
                boolean z = ((g)this.c).c != 0L;
                ((g)this.c).c = 0L;
                if(z) {
                    ((g)this.c).b();
                }
                return;
            }
            case 1: {
                zzfr zzfr0 = (zzfr)this.c;
                zzfr0.zzaz().zzg();
                zzaq zzaq0 = new zzaq(zzfr0);  // 初始化器: Lcom/google/android/gms/measurement/internal/b0;-><init>(Lcom/google/android/gms/measurement/internal/zzfr;)V
                zzaq0.zzv();
                zzfr0.v = zzaq0;
                zzgu zzgu0 = (zzgu)this.b;
                zzdy zzdy0 = new zzdy(zzfr0, zzgu0.f);
                zzdy0.zzb();
                zzfr0.w = zzdy0;
                zzea zzea0 = new zzea(zzfr0);
                zzea0.zzb();
                zzfr0.t = zzea0;
                zzjm zzjm0 = new zzjm(zzfr0);
                zzjm0.zzb();
                zzfr0.u = zzjm0;
                zzfr0.l.zzw();
                zzfr0.h.zzw();
                zzfr0.w.zzc();
                zzfr0.zzay().zzi().zzb("App measurement initialized, version", 74029L);
                zzfr0.zzay().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                String s = zzdy0.zzl();
                if(TextUtils.isEmpty(zzfr0.b)) {
                    zzlb zzlb0 = zzfr0.zzv();
                    zzlb0.getClass();
                    if((TextUtils.isEmpty(s) ? false : zzlb0.zzt.zzf().zzl().equals(s))) {
                        zzfr0.zzay().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    }
                    else {
                        zzfr0.zzay().zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + s);
                    }
                }
                zzfr0.zzay().zzc().zza("Debug-level message logging enabled");
                AtomicInteger atomicInteger0 = zzfr0.D;
                if(zzfr0.C != atomicInteger0.get()) {
                    zzfr0.zzay().zzd().zzc("Not all components initialized", zzfr0.C, atomicInteger0.get());
                }
                zzfr0.x = true;
                zzfr0.zzH(zzgu0.g);
                return;
            }
            case 2: {
                zzhx zzhx0 = (zzhx)this.c;
                zzkc zzkc0 = zzhx0.zzt.zzu();
                zzpa.zzc();
                if(!zzkc0.zzt.zzf().zzs(null, zzdu.zzau)) {
                    zzkc0.zzt.zzay().zzl().zza("getSessionId has been disabled.");
                    long0 = null;
                }
                else if(!zzkc0.zzt.zzm().b().zzi(zzah.zzb)) {
                    zzkc0.zzt.zzay().zzl().zza("Analytics storage consent denied; will not get session id");
                    long0 = null;
                }
                else if(zzkc0.zzt.zzm().d(zzkc0.zzt.zzav().currentTimeMillis()) || zzkc0.zzt.zzm().n.zza() == 0L) {
                    long0 = null;
                }
                else {
                    long0 = zzkc0.zzt.zzm().n.zza();
                }
                zzcf zzcf0 = (zzcf)this.b;
                if(long0 != null) {
                    zzhx0.zzt.zzv().zzU(zzcf0, ((long)long0));
                    return;
                }
                try {
                    zzcf0.zze(null);
                }
                catch(RemoteException remoteException0) {
                    zzhx0.zzt.zzay().zzd().zzb("getSessionId failed with exception", remoteException0);
                }
                return;
            }
            case 3: {
                zzjm zzjm1 = (zzjm)this.c;
                zzdx zzdx0 = zzjm1.c;
                if(zzdx0 == null) {
                    a.v(zzjm1.zzt, "Failed to send current screen to service");
                    return;
                }
                try {
                    zzie zzie0 = (zzie)this.b;
                    if(zzie0 == null) {
                        zzdx0.zzq(0L, null, null, "net.daum.android.tistoryapp");
                    }
                    else {
                        zzdx0.zzq(zzie0.zzc, zzie0.zza, zzie0.zzb, "net.daum.android.tistoryapp");
                    }
                    zzjm1.f();
                    return;
                }
                catch(RemoteException remoteException1) {
                }
                zzjm1.zzt.zzay().zzd().zzb("Failed to send current screen to the service", remoteException1);
                return;
            }
            case 4: {
                zzbr zzbr0 = (zzbr)this.b;
                zzfr zzfr1 = ((zzey)this.c).b.a;
                zzfr1.zzaz().zzg();
                Bundle bundle0 = new Bundle();
                bundle0.putString("package_name", ((zzey)this.c).a);
                try {
                    if(zzbr0.zzd(bundle0) == null) {
                        zzfr1.zzay().zzd().zza("Install Referrer Service returned a null response");
                    }
                }
                catch(Exception exception0) {
                    zzfr1.zzay().zzd().zzb("Exception occurred while retrieving the Install Referrer", exception0.getMessage());
                }
                zzfr1.zzaz().zzg();
                throw new IllegalStateException("Unexpected call on client side");
            }
            case 5: {
                zzgj zzgj0 = (zzgj)this.c;
                zzgj0.a.a();
                zzac zzac0 = (zzac)this.b;
                if(zzac0.zzc.zza() == null) {
                    zzkt zzkt0 = zzgj0.a;
                    zzkt0.getClass();
                    zzq zzq0 = zzkt0.u(((String)Preconditions.checkNotNull(zzac0.zza)));
                    if(zzq0 != null) {
                        zzkt0.j(zzac0, zzq0);
                        return;
                    }
                }
                else {
                    zzkt zzkt1 = zzgj0.a;
                    zzkt1.getClass();
                    zzq zzq1 = zzkt1.u(((String)Preconditions.checkNotNull(zzac0.zza)));
                    if(zzq1 != null) {
                        zzkt1.m(zzac0, zzq1);
                    }
                }
                return;
            }
            case 6: {
                ((zzhx)this.c).f(((Boolean)this.b), true);
                return;
            }
            case 7: {
                zzjm.i(((zzjl)this.c).c, ((ComponentName)this.b));
                return;
            }
            case 8: {
                zzkt zzkt2 = (zzkt)this.b;
                zzkt2.a();
                zzkt2.zzaz().zzg();
                if(zzkt2.p == null) {
                    zzkt2.p = new ArrayList();
                }
                zzkt2.p.add(((Runnable)this.c));
                zzkt2.p();
                return;
            }
            default: {
                ((AppMeasurementDynamiteService)this.c).a.zzq().zzT(((s)this.b));
            }
        }
    }
}


package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.room.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzd;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class y0 implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public y0(zzjm zzjm0, zzq zzq0, Object object0, int v) {
        this.a = v;
        this.c = zzjm0;
        this.b = zzq0;
        this.d = object0;
        super();
    }

    public y0(Object object0, Object object1, int v, Object object2) {
        this.a = v;
        this.c = object0;
        this.d = object1;
        this.b = object2;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                AtomicReference atomicReference0 = (AtomicReference)this.d;
                __monitor_enter(atomicReference0);
                try {
                    try {
                        if(((zzjm)this.c).zzt.zzm().b().zzi(zzah.zzb)) {
                            zzjm zzjm0 = (zzjm)this.c;
                            zzdx zzdx0 = zzjm0.c;
                            if(zzdx0 != null) {
                                Preconditions.checkNotNull(((zzq)this.b));
                                String s = zzdx0.zzd(((zzq)this.b));
                                ((AtomicReference)this.d).set(s);
                                String s1 = (String)((AtomicReference)this.d).get();
                                if(s1 != null) {
                                    ((zzjm)this.c).zzt.zzq().e.set(s1);
                                    ((zzjm)this.c).zzt.zzm().e.zzb(s1);
                                }
                                ((zzjm)this.c).f();
                                goto label_30;
                            }
                            zzjm0.zzt.zzay().zzd().zza("Failed to get app instance id");
                        }
                        else {
                            ((zzjm)this.c).zzt.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                            ((zzjm)this.c).zzt.zzq().e.set(null);
                            ((zzjm)this.c).zzt.zzm().e.zzb(null);
                            ((AtomicReference)this.d).set(null);
                        }
                        goto label_36;
                    }
                    catch(RemoteException remoteException0) {
                        ((zzjm)this.c).zzt.zzay().zzd().zzb("Failed to get app instance id", remoteException0);
                    }
                }
                catch(Throwable throwable0) {
                    goto label_34;
                }
                try {
                label_30:
                    ((AtomicReference)this.d).notify();
                }
                catch(Throwable throwable1) {
                    __monitor_exit(atomicReference0);
                    throw throwable1;
                }
                __monitor_exit(atomicReference0);
                try {
                    return;
                label_34:
                    ((AtomicReference)this.d).notify();
                    throw throwable0;
                label_36:
                    ((AtomicReference)this.d).notify();
                }
                catch(Throwable throwable1) {
                    __monitor_exit(atomicReference0);
                    throw throwable1;
                }
                __monitor_exit(atomicReference0);
                return;
            }
            case 1: {
                zzq zzq0 = (zzq)this.b;
                zzcf zzcf0 = (zzcf)this.d;
                zzjm zzjm1 = (zzjm)this.c;
                String s2 = null;
                try {
                    if(zzjm1.zzt.zzm().b().zzi(zzah.zzb)) {
                        zzdx zzdx1 = zzjm1.c;
                        if(zzdx1 == null) {
                            zzjm1.zzt.zzay().zzd().zza("Failed to get app instance id");
                        }
                        else {
                            Preconditions.checkNotNull(zzq0);
                            s2 = zzdx1.zzd(zzq0);
                            if(s2 != null) {
                                zzjm1.zzt.zzq().e.set(s2);
                                zzjm1.zzt.zzm().e.zzb(s2);
                            }
                            zzjm1.f();
                        }
                    }
                    else {
                        zzjm1.zzt.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                        zzjm1.zzt.zzq().e.set(null);
                        zzjm1.zzt.zzm().e.zzb(null);
                    }
                }
                catch(RemoteException remoteException1) {
                    zzjm1.zzt.zzay().zzd().zzb("Failed to get app instance id", remoteException1);
                }
                finally {
                    zzjm1.zzt.zzv().zzV(zzcf0, s2);
                }
                return;
            }
            case 2: {
                zzq zzq1 = (zzq)this.b;
                zzjm zzjm2 = (zzjm)this.c;
                zzdx zzdx2 = zzjm2.c;
                if(zzdx2 == null) {
                    a.v(zzjm2.zzt, "Failed to send default event parameters to service");
                    return;
                }
                try {
                    Preconditions.checkNotNull(zzq1);
                    zzdx2.zzr(((Bundle)this.d), zzq1);
                }
                catch(RemoteException remoteException2) {
                    zzjm2.zzt.zzay().zzd().zzb("Failed to send default event parameters to service", remoteException2);
                }
                return;
            }
            case 3: {
                zzgj zzgj0 = (zzgj)this.c;
                zzgj0.a.a();
                zzac zzac0 = (zzac)this.d;
                Object object0 = zzac0.zzc.zza();
                zzq zzq2 = (zzq)this.b;
                if(object0 == null) {
                    zzgj0.a.j(zzac0, zzq2);
                    return;
                }
                zzgj0.a.m(zzac0, zzq2);
                return;
            }
            case 4: {
                zzgj zzgj1 = (zzgj)this.c;
                zzgj1.getClass();
                zzaw zzaw1 = (zzaw)this.d;
                zzkt zzkt0 = zzgj1.a;
                if("_cmp".equals(zzaw1.zza) && (zzaw1.zzb != null && zzaw1.zzb.zza() != 0)) {
                    String s3 = zzaw1.zzb.a.getString("_cis");
                    if("referrer broadcast".equals(s3) || "referrer API".equals(s3)) {
                        zzkt0.zzay().zzi().zzb("Event has been filtered ", zzaw1.toString());
                        zzaw1 = new zzaw("_cmpx", zzaw1.zzb, zzaw1.zzc, zzaw1.zzd);
                    }
                }
                zzfi zzfi0 = zzkt0.zzo();
                zzq zzq3 = (zzq)this.b;
                if(!zzfi0.zzo(zzq3.zza)) {
                    zzgj1.a(zzaw1, zzq3);
                    return;
                }
                zzkt0.zzay().zzj().zzb("EES config found for", zzq3.zza);
                zzfi zzfi1 = zzkt0.zzo();
                zzc zzc0 = TextUtils.isEmpty(zzq3.zza) ? null : ((zzc)zzfi1.h.get(zzq3.zza));
                if(zzc0 == null) {
                    zzkt0.zzay().zzj().zzb("EES not loaded for", zzq3.zza);
                    zzgj1.a(zzaw1, zzq3);
                }
                else {
                    try {
                        zzkv zzkv0 = zzkt0.zzu();
                        Bundle bundle0 = zzaw1.zzb.zzc();
                        zzkv0.getClass();
                        HashMap hashMap0 = zzkv.u(bundle0, true);
                        String s4 = zzgo.zza(zzaw1.zza);
                        if(s4 == null) {
                            s4 = zzaw1.zza;
                        }
                        if(!zzc0.zze(new zzaa(s4, zzaw1.zzd, hashMap0))) {
                            goto label_136;
                        }
                    }
                    catch(zzd unused_ex) {
                        zzkt0.zzay().zzd().zzc("EES error. appId, eventName", zzq3.zzb, zzaw1.zza);
                        goto label_136;
                    }
                    if(zzc0.zzg()) {
                        zzkt0.zzay().zzj().zzb("EES edited event", zzaw1.zza);
                        zzkt0.zzu().getClass();
                        zzgj1.a(zzkv.n(zzc0.zza().zzb()), zzq3);
                    }
                    else {
                        zzgj1.a(zzaw1, zzq3);
                    }
                    if(zzc0.zzf()) {
                        for(Object object1: zzc0.zza().zzc()) {
                            zzkt0.zzay().zzj().zzb("EES logging created event", ((zzaa)object1).zzd());
                            zzkt0.zzu().getClass();
                            zzgj1.a(zzkv.n(((zzaa)object1)), zzq3);
                        }
                        return;
                    label_136:
                        zzkt0.zzay().zzj().zzb("EES was not applied to event", zzaw1.zza);
                        zzgj1.a(zzaw1, zzq3);
                        return;
                    }
                }
                return;
            }
            case 5: {
                ((zzgj)this.c).a.a();
                ((zzgj)this.c).a.f(((zzaw)this.d), ((String)this.b));
                return;
            }
            case 6: {
                zzgj zzgj2 = (zzgj)this.c;
                zzgj2.a.a();
                zzkw zzkw0 = (zzkw)this.d;
                Object object2 = zzkw0.zza();
                zzq zzq4 = (zzq)this.b;
                if(object2 == null) {
                    zzgj2.a.k(zzkw0, zzq4);
                    return;
                }
                zzgj2.a.o(zzkw0, zzq4);
                return;
            }
            default: {
                zzlb zzlb0 = ((o1)this.c).b.zzv();
                long v = ((o1)this.c).b.zzav().currentTimeMillis();
                zzaw zzaw0 = (zzaw)Preconditions.checkNotNull(zzlb0.M("_err", ((Bundle)this.b), "auto", v, false));
                ((o1)this.c).b.f(zzaw0, ((String)this.d));
            }
        }
    }
}


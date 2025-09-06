package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class a1 implements Runnable {
    public final int a;
    public final String b;
    public final String c;
    public final zzq d;
    public final zzjm e;
    public final Object f;

    public a1(zzjm zzjm0, String s, String s1, zzq zzq0, zzcf zzcf0) {
        this.a = 1;
        super();
        this.e = zzjm0;
        this.b = s;
        this.c = s1;
        this.d = zzq0;
        this.f = zzcf0;
    }

    public a1(zzjm zzjm0, AtomicReference atomicReference0, String s, String s1, zzq zzq0) {
        this.a = 0;
        super();
        this.e = zzjm0;
        this.f = atomicReference0;
        this.b = s;
        this.c = s1;
        this.d = zzq0;
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            zzq zzq0 = this.d;
            String s = this.c;
            String s1 = this.b;
            zzcf zzcf0 = (zzcf)this.f;
            zzjm zzjm0 = this.e;
            ArrayList arrayList0 = new ArrayList();
            try {
                zzdx zzdx0 = zzjm0.c;
                if(zzdx0 == null) {
                    zzjm0.zzt.zzay().zzd().zzc("Failed to get conditional properties; not connected to service", s1, s);
                }
                else {
                    Preconditions.checkNotNull(zzq0);
                    arrayList0 = zzlb.zzH(zzdx0.zzf(s1, s, zzq0));
                    zzjm0.f();
                }
            }
            catch(RemoteException remoteException0) {
                zzjm0.zzt.zzay().zzd().zzd("Failed to get conditional properties; remote exception", s1, s, remoteException0);
            }
            finally {
                zzjm0.zzt.zzv().zzQ(zzcf0, arrayList0);
            }
            return;
        }
        AtomicReference atomicReference0 = (AtomicReference)this.f;
        __monitor_enter(atomicReference0);
        try {
            try {
                zzjm zzjm1 = this.e;
                zzdx zzdx1 = zzjm1.c;
                if(zzdx1 != null) {
                    if(TextUtils.isEmpty(null)) {
                        Preconditions.checkNotNull(this.d);
                        List list0 = zzdx1.zzf(this.b, this.c, this.d);
                        ((AtomicReference)this.f).set(list0);
                    }
                    else {
                        List list1 = zzdx1.zzg(null, this.b, this.c);
                        ((AtomicReference)this.f).set(list1);
                    }
                    this.e.f();
                    goto label_44;
                }
                zzjm1.zzt.zzay().zzd().zzd("(legacy) Failed to get conditional properties; not connected to service", null, this.b, this.c);
                List list2 = Collections.emptyList();
                ((AtomicReference)this.f).set(list2);
                goto label_50;
            }
            catch(RemoteException remoteException1) {
                this.e.zzt.zzay().zzd().zzd("(legacy) Failed to get conditional properties; remote exception", null, this.b, remoteException1);
                List list3 = Collections.emptyList();
                ((AtomicReference)this.f).set(list3);
            }
        }
        catch(Throwable throwable0) {
            goto label_48;
        }
        try {
        label_44:
            ((AtomicReference)this.f).notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
        try {
            return;
        label_48:
            ((AtomicReference)this.f).notify();
            throw throwable0;
        label_50:
            ((AtomicReference)this.f).notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
    }
}


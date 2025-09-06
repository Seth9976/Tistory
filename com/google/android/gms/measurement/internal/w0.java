package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import androidx.room.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class w0 implements Runnable {
    public final int a;
    public final zzq b;
    public final boolean c;
    public final zzjm d;
    public final Object e;

    public w0(zzjm zzjm0, zzq zzq0, boolean z, AbstractSafeParcelable abstractSafeParcelable0, int v) {
        this.a = v;
        this.d = zzjm0;
        this.b = zzq0;
        this.c = z;
        this.e = abstractSafeParcelable0;
        super();
    }

    public w0(zzjm zzjm0, AtomicReference atomicReference0, zzq zzq0, boolean z) {
        this.a = 1;
        super();
        this.d = zzjm0;
        this.e = atomicReference0;
        this.b = zzq0;
        this.c = z;
    }

    @Override
    public final void run() {
        zzdx zzdx2;
        switch(this.a) {
            case 0: {
                zzjm zzjm1 = this.d;
                zzdx zzdx1 = zzjm1.c;
                if(zzdx1 == null) {
                    a.v(zzjm1.zzt, "Discarding data. Failed to set user property");
                    return;
                }
                Preconditions.checkNotNull(this.b);
                zzjm1.a(zzdx1, (this.c ? null : ((zzkw)this.e)), this.b);
                zzjm1.f();
                return;
            }
            case 1: {
                AtomicReference atomicReference0 = (AtomicReference)this.e;
                __monitor_enter(atomicReference0);
                try {
                    zzjm zzjm2 = this.d;
                    zzdx2 = zzjm2.c;
                    if(zzdx2 == null) {
                        zzjm2.zzt.zzay().zzd().zza("Failed to get all user properties; not connected to service");
                        goto label_25;
                    }
                    goto label_28;
                }
                catch(RemoteException remoteException0) {
                    goto label_34;
                }
                catch(Throwable throwable0) {
                    goto label_37;
                }
                try {
                label_25:
                    ((AtomicReference)this.e).notify();
                }
                catch(Throwable throwable1) {
                    __monitor_exit(atomicReference0);
                    throw throwable1;
                }
                __monitor_exit(atomicReference0);
                return;
                try {
                    try {
                    label_28:
                        Preconditions.checkNotNull(this.b);
                        List list0 = zzdx2.zze(this.b, this.c);
                        ((AtomicReference)this.e).set(list0);
                        this.d.f();
                    }
                    catch(RemoteException remoteException0) {
                    label_34:
                        this.d.zzt.zzay().zzd().zzb("Failed to get all user properties; remote exception", remoteException0);
                    }
                    goto label_39;
                }
                catch(Throwable throwable0) {
                    try {
                    label_37:
                        ((AtomicReference)this.e).notify();
                        throw throwable0;
                    label_39:
                        ((AtomicReference)this.e).notify();
                    }
                    catch(Throwable throwable1) {
                        __monitor_exit(atomicReference0);
                        throw throwable1;
                    }
                }
                __monitor_exit(atomicReference0);
                try {
                    return;
                }
                catch(Throwable throwable1) {
                    __monitor_exit(atomicReference0);
                    throw throwable1;
                }
            }
            case 2: {
                zzjm zzjm3 = this.d;
                zzdx zzdx3 = zzjm3.c;
                if(zzdx3 == null) {
                    a.v(zzjm3.zzt, "Discarding data. Failed to send event to service");
                    return;
                }
                Preconditions.checkNotNull(this.b);
                zzjm3.a(zzdx3, (this.c ? null : ((zzaw)this.e)), this.b);
                zzjm3.f();
                return;
            }
            default: {
                zzjm zzjm0 = this.d;
                zzdx zzdx0 = zzjm0.c;
                if(zzdx0 == null) {
                    a.v(zzjm0.zzt, "Discarding data. Failed to send conditional user property to service");
                    return;
                }
                Preconditions.checkNotNull(this.b);
                zzjm0.a(zzdx0, (this.c ? null : ((zzac)this.e)), this.b);
                zzjm0.f();
            }
        }
    }
}


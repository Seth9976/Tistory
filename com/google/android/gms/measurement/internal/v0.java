package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class v0 implements Runnable {
    public final int a;
    public final String b;
    public final String c;
    public final zzq d;
    public final boolean e;
    public final zzjm f;
    public final Object g;

    public v0(zzjm zzjm0, String s, String s1, zzq zzq0, boolean z, zzcf zzcf0) {
        this.a = 0;
        super();
        this.f = zzjm0;
        this.b = s;
        this.c = s1;
        this.d = zzq0;
        this.e = z;
        this.g = zzcf0;
    }

    public v0(zzjm zzjm0, AtomicReference atomicReference0, String s, String s1, zzq zzq0, boolean z) {
        this.a = 1;
        super();
        this.f = zzjm0;
        this.g = atomicReference0;
        this.b = s;
        this.c = s1;
        this.d = zzq0;
        this.e = z;
    }

    @Override
    public final void run() {
        Bundle bundle1;
        if(this.a != 0) {
            AtomicReference atomicReference0 = (AtomicReference)this.g;
            __monitor_enter(atomicReference0);
            try {
                try {
                    zzjm zzjm0 = this.f;
                    zzdx zzdx0 = zzjm0.c;
                    if(zzdx0 != null) {
                        if(TextUtils.isEmpty(null)) {
                            Preconditions.checkNotNull(this.d);
                            List list0 = zzdx0.zzh(this.b, this.c, this.e, this.d);
                            ((AtomicReference)this.g).set(list0);
                        }
                        else {
                            List list1 = zzdx0.zzi(null, this.b, this.c, this.e);
                            ((AtomicReference)this.g).set(list1);
                        }
                        this.f.f();
                        goto label_23;
                    }
                    zzjm0.zzt.zzay().zzd().zzd("(legacy) Failed to get user properties; not connected to service", null, this.b, this.c);
                    List list2 = Collections.emptyList();
                    ((AtomicReference)this.g).set(list2);
                    goto label_29;
                }
                catch(RemoteException remoteException0) {
                    this.f.zzt.zzay().zzd().zzd("(legacy) Failed to get user properties; remote exception", null, this.b, remoteException0);
                    List list3 = Collections.emptyList();
                    ((AtomicReference)this.g).set(list3);
                }
            }
            catch(Throwable throwable0) {
                goto label_27;
            }
            try {
            label_23:
                ((AtomicReference)this.g).notify();
            }
            catch(Throwable throwable1) {
                __monitor_exit(atomicReference0);
                throw throwable1;
            }
            __monitor_exit(atomicReference0);
            try {
                return;
            label_27:
                ((AtomicReference)this.g).notify();
                throw throwable0;
            label_29:
                ((AtomicReference)this.g).notify();
            }
            catch(Throwable throwable1) {
                __monitor_exit(atomicReference0);
                throw throwable1;
            }
            __monitor_exit(atomicReference0);
            return;
        }
        zzq zzq0 = this.d;
        String s = this.b;
        zzcf zzcf0 = (zzcf)this.g;
        zzjm zzjm1 = this.f;
        Bundle bundle0 = new Bundle();
        try {
            zzdx zzdx1 = zzjm1.c;
            String s1 = this.c;
            if(zzdx1 == null) {
                zzjm1.zzt.zzay().zzd().zzc("Failed to get user properties; not connected to service", s, s1);
                goto label_76;
            }
            Preconditions.checkNotNull(zzq0);
            List list4 = zzdx1.zzh(s, s1, this.e, zzq0);
            bundle1 = new Bundle();
            if(list4 != null) {
                Iterator iterator0 = list4.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    zzkw zzkw0 = (zzkw)object0;
                    String s2 = zzkw0.zze;
                    if(s2 == null) {
                        Long long0 = zzkw0.zzd;
                        if(long0 == null) {
                            Double double0 = zzkw0.zzg;
                            if(double0 == null) {
                                continue;
                            }
                            bundle1.putDouble(zzkw0.zzb, ((double)double0));
                        }
                        else {
                            bundle1.putLong(zzkw0.zzb, ((long)long0));
                        }
                    }
                    else {
                        bundle1.putString(zzkw0.zzb, s2);
                    }
                }
            }
            goto label_68;
        }
        catch(RemoteException remoteException1) {
            goto label_72;
            try {
            label_68:
                zzjm1.f();
                goto label_82;
            }
            catch(RemoteException remoteException1) {
            }
            catch(Throwable throwable2) {
                bundle0 = bundle1;
                zzjm1.zzt.zzv().zzR(zzcf0, bundle0);
                throw throwable2;
            }
            bundle0 = bundle1;
            try {
            label_72:
                zzjm1.zzt.zzay().zzd().zzc("Failed to get user properties; remote exception", s, remoteException1);
                goto label_76;
            }
            catch(Throwable throwable2) {
            }
            zzjm1.zzt.zzv().zzR(zzcf0, bundle0);
            throw throwable2;
        }
        catch(Throwable throwable2) {
            zzjm1.zzt.zzv().zzR(zzcf0, bundle0);
            throw throwable2;
        }
    label_76:
        zzjm1.zzt.zzv().zzR(zzcf0, bundle0);
        return;
    label_82:
        zzjm1.zzt.zzv().zzR(zzcf0, bundle1);
    }
}


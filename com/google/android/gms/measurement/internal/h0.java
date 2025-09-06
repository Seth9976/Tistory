package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.concurrent.atomic.AtomicReference;

public final class h0 implements Runnable {
    public final int a;
    public final String b;
    public final Object c;
    public final Object d;
    public final Object e;

    public h0(int v, String s, Object object0, Object object1, Object object2) {
        this.a = v;
        this.e = object0;
        this.c = object1;
        this.b = s;
        this.d = object2;
        super();
    }

    public h0(AppMeasurementDynamiteService appMeasurementDynamiteService0, zzcf zzcf0, zzaw zzaw0, String s) {
        this.a = 2;
        super();
        this.e = appMeasurementDynamiteService0;
        this.c = zzcf0;
        this.d = zzaw0;
        this.b = s;
    }

    @Override
    public final void run() {
        zzdx zzdx0;
        switch(this.a) {
            case 0: {
                ((zzhx)this.e).zzt.zzt().zzw(((AtomicReference)this.c), null, this.b, ((String)this.d));
                return;
            }
            case 1: {
                zzcf zzcf0 = (zzcf)this.d;
                zzjm zzjm0 = (zzjm)this.e;
                byte[] arr_b = null;
                try {
                    zzdx0 = zzjm0.c;
                    if(zzdx0 == null) {
                        zzjm0.zzt.zzay().zzd().zza("Discarding data. Failed to send event to service to bundle");
                        goto label_11;
                    }
                    goto label_13;
                }
                catch(RemoteException remoteException0) {
                    goto label_17;
                }
                catch(Throwable throwable0) {
                    zzjm0.zzt.zzv().zzS(zzcf0, arr_b);
                    throw throwable0;
                }
            label_11:
                zzjm0.zzt.zzv().zzS(zzcf0, null);
                return;
                try {
                    try {
                    label_13:
                        arr_b = zzdx0.zzu(((zzaw)this.c), this.b);
                        zzjm0.f();
                        goto label_23;
                    }
                    catch(RemoteException remoteException0) {
                    }
                label_17:
                    zzjm0.zzt.zzay().zzd().zzb("Failed to send event to the service to bundle", remoteException0);
                }
                catch(Throwable throwable0) {
                    zzjm0.zzt.zzv().zzS(zzcf0, arr_b);
                    throw throwable0;
                }
                zzjm0.zzt.zzv().zzS(zzcf0, arr_b);
                return;
            label_23:
                zzjm0.zzt.zzv().zzS(zzcf0, arr_b);
                return;
            }
            case 2: {
                ((AppMeasurementDynamiteService)this.e).a.zzt().zzB(((zzcf)this.c), ((zzaw)this.d), this.b);
                return;
            }
            default: {
                ((AppMeasurementDynamiteService)this.e).a.zzt().zzv(((zzcf)this.c), this.b, ((String)this.d));
            }
        }
    }
}


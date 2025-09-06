package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import androidx.room.a;
import com.google.android.gms.common.internal.Preconditions;

public final class x0 implements Runnable {
    public final int a;
    public final zzq b;
    public final zzjm c;

    public x0(zzjm zzjm0, zzq zzq0, int v) {
        this.a = v;
        this.c = zzjm0;
        this.b = zzq0;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                zzq zzq1 = this.b;
                zzjm zzjm1 = this.c;
                zzdx zzdx1 = zzjm1.c;
                if(zzdx1 == null) {
                    a.v(zzjm1.zzt, "Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    Preconditions.checkNotNull(zzq1);
                    zzdx1.zzm(zzq1);
                }
                catch(RemoteException remoteException1) {
                    zzjm1.zzt.zzay().zzd().zzb("Failed to reset data on the service: remote exception", remoteException1);
                }
                zzjm1.f();
                return;
            }
            case 1: {
                zzq zzq2 = this.b;
                zzjm zzjm2 = this.c;
                zzdx zzdx2 = zzjm2.c;
                if(zzdx2 == null) {
                    a.v(zzjm2.zzt, "Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    Preconditions.checkNotNull(zzq2);
                    zzdx2.zzj(zzq2);
                    zzjm2.zzt.zzi().zzm();
                    zzjm2.a(zzdx2, null, zzq2);
                    zzjm2.f();
                }
                catch(RemoteException remoteException2) {
                    zzjm2.zzt.zzay().zzd().zzb("Failed to send app launch to the service", remoteException2);
                }
                return;
            }
            case 2: {
                zzq zzq3 = this.b;
                zzjm zzjm3 = this.c;
                zzdx zzdx3 = zzjm3.c;
                if(zzdx3 == null) {
                    a.v(zzjm3.zzt, "Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    Preconditions.checkNotNull(zzq3);
                    zzdx3.zzs(zzq3);
                    zzjm3.f();
                }
                catch(RemoteException remoteException3) {
                    zzjm3.zzt.zzay().zzd().zzb("Failed to send measurementEnabled to the service", remoteException3);
                }
                return;
            }
            default: {
                zzq zzq0 = this.b;
                zzjm zzjm0 = this.c;
                zzdx zzdx0 = zzjm0.c;
                if(zzdx0 == null) {
                    a.v(zzjm0.zzt, "Failed to send consent settings to service");
                    return;
                }
                try {
                    Preconditions.checkNotNull(zzq0);
                    zzdx0.zzp(zzq0);
                    zzjm0.f();
                }
                catch(RemoteException remoteException0) {
                    zzjm0.zzt.zzay().zzd().zzb("Failed to send consent settings to the service", remoteException0);
                }
            }
        }
    }
}


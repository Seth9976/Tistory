package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public abstract class zzy extends zzb implements zzz {
    public zzy() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override  // com.google.android.gms.internal.common.zzb
    public final boolean zza(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = this.zzd();
                parcel1.writeNoException();
                zzc.zzf(parcel1, iObjectWrapper0);
                return true;
            }
            case 2: {
                int v2 = this.zzc();
                parcel1.writeNoException();
                parcel1.writeInt(v2);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzz zzg(IBinder iBinder0) {
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterface0 instanceof zzz ? ((zzz)iInterface0) : new zzx(iBinder0, "com.google.android.gms.common.internal.ICertData");  // 初始化器: Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}


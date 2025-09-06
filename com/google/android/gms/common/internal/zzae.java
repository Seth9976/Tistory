package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

public abstract class zzae extends zzb implements zzaf {
    public static zzaf zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterface0 instanceof zzaf ? ((zzaf)iInterface0) : new zzad(iBinder0, "com.google.android.gms.common.internal.IGoogleCertificatesApi");  // 初始化器: Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}


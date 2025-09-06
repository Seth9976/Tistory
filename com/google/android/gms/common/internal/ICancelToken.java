package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.common.zzb;

public interface ICancelToken extends IInterface {
    public static abstract class Stub extends zzb implements ICancelToken {
        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        @NonNull
        public static ICancelToken asInterface(@NonNull IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return iInterface0 instanceof ICancelToken ? ((ICancelToken)iInterface0) : new zzw(iBinder0, "com.google.android.gms.common.internal.ICancelToken");  // 初始化器: Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
        }

        @Override  // com.google.android.gms.internal.common.zzb
        public final boolean zza(int v, @NonNull Parcel parcel0, @NonNull Parcel parcel1, int v1) throws RemoteException {
            if(v == 2) {
                this.cancel();
                return true;
            }
            return false;
        }
    }

    void cancel() throws RemoteException;
}


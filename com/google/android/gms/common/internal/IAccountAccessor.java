package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public interface IAccountAccessor extends IInterface {
    public static abstract class Stub extends zzb implements IAccountAccessor {
        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @NonNull
        public static IAccountAccessor asInterface(@NonNull IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterface0 instanceof IAccountAccessor ? ((IAccountAccessor)iInterface0) : new zzv(iBinder0, "com.google.android.gms.common.internal.IAccountAccessor");  // 初始化器: Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
        }

        @Override  // com.google.android.gms.internal.common.zzb
        public final boolean zza(int v, @NonNull Parcel parcel0, @NonNull Parcel parcel1, int v1) throws RemoteException {
            if(v == 2) {
                Account account0 = this.zzb();
                parcel1.writeNoException();
                zzc.zze(parcel1, account0);
                return true;
            }
            return false;
        }
    }

    @NonNull
    Account zzb() throws RemoteException;
}


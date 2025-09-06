package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public interface IStatusCallback extends IInterface {
    public static abstract class Stub extends zab implements IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @NonNull
        public static IStatusCallback asInterface(@NonNull IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return iInterface0 instanceof IStatusCallback ? ((IStatusCallback)iInterface0) : new zaby(iBinder0, "com.google.android.gms.common.api.internal.IStatusCallback");  // 初始化器: Lcom/google/android/gms/internal/base/zaa;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
        }

        @Override  // com.google.android.gms.internal.base.zab
        public final boolean zaa(int v, @NonNull Parcel parcel0, @NonNull Parcel parcel1, int v1) throws RemoteException {
            if(v == 1) {
                this.onResult(((Status)zac.zaa(parcel0, Status.CREATOR)));
                return true;
            }
            return false;
        }
    }

    void onResult(@NonNull Status arg1) throws RemoteException;
}


package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.List;

public interface zzdx extends IInterface {
    @Nullable
    String zzd(zzq arg1) throws RemoteException;

    @Nullable
    List zze(zzq arg1, boolean arg2) throws RemoteException;

    List zzf(@Nullable String arg1, @Nullable String arg2, zzq arg3) throws RemoteException;

    List zzg(String arg1, @Nullable String arg2, @Nullable String arg3) throws RemoteException;

    List zzh(@Nullable String arg1, @Nullable String arg2, boolean arg3, zzq arg4) throws RemoteException;

    List zzi(String arg1, @Nullable String arg2, @Nullable String arg3, boolean arg4) throws RemoteException;

    void zzj(zzq arg1) throws RemoteException;

    void zzk(zzaw arg1, zzq arg2) throws RemoteException;

    void zzl(zzaw arg1, String arg2, @Nullable String arg3) throws RemoteException;

    void zzm(zzq arg1) throws RemoteException;

    void zzn(zzac arg1, zzq arg2) throws RemoteException;

    void zzo(zzac arg1) throws RemoteException;

    void zzp(zzq arg1) throws RemoteException;

    void zzq(long arg1, @Nullable String arg2, @Nullable String arg3, String arg4) throws RemoteException;

    void zzr(Bundle arg1, zzq arg2) throws RemoteException;

    void zzs(zzq arg1) throws RemoteException;

    void zzt(zzkw arg1, zzq arg2) throws RemoteException;

    @Nullable
    byte[] zzu(zzaw arg1, String arg2) throws RemoteException;
}


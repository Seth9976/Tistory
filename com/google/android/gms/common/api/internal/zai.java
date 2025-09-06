package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

public abstract class zai {
    public final int zac;

    public zai(int v) {
        this.zac = v;
    }

    public static Status a(RemoteException remoteException0) {
        return new Status(19, remoteException0.getClass().getSimpleName() + ": " + remoteException0.getLocalizedMessage());
    }

    public abstract void zad(@NonNull Status arg1);

    public abstract void zae(@NonNull Exception arg1);

    public abstract void zaf(zabq arg1) throws DeadObjectException;

    public abstract void zag(@NonNull zaad arg1, boolean arg2);
}


package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class g0 extends zac {
    protected final TaskCompletionSource zaa;

    public g0(int v, TaskCompletionSource taskCompletionSource0) {
        super(v);
        this.zaa = taskCompletionSource0;
    }

    public abstract void zac(zabq arg1);

    @Override  // com.google.android.gms.common.api.internal.zai
    public final void zad(@NonNull Status status0) {
        ApiException apiException0 = new ApiException(status0);
        this.zaa.trySetException(apiException0);
    }

    @Override  // com.google.android.gms.common.api.internal.zai
    public final void zae(@NonNull Exception exception0) {
        this.zaa.trySetException(exception0);
    }

    @Override  // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq zabq0) throws DeadObjectException {
        try {
            this.zac(zabq0);
        }
        catch(DeadObjectException deadObjectException0) {
            this.zad(zai.a(deadObjectException0));
            throw deadObjectException0;
        }
        catch(RemoteException remoteException0) {
            this.zad(zai.a(remoteException0));
        }
        catch(RuntimeException runtimeException0) {
            this.zaa.trySetException(runtimeException0);
        }
    }
}


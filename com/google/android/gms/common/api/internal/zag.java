package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zag extends zac {
    public final TaskApiCall a;
    public final TaskCompletionSource b;
    public final StatusExceptionMapper c;

    public zag(int v, TaskApiCall taskApiCall0, TaskCompletionSource taskCompletionSource0, StatusExceptionMapper statusExceptionMapper0) {
        super(v);
        this.b = taskCompletionSource0;
        this.a = taskApiCall0;
        this.c = statusExceptionMapper0;
        if(v == 2 && taskApiCall0.shouldAutoResolveMissingFeatures()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(zabq zabq0) {
        return this.a.shouldAutoResolveMissingFeatures();
    }

    @Override  // com.google.android.gms.common.api.internal.zac
    @Nullable
    public final Feature[] zab(zabq zabq0) {
        return this.a.zab();
    }

    @Override  // com.google.android.gms.common.api.internal.zai
    public final void zad(@NonNull Status status0) {
        Exception exception0 = this.c.getException(status0);
        this.b.trySetException(exception0);
    }

    @Override  // com.google.android.gms.common.api.internal.zai
    public final void zae(@NonNull Exception exception0) {
        this.b.trySetException(exception0);
    }

    @Override  // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq zabq0) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource0;
        try {
            taskCompletionSource0 = this.b;
            this.a.doExecute(zabq0.zaf(), taskCompletionSource0);
        }
        catch(DeadObjectException deadObjectException0) {
            throw deadObjectException0;
        }
        catch(RemoteException remoteException0) {
            this.zad(zai.a(remoteException0));
        }
        catch(RuntimeException runtimeException0) {
            taskCompletionSource0.trySetException(runtimeException0);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zai
    public final void zag(@NonNull zaad zaad0, boolean z) {
        zaad0.b.put(this.b, Boolean.valueOf(z));
        d d0 = new d(zaad0, this.b);
        this.b.getTask().addOnCompleteListener(d0);
    }
}


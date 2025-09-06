package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzd extends zzab {
    public BaseGmsClient a;
    public final int b;

    public zzd(@NonNull BaseGmsClient baseGmsClient0, int v) {
        this.a = baseGmsClient0;
        this.b = v;
    }

    @Override  // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void onPostInitComplete(int v, @NonNull IBinder iBinder0, @Nullable Bundle bundle0) {
        Preconditions.checkNotNull(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.onPostInitHandler(v, iBinder0, bundle0, this.b);
        this.a = null;
    }

    @Override  // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void zzb(int v, @Nullable Bundle bundle0) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override  // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void zzc(int v, @NonNull IBinder iBinder0, @NonNull zzj zzj0) {
        BaseGmsClient baseGmsClient0 = this.a;
        Preconditions.checkNotNull(baseGmsClient0, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.checkNotNull(zzj0);
        baseGmsClient0.A = zzj0;
        this.onPostInitComplete(v, iBinder0, zzj0.a);
    }
}


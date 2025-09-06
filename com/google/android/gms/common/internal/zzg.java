package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

public final class zzg extends h {
    public final BaseGmsClient e;

    @BinderThread
    public zzg(BaseGmsClient baseGmsClient0, @Nullable int v, Bundle bundle0) {
        this.e = baseGmsClient0;
        super(baseGmsClient0, v, null);
    }

    @Override  // com.google.android.gms.common.internal.h
    public final void zzb(ConnectionResult connectionResult0) {
        this.e.zzc.onReportServiceBinding(connectionResult0);
        this.e.onConnectionFailed(connectionResult0);
    }

    @Override  // com.google.android.gms.common.internal.h
    public final boolean zzd() {
        this.e.zzc.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
        return true;
    }
}


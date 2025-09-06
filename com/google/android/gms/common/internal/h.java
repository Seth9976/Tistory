package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

public abstract class h extends zzc {
    public final BaseGmsClient d;
    public final int zza;
    @Nullable
    public final Bundle zzb;

    public h(BaseGmsClient baseGmsClient0, int v, Bundle bundle0) {
        this.d = baseGmsClient0;
        super(baseGmsClient0, Boolean.TRUE);
        this.zza = v;
        this.zzb = bundle0;
    }

    @Override  // com.google.android.gms.common.internal.zzc
    public final void zza(Object object0) {
        BaseGmsClient baseGmsClient0 = this.d;
        PendingIntent pendingIntent0 = null;
        if(this.zza == 0) {
            if(!this.zzd()) {
                baseGmsClient0.d(null, 1);
                this.zzb(new ConnectionResult(8, null));
            }
            return;
        }
        baseGmsClient0.d(null, 1);
        Bundle bundle0 = this.zzb;
        if(bundle0 != null) {
            pendingIntent0 = (PendingIntent)bundle0.getParcelable("pendingIntent");
        }
        this.zzb(new ConnectionResult(this.zza, pendingIntent0));
    }

    public abstract void zzb(ConnectionResult arg1);

    @Override  // com.google.android.gms.common.internal.zzc
    public final void zzc() {
    }

    public abstract boolean zzd();
}


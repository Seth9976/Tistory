package com.google.android.play.core.appupdate.internal;

import android.os.IBinder.DeathRecipient;

public final class zzp implements IBinder.DeathRecipient {
    public final zzx zza;

    public zzp(zzx zzx0) {
        this.zza = zzx0;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        zzx.zzj(this.zza);
    }
}


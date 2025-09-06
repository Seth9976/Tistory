package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzcl;

@VisibleForTesting
public final class zzgu {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final long f;
    public final zzcl g;
    public final boolean h;
    public final Long i;
    public final String j;

    @VisibleForTesting
    public zzgu(Context context0, @Nullable zzcl zzcl0, @Nullable Long long0) {
        this.h = true;
        Preconditions.checkNotNull(context0);
        Context context1 = context0.getApplicationContext();
        Preconditions.checkNotNull(context1);
        this.a = context1;
        this.i = long0;
        if(zzcl0 != null) {
            this.g = zzcl0;
            this.b = zzcl0.zzf;
            this.c = zzcl0.zze;
            this.d = zzcl0.zzd;
            this.h = zzcl0.zzc;
            this.f = zzcl0.zzb;
            this.j = zzcl0.zzh;
            Bundle bundle0 = zzcl0.zzg;
            if(bundle0 != null) {
                this.e = Boolean.valueOf(bundle0.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}


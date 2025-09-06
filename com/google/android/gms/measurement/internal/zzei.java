package com.google.android.gms.measurement.internal;

import a5.b;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class zzei {
    @NonNull
    public final String zza;
    @NonNull
    public final String zzb;
    public final long zzc;
    @NonNull
    public final Bundle zzd;

    public zzei(@NonNull String s, @NonNull String s1, @Nullable Bundle bundle0, long v) {
        this.zza = s;
        this.zzb = s1;
        this.zzd = bundle0;
        this.zzc = v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = b.w("origin=", this.zzb, ",name=", this.zza, ",params=");
        stringBuilder0.append(this.zzd.toString());
        return stringBuilder0.toString();
    }

    public final zzaw zza() {
        zzau zzau0 = new zzau(new Bundle(this.zzd));
        return new zzaw(this.zza, zzau0, this.zzb, this.zzc);
    }

    public static zzei zzb(zzaw zzaw0) {
        Bundle bundle0 = zzaw0.zzb.zzc();
        return new zzei(zzaw0.zza, zzaw0.zzc, bundle0, zzaw0.zzd);
    }
}


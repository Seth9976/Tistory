package com.google.android.gms.common.stats;

import a5.b;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public interface Types {
        @KeepForSdk
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        @KeepForSdk
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;

    }

    @Override
    @NonNull
    public final String toString() {
        long v = this.zzc();
        int v1 = this.zza();
        long v2 = this.zzb();
        String s = this.zzd();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        stringBuilder0.append("\t");
        stringBuilder0.append(v1);
        stringBuilder0.append("\t");
        return b.g(v2, s, stringBuilder0);
    }

    public abstract int zza();

    public abstract long zzb();

    public abstract long zzc();

    @NonNull
    public abstract String zzd();
}


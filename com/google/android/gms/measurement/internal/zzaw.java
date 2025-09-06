package com.google.android.gms.measurement.internal;

import a5.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "EventParcelCreator")
@Reserved({1})
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final String zza;
    @Field(id = 3)
    public final zzau zzb;
    @Field(id = 4)
    public final String zzc;
    @Field(id = 5)
    public final long zzd;

    static {
        zzaw.CREATOR = new zzax();
    }

    public zzaw(zzaw zzaw0, long v) {
        Preconditions.checkNotNull(zzaw0);
        this.zza = zzaw0.zza;
        this.zzb = zzaw0.zzb;
        this.zzc = zzaw0.zzc;
        this.zzd = v;
    }

    @Constructor
    public zzaw(@Param(id = 2) String s, @Param(id = 3) zzau zzau0, @Param(id = 4) String s1, @Param(id = 5) long v) {
        this.zza = s;
        this.zzb = zzau0;
        this.zzc = s1;
        this.zzd = v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = b.w("origin=", this.zzc, ",name=", this.zza, ",params=");
        stringBuilder0.append(String.valueOf(this.zzb));
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        zzax.a(this, parcel0, v);
    }
}


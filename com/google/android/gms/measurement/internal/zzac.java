package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;

@Class(creator = "ConditionalUserPropertyParcelCreator")
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Nullable
    @Field(id = 2)
    public String zza;
    @Field(id = 3)
    public String zzb;
    @Field(id = 4)
    public zzkw zzc;
    @Field(id = 5)
    public long zzd;
    @Field(id = 6)
    public boolean zze;
    @Nullable
    @Field(id = 7)
    public String zzf;
    @Nullable
    @Field(id = 8)
    public final zzaw zzg;
    @Field(id = 9)
    public long zzh;
    @Nullable
    @Field(id = 10)
    public zzaw zzi;
    @Field(id = 11)
    public final long zzj;
    @Nullable
    @Field(id = 12)
    public final zzaw zzk;

    static {
        zzac.CREATOR = new zzad();
    }

    public zzac(zzac zzac0) {
        Preconditions.checkNotNull(zzac0);
        this.zza = zzac0.zza;
        this.zzb = zzac0.zzb;
        this.zzc = zzac0.zzc;
        this.zzd = zzac0.zzd;
        this.zze = zzac0.zze;
        this.zzf = zzac0.zzf;
        this.zzg = zzac0.zzg;
        this.zzh = zzac0.zzh;
        this.zzi = zzac0.zzi;
        this.zzj = zzac0.zzj;
        this.zzk = zzac0.zzk;
    }

    public zzac(String s, String s1, zzkw zzkw0, long v, boolean z, String s2, zzaw zzaw0, long v1, zzaw zzaw1, long v2, zzaw zzaw2) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = zzkw0;
        this.zzd = v;
        this.zze = z;
        this.zzf = s2;
        this.zzg = zzaw0;
        this.zzh = v1;
        this.zzi = zzaw1;
        this.zzj = v2;
        this.zzk = zzaw2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel0, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.zzc, v, false);
        SafeParcelWriter.writeLong(parcel0, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel0, 6, this.zze);
        SafeParcelWriter.writeString(parcel0, 7, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel0, 8, this.zzg, v, false);
        SafeParcelWriter.writeLong(parcel0, 9, this.zzh);
        SafeParcelWriter.writeParcelable(parcel0, 10, this.zzi, v, false);
        SafeParcelWriter.writeLong(parcel0, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel0, 12, this.zzk, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}


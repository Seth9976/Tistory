package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.ArrayList;
import java.util.List;

@Class(creator = "AppMetadataCreator")
@Reserved({1, 17, 20})
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Nullable
    @Field(id = 2)
    public final String zza;
    @Nullable
    @Field(id = 3)
    public final String zzb;
    @Nullable
    @Field(id = 4)
    public final String zzc;
    @Nullable
    @Field(id = 5)
    public final String zzd;
    @Field(id = 6)
    public final long zze;
    @Field(id = 7)
    public final long zzf;
    @Nullable
    @Field(id = 8)
    public final String zzg;
    @Field(defaultValue = "true", id = 9)
    public final boolean zzh;
    @Field(id = 10)
    public final boolean zzi;
    @Field(defaultValueUnchecked = "Integer.MIN_VALUE", id = 11)
    public final long zzj;
    @Nullable
    @Field(id = 12)
    public final String zzk;
    @Field(id = 13)
    @Deprecated
    public final long zzl;
    @Field(id = 14)
    public final long zzm;
    @Field(id = 15)
    public final int zzn;
    @Field(defaultValue = "true", id = 16)
    public final boolean zzo;
    @Field(id = 18)
    public final boolean zzp;
    @Nullable
    @Field(id = 19)
    public final String zzq;
    @Nullable
    @Field(id = 21)
    public final Boolean zzr;
    @Field(id = 22)
    public final long zzs;
    @Nullable
    @Field(id = 23)
    public final List zzt;
    @Nullable
    @Field(id = 24)
    public final String zzu;
    @Field(defaultValue = "", id = 25)
    public final String zzv;
    @Field(defaultValue = "", id = 26)
    public final String zzw;
    @Nullable
    @Field(id = 27)
    public final String zzx;

    static {
        zzq.CREATOR = new zzr();
    }

    public zzq(String s, String s1, String s2, long v, String s3, long v1, long v2, String s4, boolean z, boolean z1, String s5, long v3, int v4, boolean z2, boolean z3, String s6, Boolean boolean0, long v5, List list0, String s7, String s8, String s9) {
        Preconditions.checkNotEmpty(s);
        this.zza = s;
        this.zzb = TextUtils.isEmpty(s1) ? null : s1;
        this.zzc = s2;
        this.zzj = v;
        this.zzd = s3;
        this.zze = v1;
        this.zzf = v2;
        this.zzg = s4;
        this.zzh = z;
        this.zzi = z1;
        this.zzk = s5;
        this.zzl = 0L;
        this.zzm = v3;
        this.zzn = v4;
        this.zzo = z2;
        this.zzp = z3;
        this.zzq = s6;
        this.zzr = boolean0;
        this.zzs = v5;
        this.zzt = list0;
        this.zzu = null;
        this.zzv = s7;
        this.zzw = s8;
        this.zzx = s9;
    }

    public zzq(String s, String s1, String s2, String s3, long v, long v1, String s4, boolean z, boolean z1, long v2, String s5, long v3, long v4, int v5, boolean z2, boolean z3, String s6, Boolean boolean0, long v6, ArrayList arrayList0, String s7, String s8, String s9, String s10) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = s2;
        this.zzj = v2;
        this.zzd = s3;
        this.zze = v;
        this.zzf = v1;
        this.zzg = s4;
        this.zzh = z;
        this.zzi = z1;
        this.zzk = s5;
        this.zzl = v3;
        this.zzm = v4;
        this.zzn = v5;
        this.zzo = z2;
        this.zzp = z3;
        this.zzq = s6;
        this.zzr = boolean0;
        this.zzs = v6;
        this.zzt = arrayList0;
        this.zzu = s7;
        this.zzv = s8;
        this.zzw = s9;
        this.zzx = s10;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel0, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel0, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel0, 5, this.zzd, false);
        SafeParcelWriter.writeLong(parcel0, 6, this.zze);
        SafeParcelWriter.writeLong(parcel0, 7, this.zzf);
        SafeParcelWriter.writeString(parcel0, 8, this.zzg, false);
        SafeParcelWriter.writeBoolean(parcel0, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel0, 10, this.zzi);
        SafeParcelWriter.writeLong(parcel0, 11, this.zzj);
        SafeParcelWriter.writeString(parcel0, 12, this.zzk, false);
        SafeParcelWriter.writeLong(parcel0, 13, this.zzl);
        SafeParcelWriter.writeLong(parcel0, 14, this.zzm);
        SafeParcelWriter.writeInt(parcel0, 15, this.zzn);
        SafeParcelWriter.writeBoolean(parcel0, 16, this.zzo);
        SafeParcelWriter.writeBoolean(parcel0, 18, this.zzp);
        SafeParcelWriter.writeString(parcel0, 19, this.zzq, false);
        SafeParcelWriter.writeBooleanObject(parcel0, 21, this.zzr, false);
        SafeParcelWriter.writeLong(parcel0, 22, this.zzs);
        SafeParcelWriter.writeStringList(parcel0, 23, this.zzt, false);
        SafeParcelWriter.writeString(parcel0, 24, this.zzu, false);
        SafeParcelWriter.writeString(parcel0, 25, this.zzv, false);
        SafeParcelWriter.writeString(parcel0, 26, this.zzw, false);
        SafeParcelWriter.writeString(parcel0, 27, this.zzx, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}


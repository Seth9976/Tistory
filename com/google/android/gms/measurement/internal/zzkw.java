package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;

@Class(creator = "UserAttributeParcelCreator")
public final class zzkw extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 1)
    public final int zza;
    @Field(id = 2)
    public final String zzb;
    @Field(id = 3)
    public final long zzc;
    @Nullable
    @Field(id = 4)
    public final Long zzd;
    @Nullable
    @Field(id = 6)
    public final String zze;
    @Field(id = 7)
    public final String zzf;
    @Nullable
    @Field(id = 8)
    public final Double zzg;

    static {
        zzkw.CREATOR = new zzkx();
    }

    public zzkw(int v, String s, long v1, Long long0, Float float0, String s1, String s2, Double double0) {
        this.zza = v;
        this.zzb = s;
        this.zzc = v1;
        this.zzd = long0;
        if(v == 1) {
            this.zzg = float0 == null ? null : float0.doubleValue();
        }
        else {
            this.zzg = double0;
        }
        this.zze = s1;
        this.zzf = s2;
    }

    public zzkw(long v, Object object0, String s, String s1) {
        Preconditions.checkNotEmpty(s);
        this.zza = 2;
        this.zzb = s;
        this.zzc = v;
        this.zzf = s1;
        if(object0 == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
            return;
        }
        if(object0 instanceof Long) {
            this.zzd = (Long)object0;
            this.zzg = null;
            this.zze = null;
            return;
        }
        if(object0 instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String)object0;
            return;
        }
        if(!(object0 instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
        this.zzd = null;
        this.zzg = (Double)object0;
        this.zze = null;
    }

    public zzkw(r1 r10) {
        this(r10.d, r10.e, r10.c, r10.b);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        zzkx.a(this, parcel0);
    }

    @Nullable
    public final Object zza() {
        Long long0 = this.zzd;
        if(long0 != null) {
            return long0;
        }
        Double double0 = this.zzg;
        if(double0 != null) {
            return double0;
        }
        String s = this.zze;
        return s != null ? s : null;
    }
}


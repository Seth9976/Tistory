package com.google.android.gms.internal.measurement;

public enum zzne {
    DOUBLE(zznf.zzd),
    FLOAT(zznf.zzc),
    INT64(zznf.zzb),
    UINT64(zznf.zzb),
    INT32(zznf.zza),
    FIXED64(zznf.zzb),
    FIXED32(zznf.zza),
    BOOL(zznf.zze),
    STRING(zznf.zzf),
    GROUP(zznf.zzi),
    MESSAGE(zznf.zzi),
    BYTES(zznf.zzg),
    UINT32(zznf.zza),
    ENUM(zznf.zzh),
    SFIXED32(zznf.zza),
    SFIXED64(zznf.zzb),
    SINT32(zznf.zza),
    SINT64(zznf.zzb);

    public final zznf a;

    public zzne(zznf zznf0) {
        this.a = zznf0;
    }

    public final zznf zza() {
        return this.a;
    }
}


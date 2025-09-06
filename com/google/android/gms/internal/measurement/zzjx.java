package com.google.android.gms.internal.measurement;

public enum zzjx {
    DOUBLE(0, 1, zzkq.zze),
    FLOAT(1, 1, zzkq.zzd),
    INT64(2, 1, zzkq.zzc),
    UINT64(3, 1, zzkq.zzc),
    INT32(4, 1, zzkq.zzb),
    FIXED64(5, 1, zzkq.zzc),
    FIXED32(6, 1, zzkq.zzb),
    BOOL(7, 1, zzkq.zzf),
    STRING(8, 1, zzkq.zzg),
    MESSAGE(9, 1, zzkq.zzj),
    BYTES(10, 1, zzkq.zzh),
    UINT32(11, 1, zzkq.zzb),
    ENUM(12, 1, zzkq.zzi),
    SFIXED32(13, 1, zzkq.zzb),
    SFIXED64(14, 1, zzkq.zzc),
    SINT32(15, 1, zzkq.zzb),
    SINT64(16, 1, zzkq.zzc),
    GROUP(17, 1, zzkq.zzj),
    DOUBLE_LIST(18, 2, zzkq.zze),
    FLOAT_LIST(19, 2, zzkq.zzd),
    INT64_LIST(20, 2, zzkq.zzc),
    UINT64_LIST(21, 2, zzkq.zzc),
    INT32_LIST(22, 2, zzkq.zzb),
    FIXED64_LIST(23, 2, zzkq.zzc),
    FIXED32_LIST(24, 2, zzkq.zzb),
    BOOL_LIST(25, 2, zzkq.zzf),
    STRING_LIST(26, 2, zzkq.zzg),
    MESSAGE_LIST(27, 2, zzkq.zzj),
    BYTES_LIST(28, 2, zzkq.zzh),
    UINT32_LIST(29, 2, zzkq.zzb),
    ENUM_LIST(30, 2, zzkq.zzi),
    SFIXED32_LIST(0x1F, 2, zzkq.zzb),
    SFIXED64_LIST(0x20, 2, zzkq.zzc),
    SINT32_LIST(33, 2, zzkq.zzb),
    SINT64_LIST(34, 2, zzkq.zzc),
    DOUBLE_LIST_PACKED(35, 3, zzkq.zze),
    FLOAT_LIST_PACKED(36, 3, zzkq.zzd),
    INT64_LIST_PACKED(37, 3, zzkq.zzc),
    UINT64_LIST_PACKED(38, 3, zzkq.zzc),
    INT32_LIST_PACKED(39, 3, zzkq.zzb),
    FIXED64_LIST_PACKED(40, 3, zzkq.zzc),
    FIXED32_LIST_PACKED(41, 3, zzkq.zzb),
    BOOL_LIST_PACKED(42, 3, zzkq.zzf),
    UINT32_LIST_PACKED(43, 3, zzkq.zzb),
    ENUM_LIST_PACKED(44, 3, zzkq.zzi),
    SFIXED32_LIST_PACKED(45, 3, zzkq.zzb),
    SFIXED64_LIST_PACKED(46, 3, zzkq.zzc),
    SINT32_LIST_PACKED(0x2F, 3, zzkq.zzb),
    SINT64_LIST_PACKED(0x30, 3, zzkq.zzc),
    GROUP_LIST(49, 2, zzkq.zzj),
    MAP(50, 4, zzkq.zza);

    public final int a;
    public static final zzjx[] b;

    static {
        zzjx[] arr_zzjx = (zzjx[])zzjx.c.clone();
        zzjx.b = new zzjx[arr_zzjx.length];
        for(int v = 0; v < arr_zzjx.length; ++v) {
            zzjx zzjx0 = arr_zzjx[v];
            zzjx.b[zzjx0.a] = zzjx0;
        }
    }

    public zzjx(int v1, int v2, zzkq zzkq0) {
        this.a = v1;
        if(v2 == 1) {
            zzkq0.ordinal();
        }
    }

    public final int zza() {
        return this.a;
    }
}


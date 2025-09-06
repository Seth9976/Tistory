package com.google.android.gms.internal.measurement;

public final class q1 implements zzlj {
    public final zzlm a;
    public final String b;
    public final Object[] c;
    public final int d;

    public q1(zzlm zzlm0, String s, Object[] arr_object) {
        this.a = zzlm0;
        this.b = s;
        this.c = arr_object;
        int v = s.charAt(0);
        if(v < 0xD800) {
            this.d = v;
            return;
        }
        int v1 = v & 0x1FFF;
        int v2 = 13;
        int v4;
        for(int v3 = 1; (v4 = s.charAt(v3)) >= 0xD800; ++v3) {
            v1 |= (v4 & 0x1FFF) << v2;
            v2 += 13;
        }
        this.d = v1 | v4 << v2;
    }

    public final String a() {
        return this.b;
    }

    public final Object[] b() {
        return this.c;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlj
    public final zzlm zza() {
        return this.a;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlj
    public final boolean zzb() {
        return (this.d & 2) == 2;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlj
    public final int zzc() {
        return (this.d & 1) == 1 ? 1 : 2;
    }
}


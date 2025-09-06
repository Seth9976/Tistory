package com.google.android.gms.internal.measurement;

import androidx.room.a;
import java.io.IOException;
import java.util.Arrays;

public final class zzmp {
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;
    public static final zzmp f;

    static {
        zzmp.f = new zzmp(0, new int[0], new Object[0], false);
    }

    public zzmp(int v, int[] arr_v, Object[] arr_object, boolean z) {
        this.d = -1;
        this.a = v;
        this.b = arr_v;
        this.c = arr_object;
        this.e = z;
    }

    public static zzmp a() {
        return new zzmp(0, new int[8], new Object[8], true);
    }

    public final void b(int v, Object object0) {
        if(!this.e) {
            throw new UnsupportedOperationException();
        }
        this.c(this.a + 1);
        int v1 = this.a;
        this.b[v1] = v;
        this.c[v1] = object0;
        this.a = v1 + 1;
    }

    public final void c(int v) {
        int[] arr_v = this.b;
        if(v > arr_v.length) {
            int v1 = this.a / 2 + this.a;
            if(v1 >= v) {
                v = v1;
            }
            if(v < 8) {
                v = 8;
            }
            this.b = Arrays.copyOf(arr_v, v);
            this.c = Arrays.copyOf(this.c, v);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzmp)) {
            return false;
        }
        int v = this.a;
        if(v == ((zzmp)object0).a) {
            int[] arr_v = this.b;
            int[] arr_v1 = ((zzmp)object0).b;
            for(int v1 = 0; v1 < v; ++v1) {
                if(arr_v[v1] != arr_v1[v1]) {
                    return false;
                }
            }
            Object[] arr_object = this.c;
            Object[] arr_object1 = ((zzmp)object0).c;
            int v2 = this.a;
            for(int v3 = 0; v3 < v2; ++v3) {
                if(!arr_object[v3].equals(arr_object1[v3])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a;
        int[] arr_v = this.b;
        int v1 = 17;
        int v3 = 17;
        for(int v4 = 0; v4 < v; ++v4) {
            v3 = v3 * 0x1F + arr_v[v4];
        }
        Object[] arr_object = this.c;
        int v5 = this.a;
        for(int v2 = 0; v2 < v5; ++v2) {
            v1 = v1 * 0x1F + arr_object[v2].hashCode();
        }
        return ((v + 0x20F) * 0x1F + v3) * 0x1F + v1;
    }

    public final int zza() {
        int v = this.d;
        if(v == -1) {
            int v2 = 0;
            for(int v1 = 0; v1 < this.a; ++v1) {
                int v3 = this.b[v1];
                int v4 = v3 >>> 3;
                int v5 = v3 & 7;
                switch(v5) {
                    case 0: {
                        v2 = zzjm.zzB(((long)(((Long)this.c[v1])))) + zzjm.zzA(v4 << 3) + v2;
                        break;
                    }
                    case 1: {
                        ((Long)this.c[v1]).getClass();
                        v2 = a.a(v4 << 3, 8, v2);
                        break;
                    }
                    case 2: {
                        int v6 = ((zzje)this.c[v1]).zzd();
                        v2 = a.b(v6, v6, zzjm.zzA(v4 << 3), v2);
                        break;
                    }
                    case 3: {
                        int v7 = zzjm.zzz(v4);
                        v2 = ((zzmp)this.c[v1]).zza() + (v7 + v7) + v2;
                        break;
                    }
                    default: {
                        if(v5 != 5) {
                            throw new IllegalStateException(new zzko("Protocol message tag had invalid wire type."));
                        }
                        ((Integer)this.c[v1]).getClass();
                        v2 = a.a(v4 << 3, 4, v2);
                        break;
                    }
                }
            }
            this.d = v2;
            return v2;
        }
        return v;
    }

    public final int zzb() {
        int v = this.d;
        if(v == -1) {
            int v2 = 0;
            for(int v1 = 0; v1 < this.a; ++v1) {
                int v3 = this.b[v1];
                int v4 = ((zzje)this.c[v1]).zzd();
                v2 += zzjm.zzA(v4) + v4 + 1 + a.a(v3 >>> 3, 1, 2);
            }
            this.d = v2;
            return v2;
        }
        return v;
    }

    public static zzmp zzc() {
        return zzmp.f;
    }

    public final void zzh() {
        this.e = false;
    }

    public final void zzk(zzng zzng0) throws IOException {
        if(this.a != 0) {
            for(int v = 0; v < this.a; ++v) {
                int v1 = this.b[v];
                Object object0 = this.c[v];
                int v2 = v1 >>> 3;
                int v3 = v1 & 7;
                switch(v3) {
                    case 0: {
                        zzng0.zzt(v2, ((long)(((Long)object0))));
                        break;
                    }
                    case 1: {
                        zzng0.zzm(v2, ((long)(((Long)object0))));
                        break;
                    }
                    case 2: {
                        zzng0.zzd(v2, ((zzje)object0));
                        break;
                    }
                    case 3: {
                        zzng0.zzE(v2);
                        ((zzmp)object0).zzk(zzng0);
                        zzng0.zzh(v2);
                        break;
                    }
                    default: {
                        if(v3 != 5) {
                            throw new RuntimeException(new zzko("Protocol message tag had invalid wire type."));
                        }
                        zzng0.zzk(v2, ((int)(((Integer)object0))));
                        break;
                    }
                }
            }
        }
    }
}


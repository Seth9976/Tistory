package com.google.android.gms.internal.measurement;

public final class a0 implements zzkj {
    public final int a;
    public static final a0 b;
    public static final a0 c;
    public static final a0 d;
    public static final a0 e;
    public static final a0 f;

    static {
        a0.b = new a0(0);
        a0.c = new a0(1);
        a0.d = new a0(2);
        a0.e = new a0(3);
        a0.f = new a0(4);
    }

    public a0(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzkj
    public final boolean zza(int v) {
        switch(this.a) {
            case 0: {
                return zzeq.zza(v) != 0;
            }
            case 1: {
                return zzex.zza(v) != 0;
            }
            case 2: {
                return v == 0 || v == 1 || (v == 2 || v == 3 || v == 4 || v == 5);
            }
            case 3: {
                return v == 1 || v == 2;
            }
            default: {
                return zzgx.zza(v) != 0;
            }
        }
    }
}


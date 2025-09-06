package com.google.android.gms.internal.measurement;

public abstract class zzin implements zzll {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.zzau();
    }

    public abstract zzin zzau();

    public zzin zzav(byte[] arr_b, int v, int v1) throws zzkp {
        throw null;
    }

    public zzin zzaw(byte[] arr_b, int v, int v1, zzjr zzjr0) throws zzkp {
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzll
    public final zzll zzax(byte[] arr_b) throws zzkp {
        return this.zzav(arr_b, 0, arr_b.length);
    }

    @Override  // com.google.android.gms.internal.measurement.zzll
    public final zzll zzay(byte[] arr_b, zzjr zzjr0) throws zzkp {
        return this.zzaw(arr_b, 0, arr_b.length, zzjr0);
    }
}


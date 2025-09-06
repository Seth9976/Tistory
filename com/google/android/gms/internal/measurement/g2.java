package com.google.android.gms.internal.measurement;

import java.util.List;

public final class g2 extends zzai {
    public final int a;

    public g2(String s, int v) {
        this.a = v;
        super(s);
    }

    @Override  // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzg0, List list0) {
        return this.a != 0 && this.a != 1 ? new zzah(0.0) : this;
    }
}


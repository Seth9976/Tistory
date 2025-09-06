package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import org.checkerframework.dataflow.qual.Pure;

public abstract class a0 implements zzgm {
    protected final zzfr zzt;

    public a0(zzfr zzfr0) {
        Preconditions.checkNotNull(zzfr0);
        this.zzt = zzfr0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final Context zzau() {
        throw null;
    }

    @Override  // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final Clock zzav() {
        throw null;
    }

    @Override  // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final zzab zzaw() {
        throw null;
    }

    public void zzax() {
        this.zzt.zzaz().zzax();
    }

    @Override  // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final zzeh zzay() {
        throw null;
    }

    @Override  // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final zzfo zzaz() {
        throw null;
    }

    public void zzg() {
        this.zzt.zzaz().zzg();
    }
}


package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzaf implements zzap {
    public final boolean a;

    public zzaf(Boolean boolean0) {
        this.a = boolean0 == null ? false : boolean0.booleanValue();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzaf ? this.a == ((zzaf)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    @Override
    public final String toString() {
        return String.valueOf(this.a);
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbR(String s, zzg zzg0, List list0) {
        boolean z = this.a;
        if(!"toString".equals(s)) {
            throw new IllegalArgumentException(Boolean.toString(z) + "." + s + " is not a function.");
        }
        return new zzat(Boolean.toString(z));
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzaf(Boolean.valueOf(this.a));
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(this.a);
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        return this.a ? 1.0 : 0.0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return Boolean.toString(this.a);
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return null;
    }
}


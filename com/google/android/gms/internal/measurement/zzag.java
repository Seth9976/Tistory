package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzag implements zzap {
    public final zzap a;
    public final String b;

    public zzag() {
        throw null;
    }

    public zzag(String s) {
        this.a = zzap.zzf;
        this.b = s;
    }

    public zzag(String s, zzap zzap0) {
        this.a = zzap0;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof zzag ? this.b.equals(((zzag)object0).b) && this.a.equals(((zzag)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode() * 0x1F;
    }

    public final zzap zzb() {
        return this.a;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbR(String s, zzg zzg0, List list0) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final String zzc() {
        return this.b;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        zzap zzap0 = this.a.zzd();
        return new zzag(this.b, zzap0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return null;
    }
}


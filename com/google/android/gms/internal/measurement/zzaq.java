package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzaq implements zzap {
    public final String a;
    public final ArrayList b;

    public zzaq(String s, List list0) {
        this.a = s;
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        arrayList0.addAll(list0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzaq)) {
            return false;
        }
        String s = this.a;
        if(s != null) {
            return s.equals(((zzaq)object0).a) ? this.b.equals(((zzaq)object0).b) : false;
        }
        return ((zzaq)object0).a == null ? this.b.equals(((zzaq)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? this.b.hashCode() : this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    public final String zzb() {
        return this.a;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbR(String s, zzg zzg0, List list0) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final ArrayList zzc() {
        return this.b;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return this;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return null;
    }
}


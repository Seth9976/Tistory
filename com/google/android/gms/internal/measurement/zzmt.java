package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzmt extends AbstractList implements zzku, RandomAccess {
    public final zzku a;

    public zzmt(zzku zzku0) {
        this.a = zzku0;
    }

    @Override
    public final Object get(int v) {
        return ((zzkt)this.a).zzg(v);
    }

    @Override
    public final Iterator iterator() {
        return new z1(this);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new y1(this, v);
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override  // com.google.android.gms.internal.measurement.zzku
    public final zzku zze() {
        return this;
    }

    @Override  // com.google.android.gms.internal.measurement.zzku
    public final Object zzf(int v) {
        return this.a.zzf(v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzku
    public final List zzh() {
        return this.a.zzh();
    }

    @Override  // com.google.android.gms.internal.measurement.zzku
    public final void zzi(zzje zzje0) {
        throw new UnsupportedOperationException();
    }
}


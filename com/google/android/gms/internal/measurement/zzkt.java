package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzkt extends k0 implements zzku, RandomAccess {
    public final ArrayList b;
    public static final zzku zza;

    static {
        zzkt zzkt0 = new zzkt(10);
        zzkt0.zzb();
        zzkt.zza = zzkt0;
    }

    public zzkt() {
        this(10);
    }

    public zzkt(int v) {
        ArrayList arrayList0 = new ArrayList(v);
        super();
        this.b = arrayList0;
    }

    public zzkt(ArrayList arrayList0) {
        this.b = arrayList0;
    }

    @Override
    public final void add(int v, Object object0) {
        this.zzbT();
        this.b.add(v, ((String)object0));
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.measurement.k0
    public final boolean addAll(int v, Collection collection0) {
        this.zzbT();
        if(collection0 instanceof zzku) {
            collection0 = ((zzku)collection0).zzh();
        }
        boolean z = this.b.addAll(v, collection0);
        ++this.modCount;
        return z;
    }

    @Override  // com.google.android.gms.internal.measurement.k0
    public final boolean addAll(Collection collection0) {
        return this.addAll(this.size(), collection0);
    }

    @Override  // com.google.android.gms.internal.measurement.k0
    public final void clear() {
        this.zzbT();
        this.b.clear();
        ++this.modCount;
    }

    @Override
    public final Object get(int v) {
        return this.zzg(v);
    }

    @Override  // com.google.android.gms.internal.measurement.k0
    public final Object remove(int v) {
        this.zzbT();
        Object object0 = this.b.remove(v);
        ++this.modCount;
        if(object0 instanceof String) {
            return (String)object0;
        }
        return object0 instanceof zzje ? ((zzje)object0).zzn(zzkn.a) : zzkn.zzg(((byte[])object0));
    }

    @Override
    public final Object set(int v, Object object0) {
        this.zzbT();
        Object object1 = this.b.set(v, ((String)object0));
        if(object1 instanceof String) {
            return (String)object1;
        }
        return object1 instanceof zzje ? ((zzje)object1).zzn(zzkn.a) : zzkn.zzg(((byte[])object1));
    }

    @Override
    public final int size() {
        return this.b.size();
    }

    @Override  // com.google.android.gms.internal.measurement.zzkm
    public final zzkm zzd(int v) {
        if(v < this.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList0 = new ArrayList(v);
        arrayList0.addAll(this.b);
        return new zzkt(arrayList0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzku
    public final zzku zze() {
        return this.zzc() ? new zzmt(this) : this;
    }

    @Override  // com.google.android.gms.internal.measurement.zzku
    public final Object zzf(int v) {
        return this.b.get(v);
    }

    public final String zzg(int v) {
        ArrayList arrayList0 = this.b;
        Object object0 = arrayList0.get(v);
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof zzje) {
            String s = ((zzje)object0).zzn(zzkn.a);
            if(((zzje)object0).zzi()) {
                arrayList0.set(v, s);
            }
            return s;
        }
        String s1 = zzkn.zzg(((byte[])object0));
        if(zzkn.zzh(((byte[])object0))) {
            arrayList0.set(v, s1);
        }
        return s1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzku
    public final List zzh() {
        return Collections.unmodifiableList(this.b);
    }

    @Override  // com.google.android.gms.internal.measurement.zzku
    public final void zzi(zzje zzje0) {
        this.zzbT();
        this.b.add(zzje0);
        ++this.modCount;
    }
}


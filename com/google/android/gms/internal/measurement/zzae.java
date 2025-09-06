package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.parser.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class zzae implements zzal, zzap, Iterable {
    public final TreeMap a;
    public final TreeMap b;

    public zzae() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }

    public zzae(List list0) {
        if(list0 != null) {
            for(int v = 0; v < list0.size(); ++v) {
                this.zzq(v, ((zzap)list0.get(v)));
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzae)) {
            return false;
        }
        if(this.zzc() != ((zzae)object0).zzc()) {
            return false;
        }
        TreeMap treeMap0 = this.a;
        if(treeMap0.isEmpty()) {
            return ((zzae)object0).a.isEmpty();
        }
        for(int v = (int)(((Integer)treeMap0.firstKey())); v <= ((int)(((Integer)treeMap0.lastKey()))); ++v) {
            if(!this.zze(v).equals(((zzae)object0).zze(v))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F;
    }

    @Override
    public final Iterator iterator() {
        return new a(this);
    }

    // 去混淆评级： 低(20)
    @Override
    public final String toString() {
        return "";
    }

    public final int zzb() {
        return this.a.size();
    }

    // 去混淆评级： 高(200)
    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbR(String s, zzg zzg0, List list0) {
        return "concat".equals(s) || "every".equals(s) || "filter".equals(s) || "forEach".equals(s) || "indexOf".equals(s) || "join".equals(s) || "lastIndexOf".equals(s) || "map".equals(s) || "pop".equals(s) || "push".equals(s) || "reduce".equals(s) || "reduceRight".equals(s) || "reverse".equals(s) || "shift".equals(s) || "slice".equals(s) || "some".equals(s) || "sort".equals(s) || "splice".equals(s) || "toString".equals(s) || "unshift".equals(s) ? zzbb.zza(s, this, zzg0, list0) : zzaj.zza(this, new zzat(s), zzg0, list0);
    }

    // 去混淆评级： 低(20)
    public final int zzc() {
        return this.a.isEmpty() ? 0 : ((int)(((Integer)this.a.lastKey()))) + 1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        zzap zzap0 = new zzae();
        for(Object object0: this.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = map$Entry0.getValue();
            TreeMap treeMap0 = zzap0.a;
            if(object1 instanceof zzal) {
                treeMap0.put(((Integer)map$Entry0.getKey()), ((zzap)map$Entry0.getValue()));
            }
            else {
                treeMap0.put(((Integer)map$Entry0.getKey()), ((zzap)map$Entry0.getValue()).zzd());
            }
        }
        return zzap0;
    }

    public final zzap zze(int v) {
        if(v >= this.zzc()) {
            throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
        }
        if(this.zzs(v)) {
            zzap zzap0 = (zzap)this.a.get(v);
            return zzap0 == null ? zzap.zzf : zzap0;
        }
        return zzap.zzf;
    }

    @Override  // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String s) {
        if("length".equals(s)) {
            return new zzah(((double)this.zzc()));
        }
        if(this.zzt(s)) {
            zzap zzap0 = (zzap)this.b.get(s);
            return zzap0 == null ? zzap.zzf : zzap0;
        }
        return zzap.zzf;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        TreeMap treeMap0 = this.a;
        if(treeMap0.size() == 1) {
            return this.zze(0).zzh();
        }
        return treeMap0.size() > 0 ? NaN : 0.0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return "";
    }

    public final String zzj(String s) [...] // 潜在的解密器

    public final Iterator zzk() {
        return this.a.keySet().iterator();
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new com.google.android.gms.internal.measurement.a(this.a.keySet().iterator(), this.b.keySet().iterator());
    }

    public final List zzm() {
        List list0 = new ArrayList(this.zzc());
        for(int v = 0; v < this.zzc(); ++v) {
            ((ArrayList)list0).add(this.zze(v));
        }
        return list0;
    }

    public final void zzn() {
        this.a.clear();
    }

    public final void zzo(int v, zzap zzap0) {
        if(v < 0) {
            throw new IllegalArgumentException("Invalid value index: " + v);
        }
        if(v >= this.zzc()) {
            this.zzq(v, zzap0);
            return;
        }
        TreeMap treeMap0 = this.a;
        for(int v1 = (int)(((Integer)treeMap0.lastKey())); v1 >= v; --v1) {
            Integer integer0 = v1;
            zzap zzap1 = (zzap)treeMap0.get(integer0);
            if(zzap1 != null) {
                this.zzq(v1 + 1, zzap1);
                treeMap0.remove(integer0);
            }
        }
        this.zzq(v, zzap0);
    }

    public final void zzp(int v) {
        TreeMap treeMap0 = this.a;
        int v1 = (int)(((Integer)treeMap0.lastKey()));
        if(v <= v1 && v >= 0) {
            treeMap0.remove(v);
            if(v == v1) {
                Integer integer0 = (int)(v - 1);
                if(!treeMap0.containsKey(integer0) && v - 1 >= 0) {
                    treeMap0.put(integer0, zzap.zzf);
                }
                return;
            }
            while(true) {
                ++v;
                if(v > ((int)(((Integer)treeMap0.lastKey())))) {
                    break;
                }
                Integer integer1 = v;
                zzap zzap0 = (zzap)treeMap0.get(integer1);
                if(zzap0 != null) {
                    treeMap0.put(((int)(v - 1)), zzap0);
                    treeMap0.remove(integer1);
                }
            }
        }
    }

    @RequiresNonNull({"elements"})
    public final void zzq(int v, zzap zzap0) {
        if(v > 0x7ED4) {
            throw new IllegalStateException("Array too large");
        }
        if(v < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + v);
        }
        TreeMap treeMap0 = this.a;
        if(zzap0 == null) {
            treeMap0.remove(v);
            return;
        }
        treeMap0.put(v, zzap0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String s, zzap zzap0) {
        TreeMap treeMap0 = this.b;
        if(zzap0 == null) {
            treeMap0.remove(s);
            return;
        }
        treeMap0.put(s, zzap0);
    }

    public final boolean zzs(int v) {
        if(v >= 0) {
            TreeMap treeMap0 = this.a;
            if(v <= ((int)(((Integer)treeMap0.lastKey())))) {
                return treeMap0.containsKey(v);
            }
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + v);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String s) {
        return "length".equals(s) || this.b.containsKey(s);
    }
}


package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzek;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zznz;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public final class t1 {
    public final String a;
    public final boolean b;
    public final zzgi c;
    public final BitSet d;
    public final BitSet e;
    public final ArrayMap f;
    public final ArrayMap g;
    public final b h;

    public t1(b b0, String s) {
        this.h = b0;
        this.a = s;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new ArrayMap();
        this.g = new ArrayMap();
    }

    public t1(b b0, String s, zzgi zzgi0, BitSet bitSet0, BitSet bitSet1, ArrayMap arrayMap0, ArrayMap arrayMap1) {
        this.h = b0;
        this.a = s;
        this.d = bitSet0;
        this.e = bitSet1;
        this.f = arrayMap0;
        this.g = new ArrayMap();
        for(Object object0: arrayMap1.keySet()) {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(((Long)arrayMap1.get(((Integer)object0))));
            this.g.put(((Integer)object0), arrayList0);
        }
        this.b = false;
        this.c = zzgi0;
    }

    public final zzfp a(int v) {
        List list0;
        Iterable iterable0;
        zzfo zzfo0 = zzfp.zzb();
        zzfo0.zza(v);
        zzfo0.zzc(this.b);
        zzgi zzgi0 = this.c;
        if(zzgi0 != null) {
            zzfo0.zzd(zzgi0);
        }
        zzgh zzgh0 = zzgi.zzf();
        zzgh0.zzb(zzkv.t(this.d));
        zzgh0.zzd(zzkv.t(this.e));
        ArrayMap arrayMap0 = this.f;
        if(arrayMap0 == null) {
            iterable0 = null;
        }
        else {
            ArrayList arrayList0 = new ArrayList(arrayMap0.size());
            for(Object object0: arrayMap0.keySet()) {
                int v1 = (int)(((Integer)object0));
                Long long0 = (Long)arrayMap0.get(((Integer)object0));
                if(long0 != null) {
                    zzfq zzfq0 = zzfr.zzc();
                    zzfq0.zzb(v1);
                    zzfq0.zza(((long)long0));
                    arrayList0.add(((zzfr)zzfq0.zzaC()));
                }
            }
            iterable0 = arrayList0;
        }
        if(iterable0 != null) {
            zzgh0.zza(iterable0);
        }
        ArrayMap arrayMap1 = this.g;
        if(arrayMap1 == null) {
            list0 = Collections.emptyList();
        }
        else {
            ArrayList arrayList1 = new ArrayList(arrayMap1.size());
            for(Object object1: arrayMap1.keySet()) {
                zzgj zzgj0 = zzgk.zzd();
                zzgj0.zzb(((int)(((Integer)object1))));
                List list1 = (List)arrayMap1.get(((Integer)object1));
                if(list1 != null) {
                    Collections.sort(list1);
                    zzgj0.zza(list1);
                }
                arrayList1.add(((zzgk)zzgj0.zzaC()));
            }
            list0 = arrayList1;
        }
        zzgh0.zzc(list0);
        zzfo0.zzb(zzgh0);
        return (zzfp)zzfo0.zzaC();
    }

    public final void b(v1 v10) {
        int v = v10.g == 0 ? ((zzek)v10.i).zzb() : ((zzet)v10.i).zza();
        Boolean boolean0 = v10.c;
        if(boolean0 != null) {
            this.e.set(v, boolean0.booleanValue());
        }
        Boolean boolean1 = v10.d;
        if(boolean1 != null) {
            this.d.set(v, boolean1.booleanValue());
        }
        if(v10.e != null) {
            Integer integer0 = v;
            ArrayMap arrayMap0 = this.f;
            Long long0 = (Long)arrayMap0.get(integer0);
            long v1 = (long)v10.e;
            if(long0 == null || v1 / 1000L > ((long)long0)) {
                arrayMap0.put(integer0, ((long)(v1 / 1000L)));
            }
        }
        if(v10.f != null) {
            ArrayMap arrayMap1 = this.g;
            Integer integer1 = v;
            List list0 = (List)arrayMap1.get(integer1);
            if(list0 == null) {
                list0 = new ArrayList();
                arrayMap1.put(integer1, list0);
            }
            if(v10.g != 0) {
                list0.clear();
            }
            zznz.zzc();
            b b0 = this.h;
            zzdt zzdt0 = zzdu.zzW;
            String s = this.a;
            if(b0.zzt.zzf().zzs(s, zzdt0) && (v10.g == 0 ? ((zzek)v10.i).zzo() : false)) {
                list0.clear();
            }
            zznz.zzc();
            if(b0.zzt.zzf().zzs(s, zzdt0)) {
                Long long1 = (long)(((long)v10.f) / 1000L);
                if(!list0.contains(long1)) {
                    list0.add(long1);
                }
            }
            else {
                list0.add(((long)(((long)v10.f) / 1000L)));
            }
        }
    }
}


package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class b1 extends d1 {
    public static final Class c;

    static {
        b1.c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }

    @Override  // com.google.android.gms.internal.measurement.d1
    public final void a(Object object0, long v) {
        List list1;
        List list0 = (List)d2.c.m(object0, v);
        if(list0 instanceof zzku) {
            list1 = ((zzku)list0).zze();
        }
        else {
            Class class0 = list0.getClass();
            if(b1.c.isAssignableFrom(class0)) {
                return;
            }
            if(list0 instanceof zzlt && list0 instanceof zzkm) {
                if(((zzkm)list0).zzc()) {
                    ((zzkm)list0).zzb();
                }
                return;
            }
            list1 = Collections.unmodifiableList(list0);
        }
        d2.o(v, object0, list1);
    }

    @Override  // com.google.android.gms.internal.measurement.d1
    public final void b(long v, Object object0, Object object1) {
        ArrayList arrayList0;
        List list0 = (List)d2.c.m(object1, v);
        int v1 = list0.size();
        List list1 = (List)d2.c.m(object0, v);
        if(list1.isEmpty()) {
            if(list1 instanceof zzku) {
                list1 = new zzkt(v1);
            }
            else if(!(list1 instanceof zzlt) || !(list1 instanceof zzkm)) {
                list1 = new ArrayList(v1);
            }
            else {
                list1 = ((zzkm)list1).zzd(v1);
            }
            d2.o(v, object0, list1);
        }
        else {
            Class class0 = list1.getClass();
            if(b1.c.isAssignableFrom(class0)) {
                arrayList0 = new ArrayList(list1.size() + v1);
                arrayList0.addAll(list1);
                d2.o(v, object0, arrayList0);
                list1 = arrayList0;
            }
            else if(list1 instanceof zzmt) {
                arrayList0 = new zzkt(list1.size() + v1);
                ((zzkt)arrayList0).addAll(((zzkt)arrayList0).size(), ((zzmt)list1));
                d2.o(v, object0, arrayList0);
                list1 = arrayList0;
            }
            else if(list1 instanceof zzlt && list1 instanceof zzkm && !((zzkm)list1).zzc()) {
                list1 = ((zzkm)list1).zzd(list1.size() + v1);
                d2.o(v, object0, list1);
            }
        }
        int v2 = list1.size();
        if(v2 > 0 && list0.size() > 0) {
            list1.addAll(list0);
        }
        if(v2 > 0) {
            list0 = list1;
        }
        d2.o(v, object0, list0);
    }
}


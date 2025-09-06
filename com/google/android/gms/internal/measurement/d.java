package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public final class d implements Comparator {
    public final zzai a;
    public final zzg b;

    public d(zzai zzai0, zzg zzg0) {
        this.a = zzai0;
        this.b = zzg0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        if(((zzap)object0) instanceof zzau) {
            return ((zzap)object1) instanceof zzau ? 0 : 1;
        }
        if(((zzap)object1) instanceof zzau) {
            return -1;
        }
        zzai zzai0 = this.a;
        if(zzai0 == null) {
            return ((zzap)object0).zzi().compareTo(((zzap)object1).zzi());
        }
        List list0 = Arrays.asList(new zzap[]{((zzap)object0), ((zzap)object1)});
        return (int)zzh.zza(((double)zzai0.zza(this.b, list0).zzh()));
    }
}


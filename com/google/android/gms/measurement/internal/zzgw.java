package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;

public final class zzgw implements Runnable {
    public final zzhx zza;
    public final Bundle zzb;

    public zzgw(zzhx zzhx0, Bundle bundle0) {
        this.zza = zzhx0;
        this.zzb = bundle0;
    }

    @Override
    public final void run() {
        r r0;
        zzhx zzhx0 = this.zza;
        Bundle bundle0 = this.zzb;
        if(bundle0 == null) {
            o o0 = zzhx0.zzt.zzm();
            Bundle bundle1 = new Bundle();
            o0.v.zzb(bundle1);
            return;
        }
        Bundle bundle2 = zzhx0.zzt.zzm().v.zza();
        Iterator iterator0 = bundle0.keySet().iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            r0 = zzhx0.m;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            String s = (String)object0;
            Object object1 = bundle0.get(s);
            if(object1 != null && !(object1 instanceof String) && !(object1 instanceof Long) && !(object1 instanceof Double)) {
                zzhx0.zzt.zzv().getClass();
                if(zzlb.t(object1)) {
                    zzhx0.zzt.zzv().getClass();
                    zzlb.i(r0, null, 27, null, null, 0);
                }
                zzhx0.zzt.zzay().zzl().zzc("Invalid default event parameter type. Name, value", s, object1);
            }
            else if(zzlb.v(s)) {
                zzhx0.zzt.zzay().zzl().zzb("Invalid default event parameter name. Name", s);
            }
            else if(object1 == null) {
                bundle2.remove(s);
            }
            else if(zzhx0.zzt.zzv().p("param", s, 100, object1)) {
                zzhx0.zzt.zzv().j(bundle2, s, object1);
            }
        }
        zzhx0.zzt.zzv();
        int v = zzhx0.zzt.zzf().zzc();
        if(bundle2.size() > v) {
            int v1 = 0;
            for(Object object2: new TreeSet(bundle2.keySet())) {
                String s1 = (String)object2;
                ++v1;
                if(v1 > v) {
                    bundle2.remove(s1);
                }
            }
            zzhx0.zzt.zzv().getClass();
            zzlb.i(r0, null, 26, null, null, 0);
            zzhx0.zzt.zzay().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        zzhx0.zzt.zzm().v.zzb(bundle2);
        zzhx0.zzt.zzt().zzH(bundle2);
    }
}


package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

public final class h1 {
    public static final void a(Object object0, Object object1) {
        zzlf zzlf0 = (zzlf)object1;
        if(!((zzlg)object0).isEmpty()) {
            Iterator iterator0 = ((zzlg)object0).entrySet().iterator();
            if(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                ((Map.Entry)object2).getKey();
                ((Map.Entry)object2).getValue();
                throw null;
            }
        }
    }

    public static final zzlg b(Object object0, Object object1) {
        zzlg zzlg0 = (zzlg)object0;
        if(!((zzlg)object1).isEmpty()) {
            if(!zzlg0.zze()) {
                zzlg0 = zzlg0.zzb();
            }
            zzlg0.zzd(((zzlg)object1));
        }
        return zzlg0;
    }
}


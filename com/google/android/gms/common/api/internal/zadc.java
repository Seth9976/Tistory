package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class zadc {
    public final Set a;
    public final h0 b;
    public static final Status zaa;

    static {
        zadc.zaa = new Status(8, "The connection to Google Play services was lost");
    }

    public zadc() {
        this.a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.b = new h0(this);
    }

    public final void zab() {
        Set set0 = this.a;
        BasePendingResult[] arr_basePendingResult = (BasePendingResult[])set0.toArray(new BasePendingResult[0]);
        for(int v = 0; v < arr_basePendingResult.length; ++v) {
            BasePendingResult basePendingResult0 = arr_basePendingResult[v];
            basePendingResult0.zan(null);
            if(basePendingResult0.zam()) {
                set0.remove(basePendingResult0);
            }
        }
    }
}


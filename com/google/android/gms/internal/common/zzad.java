package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j7.a;
import java.util.Iterator;

public final class zzad extends a {
    @CanIgnoreReturnValue
    public final zzad zzb(Object object0) {
        this.zza(object0);
        return this;
    }

    @CanIgnoreReturnValue
    public final zzad zzc(Iterator iterator0) {
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            this.zza(object0);
        }
        return this;
    }
}


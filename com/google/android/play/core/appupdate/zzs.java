package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.internal.zzaf;
import i8.h;
import i8.i;

public final class zzs implements zzaf {
    public final zzaf a;
    public final zzaf b;

    public zzs(zzaf zzaf0, zzaf zzaf1) {
        this.a = zzaf0;
        this.b = zzaf1;
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzaf
    public final Object zza() {
        return new h(((zzk)this.a).zzb(), ((i)this.b.zza()));
    }
}


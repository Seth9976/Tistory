package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.internal.zzaf;
import i8.b;
import i8.h;

public final class zzh implements zzaf {
    public final zzaf a;
    public final zzaf b;
    public final zzaf c;

    public zzh(zzaf zzaf0, zzaf zzaf1, zzaf zzaf2) {
        this.a = zzaf0;
        this.b = zzaf1;
        this.c = zzaf2;
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzaf
    public final Object zza() {
        return new b(((h)this.a.zza()), ((zzc)this.b.zza()), ((zzk)this.c).zzb());
    }
}


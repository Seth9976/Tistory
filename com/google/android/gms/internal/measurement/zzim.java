package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public final class zzim {
    public static zzii zza(zzii zzii0) {
        if(!(zzii0 instanceof i0) && !(zzii0 instanceof h0)) {
            if(zzii0 instanceof Serializable) {
                return new h0(zzii0);
            }
            zzii zzii1 = new i0();  // 初始化器: Ljava/lang/Object;-><init>()V
            zzii0.getClass();
            zzii1.a = zzii0;
            return zzii1;
        }
        return zzii0;
    }

    public static zzii zzb(Object object0) {
        return new j0(object0);
    }
}


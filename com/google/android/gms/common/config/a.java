package com.google.android.gms.common.config;

import com.google.android.gms.common.internal.Preconditions;

public final class a extends GservicesValue {
    public final int c;

    public a(Object object0, int v, String s) {
        this.c = v;
        super(s, object0);
    }

    @Override  // com.google.android.gms.common.config.GservicesValue
    public final Object zza(String s) {
        switch(this.c) {
            case 0: {
                Preconditions.checkNotNull(null);
                Boolean boolean0 = (Boolean)this.zzb;
                throw null;
            }
            case 1: {
                Preconditions.checkNotNull(null);
                Long long0 = (Long)this.zzb;
                throw null;
            }
            case 2: {
                Preconditions.checkNotNull(null);
                Integer integer0 = (Integer)this.zzb;
                throw null;
            }
            case 3: {
                Preconditions.checkNotNull(null);
                Float float0 = (Float)this.zzb;
                throw null;
            }
            default: {
                Preconditions.checkNotNull(null);
                String s1 = (String)this.zzb;
                throw null;
            }
        }
    }
}


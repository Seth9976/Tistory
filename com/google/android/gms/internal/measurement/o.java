package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class o extends v {
    public final int e;
    public final String f;
    public final String g;
    public final boolean h;
    public final zzef i;
    public final Object j;

    public o(zzef zzef0, String s, String s1, Object object0, boolean z) {
        this.e = 1;
        this.i = zzef0;
        this.f = s;
        this.g = s1;
        this.j = object0;
        this.h = z;
        super(zzef0, true);
    }

    public o(zzef zzef0, String s, String s1, boolean z, zzbz zzbz0) {
        this.e = 0;
        this.i = zzef0;
        this.f = s;
        this.g = s1;
        this.h = z;
        this.j = zzbz0;
        super(zzef0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public final void a() {
        if(this.e != 0) {
            Object object0 = Preconditions.checkNotNull(this.i.g);
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.j);
            ((zzcc)object0).setUserProperty(this.f, this.g, iObjectWrapper0, this.h, this.a);
            return;
        }
        ((zzcc)Preconditions.checkNotNull(this.i.g)).getUserProperties(this.f, this.g, this.h, ((zzbz)this.j));
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public void b() {
        if(this.e != 0) {
            return;
        }
        ((zzbz)this.j).zze(null);
    }
}


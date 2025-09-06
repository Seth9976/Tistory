package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class h extends v {
    public final int e;
    public final String f;
    public final String g;
    public final zzef h;
    public final Object i;

    public h(zzef zzef0, Activity activity0, String s, String s1) {
        this.e = 2;
        this.h = zzef0;
        this.i = activity0;
        this.f = s;
        this.g = s1;
        super(zzef0, true);
    }

    public h(zzef zzef0, String s, String s1, Object object0, int v) {
        this.e = v;
        this.h = zzef0;
        this.f = s;
        this.g = s1;
        this.i = object0;
        super(zzef0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public final void a() {
        switch(this.e) {
            case 0: {
                ((zzcc)Preconditions.checkNotNull(this.h.g)).clearConditionalUserProperty(this.f, this.g, ((Bundle)this.i));
                return;
            }
            case 1: {
                ((zzcc)Preconditions.checkNotNull(this.h.g)).getConditionalUserProperties(this.f, this.g, ((zzbz)this.i));
                return;
            }
            default: {
                ((zzcc)Preconditions.checkNotNull(this.h.g)).setCurrentScreen(ObjectWrapper.wrap(((Activity)this.i)), this.f, this.g, this.a);
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public void b() {
        if(this.e != 1) {
            return;
        }
        ((zzbz)this.i).zze(null);
    }
}


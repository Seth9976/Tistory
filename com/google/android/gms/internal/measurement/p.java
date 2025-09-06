package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class p extends v {
    public final int e;
    public final Object f;
    public final Object g;
    public final Object h;

    public p(z z0, Activity activity0, zzbz zzbz0) {
        this.e = 4;
        this.f = z0;
        this.g = activity0;
        this.h = zzbz0;
        super(z0.a, true);
    }

    public p(z z0, Bundle bundle0, Activity activity0) {
        this.e = 3;
        this.f = z0;
        this.g = bundle0;
        this.h = activity0;
        super(z0.a, true);
    }

    public p(zzef zzef0, Object object0, zzbz zzbz0, int v) {
        this.e = v;
        this.f = zzef0;
        this.g = object0;
        this.h = zzbz0;
        super(zzef0, true);
    }

    public p(zzef zzef0, String s, Object object0) {
        this.e = 0;
        this.f = zzef0;
        this.g = s;
        this.h = object0;
        super(zzef0, false);
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public final void a() {
        Bundle bundle0;
        switch(this.e) {
            case 0: {
                Object object0 = Preconditions.checkNotNull(((zzef)this.f).g);
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.h);
                IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(null);
                IObjectWrapper iObjectWrapper2 = ObjectWrapper.wrap(null);
                ((zzcc)object0).logHealthData(5, ((String)this.g), iObjectWrapper0, iObjectWrapper1, iObjectWrapper2);
                return;
            }
            case 1: {
                ((zzcc)Preconditions.checkNotNull(((zzef)this.f).g)).performAction(((Bundle)this.g), ((zzbz)this.h), this.a);
                return;
            }
            case 2: {
                ((zzcc)Preconditions.checkNotNull(((zzef)this.f).g)).getMaxUserProperties(((String)this.g), ((zzbz)this.h));
                return;
            }
            case 3: {
                if(((Bundle)this.g) == null) {
                    bundle0 = null;
                }
                else {
                    bundle0 = new Bundle();
                    if(((Bundle)this.g).containsKey("com.google.app_measurement.screen_service")) {
                        Object object1 = ((Bundle)this.g).get("com.google.app_measurement.screen_service");
                        if(object1 instanceof Bundle) {
                            bundle0.putBundle("com.google.app_measurement.screen_service", ((Bundle)object1));
                        }
                    }
                }
                ((zzcc)Preconditions.checkNotNull(((z)this.f).a.g)).onActivityCreated(ObjectWrapper.wrap(((Activity)this.h)), bundle0, this.b);
                return;
            }
            default: {
                ((zzcc)Preconditions.checkNotNull(((z)this.f).a.g)).onActivitySaveInstanceState(ObjectWrapper.wrap(((Activity)this.g)), ((zzbz)this.h), this.b);
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public void b() {
        switch(this.e) {
            case 1: {
                ((zzbz)this.h).zze(null);
                return;
            }
            case 2: {
                ((zzbz)this.h).zze(null);
            }
        }
    }
}


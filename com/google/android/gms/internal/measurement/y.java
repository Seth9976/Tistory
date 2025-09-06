package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class y extends v {
    public final int e;
    public final Activity f;
    public final z g;

    public y(z z0, Activity activity0, int v) {
        this.e = v;
        switch(v) {
            case 1: {
                this.g = z0;
                this.f = activity0;
                super(z0.a, true);
                return;
            }
            case 2: {
                this.g = z0;
                this.f = activity0;
                super(z0.a, true);
                return;
            }
            case 3: {
                this.g = z0;
                this.f = activity0;
                super(z0.a, true);
                return;
            }
            case 4: {
                this.g = z0;
                this.f = activity0;
                super(z0.a, true);
                return;
            }
            default: {
                this.g = z0;
                this.f = activity0;
                super(z0.a, true);
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public final void a() {
        switch(this.e) {
            case 0: {
                ((zzcc)Preconditions.checkNotNull(this.g.a.g)).onActivityStarted(ObjectWrapper.wrap(this.f), this.b);
                return;
            }
            case 1: {
                ((zzcc)Preconditions.checkNotNull(this.g.a.g)).onActivityResumed(ObjectWrapper.wrap(this.f), this.b);
                return;
            }
            case 2: {
                ((zzcc)Preconditions.checkNotNull(this.g.a.g)).onActivityPaused(ObjectWrapper.wrap(this.f), this.b);
                return;
            }
            case 3: {
                ((zzcc)Preconditions.checkNotNull(this.g.a.g)).onActivityStopped(ObjectWrapper.wrap(this.f), this.b);
                return;
            }
            default: {
                ((zzcc)Preconditions.checkNotNull(this.g.a.g)).onActivityDestroyed(ObjectWrapper.wrap(this.f), this.b);
            }
        }
    }
}


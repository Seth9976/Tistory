package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

public final class n extends v {
    public final int e;
    public final zzbz f;
    public final zzef g;

    public n(zzef zzef0, zzbz zzbz0, int v) {
        this.e = v;
        this.g = zzef0;
        this.f = zzbz0;
        super(zzef0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public final void a() {
        switch(this.e) {
            case 0: {
                ((zzcc)Preconditions.checkNotNull(this.g.g)).getGmpAppId(this.f);
                return;
            }
            case 1: {
                ((zzcc)Preconditions.checkNotNull(this.g.g)).getCachedAppInstanceId(this.f);
                return;
            }
            case 2: {
                ((zzcc)Preconditions.checkNotNull(this.g.g)).generateEventId(this.f);
                return;
            }
            case 3: {
                ((zzcc)Preconditions.checkNotNull(this.g.g)).getCurrentScreenName(this.f);
                return;
            }
            case 4: {
                ((zzcc)Preconditions.checkNotNull(this.g.g)).getCurrentScreenClass(this.f);
                return;
            }
            case 5: {
                ((zzcc)Preconditions.checkNotNull(this.g.g)).getAppInstanceId(this.f);
                return;
            }
            default: {
                ((zzcc)Preconditions.checkNotNull(this.g.g)).getSessionId(this.f);
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public final void b() {
        switch(this.e) {
            case 0: {
                this.f.zze(null);
                return;
            }
            case 1: {
                this.f.zze(null);
                return;
            }
            case 2: {
                this.f.zze(null);
                return;
            }
            case 3: {
                this.f.zze(null);
                return;
            }
            case 4: {
                this.f.zze(null);
                return;
            }
            case 5: {
                this.f.zze(null);
                return;
            }
            default: {
                this.f.zze(null);
            }
        }
    }
}


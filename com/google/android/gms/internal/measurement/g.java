package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

public final class g extends v {
    public final int e;
    public final Bundle f;
    public final zzef g;

    public g(zzef zzef0, Bundle bundle0, int v) {
        this.e = v;
        this.g = zzef0;
        this.f = bundle0;
        super(zzef0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public final void a() {
        switch(this.e) {
            case 0: {
                ((zzcc)Preconditions.checkNotNull(this.g.g)).setConditionalUserProperty(this.f, this.a);
                return;
            }
            case 1: {
                ((zzcc)Preconditions.checkNotNull(this.g.g)).setConsent(this.f, this.a);
                return;
            }
            case 2: {
                ((zzcc)Preconditions.checkNotNull(this.g.g)).setConsentThirdParty(this.f, this.a);
                return;
            }
            default: {
                ((zzcc)Preconditions.checkNotNull(this.g.g)).setDefaultEventParameters(this.f);
            }
        }
    }
}


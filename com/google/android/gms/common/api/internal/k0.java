package com.google.android.gms.common.api.internal;

import android.app.Dialog;

public final class k0 extends zabw {
    public final Dialog a;
    public final l0 b;

    public k0(l0 l00, Dialog dialog0) {
        this.b = l00;
        this.a = dialog0;
        super();
    }

    @Override  // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        ((zap)this.b.c).zab.set(null);
        ((zap)this.b.c).zac();
        Dialog dialog0 = this.a;
        if(dialog0.isShowing()) {
            dialog0.dismiss();
        }
    }
}


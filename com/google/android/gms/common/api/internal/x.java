package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks;

public final class x implements SignOutCallbacks {
    public final zabq a;

    public x(zabq zabq0) {
        this.a = zabq0;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks
    public final void onSignOutComplete() {
        w w0 = new w(this);
        this.a.m.n.post(w0);
    }
}


package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;

public final class j extends u {
    public final ConnectionProgressReportCallbacks b;

    public j(zabf zabf0, ConnectionProgressReportCallbacks baseGmsClient$ConnectionProgressReportCallbacks0) {
        this.b = baseGmsClient$ConnectionProgressReportCallbacks0;
        super(zabf0);
    }

    @Override  // com.google.android.gms.common.api.internal.u
    public final void a() {
        ConnectionResult connectionResult0 = new ConnectionResult(16, null);
        this.b.onReportServiceBinding(connectionResult0);
    }
}


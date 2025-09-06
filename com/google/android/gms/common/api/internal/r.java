package com.google.android.gms.common.api.internal;

import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

public final class r implements ResultCallback {
    public final StatusPendingResult a;
    public final boolean b;
    public final GoogleApiClient c;
    public final zabe d;

    public r(zabe zabe0, StatusPendingResult statusPendingResult0, boolean z, GoogleApiClient googleApiClient0) {
        this.d = zabe0;
        this.a = statusPendingResult0;
        this.b = z;
        this.c = googleApiClient0;
    }

    @Override  // com.google.android.gms.common.api.ResultCallback
    public final void onResult(Result result0) {
        zabe zabe0 = this.d;
        Storage.getInstance(zabe0.f).zac();
        if(((Status)result0).isSuccess() && zabe0.isConnected()) {
            zabe0.disconnect();
            zabe0.connect();
        }
        this.a.setResult(((Status)result0));
        if(this.b) {
            this.c.disconnect();
        }
    }
}


package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

public final class a0 implements zacs, ConnectionProgressReportCallbacks {
    public final Client a;
    public final ApiKey b;
    public IAccountAccessor c;
    public Set d;
    public boolean e;
    public final GoogleApiManager f;

    public a0(GoogleApiManager googleApiManager0, Client api$Client0, ApiKey apiKey0) {
        this.f = googleApiManager0;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = api$Client0;
        this.b = apiKey0;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(ConnectionResult connectionResult0) {
        z z0 = new z(this, connectionResult0);
        this.f.n.post(z0);
    }

    @Override  // com.google.android.gms.common.api.internal.zacs
    public final void zae(ConnectionResult connectionResult0) {
        zabq zabq0 = (zabq)this.f.j.get(this.b);
        if(zabq0 != null) {
            zabq0.zas(connectionResult0);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zacs
    public final void zaf(IAccountAccessor iAccountAccessor0, Set set0) {
        if(iAccountAccessor0 != null && set0 != null) {
            this.c = iAccountAccessor0;
            this.d = set0;
            if(this.e) {
                this.a.getRemoteService(iAccountAccessor0, set0);
            }
            return;
        }
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
        this.zae(new ConnectionResult(4));
    }
}


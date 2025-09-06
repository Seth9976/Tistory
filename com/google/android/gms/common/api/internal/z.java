package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.internal.IAccountAccessor;

public final class z implements Runnable {
    public final ConnectionResult a;
    public final a0 b;

    public z(a0 a00, ConnectionResult connectionResult0) {
        this.b = a00;
        this.a = connectionResult0;
    }

    @Override
    public final void run() {
        a0 a00 = this.b;
        zabq zabq0 = (zabq)a00.f.j.get(a00.b);
        if(zabq0 == null) {
            return;
        }
        ConnectionResult connectionResult0 = this.a;
        if(connectionResult0.isSuccess()) {
            a00.e = true;
            Client api$Client0 = a00.a;
            if(api$Client0.requiresSignIn()) {
                if(a00.e) {
                    IAccountAccessor iAccountAccessor0 = a00.c;
                    if(iAccountAccessor0 != null) {
                        api$Client0.getRemoteService(iAccountAccessor0, a00.d);
                    }
                }
                return;
            }
            try {
                api$Client0.getRemoteService(null, api$Client0.getScopesForConnectionlessNonSignIn());
            }
            catch(SecurityException securityException0) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", securityException0);
                api$Client0.disconnect("Failed to get service from broker.");
                zabq0.zar(new ConnectionResult(10), null);
            }
            return;
        }
        zabq0.zar(connectionResult0, null);
    }
}


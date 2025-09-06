package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

public final class i extends u {
    public final int b;
    public final Object c;
    public final Object d;

    public i(k k0, zabf zabf0, ConnectionResult connectionResult0) {
        this.b = 0;
        this.d = k0;
        this.c = connectionResult0;
        super(zabf0);
    }

    public i(zaaw zaaw0, zaaw zaaw1, zak zak0) {
        this.b = 1;
        this.c = zaaw1;
        this.d = zak0;
        super(zaaw0);
    }

    @Override  // com.google.android.gms.common.api.internal.u
    public final void a() {
        if(this.b != 0) {
            zaaw zaaw0 = (zaaw)this.c;
            if(zaaw0.g(0)) {
                zak zak0 = (zak)this.d;
                ConnectionResult connectionResult0 = zak0.zaa();
                if(connectionResult0.isSuccess()) {
                    zav zav0 = (zav)Preconditions.checkNotNull(zak0.zab());
                    ConnectionResult connectionResult1 = zav0.zaa();
                    if(!connectionResult1.isSuccess()) {
                        Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: " + connectionResult1, new Exception());
                        zaaw0.d(connectionResult1);
                        return;
                    }
                    zaaw0.n = true;
                    zaaw0.o = (IAccountAccessor)Preconditions.checkNotNull(zav0.zab());
                    zaaw0.p = zav0.zac();
                    zaaw0.q = zav0.zad();
                    zaaw0.f();
                    return;
                }
                if(zaaw0.l && !connectionResult0.hasResolution()) {
                    zaaw0.a();
                    zaaw0.f();
                    return;
                }
                zaaw0.d(connectionResult0);
            }
            return;
        }
        ((k)this.d).c.d(((ConnectionResult)this.c));
    }
}


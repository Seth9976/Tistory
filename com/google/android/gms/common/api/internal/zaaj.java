package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;

public final class zaaj implements zabf {
    public final zabi a;
    public boolean b;

    public zaaj(zabi zabi0) {
        this.b = false;
        this.a = zabi0;
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final ApiMethodImpl zaa(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        this.zab(baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final ApiMethodImpl zab(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        zabi zabi0;
        try {
            zabi0 = this.a;
            zabi0.n.x.a.add(baseImplementation$ApiMethodImpl0);
            baseImplementation$ApiMethodImpl0.zan(zabi0.n.x.b);
            Client api$Client0 = (Client)zabi0.n.o.get(baseImplementation$ApiMethodImpl0.getClientKey());
            Preconditions.checkNotNull(api$Client0, "Appropriate Api was not requested.");
            if(!api$Client0.isConnected() && zabi0.g.containsKey(baseImplementation$ApiMethodImpl0.getClientKey())) {
                baseImplementation$ApiMethodImpl0.setFailedResult(new Status(17));
                return baseImplementation$ApiMethodImpl0;
            }
            baseImplementation$ApiMethodImpl0.run(api$Client0);
        }
        catch(DeadObjectException unused_ex) {
            f f0 = new f(this, this);
            Message message0 = zabi0.e.obtainMessage(1, f0);
            zabi0.e.sendMessage(message0);
        }
        return baseImplementation$ApiMethodImpl0;
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
        if(this.b) {
            this.b = false;
            g g0 = new g(this, this);
            Message message0 = this.a.e.obtainMessage(1, g0);
            this.a.e.sendMessage(message0);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final void zag(@Nullable Bundle bundle0) {
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final void zah(ConnectionResult connectionResult0, Api api0, boolean z) {
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final void zai(int v) {
        this.a.a(null);
        this.a.o.zac(v, this.b);
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        if(this.b) {
            return false;
        }
        HashSet hashSet0 = this.a.n.w;
        if(hashSet0 != null && !hashSet0.isEmpty()) {
            this.b = true;
            for(Object object0: hashSet0) {
                ((zada)object0).c = null;
            }
            return false;
        }
        this.a.a(null);
        return true;
    }
}


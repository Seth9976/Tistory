package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api;
import java.util.Collections;

public final class zaax implements zabf {
    public final zabi a;

    public zaax(zabi zabi0) {
        this.a = zabi0;
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final ApiMethodImpl zaa(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        this.a.n.h.add(baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final ApiMethodImpl zab(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
        zabi zabi0 = this.a;
        for(Object object0: zabi0.f.values()) {
            ((Client)object0).disconnect();
        }
        zabi0.n.p = Collections.emptySet();
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
        this.a.a.lock();
        try {
            this.a.k = new zaaw(this.a, this.a.h, this.a.i, this.a.d, this.a.j, this.a.a, this.a.c);
            this.a.k.zad();
            this.a.b.signalAll();
        }
        finally {
            this.a.a.unlock();
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
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        return true;
    }
}


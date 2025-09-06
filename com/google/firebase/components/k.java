package com.google.firebase.components;

import androidx.compose.ui.text.n0;
import com.google.firebase.inject.Deferred.DeferredHandler;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

public final class k implements Deferred, Provider {
    public DeferredHandler a;
    public volatile Provider b;
    public static final n0 c;
    public static final d d;

    static {
        k.c = new n0(15);
        k.d = new d(1);
    }

    public k(n0 n00, Provider provider0) {
        this.a = n00;
        this.b = provider0;
    }

    @Override  // com.google.firebase.inject.Provider
    public final Object get() {
        return this.b.get();
    }

    @Override  // com.google.firebase.inject.Deferred
    public final void whenAvailable(DeferredHandler deferred$DeferredHandler0) {
        Provider provider1;
        Provider provider2;
        Provider provider0 = this.b;
        d d0 = k.d;
        if(provider0 != d0) {
            deferred$DeferredHandler0.handle(provider0);
            return;
        }
        synchronized(this) {
            provider1 = this.b;
            if(provider1 == d0) {
                this.a = new j(0, this.a, deferred$DeferredHandler0);
                provider2 = null;
            }
            else {
                provider2 = provider1;
            }
        }
        if(provider2 != null) {
            deferred$DeferredHandler0.handle(provider1);
        }
    }
}


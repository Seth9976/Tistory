package com.google.android.datatransport.runtime.dagger.internal;

import javax.inject.Provider;

public final class DelegateFactory implements Factory {
    public Provider a;

    @Override  // javax.inject.Provider
    public Object get() {
        Provider provider0 = this.a;
        if(provider0 == null) {
            throw new IllegalStateException();
        }
        return provider0.get();
    }

    public static void setDelegate(Provider provider0, Provider provider1) {
        Preconditions.checkNotNull(provider1);
        if(((DelegateFactory)provider0).a != null) {
            throw new IllegalStateException();
        }
        ((DelegateFactory)provider0).a = provider1;
    }

    @Deprecated
    public void setDelegatedProvider(Provider provider0) {
        DelegateFactory.setDelegate(this, provider0);
    }
}


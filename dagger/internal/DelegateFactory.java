package dagger.internal;

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
    public static void setDelegate(javax.inject.Provider provider0, javax.inject.Provider provider1) {
        Provider provider2 = Providers.asDaggerProvider(provider1);
        Preconditions.checkNotNull(provider2);
        if(((DelegateFactory)provider0).a != null) {
            throw new IllegalStateException();
        }
        ((DelegateFactory)provider0).a = provider2;
    }

    @Deprecated
    public void setDelegatedProvider(Provider provider0) {
        DelegateFactory.setDelegate(this, provider0);
    }

    @Deprecated
    public void setDelegatedProvider(javax.inject.Provider provider0) {
        this.setDelegatedProvider(Providers.asDaggerProvider(provider0));
    }
}


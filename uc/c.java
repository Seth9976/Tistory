package uc;

import dagger.internal.Provider;

public final class c implements Provider {
    public final javax.inject.Provider a;

    public c(javax.inject.Provider provider0) {
        this.a = provider0;
    }

    @Override  // javax.inject.Provider
    public final Object get() {
        return this.a.get();
    }
}


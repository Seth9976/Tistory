package dagger.internal;

import uc.c;

public final class Providers {
    public static Provider asDaggerProvider(javax.inject.Provider provider0) {
        Preconditions.checkNotNull(provider0);
        return new c(provider0);
    }
}


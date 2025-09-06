package uc;

import dagger.MembersInjector;
import dagger.internal.Preconditions;

public enum b implements MembersInjector {
    INSTANCE;

    @Override  // dagger.MembersInjector
    public final void injectMembers(Object object0) {
        Preconditions.checkNotNull(object0, "Cannot inject members into a null reference");
    }
}


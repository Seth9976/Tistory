package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

public final class EventStoreModule_StoreConfigFactory implements Factory {
    public static EventStoreModule_StoreConfigFactory create() {
        return f.a;
    }

    public c get() {
        return EventStoreModule_StoreConfigFactory.storeConfig();
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static c storeConfig() {
        return (c)Preconditions.checkNotNull(c.a, "Cannot return null from a non-@Nullable @Provides method");
    }
}


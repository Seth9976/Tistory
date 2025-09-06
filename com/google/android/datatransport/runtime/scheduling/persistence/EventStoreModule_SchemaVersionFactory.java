package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;

public final class EventStoreModule_SchemaVersionFactory implements Factory {
    public static EventStoreModule_SchemaVersionFactory create() {
        return e.a;
    }

    // 去混淆评级： 低(20)
    public Integer get() {
        return 5;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static int schemaVersion() [...] // 潜在的解密器
}


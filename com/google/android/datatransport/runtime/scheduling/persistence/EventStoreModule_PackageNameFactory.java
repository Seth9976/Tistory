package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import javax.inject.Provider;

public final class EventStoreModule_PackageNameFactory implements Factory {
    public final Provider a;

    public EventStoreModule_PackageNameFactory(Provider provider0) {
        this.a = provider0;
    }

    public static EventStoreModule_PackageNameFactory create(Provider provider0) {
        return new EventStoreModule_PackageNameFactory(provider0);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public String get() {
        return EventStoreModule_PackageNameFactory.packageName(((Context)this.a.get()));
    }

    // 去混淆评级： 低(20)
    public static String packageName(Context context0) {
        return "net.daum.android.tistoryapp";
    }
}


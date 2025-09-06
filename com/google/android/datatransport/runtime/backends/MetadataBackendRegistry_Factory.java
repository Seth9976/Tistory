package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import javax.inject.Provider;
import t6.c;
import t6.d;

public final class MetadataBackendRegistry_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public MetadataBackendRegistry_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static MetadataBackendRegistry_Factory create(Provider provider0, Provider provider1) {
        return new MetadataBackendRegistry_Factory(provider0, provider1);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public d get() {
        return MetadataBackendRegistry_Factory.newInstance(((Context)this.a.get()), this.b.get());
    }

    public static d newInstance(Context context0, Object object0) {
        return new d(context0, ((c)object0));
    }
}


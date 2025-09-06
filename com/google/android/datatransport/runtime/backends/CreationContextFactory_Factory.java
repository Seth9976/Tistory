package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;
import t6.c;

public final class CreationContextFactory_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public CreationContextFactory_Factory(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public static CreationContextFactory_Factory create(Provider provider0, Provider provider1, Provider provider2) {
        return new CreationContextFactory_Factory(provider0, provider1, provider2);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public c get() {
        return CreationContextFactory_Factory.newInstance(((Context)this.a.get()), ((Clock)this.b.get()), ((Clock)this.c.get()));
    }

    public static c newInstance(Context context0, Clock clock0, Clock clock1) {
        return new c(context0, clock0, clock1);
    }
}


package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import javax.inject.Provider;

public final class SchemaManager_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public SchemaManager_Factory(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public static SchemaManager_Factory create(Provider provider0, Provider provider1, Provider provider2) {
        return new SchemaManager_Factory(provider0, provider1, provider2);
    }

    public o get() {
        return SchemaManager_Factory.newInstance(((Context)this.a.get()), ((String)this.b.get()), ((int)(((Integer)this.c.get()))));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static o newInstance(Context context0, String s, int v) {
        return new o(context0, s, v);
    }
}


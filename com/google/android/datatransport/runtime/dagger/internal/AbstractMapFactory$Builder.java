package com.google.android.datatransport.runtime.dagger.internal;

import java.util.LinkedHashMap;
import javax.inject.Provider;
import u6.a;

public abstract class AbstractMapFactory.Builder {
    public final LinkedHashMap a;

    public AbstractMapFactory.Builder(int v) {
        this.a = DaggerCollections.newLinkedHashMapWithExpectedSize(v);
    }

    public AbstractMapFactory.Builder putAll(Provider provider0) {
        if(provider0 instanceof DelegateFactory) {
            return this.putAll(((Provider)Preconditions.checkNotNull(((DelegateFactory)provider0).a)));
        }
        this.a.putAll(((a)provider0).a);
        return this;
    }
}


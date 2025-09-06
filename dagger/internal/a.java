package dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class a implements Provider {
    public final javax.inject.Provider a;

    public a(javax.inject.Provider provider0) {
        this.a = provider0;
    }

    @Override  // javax.inject.Provider
    public final Object get() {
        Map map0 = (Map)this.a.get();
        if(map0.isEmpty()) {
            return Collections.emptyMap();
        }
        LinkedHashMap linkedHashMap0 = DaggerCollections.newLinkedHashMapWithExpectedSize(map0.size());
        for(Object object0: map0.entrySet()) {
            linkedHashMap0.put(((Map.Entry)object0).getKey(), Providers.asDaggerProvider(((javax.inject.Provider)((Map.Entry)object0).getValue())));
        }
        return Collections.unmodifiableMap(linkedHashMap0);
    }
}


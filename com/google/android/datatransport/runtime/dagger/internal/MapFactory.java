package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import javax.inject.Provider;
import u6.a;

public final class MapFactory extends a {
    public static final class Builder extends AbstractMapFactory.Builder {
        public MapFactory build() {
            return new MapFactory(this.a);  // 初始化器: Lu6/a;-><init>(Ljava/util/Map;)V
        }

        public AbstractMapFactory.Builder put(Object object0, Provider provider0) {
            return this.put(object0, provider0);
        }

        public Builder put(Object object0, Provider provider0) {
            Object object1 = Preconditions.checkNotNull(object0, "key");
            Object object2 = Preconditions.checkNotNull(provider0, "provider");
            this.a.put(object1, object2);
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory$Builder
        public AbstractMapFactory.Builder putAll(Provider provider0) {
            return this.putAll(provider0);
        }

        public Builder putAll(Provider provider0) {
            super.putAll(provider0);
            return this;
        }
    }

    public static final Factory b;

    static {
        MapFactory.b = InstanceFactory.create(Collections.emptyMap());
    }

    public static Builder builder(int v) {
        return new Builder(v);  // 初始化器: Lcom/google/android/datatransport/runtime/dagger/internal/AbstractMapFactory$Builder;-><init>(I)V
    }

    public static Provider emptyMapProvider() {
        return MapFactory.b;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public Map get() {
        LinkedHashMap linkedHashMap0 = DaggerCollections.newLinkedHashMapWithExpectedSize(this.a.size());
        for(Object object0: this.a.entrySet()) {
            linkedHashMap0.put(((Map.Entry)object0).getKey(), ((Provider)((Map.Entry)object0).getValue()).get());
        }
        return Collections.unmodifiableMap(linkedHashMap0);
    }
}


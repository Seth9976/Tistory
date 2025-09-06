package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import java.util.Map;
import javax.inject.Provider;
import u6.a;

public final class MapProviderFactory extends a implements Lazy {
    public static final class Builder extends AbstractMapFactory.Builder {
        public MapProviderFactory build() {
            return new MapProviderFactory(this.a);  // 初始化器: Lu6/a;-><init>(Ljava/util/Map;)V
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

    public static Builder builder(int v) {
        return new Builder(v);  // 初始化器: Lcom/google/android/datatransport/runtime/dagger/internal/AbstractMapFactory$Builder;-><init>(I)V
    }

    @Override  // com.google.android.datatransport.runtime.dagger.Lazy, javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public Map get() {
        return this.a;
    }
}


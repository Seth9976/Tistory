package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

public final class SetFactory implements Factory {
    public static final class Builder {
        public final List a;
        public final List b;

        public Builder(int v, int v1) {
            this.a = DaggerCollections.presizedList(v);
            this.b = DaggerCollections.presizedList(v1);
        }

        public Builder addCollectionProvider(Provider provider0) {
            this.b.add(provider0);
            return this;
        }

        public Builder addProvider(Provider provider0) {
            this.a.add(provider0);
            return this;
        }

        public SetFactory build() {
            return new SetFactory(this.a, this.b);
        }
    }

    public final List a;
    public final List b;
    public static final Factory c;

    static {
        SetFactory.c = InstanceFactory.create(Collections.emptySet());
    }

    public SetFactory(List list0, List list1) {
        this.a = list0;
        this.b = list1;
    }

    public static Builder builder(int v, int v1) {
        return new Builder(v, v1);
    }

    public static Factory empty() {
        return SetFactory.c;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public Set get() {
        int v4;
        List list0 = this.a;
        int v = list0.size();
        List list1 = this.b;
        ArrayList arrayList0 = new ArrayList(list1.size());
        int v1 = list1.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            Collection collection0 = (Collection)((Provider)list1.get(v3)).get();
            v += collection0.size();
            arrayList0.add(collection0);
        }
        if(v < 3) {
            v4 = v + 1;
        }
        else {
            v4 = v >= 0x40000000 ? 0x7FFFFFFF : ((int)(((float)v) / 0.75f + 1.0f));
        }
        HashSet hashSet0 = new HashSet(v4);
        int v5 = list0.size();
        for(int v6 = 0; v6 < v5; ++v6) {
            hashSet0.add(Preconditions.checkNotNull(((Provider)list0.get(v6)).get()));
        }
        int v7 = arrayList0.size();
        for(int v2 = 0; v2 < v7; ++v2) {
            for(Object object0: ((Collection)arrayList0.get(v2))) {
                hashSet0.add(Preconditions.checkNotNull(object0));
            }
        }
        return Collections.unmodifiableSet(hashSet0);
    }
}


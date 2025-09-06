package androidx.collection;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

public final class a extends MapWrapper implements KMutableMap {
    public final MutableScatterMap b;

    public a(MutableScatterMap mutableScatterMap0) {
        this.b = mutableScatterMap0;
        super();
    }

    @Override  // androidx.collection.ScatterMap$MapWrapper
    public final void clear() {
        this.b.clear();
    }

    @Override  // androidx.collection.ScatterMap$MapWrapper
    public final Set getEntries() {
        return new MutableScatterMap.MutableMapWrapper.entries.1(this.b);
    }

    @Override  // androidx.collection.ScatterMap$MapWrapper
    public final Set getKeys() {
        return new MutableScatterMap.MutableMapWrapper.keys.1(this.b);
    }

    @Override  // androidx.collection.ScatterMap$MapWrapper
    public final Collection getValues() {
        return new MutableScatterMap.MutableMapWrapper.values.1(this.b);
    }

    @Override  // androidx.collection.ScatterMap$MapWrapper
    public final Object put(Object object0, Object object1) {
        return this.b.put(object0, object1);
    }

    @Override  // androidx.collection.ScatterMap$MapWrapper
    public final void putAll(Map map0) {
        Intrinsics.checkNotNullParameter(map0, "from");
        for(Object object0: map0.entrySet()) {
            this.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    @Override  // androidx.collection.ScatterMap$MapWrapper
    public final Object remove(Object object0) {
        return this.b.remove(object0);
    }
}


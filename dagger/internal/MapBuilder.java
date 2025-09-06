package dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class MapBuilder {
    public final LinkedHashMap a;

    public MapBuilder(int v) {
        this.a = DaggerCollections.newLinkedHashMapWithExpectedSize(v);
    }

    // 去混淆评级： 低(20)
    public Map build() {
        return this.a.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.a);
    }

    public static MapBuilder newMapBuilder(int v) {
        return new MapBuilder(v);
    }

    public MapBuilder put(Object object0, Object object1) {
        this.a.put(object0, object1);
        return this;
    }

    public MapBuilder putAll(Map map0) {
        this.a.putAll(map0);
        return this;
    }
}


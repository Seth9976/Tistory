package r;

import java.util.Map.Entry;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class e implements Map.Entry, KMappedMarker {
    public final Object a;
    public final Object b;

    public e(Object object0, Object object1) {
        this.a = object0;
        this.b = object1;
    }

    @Override
    public final Object getKey() {
        return this.a;
    }

    @Override
    public final Object getValue() {
        return this.b;
    }

    @Override
    public final Object setValue(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}


package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class r implements Serializable, Map, KMappedMarker {
    public static final r a;

    static {
        r.a = new r();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean containsKey(Object object0) {
        return false;
    }

    @Override
    public final boolean containsValue(Object object0) {
        if(!(object0 instanceof Void)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(((Void)object0), "value");
        return false;
    }

    @Override
    public final Set entrySet() {
        return EmptySet.INSTANCE;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof Map && ((Map)object0).isEmpty();
    }

    @Override
    public final Object get(Object object0) {
        return null;
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    @Override
    public final boolean isEmpty() {
        return true;
    }

    @Override
    public final Set keySet() {
        return EmptySet.INSTANCE;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void putAll(Map map0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return 0;
    }

    @Override
    public final String toString() {
        return "{}";
    }

    @Override
    public final Collection values() {
        return EmptyList.INSTANCE;
    }
}


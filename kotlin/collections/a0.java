package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class a0 implements MutableMapWithDefault {
    public final Map a;
    public final Function1 b;

    public a0(Map map0, Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "map");
        Intrinsics.checkNotNullParameter(function10, "default");
        super();
        this.a = map0;
        this.b = function10;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean containsKey(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override
    public final boolean containsValue(Object object0) {
        return this.a.containsValue(object0);
    }

    @Override
    public final Set entrySet() {
        return this.a.entrySet();
    }

    @Override
    public final boolean equals(Object object0) {
        return this.a.equals(object0);
    }

    @Override
    public final Object get(Object object0) {
        return this.a.get(object0);
    }

    @Override  // kotlin.collections.MutableMapWithDefault
    public final Map getMap() {
        return this.a;
    }

    @Override  // kotlin.collections.MapWithDefault
    public final Object getOrImplicitDefault(Object object0) {
        Object object1 = this.a.get(object0);
        return object1 != null || this.a.containsKey(object0) ? object1 : this.b.invoke(object0);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Set keySet() {
        return this.a.keySet();
    }

    @Override
    public final Object put(Object object0, Object object1) {
        return this.a.put(object0, object1);
    }

    @Override
    public final void putAll(Map map0) {
        Intrinsics.checkNotNullParameter(map0, "from");
        this.a.putAll(map0);
    }

    @Override
    public final Object remove(Object object0) {
        return this.a.remove(object0);
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }

    @Override
    public final Collection values() {
        return this.a.values();
    }
}


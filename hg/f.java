package hg;

import java.util.Map.Entry;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class f implements Map.Entry, KMappedMarker {
    public final Object a;
    public final Object b;

    public f(Object object0, Object object1) {
        this.a = object0;
        this.b = object1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((f)object0).a) ? Intrinsics.areEqual(this.b, ((f)object0).b) : false;
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
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Object object0 = this.b;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final Object setValue(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final String toString() {
        return "MapEntry(key=" + this.a + ", value=" + this.b + ')';
    }
}


package androidx.datastore.preferences.protobuf;

import java.util.Map.Entry;

public final class o1 implements Map.Entry {
    public final Map.Entry a;
    public final MapAdapter b;

    public o1(MapAdapter internal$MapAdapter0, Map.Entry map$Entry0) {
        this.b = internal$MapAdapter0;
        this.a = map$Entry0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof Map.Entry ? this.a.getKey().equals(((Map.Entry)object0).getKey()) && this.getValue().equals(this.getValue()) : false;
    }

    @Override
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override
    public final Object getValue() {
        Object object0 = this.a.getValue();
        return this.b.b.doForward(object0);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final Object setValue(Object object0) {
        Object object1 = this.b.b.doBackward(object0);
        Object object2 = this.a.setValue(object1);
        return object2 == null ? null : this.b.b.doForward(object2);
    }
}


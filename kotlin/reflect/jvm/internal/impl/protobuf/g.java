package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Map.Entry;

public final class g implements Map.Entry {
    public Map.Entry a;

    @Override
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override
    public final Object getValue() {
        LazyField lazyField0 = (LazyField)this.a.getValue();
        return lazyField0 == null ? null : lazyField0.getValue();
    }

    @Override
    public final Object setValue(Object object0) {
        if(!(object0 instanceof MessageLite)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return ((LazyField)this.a.getValue()).setValue(((MessageLite)object0));
    }
}


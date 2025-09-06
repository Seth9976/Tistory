package wf;

import java.util.Map.Entry;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.markers.KMutableMap.Entry;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt;

public final class c implements Map.Entry, Entry {
    public final Object a;
    public final Object b;

    public c(Object object0, Object object1) {
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
        ConcurrentWeakMapKt.access$noImpl();
        throw new KotlinNothingValueException();
    }
}


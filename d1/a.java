package d1;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderEntriesIterator;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableMap.Entry;

public final class a extends MapEntry implements Entry {
    public final int c;
    public final KMappedMarker d;
    public Object e;

    public a(PersistentHashMapBuilder persistentHashMapBuilder0, Object object0, LinkedValue linkedValue0) {
        this.c = 1;
        super(object0, linkedValue0.getValue());
        this.d = persistentHashMapBuilder0;
        this.e = linkedValue0;
    }

    public a(PersistentHashMapBuilderEntriesIterator persistentHashMapBuilderEntriesIterator0, Object object0, Object object1) {
        this.c = 0;
        super(object0, object1);
        this.d = persistentHashMapBuilderEntriesIterator0;
        this.e = object1;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry
    public final Object getValue() {
        return this.c == 0 ? this.e : ((LinkedValue)this.e).getValue();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry
    public final Object setValue(Object object0) {
        if(this.c != 0) {
            Object object1 = ((LinkedValue)this.e).getValue();
            this.e = ((LinkedValue)this.e).withValue(object0);
            ((PersistentHashMapBuilder)this.d).put(this.getKey(), ((LinkedValue)this.e));
            return object1;
        }
        Object object2 = this.e;
        this.e = object0;
        ((PersistentHashMapBuilderEntriesIterator)this.d).setValue(this.getKey(), object0);
        return object2;
    }
}


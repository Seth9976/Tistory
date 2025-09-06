package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010\'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001B\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001A\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u001C\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u001D\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntriesIterator;", "K", "V", "", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "builder", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)V", "", "hasNext", "()Z", "next", "()Ljava/util/Map$Entry;", "", "remove", "()V", "key", "newValue", "setValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PersistentHashMapBuilderEntriesIterator implements Iterator, KMutableIterator {
    public static final int $stable = 8;
    public final PersistentHashMapBuilderBaseIterator a;

    public PersistentHashMapBuilderEntriesIterator(@NotNull PersistentHashMapBuilder persistentHashMapBuilder0) {
        TrieNodeBaseIterator[] arr_trieNodeBaseIterator = new TrieNodeBaseIterator[8];
        for(int v = 0; v < 8; ++v) {
            arr_trieNodeBaseIterator[v] = new TrieNodeMutableEntriesIterator(this);
        }
        this.a = new PersistentHashMapBuilderBaseIterator(persistentHashMapBuilder0, arr_trieNodeBaseIterator);
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public Object next() {
        return this.next();
    }

    @NotNull
    public Map.Entry next() {
        return (Map.Entry)this.a.next();
    }

    @Override
    public void remove() {
        this.a.remove();
    }

    public final void setValue(Object object0, Object object1) {
        this.a.setValue(object0, object1);
    }
}


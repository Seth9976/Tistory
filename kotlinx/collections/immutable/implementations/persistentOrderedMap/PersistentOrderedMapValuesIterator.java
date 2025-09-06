package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001A\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapValuesIterator;", "K", "V", "", "Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "map", "<init>", "(Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PersistentOrderedMapValuesIterator implements Iterator, KMappedMarker {
    public final PersistentOrderedMapLinksIterator a;

    public PersistentOrderedMapValuesIterator(@NotNull PersistentOrderedMap persistentOrderedMap0) {
        Intrinsics.checkNotNullParameter(persistentOrderedMap0, "map");
        super();
        this.a = new PersistentOrderedMapLinksIterator(persistentOrderedMap0.getFirstKey$kotlinx_collections_immutable(), persistentOrderedMap0.getHashMap$kotlinx_collections_immutable());
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public Object next() {
        return this.a.next().getValue();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}


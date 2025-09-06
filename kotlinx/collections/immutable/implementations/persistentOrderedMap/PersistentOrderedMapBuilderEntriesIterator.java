package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;
import pf.a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010\'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001B\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001A\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u001C\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderEntriesIterator;", "K", "V", "", "", "Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "map", "<init>", "(Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "", "hasNext", "()Z", "next", "()Ljava/util/Map$Entry;", "", "remove", "()V", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PersistentOrderedMapBuilderEntriesIterator implements Iterator, KMutableIterator {
    public final PersistentOrderedMapBuilderLinksIterator a;

    public PersistentOrderedMapBuilderEntriesIterator(@NotNull PersistentOrderedMapBuilder persistentOrderedMapBuilder0) {
        Intrinsics.checkNotNullParameter(persistentOrderedMapBuilder0, "map");
        super();
        this.a = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder0.getFirstKey$kotlinx_collections_immutable(), persistentOrderedMapBuilder0);
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
        LinkedValue linkedValue0 = this.a.next();
        return new a(this.a.getBuilder$kotlinx_collections_immutable().getHashMapBuilder$kotlinx_collections_immutable(), this.a.getLastIteratedKey$kotlinx_collections_immutable(), linkedValue0);
    }

    @Override
    public void remove() {
        this.a.remove();
    }
}


package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B+\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\u0018\u0010\b\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001A\u00020\u000BH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FR$\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001D\u001A\u00020\u00168\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapLinksIterator;", "K", "V", "", "Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "", "nextKey", "", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "", "hasNext", "()Z", "next", "()Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "a", "Ljava/lang/Object;", "getNextKey$kotlinx_collections_immutable", "()Ljava/lang/Object;", "setNextKey$kotlinx_collections_immutable", "(Ljava/lang/Object;)V", "", "c", "I", "getIndex$kotlinx_collections_immutable", "()I", "setIndex$kotlinx_collections_immutable", "(I)V", "index", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class PersistentOrderedMapLinksIterator implements Iterator, KMappedMarker {
    public Object a;
    public final Map b;
    public int c;

    public PersistentOrderedMapLinksIterator(@Nullable Object object0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "hashMap");
        super();
        this.a = object0;
        this.b = map0;
    }

    public final int getIndex$kotlinx_collections_immutable() {
        return this.c;
    }

    @Nullable
    public final Object getNextKey$kotlinx_collections_immutable() {
        return this.a;
    }

    @Override
    public boolean hasNext() {
        return this.c < this.b.size();
    }

    @Override
    public Object next() {
        return this.next();
    }

    @NotNull
    public LinkedValue next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.b.get(this.a);
        if(object0 == null) {
            throw new ConcurrentModificationException("Hash code of a key (" + this.a + ") has changed after it was added to the persistent map.");
        }
        ++this.c;
        this.a = ((LinkedValue)object0).getNext();
        return (LinkedValue)object0;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$kotlinx_collections_immutable(int v) {
        this.c = v;
    }

    public final void setNextKey$kotlinx_collections_immutable(@Nullable Object object0) {
        this.a = object0;
    }
}


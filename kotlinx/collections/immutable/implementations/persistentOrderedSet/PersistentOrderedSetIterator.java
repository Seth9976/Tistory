package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000ER&\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\"\u0010\u001A\u001A\u00020\u00138\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", "E", "", "", "nextElement", "", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "map", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "b", "Ljava/util/Map;", "getMap$kotlinx_collections_immutable", "()Ljava/util/Map;", "", "c", "I", "getIndex$kotlinx_collections_immutable", "()I", "setIndex$kotlinx_collections_immutable", "(I)V", "index", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class PersistentOrderedSetIterator implements Iterator, KMappedMarker {
    public Object a;
    public final Map b;
    public int c;

    public PersistentOrderedSetIterator(@Nullable Object object0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "map");
        super();
        this.a = object0;
        this.b = map0;
    }

    public final int getIndex$kotlinx_collections_immutable() {
        return this.c;
    }

    @NotNull
    public final Map getMap$kotlinx_collections_immutable() {
        return this.b;
    }

    @Override
    public boolean hasNext() {
        return this.c < this.b.size();
    }

    @Override
    public Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.a;
        ++this.c;
        Object object1 = this.b.get(object0);
        if(object1 == null) {
            throw new ConcurrentModificationException("Hash code of an element (" + object0 + ") has changed after it was added to the persistent set.");
        }
        this.a = ((Links)object1).getNext();
        return object0;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$kotlinx_collections_immutable(int v) {
        this.c = v;
    }
}


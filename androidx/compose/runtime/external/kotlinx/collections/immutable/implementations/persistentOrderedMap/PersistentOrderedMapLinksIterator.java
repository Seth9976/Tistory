package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B+\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\u0018\u0010\b\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001A\u00020\u000BH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FR$\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001D\u001A\u00020\u00168\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "", "nextKey", "", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "", "hasNext", "()Z", "next", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "a", "Ljava/lang/Object;", "getNextKey$runtime_release", "()Ljava/lang/Object;", "setNextKey$runtime_release", "(Ljava/lang/Object;)V", "", "c", "I", "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", "index", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class PersistentOrderedMapLinksIterator implements Iterator, KMappedMarker {
    public static final int $stable = 8;
    public Object a;
    public final Map b;
    public int c;

    public PersistentOrderedMapLinksIterator(@Nullable Object object0, @NotNull Map map0) {
        this.a = object0;
        this.b = map0;
    }

    public final int getIndex$runtime_release() {
        return this.c;
    }

    @Nullable
    public final Object getNextKey$runtime_release() {
        return this.a;
    }

    @Override
    public boolean hasNext() {
        return this.c < this.b.size();
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
    public Object next() {
        return this.next();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime_release(int v) {
        this.c = v;
    }

    public final void setNextKey$runtime_release(@Nullable Object object0) {
        this.a = object0;
    }
}


package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B%\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001A\u00020\u000BH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R$\u0010\u001D\u001A\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR\"\u0010%\u001A\u00020\u001E8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "", "nextKey", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "builder", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "", "hasNext", "()Z", "next", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "", "remove", "()V", "b", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "getBuilder$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "c", "Ljava/lang/Object;", "getLastIteratedKey$runtime_release", "()Ljava/lang/Object;", "setLastIteratedKey$runtime_release", "(Ljava/lang/Object;)V", "lastIteratedKey", "", "f", "I", "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", "index", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class PersistentOrderedMapBuilderLinksIterator implements Iterator, KMutableIterator {
    public static final int $stable = 8;
    public Object a;
    public final PersistentOrderedMapBuilder b;
    public Object c;
    public boolean d;
    public int e;
    public int f;

    public PersistentOrderedMapBuilderLinksIterator(@Nullable Object object0, @NotNull PersistentOrderedMapBuilder persistentOrderedMapBuilder0) {
        this.a = object0;
        this.b = persistentOrderedMapBuilder0;
        this.c = EndOfChain.INSTANCE;
        this.e = persistentOrderedMapBuilder0.getHashMapBuilder$runtime_release().getModCount$runtime_release();
    }

    @NotNull
    public final PersistentOrderedMapBuilder getBuilder$runtime_release() {
        return this.b;
    }

    public final int getIndex$runtime_release() {
        return this.f;
    }

    @Nullable
    public final Object getLastIteratedKey$runtime_release() {
        return this.c;
    }

    @Override
    public boolean hasNext() {
        return this.f < this.b.size();
    }

    @NotNull
    public LinkedValue next() {
        PersistentOrderedMapBuilder persistentOrderedMapBuilder0 = this.b;
        if(persistentOrderedMapBuilder0.getHashMapBuilder$runtime_release().getModCount$runtime_release() != this.e) {
            throw new ConcurrentModificationException();
        }
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.c = this.a;
        this.d = true;
        ++this.f;
        Object object0 = persistentOrderedMapBuilder0.getHashMapBuilder$runtime_release().get(this.a);
        if(object0 == null) {
            throw new ConcurrentModificationException("Hash code of a key (" + this.a + ") has changed after it was added to the persistent map.");
        }
        this.a = ((LinkedValue)object0).getNext();
        return (LinkedValue)object0;
    }

    @Override
    public Object next() {
        return this.next();
    }

    @Override
    public void remove() {
        if(!this.d) {
            throw new IllegalStateException();
        }
        Object object0 = this.c;
        TypeIntrinsics.asMutableMap(this.b).remove(object0);
        this.c = null;
        this.d = false;
        this.e = this.b.getHashMapBuilder$runtime_release().getModCount$runtime_release();
        --this.f;
    }

    public final void setIndex$runtime_release(int v) {
        this.f = v;
    }

    public final void setLastIteratedKey$runtime_release(@Nullable Object object0) {
        this.c = object0;
    }
}


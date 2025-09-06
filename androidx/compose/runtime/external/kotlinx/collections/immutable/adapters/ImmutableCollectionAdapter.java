package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\t\u0010\nJ\u001E\u0010\f\u001A\u00020\b2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0016\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0015\u001A\u00020\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\nJ\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u001A\u001A\u00020\u0019H\u0016¢\u0006\u0004\b\u001A\u0010\u001BR\u0014\u0010\u001D\u001A\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u0018¨\u0006\u001E"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableCollectionAdapter;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "", "impl", "<init>", "(Ljava/util/Collection;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getSize", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class ImmutableCollectionAdapter implements ImmutableCollection, Collection, KMappedMarker {
    public static final int $stable = 8;
    public final Collection a;

    public ImmutableCollectionAdapter(@NotNull Collection collection0) {
        this.a = collection0;
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean contains(Object object0) {
        return this.a.contains(object0);
    }

    @Override
    public boolean containsAll(@NotNull Collection collection0) {
        return this.a.containsAll(collection0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return this.a.equals(object0);
    }

    public int getSize() {
        return this.a.size();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return this.a.iterator();
    }

    @Override
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeIf(Predicate predicate0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        return CollectionToArray.toArray(this, arr_object);
    }

    @Override
    @NotNull
    public String toString() {
        return this.a.toString();
    }
}


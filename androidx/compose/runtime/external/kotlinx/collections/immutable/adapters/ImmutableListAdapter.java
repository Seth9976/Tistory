package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\t\u0010\nJ\u001E\u0010\r\u001A\u00020\b2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000BH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0018\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0010\u001A\u00020\u000FH\u0096\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001A\u00020\u000F2\u0006\u0010\u0007\u001A\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001A\u001A\u00020\u000F2\u0006\u0010\u0007\u001A\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u001A\u0010\u0014J\u0016\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00000\u001BH\u0096\u0001¢\u0006\u0004\b\u001C\u0010\u001DJ\u001E\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00000\u001B2\u0006\u0010\u0010\u001A\u00020\u000FH\u0096\u0001¢\u0006\u0004\b\u001C\u0010\u001EJ%\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001F\u001A\u00020\u000F2\u0006\u0010 \u001A\u00020\u000FH\u0016¢\u0006\u0004\b!\u0010\"J\u001A\u0010%\u001A\u00020\b2\b\u0010$\u001A\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010\nJ\u000F\u0010&\u001A\u00020\u000FH\u0016¢\u0006\u0004\b&\u0010\'J\u000F\u0010)\u001A\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010,\u001A\u00020\u000F8\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b+\u0010\'¨\u0006-"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableListAdapter;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "", "impl", "<init>", "(Ljava/util/List;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getSize", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ImmutableListAdapter implements ImmutableList, List, KMappedMarker {
    public static final int $stable = 8;
    public final List a;

    public ImmutableListAdapter(@NotNull List list0) {
        this.a = list0;
    }

    @Override
    public void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
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

    @Override
    public Object get(int v) {
        return this.a.get(v);
    }

    public int getSize() {
        return this.a.size();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public int indexOf(Object object0) {
        return this.a.indexOf(object0);
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
    public int lastIndexOf(Object object0) {
        return this.a.lastIndexOf(object0);
    }

    @Override
    @NotNull
    public ListIterator listIterator() {
        return this.a.listIterator();
    }

    @Override
    @NotNull
    public ListIterator listIterator(int v) {
        return this.a.listIterator(v);
    }

    @Override
    public Object remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    public void replaceAll(UnaryOperator unaryOperator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    public void sort(Comparator comparator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    @NotNull
    public ImmutableList subList(int v, int v1) {
        return new ImmutableListAdapter(this.a.subList(v, v1));
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    public List subList(int v, int v1) {
        return this.subList(v, v1);
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


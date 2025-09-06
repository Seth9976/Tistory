package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
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

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0002H\u0096\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001E\u0010\u000B\u001A\u00020\u00062\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00020\tH\u0096\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0018\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\rH\u0096\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0018\u0010\u0011\u001A\u00020\r2\u0006\u0010\u0005\u001A\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0096\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001A\u00020\r2\u0006\u0010\u0005\u001A\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0016\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u001E\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00020\u00192\u0006\u0010\u000E\u001A\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001A\u0010\u001CJ&\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001D\u001A\u00020\r2\u0006\u0010\u001E\u001A\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001F\u0010 J\u0017\u0010%\u001A\u00020\"2\u0006\u0010!\u001A\u00020\u0002H\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010\'\u001A\u00020\"2\u0006\u0010!\u001A\u00020\u0002H\u0000¢\u0006\u0004\b&\u0010$R\u0014\u0010*\u001A\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b(\u0010)¨\u0006,"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;", "<init>", "()V", "element", "", "contains", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;", "indexOf", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "item", "", "pin$foundation_release", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;)V", "pin", "release$foundation_release", "release", "getSize", "()I", "size", "PinnedItem", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyLayoutPinnedItemList implements List, KMappedMarker {
    @ExperimentalFoundationApi
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001R\u0016\u0010\u0004\u001A\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003R\u0014\u0010\b\u001A\u00020\u00058&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;", "", "getKey", "()Ljava/lang/Object;", "key", "", "getIndex", "()I", "index", "Landroidx/compose/foundation/lazy/layout/c;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface PinnedItem {
        int getIndex();

        @Nullable
        Object getKey();
    }

    public static final int $stable = 8;
    public final SnapshotStateList a;

    public LazyLayoutPinnedItemList() {
        SnapshotStateList snapshotStateList0 = new SnapshotStateList();
        super();
        this.a = snapshotStateList0;
    }

    public void add(int v, PinnedItem lazyLayoutPinnedItemList$PinnedItem0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(PinnedItem lazyLayoutPinnedItemList$PinnedItem0) {
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

    public boolean contains(@NotNull PinnedItem lazyLayoutPinnedItemList$PinnedItem0) {
        return this.a.contains(lazyLayoutPinnedItemList$PinnedItem0);
    }

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof PinnedItem ? this.contains(((PinnedItem)object0)) : false;
    }

    @Override
    public boolean containsAll(@NotNull Collection collection0) {
        return this.a.containsAll(collection0);
    }

    @NotNull
    public PinnedItem get(int v) {
        return (PinnedItem)this.a.get(v);
    }

    @Override
    public Object get(int v) {
        return this.get(v);
    }

    public int getSize() {
        return this.a.size();
    }

    public int indexOf(@NotNull PinnedItem lazyLayoutPinnedItemList$PinnedItem0) {
        return this.a.indexOf(lazyLayoutPinnedItemList$PinnedItem0);
    }

    @Override
    public final int indexOf(Object object0) {
        return object0 instanceof PinnedItem ? this.indexOf(((PinnedItem)object0)) : -1;
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

    public int lastIndexOf(@NotNull PinnedItem lazyLayoutPinnedItemList$PinnedItem0) {
        return this.a.lastIndexOf(lazyLayoutPinnedItemList$PinnedItem0);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        return object0 instanceof PinnedItem ? this.lastIndexOf(((PinnedItem)object0)) : -1;
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

    public final void pin$foundation_release(@NotNull PinnedItem lazyLayoutPinnedItemList$PinnedItem0) {
        this.a.add(lazyLayoutPinnedItemList$PinnedItem0);
    }

    public final void release$foundation_release(@NotNull PinnedItem lazyLayoutPinnedItemList$PinnedItem0) {
        this.a.remove(lazyLayoutPinnedItemList$PinnedItem0);
    }

    public PinnedItem remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public PinnedItem set(int v, PinnedItem lazyLayoutPinnedItemList$PinnedItem0) {
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

    @Override
    @NotNull
    public List subList(int v, int v1) {
        return this.a.subList(v, v1);
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        return CollectionToArray.toArray(this, arr_object);
    }
}


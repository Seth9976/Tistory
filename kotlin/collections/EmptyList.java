package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\u001E\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\n\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u00042\u00060\u0005j\u0002`\u0006J\u001A\u0010\n\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001D\u0010\u0019\u001A\u00020\t2\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u0018\u0010\u001C\u001A\u00020\u00022\u0006\u0010\u001B\u001A\u00020\fH\u0096\u0002¢\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010\u001E\u001A\u00020\f2\u0006\u0010\u0014\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u001E\u0010\u001FJ\u0017\u0010 \u001A\u00020\f2\u0006\u0010\u0014\u001A\u00020\u0002H\u0016¢\u0006\u0004\b \u0010\u001FJ\u0016\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u00020!H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001D\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010\u001B\u001A\u00020\fH\u0016¢\u0006\u0004\b%\u0010\'J%\u0010*\u001A\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010(\u001A\u00020\f2\u0006\u0010)\u001A\u00020\fH\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010-\u001A\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b,\u0010\u000E¨\u0006."}, d2 = {"Lkotlin/collections/EmptyList;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Void;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Void;", "indexOf", "(Ljava/lang/Void;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "getSize", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EmptyList implements Serializable, List, RandomAccess, KMappedMarker {
    @NotNull
    public static final EmptyList INSTANCE;

    static {
        EmptyList.INSTANCE = new EmptyList();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void add(int v, Void void0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Void void0) {
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
    public final boolean contains(Object object0) {
        return object0 instanceof Void ? this.contains(((Void)object0)) : false;
    }

    public boolean contains(@NotNull Void void0) {
        Intrinsics.checkNotNullParameter(void0, "element");
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return collection0.isEmpty();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof List && ((List)object0).isEmpty();
    }

    @Override
    public Object get(int v) {
        return this.get(v);
    }

    @NotNull
    public Void get(int v) {
        throw new IndexOutOfBoundsException("Empty list doesn\'t contain element at index " + v + '.');
    }

    public int getSize() [...] // Inlined contents

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public final int indexOf(Object object0) {
        return object0 instanceof Void ? this.indexOf(((Void)object0)) : -1;
    }

    public int indexOf(@NotNull Void void0) {
        Intrinsics.checkNotNullParameter(void0, "element");
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return EmptyIterator.INSTANCE;
    }

    @Override
    public final int lastIndexOf(Object object0) {
        return object0 instanceof Void ? this.lastIndexOf(((Void)object0)) : -1;
    }

    public int lastIndexOf(@NotNull Void void0) {
        Intrinsics.checkNotNullParameter(void0, "element");
        return -1;
    }

    @Override
    @NotNull
    public ListIterator listIterator() {
        return EmptyIterator.INSTANCE;
    }

    @Override
    @NotNull
    public ListIterator listIterator(int v) {
        if(v != 0) {
            throw new IndexOutOfBoundsException("Index: " + v);
        }
        return EmptyIterator.INSTANCE;
    }

    @Override
    public Object remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void remove(int v) {
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
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void set(int v, Void void0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return 0;
    }

    @Override
    @NotNull
    public List subList(int v, int v1) {
        if(v != 0 || v1 != 0) {
            throw new IndexOutOfBoundsException("fromIndex: " + v + ", toIndex: " + v1);
        }
        return this;
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "array");
        return CollectionToArray.toArray(this, arr_object);
    }

    @Override
    @NotNull
    public String toString() {
        return "[]";
    }
}


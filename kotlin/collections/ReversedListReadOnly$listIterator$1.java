package kotlin.collections;

import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010*\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0005\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u000B\u0010\u0007J\u000F\u0010\f\u001A\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR\u001D\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0012"}, d2 = {"kotlin/collections/ReversedListReadOnly$listIterator$1", "", "", "hasNext", "()Z", "hasPrevious", "next", "()Ljava/lang/Object;", "", "nextIndex", "()I", "previous", "previousIndex", "a", "Ljava/util/ListIterator;", "getDelegateIterator", "()Ljava/util/ListIterator;", "delegateIterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ReversedListReadOnly.listIterator.1 implements ListIterator, KMappedMarker {
    public final ListIterator a;
    public final c0 b;

    public ReversedListReadOnly.listIterator.1(c0 c00, int v) {
        this.b = c00;
        int v1 = p.access$reversePositionIndex(c00, v);
        this.a = c00.a.listIterator(v1);
    }

    @Override
    public void add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public final ListIterator getDelegateIterator() {
        return this.a;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasPrevious();
    }

    @Override
    public boolean hasPrevious() {
        return this.a.hasNext();
    }

    @Override
    public Object next() {
        return this.a.previous();
    }

    @Override
    public int nextIndex() {
        int v = this.a.previousIndex();
        return p.access$reverseIteratorIndex(this.b, v);
    }

    @Override
    public Object previous() {
        return this.a.next();
    }

    @Override
    public int previousIndex() {
        int v = this.a.nextIndex();
        return p.access$reverseIteratorIndex(this.b, v);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void set(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}


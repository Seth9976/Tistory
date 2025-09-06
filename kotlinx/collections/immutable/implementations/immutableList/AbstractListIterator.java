package kotlinx.collections.immutable.implementations.immutableList;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000E\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001A\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\nJ\u000F\u0010\f\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u000E\u0010\rJ\u000F\u0010\u0012\u001A\u00020\u000FH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0014\u001A\u00020\u000FH\u0000¢\u0006\u0004\b\u0013\u0010\u0011R\"\u0010\u0004\u001A\u00020\u00038\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001A\u00020\u00038\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001A\u0010\u0016\u001A\u0004\b\u001B\u0010\r\"\u0004\b\u001C\u0010\u0019¨\u0006\u001D"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "E", "", "", "index", "size", "<init>", "(II)V", "", "hasNext", "()Z", "hasPrevious", "nextIndex", "()I", "previousIndex", "", "checkHasNext$kotlinx_collections_immutable", "()V", "checkHasNext", "checkHasPrevious$kotlinx_collections_immutable", "checkHasPrevious", "a", "I", "getIndex", "setIndex", "(I)V", "b", "getSize", "setSize", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class AbstractListIterator implements ListIterator, KMappedMarker {
    public int a;
    public int b;

    public AbstractListIterator(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public void add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void checkHasNext$kotlinx_collections_immutable() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void checkHasPrevious$kotlinx_collections_immutable() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int getIndex() {
        return this.a;
    }

    public final int getSize() {
        return this.b;
    }

    @Override
    public boolean hasNext() {
        return this.a < this.b;
    }

    @Override
    public boolean hasPrevious() {
        return this.a > 0;
    }

    @Override
    public Object next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public int nextIndex() {
        return this.a;
    }

    @Override
    public int previousIndex() {
        return this.a - 1;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void set(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int v) {
        this.a = v;
    }

    public final void setSize(int v) {
        this.b = v;
    }
}


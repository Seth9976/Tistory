package kotlin.collections;

import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000B\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0005\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u000B\u0010\u0007J\u000F\u0010\f\u001A\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0010R\u001D\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"kotlin/collections/ReversedList$listIterator$1", "", "", "hasNext", "()Z", "hasPrevious", "next", "()Ljava/lang/Object;", "", "nextIndex", "()I", "previous", "previousIndex", "element", "", "add", "(Ljava/lang/Object;)V", "remove", "()V", "set", "a", "Ljava/util/ListIterator;", "getDelegateIterator", "()Ljava/util/ListIterator;", "delegateIterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ReversedList.listIterator.1 implements ListIterator, KMutableListIterator {
    public final ListIterator a;
    public final b0 b;

    public ReversedList.listIterator.1(b0 b00, int v) {
        this.b = b00;
        int v1 = p.access$reversePositionIndex(b00, v);
        this.a = b00.a.listIterator(v1);
    }

    @Override
    public void add(Object object0) {
        this.a.add(object0);
        this.a.previous();
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
        this.a.remove();
    }

    @Override
    public void set(Object object0) {
        this.a.set(object0);
    }
}


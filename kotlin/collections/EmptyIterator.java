package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\u0001\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001A\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0006\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000B\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\f¨\u0006\u000E"}, d2 = {"Lkotlin/collections/EmptyIterator;", "", "", "", "hasNext", "()Z", "hasPrevious", "", "nextIndex", "()I", "previousIndex", "next", "()Ljava/lang/Void;", "previous", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EmptyIterator implements ListIterator, KMappedMarker {
    @NotNull
    public static final EmptyIterator INSTANCE;

    static {
        EmptyIterator.INSTANCE = new EmptyIterator();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public void add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void add(Void void0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public Object next() {
        return this.next();
    }

    @NotNull
    public Void next() {
        throw new NoSuchElementException();
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public Object previous() {
        return this.previous();
    }

    @NotNull
    public Void previous() {
        throw new NoSuchElementException();
    }

    @Override
    public int previousIndex() {
        return -1;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void set(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(Void void0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}


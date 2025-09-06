package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;

public final class h implements ByteIterator {
    public int a;
    public final int b;
    public final i c;

    public h(i i0) {
        this.c = i0;
        this.a = 0;
        this.b = i0.a.length;
    }

    @Override
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override
    public final Object next() {
        return this.nextByte();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString$ByteIterator
    public final byte nextByte() {
        try {
            int v = this.a;
            this.a = v + 1;
            return this.c.a[v];
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            throw new NoSuchElementException(arrayIndexOutOfBoundsException0.getMessage());
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}


package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.ByteIterator;

public final class b extends ByteIterator {
    public final byte[] a;
    public int b;

    public b(byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "array");
        super();
        this.a = arr_b;
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override  // kotlin.collections.ByteIterator
    public final byte nextByte() {
        try {
            int v = this.b;
            this.b = v + 1;
            return this.a[v];
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            --this.b;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException0.getMessage());
        }
    }
}


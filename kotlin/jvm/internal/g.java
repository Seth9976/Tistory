package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;

public final class g extends LongIterator {
    public final long[] a;
    public int b;

    public g(long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "array");
        super();
        this.a = arr_v;
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override  // kotlin.collections.LongIterator
    public final long nextLong() {
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


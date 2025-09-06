package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;

public final class f extends IntIterator {
    public final int[] a;
    public int b;

    public f(int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "array");
        super();
        this.a = arr_v;
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override  // kotlin.collections.IntIterator
    public final int nextInt() {
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


package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.ShortIterator;

public final class h extends ShortIterator {
    public final short[] a;
    public int b;

    public h(short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "array");
        super();
        this.a = arr_v;
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override  // kotlin.collections.ShortIterator
    public final short nextShort() {
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


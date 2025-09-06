package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.DoubleIterator;

public final class d extends DoubleIterator {
    public final double[] a;
    public int b;

    public d(double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "array");
        super();
        this.a = arr_f;
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override  // kotlin.collections.DoubleIterator
    public final double nextDouble() {
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


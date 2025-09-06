package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.FloatIterator;

public final class e extends FloatIterator {
    public final float[] a;
    public int b;

    public e(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "array");
        super();
        this.a = arr_f;
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override  // kotlin.collections.FloatIterator
    public final float nextFloat() {
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


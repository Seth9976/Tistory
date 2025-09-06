package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.BooleanIterator;

public final class a extends BooleanIterator {
    public final boolean[] a;
    public int b;

    public a(boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "array");
        super();
        this.a = arr_z;
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override  // kotlin.collections.BooleanIterator
    public final boolean nextBoolean() {
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


package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.CharIterator;

public final class c extends CharIterator {
    public final char[] a;
    public int b;

    public c(char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "array");
        super();
        this.a = arr_c;
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override  // kotlin.collections.CharIterator
    public final char nextChar() {
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


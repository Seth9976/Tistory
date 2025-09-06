package kotlin.collections;

import kotlin.UByteArray;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function0 {
    public final int w;
    public final byte[] x;

    public g(byte[] arr_b, int v) {
        this.w = v;
        this.x = arr_b;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? UByteArray.iterator-impl(this.x) : ArrayIteratorsKt.iterator(this.x);
    }
}


package kotlin.collections;

import kotlin.ULongArray;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function0 {
    public final int w;
    public final long[] x;

    public j(long[] arr_v, int v) {
        this.w = v;
        this.x = arr_v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? ULongArray.iterator-impl(this.x) : ArrayIteratorsKt.iterator(this.x);
    }
}


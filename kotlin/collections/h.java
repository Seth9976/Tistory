package kotlin.collections;

import kotlin.UShortArray;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function0 {
    public final int w;
    public final short[] x;

    public h(short[] arr_v, int v) {
        this.w = v;
        this.x = arr_v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? UShortArray.iterator-impl(this.x) : ArrayIteratorsKt.iterator(this.x);
    }
}


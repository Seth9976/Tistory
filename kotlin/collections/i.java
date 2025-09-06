package kotlin.collections;

import kotlin.UIntArray;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function0 {
    public final int w;
    public final int[] x;

    public i(int v, int[] arr_v) {
        this.w = v;
        this.x = arr_v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? UIntArray.iterator-impl(this.x) : ArrayIteratorsKt.iterator(this.x);
    }
}


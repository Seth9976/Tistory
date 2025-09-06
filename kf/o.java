package kf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;

public final class o extends Lambda implements Function1 {
    public final BooleanRef w;
    public final Object x;

    public o(BooleanRef ref$BooleanRef0, Object object0) {
        this.w = ref$BooleanRef0;
        this.x = object0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        BooleanRef ref$BooleanRef0 = this.w;
        boolean z = true;
        if(!ref$BooleanRef0.element && Intrinsics.areEqual(object0, this.x)) {
            ref$BooleanRef0.element = true;
            z = false;
        }
        return Boolean.valueOf(z);
    }
}


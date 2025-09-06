package jb;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function2 {
    public final Function2 w;

    public u(Function2 function20) {
        this.w = function20;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        this.w.invoke(((Number)object0).intValue(), ((int)((Number)object1).longValue()));
        return Unit.INSTANCE;
    }
}


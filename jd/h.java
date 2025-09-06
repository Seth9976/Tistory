package jd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final int w;
    public static final h x;
    public static final h y;

    static {
        h.x = new h(1, 0);
        h.y = new h(1, 1);
    }

    public h(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkParameterIsNotNull(object0, "it");
            return Unit.INSTANCE;
        }
        Intrinsics.checkParameterIsNotNull(((Throwable)object0), "it");
        return Unit.INSTANCE;
    }
}


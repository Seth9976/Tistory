package kf;

import kotlin.TuplesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function2 {
    public final int w;
    public static final t x;
    public static final t y;

    static {
        t.x = new t(2, 0);
        t.y = new t(2, 1);
    }

    public t(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return TuplesKt.to(object0, object1);
    }
}


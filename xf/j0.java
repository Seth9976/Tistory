package xf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function1 {
    public final int w;
    public static final j0 x;
    public static final j0 y;

    static {
        j0.x = new j0(1, 0);
        j0.y = new j0(1, 1);
    }

    public j0(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Throwable throwable0 = (Throwable)object0;
            return true;
        }
        return object0;
    }
}


package f2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final int w;
    public static final c x;
    public static final c y;
    public static final c z;

    static {
        c.x = new c(1, 0);
        c.y = new c(1, 1);
        c.z = new c(1, 2);
    }

    public c(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                ((Number)object0).longValue();
                return Unit.INSTANCE;
            }
            case 1: {
                return ((i)object0).b;
            }
            default: {
                return ((i)object0).c.getHeight();
            }
        }
    }
}


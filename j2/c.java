package j2;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public static final c A;
    public static final c B;
    public static final c C;
    public final int w;
    public static final c x;
    public static final c y;
    public static final c z;

    static {
        c.x = new c(1, 0);
        c.y = new c(1, 1);
        c.z = new c(1, 2);
        c.A = new c(1, 3);
        c.B = new c(1, 4);
        c.C = new c(1, 5);
    }

    public c(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                return Unit.INSTANCE;
            }
            case 1: {
                return Unit.INSTANCE;
            }
            case 2: {
                List list0 = (List)object0;
                return Unit.INSTANCE;
            }
            case 3: {
                return Unit.INSTANCE;
            }
            case 4: {
                List list1 = (List)object0;
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}


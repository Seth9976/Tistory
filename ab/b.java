package ab;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public static final b A;
    public final int w;
    public static final b x;
    public static final b y;
    public static final b z;

    static {
        b.x = new b(0, 0);
        b.y = new b(0, 1);
        b.z = new b(0, 2);
        b.A = new b(0, 3);
    }

    public b(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return Unit.INSTANCE;
            }
            case 1: {
                return Unit.INSTANCE;
            }
            case 2: {
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}


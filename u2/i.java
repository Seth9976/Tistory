package u2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function0 {
    public final int w;
    public static final i x;
    public static final i y;
    public static final i z;

    static {
        i.x = new i(0, 0);
        i.y = new i(0, 1);
        i.z = new i(0, 2);
    }

    public i(int v, int v1) {
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
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}


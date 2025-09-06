package eb;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final int w;
    public static final e x;
    public static final e y;
    public static final e z;

    static {
        e.x = new e(0, 0);
        e.y = new e(0, 1);
        e.z = new e(0, 2);
    }

    public e(int v, int v1) {
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


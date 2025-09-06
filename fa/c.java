package fa;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function0 {
    public final int w;
    public static final c x;
    public static final c y;

    static {
        c.x = new c(0, 0);
        c.y = new c(0, 1);
    }

    public c(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Unit.INSTANCE;
    }
}


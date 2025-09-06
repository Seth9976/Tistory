package s4;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class m0 extends Lambda implements Function0 {
    public final int w;
    public static final m0 x;
    public static final m0 y;

    static {
        m0.x = new m0(0, 0);
        m0.y = new m0(0, 1);
    }

    public m0(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? null : Unit.INSTANCE;
    }
}


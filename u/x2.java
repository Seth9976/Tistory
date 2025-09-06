package u;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class x2 extends Lambda implements Function0 {
    public final int w;
    public final y2 x;

    public x2(y2 y20, int v) {
        this.w = v;
        this.x = y20;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w == 0 ? ((float)this.x.n.getValue()) : ((float)this.x.n.getMaxValue());
    }
}


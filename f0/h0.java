package f0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function0 {
    public final int w;
    public final float x;
    public final Function0 y;

    public h0(int v, float f, Function0 function00) {
        this.w = v;
        this.x = f;
        this.y = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new e(this.w, this.x, this.y);
    }
}


package d0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function0 {
    public final int w;
    public final c0 x;

    public z(c0 c00, int v) {
        this.w = v;
        this.x = c00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return (float)(this.x.o.getViewport() - this.x.o.getContentPadding());
            }
            case 1: {
                return this.x.o.getScrollOffset();
            }
            default: {
                return this.x.o.getMaxScrollOffset();
            }
        }
    }
}


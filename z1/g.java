package z1;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function0 {
    public final int w;
    public static final g x;
    public static final g y;
    public static final g z;

    static {
        g.x = new g(0, 0);
        g.y = new g(0, 1);
        g.z = new g(0, 2);
    }

    public g(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return null;
            }
            case 1: {
                return new LayoutNode(true, 0, 2, null);
            }
            default: {
                return null;
            }
        }
    }
}


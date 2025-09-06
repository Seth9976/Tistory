package z1;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final int w;
    public static final i x;
    public static final i y;
    public static final i z;

    static {
        i.x = new i(1, 0);
        i.y = new i(1, 1);
        i.z = new i(1, 2);
    }

    public i(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                ((LayoutNode)object0).setCanMultiMeasure$ui_release(true);
                return Unit.INSTANCE;
            }
            case 1: {
                ((LayoutNode)object0).setVirtualLookaheadRoot$ui_release(true);
                return Unit.INSTANCE;
            }
            default: {
                GraphicsLayerScope graphicsLayerScope0 = (GraphicsLayerScope)object0;
                return Unit.INSTANCE;
            }
        }
    }
}


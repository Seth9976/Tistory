package w0;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final int w;
    public static final h x;
    public static final h y;
    public static final h z;

    static {
        h.x = new h(1, 0);
        h.y = new h(1, 1);
        h.z = new h(1, 2);
    }

    public h(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                SemanticsPropertyReceiver semanticsPropertyReceiver0 = (SemanticsPropertyReceiver)object0;
                return Unit.INSTANCE;
            }
            case 1: {
                return true;
            }
            default: {
                return true;
            }
        }
    }
}


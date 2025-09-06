package b0;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function1 {
    public final int w;
    public static final n x;
    public static final n y;
    public static final n z;

    static {
        n.x = new n(1, 0);
        n.y = new n(1, 1);
        n.z = new n(1, 2);
    }

    public n(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                ((Number)object0).intValue();
                return null;
            }
            case 1: {
                ((Number)object0).intValue();
                return null;
            }
            default: {
                return new LazyListState(((Number)((List)object0).get(0)).intValue(), ((Number)((List)object0).get(1)).intValue());
            }
        }
    }
}


package e0;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public final int w;
    public static final k x;
    public static final k y;

    static {
        k.x = new k(1, 0);
        k.y = new k(1, 1);
    }

    public k(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            return new LazyStaggeredGridState(((int[])((List)object0).get(0)), ((int[])((List)object0).get(1)), null);
        }
        ((Number)object0).intValue();
        return null;
    }
}


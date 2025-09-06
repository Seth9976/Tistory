package u;

import androidx.compose.foundation.OverscrollConfiguration;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g2 extends Lambda implements Function0 {
    public final int w;
    public static final g2 x;
    public static final g2 y;

    static {
        g2.x = new g2(0, 0);
        g2.y = new g2(0, 1);
    }

    public g2(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? new OverscrollConfiguration(0L, null, 3, null) : l1.a;
    }
}


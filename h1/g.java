package h1;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function0 {
    public final int w;
    public static final g x;
    public static final g y;

    static {
        g.x = new g(0, 0);
        g.y = new g(0, 1);
    }

    public g(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? null : new f(new LinkedHashMap());
    }
}


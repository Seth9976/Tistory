package h1;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final int w;
    public static final e x;
    public static final e y;

    static {
        e.x = new e(1, 0);
        e.y = new e(1, 1);
    }

    public e(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return this.w != 0 ? object0 : new f(((Map)object0));
    }
}


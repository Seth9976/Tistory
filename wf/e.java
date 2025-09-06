package wf;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function2 {
    public final int w;
    public static final e x;
    public static final e y;

    static {
        e.x = new e(2, 0);
        e.y = new e(2, 1);
    }

    public e(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return this.w != 0 ? object0 : new c(object0, object1);
    }
}


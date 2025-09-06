package j0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function0 {
    public final int w;
    public static final n x;
    public static final n y;

    static {
        n.x = new n(0, 0);
        n.y = new n(0, 1);
    }

    public n(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return false;
    }
}


package s0;

import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function0 {
    public final int w;
    public static final d x;
    public static final d y;

    static {
        d.x = new d(0, 0);
        d.y = new d(0, 1);
    }

    public d(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? "DEFAULT_TEST_TAG" : UUID.randomUUID();
    }
}


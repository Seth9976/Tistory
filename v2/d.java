package v2;

import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function0 {
    public final int w;
    public static final d x;
    public static final d y;
    public static final d z;

    static {
        d.x = new d(0, 0);
        d.y = new d(0, 1);
        d.z = new d(0, 2);
    }

    public d(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return UUID.randomUUID();
            }
            case 1: {
                return "DEFAULT_TEST_TAG";
            }
            default: {
                return UUID.randomUUID();
            }
        }
    }
}


package xa;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final int w;
    public static final b x;
    public static final b y;

    static {
        b.x = new b(0, 0);
        b.y = new b(0, 1);
    }

    public b(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Unit.INSTANCE;
    }
}


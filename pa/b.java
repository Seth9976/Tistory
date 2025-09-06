package pa;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final int w;
    public static final b x;
    public static final b y;

    static {
        b.x = new b(1, 0);
        b.y = new b(1, 1);
    }

    public b(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            ((Number)object0).intValue();
            return Unit.INSTANCE;
        }
        ((Number)object0).intValue();
        return Unit.INSTANCE;
    }
}


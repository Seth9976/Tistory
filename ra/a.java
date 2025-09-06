package ra;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final int w;
    public static final a x;
    public static final a y;

    static {
        a.x = new a(1, 0);
        a.y = new a(1, 1);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            ((Number)object0).intValue();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(((List)object0), "it");
        return Unit.INSTANCE;
    }
}


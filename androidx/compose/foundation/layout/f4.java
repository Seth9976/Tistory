package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f4 extends Lambda implements Function1 {
    public final int w;
    public static final f4 x;
    public static final f4 y;
    public static final f4 z;

    static {
        f4.x = new f4(1, 0);
        f4.y = new f4(1, 1);
        f4.z = new f4(1, 2);
    }

    public f4(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Throwable throwable1 = (Throwable)object0;
                return Unit.INSTANCE;
            }
            case 1: {
                Throwable throwable2 = (Throwable)object0;
                return Unit.INSTANCE;
            }
            default: {
                Throwable throwable0 = (Throwable)object0;
                return Unit.INSTANCE;
            }
        }
    }
}


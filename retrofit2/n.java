package retrofit2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function1 {
    public final int w;
    public final Call x;

    public n(Call call0, int v) {
        this.w = v;
        this.x = call0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Throwable throwable1 = (Throwable)object0;
                this.x.cancel();
                return Unit.INSTANCE;
            }
            case 1: {
                Throwable throwable2 = (Throwable)object0;
                this.x.cancel();
                return Unit.INSTANCE;
            }
            default: {
                Throwable throwable0 = (Throwable)object0;
                this.x.cancel();
                return Unit.INSTANCE;
            }
        }
    }
}


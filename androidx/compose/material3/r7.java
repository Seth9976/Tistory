package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class r7 extends Lambda implements Function1 {
    public final int w;
    public final Function2 x;
    public final Long y;

    public r7(Function2 function20, Long long0, int v) {
        this.w = v;
        this.x = function20;
        this.y = long0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            this.x.invoke(this.y, ((Long)object0));
            return Unit.INSTANCE;
        }
        this.x.invoke(((Long)object0), this.y);
        return Unit.INSTANCE;
    }
}


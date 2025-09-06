package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function1 {
    public final Function1 w;

    public o(Function1 function10) {
        this.w = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return new DismissState(((DismissValue)object0), this.w);
    }
}


package androidx.compose.material3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a9 extends Lambda implements Function1 {
    public final Function1 w;

    public a9(Function1 function10) {
        this.w = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return new DrawerState(((DrawerValue)object0), this.w);
    }
}


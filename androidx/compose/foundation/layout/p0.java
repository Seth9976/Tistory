package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class p0 extends Lambda implements Function1 {
    public final Function3 w;

    public p0(Function3 function30) {
        this.w = function30;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ComposableLambdaKt.composableLambdaInstance(307858874, true, new o0(((FlowLayoutOverflowState)object0), this.w));
    }
}


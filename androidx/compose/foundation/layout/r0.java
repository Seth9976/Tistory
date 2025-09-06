package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function1 {
    public final Function3 w;

    public r0(Function3 function30) {
        this.w = function30;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ComposableLambdaKt.composableLambdaInstance(0x3583EF1B, true, new q0(((FlowLayoutOverflowState)object0), this.w));
    }
}


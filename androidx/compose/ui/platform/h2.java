package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h2 extends Lambda implements Function1 {
    public final i2 w;
    public final Function2 x;

    public h2(i2 i20, Function2 function20) {
        this.w = i20;
        this.x = function20;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        i2 i20 = this.w;
        if(!i20.c) {
            Lifecycle lifecycle0 = ((ViewTreeOwners)object0).getLifecycleOwner().getLifecycle();
            Function2 function20 = this.x;
            i20.e = function20;
            if(i20.d == null) {
                i20.d = lifecycle0;
                lifecycle0.addObserver(i20);
                return Unit.INSTANCE;
            }
            if(lifecycle0.getCurrentState().isAtLeast(State.CREATED)) {
                ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(-2000640158, true, new g2(i20, function20));
                i20.b.setContent(composableLambda0);
            }
        }
        return Unit.INSTANCE;
    }
}


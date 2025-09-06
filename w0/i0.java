package w0;

import androidx.compose.material3.TooltipState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class i0 extends SuspendLambda implements Function2 {
    public boolean o;
    public final TooltipState p;

    public i0(TooltipState tooltipState0, Continuation continuation0) {
        this.p = tooltipState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new i0(this.p, continuation0);
        continuation1.o = ((Boolean)object0).booleanValue();
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Boolean)object0).booleanValue();
        return ((i0)this.create(((Boolean)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(!this.o) {
            this.p.dismiss();
        }
        return Unit.INSTANCE;
    }
}


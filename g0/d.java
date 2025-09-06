package g0;

import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class d extends SuspendLambda implements Function2 {
    public int o;
    public final BringIntoViewResponderNode p;
    public final LayoutCoordinates q;
    public final Function0 r;

    public d(BringIntoViewResponderNode bringIntoViewResponderNode0, LayoutCoordinates layoutCoordinates0, Function0 function00, Continuation continuation0) {
        this.p = bringIntoViewResponderNode0;
        this.q = layoutCoordinates0;
        this.r = function00;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new d(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                c c0 = new c(this.p, this.q, this.r);
                this.o = 1;
                return this.p.getResponder().bringChildIntoView(c0, this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


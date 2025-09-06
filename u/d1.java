package u;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.ui.geometry.Offset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import qd.a;

public final class d1 extends SuspendLambda implements Function3 {
    public final int o;
    public int p;
    public PressGestureScope q;
    public long r;
    public final AbstractClickableNode s;

    public d1(AbstractClickableNode abstractClickableNode0, Continuation continuation0, int v) {
        this.o = v;
        this.s = abstractClickableNode0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.o != 0) {
            d1 d10 = new d1(((h1)this.s), ((Continuation)object2), 1);
            d10.q = (PressGestureScope)object0;
            d10.r = ((Offset)object1).unbox-impl();
            return d10.invokeSuspend(Unit.INSTANCE);
        }
        d1 d11 = new d1(((ClickableNode)this.s), ((Continuation)object2), 0);
        d11.q = (PressGestureScope)object0;
        d11.r = ((Offset)object1).unbox-impl();
        return d11.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        if(this.o != 0) {
            Unit unit0 = a.getCOROUTINE_SUSPENDED();
            switch(this.p) {
                case 0: {
                    ResultKt.throwOnFailure(object0);
                    PressGestureScope pressGestureScope0 = this.q;
                    long v = this.r;
                    h1 h10 = (h1)this.s;
                    if(h10.getEnabled()) {
                        this.p = 1;
                        return h10.handlePressInteraction-d-4ec7I(pressGestureScope0, v, this) == unit0 ? unit0 : Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
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
        Unit unit1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PressGestureScope pressGestureScope1 = this.q;
                long v1 = this.r;
                ClickableNode clickableNode0 = (ClickableNode)this.s;
                if(clickableNode0.getEnabled()) {
                    this.p = 1;
                    return clickableNode0.handlePressInteraction-d-4ec7I(pressGestureScope1, v1, this) == unit1 ? unit1 : Unit.INSTANCE;
                }
                return Unit.INSTANCE;
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


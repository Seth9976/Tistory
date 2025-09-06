package p0;

import androidx.compose.material.AnchoredDraggableKt;
import androidx.compose.material.AnchoredDraggableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import qd.a;

public final class v extends SuspendLambda implements Function1 {
    public int o;
    public final AnchoredDraggableState p;
    public final Function3 q;

    public v(AnchoredDraggableState anchoredDraggableState0, Continuation continuation0, Function3 function30) {
        this.p = anchoredDraggableState0;
        this.q = function30;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new v(this.p, continuation0, this.q);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((v)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                t t0 = new t(this.p, 0);
                u u0 = new u(this.p, null, this.q);
                this.o = 1;
                return AnchoredDraggableKt.access$restartable(t0, u0, this) == object1 ? object1 : Unit.INSTANCE;
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


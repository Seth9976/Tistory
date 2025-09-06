package p0;

import androidx.compose.material.AnchoredDraggableKt;
import androidx.compose.material.AnchoredDraggableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import qd.a;

public final class y extends SuspendLambda implements Function1 {
    public int o;
    public final AnchoredDraggableState p;
    public final Object q;
    public final Function4 r;

    public y(AnchoredDraggableState anchoredDraggableState0, Object object0, Function4 function40, Continuation continuation0) {
        this.p = anchoredDraggableState0;
        this.q = object0;
        this.r = function40;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new y(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((y)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AnchoredDraggableState.access$setDragTarget(this.p, this.q);
                t t0 = new t(this.p, 1);
                x x0 = new x(this.r, this.p, null);
                this.o = 1;
                return AnchoredDraggableKt.access$restartable(t0, x0, this) == object1 ? object1 : Unit.INSTANCE;
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


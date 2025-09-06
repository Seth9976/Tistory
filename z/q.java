package z;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import qd.a;

public final class q extends SuspendLambda implements Function1 {
    public int o;
    public final AnchoredDraggableState p;
    public final Function3 q;

    public q(AnchoredDraggableState anchoredDraggableState0, Continuation continuation0, Function3 function30) {
        this.p = anchoredDraggableState0;
        this.q = function30;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new q(this.p, continuation0, this.q);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((q)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        AnchoredDraggableState anchoredDraggableState0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                o o0 = new o(anchoredDraggableState0, 0);
                p p0 = new p(anchoredDraggableState0, null, this.q);
                this.o = 1;
                if(AnchoredDraggableKt.access$restartable(o0, p0, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object2 = anchoredDraggableState0.getAnchors().closestAnchor(anchoredDraggableState0.getOffset());
        if(object2 != null) {
            float f = anchoredDraggableState0.getAnchors().positionOf(object2);
            if(Math.abs(anchoredDraggableState0.getOffset() - f) < 0.5f && ((Boolean)anchoredDraggableState0.getConfirmValueChange$foundation_release().invoke(object2)).booleanValue()) {
                AnchoredDraggableState.access$setSettledValue(anchoredDraggableState0, object2);
                AnchoredDraggableState.access$setCurrentValue(anchoredDraggableState0, object2);
            }
        }
        return Unit.INSTANCE;
    }
}


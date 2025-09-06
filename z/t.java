package z;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import qd.a;

public final class t extends SuspendLambda implements Function1 {
    public int o;
    public final AnchoredDraggableState p;
    public final Object q;
    public final Function4 r;

    public t(AnchoredDraggableState anchoredDraggableState0, Object object0, Function4 function40, Continuation continuation0) {
        this.p = anchoredDraggableState0;
        this.q = object0;
        this.r = function40;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new t(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((t)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Object object2 = this.q;
        AnchoredDraggableState anchoredDraggableState0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AnchoredDraggableState.access$setDragTarget(anchoredDraggableState0, object2);
                o o0 = new o(anchoredDraggableState0, 1);
                s s0 = new s(this.r, anchoredDraggableState0, null);
                this.o = 1;
                if(AnchoredDraggableKt.access$restartable(o0, s0, this) == object1) {
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
        if(((Boolean)anchoredDraggableState0.getConfirmValueChange$foundation_release().invoke(object2)).booleanValue()) {
            anchoredDraggableState0.o.dragTo(anchoredDraggableState0.getAnchors().positionOf(object2), anchoredDraggableState0.getLastVelocity());
            AnchoredDraggableState.access$setSettledValue(anchoredDraggableState0, object2);
            AnchoredDraggableState.access$setCurrentValue(anchoredDraggableState0, object2);
        }
        return Unit.INSTANCE;
    }
}


package z;

import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchors;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import qd.a;

public final class d extends SuspendLambda implements Function4 {
    public int o;
    public AnchoredDragScope p;
    public DraggableAnchors q;
    public Object r;
    public final AnchoredDraggableState s;

    public d(AnchoredDraggableState anchoredDraggableState0, Continuation continuation0) {
        this.s = anchoredDraggableState0;
        super(4, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        d d0 = new d(this.s, ((Continuation)object3));
        d0.p = (AnchoredDragScope)object0;
        d0.q = (DraggableAnchors)object1;
        d0.r = object2;
        return d0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AnchoredDragScope anchoredDragScope0 = this.p;
                DraggableAnchors draggableAnchors0 = this.q;
                Object object2 = this.r;
                float f = this.s.getLastVelocity();
                this.p = null;
                this.q = null;
                this.o = 1;
                return AnchoredDraggableKt.access$animateTo(this.s, f, anchoredDragScope0, draggableAnchors0, object2, this) == object1 ? object1 : Unit.INSTANCE;
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


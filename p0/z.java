package p0;

import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.material.AnchoredDragScope;
import androidx.compose.material.AnchoredDraggableState.draggableState.1.dragScope.1;
import androidx.compose.material.DraggableAnchors;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import qd.a;
import s4.e0;

public final class z extends SuspendLambda implements Function3 {
    public final int o;
    public int p;
    public Object q;
    public Object r;

    public z(int v, Continuation continuation0) {
        this.o = 1;
        super(v, continuation0);
    }

    public z(DraggableState draggableState0, Function2 function20, Continuation continuation0, int v) {
        this.o = v;
        this.q = draggableState0;
        this.r = function20;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        switch(this.o) {
            case 0: {
                AnchoredDragScope anchoredDragScope1 = (AnchoredDragScope)object0;
                DraggableAnchors draggableAnchors1 = (DraggableAnchors)object1;
                return new z(((androidx.compose.material.AnchoredDraggableState.draggableState.1)this.q), ((Function2)this.r), ((Continuation)object2), 0).invokeSuspend(Unit.INSTANCE);
            }
            case 1: {
                z z0 = new z(3, ((Continuation)object2));
                z0.q = (e0)object0;
                z0.r = (e0)object1;
                return z0.invokeSuspend(Unit.INSTANCE);
            }
            default: {
                androidx.compose.material3.internal.AnchoredDragScope anchoredDragScope0 = (androidx.compose.material3.internal.AnchoredDragScope)object0;
                androidx.compose.material3.internal.DraggableAnchors draggableAnchors0 = (androidx.compose.material3.internal.DraggableAnchors)object1;
                return new z(((androidx.compose.material3.internal.AnchoredDraggableState.draggableState.1)this.q), ((Function2)this.r), ((Continuation)object2), 2).invokeSuspend(Unit.INSTANCE);
            }
        }
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        switch(this.o) {
            case 0: {
                Unit unit1 = a.getCOROUTINE_SUSPENDED();
                switch(this.p) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        AnchoredDraggableState.draggableState.1.dragScope.1 anchoredDraggableState$draggableState$1$dragScope$11 = ((androidx.compose.material.AnchoredDraggableState.draggableState.1)this.q).a;
                        this.p = 1;
                        return ((Function2)this.r).invoke(anchoredDraggableState$draggableState$1$dragScope$11, this) == unit1 ? unit1 : Unit.INSTANCE;
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
            case 1: {
                e0 e00 = a.getCOROUTINE_SUSPENDED();
                switch(this.p) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        e0 e01 = (e0)this.q;
                        e0 e02 = (e0)this.r;
                        this.q = e02;
                        this.p = 1;
                        e01.d.close();
                        return Unit.INSTANCE == e00 ? e00 : e02;
                    }
                    case 1: {
                        e00 = (e0)this.q;
                        ResultKt.throwOnFailure(object0);
                        return e00;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            default: {
                Unit unit0 = a.getCOROUTINE_SUSPENDED();
                switch(this.p) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        androidx.compose.material3.internal.AnchoredDraggableState.draggableState.1.dragScope.1 anchoredDraggableState$draggableState$1$dragScope$10 = ((androidx.compose.material3.internal.AnchoredDraggableState.draggableState.1)this.q).a;
                        this.p = 1;
                        return ((Function2)this.r).invoke(anchoredDraggableState$draggableState$1$dragScope$10, this) == unit0 ? unit0 : Unit.INSTANCE;
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
    }
}


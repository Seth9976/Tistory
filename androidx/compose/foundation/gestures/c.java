package androidx.compose.foundation.gestures;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import qd.a;

public final class c extends SuspendLambda implements Function3 {
    public int o;
    public AnchoredDragScope p;
    public final Function2 q;
    public final d r;

    public c(Function2 function20, d d0, Continuation continuation0) {
        this.q = function20;
        this.r = d0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        DraggableAnchors draggableAnchors0 = (DraggableAnchors)object1;
        c c0 = new c(this.q, this.r, ((Continuation)object2));
        c0.p = (AnchoredDragScope)object0;
        return c0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                b b0 = new b(this.r, this.p);
                this.o = 1;
                return this.q.invoke(b0, this) == object1 ? object1 : Unit.INSTANCE;
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


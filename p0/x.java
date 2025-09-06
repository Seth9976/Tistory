package p0;

import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.material.DraggableAnchors;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import qd.a;

public final class x extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Function4 q;
    public final AnchoredDraggableState r;

    public x(Function4 function40, AnchoredDraggableState anchoredDraggableState0, Continuation continuation0) {
        this.q = function40;
        this.r = anchoredDraggableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new x(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((x)this.create(((Pair)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Pair pair0 = (Pair)this.p;
                this.o = 1;
                return this.q.invoke(this.r.o, ((DraggableAnchors)pair0.component1()), pair0.component2(), this) == object1 ? object1 : Unit.INSTANCE;
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


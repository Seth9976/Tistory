package p0;

import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.material.SwipeableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class ca extends SuspendLambda implements Function2 {
    public Object o;
    public final float p;
    public final SwipeableState q;

    public ca(SwipeableState swipeableState0, float f, Continuation continuation0) {
        this.p = f;
        this.q = swipeableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new ca(this.q, this.p, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((ca)this.create(((DragScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        DragScope dragScope0 = (DragScope)this.o;
        float f = this.q.g.getFloatValue();
        dragScope0.dragBy(this.p - f);
        return Unit.INSTANCE;
    }
}


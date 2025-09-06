package z;

import androidx.compose.foundation.gestures.NestedScrollScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class h2 extends SuspendLambda implements Function2 {
    public Object o;
    public final long p;

    public h2(long v, Continuation continuation0) {
        this.p = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new h2(this.p, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((h2)this.create(((NestedScrollScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        ((NestedScrollScope)this.o).scrollBy-OzD1aCk(this.p, 1);
        return Unit.INSTANCE;
    }
}


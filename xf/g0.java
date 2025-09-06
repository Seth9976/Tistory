package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlinx.coroutines.TimeoutCancellationException;

public final class g0 extends SuspendLambda implements Function1 {
    public final long o;

    public g0(long v, Continuation continuation0) {
        this.o = v;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new g0(this.o, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((g0)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
        throw null;
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        throw new TimeoutCancellationException("Timed out waiting for " + Duration.toString-impl(this.o));
    }
}


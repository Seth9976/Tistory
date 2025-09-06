package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

public final class q0 extends SuspendLambda implements Function2 {
    public final Callable o;
    public final CancellableContinuationImpl p;

    public q0(Callable callable0, CancellableContinuationImpl cancellableContinuationImpl0, Continuation continuation0) {
        this.o = callable0;
        this.p = cancellableContinuationImpl0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new q0(this.o, this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((q0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = this.p;
        ResultKt.throwOnFailure(object0);
        try {
            cancellableContinuationImpl0.resumeWith(Result.constructor-impl(this.o.call()));
        }
        catch(Throwable throwable0) {
            cancellableContinuationImpl0.resumeWith(Result.constructor-impl(ResultKt.createFailure(throwable0)));
        }
        return Unit.INSTANCE;
    }
}


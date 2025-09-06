package kotlinx.coroutines.flow.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Semaphore;
import qd.a;

public final class c extends SuspendLambda implements Function2 {
    public int o;
    public final Flow p;
    public final SendingCollector q;
    public final Semaphore r;

    public c(Flow flow0, SendingCollector sendingCollector0, Semaphore semaphore0, Continuation continuation0) {
        this.p = flow0;
        this.q = sendingCollector0;
        this.r = semaphore0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Semaphore semaphore0 = this.r;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    this.o = 1;
                    if(this.p.collect(this.q, this) == object1) {
                        return object1;
                    label_8:
                        ResultKt.throwOnFailure(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    semaphore0.release();
                    throw throwable0;
                }
            }
            case 1: {
                goto label_8;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        semaphore0.release();
        return Unit.INSTANCE;
    }
}


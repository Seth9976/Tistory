package androidx.work;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class a extends SuspendLambda implements Function2 {
    public int o;
    public final CoroutineWorker p;

    public a(CoroutineWorker coroutineWorker0, Continuation continuation0) {
        this.p = coroutineWorker0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a(this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        CoroutineWorker coroutineWorker0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    this.o = 1;
                    object0 = coroutineWorker0.doWork(this);
                    if(object0 == object1) {
                        return object1;
                    label_9:
                        ResultKt.throwOnFailure(object0);
                    }
                    coroutineWorker0.getFuture$work_runtime_release().set(((Result)object0));
                    return Unit.INSTANCE;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                goto label_9;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        coroutineWorker0.getFuture$work_runtime_release().setException(throwable0);
        return Unit.INSTANCE;
    }
}


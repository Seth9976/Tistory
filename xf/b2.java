package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class b2 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Flow q;
    public final CompletableDeferred r;

    public b2(Flow flow0, CompletableDeferred completableDeferred0, Continuation continuation0) {
        this.q = flow0;
        this.r = completableDeferred0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new b2(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        CompletableDeferred completableDeferred0 = this.r;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.p;
                try {
                    a2 a20 = new a2(new ObjectRef(), coroutineScope0, completableDeferred0);
                    this.o = 1;
                    return this.q.collect(a20, this) == object1 ? object1 : Unit.INSTANCE;
                label_11:
                    ResultKt.throwOnFailure(object0);
                    return Unit.INSTANCE;
                }
                catch(Throwable throwable0) {
                    completableDeferred0.completeExceptionally(throwable0);
                    throw throwable0;
                }
            }
            case 1: {
                goto label_11;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


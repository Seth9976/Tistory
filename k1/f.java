package k1;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import qd.a;

public final class f extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Function1 q;
    public final AtomicReference r;
    public final Function2 s;

    public f(AtomicReference atomicReference0, Function1 function10, Function2 function20, Continuation continuation0) {
        this.q = function10;
        this.r = atomicReference0;
        this.s = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new f(this.r, this.q, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        e e2;
        e e0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        AtomicReference atomicReference0 = this.r;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.p;
                e0 = new e(JobKt.getJob(coroutineScope0.getCoroutineContext()), this.q.invoke(coroutineScope0));
                e e1 = (e)atomicReference0.getAndSet(e0);
                if(e1 != null) {
                    Job job0 = e1.a;
                    if(job0 != null) {
                        this.p = e0;
                        this.o = 1;
                        if(JobKt.cancelAndJoin(job0, this) == object1) {
                            return object1;
                        }
                    }
                }
                goto label_17;
            }
            case 1: {
                e0 = (e)this.p;
                ResultKt.throwOnFailure(object0);
                try {
                label_17:
                    this.p = e0;
                    this.o = 2;
                    object0 = this.s.invoke(e0.b, this);
                }
                catch(Throwable throwable0) {
                    e2 = e0;
                    goto label_32;
                }
                if(object0 == object1) {
                    return object1;
                }
                e2 = e0;
                break;
            }
            case 2: {
                e2 = (e)this.p;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
            label_32:
                while(!atomicReference0.compareAndSet(e2, null) && atomicReference0.get() == e2) {
                }
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(!atomicReference0.compareAndSet(e2, null) && atomicReference0.get() == e2) {
        }
        return object0;
    }
}


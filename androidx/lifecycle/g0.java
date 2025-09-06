package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import qd.a;

public final class g0 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Lifecycle q;
    public final State r;
    public final Function2 s;

    public g0(Lifecycle lifecycle0, State lifecycle$State0, Function2 function20, Continuation continuation0) {
        this.q = lifecycle0;
        this.r = lifecycle$State0;
        this.s = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new g0(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        LifecycleController lifecycleController1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Job job0 = (Job)((CoroutineScope)this.p).getCoroutineContext().get(Job.Key);
                if(job0 == null) {
                    throw new IllegalStateException("when[State] methods should have a parent job");
                }
                PausingDispatcher pausingDispatcher0 = new PausingDispatcher();
                LifecycleController lifecycleController0 = new LifecycleController(this.q, this.r, pausingDispatcher0.dispatchQueue, job0);
                try {
                    this.p = lifecycleController0;
                    this.o = 1;
                    object0 = BuildersKt.withContext(pausingDispatcher0, this.s, this);
                }
                catch(Throwable throwable0) {
                    lifecycleController1 = lifecycleController0;
                    lifecycleController1.finish();
                    throw throwable0;
                }
                if(object0 == object1) {
                    return object1;
                }
                lifecycleController1 = lifecycleController0;
                break;
            }
            case 1: {
                lifecycleController1 = (LifecycleController)this.p;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                lifecycleController1.finish();
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        lifecycleController1.finish();
        return object0;
    }
}


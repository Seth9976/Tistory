package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

public final class y extends SuspendLambda implements Function2 {
    public Object o;
    public final LifecycleCoroutineScopeImpl p;

    public y(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl0, Continuation continuation0) {
        this.p = lifecycleCoroutineScopeImpl0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new y(this.p, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((y)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CoroutineScope coroutineScope0 = (CoroutineScope)this.o;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl0 = this.p;
        if(lifecycleCoroutineScopeImpl0.getLifecycle$lifecycle_common().getCurrentState().compareTo(State.INITIALIZED) >= 0) {
            lifecycleCoroutineScopeImpl0.getLifecycle$lifecycle_common().addObserver(lifecycleCoroutineScopeImpl0);
            return Unit.INSTANCE;
        }
        JobKt.cancel$default(coroutineScope0.getCoroutineContext(), null, 1, null);
        return Unit.INSTANCE;
    }
}


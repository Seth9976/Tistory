package i4;

import androidx.compose.runtime.ProduceStateScope;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class e extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Lifecycle q;
    public final State r;
    public final CoroutineContext s;
    public final Flow t;

    public e(Lifecycle lifecycle0, State lifecycle$State0, CoroutineContext coroutineContext0, Flow flow0, Continuation continuation0) {
        this.q = lifecycle0;
        this.r = lifecycle$State0;
        this.s = coroutineContext0;
        this.t = flow0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new e(this.q, this.r, this.s, this.t, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e)this.create(((ProduceStateScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                d d0 = new d(this.s, this.t, ((ProduceStateScope)this.p), null);
                this.o = 1;
                return RepeatOnLifecycleKt.repeatOnLifecycle(this.q, this.r, d0, this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


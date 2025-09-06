package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class d0 extends SuspendLambda implements Function2 {
    public int o;
    public final LiveDataScopeImpl p;
    public final Object q;

    public d0(LiveDataScopeImpl liveDataScopeImpl0, Object object0, Continuation continuation0) {
        this.p = liveDataScopeImpl0;
        this.q = object0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new d0(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        LiveDataScopeImpl liveDataScopeImpl0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                if(liveDataScopeImpl0.getTarget$lifecycle_livedata_release().clearSource$lifecycle_livedata_release(this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        liveDataScopeImpl0.getTarget$lifecycle_livedata_release().setValue(this.q);
        return Unit.INSTANCE;
    }
}


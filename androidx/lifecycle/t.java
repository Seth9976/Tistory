package androidx.lifecycle;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.channels.ProducerScope;
import qd.a;

public final class t extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final LiveData q;

    public t(LiveData liveData0, Continuation continuation0) {
        this.q = liveData0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new t(this.q, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((t)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Throwable throwable1;
        Observer observer0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        LiveData liveData0 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                observer0 = new q(((ProducerScope)this.p), 0);
                MainCoroutineDispatcher mainCoroutineDispatcher0 = Dispatchers.getMain().getImmediate();
                r r0 = new r(liveData0, ((q)observer0), null);
                this.p = observer0;
                this.o = 1;
                if(BuildersKt.withContext(mainCoroutineDispatcher0, r0, this) == object1) {
                    return object1;
                }
                goto label_14;
            }
            case 1: {
                observer0 = (Observer)this.p;
                ResultKt.throwOnFailure(object0);
                try {
                label_14:
                    this.p = observer0;
                    this.o = 2;
                    if(DelayKt.awaitCancellation(this) != object1) {
                        throw new KotlinNothingValueException();
                    }
                    return object1;
                }
                catch(Throwable throwable0) {
                    goto label_22;
                }
            }
            case 2: {
                observer0 = (Observer)this.p;
                try {
                    ResultKt.throwOnFailure(object0);
                    throw new KotlinNothingValueException();
                }
                catch(Throwable throwable0) {
                label_22:
                    CoroutineContext coroutineContext0 = Dispatchers.getMain().getImmediate().plus(NonCancellable.INSTANCE);
                    s s0 = new s(liveData0, observer0, null);
                    this.p = throwable0;
                    this.o = 3;
                    if(BuildersKt.withContext(coroutineContext0, s0, this) == object1) {
                        return object1;
                    }
                    throwable1 = throwable0;
                    throw throwable1;
                }
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throwable1 = (Throwable)this.p;
        ResultKt.throwOnFailure(object0);
        throw throwable1;
    }
}


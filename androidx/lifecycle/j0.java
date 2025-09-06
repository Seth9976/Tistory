package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import qd.a;

public final class j0 extends SuspendLambda implements Function2 {
    public Mutex o;
    public Function2 p;
    public int q;
    public final Mutex r;
    public final Function2 s;

    public j0(Mutex mutex0, Function2 function20, Continuation continuation0) {
        this.r = mutex0;
        this.s = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new j0(this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Throwable throwable1;
        Mutex mutex2;
        Function2 function20;
        Mutex mutex0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                mutex0 = this.r;
                this.o = mutex0;
                function20 = this.s;
                this.p = function20;
                this.q = 1;
                if(mutex0.lock(null, this) == object1) {
                    return object1;
                }
                goto label_15;
            }
            case 1: {
                function20 = this.p;
                Mutex mutex1 = this.o;
                ResultKt.throwOnFailure(object0);
                mutex0 = mutex1;
                try {
                label_15:
                    i0 i00 = new i0(function20, null);
                    this.o = mutex0;
                    this.p = null;
                    this.q = 2;
                    if(CoroutineScopeKt.coroutineScope(i00, this) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    mutex2 = mutex0;
                    throwable1 = throwable0;
                    mutex2.unlock(null);
                    throw throwable1;
                }
                mutex2 = mutex0;
                break;
            }
            case 2: {
                try {
                    mutex2 = this.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable1) {
                }
                mutex2.unlock(null);
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        mutex2.unlock(null);
        return Unit.INSTANCE;
    }
}


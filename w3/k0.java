package w3;

import androidx.datastore.core.SimpleActor;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class k0 extends SuspendLambda implements Function2 {
    public Function2 o;
    public int p;
    public final SimpleActor q;

    public k0(SimpleActor simpleActor0, Continuation continuation0) {
        this.q = simpleActor0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new k0(this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Function2 function20;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        SimpleActor simpleActor0 = this.q;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(simpleActor0.d.get() <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                goto label_13;
            }
            case 1: {
                function20 = this.o;
                ResultKt.throwOnFailure(object0);
                goto label_20;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(simpleActor0.d.decrementAndGet() == 0) {
                return Unit.INSTANCE;
            }
        label_13:
            CoroutineScopeKt.ensureActive(simpleActor0.a);
            function20 = simpleActor0.b;
            this.o = function20;
            this.p = 1;
            object0 = simpleActor0.c.receive(this);
            if(object0 == object1) {
                return object1;
            }
        label_20:
            this.o = null;
            this.p = 2;
        }
        while(function20.invoke(object0, this) != object1);
        return object1;
    }
}


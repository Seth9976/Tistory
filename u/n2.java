package u;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import qd.a;

public final class n2 extends SuspendLambda implements Function2 {
    public int o;
    public final Job p;
    public final q2 q;

    public n2(Job job0, q2 q20, Continuation continuation0) {
        this.p = job0;
        this.q = q20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new n2(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((n2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Unit unit0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Job job0 = this.p;
                if(job0 != null) {
                    this.o = 1;
                    if(job0.join(this) == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.o = 2;
        q2 q20 = this.q;
        if(q20.n <= 0) {
            unit0 = Unit.INSTANCE;
        }
        else {
            p2 p20 = new p2(q20, null);
            unit0 = BuildersKt.withContext(q1.a, p20, this);
            if(unit0 != a.getCOROUTINE_SUSPENDED()) {
                unit0 = Unit.INSTANCE;
            }
        }
        return unit0 == object1 ? object1 : Unit.INSTANCE;
    }
}


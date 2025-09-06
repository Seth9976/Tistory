package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class t0 extends SuspendLambda implements Function4 {
    public int o;
    public Throwable p;
    public long q;
    public final long r;
    public final Function2 s;

    public t0(long v, Function2 function20, Continuation continuation0) {
        this.r = v;
        this.s = function20;
        super(4, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        FlowCollector flowCollector0 = (FlowCollector)object0;
        t0 t00 = new t0(this.r, this.s, ((Continuation)object3));
        t00.p = (Throwable)object1;
        t00.q = ((Number)object2).longValue();
        return t00.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        boolean z = true;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Throwable throwable0 = this.p;
                if(this.q >= this.r) {
                    return Boxing.boxBoolean(false);
                }
                this.o = 1;
                object0 = this.s.invoke(throwable0, this);
                if(object0 == object1) {
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
        if(!((Boolean)object0).booleanValue()) {
            z = false;
        }
        return Boxing.boxBoolean(z);
    }
}


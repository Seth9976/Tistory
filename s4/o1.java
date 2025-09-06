package s4;

import java.util.concurrent.Executor;
import kotlin.Function;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class o1 extends SuspendLambda implements Function3 {
    public final int o;
    public int p;
    public Object q;
    public Object r;
    public Object s;
    public final Function t;

    public o1(Executor executor0, Function2 function20, Continuation continuation0) {
        this.o = 0;
        this.s = executor0;
        this.t = function20;
        super(3, continuation0);
    }

    public o1(Continuation continuation0, Object object0, Function1 function10) {
        this.o = 1;
        this.t = function10;
        this.q = object0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.o != 0) {
            o1 o10 = new o1(((Continuation)object2), this.q, ((Function1)this.t));
            o10.r = (FlowCollector)object0;
            o10.s = (Throwable)object1;
            return o10.invokeSuspend(Unit.INSTANCE);
        }
        o1 o11 = new o1(((Executor)this.s), ((Function2)this.t), ((Continuation)object2));
        o11.q = object0;
        o11.r = object1;
        return o11.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        if(this.o != 0) {
            Unit unit0 = a.getCOROUTINE_SUSPENDED();
            switch(this.p) {
                case 0: {
                    ResultKt.throwOnFailure(object0);
                    FlowCollector flowCollector0 = (FlowCollector)this.r;
                    Throwable throwable0 = (Throwable)this.s;
                    if(!((Boolean)((Function1)this.t).invoke(throwable0)).booleanValue()) {
                        throw throwable0;
                    }
                    this.r = null;
                    this.p = 1;
                    return flowCollector0.emit(this.q, this) == unit0 ? unit0 : Unit.INSTANCE;
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
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Object object2 = this.q;
                Object object3 = this.r;
                CoroutineDispatcher coroutineDispatcher0 = ExecutorsKt.from(((Executor)this.s));
                n1 n10 = new n1(((Function2)this.t), object2, object3, null);
                this.q = null;
                this.p = 1;
                object0 = BuildersKt.withContext(coroutineDispatcher0, n10, this);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


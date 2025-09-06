package s4;

import kotlin.Function;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class w1 extends SuspendLambda implements Function3 {
    public final int o;
    public int p;
    public Object q;
    public Object r;
    public final Function s;

    public w1(Function function0, Continuation continuation0, int v) {
        this.o = v;
        this.s = function0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        switch(this.o) {
            case 0: {
                w1 w11 = new w1(((Function3)this.s), ((Continuation)object2), 0);
                w11.q = object0;
                w11.r = object1;
                return w11.invokeSuspend(Unit.INSTANCE);
            }
            case 1: {
                w1 w12 = new w1(((Function2)this.s), ((Continuation)object2), 1);
                w12.r = (FlowCollector)object0;
                w12.q = object1;
                return w12.invokeSuspend(Unit.INSTANCE);
            }
            default: {
                w1 w10 = new w1(((Function3)this.s), ((Continuation)object2), 2);
                w10.q = (FlowCollector)object0;
                w10.r = (Object[])object1;
                return w10.invokeSuspend(Unit.INSTANCE);
            }
        }
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FlowCollector flowCollector0;
        FlowCollector flowCollector1;
        switch(this.o) {
            case 0: {
                Object object1 = a.getCOROUTINE_SUSPENDED();
                switch(this.p) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        Object object2 = this.q;
                        this.q = null;
                        this.p = 1;
                        object0 = ((Function3)this.s).invoke(object2, this.r, this);
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
            case 1: {
                Unit unit1 = a.getCOROUTINE_SUSPENDED();
                switch(this.p) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        flowCollector1 = (FlowCollector)this.r;
                        this.r = flowCollector1;
                        this.p = 1;
                        object0 = ((Function2)this.s).invoke(this.q, this);
                        if(object0 == unit1) {
                            return unit1;
                        }
                        break;
                    }
                    case 1: {
                        flowCollector1 = (FlowCollector)this.r;
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
                this.r = null;
                this.p = 2;
                return flowCollector1.emit(object0, this) == unit1 ? unit1 : Unit.INSTANCE;
            }
            default: {
                Unit unit0 = a.getCOROUTINE_SUSPENDED();
                switch(this.p) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        flowCollector0 = (FlowCollector)this.q;
                        Object[] arr_object = (Object[])this.r;
                        this.q = flowCollector0;
                        this.p = 1;
                        object0 = ((Function3)this.s).invoke(arr_object[0], arr_object[1], this);
                        if(object0 == unit0) {
                            return unit0;
                        }
                        break;
                    }
                    case 1: {
                        flowCollector0 = (FlowCollector)this.q;
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
                this.q = null;
                this.p = 2;
                return flowCollector0.emit(object0, this) == unit0 ? unit0 : Unit.INSTANCE;
            }
        }
    }
}


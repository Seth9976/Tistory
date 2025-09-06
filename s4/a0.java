package s4;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class a0 extends SuspendLambda implements Function2 {
    public ObjectRef o;
    public int p;
    public Object q;
    public final Object r;
    public final Flow s;
    public final Function3 t;

    public a0(Flow flow0, Object object0, Function3 function30, Continuation continuation0) {
        this.r = object0;
        this.s = flow0;
        this.t = function30;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new a0(this.s, this.r, this.t, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a0)this.create(((FlowCollector)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FlowCollector flowCollector1;
        ObjectRef ref$ObjectRef0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FlowCollector flowCollector0 = (FlowCollector)this.q;
                ref$ObjectRef0 = new ObjectRef();
                ref$ObjectRef0.element = this.r;
                this.q = flowCollector0;
                this.o = ref$ObjectRef0;
                this.p = 1;
                if(flowCollector0.emit(this.r, this) == object1) {
                    return object1;
                }
                flowCollector1 = flowCollector0;
                break;
            }
            case 1: {
                ref$ObjectRef0 = this.o;
                flowCollector1 = (FlowCollector)this.q;
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
        z z0 = new z(ref$ObjectRef0, this.t, flowCollector1);
        this.q = null;
        this.o = null;
        this.p = 2;
        return this.s.collect(z0, this) == object1 ? object1 : Unit.INSTANCE;
    }
}


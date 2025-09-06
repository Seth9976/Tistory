package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import qd.a;

public final class b0 extends SuspendLambda implements Function2 {
    public int o;
    public final ObjectRef p;
    public final FlowCollector q;

    public b0(Continuation continuation0, ObjectRef ref$ObjectRef0, FlowCollector flowCollector0) {
        this.p = ref$ObjectRef0;
        this.q = flowCollector0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new b0(continuation0, this.p, this.q);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b0)this.create(((Unit)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ObjectRef ref$ObjectRef0 = this.p;
                Object object2 = ref$ObjectRef0.element;
                if(object2 == null) {
                    return Unit.INSTANCE;
                }
                ref$ObjectRef0.element = null;
                if(object2 == NullSurrogateKt.NULL) {
                    object2 = null;
                }
                this.o = 1;
                return this.q.emit(object2, this) == object1 ? object1 : Unit.INSTANCE;
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


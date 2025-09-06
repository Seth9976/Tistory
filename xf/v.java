package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.channels.ChannelResult.Failed;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import qd.a;

public final class v extends SuspendLambda implements Function2 {
    public ObjectRef o;
    public int p;
    public Object q;
    public final ObjectRef r;
    public final FlowCollector s;

    public v(Continuation continuation0, ObjectRef ref$ObjectRef0, FlowCollector flowCollector0) {
        this.r = ref$ObjectRef0;
        this.s = flowCollector0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new v(continuation0, this.r, this.s);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((v)this.create(ChannelResult.box-impl(((ChannelResult)object0).unbox-impl()), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ObjectRef ref$ObjectRef0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Object object2 = ((ChannelResult)this.q).unbox-impl();
                ref$ObjectRef0 = this.r;
                if(!(object2 instanceof Failed)) {
                    ref$ObjectRef0.element = object2;
                }
                if(!(object2 instanceof Failed)) {
                    return Unit.INSTANCE;
                }
                Throwable throwable0 = ChannelResult.exceptionOrNull-impl(object2);
                if(throwable0 != null) {
                    throw throwable0;
                }
                Object object3 = ref$ObjectRef0.element;
                if(object3 != null) {
                    if(object3 == NullSurrogateKt.NULL) {
                        object3 = null;
                    }
                    this.q = object2;
                    this.o = ref$ObjectRef0;
                    this.p = 1;
                    if(this.s.emit(object3, this) == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 1: {
                ObjectRef ref$ObjectRef1 = this.o;
                ResultKt.throwOnFailure(object0);
                ref$ObjectRef0 = ref$ObjectRef1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ref$ObjectRef0.element = NullSurrogateKt.DONE;
        return Unit.INSTANCE;
    }
}


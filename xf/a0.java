package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.channels.ChannelResult.Failed;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

public final class a0 extends SuspendLambda implements Function2 {
    public Object o;
    public final ObjectRef p;
    public final ReceiveChannel q;

    public a0(ObjectRef ref$ObjectRef0, ReceiveChannel receiveChannel0, Continuation continuation0) {
        this.p = ref$ObjectRef0;
        this.q = receiveChannel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new a0(this.p, this.q, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a0)this.create(ChannelResult.box-impl(((ChannelResult)object0).unbox-impl()), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Object object1 = ((ChannelResult)this.o).unbox-impl();
        ObjectRef ref$ObjectRef0 = this.p;
        if(!(object1 instanceof Failed)) {
            ref$ObjectRef0.element = object1;
        }
        if(object1 instanceof Failed) {
            Throwable throwable0 = ChannelResult.exceptionOrNull-impl(object1);
            if(throwable0 != null) {
                throw throwable0;
            }
            ChildCancelledException childCancelledException0 = new ChildCancelledException();
            this.q.cancel(childCancelledException0);
            ref$ObjectRef0.element = NullSurrogateKt.DONE;
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}


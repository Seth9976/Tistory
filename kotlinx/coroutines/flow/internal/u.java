package kotlinx.coroutines.flow.internal;

import j0.b2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import qd.a;

public final class u extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final FlowCollector q;
    public final Flow r;
    public final Flow s;
    public final Function3 t;

    public u(FlowCollector flowCollector0, Flow flow0, Flow flow1, Function3 function30, Continuation continuation0) {
        this.q = flowCollector0;
        this.r = flow0;
        this.s = flow1;
        this.t = function30;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new u(this.q, this.r, this.s, this.t, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((u)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ReceiveChannel receiveChannel2;
        ReceiveChannel receiveChannel1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        FlowCollector flowCollector0 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.p;
                ReceiveChannel receiveChannel0 = ProduceKt.produce$default(coroutineScope0, null, 0, new t(this.r, null), 3, null);
                CompletableJob completableJob0 = JobKt.Job$default(null, 1, null);
                Intrinsics.checkNotNull(receiveChannel0, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
                ((SendChannel)receiveChannel0).invokeOnClose(new b2(3, completableJob0, flowCollector0));
                try {
                    try {
                        CoroutineContext coroutineContext0 = coroutineScope0.getCoroutineContext();
                        Object object2 = ThreadContextKt.threadContextElements(coroutineContext0);
                        CoroutineContext coroutineContext1 = coroutineScope0.getCoroutineContext().plus(completableJob0);
                        receiveChannel1 = receiveChannel0;
                        r r0 = new r(this.s, coroutineContext0, object2, receiveChannel0, this.q, this.t, null);
                        this.p = receiveChannel0;
                        this.o = 1;
                        receiveChannel1 = receiveChannel0;
                    }
                    catch(AbortFlowException abortFlowException0) {
                        receiveChannel1 = receiveChannel0;
                        receiveChannel2 = receiveChannel1;
                        goto label_37;
                    }
                    try {
                        if(ChannelFlowKt.withContextUndispatched$default(coroutineContext1, Unit.INSTANCE, null, r0, this, 4, null) == object1) {
                            return object1;
                        }
                        receiveChannel2 = receiveChannel1;
                        break;
                    }
                    catch(AbortFlowException abortFlowException0) {
                    }
                    receiveChannel2 = receiveChannel1;
                    goto label_37;
                }
                catch(Throwable throwable0) {
                    receiveChannel2 = receiveChannel1;
                    DefaultImpls.cancel$default(receiveChannel2, null, 1, null);
                    throw throwable0;
                }
            }
            case 1: {
                receiveChannel2 = (ReceiveChannel)this.p;
                try {
                    try {
                        ResultKt.throwOnFailure(object0);
                        break;
                    }
                    catch(AbortFlowException abortFlowException0) {
                    }
                label_37:
                    FlowExceptions_commonKt.checkOwnership(abortFlowException0, flowCollector0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                DefaultImpls.cancel$default(receiveChannel2, null, 1, null);
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        DefaultImpls.cancel$default(receiveChannel2, null, 1, null);
        return Unit.INSTANCE;
    }
}


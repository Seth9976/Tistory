package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt.transformWhile.1.invokeSuspend..inlined.collectWhile.1;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import qd.a;

public final class c1 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Flow q;
    public final Function3 r;

    public c1(Flow flow0, Function3 function30, Continuation continuation0) {
        this.q = flow0;
        this.r = function30;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c1(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c1)this.create(((FlowCollector)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FlowKt__LimitKt.transformWhile.1.invokeSuspend..inlined.collectWhile.1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$10;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FlowKt__LimitKt.transformWhile.1.invokeSuspend..inlined.collectWhile.1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$11 = new FlowKt__LimitKt.transformWhile.1.invokeSuspend..inlined.collectWhile.1(this.r, ((FlowCollector)this.p));
                try {
                    this.p = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$11;
                    this.o = 1;
                    return this.q.collect(flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$11, this) == object1 ? object1 : Unit.INSTANCE;
                }
                catch(AbortFlowException abortFlowException0) {
                    flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$10 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$11;
                }
                FlowExceptions_commonKt.checkOwnership(abortFlowException0, flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$10);
                return Unit.INSTANCE;
            }
            case 1: {
                flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$10 = (FlowKt__LimitKt.transformWhile.1.invokeSuspend..inlined.collectWhile.1)this.p;
                try {
                    ResultKt.throwOnFailure(object0);
                }
                catch(AbortFlowException abortFlowException0) {
                    FlowExceptions_commonKt.checkOwnership(abortFlowException0, flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$10);
                }
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


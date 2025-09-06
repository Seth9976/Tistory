package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt.collectWhile.collector.1;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import qd.a;

public abstract class d1 {
    public static final Object a(FlowCollector flowCollector0, Object object0, ContinuationImpl continuationImpl0) {
        z0 z00;
        if(continuationImpl0 instanceof z0) {
            z00 = (z0)continuationImpl0;
            int v = z00.q;
            if((v & 0x80000000) == 0) {
                z00 = new z0(continuationImpl0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                z00.q = v ^ 0x80000000;
            }
        }
        else {
            z00 = new z0(continuationImpl0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object1 = z00.p;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(z00.q) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                z00.o = flowCollector0;
                z00.q = 1;
                if(flowCollector0.emit(object0, z00) == object2) {
                    return object2;
                }
                break;
            }
            case 1: {
                flowCollector0 = z00.o;
                ResultKt.throwOnFailure(object1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new AbortFlowException(flowCollector0);
    }

    public static final Object b(Flow flow0, Function2 function20, Continuation continuation0) {
        FlowKt__LimitKt.collectWhile.collector.1 flowKt__LimitKt$collectWhile$collector$10;
        u0 u00;
        if(continuation0 instanceof u0) {
            u00 = (u0)continuation0;
            int v = u00.q;
            if((v & 0x80000000) == 0) {
                u00 = new u0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                u00.q = v ^ 0x80000000;
            }
        }
        else {
            u00 = new u0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = u00.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(u00.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FlowKt__LimitKt.collectWhile.collector.1 flowKt__LimitKt$collectWhile$collector$11 = new FlowKt__LimitKt.collectWhile.collector.1(function20);
                try {
                    u00.o = flowKt__LimitKt$collectWhile$collector$11;
                    u00.q = 1;
                    return flow0.collect(flowKt__LimitKt$collectWhile$collector$11, u00) == object1 ? object1 : Unit.INSTANCE;
                }
                catch(AbortFlowException abortFlowException0) {
                    flowKt__LimitKt$collectWhile$collector$10 = flowKt__LimitKt$collectWhile$collector$11;
                }
                FlowExceptions_commonKt.checkOwnership(abortFlowException0, flowKt__LimitKt$collectWhile$collector$10);
                return Unit.INSTANCE;
            }
            case 1: {
                try {
                    flowKt__LimitKt$collectWhile$collector$10 = u00.o;
                    ResultKt.throwOnFailure(object0);
                }
                catch(AbortFlowException abortFlowException0) {
                    FlowExceptions_commonKt.checkOwnership(abortFlowException0, flowKt__LimitKt$collectWhile$collector$10);
                }
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


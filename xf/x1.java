package xf;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ReduceKt.fold.2;
import qd.a;

public abstract class x1 {
    public static final Object a(Flow flow0, Object object0, Function3 function30, Continuation continuation0) {
        m1 m10;
        if(continuation0 instanceof m1) {
            m10 = (m1)continuation0;
            int v = m10.q;
            if((v & 0x80000000) == 0) {
                m10 = new m1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                m10.q = v ^ 0x80000000;
            }
        }
        else {
            m10 = new m1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object1 = m10.p;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(m10.q) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                ref$ObjectRef0.element = object0;
                FlowKt__ReduceKt.fold.2 flowKt__ReduceKt$fold$20 = new FlowKt__ReduceKt.fold.2(ref$ObjectRef0, function30);
                m10.o = ref$ObjectRef0;
                m10.q = 1;
                return flow0.collect(flowKt__ReduceKt$fold$20, m10) == object2 ? object2 : ref$ObjectRef0.element;
            }
            case 1: {
                ObjectRef ref$ObjectRef1 = m10.o;
                ResultKt.throwOnFailure(object1);
                return ref$ObjectRef1.element;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


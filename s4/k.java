package s4;

import androidx.paging.CachedPageEventFlow;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.IntRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class k extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final CachedPageEventFlow q;

    public k(CachedPageEventFlow cachedPageEventFlow0, Continuation continuation0) {
        this.q = cachedPageEventFlow0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new k(this.q, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k)this.create(((FlowCollector)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FlowCollector flowCollector0 = (FlowCollector)this.p;
                IntRef ref$IntRef0 = new IntRef();
                ref$IntRef0.element = 0x80000000;
                Flow flow0 = FlowKt.takeWhile(this.q.c, new h(2, null));  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
                j j0 = new j(ref$IntRef0, flowCollector0);
                this.o = 1;
                return flow0.collect(j0, this) == object1 ? object1 : Unit.INSTANCE;
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


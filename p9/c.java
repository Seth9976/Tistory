package p9;

import com.kakao.kandinsky.base.ConsumeKDEventKt.ConsumeEvent.2.invokeSuspend..inlined.filter.1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import qd.a;

public final class c extends SuspendLambda implements Function2 {
    public int o;
    public final SharedFlow p;
    public final Function0 q;
    public final Function1 r;

    public c(SharedFlow sharedFlow0, Function0 function00, Function1 function10, Continuation continuation0) {
        this.p = sharedFlow0;
        this.q = function00;
        this.r = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ConsumeKDEventKt.ConsumeEvent.2.invokeSuspend..inlined.filter.1 consumeKDEventKt$ConsumeEvent$2$invokeSuspend$$inlined$filter$10 = new ConsumeKDEventKt.ConsumeEvent.2.invokeSuspend..inlined.filter.1(this.p);
                b b0 = new b(this.r, this.q, null);
                this.o = 1;
                return FlowKt.collectLatest(consumeKDEventKt$ConsumeEvent$2$invokeSuspend$$inlined$filter$10, b0, this) == object1 ? object1 : Unit.INSTANCE;
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


package pa;

import android.content.Context;
import com.kakao.kandinsky.resize.ReSizeScreenKt.ConsumeEvent.2.invokeSuspend..inlined.filter.1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import qd.a;

public final class h extends SuspendLambda implements Function2 {
    public int o;
    public final SharedFlow p;
    public final Function0 q;
    public final Context r;
    public final Function2 s;

    public h(SharedFlow sharedFlow0, Function0 function00, Context context0, Function2 function20, Continuation continuation0) {
        this.p = sharedFlow0;
        this.q = function00;
        this.r = context0;
        this.s = function20;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new h(this.p, this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((h)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ReSizeScreenKt.ConsumeEvent.2.invokeSuspend..inlined.filter.1 reSizeScreenKt$ConsumeEvent$2$invokeSuspend$$inlined$filter$10 = new ReSizeScreenKt.ConsumeEvent.2.invokeSuspend..inlined.filter.1(this.p);
                g g0 = new g(this.q, this.r, this.s, null);
                this.o = 1;
                return FlowKt.collectLatest(reSizeScreenKt$ConsumeEvent$2$invokeSuspend$$inlined$filter$10, g0, this) == object1 ? object1 : Unit.INSTANCE;
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


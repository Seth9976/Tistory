package sa;

import com.kakao.kandinsky.signature.SignatureScreenKt.ConsumeEvent.2.invokeSuspend..inlined.filter.1;
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

public final class b extends SuspendLambda implements Function2 {
    public int o;
    public final SharedFlow p;
    public final Function0 q;
    public final Function0 r;
    public final Function1 s;
    public final Function1 t;
    public final Function1 u;

    public b(SharedFlow sharedFlow0, Function0 function00, Function0 function01, Function1 function10, Function1 function11, Function1 function12, Continuation continuation0) {
        this.p = sharedFlow0;
        this.q = function00;
        this.r = function01;
        this.s = function10;
        this.t = function11;
        this.u = function12;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new b(this.p, this.q, this.r, this.s, this.t, this.u, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SignatureScreenKt.ConsumeEvent.2.invokeSuspend..inlined.filter.1 signatureScreenKt$ConsumeEvent$2$invokeSuspend$$inlined$filter$10 = new SignatureScreenKt.ConsumeEvent.2.invokeSuspend..inlined.filter.1(this.p);
                sa.a a0 = new sa.a(this.q, this.r, this.s, this.t, this.u, null);
                this.o = 1;
                return FlowKt.collectLatest(signatureScreenKt$ConsumeEvent$2$invokeSuspend$$inlined$filter$10, a0, this) == object1 ? object1 : Unit.INSTANCE;
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


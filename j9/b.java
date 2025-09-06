package j9;

import com.kakao.android.base.viewmodel.CoroutineThrottle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class b extends SuspendLambda implements Function2 {
    public final CoroutineThrottle o;
    public final Function0 p;

    public b(CoroutineThrottle coroutineThrottle0, Function0 function00, Continuation continuation0) {
        this.o = coroutineThrottle0;
        this.p = function00;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new b(this.o, this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        this.o.b = System.currentTimeMillis();
        this.p.invoke();
        return Unit.INSTANCE;
    }
}


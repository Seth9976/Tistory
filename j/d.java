package j;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlinx.coroutines.flow.FlowCollector;

public final class d extends SuspendLambda implements Function3 {
    public final BooleanRef o;

    public d(BooleanRef ref$BooleanRef0, Continuation continuation0) {
        this.o = ref$BooleanRef0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        FlowCollector flowCollector0 = (FlowCollector)object0;
        Throwable throwable0 = (Throwable)object1;
        return new d(this.o, ((Continuation)object2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        this.o.element = true;
        return Unit.INSTANCE;
    }
}


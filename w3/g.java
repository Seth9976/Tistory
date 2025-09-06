package w3;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

public final class g extends SuspendLambda implements Function3 {
    public final Job o;

    public g(Job job0, Continuation continuation0) {
        this.o = job0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        FlowCollector flowCollector0 = (FlowCollector)object0;
        Throwable throwable0 = (Throwable)object1;
        return new g(this.o, ((Continuation)object2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        DefaultImpls.cancel$default(this.o, null, 1, null);
        return Unit.INSTANCE;
    }
}


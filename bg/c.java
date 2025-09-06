package bg;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.selects.SelectBuilderImpl;
import kotlinx.coroutines.selects.SelectOldKt;
import qd.a;

public final class c extends SuspendLambda implements Function2 {
    public int o;
    public final SelectBuilderImpl p;

    public c(SelectBuilderImpl selectBuilderImpl0, Continuation continuation0) {
        this.p = selectBuilderImpl0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c(this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        SelectBuilderImpl selectBuilderImpl0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    this.o = 1;
                    object0 = selectBuilderImpl0.doSelect(this);
                    if(object0 == object1) {
                        return object1;
                    label_9:
                        ResultKt.throwOnFailure(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    SelectOldKt.access$resumeUndispatchedWithException(SelectBuilderImpl.access$getCont$p(selectBuilderImpl0), throwable0);
                    return Unit.INSTANCE;
                }
            }
            case 1: {
                goto label_9;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        SelectOldKt.access$resumeUndispatched(SelectBuilderImpl.access$getCont$p(selectBuilderImpl0), object0);
        return Unit.INSTANCE;
    }
}


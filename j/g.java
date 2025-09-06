package j;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class g extends SuspendLambda implements Function2 {
    public final androidx.activity.compose.PredictiveBackHandlerKt.PredictiveBackHandler.backCallBack.1.1 o;
    public final boolean p;

    public g(androidx.activity.compose.PredictiveBackHandlerKt.PredictiveBackHandler.backCallBack.1.1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$10, boolean z, Continuation continuation0) {
        this.o = predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$10;
        this.p = z;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new g(this.o, this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        this.o.setEnabled(this.p);
        return Unit.INSTANCE;
    }
}


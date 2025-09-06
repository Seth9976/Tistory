package s;

import androidx.compose.animation.SharedElement;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class i1 extends SuspendLambda implements Function2 {
    public final SharedElement o;

    public i1(SharedElement sharedElement0, Continuation continuation0) {
        this.o = sharedElement0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new i1(this.o, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        SharedElement sharedElement0 = this.o;
        if(sharedElement0.getStates().isEmpty()) {
            sharedElement0.getScope().h.remove(sharedElement0.getKey());
        }
        return Unit.INSTANCE;
    }
}


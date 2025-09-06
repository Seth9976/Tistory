package t;

import androidx.compose.animation.core.Animatable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

public final class c extends SuspendLambda implements Function1 {
    public final Animatable o;
    public final Object p;

    public c(Animatable animatable0, Object object0, Continuation continuation0) {
        this.o = animatable0;
        this.p = object0;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new c(this.o, this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((c)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Animatable.access$endAnimation(this.o);
        Object object1 = this.o.a(this.p);
        this.o.getInternalState$animation_core_release().setValue$animation_core_release(object1);
        Animatable.access$setTargetValue(this.o, object1);
        return Unit.INSTANCE;
    }
}


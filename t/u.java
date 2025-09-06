package t;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.f;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class u extends SuspendLambda implements Function1 {
    public int o;
    public final Object p;
    public final Object q;
    public final SeekableTransitionState r;
    public final Transition s;
    public final float t;

    public u(Object object0, Object object1, SeekableTransitionState seekableTransitionState0, Transition transition0, float f, Continuation continuation0) {
        this.p = object0;
        this.q = object1;
        this.r = seekableTransitionState0;
        this.s = transition0;
        this.t = f;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new u(this.p, this.q, this.r, this.s, this.t, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((u)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                f f0 = new f(this.p, this.q, this.r, this.s, this.t, null);
                this.o = 1;
                return CoroutineScopeKt.coroutineScope(f0, this) == object1 ? object1 : Unit.INSTANCE;
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


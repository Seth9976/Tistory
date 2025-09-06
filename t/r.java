package t;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.e;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class r extends SuspendLambda implements Function1 {
    public int o;
    public final Transition p;
    public final SeekableTransitionState q;
    public final Object r;
    public final FiniteAnimationSpec s;

    public r(FiniteAnimationSpec finiteAnimationSpec0, SeekableTransitionState seekableTransitionState0, Transition transition0, Object object0, Continuation continuation0) {
        this.p = transition0;
        this.q = seekableTransitionState0;
        this.r = object0;
        this.s = finiteAnimationSpec0;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new r(this.s, this.q, this.p, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((r)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                e e0 = new e(this.s, this.q, this.p, this.r, null);
                this.o = 1;
                if(CoroutineScopeKt.coroutineScope(e0, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.p.onTransitionEnd$animation_core_release();
        return Unit.INSTANCE;
    }
}


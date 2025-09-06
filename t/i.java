package t;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.DeferredTargetAnimation;
import androidx.compose.animation.core.FiniteAnimationSpec;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class i extends SuspendLambda implements Function2 {
    public int o;
    public final Animatable p;
    public final DeferredTargetAnimation q;
    public final Object r;
    public final FiniteAnimationSpec s;

    public i(Animatable animatable0, DeferredTargetAnimation deferredTargetAnimation0, Object object0, FiniteAnimationSpec finiteAnimationSpec0, Continuation continuation0) {
        this.p = animatable0;
        this.q = deferredTargetAnimation0;
        this.r = object0;
        this.s = finiteAnimationSpec0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new i(this.p, this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Animatable animatable0 = this.p;
                if(!Intrinsics.areEqual(animatable0.getTargetValue(), DeferredTargetAnimation.access$get_pendingTarget(this.q))) {
                    this.o = 1;
                    if(Animatable.animateTo$default(animatable0, this.r, this.s, null, null, this, 12, null) == object1) {
                        return object1;
                    }
                }
                return Unit.INSTANCE;
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


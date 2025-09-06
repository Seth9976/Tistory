package t;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animation;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.SuspendAnimationKt;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref.BooleanRef;
import qd.a;

public final class b extends SuspendLambda implements Function1 {
    public AnimationState o;
    public BooleanRef p;
    public int q;
    public final Animatable r;
    public final Object s;
    public final Animation t;
    public final long u;
    public final Function1 v;

    public b(Animatable animatable0, Object object0, Animation animation0, long v, Function1 function10, Continuation continuation0) {
        this.r = animatable0;
        this.s = object0;
        this.t = animation0;
        this.u = v;
        this.v = function10;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new b(this.r, this.s, this.t, this.u, this.v, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((b)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Animatable animatable0 = this.r;
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    animatable0.getInternalState$animation_core_release().setVelocityVector$animation_core_release(((AnimationVector)animatable0.getTypeConverter().getConvertToVector().invoke(this.s)));
                    Animatable.access$setTargetValue(animatable0, this.t.getTargetValue());
                    Animatable.access$setRunning(animatable0, true);
                    AnimationState animationState0 = AnimationStateKt.copy$default(animatable0.getInternalState$animation_core_release(), null, null, 0L, 0x8000000000000000L, false, 23, null);
                    BooleanRef ref$BooleanRef0 = new BooleanRef();
                    t.a a0 = new t.a(animatable0, animationState0, this.v, ref$BooleanRef0);
                    this.o = animationState0;
                    this.p = ref$BooleanRef0;
                    this.q = 1;
                    if(SuspendAnimationKt.animate(animationState0, this.t, this.u, a0, this) == object1) {
                        return object1;
                    }
                    AnimationState animationState1 = animationState0;
                    BooleanRef ref$BooleanRef1 = ref$BooleanRef0;
                    goto label_22;
                label_19:
                    ref$BooleanRef1 = this.p;
                    animationState1 = this.o;
                    ResultKt.throwOnFailure(object0);
                label_22:
                    AnimationEndReason animationEndReason0 = ref$BooleanRef1.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
                    Animatable.access$endAnimation(animatable0);
                    return new AnimationResult(animationState1, animationEndReason0);
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Animatable.access$endAnimation(animatable0);
        throw cancellationException0;
    }
}


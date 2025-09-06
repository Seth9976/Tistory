package t;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qd.a;

public final class v extends SuspendLambda implements Function1 {
    public int o;
    public final SeekableTransitionState p;
    public final Object q;
    public final Transition r;

    public v(SeekableTransitionState seekableTransitionState0, Object object0, Transition transition0, Continuation continuation0) {
        this.p = seekableTransitionState0;
        this.q = object0;
        this.r = transition0;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new v(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((v)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        float f;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Transition transition0 = this.r;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SeekableTransitionState seekableTransitionState0 = this.p;
                seekableTransitionState0.b();
                seekableTransitionState0.l = 0x8000000000000000L;
                SeekableTransitionState.access$setFraction(seekableTransitionState0, 0.0f);
                Object object2 = seekableTransitionState0.getCurrentState();
                Object object3 = this.q;
                if(Intrinsics.areEqual(object3, object2)) {
                    f = -4.0f;
                }
                else {
                    f = Intrinsics.areEqual(object3, seekableTransitionState0.getTargetState()) ? -5.0f : -3.0f;
                }
                transition0.updateTarget$animation_core_release(object3);
                transition0.setPlayTimeNanos(0L);
                seekableTransitionState0.setTargetState$animation_core_release(object3);
                SeekableTransitionState.access$setFraction(seekableTransitionState0, 0.0f);
                seekableTransitionState0.setCurrentState$animation_core_release(object3);
                transition0.resetAnimationFraction$animation_core_release(f);
                if(f == -3.0f) {
                    this.o = 1;
                    if(SeekableTransitionState.access$waitForCompositionAfterTargetStateChange(seekableTransitionState0, this) == object1) {
                        return object1;
                    }
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
        transition0.onTransitionEnd$animation_core_release();
        return Unit.INSTANCE;
    }
}


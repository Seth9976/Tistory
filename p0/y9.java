package p0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.material.SwipeableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.FloatRef;
import qd.a;

public final class y9 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final SwipeableState q;
    public final float r;
    public final AnimationSpec s;

    public y9(SwipeableState swipeableState0, float f, AnimationSpec animationSpec0, Continuation continuation0) {
        this.q = swipeableState0;
        this.r = f;
        this.s = animationSpec0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new y9(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((y9)this.create(((DragScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        SwipeableState swipeableState0 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                DragScope dragScope0 = (DragScope)this.p;
                FloatRef ref$FloatRef0 = new FloatRef();
                ref$FloatRef0.element = swipeableState0.g.getFloatValue();
                swipeableState0.h.setValue(Boxing.boxFloat(this.r));
                SwipeableState.access$setAnimationRunning(swipeableState0, true);
                try {
                    Animatable animatable0 = AnimatableKt.Animatable$default(ref$FloatRef0.element, 0.0f, 2, null);
                    x9 x90 = new x9(dragScope0, ref$FloatRef0);
                    this.o = 1;
                    if(Animatable.animateTo$default(animatable0, Boxing.boxFloat(this.r), this.s, null, x90, this, 4, null) == object1) {
                        return object1;
                    label_15:
                        ResultKt.throwOnFailure(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    swipeableState0.h.setValue(null);
                    SwipeableState.access$setAnimationRunning(swipeableState0, false);
                    throw throwable0;
                }
            }
            case 1: {
                goto label_15;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        swipeableState0.h.setValue(null);
        SwipeableState.access$setAnimationRunning(swipeableState0, false);
        return Unit.INSTANCE;
    }
}


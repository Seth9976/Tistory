package z;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DefaultFlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class d0 extends SuspendLambda implements Function2 {
    public FloatRef o;
    public AnimationState p;
    public int q;
    public final float r;
    public final DefaultFlingBehavior s;
    public final ScrollScope t;

    public d0(float f, DefaultFlingBehavior defaultFlingBehavior0, ScrollScope scrollScope0, Continuation continuation0) {
        this.r = f;
        this.s = defaultFlingBehavior0;
        this.t = scrollScope0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new d0(this.r, this.s, this.t, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        AnimationState animationState1;
        FloatRef ref$FloatRef2;
        float f;
        DefaultFlingBehavior defaultFlingBehavior0 = this.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                f = this.r;
                if(Math.abs(f) > 1.0f) {
                    FloatRef ref$FloatRef0 = new FloatRef();
                    ref$FloatRef0.element = f;
                    FloatRef ref$FloatRef1 = new FloatRef();
                    AnimationState animationState0 = AnimationStateKt.AnimationState$default(0.0f, this.r, 0L, 0L, false, 28, null);
                    try {
                        c0 c00 = new c0(ref$FloatRef1, this.t, ref$FloatRef0, defaultFlingBehavior0);
                        this.o = ref$FloatRef0;
                        this.p = animationState0;
                        this.q = 1;
                        if(SuspendAnimationKt.animateDecay$default(animationState0, defaultFlingBehavior0.getFlingDecay(), false, c00, this, 2, null) == object1) {
                            return object1;
                        }
                    }
                    catch(CancellationException unused_ex) {
                        ref$FloatRef2 = ref$FloatRef0;
                        animationState1 = animationState0;
                        ref$FloatRef2.element = ((Number)animationState1.getVelocity()).floatValue();
                        f = ref$FloatRef2.element;
                        break;
                    }
                    return Boxing.boxFloat(ref$FloatRef0.element);
                }
                break;
            }
            case 1: {
                try {
                    animationState1 = this.p;
                    ref$FloatRef2 = this.o;
                    ResultKt.throwOnFailure(object0);
                    f = ref$FloatRef2.element;
                    break;
                }
                catch(CancellationException unused_ex) {
                }
                ref$FloatRef2.element = ((Number)animationState1.getVelocity()).floatValue();
                f = ref$FloatRef2.element;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Boxing.boxFloat(f);
    }
}


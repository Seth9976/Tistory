package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class f extends SuspendLambda implements Function2 {
    public FloatRef o;
    public int p;
    public final SnapFlingBehavior q;
    public final float r;
    public final Function1 s;
    public final ScrollScope t;

    public f(SnapFlingBehavior snapFlingBehavior0, ScrollScope scrollScope0, float f, Function1 function10, Continuation continuation0) {
        this.q = snapFlingBehavior0;
        this.r = f;
        this.s = function10;
        this.t = scrollScope0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new f(this.q, this.t, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object2;
        FloatRef ref$FloatRef0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Function1 function10 = this.s;
        SnapFlingBehavior snapFlingBehavior0 = this.q;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                float f = this.r;
                float f1 = snapFlingBehavior0.a.calculateApproachOffset(f, DecayAnimationSpecKt.calculateTargetValue(snapFlingBehavior0.b, 0.0f, f));
                if(Float.isNaN(f1)) {
                    throw new IllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
                }
                ref$FloatRef0 = new FloatRef();
                float f2 = Math.signum(f) * Math.abs(f1);
                ref$FloatRef0.element = f2;
                function10.invoke(Boxing.boxFloat(f2));
                float f3 = ref$FloatRef0.element;
                e e0 = new e(ref$FloatRef0, function10);
                this.o = ref$FloatRef0;
                this.p = 1;
                object2 = SnapFlingBehavior.access$tryApproach(this.q, this.t, f3, this.r, e0, this);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                FloatRef ref$FloatRef1 = this.o;
                ResultKt.throwOnFailure(object0);
                ref$FloatRef0 = ref$FloatRef1;
                object2 = object0;
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        float f4 = snapFlingBehavior0.a.calculateSnapOffset(((Number)((AnimationState)object2).getVelocity()).floatValue());
        if(Float.isNaN(f4)) {
            throw new IllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        ref$FloatRef0.element = f4;
        AnimationState animationState0 = AnimationStateKt.copy$default(((AnimationState)object2), 0.0f, 0.0f, 0L, 0L, false, 30, null);
        d d0 = new d(ref$FloatRef0, function10);
        this.o = null;
        this.p = 2;
        Object object3 = SnapFlingBehaviorKt.access$animateWithTarget(this.t, f4, f4, animationState0, snapFlingBehavior0.c, d0, this);
        return object3 == object1 ? object1 : object3;
    }
}


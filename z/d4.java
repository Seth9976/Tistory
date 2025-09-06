package z;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.TransformScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.FloatRef;
import qd.a;

public final class d4 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final FloatRef q;
    public final float r;
    public final AnimationSpec s;

    public d4(float f, AnimationSpec animationSpec0, Continuation continuation0, FloatRef ref$FloatRef0) {
        this.q = ref$FloatRef0;
        this.r = f;
        this.s = animationSpec0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new d4(this.r, this.s, continuation0, this.q);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d4)this.create(((TransformScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                TransformScope transformScope0 = (TransformScope)this.p;
                AnimationState animationState0 = AnimationStateKt.AnimationState$default(this.q.element, 0.0f, 0L, 0L, false, 30, null);
                c4 c40 = new c4(this.q, transformScope0);
                this.o = 1;
                return SuspendAnimationKt.animateTo$default(animationState0, Boxing.boxFloat(this.r), this.s, false, c40, this, 4, null) == object1 ? object1 : Unit.INSTANCE;
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


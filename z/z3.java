package z;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.gestures.TransformScope;
import androidx.compose.ui.geometry.Offset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.LongRef;
import qd.a;

public final class z3 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final LongRef q;
    public final long r;
    public final AnimationSpec s;

    public z3(LongRef ref$LongRef0, long v, AnimationSpec animationSpec0, Continuation continuation0) {
        this.q = ref$LongRef0;
        this.r = v;
        this.s = animationSpec0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new z3(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((z3)this.create(((TransformScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                TransformScope transformScope0 = (TransformScope)this.p;
                Offset offset0 = Offset.box-impl(this.q.element);
                AnimationState animationState0 = new AnimationState(VectorConvertersKt.getVectorConverter(Offset.Companion), offset0, null, 0L, 0L, false, 60, null);
                Offset offset1 = Offset.box-impl(this.r);
                y3 y30 = new y3(this.q, transformScope0);
                this.o = 1;
                return SuspendAnimationKt.animateTo$default(animationState0, offset1, this.s, false, y30, this, 4, null) == object1 ? object1 : Unit.INSTANCE;
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


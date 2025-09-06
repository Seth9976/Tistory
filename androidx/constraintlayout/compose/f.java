package androidx.constraintlayout.compose;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class f extends Lambda implements Function1 {
    public final int w;
    public final float x;
    public final Object y;
    public final Object z;

    public f(UpdatableAnimationState updatableAnimationState0, float f, Function1 function10) {
        this.w = 1;
        this.y = updatableAnimationState0;
        this.x = f;
        this.z = function10;
        super(1);
    }

    public f(Function2 function20, ConstrainScope constrainScope0, float f) {
        this.w = 0;
        this.y = (Lambda)function20;
        this.z = constrainScope0;
        this.x = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v1;
        if(this.w != 0) {
            long v = ((Number)object0).longValue();
            UpdatableAnimationState updatableAnimationState0 = (UpdatableAnimationState)this.y;
            if(updatableAnimationState0.b == 0x8000000000000000L) {
                updatableAnimationState0.b = v;
            }
            AnimationVector1D animationVector1D0 = new AnimationVector1D(updatableAnimationState0.getValue());
            float f = this.x;
            if(f == 0.0f) {
                AnimationVector1D animationVector1D1 = new AnimationVector1D(updatableAnimationState0.getValue());
                UpdatableAnimationState.f.getClass();
                v1 = updatableAnimationState0.a.getDurationNanos(animationVector1D1, UpdatableAnimationState.g, updatableAnimationState0.c);
            }
            else {
                v1 = c.roundToLong(((float)(v - updatableAnimationState0.b)) / f);
            }
            UpdatableAnimationState.f.getClass();
            float f1 = ((AnimationVector1D)updatableAnimationState0.a.getValueFromNanos(v1, animationVector1D0, UpdatableAnimationState.g, updatableAnimationState0.c)).getValue();
            UpdatableAnimationState.f.getClass();
            updatableAnimationState0.c = (AnimationVector1D)updatableAnimationState0.a.getVelocityFromNanos(v1, animationVector1D0, UpdatableAnimationState.g, updatableAnimationState0.c);
            updatableAnimationState0.b = v;
            updatableAnimationState0.setValue(f1);
            ((Function1)this.z).invoke(((float)(updatableAnimationState0.getValue() - f1)));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(((State)object0), "state");
        if(((State)object0) != null) {
            ConstraintReference constraintReference0 = ((State)object0).constraints(((ConstrainScope)this.z).getId$compose_release());
            Intrinsics.checkNotNullExpressionValue(constraintReference0, "state.constraints(id)");
            Float float0 = (float)((State)object0).convertDimension(Dp.box-impl(this.x));
            ((Function2)(((Lambda)this.y))).invoke(constraintReference0, float0);
        }
        return Unit.INSTANCE;
    }
}


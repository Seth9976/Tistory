package t;

import androidx.compose.animation.core.Animation;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.TwoWayConverter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class c0 extends Lambda implements Function1 {
    public final AnimationState A;
    public final float B;
    public final Function1 C;
    public final ObjectRef w;
    public final Object x;
    public final Animation y;
    public final AnimationVector z;

    public c0(ObjectRef ref$ObjectRef0, Object object0, Animation animation0, AnimationVector animationVector0, AnimationState animationState0, float f, Function1 function10) {
        this.w = ref$ObjectRef0;
        this.x = object0;
        this.y = animation0;
        this.z = animationVector0;
        this.A = animationState0;
        this.B = f;
        this.C = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = ((Number)object0).longValue();
        TwoWayConverter twoWayConverter0 = this.y.getTypeConverter();
        Object object1 = this.y.getTargetValue();
        b0 b00 = new b0(0, this.A);
        AnimationScope animationScope0 = new AnimationScope(this.x, twoWayConverter0, this.z, v, object1, v, true, b00);
        SuspendAnimationKt.b(animationScope0, v, this.B, this.y, this.A, this.C);
        this.w.element = animationScope0;
        return Unit.INSTANCE;
    }
}


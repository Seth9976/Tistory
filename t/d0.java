package t;

import androidx.compose.animation.core.Animation;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class d0 extends Lambda implements Function1 {
    public final Function1 A;
    public final ObjectRef w;
    public final float x;
    public final Animation y;
    public final AnimationState z;

    public d0(ObjectRef ref$ObjectRef0, float f, Animation animation0, AnimationState animationState0, Function1 function10) {
        this.w = ref$ObjectRef0;
        this.x = f;
        this.y = animation0;
        this.z = animationState0;
        this.A = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Object object1 = this.w.element;
        Intrinsics.checkNotNull(object1);
        SuspendAnimationKt.b(((AnimationScope)object1), ((Number)object0).longValue(), this.x, this.y, this.z, this.A);
        return Unit.INSTANCE;
    }
}


package t;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;

public final class a extends Lambda implements Function1 {
    public final Animatable w;
    public final AnimationState x;
    public final Function1 y;
    public final BooleanRef z;

    public a(Animatable animatable0, AnimationState animationState0, Function1 function10, BooleanRef ref$BooleanRef0) {
        this.w = animatable0;
        this.x = animationState0;
        this.y = function10;
        this.z = ref$BooleanRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Animatable animatable0 = this.w;
        SuspendAnimationKt.updateState(((AnimationScope)object0), animatable0.getInternalState$animation_core_release());
        Object object1 = animatable0.a(((AnimationScope)object0).getValue());
        boolean z = Intrinsics.areEqual(object1, ((AnimationScope)object0).getValue());
        Function1 function10 = this.y;
        if(!z) {
            animatable0.getInternalState$animation_core_release().setValue$animation_core_release(object1);
            this.x.setValue$animation_core_release(object1);
            if(function10 != null) {
                function10.invoke(animatable0);
            }
            ((AnimationScope)object0).cancelAnimation();
            this.z.element = true;
            return Unit.INSTANCE;
        }
        if(function10 != null) {
            function10.invoke(animatable0);
        }
        return Unit.INSTANCE;
    }
}


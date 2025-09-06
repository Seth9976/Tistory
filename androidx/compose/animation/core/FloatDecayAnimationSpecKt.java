package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A1\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0003\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "", "startValue", "startVelocity", "Landroidx/compose/animation/core/Animation;", "Landroidx/compose/animation/core/AnimationVector1D;", "createAnimation", "(Landroidx/compose/animation/core/FloatDecayAnimationSpec;FF)Landroidx/compose/animation/core/Animation;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FloatDecayAnimationSpecKt {
    @NotNull
    public static final Animation createAnimation(@NotNull FloatDecayAnimationSpec floatDecayAnimationSpec0, float f, float f1) {
        return AnimationKt.DecayAnimation(floatDecayAnimationSpec0, f, f1);
    }

    public static Animation createAnimation$default(FloatDecayAnimationSpec floatDecayAnimationSpec0, float f, float f1, int v, Object object0) {
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        return FloatDecayAnimationSpecKt.createAnimation(floatDecayAnimationSpec0, f, f1);
    }
}


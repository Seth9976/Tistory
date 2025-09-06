package androidx.compose.animation.core;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;
import t.g;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A,\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\t2\b\b\u0002\u0010\u000E\u001A\u00020\t\u001Aa\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00120\u0010\"\u0004\b\u0000\u0010\u0011\"\b\b\u0001\u0010\u0012*\u00020\u00132\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\u00110\u00142\u0012\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00120\u00162\u0006\u0010\r\u001A\u0002H\u00112\u0006\u0010\u0017\u001A\u0002H\u00112\u0006\u0010\u000E\u001A\u0002H\u0011¢\u0006\u0002\u0010\u0018\u001AE\u0010\u0019\u001A\u000E\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u00120\u0010\"\b\b\u0000\u0010\u0012*\u00020\u0013*\b\u0012\u0004\u0012\u0002H\u00120\u001A2\u0006\u0010\r\u001A\u0002H\u00122\u0006\u0010\u0017\u001A\u0002H\u00122\u0006\u0010\u000E\u001A\u0002H\u0012H\u0007¢\u0006\u0002\u0010\u001B\u001A3\u0010\u001C\u001A\u0002H\u0011\"\u0004\b\u0000\u0010\u0011\"\b\b\u0001\u0010\u0012*\u00020\u0013*\u000E\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00120\u00042\u0006\u0010\u001D\u001A\u00020\u0001¢\u0006\u0002\u0010\u001E\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\" \u0010\u0003\u001A\u00020\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00048@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u001F"}, d2 = {"MillisToNanos", "", "SecondsToMillis", "durationMillis", "Landroidx/compose/animation/core/Animation;", "getDurationMillis", "(Landroidx/compose/animation/core/Animation;)J", "DecayAnimation", "Landroidx/compose/animation/core/DecayAnimation;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "animationSpec", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "initialValue", "initialVelocity", "TargetBasedAnimation", "Landroidx/compose/animation/core/TargetBasedAnimation;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/AnimationSpec;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "targetValue", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/animation/core/TargetBasedAnimation;", "createAnimation", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/TargetBasedAnimation;", "getVelocityFromNanos", "playTimeNanos", "(Landroidx/compose/animation/core/Animation;J)Ljava/lang/Object;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AnimationKt {
    public static final long MillisToNanos = 1000000L;
    public static final long SecondsToMillis = 1000L;

    @NotNull
    public static final DecayAnimation DecayAnimation(@NotNull FloatDecayAnimationSpec floatDecayAnimationSpec0, float f, float f1) {
        DecayAnimationSpec decayAnimationSpec0 = DecayAnimationSpecKt.generateDecayAnimationSpec(floatDecayAnimationSpec0);
        AnimationVector1D animationVector1D0 = AnimationVectorsKt.AnimationVector(f1);
        return new DecayAnimation(decayAnimationSpec0, VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), f, animationVector1D0);
    }

    public static DecayAnimation DecayAnimation$default(FloatDecayAnimationSpec floatDecayAnimationSpec0, float f, float f1, int v, Object object0) {
        if((v & 4) != 0) {
            f1 = 0.0f;
        }
        return AnimationKt.DecayAnimation(floatDecayAnimationSpec0, f, f1);
    }

    @NotNull
    public static final TargetBasedAnimation TargetBasedAnimation(@NotNull AnimationSpec animationSpec0, @NotNull TwoWayConverter twoWayConverter0, Object object0, Object object1, Object object2) {
        return new TargetBasedAnimation(animationSpec0, twoWayConverter0, object0, object1, ((AnimationVector)twoWayConverter0.getConvertToVector().invoke(object2)));
    }

    @RestrictTo({Scope.LIBRARY})
    @NotNull
    public static final TargetBasedAnimation createAnimation(@NotNull VectorizedAnimationSpec vectorizedAnimationSpec0, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
        return new TargetBasedAnimation(vectorizedAnimationSpec0, VectorConvertersKt.TwoWayConverter(g.x, g.y), animationVector0, animationVector1, animationVector2);
    }

    public static final long getDurationMillis(@NotNull Animation animation0) {
        return animation0.getDurationNanos() / 1000000L;
    }

    public static final Object getVelocityFromNanos(@NotNull Animation animation0, long v) {
        return animation0.getTypeConverter().getConvertFromVector().invoke(animation0.getVelocityVectorFromNanos(v));
    }
}


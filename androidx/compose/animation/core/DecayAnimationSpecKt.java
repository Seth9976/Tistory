package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;
import t.h;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001A&\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0003\u0010\u0003\u001A\u00020\u00042\b\b\u0003\u0010\u0005\u001A\u00020\u0004\u001AI\u0010\u0006\u001A\u0002H\u0002\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0007*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\n2\u0006\u0010\u000B\u001A\u0002H\u00022\u0006\u0010\f\u001A\u0002H\u0002¢\u0006\u0002\u0010\r\u001A \u0010\u0006\u001A\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0004\u001A\u0016\u0010\u000E\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u000F¨\u0006\u0010"}, d2 = {"exponentialDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "T", "frictionMultiplier", "", "absVelocityThreshold", "calculateTargetValue", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "initialVelocity", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "generateDecayAnimationSpec", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class DecayAnimationSpecKt {
    public static final float calculateTargetValue(@NotNull DecayAnimationSpec decayAnimationSpec0, float f, float f1) {
        return ((AnimationVector1D)decayAnimationSpec0.vectorize(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE)).getTargetValue(AnimationVectorsKt.AnimationVector(f), AnimationVectorsKt.AnimationVector(f1))).getValue();
    }

    public static final Object calculateTargetValue(@NotNull DecayAnimationSpec decayAnimationSpec0, @NotNull TwoWayConverter twoWayConverter0, Object object0, Object object1) {
        AnimationVector animationVector0 = decayAnimationSpec0.vectorize(twoWayConverter0).getTargetValue(((AnimationVector)twoWayConverter0.getConvertToVector().invoke(object0)), ((AnimationVector)twoWayConverter0.getConvertToVector().invoke(object1)));
        return twoWayConverter0.getConvertFromVector().invoke(animationVector0);
    }

    @NotNull
    public static final DecayAnimationSpec exponentialDecay(@FloatRange(from = 0.0, fromInclusive = false) float f, @FloatRange(from = 0.0, fromInclusive = false) float f1) {
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new FloatExponentialDecaySpec(f, f1));
    }

    public static DecayAnimationSpec exponentialDecay$default(float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.1f;
        }
        return DecayAnimationSpecKt.exponentialDecay(f, f1);
    }

    @NotNull
    public static final DecayAnimationSpec generateDecayAnimationSpec(@NotNull FloatDecayAnimationSpec floatDecayAnimationSpec0) {
        return new h(floatDecayAnimationSpec0);
    }
}


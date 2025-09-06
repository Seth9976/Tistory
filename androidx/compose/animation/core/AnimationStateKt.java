package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001Ai\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0002\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00072\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\n\u001A\u0002H\u00052\u0006\u0010\u000B\u001A\u0002H\u00052\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\u0001\u00A2\u0006\u0002\u0010\u0010\u001AB\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\n\u001A\u00020\u00112\b\b\u0002\u0010\u000B\u001A\u00020\u00112\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\u0001\u001Ak\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0002\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0006*\u00020\u0007*\u000E\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u00022\b\b\u0002\u0010\u0014\u001A\u0002H\u00052\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u0001H\u00062\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\u0001\u00A2\u0006\u0002\u0010\u0016\u001AT\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0002*\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00022\b\b\u0002\u0010\u0014\u001A\u00020\u00112\b\b\u0002\u0010\u0017\u001A\u00020\u00112\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\u0001\u001A3\u0010\u0018\u001A\u0002H\u0006\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0006*\u00020\u0007*\u000E\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\u0014\u001A\u0002H\u0005\u00A2\u0006\u0002\u0010\u0019\"\u001D\u0010\u0000\u001A\u00020\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028F\u00A2\u0006\u0006\u001A\u0004\b\u0000\u0010\u0003\u00A8\u0006\u001A"}, d2 = {"isFinished", "", "Landroidx/compose/animation/core/AnimationState;", "(Landroidx/compose/animation/core/AnimationState;)Z", "AnimationState", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "initialVelocity", "lastFrameTimeNanos", "", "finishedTimeNanos", "isRunning", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;JJZ)Landroidx/compose/animation/core/AnimationState;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "copy", "value", "velocityVector", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;JJZ)Landroidx/compose/animation/core/AnimationState;", "velocity", "createZeroVectorFrom", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
public final class AnimationStateKt {
    @NotNull
    public static final AnimationState AnimationState(float f, float f1, long v, long v1, boolean z) {
        AnimationVector1D animationVector1D0 = AnimationVectorsKt.AnimationVector(f1);
        return new AnimationState(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), f, animationVector1D0, v, v1, z);
    }

    @NotNull
    public static final AnimationState AnimationState(@NotNull TwoWayConverter twoWayConverter0, Object object0, Object object1, long v, long v1, boolean z) {
        return new AnimationState(twoWayConverter0, object0, ((AnimationVector)twoWayConverter0.getConvertToVector().invoke(object1)), v, v1, z);
    }

    public static AnimationState AnimationState$default(float f, float f1, long v, long v1, boolean z, int v2, Object object0) {
        if((v2 & 2) != 0) {
            f1 = 0.0f;
        }
        if((v2 & 16) != 0) {
            z = false;
        }
        return AnimationStateKt.AnimationState(f, f1, ((v2 & 4) == 0 ? v : 0x8000000000000000L), ((v2 & 8) == 0 ? v1 : 0x8000000000000000L), z);
    }

    public static AnimationState AnimationState$default(TwoWayConverter twoWayConverter0, Object object0, Object object1, long v, long v1, boolean z, int v2, Object object2) {
        long v3 = (v2 & 8) == 0 ? v : 0x8000000000000000L;
        long v4 = (v2 & 16) == 0 ? v1 : 0x8000000000000000L;
        return (v2 & 0x20) == 0 ? AnimationStateKt.AnimationState(twoWayConverter0, object0, object1, v3, v4, z) : AnimationStateKt.AnimationState(twoWayConverter0, object0, object1, v3, v4, false);
    }

    @NotNull
    public static final AnimationState copy(@NotNull AnimationState animationState0, float f, float f1, long v, long v1, boolean z) {
        return new AnimationState(animationState0.getTypeConverter(), f, AnimationVectorsKt.AnimationVector(f1), v, v1, z);
    }

    @NotNull
    public static final AnimationState copy(@NotNull AnimationState animationState0, Object object0, @Nullable AnimationVector animationVector0, long v, long v1, boolean z) {
        return new AnimationState(animationState0.getTypeConverter(), object0, animationVector0, v, v1, z);
    }

    public static AnimationState copy$default(AnimationState animationState0, float f, float f1, long v, long v1, boolean z, int v2, Object object0) {
        if((v2 & 1) != 0) {
            f = ((Number)animationState0.getValue()).floatValue();
        }
        if((v2 & 2) != 0) {
            f1 = ((AnimationVector1D)animationState0.getVelocityVector()).getValue();
        }
        if((v2 & 4) != 0) {
            v = animationState0.getLastFrameTimeNanos();
        }
        if((v2 & 8) != 0) {
            v1 = animationState0.getFinishedTimeNanos();
        }
        if((v2 & 16) != 0) {
            z = animationState0.isRunning();
        }
        return AnimationStateKt.copy(animationState0, f, f1, v, v1, z);
    }

    public static AnimationState copy$default(AnimationState animationState0, Object object0, AnimationVector animationVector0, long v, long v1, boolean z, int v2, Object object1) {
        if((v2 & 1) != 0) {
            object0 = animationState0.getValue();
        }
        if((v2 & 2) != 0) {
            animationVector0 = AnimationVectorsKt.copy(animationState0.getVelocityVector());
        }
        if((v2 & 4) != 0) {
            v = animationState0.getLastFrameTimeNanos();
        }
        if((v2 & 8) != 0) {
            v1 = animationState0.getFinishedTimeNanos();
        }
        if((v2 & 16) != 0) {
            z = animationState0.isRunning();
        }
        return AnimationStateKt.copy(animationState0, object0, animationVector0, v, v1, z);
    }

    @NotNull
    public static final AnimationVector createZeroVectorFrom(@NotNull TwoWayConverter twoWayConverter0, Object object0) {
        AnimationVector animationVector0 = (AnimationVector)twoWayConverter0.getConvertToVector().invoke(object0);
        animationVector0.reset$animation_core_release();
        return animationVector0;
    }

    public static final boolean isFinished(@NotNull AnimationState animationState0) {
        return animationState0.getFinishedTimeNanos() != 0x8000000000000000L;
    }
}


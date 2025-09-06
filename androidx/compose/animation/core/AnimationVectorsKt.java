package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A\u000E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003\u001A\u0016\u0010\u0000\u001A\u00020\u00042\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003\u001A\u001E\u0010\u0000\u001A\u00020\u00062\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0003\u001A&\u0010\u0000\u001A\u00020\b2\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u0003\u001A\u001B\u0010\n\u001A\u0002H\u000B\"\b\b\u0000\u0010\u000B*\u00020\f*\u0002H\u000BH\u0000¢\u0006\u0002\u0010\r\u001A#\u0010\u000E\u001A\u00020\u000F\"\b\b\u0000\u0010\u000B*\u00020\f*\u0002H\u000B2\u0006\u0010\u0010\u001A\u0002H\u000BH\u0000¢\u0006\u0002\u0010\u0011\u001A\u001B\u0010\u0012\u001A\u0002H\u000B\"\b\b\u0000\u0010\u000B*\u00020\f*\u0002H\u000BH\u0000¢\u0006\u0002\u0010\r¨\u0006\u0013"}, d2 = {"AnimationVector", "Landroidx/compose/animation/core/AnimationVector1D;", "v1", "", "Landroidx/compose/animation/core/AnimationVector2D;", "v2", "Landroidx/compose/animation/core/AnimationVector3D;", "v3", "Landroidx/compose/animation/core/AnimationVector4D;", "v4", "copy", "T", "Landroidx/compose/animation/core/AnimationVector;", "(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "copyFrom", "", "source", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "newInstance", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AnimationVectorsKt {
    @NotNull
    public static final AnimationVector1D AnimationVector(float f) {
        return new AnimationVector1D(f);
    }

    @NotNull
    public static final AnimationVector2D AnimationVector(float f, float f1) {
        return new AnimationVector2D(f, f1);
    }

    @NotNull
    public static final AnimationVector3D AnimationVector(float f, float f1, float f2) {
        return new AnimationVector3D(f, f1, f2);
    }

    @NotNull
    public static final AnimationVector4D AnimationVector(float f, float f1, float f2, float f3) {
        return new AnimationVector4D(f, f1, f2, f3);
    }

    @NotNull
    public static final AnimationVector copy(@NotNull AnimationVector animationVector0) {
        AnimationVector animationVector1 = AnimationVectorsKt.newInstance(animationVector0);
        int v = animationVector1.getSize$animation_core_release();
        for(int v1 = 0; v1 < v; ++v1) {
            animationVector1.set$animation_core_release(v1, animationVector0.get$animation_core_release(v1));
        }
        return animationVector1;
    }

    public static final void copyFrom(@NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1) {
        int v = animationVector0.getSize$animation_core_release();
        for(int v1 = 0; v1 < v; ++v1) {
            animationVector0.set$animation_core_release(v1, animationVector1.get$animation_core_release(v1));
        }
    }

    @NotNull
    public static final AnimationVector newInstance(@NotNull AnimationVector animationVector0) {
        AnimationVector animationVector1 = animationVector0.newVector$animation_core_release();
        Intrinsics.checkNotNull(animationVector1, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return animationVector1;
    }
}


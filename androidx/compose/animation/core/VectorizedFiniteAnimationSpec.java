package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003R\u0014\u0010\u0004\u001A\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "isInfinite", "", "()Z", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface VectorizedFiniteAnimationSpec extends VectorizedAnimationSpec {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static AnimationVector getEndVelocity(@NotNull VectorizedFiniteAnimationSpec vectorizedFiniteAnimationSpec0, @NotNull AnimationVector animationVector0, @NotNull AnimationVector animationVector1, @NotNull AnimationVector animationVector2) {
            return vectorizedFiniteAnimationSpec0.super.getEndVelocity(animationVector0, animationVector1, animationVector2);
        }

        @Deprecated
        public static boolean isInfinite(@NotNull VectorizedFiniteAnimationSpec vectorizedFiniteAnimationSpec0) {
            return vectorizedFiniteAnimationSpec0.super.isInfinite();
        }
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    default boolean isInfinite() {
        return false;
    }
}


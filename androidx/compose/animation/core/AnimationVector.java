package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001J\u000F\u0010\u0005\u001A\u00020\u0002H ¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\b\u001A\u00020\u0000H ¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH \u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\u000BH \u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001A\u00020\t8 X \u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001A"}, d2 = {"Landroidx/compose/animation/core/AnimationVector;", "", "", "reset$animation_core_release", "()V", "reset", "newVector$animation_core_release", "()Landroidx/compose/animation/core/AnimationVector;", "newVector", "", "index", "", "get$animation_core_release", "(I)F", "get", "value", "set$animation_core_release", "(IF)V", "set", "getSize$animation_core_release", "()I", "size", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/AnimationVector3D;", "Landroidx/compose/animation/core/AnimationVector4D;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class AnimationVector {
    public static final int $stable;

    public AnimationVector(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public abstract float get$animation_core_release(int arg1);

    public abstract int getSize$animation_core_release();

    @NotNull
    public abstract AnimationVector newVector$animation_core_release();

    public abstract void reset$animation_core_release();

    public abstract void set$animation_core_release(int arg1, float arg2);
}


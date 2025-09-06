package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00010\u000B\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/core/SnapSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "", "delay", "<init>", "(I)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getDelay", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SnapSpec implements DurationBasedAnimationSpec {
    public static final int $stable;
    public final int a;

    public SnapSpec() {
        this(0, 1, null);
    }

    public SnapSpec(int v) {
        this.a = v;
    }

    public SnapSpec(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof SnapSpec && ((SnapSpec)object0).a == this.a;
    }

    public final int getDelay() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    @Override  // androidx.compose.animation.core.AnimationSpec
    public VectorizedAnimationSpec vectorize(TwoWayConverter twoWayConverter0) {
        return this.vectorize(twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.DurationBasedAnimationSpec
    @NotNull
    public VectorizedDurationBasedAnimationSpec vectorize(@NotNull TwoWayConverter twoWayConverter0) {
        return new VectorizedSnapSpec(this.a);
    }

    @Override  // androidx.compose.animation.core.FiniteAnimationSpec
    public VectorizedFiniteAnimationSpec vectorize(TwoWayConverter twoWayConverter0) {
        return this.vectorize(twoWayConverter0);
    }
}


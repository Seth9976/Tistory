package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0014\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\b\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nB1\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\t\u0010\rJ3\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00010\u0012\"\b\b\u0001\u0010\u000F*\u00020\u000E2\u0012\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001A\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001BR\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\u001D\u0010\f\u001A\u00020\u000B8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/animation/core/RepeatableSpec;", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "iterations", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "<init>", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getIterations", "b", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "getAnimation", "()Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "c", "Landroidx/compose/animation/core/RepeatMode;", "getRepeatMode", "()Landroidx/compose/animation/core/RepeatMode;", "d", "J", "getInitialStartOffset-Rmkjzm4", "()J", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RepeatableSpec implements FiniteAnimationSpec {
    public static final int $stable;
    public final int a;
    public final DurationBasedAnimationSpec b;
    public final RepeatMode c;
    public final long d;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This constructor has been deprecated")
    public RepeatableSpec(int v, DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0) {
        this(v, durationBasedAnimationSpec0, repeatMode0, 0L, null);
    }

    public RepeatableSpec(int v, DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            repeatMode0 = RepeatMode.Restart;
        }
        this(v, durationBasedAnimationSpec0, repeatMode0);
    }

    public RepeatableSpec(int v, DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, long v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 4) != 0) {
            repeatMode0 = RepeatMode.Restart;
        }
        if((v2 & 8) != 0) {
            v1 = 0L;
        }
        this(v, durationBasedAnimationSpec0, repeatMode0, v1, null);
    }

    public RepeatableSpec(int v, DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = durationBasedAnimationSpec0;
        this.c = repeatMode0;
        this.d = v1;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof RepeatableSpec && ((RepeatableSpec)object0).a == this.a && Intrinsics.areEqual(((RepeatableSpec)object0).b, this.b) && ((RepeatableSpec)object0).c == this.c && StartOffset.equals-impl0(((RepeatableSpec)object0).d, this.d);
    }

    @NotNull
    public final DurationBasedAnimationSpec getAnimation() {
        return this.b;
    }

    public final long getInitialStartOffset-Rmkjzm4() {
        return this.d;
    }

    public final int getIterations() {
        return this.a;
    }

    @NotNull
    public final RepeatMode getRepeatMode() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return StartOffset.hashCode-impl(this.d) + (this.c.hashCode() + (this.b.hashCode() + this.a * 0x1F) * 0x1F) * 0x1F;
    }

    @Override  // androidx.compose.animation.core.AnimationSpec
    public VectorizedAnimationSpec vectorize(TwoWayConverter twoWayConverter0) {
        return this.vectorize(twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.FiniteAnimationSpec
    @NotNull
    public VectorizedFiniteAnimationSpec vectorize(@NotNull TwoWayConverter twoWayConverter0) {
        VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0 = this.b.vectorize(twoWayConverter0);
        return new VectorizedRepeatableSpec(this.a, vectorizedDurationBasedAnimationSpec0, this.c, this.d, null);
    }
}

